/**
 * api/_lib/rateLimit.ts -- fixed-window limiter for the public checkout
 * endpoints (spec §7). Port of zyqora-admin lib/rateLimit.js.
 *
 * Storage choice (documented in the workstream report): an IN-MEMORY map,
 * matching the house pattern of server.ts's loginRateLimit. The three buckets
 * are cheap abuse dampeners -- fail-open semantics matter more than exact
 * cross-instance counters, and no extra table is needed. Bucket keys keep the
 * zyqora `rl:{bucket}` shape in the map.
 */
import type { VercelRequest } from '@vercel/node';

interface Window {
    count: number;
    resetAt: number;
}

const windows = new Map<string, Window>();

/** Fixed-window counter. Returns true if the request is allowed. */
export async function allow(bucket: string, limit: number, windowSec: number): Promise<boolean> {
    try {
        const k = `rl:${bucket}`;
        const now = Date.now();
        if (windows.size > 1000) {
            for (const [key, w] of windows) if (w.resetAt <= now) windows.delete(key);
        }
        let w = windows.get(k);
        if (!w || w.resetAt <= now) {
            w = { count: 0, resetAt: now + windowSec * 1000 };
            windows.set(k, w);
        }
        w.count += 1;
        return w.count <= limit;
    } catch {
        return true; // never block real customers because the limiter itself failed
    }
}

export function clientIp(req: VercelRequest): string {
    const xf = req.headers['x-forwarded-for'];
    const first = Array.isArray(xf) ? xf[0] : xf;
    return (first ? String(first).split(',')[0].trim() : String(req.headers['x-real-ip'] ?? '').trim()) || 'unknown';
}
