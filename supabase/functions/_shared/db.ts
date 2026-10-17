// ---------------------------------------------------------------------------
// Data access for the licence Edge Functions.
//
// Runs with the SERVICE ROLE key. RLS denies everything else on purpose: the
// Android app must never be able to read these tables directly. All signing
// happens server-side; the app holds only the Ed25519 public key.
// ---------------------------------------------------------------------------
import { createClient } from 'jsr:@supabase/supabase-js@2';
import type { LicenseRecord, PlanType, LicenseStatus } from './license.ts';

function env(name: string): string {
    const v = Deno.env.get(name);
    if (!v) throw new Error('missing secret: ' + name);
    return v;
}

type Db = ReturnType<typeof createClient>;
let client: Db | null = null;

export function db(): Db {
    if (!client) {
        const url = Deno.env.get('SUPABASE_URL') ?? env('SUPABASE_URL');
        const serviceKey = Deno.env.get('SUPABASE_SERVICE_ROLE_KEY') ?? env('SERVICE_ROLE_KEY');
        client = createClient(url, serviceKey, { auth: { persistSession: false } });
    }
    return client;
}

/** Mirrors the jsonb returned by the `activate_license` SQL function. */
export interface ActivateResult {
    ok: boolean;
    reason?: string;
    planType?: PlanType;
    expiresAt?: number;
    maxDevices?: number;
}

/**
 * Race-safe activation. The SQL function takes `select ... for update` on the
 * licence row and the `devices` composite PK `(device_code_hash, key_hash)`
 * guarantees the last-slot check cannot be won twice concurrently.
 */
export async function activateLicense(p: {
    keyHash: string;
    deviceCodeHash: string;
    appVersion: string;
    model: string;
    brand: string;
    integrity: string;
}): Promise<ActivateResult> {
    const { data, error } = await db().rpc('activate_license', {
        p_key_hash: p.keyHash,
        p_device_code_hash: p.deviceCodeHash,
        p_app_version: p.appVersion,
        p_model: p.model,
        p_brand: p.brand,
        p_integrity: p.integrity,
    });
    if (error) throw new Error('activate_license rpc failed: ' + error.message);
    return data as ActivateResult;
}

function toRecord(r: Record<string, unknown>): LicenseRecord {
    const bound = r.bound_device_code_hashes;
    return {
        keyHash: String(r.key_hash),
        keySealed: String(r.key_sealed ?? ''),
        keyPrefix: String(r.key_prefix),
        planType: r.plan_type as PlanType,
        durationDays: Number(r.duration_days),
        status: r.status as LicenseStatus,
        createdAt: Date.parse(String(r.created_at)),
        activatedAt: r.activated_at ? Date.parse(String(r.activated_at)) : null,
        expiresAt: r.expires_at ? Date.parse(String(r.expires_at)) : null,
        maxDevices: Number(r.max_devices),
        // An empty array is NOT nullish, so `?? fallback` would never fall back.
        boundDeviceCodeHashes: Array.isArray(bound) ? (bound as string[]) : [],
        note: String(r.note ?? ''),
        createdBy: String(r.created_by ?? ''),
    };
}

export async function findLicenseByKeyHash(keyHash: string): Promise<LicenseRecord | null> {
    const { data, error } = await db().from('licenses').select('*').eq('key_hash', keyHash).maybeSingle();
    if (error) throw new Error('licenses lookup failed: ' + error.message);
    return data ? toRecord(data as Record<string, unknown>) : null;
}

export async function boundHwids(keyHash: string): Promise<string[]> {
    const { data, error } = await db().from('devices').select('device_code_hash').eq('key_hash', keyHash);
    if (error) throw new Error('devices lookup failed: ' + error.message);
    return (data ?? []).map((d) => String((d as Record<string, unknown>).device_code_hash));
}

export async function touchDevice(deviceCodeHash: string): Promise<void> {
    await db()
        .from('devices')
        .update({ last_seen_at: new Date().toISOString() })
        .eq('device_code_hash', deviceCodeHash);
}

export async function audit(actor: string, action: string, detail: string): Promise<void> {
    await db().from('audit_log').insert({ actor, action, detail });
}

/** The shape returned by /v1/config — matches server.ts exactly. */
export interface ConfigResponse {
    maintenance: boolean;
    maintenanceMessage: string;
    forceUpdate: boolean;
    forceUpdateVersion: number;
    updateDownloadUrl: string;
    updatePageUrl: string;
    versionBlocked: boolean;
    minAllowedFare: number;
    maxAllowedFare: number;
    dialogMessage: string;
    dialogButtonText: string;
}

export async function getConfigFor(appVersion: number): Promise<ConfigResponse> {
    const { data, error } = await db().from('app_config').select('*').eq('id', 1).maybeSingle();
    if (error) throw new Error('app_config lookup failed: ' + error.message);
    const c = (data ?? {}) as Record<string, unknown>;
    const blocked = Array.isArray(c.version_blocked)
        ? (c.version_blocked as string[]).map(String).includes(String(appVersion))
        : false;
    return {
        maintenance: Boolean(c.maintenance_mode),
        maintenanceMessage: String(c.maintenance_message ?? ''),
        forceUpdate: Number(c.force_update_version ?? 0) > appVersion,
        forceUpdateVersion: Number(c.force_update_version ?? 0),
        updateDownloadUrl: String(c.update_download_url ?? ''),
        updatePageUrl: String(c.update_page_url ?? ''),
        versionBlocked: blocked,
        minAllowedFare: Number(c.min_allowed_fare ?? 10),
        maxAllowedFare: Number(c.max_allowed_fare ?? 5000),
        dialogMessage: String(c.dialog_message ?? ''),
        dialogButtonText: String(c.dialog_button_text ?? 'OK'),
    };
}
