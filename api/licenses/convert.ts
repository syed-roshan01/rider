/**
 * POST /api/licenses/convert
 *   { oldKey, plan, deviceLimit?, customDays?, price?, discountedPrice?, notes?,
 *     features?, machineId? }
 *   200 -> { success: true, key, license }
 *   400 -> { error: 'oldKey required' | 'plan required' |
 *              'Only trial or free licenses can be converted' }
 *   403 -> { error: 'Forbidden' | whitelabel allow-list/quota errors (see below) }
 *   404 -> { error: 'Original license not found' }
 *
 * Trial/free -> paid conversion. The old key is auto-revoked with reason
 * `Converted to <plan> plan (key: <newKey>)` (quota-neutral: such keys stop
 * counting against a whitelabel quota) and the new key inherits ALL client
 * data plus the ORIGINAL licence's type. The new key is a real RA- licence
 * minted through the engine (ADMIN-PORT §2); the old key dies on BOTH sides
 * (INTEGRATION SEAM: meta.revoked* AND engine status).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../_lib/server.js';
import { keyPrefixOf } from '../../supabase/functions/_shared/license.js';
import { requireAuth } from '../_lib/panel.js';
import { commissionFor, priceClamp } from '../_lib/panelMath.js';
import {
    boundHashOf,
    countIssuedLicenses,
    DEFAULT_FEATURES,
    deviceIdDisplay,
    engineMaxDevices,
    mintRaKey,
    patchEngineLicense,
    planDurationDays,
    planEngineType,
    planExpiryTs,
    resolveWlMaxDevices,
    resolveWlPlans,
    saveLicenseMeta,
    surfaceDeviceLimit,
    type PanelLicense,
} from '../_lib/panelLicense.js';
import { getAffiliate, getWhitelabel, saveLog, type PanelLog, type WhitelabelRecord } from '../_lib/panelStore.js';

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
        const oldKey = b.oldKey;
        const plan = b.plan;
        const deviceLimit = b.deviceLimit;
        const customDays = b.customDays;
        const price = b.price;
        const discountedPrice = b.discountedPrice;
        const notes = b.notes;
        const features = b.features;
        const machineIdOverride = b.machineId;

        if (!oldKey) { json(res, 400, { error: 'oldKey required' }); return; }
        if (!plan) { json(res, 400, { error: 'plan required' }); return; }

        const oldLicense = await getPanelLicense(String(oldKey));
        if (!oldLicense) {
            json(res, 404, { error: 'Original license not found' });
            return;
        }

        // Admins can only convert their own licenses
        if (session.role !== 'super' && oldLicense.issuedBy !== session.sub) {
            json(res, 403, { error: 'Forbidden' });
            return;
        }

        // Whitelabel resellers: the converted license keeps its original type, so
        // that type must still be allowed, and the target plan + device limit must
        // be within what the super admin granted. Quota-wise a conversion is
        // net-neutral when the old key was counting (it stops counting once
        // revoked as "Converted to …"), otherwise it consumes one extra slot.
        let whitelabel: WhitelabelRecord | null = null;
        if (session.role === 'whitelabel') {
            whitelabel = await getWhitelabel(session.sub);
            if (!whitelabel || !whitelabel.active) {
                json(res, 403, { error: 'Whitelabel account is inactive' });
                return;
            }
            if (whitelabel.partnershipEndTs && whitelabel.partnershipEndTs <= Math.floor(Date.now() / 1000)) {
                json(res, 403, { error: 'Your whitelabel partnership has expired. Contact the administrator to renew.' });
                return;
            }
            const convertedMode = oldLicense.licenseMode || 'desktop';
            const allowed = Array.isArray(whitelabel.allowedModes) ? whitelabel.allowedModes : [];
            if (!allowed.includes(convertedMode)) {
                json(res, 403, { error: `License type "${convertedMode}" is no longer allowed for this account` });
                return;
            }
            const allowedPlans = resolveWlPlans(whitelabel);
            if (!allowedPlans.includes(String(plan))) {
                json(res, 403, { error: `Key duration "${plan}" is not allowed for this account` });
                return;
            }
            const oldWasCounted = !(oldLicense.revoked && typeof oldLicense.revokedReason === 'string' && oldLicense.revokedReason.startsWith('Converted to'));
            if (!oldWasCounted) {
                const used = await countIssuedLicenses(session.sub);
                if (used >= (whitelabel.licenseLimit || 0)) {
                    json(res, 403, { error: `License limit reached (${used}/${whitelabel.licenseLimit || 0}). Contact the administrator to raise your limit.` });
                    return;
                }
            }
        }

        // Must not already be a converted (non-trial paid) license
        const isTrial = oldLicense.plan === 'trial' || oldLicense.plan === 'trial1day';
        const wasFreePlan = !isTrial && (parseFloat(String(oldLicense.price)) || 0) === 0;
        if (!isTrial && !wasFreePlan && !oldLicense.revoked) {
            json(res, 400, { error: 'Only trial or free licenses can be converted' });
            return;
        }

        const dl = surfaceDeviceLimit(deviceLimit);
        if (whitelabel) {
            const maxDevices = resolveWlMaxDevices(whitelabel);
            if (dl > maxDevices) {
                json(res, 403, { error: `Device limit ${dl} exceeds your maximum of ${maxDevices} per key` });
                return;
            }
        }
        const isLifetime = plan === 'lifetime';
        const nowTs = Math.floor(Date.now() / 1000);
        let expiryTs = planExpiryTs(nowTs, String(plan), customDays);
        // Carry the original license's type through -- dropping it would turn a
        // converted cloud/app trial into a desktop-style key.
        const licenseMode = oldLicense.licenseMode || 'desktop';
        const resolvedMachineId = licenseMode === 'cloud'
            ? null
            : machineIdOverride && String(machineIdOverride).trim()
                ? deviceIdDisplay(String(machineIdOverride))
                : oldLicense.machineId;

        // ADMIN-PORT §2/§2.1: desktop/app keys pre-bound to the device code.
        const bound = resolvedMachineId ? boundHashOf(resolvedMachineId) : [];
        // Same-second collision guard (zyqora nudge loop) lives inside mintRaKey.
        const mint = await mintRaKey({
            planType: planEngineType(String(plan)),
            durationDays: planDurationDays(String(plan), customDays),
            maxDevices: engineMaxDevices(licenseMode, dl, bound.length),
            bound,
            note: String(notes ?? '').trim(),
            createdBy: session.sub,
            isLifetime,
            expiryTs,
        });
        const newKey = mint.key;
        expiryTs = mint.expiryTs;

        const { priceNum, discountedNum, discountAmount } = priceClamp(price, discountedPrice);

        // 1. Revoke old trial license (BOTH sides -- the key must die for the app)
        const revokedOld: PanelLicense = {
            ...oldLicense,
            revoked: true,
            revokedBy: session.sub,
            revokedByName: session.username,
            revokedAt: nowTs,
            revokedReason: `Converted to ${plan} plan (key: ${keyPrefixOf(newKey)})`,
        };
        await saveLicenseMeta(revokedOld);
        await patchEngineLicense(oldLicense.engine.keyHash, { status: 'revoked' });

        const revokeLog: PanelLog = {
            id: randomUUID(),
            action: 'LICENSE_REVOKED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: nowTs,
            flag: null,
            meta: {
                key: keyPrefixOf(oldLicense.key),
                clientName: oldLicense.clientName || '',
                clientPhone: oldLicense.clientPhone || '',
                plan: oldLicense.plan || '',
                price: 0,
                issuedByName: oldLicense.issuedByName || '',
                reason: `Converted to ${plan} plan`,
            },
        };
        await saveLog(revokeLog);

        // 2. Create new paid license, inheriting all client data from old
        const newLicense: PanelLicense = {
            key: newKey,
            plan: String(plan),
            deviceLimit: dl,
            expiryTs,
            isLifetime,
            price: priceNum,
            discountedPrice: discountedNum,
            discountAmount,
            licenseMode,
            machineId: resolvedMachineId,
            clientName: oldLicense.clientName,
            clientPhone: oldLicense.clientPhone,
            clientEmail: oldLicense.clientEmail,
            businessCategory: oldLicense.businessCategory,
            website: oldLicense.website,
            notes: String(notes || oldLicense.notes || '').trim(),
            features: (features || oldLicense.features || DEFAULT_FEATURES) as Record<string, unknown>,
            affiliateId: oldLicense.affiliateId || null,
            affiliateName: oldLicense.affiliateName || null,
            issuedBy: session.sub,
            issuedByName: whitelabel ? (whitelabel.name || session.username) : session.username,
            issuedAt: nowTs,
            activated: false,
            activatedAt: null,
            revoked: false,
            revokedBy: null,
            revokedByName: null,
            revokedAt: null,
            revokedReason: null,
            convertedFromKey: keyPrefixOf(oldLicense.key),
            whitelabelIssued: whitelabel ? true : undefined,
            whitelabelName: whitelabel ? (whitelabel.name || whitelabel.username) : null,
            affiliateCommissionAmount: null, // filled below
            engine: {
                keyHash: mint.engine.keyHash,
                status: mint.engine.status,
                planType: mint.engine.planType,
                durationDays: mint.engine.durationDays,
                maxDevices: mint.engine.maxDevices,
                activatedAt: null,
                expiresAt: null,
                boundDeviceCodeHashes: mint.engine.boundDeviceCodeHashes ?? [],
            },
        };

        if (newLicense.affiliateId) {
            const aff = await getAffiliate(String(newLicense.affiliateId));
            if (aff) {
                const revenue = discountedNum > 0 ? discountedNum : priceNum;
                newLicense.affiliateCommissionAmount = commissionFor(revenue, aff.commission);
            }
        }

        await saveLicenseMeta(newLicense);

        const convertLog: PanelLog = {
            id: randomUUID(),
            action: 'LICENSE_CONVERTED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: nowTs,
            flag: null,
            meta: {
                key: keyPrefixOf(newKey),
                oldKey: keyPrefixOf(oldLicense.key),
                clientName: newLicense.clientName || '',
                clientPhone: newLicense.clientPhone || '',
                plan,
                price: priceNum,
                discountedPrice: discountedNum,
                issuedByName: session.username,
            },
        };
        await saveLog(convertLog);

        json(res, 200, { success: true, key: newKey, license: newLicense });
    } catch (e) {
        // never leak key material or internals
        console.error('licenses convert error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
