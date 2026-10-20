/**
 * POST /api/whitelabel/create
 *   201 -> { success: true, whitelabel }
 *   400 -> { error: 'Username is required' | 'Display name is required' |
 *              'Password must be at least 6 characters' |
 *              'Select at least one license type' | 'Select at least one key duration' |
 *              'License limit must be between 1 and 999999' |
 *              'Max devices must be between 1 and 255' |
 *              'Partnership duration must be between 1 and 120 months' }
 *   409 -> { error: 'Username already taken' }
 *
 * SUPER only. Partnership term = months; the end timestamp is
 * nowTs + round(months * 30.4375) * 86400 exactly like the JSON store.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../_lib/server.js';
import { hashPassword, requireSuper } from '../_lib/panel.js';
import { LICENSE_MODES, WL_PLANS } from '../_lib/panelLicense.js';
import {
    getAdminByUsername,
    getAffiliateByUsername,
    getWhitelabelByUsername,
    saveWhitelabel,
} from '../_lib/panelStore.js';

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

        const body = bodyOf(req);
        const username = String(body.username || '').trim().toLowerCase();
        const password = String(body.password || '').trim();
        const name = String(body.name || '').trim();
        const phone = String(body.phone || '').trim();
        const email = String(body.email || '').trim();
        const businessName = String(body.businessName || '').trim();
        const businessCategory = String(body.businessCategory || '').trim();
        const website = String(body.website || '').trim();
        const notes = String(body.notes || '').trim();

        if (!username) { json(res, 400, { error: 'Username is required' }); return; }
        if (!name) { json(res, 400, { error: 'Display name is required' }); return; }
        if (!password || password.length < 6) {
            json(res, 400, { error: 'Password must be at least 6 characters' });
            return;
        }

        // Whitelabel users log into the same panel -- their username must not
        // collide with any existing admin or affiliate account.
        const [adminDup, affDup, wlDup] = await Promise.all([
            getAdminByUsername(username),
            getAffiliateByUsername(username),
            getWhitelabelByUsername(username),
        ]);
        if (adminDup || affDup || wlDup) {
            json(res, 409, { error: 'Username already taken' });
            return;
        }

        // Which license types (desktop / cloud / app) this client may generate
        const allowedModes = Array.isArray(body.allowedModes)
            ? [...new Set((body.allowedModes as unknown[]).filter((m) => LICENSE_MODES.includes(String(m))).map(String))]
            : [];
        if (!allowedModes.length) {
            json(res, 400, { error: 'Select at least one license type' });
            return;
        }

        // Which key durations (1/3/6 months, 1 year, custom) this client may issue
        const allowedPlans = Array.isArray(body.allowedPlans)
            ? [...new Set((body.allowedPlans as unknown[]).filter((p) => WL_PLANS.includes(String(p))).map(String))]
            : [...WL_PLANS];
        if (!allowedPlans.length) {
            json(res, 400, { error: 'Select at least one key duration' });
            return;
        }

        const licenseLimit = Math.floor(Number(body.licenseLimit));
        if (!Number.isFinite(licenseLimit) || licenseLimit < 1 || licenseLimit > MAX_LIMIT) {
            json(res, 400, { error: `License limit must be between 1 and ${MAX_LIMIT}` });
            return;
        }

        // Maximum devices per key this client may issue
        let maxDevices = MAX_DEVICES;
        if (body.maxDevices !== undefined && body.maxDevices !== null && body.maxDevices !== '') {
            maxDevices = Math.floor(Number(body.maxDevices));
            if (!Number.isFinite(maxDevices) || maxDevices < 1 || maxDevices > MAX_DEVICES) {
                json(res, 400, { error: `Max devices must be between 1 and ${MAX_DEVICES}` });
                return;
            }
        }

        // Partnership term -- how long this reseller relationship lasts
        // (months; null/absent = no expiry)
        let partnershipMonths: number | null = null;
        if (body.partnershipMonths !== undefined && body.partnershipMonths !== null && body.partnershipMonths !== '') {
            partnershipMonths = Math.floor(Number(body.partnershipMonths));
            if (!Number.isFinite(partnershipMonths) || partnershipMonths < 1 || partnershipMonths > 120) {
                json(res, 400, { error: 'Partnership duration must be between 1 and 120 months' });
                return;
            }
        }
        const nowTs = Math.floor(Date.now() / 1000);

        const whitelabel = {
            id: randomUUID(),
            username,
            name,
            passwordHash: hashPassword(password),
            phone,
            email,
            businessName,
            businessCategory,
            website,
            notes,
            allowedModes,
            allowedPlans,
            maxDevices,
            licenseLimit,
            partnershipStartTs: partnershipMonths ? nowTs : null,
            partnershipMonths,
            partnershipEndTs: partnershipMonths ? nowTs + Math.round(partnershipMonths * 30.4375) * 86400 : null,
            active: true,
            createdBy: session.sub,
            createdByName: session.username,
            createdAt: nowTs,
        };

        await saveWhitelabel(whitelabel);

        const { passwordHash: _ignored, ...safe } = whitelabel;
        json(res, 201, { success: true, whitelabel: safe });
    } catch (e) {
        // never leak key material or internals
        console.error('whitelabel create error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
