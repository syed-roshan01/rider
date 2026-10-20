/**
 * api/_lib/panelStore.ts -- persistence for the AcceptPro admin suite.
 *
 * Ports the zyqora-admin store contract (lib/kv.js + lib/logs.js) onto
 * Supabase REST (PostgREST) using the house helpers in server.ts. The JSON
 * mirror of these records lives in license/src/store.ts; SQL columns are
 * snake_case and the wire records are camelCase (both spellings documented in
 * supabase/migrations/0003_admin_suite.sql).
 *
 * Time: every panel timestamp on the wire is unix SECONDS (createdAt,
 * issuedAt, expiryTs, paidAt, ...). Engine rows keep their ms fields and are
 * converted at the boundary (see panelLicense.ts).
 *
 * checkout side keys: the JSON store kept `pending:{mode}:{machineId}` (TTL
 * 24h), `claim:{mode}:{machineId}` (TTL 90d) and `order:lock:{orderId}`
 * (SET-NX-EX 30s). They live in panel_settings with expires_at lazy TTL
 * expiry -- the order:lock row doubles as the fulfil lock (acquire = PK-guarded
 * conditional insert, exactly Redis SET-NX semantics).
 */
import type { DbRow } from './server.js';
import { sb, sbRows, sbWrite } from './server.js';

// ---------------------------------------------------------------------------
// wire records (camelCase = the API/store shape)
// ---------------------------------------------------------------------------

export interface AdminUserRecord {
    id: string;
    username: string;
    passwordHash: string; // scrypt$<salthex>$<hashhex> -- stripped before every response
    role: 'super' | 'admin';
    createdBy: string | null;
    createdByName: string | null;
    createdAt: number;
    active: boolean;
    sharePercent?: number; // absent (undefined) while never set, like the JSON record
}

export interface WhitelabelRecord {
    id: string;
    username: string;
    name: string;
    passwordHash: string;
    phone: string;
    email: string;
    businessName: string;
    businessCategory: string;
    website: string;
    notes: string;
    allowedModes: string[];
    allowedPlans: string[];
    maxDevices: number;
    licenseLimit: number;
    partnershipStartTs: number | null;
    partnershipMonths: number | null;
    partnershipEndTs: number | null;
    active: boolean;
    createdBy: string | null;
    createdByName: string | null;
    createdAt: number;
    updatedAt?: number;
    updatedBy?: string;
    updatedByName?: string;
}

export interface AffiliateRecord {
    id: string;
    username: string;
    name: string;
    passwordHash: string;
    commission: number;
    active: boolean;
    createdBy: string | null;
    createdByName: string | null;
    createdAt: number;
}

export interface PaymentRecord {
    id: string;
    affiliateId: string;
    affiliateName: string;
    amount: number;
    note: string;
    paidBy: string;
    paidByName: string;
    paidAt: number;
    updatedAt?: number;
    updatedBy?: string;
    updatedByName?: string;
}

export interface ExpenseOriginalValues {
    title: string;
    amount: number;
    category: string;
    location: string;
    notes: string;
    spentAt: number;
}

export interface ExpenseRecord {
    id: string;
    title: string;
    amount: number;
    category: string;
    location: string;
    notes: string;
    spentBy: string;
    spentByName: string;
    spentAt: number;
    createdAt: number;
    editedAt?: number | null;
    editedBy?: string | null;
    editedByName?: string | null;
    originalValues?: ExpenseOriginalValues | null;
}

export interface WithdrawalRecord {
    id: string;
    adminId: string;
    adminUsername: string;
    amount: number;
    note: string;
    withdrawnAt: number;
    recordedBy: string;
    recordedByName: string;
    createdAt: number;
    updatedAt?: number;
    updatedBy?: string;
    updatedByName?: string;
}

export interface CheckoutCustomer {
    name: string;
    phone: string;
    email: string;
}

