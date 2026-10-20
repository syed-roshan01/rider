/**
 * POST /api/whitelabel/{id}/update
 *   200 -> { success: true, whitelabel }
 *   400 -> { error: 'allowedModes must be an array' | 'Select at least one license type' |
 *              'allowedPlans must be an array' | 'Select at least one key duration' |
 *              'License limit must be between 1 and 999999' |
 *              'Max devices must be between 1 and 255' |
 *              'Partnership duration must be between 1 and 120 months' }
 *   404 -> { error: 'Whitelabel client not found' }
 *   500 -> { error: 'This client record is corrupted. Delete and re-create the client to fix it.' }
 *
 * SUPER only. Profile, allowed license types, allowed key durations, device
 * cap and/or license limit. Setting partnershipMonths (re)starts the clock
 * from save time; sending null clears it back to no expiry. Changes take
 * effect for the client in real time (their panel enforces the live record).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../_lib/server.js';
import { requireSuper } from '../../_lib/panel.js';
import { LICENSE_MODES, WL_PLANS } from '../../_lib/panelLicense.js';
import { getWhitelabel, saveWhitelabel } from '../../_lib/panelStore.js';

const MAX_LIMIT = 999999;
const MAX_DEVICES = 255;

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const gate = requireSuper(req);
        if (gate.error) {
            json(res, gate.status, { error: gate.error });
            return;
        }
        const session = gate.session;

        const id = String(req.query.id ?? '');
        const whitelabel = await getWhitelabel(id);
        if (!whitelabel) {
            json(res, 404, { error: 'Whitelabel client not found' });
            return;
        }
        // Refuse to operate on a corrupted record -- writing it back would
        // propagate the corruption instead of fixing it.
        if (whitelabel.id !== id || !whitelabel.username) {
            json(res, 500, { error: 'This client record is corrupted. Delete and re-create the client to fix it.' });
            return;
        }

        const body = bodyOf(req);

        let allowedModes = whitelabel.allowedModes;
        if (body.allowedModes !== undefined) {
            if (!Array.isArray(body.allowedModes)) {
                json(res, 400, { error: 'allowedModes must be an array' });
                return;
            }
            allowedModes = [...new Set((body.allowedModes as unknown[]).filter((m) => LICENSE_MODES.includes(String(m))).map(String))];
            if (!allowedModes.length) {
                json(res, 400, { error: 'Select at least one license type' });
                return;
            }
        }

        let allowedPlans = whitelabel.allowedPlans;
        if (body.allowedPlans !== undefined) {
            if (!Array.isArray(body.allowedPlans)) {
                json(res, 400, { error: 'allowedPlans must be an array' });
                return;
            }
            allowedPlans = [...new Set((body.allowedPlans as unknown[]).filter((p) => WL_PLANS.includes(String(p))).map(String))];
            if (!allowedPlans.length) {
                json(res, 400, { error: 'Select at least one key duration' });
                return;
            }
        }

        let licenseLimit = whitelabel.licenseLimit;
        if (body.licenseLimit !== undefined) {
            licenseLimit = Math.floor(Number(body.licenseLimit));
            if (!Number.isFinite(licenseLimit) || licenseLimit < 1 || licenseLimit > MAX_LIMIT) {
                json(res, 400, { error: `License limit must be between 1 and ${MAX_LIMIT}` });
                return;
            }
        }

        let maxDevices = whitelabel.maxDevices;
        if (body.maxDevices !== undefined) {
            if (body.maxDevices === null || body.maxDevices === '') {
                maxDevices = MAX_DEVICES;
            } else {
                maxDevices = Math.floor(Number(body.maxDevices));
                if (!Number.isFinite(maxDevices) || maxDevices < 1 || maxDevices > MAX_DEVICES) {
                    json(res, 400, { error: `Max devices must be between 1 and ${MAX_DEVICES}` });
                    return;
                }
            }
        }

        // Partnership term -- setting it (re)starts the clock from save time;
        // sending null clears it back to no expiry.
        let partnershipStartTs = whitelabel.partnershipStartTs ?? null;
        let partnershipMonths = whitelabel.partnershipMonths ?? null;
        let partnershipEndTs = whitelabel.partnershipEndTs ?? null;
        if (body.partnershipMonths !== undefined) {
            if (body.partnershipMonths === null || body.partnershipMonths === '') {
                partnershipStartTs = null;
                partnershipMonths = null;
                partnershipEndTs = null;
            } else {
                partnershipMonths = Math.floor(Number(body.partnershipMonths));
                if (!Number.isFinite(partnershipMonths) || partnershipMonths < 1 || partnershipMonths > 120) {
                    json(res, 400, { error: 'Partnership duration must be between 1 and 120 months' });
                    return;
                }
                const nowTs = Math.floor(Date.now() / 1000);
                partnershipStartTs = nowTs;
                partnershipEndTs = nowTs + Math.round(partnershipMonths * 30.4375) * 86400;
            }
        }

        const updated = {
            ...whitelabel,
            ...(body.name !== undefined ? { name: String(body.name).trim() } : {}),
            ...(body.phone !== undefined ? { phone: String(body.phone).trim() } : {}),
            ...(body.email !== undefined ? { email: String(body.email).trim() } : {}),
            ...(body.businessName !== undefined ? { businessName: String(body.businessName).trim() } : {}),
            ...(body.businessCategory !== undefined ? { businessCategory: String(body.businessCategory).trim() } : {}),
            ...(body.website !== undefined ? { website: String(body.website).trim() } : {}),
            ...(body.notes !== undefined ? { notes: String(body.notes).trim() } : {}),
            allowedModes,
            allowedPlans,
            maxDevices,
            licenseLimit,
            partnershipStartTs,
            partnershipMonths,
            partnershipEndTs,
            updatedAt: Math.floor(Date.now() / 1000),
            updatedBy: session.sub,
            updatedByName: session.username,
        };

        await saveWhitelabel(updated);

        const { passwordHash: _ignored, ...safe } = updated;
        json(res, 200, { success: true, whitelabel: safe });
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel update error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
