/**
 * api/_routes/dispatch.ts -- the single dispatcher behind the AcceptPro API.
 *
 * WHY THIS EXISTS: Vercel's Hobby plan caps a deployment at 12 Serverless
 * Functions, and the zero-config api/ build turns EVERY non-underscore .ts
 * file into its own function. The original one-file-per-route layout compiled
 * 54 functions and every deploy failed the quota gate. The 54 route modules
 * now live under api/_routes/** (underscore path segments are excluded from
 * function detection, exactly like api/_lib/**) and four depth-shard entries
 * -- api/[s1].ts, api/[s1]/[s2].ts, api/[s1]/[s2]/[s3].ts and
 * api/[s1]/[s2]/[s3]/[s4].ts -- re-export this dispatcher: 54 functions to 4.
 * Adding a route now costs zero extra functions.
 *
 * WIRE INVARIANCE: request and response shapes, error strings and req.query
 * are exactly what the per-file layout produced. The dispatcher only CHOOSES
 * the handler. It resolves path captures (:id / :key / :action) from req.url
 * itself, so dispatch never depends on how the platform injects shard params;
 * it keeps the query-string params Vercel already parsed, overwrites the shard
 * segments (s1..s4) out of req.query, and hands the request on untouched.
 *
 * Unmatched paths answer the JSON mirror's 404 contract, byte-exact wording
 * from license/src/server.ts: 'Not found' for the panel surface,
 * 'unknown admin endpoint' under /api/admin.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { matchRoute, type RoutePattern } from './router.js';

import adminAudit from './admin/audit.js';
import adminConfig from './admin/config.js';
import adminDeviceAction from './admin/devices/[id].js';
import adminDevices from './admin/devices/index.js';
import adminLicenseAction from './admin/licenses/[key]/[action].js';
import adminLicenses from './admin/licenses/index.js';
import adminLogin from './admin/login.js';
import adminLogout from './admin/logout.js';
import adminStats from './admin/stats.js';
import affiliatesChangePassword from './affiliates/[id]/change-password.js';
import affiliatesDelete from './affiliates/[id]/delete.js';
import affiliatesPay from './affiliates/[id]/pay.js';
import affiliatesPaymentEdit from './affiliates/payments/[id].js';
import affiliatesPayments from './affiliates/[id]/payments.js';
import affiliatesPaymentsList from './affiliates/payments/list.js';
import affiliatesToggle from './affiliates/[id]/toggle.js';
import affiliatesUpdateCommission from './affiliates/[id]/update-commission.js';
import affiliatesCreate from './affiliates/create.js';
import affiliatesList from './affiliates/list.js';
import affiliatesStats from './affiliates/stats.js';
import adminsChangePassword from './admins/[id]/change-password.js';
import adminsLicenses from './admins/[id]/licenses.js';
import adminsToggle from './admins/[id]/toggle.js';
import adminsUpdateShare from './admins/[id]/update-share.js';
import adminsCreate from './admins/create.js';
import adminsList from './admins/list.js';
import authLogin from './auth/login.js';
import authMe from './auth/me.js';
import checkoutClaim from './checkout/claim.js';
import checkoutCreateOrder from './checkout/create-order.js';
import checkoutPlans from './checkout/plans.js';
import checkoutStatus from './checkout/status.js';
import checkoutWebhook from './checkout/webhook.js';
import expenses from './expenses.js';
import licensesConvert from './licenses/convert.js';
import licensesDelete from './licenses/delete.js';
import licensesGenerate from './licenses/generate.js';
import licensesList from './licenses/list.js';
import licensesRevoke from './licenses/revoke.js';
import licensesUpdate from './licenses/update.js';
import licensesValidate from './licenses/validate.js';
import logs from './logs.js';
import sales from './sales.js';
import settingsDemo from './settings/demo.js';
import stats from './stats.js';
import whitelabelChangePassword from './whitelabel/[id]/change-password.js';
import whitelabelDelete from './whitelabel/[id]/delete.js';
import whitelabelLicenses from './whitelabel/[id]/licenses.js';
import whitelabelToggle from './whitelabel/[id]/toggle.js';
import whitelabelUpdate from './whitelabel/[id]/update.js';
import whitelabelCreate from './whitelabel/create.js';
import whitelabelList from './whitelabel/list.js';
import withdrawalEdit from './withdrawals/[id].js';
import withdrawals from './withdrawals.js';

type Handler = (req: VercelRequest, res: VercelResponse) => Promise<void> | void;

/**
 * Every pattern in the router table maps to exactly one route module. The
 * Record<RoutePattern, Handler> type makes tsc reject a missing or misspelled
 * entry: the table and the modules cannot drift apart without failing the
 * build.
 */
