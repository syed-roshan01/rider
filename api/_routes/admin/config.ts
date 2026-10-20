/**
 * GET  /api/admin/config -> store.getConfig() shape (AppConfig)
 * POST /api/admin/config -> store.setConfig() shape (merged AppConfig)
 *
 * Field sanitisation is copied verbatim from license/src/server.ts; the merge
 * and the `config.update` audit line mirror store.setConfig().
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import type { AppConfig, DbRow } from '../../_lib/server.js';
import {
    DEFAULT_CONFIG,
    audit,
    bodyOf,
    json,
    requireAdmin,
    sb,
    sbRows,
} from '../../_lib/server.js';

function toConfig(r: DbRow | null): AppConfig {
    const d = DEFAULT_CONFIG;
    const v = (k: string, fallback: unknown): unknown => (r && r[k] != null ? r[k] : fallback);
    const blocked = r ? r.version_blocked : null;
    return {
        maintenanceMode: Boolean(v('maintenance_mode', d.maintenanceMode)),
        maintenanceMessage: String(v('maintenance_message', d.maintenanceMessage)),
        forceUpdateVersion: Number(v('force_update_version', d.forceUpdateVersion)),
        updateDownloadUrl: String(v('update_download_url', d.updateDownloadUrl)),
        updatePageUrl: String(v('update_page_url', d.updatePageUrl)),
        minAllowedFare: Number(v('min_allowed_fare', d.minAllowedFare)),
        maxAllowedFare: Number(v('max_allowed_fare', d.maxAllowedFare)),
        versionBlocked: Array.isArray(blocked) ? blocked.map(String) : [...d.versionBlocked],
        dialogMessage: String(v('dialog_message', d.dialogMessage)),
        dialogButtonText: String(v('dialog_button_text', d.dialogButtonText)),
    };
}

function toRow(c: AppConfig): DbRow {
    return {
        id: 1,
        maintenance_mode: c.maintenanceMode,
        maintenance_message: c.maintenanceMessage,
        force_update_version: c.forceUpdateVersion,
        update_download_url: c.updateDownloadUrl,
        update_page_url: c.updatePageUrl,
        min_allowed_fare: c.minAllowedFare,
        max_allowed_fare: c.maxAllowedFare,
        version_blocked: c.versionBlocked,
        dialog_message: c.dialogMessage,
        dialog_button_text: c.dialogButtonText,
    };
}

async function current(): Promise<AppConfig> {
    const rows = await sbRows('/app_config?select=*&id=eq.1');
    return toConfig(rows[0] ?? null);
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    try {
        if (!requireAdmin(req, res)) return;

        if (req.method === 'GET') {
            json(res, 200, await current());
            return;
        }

        if (req.method === 'POST') {
            // sanitisation copied from license/src/server.ts
            const b = bodyOf(req);
            const clean: Partial<AppConfig> = {};
            if (typeof b.maintenanceMode === 'boolean') clean.maintenanceMode = b.maintenanceMode;
            if (typeof b.maintenanceMessage === 'string')
                clean.maintenanceMessage = b.maintenanceMessage.slice(0, 500);
            if (typeof b.forceUpdateVersion === 'number')
                clean.forceUpdateVersion = Math.max(0, b.forceUpdateVersion | 0);
            if (typeof b.updateDownloadUrl === 'string')
                clean.updateDownloadUrl = b.updateDownloadUrl.slice(0, 500);
            if (typeof b.updatePageUrl === 'string')
                clean.updatePageUrl = b.updatePageUrl.slice(0, 500);
            if (typeof b.minAllowedFare === 'number')
                clean.minAllowedFare = Math.max(0, b.minAllowedFare | 0);
            if (typeof b.maxAllowedFare === 'number')
                clean.maxAllowedFare = Math.max(0, b.maxAllowedFare | 0);
            if (typeof b.dialogMessage === 'string')
                clean.dialogMessage = b.dialogMessage.slice(0, 500);
            if (typeof b.dialogButtonText === 'string')
                clean.dialogButtonText = b.dialogButtonText.slice(0, 50);
            if (Array.isArray(b.versionBlocked))
                clean.versionBlocked = b.versionBlocked.slice(0, 100).map(String);

            const merged: AppConfig = { ...(await current()), ...clean };

            // upsert the single config row (id = 1)
            const res2 = await sb('POST', '/app_config?on_conflict=id', toRow(merged), {
                prefer: 'resolution=merge-duplicates',
            });
            if (!res2.ok) throw new Error('config write failed');

            await audit('admin', 'config.update', JSON.stringify(clean));
            json(res, 200, merged);
            return;
        }

        json(res, 405, { error: 'method not allowed' });
    } catch (e) {
        console.error('admin config error:', (e as Error).name);
        json(res, 500, { error: 'internal error' });
    }
}
