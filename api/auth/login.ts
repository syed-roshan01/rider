/**
 * POST /api/auth/login  { username, password }
 *   200 -> { token, username, role, name }
 *   400 -> { error: 'Username and password required' }
 *   401 -> { error: 'Invalid credentials' }
 *   500 -> { error: 'Server error' }
 *
 * PUBLIC. One login endpoint for all four account types; lookup order is
 * admin -> affiliate -> whitelabel (spec §1, strings verbatim). Lazy-seeds the
 * super admin from ADMIN_USERNAME/ADMIN_PASSWORD when no admins exist yet.
 * Tokens are JWT HS256 (node:crypto HMAC, no jose) -- see _lib/panel.ts; the
 * password hashes are scrypt$<salthex>$<hashhex> (bcryptjs is NOT used).
 */
import type { VercelRequest, VercelResponse } from '@vercel/node';
import { randomUUID } from 'node:crypto';
import { bodyOf, json } from '../_lib/server.js';
import { hashPassword, signToken, verifyPassword, type PanelRole } from '../_lib/panel.js';
import {
    getAdminByUsername,
    getAffiliateByUsername,
    getWhitelabelByUsername,
    listAdmins,
    saveAdmin,
    type AdminUserRecord,
    type AffiliateRecord,
    type WhitelabelRecord,
} from '../_lib/panelStore.js';

/** The three account shapes share id/username/passwordHash/active. */
type AnyAccount = AdminUserRecord | AffiliateRecord | WhitelabelRecord;

// Lazy-seed: creates super admin from env vars if no admins exist yet
async function ensureSuperAdmin(): Promise<void> {
    const existing = await listAdmins();
    if (existing.length === 0) {
        const username = (process.env.ADMIN_USERNAME || 'admin').toLowerCase();
        const pass = process.env.ADMIN_PASSWORD || 'changeme123';
        await saveAdmin({
            id: randomUUID(),
            username,
            passwordHash: hashPassword(pass),
            role: 'super',
            createdBy: null,
            createdByName: null,
            createdAt: Math.floor(Date.now() / 1000),
            active: true,
        });
    }
}

export default async function handler(req: VercelRequest, res: VercelResponse): Promise<void> {
    if (req.method !== 'POST') {
        json(res, 405, { error: 'method not allowed' });
        return;
    }
    try {
        const b = bodyOf(req);
        const username = b.username;
        const password = b.password;
        if (!username || !password) {
            json(res, 400, { error: 'Username and password required' });
            return;
        }

        await ensureSuperAdmin();

        // Try admin first, then affiliate, then whitelabel client
        let account: AnyAccount | null = await getAdminByUsername(String(username));
        let isAffiliate = false;
        let isWhitelabel = false;

        if (!account) {
            account = await getAffiliateByUsername(String(username));
            isAffiliate = !!account;
        }

        if (!account) {
            account = await getWhitelabelByUsername(String(username));
            isWhitelabel = !!account;
        }

        if (!account || !account.active) {
            json(res, 401, { error: 'Invalid credentials' });
            return;
        }

        const valid = verifyPassword(String(password), account.passwordHash);
        if (!valid) {
            json(res, 401, { error: 'Invalid credentials' });
            return;
        }

        const role: PanelRole = isAffiliate
            ? 'affiliate'
            : isWhitelabel
              ? 'whitelabel'
              : ((account as AdminUserRecord).role as PanelRole);
        const token = signToken({ sub: account.id, username: account.username, role });
        json(res, 200, { token, username: account.username, role, name: (account as { name?: string }).name || null });
    } catch (err) {
        console.error('Login error:', err);
        json(res, 500, { error: 'Server error' });
    }
}
