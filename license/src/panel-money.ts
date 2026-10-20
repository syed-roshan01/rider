/**
 * license/panel-money.ts — the money math of ADMIN-PORT.md spec §4, verbatim.
 *
 * Copied-verbatim-style mirror of the formulas embedded in the zyqora-admin
 * routes (licenses/generate, licenses/convert, affiliates/stats, stats):
 *
 *   - price/discount clamp:      discounted = min(price, raw), amount = price − discounted
 *   - affiliate commission:      parseFloat(((revenue * commission) / 100).toFixed(2))
 *   - affiliate-stats formulas:  totalClients / demoClients / convertedClients /
 *                                totalRevenue / commissionAmount / totalPaid / balance
 *   - global stats:              totalRevenue over non-revoked price>0 non-whitelabel
 *                                licences summing Number(l.price),
 *                                affilCommission preferring the stored
 *                                affiliateCommissionAmount else the current rate over
 *                                `discountedPrice ?? price`,
 *                                totalRevenueBasis = totalRevenue − totalExpenses − affilCommission,
 *                                moneyLeft = totalRevenueBasis − allWithdrawn
 */

const pf = (v: unknown): number => Math.max(0, parseFloat(v as string) || 0);

/**
 * zyqora licenses/generate + licenses/convert, byte-for-byte semantics:
 *   priceNum       = Math.max(0, parseFloat(price) || 0)
 *   discountedRaw  = (blank/null) ? priceNum : Math.max(0, parseFloat(discountedPrice) || 0)
 *   discountedNum  = Math.min(priceNum, discountedRaw)   ← the clamp
 *   discountAmount = Math.max(0, priceNum - discountedNum)
 */
export function priceFields(
    price: unknown,
    discountedPrice: unknown,
): { price: number; discountedPrice: number; discountAmount: number } {
    const priceNum = pf(price);
    const raw =
        discountedPrice === '' || discountedPrice === undefined || discountedPrice === null
            ? priceNum
            : pf(discountedPrice);
    const discountedNum = Math.min(priceNum, raw);
    const discountAmount = Math.max(0, priceNum - discountedNum);
    return { price: priceNum, discountedPrice: discountedNum, discountAmount };
}

/** zyqora generate/convert: revenue = discountedNum > 0 ? discountedNum : priceNum */
export function attributedRevenue(price: number, discountedPrice: number): number {
    return discountedPrice > 0 ? discountedPrice : price;
}

/** zyqora generate/convert: parseFloat(((revenue * commission) / 100).toFixed(2)) */
export function commissionAmount(revenue: number, commission: number): number {
    return parseFloat(((revenue * commission) / 100).toFixed(2));
}

export interface AffiliateStatsRow {
    price: number;
    isTrial: boolean;
    converted: boolean;
}

export interface AffiliateStatsResult {
    totalClients: number;
    demoClients: number;
    convertedClients: number;
    totalRevenue: number;
    commissionAmount: number;
    commissionPercent: number;
    totalPaid: number;
    balance: number;
}

/**
 * zyqora app/api/affiliates/stats/route.js formulas verbatim. `rows` is the
 * already-filtered mine[] projection (converted-revoked keys excluded upstream).
 */
export function affiliateStatsFormulas(
    rows: AffiliateStatsRow[],
    payments: { amount: unknown }[],
    commission: number,
): AffiliateStatsResult {
    const totalClients = rows.length;
    const demoClients = rows.filter((l) => l.isTrial || l.price === 0).length;
    const convertedClients = rows.filter((l) => l.converted).length;
    const totalRevenue = rows.filter((l) => l.converted).reduce((s, l) => s + l.price, 0);
    const commissionAmountNum = totalRevenue * (commission / 100);
    const totalPaid = payments.reduce((s, p) => s + (parseFloat(p.amount as string) || 0), 0);
    const balance = Math.max(0, commissionAmountNum - totalPaid);
    return {
        totalClients,
        demoClients,
        convertedClients,
        totalRevenue,
        commissionAmount: commissionAmountNum,
        commissionPercent: commission,
        totalPaid,
        balance,
    };
}

export interface GlobalMoneyLicense {
    price: unknown;
    discountedPrice?: unknown;
    affiliateId?: string | null;
    affiliateCommissionAmount?: unknown;
    revoked?: boolean;
    whitelabelIssued?: boolean;
}

export interface GlobalMoneyResult {
    totalRevenueBasis: number;
    allWithdrawn: number;
    moneyLeft: number;
    totalRevenue: number;
    totalExpenses: number;
    affilCommission: number;
}

/**
 * zyqora app/api/stats/route.js verbatim. Direct sales only — licences issued
 * by whitelabel resellers are their own business, not direct revenue.
 */
export function globalMoney(input: {
    licenses: GlobalMoneyLicense[];
    expenses: { amount: unknown }[];
    affiliates: { id: string; commission?: number }[];
    withdrawals: { amount: unknown }[];
}): GlobalMoneyResult {
    const { licenses, expenses, affiliates, withdrawals } = input;
    const paidSales = licenses.filter((l) => !l.revoked && Number(l.price) > 0 && l.whitelabelIssued !== true);
    const totalRevenue = paidSales.reduce((s, l) => s + Number(l.price), 0);
    const totalExpenses = expenses.reduce((s, e) => s + (Number(e.amount) || 0), 0);

    const affCommMap: Record<string, number> = Object.fromEntries(affiliates.map((a) => [a.id, a.commission || 0]));
    const affilCommission = paidSales
        .filter((l) => l.affiliateId)
        .reduce((sum, l) => {
            const stored = parseFloat(l.affiliateCommissionAmount as string);
            if (stored > 0) return sum + stored;
            const revenue = parseFloat((l.discountedPrice ?? l.price) as string) || 0;
            const pct = affCommMap[l.affiliateId as string] || 0;
            return sum + (revenue * pct) / 100;
        }, 0);

    const totalRevenueBasis = totalRevenue - totalExpenses - affilCommission;
    const allWithdrawn = withdrawals.reduce((s, w) => s + (Number(w.amount) || 0), 0);
    const moneyLeft = totalRevenueBasis - allWithdrawn;

    return { totalRevenueBasis, allWithdrawn, moneyLeft, totalRevenue, totalExpenses, affilCommission };
}