const HANDLERS: Record<RoutePattern, Handler> = {
    '/api/auth/login': authLogin,
    '/api/auth/me': authMe,
    '/api/admins/create': adminsCreate,
    '/api/admins/list': adminsList,
    '/api/admins/:id/change-password': adminsChangePassword,
    '/api/admins/:id/licenses': adminsLicenses,
    '/api/admins/:id/toggle': adminsToggle,
    '/api/admins/:id/update-share': adminsUpdateShare,
    '/api/affiliates/create': affiliatesCreate,
    '/api/affiliates/list': affiliatesList,
    '/api/affiliates/stats': affiliatesStats,
    '/api/affiliates/payments/list': affiliatesPaymentsList,
    '/api/affiliates/payments/:id': affiliatesPaymentEdit,
    '/api/affiliates/:id/change-password': affiliatesChangePassword,
    '/api/affiliates/:id/delete': affiliatesDelete,
    '/api/affiliates/:id/pay': affiliatesPay,
    '/api/affiliates/:id/payments': affiliatesPayments,
    '/api/affiliates/:id/toggle': affiliatesToggle,
    '/api/affiliates/:id/update-commission': affiliatesUpdateCommission,
    '/api/licenses/list': licensesList,
    '/api/licenses/update': licensesUpdate,
    '/api/licenses/validate': licensesValidate,
    '/api/licenses/generate': licensesGenerate,
    '/api/licenses/revoke': licensesRevoke,
    '/api/licenses/delete': licensesDelete,
    '/api/licenses/convert': licensesConvert,
    '/api/whitelabel/create': whitelabelCreate,
    '/api/whitelabel/list': whitelabelList,
    '/api/whitelabel/:id/change-password': whitelabelChangePassword,
    '/api/whitelabel/:id/delete': whitelabelDelete,
    '/api/whitelabel/:id/licenses': whitelabelLicenses,
    '/api/whitelabel/:id/toggle': whitelabelToggle,
    '/api/whitelabel/:id/update': whitelabelUpdate,
    '/api/settings/demo': settingsDemo,
    '/api/checkout/plans': checkoutPlans,
    '/api/checkout/create-order': checkoutCreateOrder,
    '/api/checkout/status': checkoutStatus,
    '/api/checkout/claim': checkoutClaim,
    '/api/checkout/webhook': checkoutWebhook,
    '/api/expenses': expenses,
    '/api/logs': logs,
    '/api/sales': sales,
    '/api/stats': stats,
    '/api/withdrawals': withdrawals,
    '/api/withdrawals/:id': withdrawalEdit,
    '/api/admin/login': adminLogin,
    '/api/admin/logout': adminLogout,
    '/api/admin/audit': adminAudit,
    '/api/admin/config': adminConfig,
    '/api/admin/stats': adminStats,
    '/api/admin/devices': adminDevices,
    '/api/admin/devices/:id': adminDeviceAction,
    '/api/admin/licenses': adminLicenses,
    '/api/admin/licenses/:key/:action': adminLicenseAction,
};

/** Shard-entry segment names (api/[s1]/.../[s4].ts); never surfaced to handlers. */
const SHARD_PARAMS = ['s1', 's2', 's3', 's4'];

export default async function dispatch(req: VercelRequest, res: VercelResponse): Promise<void> {
    const raw = String(req.url ?? '');
    const q = raw.indexOf('?');
    const pathname = (q === -1 ? raw : raw.slice(0, q)).replace(/\/+$/, '') || '/';

    const hit = matchRoute(pathname);
    if (!hit) {
        // license/src/server.ts wording, byte-exact (panel 404 / legacy admin 404)
        const adminSurface = pathname === '/api/admin' || pathname.startsWith('/api/admin/');
        json(res, 404, { error: adminSurface ? 'unknown admin endpoint' : 'Not found' });
        return;
    }

    // req.query = query-string params (Vercel's parse, kept verbatim) with the
    // shard segments removed and the path captures added under their canonical
    // names -- identical to what the per-file dynamic routes delivered.
    const query: Record<string, string | string[]> = { ...(req.query ?? {}) };
    for (const key of SHARD_PARAMS) delete query[key];
    for (const [key, value] of Object.entries(hit.params)) query[key] = value;
    req.query = query;

    await HANDLERS[hit.pattern](req, res);
}
