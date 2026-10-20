/**
 * /api/settings/demo  (GET / POST)
 *   GET  -> { enabled }              PUBLIC (the buy page reads it)
 *   POST -> { success: true, enabled }   (super only)
 *   403 -> { error: 'Forbidden - super admin only' }   (ASCII hyphen -- byte-exact)
 *
 * Stored as the `demo` row of panel_settings: { enabled, updatedAt, updatedBy }.
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { bodyOf, json } from '../../_lib/server.js';
import { requireAuth } from '../../_lib/panel.js';
import { getDemoSettings, saveDemoSettings } from '../../_lib/panelStore.js';

async function get(_req: VercelRequest, res: VercelResponse): Promise<void> {
    const settings = await getDemoSettings();
    json(res, 200, { enabled: settings.enabled !== false });
}

async function post(req: VercelRequest, res: VercelResponse): Promise<void> {
    const gate = requireAuth(req);
    if (gate.error) {
        json(res, gate.status, { error: gate.error });
        return;
    }
    const session = gate.session;
    if (session.role !== 'super') {
        json(res, 403, { error: 'Forbidden - super admin only' });
        return;
    }

    const body = bodyOf(req);
    const settings = await saveDemoSettings({
        enabled: body.enabled === true,
        updatedAt: Math.floor(Date.now() / 1000),
        updatedBy: session.username,
    });
    json(res, 200, { success: true, enabled: settings.enabled });
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    try {
        if (req.method === 'GET') return await get(req, res);
        if (req.method === 'POST') return await post(req, res);
        json(res, 405, { error: 'method not allowed' });
    } catch (e) {
        // never leak key material or internals
        console.error('settings demo error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