export interface CheckoutOrder {
    orderId: string;
    planId: string;
    mode: string;
    machineId: string;
    amount: number;
    status: string;
    customer: CheckoutCustomer;
    createdAt: number;
    paidAt: number | null;
    /** plaintext RA- key, resolved on read via unsealKey (never persisted) */
    licenseKey: string | null;
    /** internal: key_hash of the minted licence */
    licenseKeyHash: string | null;
    /** 90-day TTL like the KV order: key -- expired rows read as "unknown order" */
    expiresAt: number;
}

export interface PanelLog {
    id: string;
    action: string;
    actorId: string;
    actorName: string;
    actorRole: string;
    ts: number;
    flag: string | null;
    meta: Record<string, unknown>;
}

export interface DemoSettings {
    enabled: boolean;
    updatedAt?: number;
    updatedBy?: string;
}

const nowSec = (): number => Math.floor(Date.now() / 1000);

/** First row of a PostgREST result, or null. */
function one(rows: DbRow[]): DbRow | null {
    return rows[0] ?? null;
}

/** PostgREST value escaping for eq.<value> filters. */
function eq(v: string): string {
    return encodeURIComponent(v);
}

// ---------------------------------------------------------------------------
// row -> record mappers (snake_case SQL -> camelCase wire)
// ---------------------------------------------------------------------------

function toAdminUser(r: DbRow): AdminUserRecord {
    const rec: AdminUserRecord = {
        id: String(r.id ?? ''),
        username: String(r.username ?? ''),
        passwordHash: String(r.password_hash ?? ''),
        role: r.role === 'super' ? 'super' : 'admin',
        createdBy: r.created_by == null ? null : String(r.created_by),
        createdByName: r.created_by_name == null ? null : String(r.created_by_name),
        createdAt: Number(r.created_at ?? 0),
        active: r.active !== false,
    };
    // sharePercent is absent from the JSON record until update-share sets it
    if (r.share_percent != null) rec.sharePercent = Number(r.share_percent);
    return rec;
}

function toWhitelabel(r: DbRow): WhitelabelRecord {
    const rec: WhitelabelRecord = {
        id: String(r.id ?? ''),
        username: String(r.username ?? ''),
        name: String(r.name ?? ''),
        passwordHash: String(r.password_hash ?? ''),
        phone: String(r.phone ?? ''),
        email: String(r.email ?? ''),
        businessName: String(r.business_name ?? ''),
        businessCategory: String(r.business_category ?? ''),
        website: String(r.website ?? ''),
        notes: String(r.notes ?? ''),
        allowedModes: Array.isArray(r.allowed_modes) ? r.allowed_modes.map(String) : [],
        allowedPlans: Array.isArray(r.allowed_plans) ? r.allowed_plans.map(String) : [],
        maxDevices: Number(r.max_devices ?? 255),
        licenseLimit: Number(r.license_limit ?? 0),
        partnershipStartTs: r.partnership_start_ts == null ? null : Number(r.partnership_start_ts),
        partnershipMonths: r.partnership_months == null ? null : Number(r.partnership_months),
        partnershipEndTs: r.partnership_end_ts == null ? null : Number(r.partnership_end_ts),
        active: r.active !== false,
        createdBy: r.created_by == null ? null : String(r.created_by),
        createdByName: r.created_by_name == null ? null : String(r.created_by_name),
        createdAt: Number(r.created_at ?? 0),
    };
    if (r.updated_at != null) rec.updatedAt = Number(r.updated_at);
    if (r.updated_by != null) rec.updatedBy = String(r.updated_by);
    if (r.updated_by_name != null) rec.updatedByName = String(r.updated_by_name);
    return rec;
}

function toAffiliate(r: DbRow): AffiliateRecord {
    return {
        id: String(r.id ?? ''),
        username: String(r.username ?? ''),
        name: String(r.name ?? ''),
        passwordHash: String(r.password_hash ?? ''),
        commission: Number(r.commission ?? 0),
        active: r.active !== false,
        createdBy: r.created_by == null ? null : String(r.created_by),
        createdByName: r.created_by_name == null ? null : String(r.created_by_name),
        createdAt: Number(r.created_at ?? 0),
    };
}

