/**
 * /api/logs  (GET / DELETE)
 *   GET    -> [ the 300 newest log rows, newest first ]
 *   DELETE -> { success: true }
 *
 * SUPER only. The store keeps at most the 1000 most-recent rows (trimmed on
 * every save, mirroring the KV list's ltrim).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { json } from '../_lib/server.js';
import { requireSuper } from '../_lib/panel.js';
import { clearLogs, listLogs } from '../_lib/panelStore.js';

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    try {
        const gate = requireSuper(req);
        if (gate.error) {
            json(res, gate.status, { error: gate.error });
            return;
        }

        if (req.method === 'GET') {
            const logs = await listLogs(300);
            json(res, 200, logs);
            return;
        }
        if (req.method === 'DELETE') {
            await clearLogs();
            json(res, 200, { success: true });
            return;
        }
        json(res, 405, { error: 'method not allowed' });
    } catch (e) {
        // never leak key material or internals
        console.error('logs error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
