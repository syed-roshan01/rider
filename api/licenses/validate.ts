/**
 * POST /api/licenses/validate  { key, machineId?, mode? }
 *   200 -> { valid: true, plan, deviceLimit, isLifetime, daysLeft, secondsLeft,
 *            expiry, features }                       (zyqora shape, verbatim)
 *   200 -> { valid: false, error, reason? }
 *
 * PUBLIC panel debugging/parity endpoint (ADMIN-PORT §2). The Android app is
 * NOT routed through it -- it keeps its Edge Function contract untouched and
 * this endpoint NEVER mutates engine/app-facing state. The decision comes from
 * findByKey + evaluateEntitlement semantics (supabase/functions/_shared/
 * license.ts -- the single source of truth): the ENGINE is authoritative for
 * revoked/activated, so a revoked key fails at engine level.
 *
 * Deviations from the zyqora route (all documented in the workstream report):
 *   - ZYQ-HMAC signature checks are gone (RA- keys have none); validity is the
 *     engine entitlement decision. `reason` (LicenseErrorCode) is added to
 *     error responses for debugging.
 *   - 'Key not activated' is a new error: engine keys stay `unused` until the
 *     app activates them through the Edge Function (no auto-activation here).
 *   - validationException keeps zyqora's re-bind semantics but the re-bind is
 *     recorded in license_meta only (exceptionBoundMachineId).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import {
    evaluateEntitlement,
    hashDeviceCode,
    type Decision,
    type LicenseErrorCode,
} from '../../supabase/functions/_shared/license.js';
import { bodyOf, json } from '../_lib/server.js';
import {
    boundDeviceHashes,
    deviceIdDisplay,
    getEngineLicense,
    getPanelLicense,
    patchLicenseMeta,
    type PanelLicense,
} from '../_lib/panelLicense.js';

function successPayload(license: PanelLicense, now: number): Record<string, unknown> {
    const isLifetime = license.isLifetime;
    const secondsLeft = isLifetime ? null : Math.max(0, license.expiryTs - now);
    const daysLeft = isLifetime ? 9999 : Math.floor((secondsLeft ?? 0) / 86400);
    return {
        valid: true,
        plan: license.plan,
        deviceLimit: license.deviceLimit ?? 1,
        isLifetime,
        daysLeft,
        secondsLeft,
        expiry: isLifetime ? null : new Date(license.expiryTs * 1000).toISOString(),
        features: license.features || null,
    };
}

function reasonToError(reason: LicenseErrorCode | undefined): string {
    switch (reason) {
        case 'REVOKED': return 'Key has been revoked';
        case 'EXPIRED': return 'Key expired';
        case 'NOT_ACTIVATED': return 'Key not activated';
        case 'DEVICE_LIMIT': return 'Device limit reached';
        case 'DEVICE_MISMATCH': return 'Device not bound to this key';
        case 'TOKEN_EXPIRED': return 'Token expired';
        default: return 'Invalid key signature';
    }
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const b = bodyOf(req);
        const key = b.key;
        const machineId = b.machineId;
        const mode = b.mode === undefined ? '' : String(b.mode);

        if (!key) {
            json(res, 200, { valid: false, error: 'key required' });
            return;
        }

        const cleanKey = String(key).trim().toUpperCase();
        const cleanMid = String(machineId ?? '').trim().toUpperCase();

        // 1. Record existence + revocation check first (engine authoritative)
        const license = await getPanelLicense(cleanKey);
        if (!license) {
            json(res, 200, { valid: false, error: 'Key not registered' });
            return;
        }
        if (license.revoked) {
            json(res, 200, { valid: false, error: 'Key has been revoked' });
            return;
        }

        const now = Math.floor(Date.now() / 1000);

        // 1b. Reviewer/test access -- an explicitly flagged license record (set
        //     only via the admin panel, never through normal license generation)
        //     that skips platform-mode and machine-ID binding entirely, so it
        //     works on any device. Exists solely to satisfy Play Store's "Sign in
        //     details" requirement. Scoped to this one flagged record only --
        //     every other license, of any type, is completely unaffected. Revoke
        //     or let it expire (via the license's own expiryTs) to shut it off.
        if (license.reviewAccess === true) {
            if (!license.isLifetime && license.expiryTs && license.expiryTs < now) {
                json(res, 200, { valid: false, error: 'Key expired' });
                return;
            }
            json(res, 200, successPayload(license, now));
            return;
        }

        // 2. Each license type is bound to the platform it was actually issued
        //    for -- the desktop app never sends a `mode` field, the cloud build
        //    always sends 'cloud', and the mobile app always sends 'app'.
        //    Requiring an exact match stops one purchased key from being reused
        //    across platforms. Cloud keys never need a real machine ID;
        //    desktop/app keys are bound to one device's ID.
        if (license.licenseMode === 'cloud' && mode !== 'cloud') {
            json(res, 200, { valid: false, error: 'Cloud license requires cloud mode' });
            return;
        }
        if (license.licenseMode === 'app' && mode !== 'app') {
            json(res, 200, { valid: false, error: 'App license can only be used in the AcceptPro mobile app' });
            return;
        }
        if (license.licenseMode === 'desktop' && mode) {
            json(res, 200, { valid: false, error: 'Desktop license cannot be used on this platform' });
            return;
        }
        if (license.licenseMode !== 'cloud' && !cleanMid) {
            json(res, 200, { valid: false, error: `${license.licenseMode === 'app' ? 'App' : 'Desktop'} license requires machineId` });
            return;
        }

        // 3. The entitlement decision -- findByKey + evaluateEntitlement exactly
        //    like the engine takes it (allowJoin=false: validate must never admit
        //    an unknown device just because a slot is free).
        const engine = await getEngineLicense(license.engine.keyHash);
        if (!engine) {
            json(res, 200, { valid: false, error: 'Key not registered', reason: 'UNKNOWN_KEY' });
            return;
        }
        const isCloud = license.licenseMode === 'cloud';
        const own = await boundDeviceHashes(license.engine.keyHash);
        const requesting = isCloud ? '' : hashDeviceCode(cleanMid);
        const boundList = own.length ? own : isCloud ? [''] : [];

        const decide = (requestingHwidHash: string, boundHwidHashes: string[]): Decision =>
            evaluateEntitlement({
                license: engine,
                boundDeviceCount: own.length,
                requestingHwidHash,
                boundHwidHashes,
                tokenPayload: null,
                now: Date.now(),
                allowJoin: false,
            });

        let decision = decide(requesting, boundList);

        // Exception mode (zyqora semantics): when the primary binding check
        // fails, validate against the STORED machine binding and allow re-bind
        // to the current machine. Recorded in license_meta only.
        let usedExceptionFallback = false;
        if (!decision.ok && license.validationException === true) {
            const stored = license.machineId ? hashDeviceCode(license.machineId) : '';
            const mintBound = engine.boundDeviceCodeHashes ?? [];
            const fallback = decide(stored, mintBound.length ? mintBound : isCloud ? [''] : []);
            if (fallback.ok) {
                decision = fallback;
                usedExceptionFallback = true;
            }
        }

        if (!decision.ok) {
            json(res, 200, {
                valid: false,
                error: reasonToError(decision.reason),
                reason: decision.reason ?? null,
            });
            return;
        }

        // Exception mode re-binds to the latest validated machine (meta-only;
        // engine/app-facing state is never touched here).
        const display = deviceIdDisplay(String(machineId ?? ''));
        if (usedExceptionFallback && license.exceptionBoundMachineId !== display) {
            await patchLicenseMeta(license.engine.keyHash, { exception_bound_machine_id: display });
        }

        json(res, 200, successPayload(license, now));
    } catch (err) {
        console.error('Validate error:', err);
        json(res, 200, { valid: false, error: 'Server error' });
    }
}
