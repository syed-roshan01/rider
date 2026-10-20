/**
 * api/_routes/router.ts -- the AcceptPro API route table + URL matcher.
 *
 * PURE on purpose: no imports at all, so the pinning tests can load it under
 * plain node (type stripping) without touching Supabase env or @vercel/node.
 *
 * The table is the byte-exact URL contract of the api/ mirror (the JSON mirror
 * serves the same paths in license/src/server.ts). One pattern per route
 * module under api/_routes/** -- `:name` segments are path captures that land
 * in req.query exactly like Vercel's per-file dynamic routes delivered them
 * (`id`, `key`, `action`).
 */

export const ROUTE_PATTERNS = [
    '/api/auth/login',
    '/api/auth/me',
    '/api/admins/create',
    '/api/admins/list',
    '/api/admins/:id/change-password',
    '/api/admins/:id/licenses',
    '/api/admins/:id/toggle',
    '/api/admins/:id/update-share',
    '/api/affiliates/create',
    '/api/affiliates/list',
    '/api/affiliates/stats',
    '/api/affiliates/payments/list',
    '/api/affiliates/payments/:id',
    '/api/affiliates/:id/change-password',
    '/api/affiliates/:id/delete',
    '/api/affiliates/:id/pay',
    '/api/affiliates/:id/payments',
    '/api/affiliates/:id/toggle',
    '/api/affiliates/:id/update-commission',
    '/api/licenses/list',
    '/api/licenses/update',
    '/api/licenses/validate',
    '/api/licenses/generate',
    '/api/licenses/revoke',
    '/api/licenses/delete',
    '/api/licenses/convert',
    '/api/whitelabel/create',
    '/api/whitelabel/list',
    '/api/whitelabel/:id/change-password',
    '/api/whitelabel/:id/delete',
    '/api/whitelabel/:id/licenses',
    '/api/whitelabel/:id/toggle',
    '/api/whitelabel/:id/update',
    '/api/settings/demo',
    '/api/checkout/plans',
    '/api/checkout/create-order',
    '/api/checkout/status',
    '/api/checkout/claim',
    '/api/checkout/webhook',
    '/api/expenses',
    '/api/logs',
    '/api/sales',
    '/api/stats',
    '/api/withdrawals',
    '/api/withdrawals/:id',
    '/api/admin/login',
    '/api/admin/logout',
    '/api/admin/audit',
    '/api/admin/config',
    '/api/admin/stats',
    '/api/admin/devices',
    '/api/admin/devices/:id',
    '/api/admin/licenses',
    '/api/admin/licenses/:key/:action',
] as const;

export type RoutePattern = (typeof ROUTE_PATTERNS)[number];

export interface RouteMatch {
    pattern: RoutePattern;
    params: Record<string, string>;
}

interface CompiledRoute {
    pattern: RoutePattern;
    re: RegExp;
    keys: string[];
    literals: number;
}

const SEGMENT_ESCAPE_RE = /[.*+?^${}()|[\]\\]/g;

const COMPILED: CompiledRoute[] = ROUTE_PATTERNS.map((pattern) => {
    const keys: string[] = [];
    const segments = pattern.split('/').map((seg) => {
        if (seg.startsWith(':')) {
            keys.push(seg.slice(1));
            return '([^/]+)';
        }
        return seg.replace(SEGMENT_ESCAPE_RE, '\\$&');
    });
    return {
        pattern,
        re: new RegExp(`^${segments.join('/')}$`),
        keys,
        literals: pattern.split('/').filter((seg) => !seg.startsWith(':')).length,
    };
});

/**
 * Match an /api pathname (query string tolerated, trailing slash tolerated).
 * When several patterns match, the one with the most literal segments wins --
 * `/api/affiliates/payments/pay_9` is the payment id route, not `:id=payments`.
 * First declared wins an exact tie. Unknown paths return null.
 */
export function matchRoute(pathname: string): RouteMatch | null {
    const path = pathname.replace(/\/+$/, '') || '/';
    let best: RouteMatch | null = null;
    let bestLiterals = -1;
    for (const route of COMPILED) {
        const m = route.re.exec(path);
        if (!m) continue;
        if (route.literals <= bestLiterals) continue;
        bestLiterals = route.literals;
        const params: Record<string, string> = {};
        route.keys.forEach((key, i) => {
            params[key] = decodeURIComponent(m[i + 1] ?? '');
        });
        best = { pattern: route.pattern, params };
    }
    return best;
}