function toPayment(r: DbRow): PaymentRecord {
    const rec: PaymentRecord = {
        id: String(r.id ?? ''),
        affiliateId: String(r.affiliate_id ?? ''),
        affiliateName: String(r.affiliate_name ?? ''),
        amount: Number(r.amount ?? 0),
        note: String(r.note ?? ''),
        paidBy: String(r.paid_by ?? ''),
        paidByName: String(r.paid_by_name ?? ''),
        paidAt: Number(r.paid_at ?? 0),
    };
    if (r.updated_at != null) rec.updatedAt = Number(r.updated_at);
    if (r.updated_by != null) rec.updatedBy = String(r.updated_by);
    if (r.updated_by_name != null) rec.updatedByName = String(r.updated_by_name);
    return rec;
}

function toExpense(r: DbRow): ExpenseRecord {
    const rec: ExpenseRecord = {
        id: String(r.id ?? ''),
        title: String(r.title ?? ''),
        amount: Number(r.amount ?? 0),
        category: String(r.category ?? ''),
        location: String(r.location ?? ''),
        notes: String(r.notes ?? ''),
        spentBy: String(r.spent_by ?? ''),
        spentByName: String(r.spent_by_name ?? ''),
        spentAt: Number(r.spent_at ?? 0),
        createdAt: Number(r.created_at ?? 0),
    };
    if (r.edited_at != null) rec.editedAt = Number(r.edited_at);
    if (r.edited_by != null) rec.editedBy = String(r.edited_by);
    if (r.edited_by_name != null) rec.editedByName = String(r.edited_by_name);
    if (r.original_values != null && typeof r.original_values === 'object') {
        const o = r.original_values as DbRow;
        rec.originalValues = {
            title: String(o.title ?? ''),
            amount: Number(o.amount ?? 0),
            category: String(o.category ?? ''),
            location: String(o.location ?? ''),
            notes: String(o.notes ?? ''),
            spentAt: Number(o.spentAt ?? o.spent_at ?? 0),
        };
    }
    return rec;
}

function toWithdrawal(r: DbRow): WithdrawalRecord {
    const rec: WithdrawalRecord = {
        id: String(r.id ?? ''),
        adminId: String(r.admin_id ?? ''),
        adminUsername: String(r.admin_username ?? ''),
        amount: Number(r.amount ?? 0),
        note: String(r.note ?? ''),
        withdrawnAt: Number(r.withdrawn_at ?? 0),
        recordedBy: String(r.recorded_by ?? ''),
        recordedByName: String(r.recorded_by_name ?? ''),
        createdAt: Number(r.created_at ?? 0),
    };
    if (r.updated_at != null) rec.updatedAt = Number(r.updated_at);
    if (r.updated_by != null) rec.updatedBy = String(r.updated_by);
    if (r.updated_by_name != null) rec.updatedByName = String(r.updated_by_name);
    return rec;
}

export function toPanelLog(r: DbRow): PanelLog {
    return {
        id: String(r.id ?? ''),
        action: String(r.action ?? ''),
        actorId: String(r.actor_id ?? ''),
        actorName: String(r.actor_name ?? ''),
        actorRole: String(r.actor_role ?? ''),
        ts: Number(r.ts ?? 0),
        flag: r.flag == null ? null : String(r.flag),
        meta: r.meta && typeof r.meta === 'object' ? (r.meta as Record<string, unknown>) : {},
    };
}

// ---------------------------------------------------------------------------
// admins (table admin_users)
// ---------------------------------------------------------------------------

export async function getAdmin(id: string): Promise<AdminUserRecord | null> {
    const rows = await sbRows(`/admin_users?select=*&id=eq.${eq(id)}`);
    return one(rows) ? toAdminUser(one(rows)!) : null;
}

export async function getAdminByUsername(username: string): Promise<AdminUserRecord | null> {
    const rows = await sbRows(`/admin_users?select=*&username=eq.${eq(String(username).toLowerCase())}`);
    return one(rows) ? toAdminUser(one(rows)!) : null;
}

