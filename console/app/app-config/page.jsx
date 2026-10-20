'use client';
import { useEffect, useState } from 'react';
import { useRouter } from 'next/navigation';
import AppLayout from '@/components/AppLayout';
import { apiFetch } from '@/lib/apiFetch';
import { useToast } from '@/components/Toast';

// App Config (super/admin only): runtime switches served to the AcceptPro app.
// GET  /api/admin/config -> AppConfig
// POST /api/admin/config -> merged AppConfig (only sent fields are changed)

const EMPTY_FORM = {
    maintenanceMode: false,
    maintenanceMessage: '',
    forceUpdateVersion: '',
    updateDownloadUrl: '',
    updatePageUrl: '',
    minAllowedFare: '',
    maxAllowedFare: '',
    versionBlocked: '',
    dialogMessage: '',
    dialogButtonText: '',
};

const fromConfig = (c) => ({
    maintenanceMode: !!c.maintenanceMode,
    maintenanceMessage: c.maintenanceMessage ?? '',
    forceUpdateVersion: c.forceUpdateVersion ?? '',
    updateDownloadUrl: c.updateDownloadUrl ?? '',
    updatePageUrl: c.updatePageUrl ?? '',
    minAllowedFare: c.minAllowedFare ?? '',
    maxAllowedFare: c.maxAllowedFare ?? '',
    versionBlocked: Array.isArray(c.versionBlocked) ? c.versionBlocked.join(', ') : '',
    dialogMessage: c.dialogMessage ?? '',
    dialogButtonText: c.dialogButtonText ?? '',
});

