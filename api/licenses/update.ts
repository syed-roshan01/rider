/**
 * POST /api/licenses/update
 *   { key, clientName?, clientPhone?, clientEmail?, businessCategory?, website?,
 *     price?, notes?, features?, validationException?, affiliateId?, affiliateName? }
 *   200 -> { success: true, license }
 *   400 -> { error: 'key is required' }
 *   403 -> { error: 'Forbidden' }    (admin/whitelabel may only edit own rows)
 *   404 -> { error: 'License not found' }
 *
 * Partial update: fields the request omits keep their values (price and notes
 * included -- a partial update must not silently zero/wipe them).
 * validationException + affiliate attribution are SUPER-only. Touching
 * validationException resets exceptionBoundMachineId. Super changing the
 * affiliate recomputes affiliateCommissionAmount (spec §4: revenue =
 * (discountedPrice > 0 ? discountedPrice : price) || 0).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../_lib/server.js';
import { requireAuth } from '../_lib/panel.js';
import { commissionFor } from '../_lib/panelMath.js';
import { getPanelLicense, saveLicenseMeta, type PanelLicense } from '../_lib/panelLicense.js';
import { getAffiliate } from '../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const gate = requireAuth(req);
        if (gate.error) {
            json(res, gate.status, { error: gate.error });
            return;
        }
        const session = gate.session;

        const b = bodyOf(req);
        const { key, clientName, clientPhone, clientEmail, businessCategory, website, price, notes, features, validationException, affiliateId, affiliateName } = b;
        if (!key) {
            json(res, 400, { error: 'key is required' });
            return;
        }

        const license = await getPanelLicense(String(key).trim().toUpperCase());
        if (!license) {
            json(res, 404, { error: 'License not found' });
            return;
        }

        // Admins and whitelabel resellers can only edit licenses they issued --
        // same rule the revoke and convert endpoints already enforce.
        if (session.role !== 'super' && license.issuedBy !== session.sub) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        const canSetValidationException = session.role === 'super' && validationException !== undefined;
        const nextValidationException = canSetValidationException ? !!validationException : license.validationException;

        const updated: PanelLicense = {
            ...license,
            ...(clientName !== undefined ? { clientName: String(clientName).trim() } : {}),
            ...(clientPhone !== undefined ? { clientPhone: String(clientPhone).trim() } : {}),
            ...(clientEmail !== undefined ? { clientEmail: String(clientEmail).trim() } : {}),
            ...(businessCategory !== undefined ? { businessCategory: String(businessCategory).trim() } : {}),
            ...(website !== undefined ? { website: String(website).trim() || 'No website' } : {}),
            // Price and notes are also opt-in: a partial update that omits them
            // must not silently zero the price or wipe the notes.
            ...(price !== undefined ? { price: Math.max(0, parseFloat(String(price)) || 0) } : {}),
            ...(notes !== undefined ? { notes: String(notes).trim() } : {}),
            ...(features !== undefined ? { features: features as Record<string, unknown> } : {}),
            ...(session.role === 'super' && affiliateId !== undefined
                ? { affiliateId: affiliateId ? String(affiliateId) : null, affiliateName: affiliateName ? String(affiliateName) : null }
                : {}),
            ...(canSetValidationException
                ? { validationException: !!nextValidationException }
                : {}),
            // When a super admin touches exception mode, reset bound machine so it can re-bind cleanly.
            ...(canSetValidationException
                ? { exceptionBoundMachineId: null }
                : {}),
        };

        // Recompute affiliateCommissionAmount when affiliate is changed by super
        if (session.role === 'super' && affiliateId !== undefined) {
            if (affiliateId) {
                const aff = await getAffiliate(String(affiliateId));
                if (aff) {
                    const revenue = ((updated.discountedPrice ?? 0) > 0 ? updated.discountedPrice : updated.price) || 0;
                    updated.affiliateCommissionAmount = commissionFor(revenue, aff.commission);
                } else {
                    updated.affiliateCommissionAmount = null;
                }
            } else {
                // affiliate removed
                updated.affiliateCommissionAmount = null;
            }
        }

        await saveLicenseMeta(updated);
        json(res, 200, { success: true, license: updated });
    } catch (e) {
        // never leak key material or internals
        console.error('licenses update error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
