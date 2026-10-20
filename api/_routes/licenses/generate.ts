/**
 * POST /api/licenses/generate
 *   200 -> { success: true, key, license }
 *   400 -> { error: 'clientName, license mode and plan are required' }
 *   403 -> { error: 'Whitelabel account is inactive' |
 *              'Your whitelabel partnership has expired. Contact the administrator to renew.' |
 *              'License type "<mode>" is not allowed for this account' |
 *              'Key duration "<plan>" is not allowed for this account' |
 *              'Affiliate attribution is not available for whitelabel accounts' |
 *              'License limit reached (<used>/<limit>). Contact the administrator to raise your limit.' |
 *              'Device limit <dl> exceeds your maximum of <max> per key' }
 *
 * ANY authenticated role (whitelabel restrictions enforced against the live
 * record). The key is a REAL AcceptPro RA- licence minted through the engine
 * (`create_license` rpc, ADMIN-PORT §2) -- the ZYQ-HMAC format does not exist.
 * "Machine ID"/"Android ID" = the app's Device ID (ADMIN-PORT §2.1): weak
 * zyqora input rule kept (required unless cloud, trimmed), binding is
 * hashDeviceCode(input), license_meta.machineId stores the re-hyphenated
 * display form. Money math = spec §4 clamp (panelMath.priceClamp). Logs
 * LICENSE_GENERATED with the generate meta shape.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../../_lib/server.js';
import { keyPrefixOf } from '../../../supabase/functions/_shared/license.js';
import { requireAuth } from '../../_lib/panel.js';
import { commissionFor, priceClamp } from '../../_lib/panelMath.js';
import {
    boundHashOf,
    countIssuedLicenses,
    DEFAULT_FEATURES,
    deviceIdDisplay,
    engineMaxDevices,
    LICENSE_MODES,
    mintRaKey,
    planDurationDays,
    planEngineType,
    planExpiryTs,
    resolveWlMaxDevices,
    resolveWlPlans,
    saveLicenseMeta,
    surfaceDeviceLimit,
    type PanelLicense,
} from '../../_lib/panelLicense.js';
import { getAffiliate, getWhitelabel, saveLog, type PanelLog, type WhitelabelRecord } from '../../_lib/panelStore.js';

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
        const clientName = b.clientName;
        const clientPhone = b.clientPhone;
        const clientEmail = b.clientEmail;
        const machineId = b.machineId;
        const licenseMode = b.licenseMode === undefined ? 'desktop' : String(b.licenseMode);
        const plan = b.plan;
        const deviceLimit = b.deviceLimit;
        const customDays = b.customDays;
        const notes = b.notes;
        const price = b.price;
        const discountedPrice = b.discountedPrice;
        const features = b.features;
        const businessCategory = b.businessCategory;
        const website = b.website;
        const affiliateId = b.affiliateId;
        const affiliateName = b.affiliateName;
        const reviewAccess = b.reviewAccess;

        // Cloud licenses use no device binding at all -- every other mode
        // (desktop, app) is bound to one specific device's ID and requires it
        // up front.
        if (
            !LICENSE_MODES.includes(licenseMode) ||
            (licenseMode !== 'cloud' && !String(machineId ?? '').trim()) ||
            !plan ||
            !String(clientName ?? '').trim()
        ) {
            json(res, 400, { error: 'clientName, license mode and plan are required' });
            return;
        }

        // Whitelabel resellers: enforce the live allow-list of license types,
        // the allowed key durations, the per-key device cap and the issue quota
        // against their current record, so super-admin changes apply immediately.
        // No affiliate attribution or reviewer keys either.
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
            const allowed = Array.isArray(whitelabel.allowedModes) ? whitelabel.allowedModes : [];
            if (!allowed.includes(licenseMode)) {
                json(res, 403, { error: `License type "${licenseMode}" is not allowed for this account` });
                return;
            }
            const allowedPlans = resolveWlPlans(whitelabel);
            if (!allowedPlans.includes(String(plan))) {
                json(res, 403, { error: `Key duration "${plan}" is not allowed for this account` });
                return;
            }
            if (affiliateId) {
                json(res, 403, { error: 'Affiliate attribution is not available for whitelabel accounts' });
                return;
            }
            const used = await countIssuedLicenses(session.sub);
            if (used >= (whitelabel.licenseLimit || 0)) {
                json(res, 403, { error: `License limit reached (${used}/${whitelabel.licenseLimit || 0}). Contact the administrator to raise your limit.` });
                return;
            }
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
        const issuedAt = Math.floor(Date.now() / 1000);
        let expiryTs = planExpiryTs(issuedAt, String(plan), customDays);

        // ADMIN-PORT §2/§2.1: desktop/app keys are pre-bound to the submitted
        // device code (hashDeviceCode); cloud keys are unbound.
        const bound = licenseMode === 'cloud' ? [] : boundHashOf(String(machineId ?? ''));
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
        expiryTs = mint.expiryTs;

        const { priceNum, discountedNum, discountAmount } = priceClamp(price, discountedPrice);

        const license: PanelLicense = {
            key: mint.key,
            plan: String(plan),
            deviceLimit: dl,
            expiryTs,
            isLifetime,
            price: priceNum,
            discountedPrice: discountedNum,
            discountAmount,
            licenseMode,
            machineId: licenseMode === 'cloud' ? null : deviceIdDisplay(String(machineId ?? '')),
            clientName: String(clientName ?? '').trim(),
            clientPhone: String(clientPhone || '').trim(),
            clientEmail: String(clientEmail || '').trim(),
            businessCategory: String(businessCategory || '').trim(),
            website: String(website || '').trim() || 'No website',
            notes: String(notes || '').trim(),
            features: (features || DEFAULT_FEATURES) as Record<string, unknown>,
            affiliateId: affiliateId ? String(affiliateId) : null,
            affiliateName: affiliateName ? String(affiliateName) : null,
            affiliateCommissionAmount: null, // filled below
            // Store-review / test access only -- see validate.ts. Only ever set
            // true when explicitly checked in the generate form; absent/false
            // for every normal customer license. Restricted to super admins
            // server-side too -- the UI already hides the checkbox from regular
            // admins, but that alone wouldn't stop someone calling this API directly.
            reviewAccess: reviewAccess === true && session.role === 'super',
            // Whitelabel marker -- lets sales/stats exclude reseller-issued
            // licenses from direct revenue while the licenses page still shows them.
            whitelabelIssued: whitelabel ? true : undefined,
            whitelabelName: whitelabel ? (whitelabel.name || whitelabel.username) : null,
            issuedBy: session.sub,
            issuedByName: whitelabel ? (whitelabel.name || session.username) : session.username,
            issuedAt,
            activated: false,
            activatedAt: null,
            revoked: false,
            revokedBy: null,
            revokedByName: null,
            revokedAt: null,
            revokedReason: null,
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

        if (affiliateId) {
            const aff = await getAffiliate(String(affiliateId));
            if (aff) {
                const revenue = discountedNum > 0 ? discountedNum : priceNum;
                license.affiliateCommissionAmount = commissionFor(revenue, aff.commission);
            }
        }

        await saveLicenseMeta(license);

        const log: PanelLog = {
            id: randomUUID(),
            action: 'LICENSE_GENERATED',
            actorId: session.sub,
            actorName: session.username,
            actorRole: session.role,
            ts: license.issuedAt,
            flag: null,
            meta: {
                key: keyPrefixOf(mint.key),
                clientName: license.clientName,
                clientPhone: license.clientPhone || '',
                plan: license.plan,
                price: license.price,
                discountedPrice: license.discountedPrice,
                deviceLimit: license.deviceLimit,
                issuedByName: license.issuedByName,
                affiliateId: license.affiliateId || null,
                affiliateName: license.affiliateName || null,
            },
        };
        await saveLog(log);

        json(res, 200, { success: true, key: mint.key, license });
    } catch (e) {
        // never leak key material or internals
        console.error('licenses generate error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