export default function AppConfigPage() {
    const router = useRouter();
    const toast = useToast();
    const [user, setUser]     = useState(null);
    const [form, setForm]     = useState(EMPTY_FORM);
    const [loading, setLoading] = useState(true);
    const [busy, setBusy]     = useState(false);
    const [err, setErr]       = useState('');
    const [dirty, setDirty]   = useState(false);

    useEffect(() => {
        try {
            const raw = localStorage.getItem('acceptpro_admin_user');
            if (raw) {
                const u = JSON.parse(raw);
                setUser(u);
                if (u.role !== 'super' && u.role !== 'admin') { router.replace('/dashboard'); return; }
            }
        } catch {}
        load();
    }, []);

    const load = async () => {
        setLoading(true);
        const r = await apiFetch('/api/admin/config');
        if (r?.ok && r.data) {
            setForm(fromConfig(r.data));
            setDirty(false);
        } else if (r) {
            toast.error(r.data?.error || 'Failed to load app config');
        }
        setLoading(false);
    };

    const set = (k) => (e) => {
        const v = e.target.type === 'checkbox' ? e.target.checked : e.target.value;
        setForm(f => ({ ...f, [k]: v }));
        setDirty(true);
    };

    const save = async (e) => {
        e.preventDefault();
        setBusy(true);
        setErr('');
        const body = {
            maintenanceMode: !!form.maintenanceMode,
            maintenanceMessage: String(form.maintenanceMessage ?? ''),
            forceUpdateVersion: Math.max(0, Number(form.forceUpdateVersion) || 0),
            updateDownloadUrl: String(form.updateDownloadUrl ?? ''),
            updatePageUrl: String(form.updatePageUrl ?? ''),
            minAllowedFare: Math.max(0, Number(form.minAllowedFare) || 0),
            maxAllowedFare: Math.max(0, Number(form.maxAllowedFare) || 0),
            versionBlocked: String(form.versionBlocked ?? '')
                .split(/[,\n]/)
                .map(s => s.trim())
                .filter(Boolean),
            dialogMessage: String(form.dialogMessage ?? ''),
            dialogButtonText: String(form.dialogButtonText ?? ''),
        };
        const r = await apiFetch('/api/admin/config', { method: 'POST', body });
        if (r?.ok && r.data) {
            setForm(fromConfig(r.data));
            setDirty(false);
            toast.success('App config saved');
        } else {
            const msg = r?.data?.error || 'Failed to save app config';
            setErr(msg);
            toast.error(msg);
        }
        setBusy(false);
    };

    return (
        <AppLayout>
            <div className="page">
                <div className="page-header">
                    <div>
                        <div className="page-title">App Config</div>
                        <div className="page-subtitle">Runtime switches for the AcceptPro app</div>
                    </div>
                    <div style={{ display: 'flex', gap: 8, alignItems: 'center' }}>
                        <button className="btn btn-ghost" onClick={load} disabled={loading}>Reload</button>
                    </div>
                </div>

                <div className="page-body">
                    {loading ? (
                        <div className="card" style={{ maxWidth: 720 }}>
                            <div className="skeleton" style={{ width: '38%', height: 11, marginBottom: 14 }} />
                            <div className="skeleton" style={{ width: '70%', height: 26, marginBottom: 10 }} />
                            <div className="skeleton" style={{ width: '55%', height: 11 }} />
                        </div>
                    ) : (
                    <form onSubmit={save} style={{ maxWidth: 720 }}>
                        <div className="card db-in">
                            <div className="form-section">
                                <div className="form-section-title">Maintenance</div>
                                <div className="form-group">
                                    <label style={{ display: 'flex', alignItems: 'center', gap: 8, fontSize: 13, color: '#c9d2e8', cursor: 'pointer' }}>
                                        <input
                                            type="checkbox"
                                            checked={form.maintenanceMode}
                                            onChange={set('maintenanceMode')}
                                            style={{ accentColor: '#7c3aed', width: 14, height: 14 }}
                                        />
                                        Maintenance mode (block the app for all users)
                                    </label>
                                </div>
                                <div className="form-group" style={{ marginTop: 10 }}>
                                    <label className="form-label">Maintenance Message</label>
                                    <textarea
                                        className="form-textarea"
                                        value={form.maintenanceMessage}
                                        onChange={set('maintenanceMessage')}
                                        placeholder="App is under maintenance. Please try again later."
                                    />
                                </div>
                            </div>

                            <div className="form-section">
                                <div className="form-section-title">Forced Update</div>
                                <div className="form-row">
                                    <div className="form-group">
                                        <label className="form-label">Force Update Version</label>
                                        <input
                                            className="form-input" type="number" min="0" step="1"
                                            value={form.forceUpdateVersion}
                                            onChange={set('forceUpdateVersion')}
                                            placeholder="e.g. 12"
                                        />
                                        <span style={{ fontSize: 11, color: '#3a4560' }}>App builds below this version are forced to update.</span>
                                    </div>
                                    <div className="form-group">
                                        <label className="form-label">Update Page URL</label>
                                        <input
                                            className="form-input" value={form.updatePageUrl}
                                            onChange={set('updatePageUrl')}
                                            placeholder="https://…/update"
                                        />
                                    </div>
                                </div>
                                <div className="form-group">
                                    <label className="form-label">Update Download URL</label>
                                    <input
                                        className="form-input" value={form.updateDownloadUrl}
                                        onChange={set('updateDownloadUrl')}
                                        placeholder="https://…/app.apk"
                                    />
                                </div>
                            </div>

                            <div className="form-section">
                                <div className="form-section-title">Fare Limits</div>
                                <div className="form-row">
                                    <div className="form-group">
                                        <label className="form-label">Min Allowed Fare</label>
                                        <input
                                            className="form-input" type="number" min="0" step="1"
                                            value={form.minAllowedFare}
                                            onChange={set('minAllowedFare')}
                                        />
                                    </div>
                                    <div className="form-group">
                                        <label className="form-label">Max Allowed Fare</label>
                                        <input
                                            className="form-input" type="number" min="0" step="1"
                                            value={form.maxAllowedFare}
                                            onChange={set('maxAllowedFare')}
                                        />
                                    </div>
                                </div>
                            </div>

                            <div className="form-section">
                                <div className="form-section-title">Version Blocklist</div>
                                <div className="form-group">
                                    <label className="form-label">Blocked Versions</label>
                                    <input
                                        className="form-input" value={form.versionBlocked}
                                        onChange={set('versionBlocked')}
                                        placeholder="1.0.3, 1.0.4"
                                    />
                                    <span style={{ fontSize: 11, color: '#3a4560' }}>Comma or newline separated. Blocked versions cannot run the app.</span>
                                </div>
                            </div>

                            <div className="form-section">
                                <div className="form-section-title">In-App Dialog</div>
                                <div className="form-group">
                                    <label className="form-label">Dialog Message</label>
                                    <textarea
                                        className="form-textarea"
                                        value={form.dialogMessage}
                                        onChange={set('dialogMessage')}
                                        placeholder="Leave blank to show no dialog"
                                    />
                                </div>
                                <div className="form-group">
                                    <label className="form-label">Dialog Button Text</label>
                                    <input
                                        className="form-input" value={form.dialogButtonText}
                                        onChange={set('dialogButtonText')}
                                        placeholder="OK"
                                    />
                                </div>
                            </div>

                            {err && <div className="form-error" style={{ marginTop: 14 }}>{err}</div>}
                        </div>

                        <div style={{ display: 'flex', gap: 10, justifyContent: 'flex-end', marginTop: 16 }}>
                            <button type="button" className="btn btn-ghost" onClick={load} disabled={busy || !dirty}>
                                Discard
                            </button>
                            <button type="submit" className="btn btn-primary" disabled={busy || !dirty}>
                                {busy ? 'Saving…' : 'Save Changes'}
                            </button>
                        </div>
                    </form>
                    )}
                </div>
            </div>
        </AppLayout>
    );
}