export async function saveAdmin(admin: AdminUserRecord): Promise<AdminUserRecord> {
    const rows = await upsert('admin_users', {
        id: admin.id,
        username: admin.username.toLowerCase(),
        password_hash: admin.passwordHash,
        role: admin.role,
        created_by: admin.createdBy,
        created_by_name: admin.createdByName,
        created_at: admin.createdAt,
        active: admin.active,
        share_percent: admin.sharePercent ?? null,
    });
    return toAdminUser(one(rows) ?? {});
}

export async function listAdmins(): Promise<AdminUserRecord[]> {
    const rows = await sbRows('/admin_users?select=*');
    return rows.map(toAdminUser);
}

// ---------------------------------------------------------------------------
// whitelabels (table whitelabels)
// ---------------------------------------------------------------------------

export async function getWhitelabel(id: string): Promise<WhitelabelRecord | null> {
    const rows = await sbRows(`/whitelabels?select=*&id=eq.${eq(id)}`);
    return one(rows) ? toWhitelabel(one(rows)!) : null;
}

export async function getWhitelabelByUsername(username: string): Promise<WhitelabelRecord | null> {
    const rows = await sbRows(`/whitelabels?select=*&username=eq.${eq(String(username).toLowerCase())}`);
    return one(rows) ? toWhitelabel(one(rows)!) : null;
}

export async function saveWhitelabel(whitelabel: WhitelabelRecord): Promise<WhitelabelRecord> {
    // Guard against corrupted records ever being written (verbatim from lib/kv.js):
    // a record without id/username would silently break login, quota and every
    // restriction.
    if (!whitelabel?.id || !whitelabel?.username)
        throw new Error('saveWhitelabel: record is missing id/username — refusing to write');
    const rows = await upsert('whitelabels', {
        id: whitelabel.id,
        username: whitelabel.username.toLowerCase(),
        name: whitelabel.name,
        password_hash: whitelabel.passwordHash,
        phone: whitelabel.phone,
        email: whitelabel.email,
        business_name: whitelabel.businessName,
        business_category: whitelabel.businessCategory,
        website: whitelabel.website,
        notes: whitelabel.notes,
        allowed_modes: whitelabel.allowedModes,
        allowed_plans: whitelabel.allowedPlans,
        max_devices: whitelabel.maxDevices,
        license_limit: whitelabel.licenseLimit,
        partnership_start_ts: whitelabel.partnershipStartTs,
        partnership_months: whitelabel.partnershipMonths,
        partnership_end_ts: whitelabel.partnershipEndTs,
        active: whitelabel.active,
        created_by: whitelabel.createdBy,
        created_by_name: whitelabel.createdByName,
        created_at: whitelabel.createdAt,
        updated_at: whitelabel.updatedAt ?? null,
        updated_by: whitelabel.updatedBy ?? null,
        updated_by_name: whitelabel.updatedByName ?? null,
    });
    return toWhitelabel(one(rows) ?? {});
}

export async function listWhitelabels(): Promise<WhitelabelRecord[]> {
    // Guard against corrupted records (missing id/username) ever reaching the UI.
    const rows = await sbRows('/whitelabels?select=*');
    return rows.map(toWhitelabel).filter((r) => r.id && r.username);
}

/**
 * Remove a whitelabel client account. Licenses they issued deliberately stay in
 * the records -- deleting the reseller must not erase sales history.
 */
export async function deleteWhitelabel(whitelabel: { id?: string; username?: string }): Promise<void> {
    if (whitelabel?.id) await sbWrite('DELETE', `/whitelabels?id=eq.${eq(whitelabel.id)}`);
}

// ---------------------------------------------------------------------------
// affiliates (table affiliates)
// ---------------------------------------------------------------------------

export async function getAffiliate(id: string): Promise<AffiliateRecord | null> {
    const rows = await sbRows(`/affiliates?select=*&id=eq.${eq(id)}`);
    return one(rows) ? toAffiliate(one(rows)!) : null;
}

export async function getAffiliateByUsername(username: string): Promise<AffiliateRecord | null> {
    const rows = await sbRows(`/affiliates?select=*&username=eq.${eq(String(username).toLowerCase())}`);
    return one(rows) ? toAffiliate(one(rows)!) : null;
}

