/**
 * api/_lib/panelMath.ts -- money math, reproduced VERBATIM from spec §4
 * (zyqora-admin generate/convert/delete/stats/affiliate-stats routes).
 *
 * Every formula is kept in its original JS shape -- including the toFixed(2)
 * parse-back on affiliate commission and the `parseFloat(x ?? y)` quirks --
 * because these numbers ARE the contract.
 */
import type {
    AffiliateRecord,
    ExpenseRecord,
    PanelLicense,
    PaymentRecord,
    WithdrawalRecord,
} from './panelStore.js';

/**
 * Price / discount clamp (generate + convert):
 *   priceNum        = Math.max(0, parseFloat(price) || 0)
 *   discountedRaw   = (discountedPrice ''|undefined|null) ? priceNum
 *                     : Math.max(0, parseFloat(discountedPrice) || 0)
 *   discountedNum   = Math.min(priceNum, discountedRaw)   // NEVER above price
 *   discountAmount  = Math.max(0, priceNum - discountedNum)
 */
export function priceClamp(
    price: unknown,
    discountedPrice: unknown,
): { priceNum: number; discountedNum: number; discountAmount: number } {
    const priceNum = Math.max(0, parseFloat(String(price)) || 0);
    const discountedNumRaw =
        discountedPrice === '' || discountedPrice === undefined || discountedPrice === null
            ? priceNum
            : Math.max(0, parseFloat(String(discountedPrice)) || 0);
    const discountedNum = Math.min(priceNum, discountedNumRaw);
    const discountAmount = Math.max(0, priceNum - discountedNum);
    return { priceNum, discountedNum, discountAmount };
}

/**
 * Affiliate commission (generate + convert + update):
 *   revenue = discounted > 0 ? discounted : price
 *   parseFloat(((revenue * commission) / 100).toFixed(2))
 */
export function commissionFor(revenue: number, commission: number): number {
    return parseFloat(((revenue * commission) / 100).toFixed(2));
}

/** Revenue basis for commission: discounted counts unless it was zeroed out. */
export function commissionRevenue(price: number, discountedPrice: number | null): number {
    return ((discountedPrice ?? 0) > 0 ? (discountedPrice as number) : price) || 0;
}

// ---------------------------------------------------------------------------
// affiliate stats (spec §4 -- /api/affiliates/stats)
// ---------------------------------------------------------------------------

export interface AffiliateLicenseRow {
    key: string;
    clientName: string;
    clientPhone: string;
    plan: string;
    price: number;
    issuedAt: number;
    status: 'revoked' | 'expired' | 'active';
    isTrial: boolean;
    converted: boolean;
    issuedByName: string;
}

export interface AffiliateStatsBlock {
    totalClients: number;
    demoClients: number;
    convertedClients: number;
    totalRevenue: number;
    commissionAmount: number;
    commissionPercent: number;
    totalPaid: number;
    balance: number;
}

export interface AffiliateStatsResult {
    rows: AffiliateLicenseRow[];
    stats: AffiliateStatsBlock;
}

/** Exact port of the stats route's mine() filter + per-row derivation. */
export function affiliateStatsFor(
    licenses: PanelLicense[],
    payments: PaymentRecord[],
    affiliate: AffiliateRecord,
    targetId: string,
    nowTs: number,
): AffiliateStatsResult {
    const mine = licenses
        .filter((l) => l.affiliateId === targetId)
        .filter((l) => !(l.revoked && l.revokedReason?.startsWith('Converted to')));

    const rows: AffiliateLicenseRow[] = mine
        .map((l): AffiliateLicenseRow => {
            const isExpired = !l.isLifetime && (l.expiryTs || 0) <= nowTs;
            const isRevoked = !!l.revoked;
            const isTrial = l.plan === 'trial' || l.plan === 'trial1day';
            const price = Math.max(0, parseFloat(String(l.discountedPrice ?? l.price)) || 0);
            const status = isRevoked ? 'revoked' : isExpired ? 'expired' : 'active';
            const converted = !isTrial && price > 0;

            return {
                key: l.key,
                clientName: l.clientName || '',
                clientPhone: l.clientPhone || '',
                plan: l.plan || '',
                price,
                issuedAt: l.issuedAt,
                status,
                isTrial,
                converted,
                issuedByName: l.issuedByName || '',
            };
        })
        .sort((a, b) => (b.issuedAt || 0) - (a.issuedAt || 0));

    const totalClients = rows.length;
    const demoClients = rows.filter((l) => l.isTrial || l.price === 0).length;
    const convertedClients = rows.filter((l) => l.converted).length;
    const totalRevenue = rows.filter((l) => l.converted).reduce((s, l) => s + l.price, 0);
    const commissionAmount = totalRevenue * (affiliate.commission / 100);
    const totalPaid = payments.reduce((s, p) => s + (parseFloat(String(p.amount)) || 0), 0);
    const balance = Math.max(0, commissionAmount - totalPaid);

    return {
        rows,
        stats: {
            totalClients,
            demoClients,
            convertedClients,
            totalRevenue,
            commissionAmount,
            commissionPercent: affiliate.commission,
            totalPaid,
            balance,
        },
    };
}

// ---------------------------------------------------------------------------
// global stats (spec §4 -- /api/stats)
// ---------------------------------------------------------------------------

export interface GlobalStats {
    totalRevenueBasis: number;
    allWithdrawn: number;
    moneyLeft: number;
    totalRevenue: number;
    totalExpenses: number;
    affilCommission: number;
}

/**
 * Exact port of /api/stats:
 *   paidSales        = !revoked && price > 0 && whitelabelIssued !== true
 *   totalRevenue     = sum(Number(l.price))
 *   totalExpenses    = sum(Number(e.amount) || 0)
 *   affilCommission  = per sale: stored affiliateCommissionAmount when > 0,
 *                      else current rate over (discountedPrice ?? price)
 *   totalRevenueBasis = totalRevenue - totalExpenses - affilCommission
 *   moneyLeft         = totalRevenueBasis - allWithdrawn
 */
export function globalStatsFor(
    licenses: PanelLicense[],
    expenses: ExpenseRecord[],
    affiliates: AffiliateRecord[],
    withdrawals: WithdrawalRecord[],
): GlobalStats {
    const paidSales = licenses.filter((l) => !l.revoked && l.price > 0 && l.whitelabelIssued !== true);
    const totalRevenue = paidSales.reduce((s, l) => s + Number(l.price), 0);
    const totalExpenses = expenses.reduce((s, e) => s + (Number(e.amount) || 0), 0);

    const affCommMap = Object.fromEntries(affiliates.map((a) => [a.id, a.commission || 0]));
    const affilCommission = paidSales
        .filter((l) => l.affiliateId)
        .reduce((sum, l) => {
            const stored = parseFloat(String(l.affiliateCommissionAmount));
            if (stored > 0) return sum + stored;
            const revenue = parseFloat(String(l.discountedPrice ?? l.price)) || 0;
            const pct = (affCommMap[l.affiliateId as string] as number | undefined) || 0;
            return sum + (revenue * pct) / 100;
        }, 0);

    const totalRevenueBasis = totalRevenue - totalExpenses - affilCommission;
    const allWithdrawn = withdrawals.reduce((s, w) => s + (Number(w.amount) || 0), 0);
    const moneyLeft = totalRevenueBasis - allWithdrawn;

    return { totalRevenueBasis, allWithdrawn, moneyLeft, totalRevenue, totalExpenses, affilCommission };
}
