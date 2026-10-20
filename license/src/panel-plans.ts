/**
 * license/panel-plans.ts — plan catalog + key-engine plan mapping.
 *
 * The checkout catalog (FEATURE_KEYS / PLANS / publicPlans) is copied verbatim
 * from zyqora-admin lib/plans.js (name strings verbatim per ADMIN-PORT.md §1);
 * LICENSE_MODES / WL_PLAN_OPTIONS / WL_PLANS / resolveWlPlans / resolveWlMaxDevices
 * are copied verbatim from zyqora-admin lib/license.js. The engine mapping
 * implements ADMIN-PORT.md §2: zyqora label -> engine planType/durationDays.
 */
import { normalizeDeviceCode, type PlanType } from './core.ts';

// ---------------------------------------------------------------------------
// zyqora-admin lib/plans.js — verbatim
// ---------------------------------------------------------------------------

// Sellable plans for the automatic checkout.
// Single place to change prices, device limits and which features each tier unlocks.
// Features not listed here default to "allowed" in the app (only an explicit
// `false` locks a page), so every flag is spelled out per tier.

export const FEATURE_KEYS = [
    'mobile', 'trustBuilder', 'autoReply', 'chatbot', 'liveChat',
    'groupGrabber', 'aiAutomation', 'forms', 'aiCampaigns',
];

function features(on: string[]): Record<string, boolean> {
    const out: Record<string, boolean> = {};
    for (const k of FEATURE_KEYS) out[k] = on.includes(k);
    return out;
}

export interface PlanDef {
    id: string;
    name: string;
    price: number;
    deviceLimit: number;
    durationPlan: string;
    popular?: boolean;
    features: Record<string, boolean>;
    highlights: string[];
}

export const PLANS: Record<string, PlanDef> = {
    starter: {
        id: 'starter',
        name: 'Starter',
        price: 999,            // INR, per year
        deviceLimit: 2,
        durationPlan: 'yearly',
        features: features(['autoReply']),
        highlights: [
            '2 WhatsApp devices',
            'Bulk campaigns, scheduling & safety limits',
            'All template types, contacts & groups',
            'Opt-out management & auto reply',
            'Windows + Android apps',
        ],
    },
    pro: {
        id: 'pro',
        name: 'Professional',
        price: 1499,
        deviceLimit: 4,
        durationPlan: 'yearly',
        popular: true,
        features: features(['mobile', 'trustBuilder', 'autoReply', 'chatbot', 'liveChat', 'groupGrabber', 'aiAutomation', 'forms', 'aiCampaigns']),
        highlights: [
            '4 WhatsApp devices',
            'Everything in Starter',
            'AI Automation: lead capture & instant forwarding',
            'AI Campaigns (a unique message for every contact)',
            'Chatbot flows, forms & live chat',
            'Group Grabber & Trust Builder',
            'Open on Mobile',
        ],
    },
    business: {
        id: 'business',
        name: 'Business',
        price: 2499,
        deviceLimit: 10,
        durationPlan: 'yearly',
        features: features(FEATURE_KEYS),
        highlights: [
            '10 WhatsApp devices',
            'Everything in Professional',
            'Priority support',
            'Need more devices or features? Contact support',
        ],
    },
};

export function publicPlans(): {
    id: string;
    name: string;
    price: number;
    deviceLimit: number;
    popular: boolean;
    highlights: string[];
}[] {
    return Object.values(PLANS).map((p) => ({
        id: p.id, name: p.name, price: p.price, deviceLimit: p.deviceLimit,
        popular: !!p.popular, highlights: p.highlights,
    }));
}

// ---------------------------------------------------------------------------
// zyqora-admin lib/license.js constants — verbatim
// ---------------------------------------------------------------------------

// Single source of truth for valid license types, shared by the generate
// form, the generate API's whitelist check, and the validate API's
// type/mode matching — added here once instead of duplicating the literal
// array across files.
export const LICENSE_MODES = ['desktop', 'cloud', 'app'];

// Key durations a whitelabel reseller may be granted by the super admin.
// The reseller can only issue licenses for durations in their allow-list —
// trials, weekly and lifetime are never available to resellers.
export const WL_PLAN_OPTIONS = [
    { value: 'monthly', label: '1 Month',  days: 30  },
    { value: '3months', label: '3 Months', days: 90  },
    { value: '6months', label: '6 Months', days: 180 },
    { value: 'yearly',  label: '1 Year',   days: 365 },
    { value: 'custom',  label: 'Custom Days', days: null },
];
export const WL_PLANS = WL_PLAN_OPTIONS.map((o) => o.value);

// Resolve a whitelabel record's effective allow-list: records created before
// this field existed (or with an unusable value) fall back to "all durations"
// so existing resellers keep working until the super admin restricts them.
export function resolveWlPlans(whitelabel: { allowedPlans?: unknown }): string[] {
    const list = Array.isArray(whitelabel?.allowedPlans)
        ? (whitelabel.allowedPlans as string[]).filter((p) => WL_PLANS.includes(p))
        : [];
    return list.length ? list : [...WL_PLANS];
}