export async function saveAffiliate(affiliate: AffiliateRecord): Promise<AffiliateRecord> {
    const rows = await upsert('affiliates', {
        id: affiliate.id,
        username: affiliate.username.toLowerCase(),
        name: affiliate.name,
        password_hash: affiliate.passwordHash,
        commission: affiliate.commission,
        active: affiliate.active,
        created_by: affiliate.createdBy,
        created_by_name: affiliate.createdByName,
        created_at: affiliate.createdAt,
    });
    return toAffiliate(one(rows) ?? {});
}

export async function listAffiliates(): Promise<AffiliateRecord[]> {
    const rows = await sbRows('/affiliates?select=*');
    return rows.map(toAffiliate);
}

export async function deleteAffiliate(affiliate: { id: string }): Promise<void> {
    await sbWrite('DELETE', `/affiliates?id=eq.${eq(affiliate.id)}`);
}

// ---------------------------------------------------------------------------
// affiliate payments (table affiliate_payments)
// ---------------------------------------------------------------------------

export async function getPayment(id: string): Promise<PaymentRecord | null> {
    const rows = await sbRows(`/affiliate_payments?select=*&id=eq.${eq(id)}`);
    return one(rows) ? toPayment(one(rows)!) : null;
}

export async function savePayment(payment: PaymentRecord): Promise<PaymentRecord> {
    const rows = await upsert('affiliate_payments', {
        id: payment.id,
        affiliate_id: payment.affiliateId,
        affiliate_name: payment.affiliateName,
        amount: payment.amount,
        note: payment.note,
        paid_by: payment.paidBy,
        paid_by_name: payment.paidByName,
        paid_at: payment.paidAt,
        updated_at: payment.updatedAt ?? null,
        updated_by: payment.updatedBy ?? null,
        updated_by_name: payment.updatedByName ?? null,
    });
    return toPayment(one(rows) ?? {});
}

export async function listAffiliatePayments(affiliateId: string): Promise<PaymentRecord[]> {
    const rows = await sbRows(
        `/affiliate_payments?select=*&affiliate_id=eq.${eq(affiliateId)}&order=paid_at.desc`,
    );
    return rows.map(toPayment);
}

export async function listAllPayments(): Promise<PaymentRecord[]> {
    const rows = await sbRows('/affiliate_payments?select=*&order=paid_at.desc');
    return rows.map(toPayment);
}

// ---------------------------------------------------------------------------
// expenses (table expenses)
// ---------------------------------------------------------------------------

export async function getExpense(id: string): Promise<ExpenseRecord | null> {
    const rows = await sbRows(`/expenses?select=*&id=eq.${eq(id)}`);
    return one(rows) ? toExpense(one(rows)!) : null;
}

export async function saveExpense(expense: ExpenseRecord): Promise<ExpenseRecord> {
    const rows = await upsert('expenses', {
        id: expense.id,
        title: expense.title,
        amount: expense.amount,
        category: expense.category,
        location: expense.location,
        notes: expense.notes,
        spent_by: expense.spentBy,
        spent_by_name: expense.spentByName,
        spent_at: expense.spentAt,
        created_at: expense.createdAt,
        edited_at: expense.editedAt ?? null,
        edited_by: expense.editedBy ?? null,
        edited_by_name: expense.editedByName ?? null,
        original_values: expense.originalValues ?? null,
    });
    return toExpense(one(rows) ?? {});
}

export async function listAllExpenses(): Promise<ExpenseRecord[]> {
    const rows = await sbRows('/expenses?select=*&order=spent_at.desc');
    return rows.map(toExpense);
}

export async function listAdminExpenses(adminId: string): Promise<ExpenseRecord[]> {
    const rows = await sbRows(`/expenses?select=*&spent_by=eq.${eq(adminId)}&order=spent_at.desc`);
    return rows.map(toExpense);
}

// ---------------------------------------------------------------------------
// withdrawals (table withdrawals)
// ---------------------------------------------------------------------------

