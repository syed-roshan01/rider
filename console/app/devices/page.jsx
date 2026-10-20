'use client';
import { useEffect, useMemo, useState } from 'react';
import { useRouter } from 'next/navigation';
import AppLayout from '@/components/AppLayout';
import { apiFetch } from '@/lib/apiFetch';
import Modal from '@/components/Modal';
import { TableSkeleton } from '@/components/Skeleton';
import { useToast } from '@/components/Toast';

// Devices bound to AcceptPro licenses (super/admin only). The rows come from
// GET /api/admin/devices (DeviceRecord[], newest first) and a device slot is
// freed with DELETE /api/admin/devices/{hwidHash} — the same surface the app
// engine uses, addressed by the hashed device code.

function fmtDateTime(ts) {
    if (!ts) return '—';
    return new Date(ts).toLocaleString('en-IN', {
        day: '2-digit', month: 'short', year: 'numeric',
        hour: '2-digit', minute: '2-digit',
    });
}

export default function DevicesPage() {
    const router = useRouter();
    const toast = useToast();
    const [user, setUser]       = useState(null);
    const [devices, setDevices] = useState([]);
    const [loading, setLoading] = useState(true);
    const [search, setSearch]   = useState('');
    const [copied, setCopied]   = useState('');
    const [showUnbind, setShowUnbind] = useState(null); // DeviceRecord
    const [unbindBusy, setUnbindBusy] = useState(false);
    const [unbindErr, setUnbindErr]   = useState('');

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
        const r = await apiFetch('/api/admin/devices');
        if (r?.ok && Array.isArray(r.data)) setDevices(r.data);
        else { setDevices([]); if (r) toast.error(r.data?.error || 'Failed to load devices'); }
        setLoading(false);
    };

    const copyText = (text) => {
        navigator.clipboard.writeText(text);
        setCopied(text);
        setTimeout(() => setCopied(''), 1800);
    };

    const filtered = useMemo(() => {
        const q = search.trim().toLowerCase();
        if (!q) return devices;
        return devices.filter(d =>
            d.hwidHash?.toLowerCase().includes(q) ||
            d.keyHash?.toLowerCase().includes(q) ||
            d.model?.toLowerCase().includes(q) ||
            d.brand?.toLowerCase().includes(q) ||
            d.appVersion?.toLowerCase().includes(q)
        );
    }, [devices, search]);

    const keyCount = useMemo(() => new Set(devices.map(d => d.keyHash).filter(Boolean)).size, [devices]);

    const unbind = async () => {
        setUnbindBusy(true);
        setUnbindErr('');
        const r = await apiFetch(`/api/admin/devices/${showUnbind.hwidHash}`, { method: 'DELETE' });
        if (r?.ok && r.data?.ok) {
            setShowUnbind(null);
            toast.success('Device unbound');
            load();
        } else {
            const msg = r?.data?.error || (r ? 'Device was not unbound' : 'Failed to unbind');
            setUnbindErr(msg);
            toast.error(msg);
        }
        setUnbindBusy(false);
    };

    return (
        <AppLayout>
            <div className="page">
                <div className="page-header">
                    <div>
                        <div className="page-title">Devices</div>
                        <div className="page-subtitle">Devices bound to AcceptPro licenses</div>
                    </div>
                    <div style={{ display: 'flex', gap: 8, alignItems: 'center' }}>
                        <button className="btn btn-ghost" onClick={load} disabled={loading}>Refresh</button>
                    </div>
                </div>

                <div className="page-body">
                    {/* Quiet stat row */}
                    <div className="lic-stats db-in">
                        <div className="lic-stat">
                            <div className="lic-stat-num">{devices.length}</div>
                            <div className="lic-stat-lab">Bound devices</div>
                        </div>
                        <div className="lic-stat-sep" />
                        <div className="lic-stat">
                            <div className="lic-stat-num">{keyCount}</div>
                            <div className="lic-stat-lab">Licenses in use</div>
                        </div>
                        <div className="lic-stat-sep" />
                        <div className="lic-stat">
                            <div className="lic-stat-num" style={{ color: search ? 'var(--accent-light)' : undefined }}>{filtered.length}</div>
                            <div className="lic-stat-lab">Shown</div>
                        </div>
                    </div>

                    {/* Toolbar */}
                    <div className="lic-toolbar db-in">
                        <div className="search-bar" style={{ marginBottom: 0, flex: 1 }}>
                            <input
                                className="form-input search-input"
                                style={{ maxWidth: 'none' }}
                                placeholder="Search device hash, key hash, model or brand"
                                value={search}
                                onChange={e => setSearch(e.target.value)}
                            />
                            {search && (
                                <button className="btn btn-ghost btn-sm" onClick={() => setSearch('')}>Clear</button>
                            )}
                        </div>
                    </div>

                    {loading ? (
                        <TableSkeleton rows={6} />
                    ) : filtered.length === 0 ? (
                        <div className="lic-empty db-in">
                            <div className="lic-empty-title">
                                {devices.length === 0 ? 'No devices bound yet' : 'No results'}
                            </div>
                            <div className="lic-empty-sub">
                                {devices.length === 0
                                    ? 'Devices appear here when a license is activated on a device.'
                                    : 'Try a different search.'}
                            </div>
                            {devices.length > 0 && search && (
                                <button className="btn btn-ghost btn-sm" onClick={() => setSearch('')}>
                                    Clear filters
                                </button>
                            )}
                        </div>
                    ) : (
                    <div className="table-wrap">
                        <table className="devices-table">
                            <thead>
                                <tr>
                                    <th>Device</th>
                                    <th>License Key</th>
                                    <th>App</th>
                                    <th>Integrity</th>
                                    <th>Activated</th>
                                    <th>Last Seen</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                {filtered.map(d => (
                                    <tr key={`${d.hwidHash}-${d.keyHash}`}>
                                        <td>
                                            <button
                                                className="lic-key"
                                                title="Copy device hash"
                                                onClick={() => copyText(d.hwidHash)}
                                            >
                                                {copied === d.hwidHash ? 'Copied' : `${(d.hwidHash || '').slice(0, 16)}…`}
                                            </button>
                                            {(d.model || d.brand) && (
                                                <div className="lic-sub">{[d.brand, d.model].filter(Boolean).join(' ')}</div>
                                            )}
                                        </td>
                                        <td>
                                            <button
                                                className="lic-key"
                                                title="Copy key hash"
                                                onClick={() => copyText(d.keyHash)}
                                            >
                                                {copied === d.keyHash ? 'Copied' : `${(d.keyHash || '').slice(0, 16)}…`}
                                            </button>
                                        </td>
                                        <td><span className="lic-tag">{d.appVersion || '—'}</span></td>
                                        <td>
                                            <span className="lic-tag" style={d.integrity && d.integrity !== 'pass' && d.integrity !== 'ok'
                                                ? { color: 'var(--amber)', borderColor: 'rgba(245,158,11,.3)' }
                                                : undefined}>
                                                {d.integrity || '—'}
                                            </span>
                                        </td>
                                        <td><div className="lic-sub" style={{ color: 'var(--text-dim)' }}>{fmtDateTime(d.activatedAt)}</div></td>
                                        <td><div className="lic-sub" style={{ color: 'var(--text-dim)' }}>{fmtDateTime(d.lastSeenAt)}</div></td>
                                        <td>
                                            <div style={{ display: 'flex', gap: 6 }}>
                                                <button
                                                    className="btn btn-ghost btn-sm lic-danger"
                                                    onClick={() => { setShowUnbind(d); setUnbindErr(''); }}
                                                >
                                                    Unbind
                                                </button>
                                            </div>
                                        </td>
                                    </tr>
                                ))}
                            </tbody>
                        </table>
                    </div>
                    )}
                </div>
            </div>

            {/* ── Unbind Modal ──────────────────────────────────────────── */}
            {showUnbind && (
                <Modal title="Unbind Device" onClose={() => setShowUnbind(null)} maxWidth={440} busy={unbindBusy}>
                    <div className="modal-body">
                        <div style={{ color: '#94a3b8', fontSize: 13 }}>
                            This frees the device slot immediately. The app on that device must
                            activate again (or activate on another key) before it can run.
                        </div>
                        <div style={{ fontFamily: 'Courier New, monospace', fontSize: 11, color: '#64748b', background: 'rgba(255,255,255,.03)', borderRadius: 7, padding: '8px 12px', wordBreak: 'break-all' }}>
                            {showUnbind.hwidHash}
                        </div>
                        <div style={{ fontSize: 12, color: '#4a5980' }}>
                            {[showUnbind.brand, showUnbind.model].filter(Boolean).join(' ') || 'Unknown device'}
                            {showUnbind.appVersion ? ` · app ${showUnbind.appVersion}` : ''}
                        </div>
                        {unbindErr && <div className="form-error">{unbindErr}</div>}
                    </div>
                    <div className="modal-footer">
                        <button className="btn btn-ghost" onClick={() => setShowUnbind(null)} disabled={unbindBusy}>Cancel</button>
                        <button className="btn btn-danger" onClick={unbind} disabled={unbindBusy}>
                            {unbindBusy ? 'Unbinding…' : 'Confirm Unbind'}
                        </button>
                    </div>
                </Modal>
            )}
        </AppLayout>
    );
}