// Resolve a whitelabel record's effective per-key device cap. Missing field
// (pre-existing records) means unrestricted (255 = key format maximum).
export function resolveWlMaxDevices(whitelabel: { maxDevices?: unknown }): number {
    const n = Math.floor(Number(whitelabel?.maxDevices));
    return Number.isFinite(n) && n >= 1 && n <= 255 ? n : 255;
}

/** LICENSE_MODES membership test (mirrors the zyqora whitelist checks). */
export function isLicenseMode(v: unknown): v is string {
    return typeof v === 'string' && (LICENSE_MODES as string[]).includes(v);
}

// ---------------------------------------------------------------------------
// ADMIN-PORT.md §2 — zyqora label -> AcceptPro engine planType/durationDays
// ---------------------------------------------------------------------------

export interface EnginePlan {
    planType: PlanType;
    durationDays: number;
    isLifetime: boolean;
}

/**
 * Plan mapping (zyqora label → engine `planType`/`durationDays`):
 *   trial1day→DAY/1, trial→DAY/3, weekly→WEEK/7, monthly→MONTH/30,
 *   3months→MONTH/90, 6months→MONTH/180, yearly→YEAR/365,
 *   lifetime→YEAR/36500 (isLifetime:true), custom→MONTH/customDays.
 * An unknown label falls back to MONTH/30 — zyqora lib/license.js
 * `planToExpiry` does `?? 30`, mirrored here.
 */
export function enginePlan(plan: string, customDays?: unknown): EnginePlan {
    switch (plan) {
        case 'trial1day':
            return { planType: 'DAY', durationDays: 1, isLifetime: false };
        case 'trial':
            return { planType: 'DAY', durationDays: 3, isLifetime: false };
        case 'weekly':
            return { planType: 'WEEK', durationDays: 7, isLifetime: false };
        case 'monthly':
            return { planType: 'MONTH', durationDays: 30, isLifetime: false };
        case '3months':
            return { planType: 'MONTH', durationDays: 90, isLifetime: false };
        case '6months':
            return { planType: 'MONTH', durationDays: 180, isLifetime: false };
        case 'yearly':
            return { planType: 'YEAR', durationDays: 365, isLifetime: false };
        case 'lifetime':
            return { planType: 'YEAR', durationDays: 36500, isLifetime: true };
        case 'custom':
            return { planType: 'MONTH', durationDays: Math.max(1, parseInt(String(customDays)) || 1), isLifetime: false };
        default:
            return { planType: 'MONTH', durationDays: 30, isLifetime: false };
    }
}

/** zyqora planToExpiry semantics on unix seconds (the wire `expiryTs`). */
export const LIFETIME_EXPIRY_TS = 253402300799;

/**
 * license_meta.expiryTs = issuedAt + durationDays*86400 (unix seconds; for
 * lifetime use 253402300799 + isLifetime:true) — ADMIN-PORT.md §2.
 */
export function metaExpiryTs(plan: string, customDays: unknown, issuedAt: number): number {
    const e = enginePlan(plan, customDays);
    return e.isLifetime ? LIFETIME_EXPIRY_TS : issuedAt + e.durationDays * 86400;
}

// ---------------------------------------------------------------------------
// "Machine ID" / "Android ID" = the app's Device ID (ADMIN-PORT.md §2 + §2.1)
// ---------------------------------------------------------------------------

/**
 * ADMIN-PORT.md §2.1 (LOCKED): the "Machine ID"/"Android ID" VALUE everywhere
 * (generate, convert, buy/create-order, claim) is the AcceptPro app's Device
 * ID — display form `XXXXX-XXXXX-XXXXX`, 15 Crockford chars (e.g.
 * `7QK2M-3XW8H-PTD4R`). Validation: `normalizeDeviceCode(input)` (shared
 * module — strips separators, folds O→0 / I,L→1), then require
 * `^[0-9A-HJKMNP-TV-Z]{15}$` on the result. zyqora's
 * `MACHINE_ID_RE = /^[A-F0-9]{16}$/` (lib/checkout.js) is NOT ported.
 */
const DEVICE_CODE_BODY_RE = /^[0-9A-HJKMNP-TV-Z]{15}$/;

/** core.ts normalizeDeviceCode — the single scrubbing rule for device ids. */
export function normalizeDeviceId(input: unknown): string {
    return normalizeDeviceCode(String(input ?? ''));
}

/** §2.1 validation: normalized form must be exactly 15 Crockford chars. */
export function isDeviceIdInput(input: unknown): boolean {
    return DEVICE_CODE_BODY_RE.test(normalizeDeviceId(input));
}

/**
 * §2.1 storage rule: `license_meta.machineId` = the re-hyphenated display form
 * `norm.match(/.{1,5}/g).join('-')`.
 */
export function displayDeviceCode(input: unknown): string {
    const norm = normalizeDeviceId(input);
    return norm.match(/.{1,5}/g)?.join('-') ?? '';
}