export async function getWithdrawal(id: string): Promise<WithdrawalRecord | null> {
    const rows = await sbRows(`/withdrawals?select=*&id=eq.${eq(id)}`);
    return one(rows) ? toWithdrawal(one(rows)!) : null;
}

export async function saveWithdrawal(withdrawal: WithdrawalRecord): Promise<WithdrawalRecord> {
    const rows = await upsert('withdrawals', {
        id: withdrawal.id,
        admin_id: withdrawal.adminId,
        admin_username: withdrawal.adminUsername,
        amount: withdrawal.amount,
        note: withdrawal.note,
        withdrawn_at: withdrawal.withdrawnAt,
        recorded_by: withdrawal.recordedBy,
        recorded_by_name: withdrawal.recordedByName,
        created_at: withdrawal.createdAt,
        updated_at: withdrawal.updatedAt ?? null,
        updated_by: withdrawal.updatedBy ?? null,
        updated_by_name: withdrawal.updatedByName ?? null,
    });
    return toWithdrawal(one(rows) ?? {});
}

export async function listAllWithdrawals(): Promise<WithdrawalRecord[]> {
    const rows = await sbRows('/withdrawals?select=*&order=withdrawn_at.desc');
    return rows.map(toWithdrawal);
}

export async function listAdminWithdrawals(adminId: string): Promise<WithdrawalRecord[]> {
    const rows = await sbRows(
        `/withdrawals?select=*&admin_id=eq.${eq(adminId)}&order=withdrawn_at.desc`,
    );
    return rows.map(toWithdrawal);
}

// ---------------------------------------------------------------------------
// activity logs (table panel_logs) -- max 1000 kept, GET serves 300 newest
// ---------------------------------------------------------------------------

const MAX_LOGS = 1000;

export async function saveLog(log: PanelLog): Promise<void> {
    await sbWrite('POST', '/panel_logs', {
        id: log.id,
        action: log.action,
        actor_id: log.actorId,
        actor_name: log.actorName,
        actor_role: log.actorRole,
        ts: log.ts,
        flag: log.flag ?? null,
        meta: log.meta ?? {},
    });
    // Mirror the KV lpush+ltrim(0, MAX-1): keep only the newest MAX_LOGS rows.
    const all = await sbRows('/panel_logs?select=id&order=ts.desc');
    const stale = all.slice(MAX_LOGS).map((r) => String(r.id ?? '')).filter(Boolean);
    for (const id of stale) await sbWrite('DELETE', `/panel_logs?id=eq.${eq(id)}`);
}

export async function listLogs(limit = 300): Promise<PanelLog[]> {
    const rows = await sbRows(`/panel_logs?select=*&order=ts.desc&limit=${Math.max(0, limit)}`);
    return rows.map(toPanelLog);
}

export async function clearLogs(): Promise<void> {
    await sbWrite('DELETE', '/panel_logs?ts=gte.0');
}

// ---------------------------------------------------------------------------
// settings KV (table panel_settings: k / v / expires_at / updated_at)
// ---------------------------------------------------------------------------

const DEMO_KEY = 'demo';

export async function getDemoSettings(): Promise<DemoSettings> {
    // zyqora: (await kv.get('settings:demo')) || { enabled: true }
    const rows = await sbRows(`/panel_settings?select=*&k=eq.${eq(DEMO_KEY)}`);
    const row = one(rows);
    if (!row) return { enabled: true };
    const v = (row.v ?? {}) as DbRow;
    return {
        enabled: v.enabled !== false,
        updatedAt: Number(v.updatedAt ?? 0),
        updatedBy: String(v.updatedBy ?? ''),
    };
}

export async function saveDemoSettings(settings: DemoSettings): Promise<DemoSettings> {
    await upsert('panel_settings', {
        k: DEMO_KEY,
        v: { enabled: settings.enabled, updatedAt: settings.updatedAt, updatedBy: settings.updatedBy },
        expires_at: null,
        updated_at: settings.updatedAt,
    });
    return settings;
}

