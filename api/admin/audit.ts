/**
 * GET  /api/admin/audit?limit=300 -> rows (AuditEntry[]: { id, at, actor, action, detail })
 *
 * store.audit() returns the newest entries first. The audit_log timestamp
 * column name is not pinned anywhere in this repo (the Edge helper inserts only
 * actor/action/detail), so ordering is probed across likely names and the rows
 * are normalised to the store's `at` epoch-ms field.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import type { AuditEntry, DbRow } from '../_lib/server.ts';
import { intParam, json, requireAdmin, sbRows, toMs } from '../_lib/server.ts';

const TIME_COLUMNS = ['at', 'created_at', 'ts', 'timestamp', 'logged_at'];

function toAuditEntry(r: DbRow, at: number): AuditEntry {
    return {
        id: String(r.id ?? ''),
        at,
        actor: String(r.actor ?? ''),
        action: String(r.action ?? ''),
        detail: String(r.detail ?? ''),
    };
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'GET') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        if (!requireAdmin(req, res)) return;

        const limit = Math.max(0, intParam(req.query.limit ?? 200, 200));

        // Prefer an ordered fetch so `limit` really takes the newest rows.
        let rows: DbRow[] = [];
        for (const col of TIME_COLUMNS) {
            try {
                rows = await sbRows(
                    `/audit_log?select=*&order=${col}.desc.nullslast&limit=${Math.max(limit, 1)}`,
                );
                break;
            } catch {
                /* try the next candidate column */
            }
        }

        const entries = rows.map((r) => {
            let at = 0;
            for (const col of TIME_COLUMNS) {
                if (r[col] != null) {
                    at = toMs(r[col]);
                    break;
                }
            }
            return toAuditEntry(r, at);
        });
        entries.sort((a, b) => b.at - a.at);

        json(res, 200, entries.slice(0, limit));
    } catch (e) {
        console.error('admin audit error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