/**
 * TTL'd side keys (`pending:` / `claim:` / `order:lock:`). Rows past
 * expires_at read as absent and are swept lazily -- the KV `ex` semantics.
 */
async function getSideValue(k: string): Promise<string | null> {
    const rows = await sbRows(`/panel_settings?select=*&k=eq.${eq(k)}`);
    const row = one(rows);
    if (!row) return null;
    const expiresAt = row.expires_at == null ? null : Number(row.expires_at);
    if (expiresAt != null && expiresAt <= nowSec()) {
        await sbWrite('DELETE', `/panel_settings?k=eq.${eq(k)}`); // lazy expiry
        return null;
    }
    const v = (row.v ?? {}) as DbRow;
    return v.value == null ? null : String(v.value);
}

async function setSideValue(k: string, value: string, ttlSec: number): Promise<void> {
    await upsert('panel_settings', {
        k,
        v: { value },
        expires_at: nowSec() + ttlSec,
        updated_at: nowSec(),
    });
}

export const ORDER_TTL_SEC = 60 * 60 * 24 * 90; // 90 days, like the KV `ex`
const PENDING_TTL_SEC = 60 * 60 * 24; // 24h

export function pendingKey(mode: string, machineId: string): string {
    return `pending:${mode}:${machineId}`;
}

export function claimKey(mode: string, machineId: string): string {
    return `claim:${mode}:${machineId}`;
}

export function orderLockKey(orderId: string): string {
    return `order:lock:${orderId}`;
}

export async function getPending(mode: string, machineId: string): Promise<string | null> {
    return getSideValue(pendingKey(mode, machineId));
}

export async function setPending(mode: string, machineId: string, orderId: string): Promise<void> {
    await setSideValue(pendingKey(mode, machineId), orderId, PENDING_TTL_SEC);
}

export async function getClaim(mode: string, machineId: string): Promise<string | null> {
    return getSideValue(claimKey(mode, machineId));
}

export async function setClaim(mode: string, machineId: string, orderId: string): Promise<void> {
    await setSideValue(claimKey(mode, machineId), orderId, ORDER_TTL_SEC);
}

/**
 * The fulfil lock -- Redis `SET order:lock:{id} 1 NX EX 30` semantics:
 * acquisition is a conditional insert (primary-key conflict = already locked,
 * exactly like SET-NX failing), the row carries a 30-second TTL. Transport
 * failures THROW like zyqora's kv.set would (the callers already handle that).
 */
export async function acquireOrderLock(orderId: string): Promise<boolean> {
    const k = orderLockKey(orderId);
    // a stale (expired) lock row must not block acquisition (best effort)
    try {
        await sbWrite('DELETE', `/panel_settings?k=eq.${eq(k)}&expires_at=lt.${nowSec()}`);
    } catch {
        /* TTL sweep is advisory only */
    }
    const res = await sb('POST', '/panel_settings', {
        k,
        v: { t: nowSec() },
        expires_at: nowSec() + 30,
        updated_at: nowSec(),
    }, { prefer: 'return=representation,resolution=ignore-duplicates' });
    if (!res.ok) throw new Error('write failed');
    const rows: unknown = await res.json().catch(() => []);
    // 201 + [row] = lock acquired; 201 + [] = SET-NX lost
    return Array.isArray(rows) && rows.length > 0;
}

export async function releaseOrderLock(orderId: string): Promise<void> {
    try {
        await sbWrite('DELETE', `/panel_settings?k=eq.${eq(orderLockKey(orderId))}`);
    } catch {
        /* best effort -- the TTL will clear it */
    }
}

// ---------------------------------------------------------------------------
// shared upsert helper (PostgREST ON CONFLICT DO UPDATE, like kv.set)
// ---------------------------------------------------------------------------

async function upsert(table: string, row: DbRow): Promise<DbRow[]> {
    const res = await sb('POST', `/${table}`, row, {
        prefer: 'return=representation,resolution=merge-duplicates',
    });
    if (!res.ok) throw new Error('write failed');
    const data: unknown = await res.json().catch(() => []);
    return Array.isArray(data) ? (data as DbRow[]) : [];
}
