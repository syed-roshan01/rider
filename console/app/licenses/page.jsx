'use client';
import { useEffect, useState } from 'react';
import AppLayout from '@/components/AppLayout';
import { apiFetch } from '@/lib/apiFetch';
import { hashKey } from '@/lib/keyHash';
import Modal from '@/components/Modal';
import { TableSkeleton } from '@/components/Skeleton';
import { useToast } from '@/components/Toast';

const PLANS = [
    { value: 'trial1day', label: 'Trial (1 day)'         },
    { value: 'trial',    label: 'Trial (3 days)'         },
    { value: 'weekly',   label: 'Weekly (7 days)'        },
    { value: 'monthly',  label: 'Monthly (30 days)'      },
    { value: '3months',  label: '3 Months (90 days)'     },
    { value: '6months',  label: '6 Months (180 days)'    },
    { value: 'yearly',   label: 'Yearly (365 days)'      },
    { value: 'lifetime', label: 'Lifetime'               },
    { value: 'custom',   label: 'Custom days'            },
];

const FEATURE_OPTIONS = [
    { key: 'mobile',       label: 'Open on Mobile',    sub: 'Cloudflare tunnel'        },
    { key: 'trustBuilder', label: 'Trust Builder',     sub: 'Account warming'          },
    { key: 'autoReply',    label: 'Auto Reply',        sub: 'Auto responses'           },
    { key: 'chatbot',      label: 'Chatbot Flows',     sub: 'Flow builder'             },
    { key: 'liveChat',     label: 'Live Chat',         sub: 'Real-time chat'           },
    { key: 'groupGrabber', label: 'Group Grabber',     sub: 'Extract groups'           },
    { key: 'aiAutomation', label: 'AI Automation',     sub: 'AI-powered actions'       },
    { key: 'forms',        label: 'Interactive Forms', sub: 'Conversational data forms' },
];

const DEFAULT_FEATURES = { mobile: true, trustBuilder: true, autoReply: true, chatbot: true, liveChat: true, groupGrabber: true, aiAutomation: true, forms: true };

// Generate form (Accepter app): Machine ID + plan/duration ONLY. The key is
// always an `app` licence bound to that one device, with no feature flags,
// no device-limit input and no client/business details.
const DEFAULT_FORM = {
    machineId: '', plan: 'monthly', customDays: '',
};

// Whitelabel resellers — label + color for each allowed license type
const WL_MODE_META = {
    desktop: { label: 'PC / Desktop', background: 'rgba(139,146,176,.15)', color: '#8b93b0' },
    cloud:   { label: 'Cloud',        background: 'rgba(37,211,102,.15)',  color: '#25D366' },
    app:     { label: 'Android App',  background: 'rgba(74,158,255,.15)',  color: '#4a9eff' },
};

// Key durations a whitelabel reseller may be granted (mirrors
// WL_PLANS in lib/license.js — kept local because that module is
// server-only).
const WL_ALL_PLANS = ['monthly', '3months', '6months', 'yearly', 'custom'];

const PAGE_SIZE = 25;

function fmtDate(ts) {
    if (!ts) return '—';
    return new Date(ts * 1000).toLocaleDateString('en-IN', { day: '2-digit', month: 'short', year: 'numeric' });
}

function toAmountNumber(v) {
    const raw = String(v ?? '').trim();
    if (!raw) return 0;

    const normalized = raw.replace(/,/g, '');
    const num = Number(normalized);
    if (Number.isFinite(num)) return num;

    const fallback = parseFloat(normalized.replace(/[^0-9.-]/g, ''));
    return Number.isFinite(fallback) ? fallback : 0;
}

function amountPlain(v) {
    const n = toAmountNumber(v);
    if (!Number.isFinite(n)) return '0';

    // Use fullwide conversion first to avoid exponent notation for very large values.
    let plain = n.toLocaleString('fullwide', {
        useGrouping: false,
        maximumFractionDigits: 20,
    });

    if (plain.includes('e') || plain.includes('E')) {
        plain = Number(n).toFixed(2);
    }

    if (plain.includes('.')) {
        plain = plain.replace(/\.0+$/, '').replace(/(\.\d*?)0+$/, '$1');
    }
    return plain;
}

function fmtMoney(v) {
    const amount = Number(amountPlain(v));
    const formatted = new Intl.NumberFormat('en-IN', {
        minimumFractionDigits: 0,
        maximumFractionDigits: 2,
        notation: 'standard',
        useGrouping: true,
    }).format(amount);
    return `INR ${formatted}`;
}

async function loadImageAsDataUrl(path) {
    const res = await fetch(path);
    if (!res.ok) return null;
    const blob = await res.blob();
    return new Promise((resolve) => {
        const reader = new FileReader();
        reader.onloadend = () => resolve(reader.result);
        reader.readAsDataURL(blob);
    });
}

function getDaysLeft(l) {
    if (l.isLifetime) return null;
    return Math.floor((l.expiryTs - Math.floor(Date.now() / 1000)) / 86400);
}

function csvEscape(value) {
    const s = String(value ?? '');
    if (s.includes('"') || s.includes(',') || s.includes('\n')) {
        return `"${s.replace(/"/g, '""')}"`;
    }
    return s;
}

function getLicenseStatus(l, nowTs) {
    if (l.revoked) return 'Revoked';
    if (!l.isLifetime && (l.expiryTs || 0) <= nowTs) return 'Expired';
    return 'Active';
}

export default function LicensesPage() {
    const [user,     setUser]     = useState(null);
    const [licenses, setLicenses] = useState([]);
    const [loading,  setLoading]  = useState(true);
    const [search,   setSearch]   = useState('');
    const [typeFilter, setTypeFilter] = useState('all');
    const [statusFilter, setStatusFilter] = useState('all');
    const [page,     setPage]     = useState(1);
    const toast = useToast();
    const [showGen,  setShowGen]  = useState(false);
    const [form,     setForm]     = useState(DEFAULT_FORM);
    const [genBusy,  setGenBusy]  = useState(false);
    const [genErr,   setGenErr]   = useState('');
    const [genKey,   setGenKey]   = useState('');
    const [generatedLicense, setGeneratedLicense] = useState(null);
    const [invoiceBusy, setInvoiceBusy] = useState(false);
    const [showRev,  setShowRev]  = useState(null); // key to revoke
    const [revReason,setRevReason]= useState('');
    const [revErr,   setRevErr]   = useState('');
    const [revBusy,  setRevBusy]  = useState(false);
    const [copied,   setCopied]   = useState('');
    const [showDel,  setShowDel]  = useState(null); // { key, clientName }
    const [delErr,   setDelErr]   = useState('');
    const [delBusy,  setDelBusy]  = useState(false);
    const [showDetail,setShowDetail]= useState(null);   // license object
    const [showEdit,  setShowEdit]  = useState(null);   // license object
    const [editForm,  setEditForm]  = useState({ clientName: '', clientPhone: '', clientEmail: '', price: '', notes: '', affiliateId: '', affiliateName: '', features: { ...DEFAULT_FEATURES } });
    const [editBusy,  setEditBusy]  = useState(false);
    const [editErr,   setEditErr]   = useState('');
    const [exportFormat, setExportFormat] = useState('csv');
    const [exportBusy, setExportBusy] = useState(false);
    const [affiliates, setAffiliates] = useState([]);
    // Live whitelabel record (allowed types + quota) for reseller accounts
    const [wlInfo, setWlInfo] = useState(null);

    // Admin engine actions — /api/admin/licenses/{keyHash}/{action} (super/admin)
    const [showExt, setShowExt]     = useState(null); // { key, clientName }
    const [extDays, setExtDays]     = useState('30');
    const [extErr, setExtErr]       = useState('');
    const [extBusy, setExtBusy]     = useState(false);
    const [showReveal, setShowReveal] = useState(null); // { key, clientName }
    const [revealKey, setRevealKey] = useState('');     // '' = loading, else plaintext
    const [revealErr, setRevealErr] = useState('');
    const [showUnrev, setShowUnrev] = useState(null);   // { key, clientName }
    const [unrevBusy, setUnrevBusy] = useState(false);
    const [unrevErr, setUnrevErr]   = useState('');
    const [showMaxDev, setShowMaxDev] = useState(null); // { key, clientName, current }
    const [maxDevVal, setMaxDevVal] = useState('');
    const [maxDevErr, setMaxDevErr] = useState('');
    const [maxDevBusy, setMaxDevBusy] = useState(false);
    // "AcceptPro binding" block of the detail modal (engine-side record)
    const [binding, setBinding] = useState(null); // { status, record, devices }

    // Convert trial → paid
    const [showConvert, setShowConvert] = useState(null); // original license object
    const [convertForm, setConvertForm] = useState({ plan: 'monthly', deviceLimit: '1', customDays: '', price: '', discountedPrice: '', notes: '', features: { ...DEFAULT_FEATURES } });
    const [convertBusy, setConvertBusy] = useState(false);
    const [convertErr, setConvertErr] = useState('');
    const [convertedKey, setConvertedKey] = useState('');
    const [convertedLicense, setConvertedLicense] = useState(null);

    const load = async () => {
        setLoading(true);
        const r = await apiFetch('/api/licenses/list');
        if (r?.ok) setLicenses(r.data);
        setLoading(false);
    };

    useEffect(() => {
        let u = null;
        try { const raw = localStorage.getItem('acceptpro_admin_user'); if (raw) u = JSON.parse(raw); } catch {}
        setUser(u);
        load();
        // Whitelabel resellers have no affiliates module
        if (u?.role !== 'whitelabel') {
            apiFetch('/api/affiliates/list').then(r => { if (r?.ok) setAffiliates(r.data || []); });
        }
    }, []);

    // Whitelabel resellers: keep quota + allowed license types LIVE. The super
    // admin can change them at any moment; polling /api/auth/me every 10s
    // reflects those changes here without the client re-logging in, and the
    // server enforces the live record on every generate call regardless.
    const refreshWhitelabel = async () => {
        const r = await apiFetch('/api/auth/me');
        if (r?.ok) setWlInfo(r.data);
    };

    // ── AcceptPro engine actions (super/admin) ─────────────────────────────
    // /api/admin/licenses routes by the engine key hash (sha256 of the
    // normalized key), so the hash is derived client-side from the row key.
    const adminAction = async (key, action, body) => {
        let hash;
        try {
            hash = await hashKey(key);
        } catch {
            return { ok: false, status: 0, data: { error: 'Key is not an AcceptPro engine key' } };
        }
        return apiFetch(`/api/admin/licenses/${hash}/${action}`, { method: 'POST', body: body || {} });
    };

    const openReveal = async (l) => {
        setShowReveal({ key: l.key, clientName: l.clientName });
        setRevealKey('');
        setRevealErr('');
        const r = await adminAction(l.key, 'reveal');
        if (r?.ok && r.data?.key) setRevealKey(r.data.key);
        else setRevealErr(r?.data?.error || 'Failed to reveal key');
    };

    const extendLicense = async () => {
        setExtBusy(true);
        setExtErr('');
        const days = Math.floor(Number(extDays));
        if (!Number.isFinite(days) || days < 1 || days > 3650) {
            setExtErr('Days must be between 1 and 3650');
            setExtBusy(false);
            return;
        }
        const r = await adminAction(showExt.key, 'extend', { days });
        if (r?.ok) {
            setShowExt(null);
            toast.success(`License extended by ${days} day${days !== 1 ? 's' : ''}`);
            load();
        } else {
            const msg = r?.data?.error || 'Failed to extend license';
            setExtErr(msg);
            toast.error(msg);
        }
        setExtBusy(false);
    };

    const unrevokeLicense = async () => {
        setUnrevBusy(true);
        setUnrevErr('');
        const r = await adminAction(showUnrev.key, 'unrevoke');
        if (r?.ok) {
            setShowUnrev(null);
            toast.success('License unrevoked');
            load();
        } else {
            const msg = r?.data?.error || 'Failed to unrevoke license';
            setUnrevErr(msg);
            toast.error(msg);
        }
        setUnrevBusy(false);
    };

    const setMaxDevices = async () => {
        setMaxDevBusy(true);
        setMaxDevErr('');
        const n = Math.floor(Number(maxDevVal));
        if (!Number.isFinite(n) || n < 1 || n > 255) {
            setMaxDevErr('Max devices must be between 1 and 255');
            setMaxDevBusy(false);
            return;
        }
        const r = await adminAction(showMaxDev.key, 'max-devices', { maxDevices: n });
        if (r?.ok) {
            setShowMaxDev(null);
            toast.success(`Max devices set to ${n}`);
            load();
        } else {
            const msg = r?.data?.error || 'Failed to set max devices';
            setMaxDevErr(msg);
            toast.error(msg);
        }
        setMaxDevBusy(false);
    };

    // "AcceptPro binding" block: engine status, activation date, engine
    // expiry and the bound device code hashes for the open detail modal.
    useEffect(() => {
        if (!showDetail || !(user?.role === 'super' || user?.role === 'admin')) {
            setBinding(null);
            return;
        }
        let stopped = false;
        setBinding({ status: 'loading', record: null, devices: [] });
        (async () => {
            try {
                const hash = await hashKey(showDetail.key);
                const [lic, dev] = await Promise.all([
                    apiFetch(`/api/admin/licenses?q=${encodeURIComponent(showDetail.key)}`),
                    apiFetch(`/api/admin/devices?keyHash=${hash}`),
                ]);
                if (stopped) return;
                const rows = lic?.ok && Array.isArray(lic.data?.rows) ? lic.data.rows : [];
                const record = rows.find(r => r.keyHash === hash) || rows[0] || null;
                const devices = dev?.ok && Array.isArray(dev.data) ? dev.data : [];
                setBinding({ status: record ? 'ok' : 'err', record, devices });
            } catch {
                if (!stopped) setBinding({ status: 'err', record: null, devices: [] });
            }
        })();
        return () => { stopped = true; };
    }, [showDetail, user?.role]);

    useEffect(() => {
        if (user?.role !== 'whitelabel') return;
        let stopped = false;
        const poll = async () => {
            const r = await apiFetch('/api/auth/me');
            if (!stopped && r?.ok) setWlInfo(r.data);
        };
        poll();
        const t = setInterval(poll, 10000);
        return () => { stopped = true; clearInterval(t); };
    }, [user?.role]);

    // Keep the generate form's plan inside the live allow-list. The licence
    // type is always `app` and there is no device-limit input any more.
    useEffect(() => {
        if (user?.role !== 'whitelabel' || !wlInfo) return;
        const allowedPlans = Array.isArray(wlInfo.allowedPlans) && wlInfo.allowedPlans.length
            ? wlInfo.allowedPlans.filter(p => PLANS.some(x => x.value === p))
            : PLANS.filter(p => WL_ALL_PLANS.includes(p.value)).map(p => p.value);
        if (allowedPlans.length && !allowedPlans.includes(form.plan)) {
            setForm(f => ({ ...f, plan: allowedPlans[0], customDays: allowedPlans[0] === 'custom' ? f.customDays : '' }));
        }
    }, [user?.role, wlInfo, form.plan]);

    const wlAllowedModes = user?.role === 'whitelabel'
        ? (wlInfo?.allowedModes || [])
        : null;

    // Live duration allow-list and device cap for the reseller's forms
    const wlAllowedPlans = user?.role === 'whitelabel'
        ? (Array.isArray(wlInfo?.allowedPlans) && wlInfo.allowedPlans.length
            ? wlInfo.allowedPlans
            : WL_ALL_PLANS)
        : null;
    const wlMaxDevices = user?.role === 'whitelabel'
        ? (Number(wlInfo?.maxDevices) > 0 ? Math.floor(Number(wlInfo.maxDevices)) : 255)
        : 255;
    const visiblePlans = user?.role === 'whitelabel'
        ? PLANS.filter(p => wlAllowedPlans.includes(p.value))
        : PLANS;

    // Converted trial keys are bookkeeping, not inventory — hide them
    const isConverted = (l) => l.revoked && l.revokedReason?.startsWith('Converted to');
    const statusOf = (l, nowTs) => {
        if (l.revoked) return 'revoked';
        if (!l.isLifetime && (l.expiryTs || 0) <= nowTs) return 'expired';
        return 'active';
    };
    const daysLeftOf = (l, nowTs) => {
        if (l.isLifetime) return null;
        return Math.floor((l.expiryTs - nowTs) / 86400);
    };

    const NOW = Math.floor(Date.now() / 1000);

    const filtered = licenses.filter(l => {
        if (isConverted(l)) return false;
        if (typeFilter !== 'all' && (l.licenseMode || 'desktop') !== typeFilter) return false;
        const q = search.toLowerCase();
        if (q && !(l.clientName?.toLowerCase().includes(q) ||
               l.key.toLowerCase().includes(q) ||
               l.clientPhone?.toLowerCase().includes(q) ||
               l.machineId?.toLowerCase().includes(q))) return false;
        if (statusFilter !== 'all') {
            const st = statusOf(l, NOW);
            if (statusFilter === 'expiring') {
                const d = daysLeftOf(l, NOW);
                if (!(st === 'active' && d !== null && d >= 0 && d <= 7)) return false;
            } else if (st !== statusFilter) return false;
        }
        return true;
    });

    // Context-aware counts for the status tabs (respect search + type filter)
    const searchTypeBase = licenses.filter(l => {
        if (isConverted(l)) return false;
        if (typeFilter !== 'all' && (l.licenseMode || 'desktop') !== typeFilter) return false;
        const q = search.toLowerCase();
        return !q || l.clientName?.toLowerCase().includes(q) ||
               l.key.toLowerCase().includes(q) ||
               l.clientPhone?.toLowerCase().includes(q) ||
               l.machineId?.toLowerCase().includes(q);
    });
    const tabCounts = searchTypeBase.reduce((acc, l) => {
        const st = statusOf(l, NOW);
        acc[st] = (acc[st] || 0) + 1;
        if (st === 'active') {
            const d = daysLeftOf(l, NOW);
            if (d !== null && d >= 0 && d <= 7) acc.expiring = (acc.expiring || 0) + 1;
        }
        return acc;
    }, { active: 0, expired: 0, revoked: 0, expiring: 0 });

    // Page-level insights for the summary strip
    const visibleInventory = licenses.filter(l => !isConverted(l));
    const totalKeys = visibleInventory.length;
    const activeKeys = visibleInventory.filter(l => statusOf(l, NOW) === 'active').length;
    const expiringKeys = visibleInventory.filter(l => {
        if (statusOf(l, NOW) !== 'active') return false;
        const d = daysLeftOf(l, NOW);
        return d !== null && d >= 0 && d <= 7;
    }).length;
    const revokedKeys = visibleInventory.filter(l => l.revoked).length;
    const revenueTotal = visibleInventory
        .filter(l => !l.revoked)
        .reduce((s, l) => s + Math.max(0, Number(l.discountedPrice ?? l.price) || 0), 0);
    const fmtCompactINR = (n) => '₹' + new Intl.NumberFormat('en-IN', { notation: 'compact', maximumFractionDigits: 1 }).format(n);

    // Reset to the first page whenever the filters change
    useEffect(() => { setPage(1); }, [search, typeFilter, statusFilter]);

    const totalPages = Math.max(1, Math.ceil(filtered.length / PAGE_SIZE));
    const safePage = Math.min(page, totalPages);
    const paged = filtered.slice((safePage - 1) * PAGE_SIZE, safePage * PAGE_SIZE);

    const copyKey = (key) => {
        navigator.clipboard.writeText(key);
        setCopied(key);
        setTimeout(() => setCopied(''), 1800);
    };

    const generate = async (e) => {
        e.preventDefault();
        setGenErr('');
        // Loose client-side check only (the server validates strictly): the
        // Device ID is accepted with any hyphenation and normalized to its
        // 15 alphanumeric characters.
        const deviceId = String(form.machineId || '').toUpperCase().replace(/[^0-9A-Z]/g, '');
        if (deviceId.length !== 15) {
            setGenErr('Machine ID must be the 15-character Device ID shown in the app');
            return;
        }
        setGenBusy(true);
        const r = await apiFetch('/api/licenses/generate', { method: 'POST', body: form });
        if (!r) return;
        if (!r.ok) { setGenErr(r.data.error || 'Failed'); setGenBusy(false); return; }
        setGenKey(r.data.key);
        setGeneratedLicense(r.data.license || null);
        setGenBusy(false);
        toast.success('License generated');
        load();
        if (user?.role === 'whitelabel') refreshWhitelabel();
    };

    const downloadInvoiceForLicense = async (license) => {
        if (!license) return;
        setInvoiceBusy(true);
        try {
            const [{ default: jsPDF }, { default: autoTable }] = await Promise.all([
                import('jspdf'),
                import('jspdf-autotable'),
            ]);

            const l = license;
            const doc = new jsPDF({ unit: 'pt', format: 'a4' });
            doc.setProperties({ title: 'Invoice — AcceptPro' });
            const pageWidth = doc.internal.pageSize.getWidth();
            const pageHeight = doc.internal.pageSize.getHeight();

            const logo = await loadImageAsDataUrl('/favicon_io/android-chrome-192x192.png').catch(() => null);
            const issuedDate = fmtDate(l.issuedAt);
            const dueDate = l.isLifetime ? 'Lifetime' : fmtDate(l.expiryTs);
            const invoiceId = `INV-${String(l.key || '').slice(0, 8)}`;
            const baseAmount = toAmountNumber(l.price);
            const paidAmount = Math.min(baseAmount, toAmountNumber(l.discountedPrice ?? l.price));
            const discountAmount = Math.max(0, baseAmount - paidAmount);
            const hasDiscount = discountAmount > 0;
            const discountPercent = baseAmount > 0 ? (discountAmount / baseAmount) * 100 : 0;
            const discountPercentRounded = Math.round(discountPercent);
            const subtotalAmount = fmtMoney(baseAmount);
            const discountPercentText = `${discountPercentRounded}%`;
            const totalAmount = fmtMoney(paidAmount);

            // Header band
            doc.setFillColor(12, 36, 74);
            doc.rect(0, 0, pageWidth, 100, 'F');
            doc.setFillColor(14, 116, 144);
            doc.rect(0, 92, pageWidth, 8, 'F');

            if (logo) {
                doc.addImage(logo, 'PNG', 40, 20, 48, 48);
            }

            doc.setTextColor(255, 255, 255);
            doc.setFont('helvetica', 'bold');
            doc.setFontSize(24);
            doc.text('ACCEPTPRO', 96, 44);
            doc.setFont('helvetica', 'normal');
            doc.setFontSize(10);
            doc.text('License Activation Invoice', 96, 63);

            doc.setFont('helvetica', 'bold');
            doc.setFontSize(14);
            doc.text('INVOICE', pageWidth - 130, 38);
            doc.setFont('helvetica', 'normal');
            doc.setFontSize(10);
            doc.text(`Invoice #: ${invoiceId}`, pageWidth - 200, 56);
            doc.text(`Date: ${new Date().toLocaleDateString('en-IN')}`, pageWidth - 200, 72);
            doc.text(`Issued: ${issuedDate}`, pageWidth - 200, 88);

            doc.setFillColor(245, 247, 251);
            doc.rect(40, 118, pageWidth - 80, 84, 'F');

            doc.setTextColor(30, 41, 59);
            doc.setFont('helvetica', 'bold');
            doc.setFontSize(11);
            doc.text('Bill To', 52, 138);
            doc.setFont('helvetica', 'normal');
            doc.setFontSize(10);
            doc.text(`Client: ${l.clientName || '-'}`, 52, 156);
            doc.text(`Phone: ${l.clientPhone || '-'}`, 52, 172);
            doc.text(`Email: ${l.clientEmail || '-'}`, 52, 188);

            doc.setFont('helvetica', 'bold');
            doc.setFontSize(11);
            doc.text('Account Details', pageWidth - 250, 138);
            doc.setFont('helvetica', 'normal');
            doc.setFontSize(10);
            doc.text(`Issued By: ${l.issuedByName || '-'}`, pageWidth - 250, 156);

            autoTable(doc, {
                startY: 224,
                head: [['Description', 'Details', 'Amount']],
                body: [
                    ['Product', 'AcceptPro Software License Activation', subtotalAmount],
                    ['Plan', String(l.plan || '-').toUpperCase(), ''],
                    ['Validity', `${issuedDate} to ${dueDate}`, ''],
                    ['Device Limit', String(l.deviceLimit || 1), ''],
                    ['License Key', l.key || '-', ''],
                    ['Machine ID', l.machineId || '-', ''],
                    ...(hasDiscount ? [['Discounted Price', 'Final payable amount after discount', totalAmount]] : []),
                ],
                theme: 'grid',
                styles: { fontSize: 9.5, cellPadding: 7, textColor: [30, 41, 59] },
                headStyles: { fillColor: [12, 36, 74], textColor: [255, 255, 255], fontStyle: 'bold' },
                columnStyles: {
                    0: { cellWidth: 130, fontStyle: 'bold' },
                    1: { cellWidth: 330 },
                    2: { cellWidth: 80, halign: 'right', fontStyle: 'bold' },
                },
            });

            let finalY = doc.lastAutoTable?.finalY || 450;
            doc.setDrawColor(226, 232, 240);
            doc.line(40, finalY + 24, pageWidth - 40, finalY + 24);

            doc.setFont('helvetica', 'bold');
            doc.setFontSize(12);
            doc.text('Subtotal', pageWidth - 200, finalY + 46);
            doc.text(subtotalAmount, pageWidth - 60, finalY + 46, { align: 'right' });

            let totalY = finalY + 68;
            if (hasDiscount) {
                doc.setFontSize(10);
                doc.setFont('helvetica', 'normal');
                doc.text('Discount', pageWidth - 200, finalY + 62);
                doc.text(discountPercentText, pageWidth - 60, finalY + 62, { align: 'right' });
                totalY = finalY + 84;
            }

            doc.setFont('helvetica', 'bold');
            doc.setFontSize(13);
            doc.text('Total Amount', pageWidth - 200, totalY);
            doc.text(totalAmount, pageWidth - 60, totalY, { align: 'right' });

            doc.setFont('helvetica', 'normal');
            doc.setFontSize(9.5);
            doc.setTextColor(71, 85, 105);
            const note = l.notes ? `Note: ${l.notes}` : 'Note: This invoice confirms successful license issuance for the above client.';
            doc.text(note, 40, finalY + 48, { maxWidth: 320 });

            finalY += 108;
            if (finalY > pageHeight - 180) {
                doc.addPage();
                finalY = 60;
            }

            doc.setFillColor(240, 249, 255);
            doc.rect(40, finalY, pageWidth - 80, 158, 'F');
            doc.setDrawColor(14, 116, 144);
            doc.rect(40, finalY, pageWidth - 80, 158);

            doc.setTextColor(3, 105, 161);
            doc.setFont('helvetica', 'bold');
            doc.setFontSize(11);
            doc.text('Terms and Conditions', 52, finalY + 22);

            doc.setTextColor(71, 85, 105);
            doc.setFont('helvetica', 'normal');
            doc.setFontSize(9.2);
            const terms = [
                'For assistance, please contact AcceptPro Support at +91 92177 58442.',
                'Complimentary support is available for 3 days from the date of license activation.',
                'Extended monthly support can be opted for through an additional paid support plan.',
                'Each successful referral qualifies for a one-month extension to the active plan, subject to verification by AcceptPro.',
                'AcceptPro includes anti-ban safeguards; use Trust Builder and the safest sending methods before scaling campaigns.',
                'All templates and outbound messages must comply with Meta and WhatsApp policy guidelines.',
                'Avoid spam or abusive outreach; repeated user reports can lead to temporary or permanent account restrictions.',
                'AcceptPro is not liable for any number blocking, limitations, or bans imposed by WhatsApp or Meta.'
            ];
            doc.text(terms.map((t, i) => `${i + 1}. ${t}`).join('\n'), 52, finalY + 40, { maxWidth: pageWidth - 104, lineHeightFactor: 1.5 });

            doc.setFillColor(248, 250, 252);
            doc.rect(0, pageHeight - 54, pageWidth, 54, 'F');
            doc.setTextColor(100, 116, 139);
            doc.setFontSize(9);
            doc.text('AcceptPro Support: +91 92177 58442', 40, pageHeight - 32);
            doc.text('Thank you for choosing AcceptPro.', pageWidth - 40, pageHeight - 32, { align: 'right' });
            doc.text('This is a system-generated invoice and does not require a signature.', 40, pageHeight - 18);

            const safeName = (l.clientName || 'client').toLowerCase().replace(/[^a-z0-9]+/g, '-').replace(/(^-|-$)/g, '');
            doc.save(`acceptpro-invoice-${safeName || 'client'}-${new Date().toISOString().slice(0, 10)}.pdf`);
        } finally {
            setInvoiceBusy(false);
        }
    };

    const downloadGeneratedInvoice = async () => {
        await downloadInvoiceForLicense(generatedLicense);
    };

    const revoke = async () => {
        setRevBusy(true);
        setRevErr('');
        const r = await apiFetch('/api/licenses/revoke', { method: 'POST', body: { key: showRev, reason: revReason } });
        if (r?.ok) { setShowRev(null); setRevReason(''); load(); toast.success('License revoked'); }
        else { setRevErr(r?.data?.error || 'Failed to revoke'); toast.error(r?.data?.error || 'Failed to revoke'); }
        setRevBusy(false);
    };

    const deleteLic = async () => {
        setDelBusy(true);
        setDelErr('');
        const r = await apiFetch('/api/licenses/delete', { method: 'POST', body: { key: showDel.key } });
        if (r?.ok) { setShowDel(null); load(); toast.success('License deleted'); }
        else { setDelErr(r?.data?.error || 'Failed to delete'); toast.error(r?.data?.error || 'Failed to delete'); }
        setDelBusy(false);
    };

    const openConvert = (license) => {
        setShowConvert(license);
        setConvertForm({
            plan: 'monthly', deviceLimit: String(license.deviceLimit || 1),
            customDays: '', price: '', discountedPrice: '',
            notes: license.notes || '',
            machineId: license.machineId || '',
            features: license.features ? { ...license.features } : { ...DEFAULT_FEATURES },
        });
        setConvertErr('');
        setConvertedKey('');
        setConvertedLicense(null);
    };;

    const convertLicense = async (e) => {
        e.preventDefault();
        setConvertErr('');
        // Loose client-side check only (the server validates strictly).
        const deviceId = String(convertForm.machineId || '').toUpperCase().replace(/[^0-9A-Z]/g, '');
        if (deviceId && deviceId.length !== 15) {
            setConvertErr('Machine ID must be the 15-character Device ID shown in the app');
            return;
        }
        setConvertBusy(true);
        const r = await apiFetch('/api/licenses/convert', {
            method: 'POST',
            body: { oldKey: showConvert.key, ...convertForm },
        });
        if (!r?.ok) { setConvertErr(r?.data?.error || 'Conversion failed'); setConvertBusy(false); return; }
        setConvertedKey(r.data.key);
        setConvertedLicense(r.data.license || null);
        setConvertBusy(false);
        toast.success('Trial converted — new key issued');
        load();
    };

    const updateLicense = async (e) => {
        e.preventDefault();
        setEditBusy(true);
        setEditErr('');
        const r = await apiFetch('/api/licenses/update', { method: 'POST', body: { key: showEdit.key, clientName: editForm.clientName, clientPhone: editForm.clientPhone, clientEmail: editForm.clientEmail, price: editForm.price, notes: editForm.notes, affiliateId: editForm.affiliateId, affiliateName: editForm.affiliateName, features: editForm.features } });
        if (!r?.ok) { setEditErr(r?.data?.error || 'Failed to update'); setEditBusy(false); return; }
        setShowEdit(null);
        setEditBusy(false);
        toast.success('License updated');
        load();
    };

    const downloadCsv = () => {
        const nowTs = Math.floor(Date.now() / 1000);
        const headers = [
            'Client Name', 'Phone', 'Email',
            'Type', 'Plan', 'Price', 'Discounted Price', 'Discount Amount', 'Device Limit', 'Machine ID', 'Key',
            'Issued By', 'Issued At', 'Expiry', 'Status',
            'Revoked By', 'Revoked At', 'Revoked Reason',
            'Features', 'Notes'
        ];

        const rows = licenses.map(l => {
            const features = FEATURE_OPTIONS
                .filter(f => (l.features ? l.features[f.key] !== false : true))
                .map(f => f.label)
                .join(' | ');

            return [
                l.clientName || '',
                l.clientPhone || '',
                l.clientEmail || '',
                l.licenseMode === 'cloud' ? 'Cloud' : l.licenseMode === 'app' ? 'App' : 'Desktop',
                l.plan || '',
                toAmountNumber(l.price),
                toAmountNumber(l.discountedPrice ?? l.price),
                Math.max(0, toAmountNumber(l.price) - toAmountNumber(l.discountedPrice ?? l.price)),
                l.deviceLimit || 1,
                l.machineId || '',
                l.key || '',
                l.issuedByName || '',
                fmtDate(l.issuedAt),
                l.isLifetime ? 'Lifetime' : fmtDate(l.expiryTs),
                getLicenseStatus(l, nowTs),
                l.revokedByName || '',
                l.revokedAt ? fmtDate(l.revokedAt) : '',
                l.revokedReason || '',
                features,
                l.notes || '',
            ].map(csvEscape).join(',');
        });

        const csv = [headers.join(','), ...rows].join('\n');
        const blob = new Blob([csv], { type: 'text/csv;charset=utf-8;' });
        const url = URL.createObjectURL(blob);
        const a = document.createElement('a');
        const stamp = new Date().toISOString().slice(0, 10);
        a.href = url;
        a.download = `licenses-full-${stamp}.csv`;
        document.body.appendChild(a);
        a.click();
        a.remove();
        URL.revokeObjectURL(url);
    };

    const downloadPdf = async () => {
        const [{ default: jsPDF }, { default: autoTable }] = await Promise.all([
            import('jspdf'),
            import('jspdf-autotable'),
        ]);

        const nowTs = Math.floor(Date.now() / 1000);
        const doc = new jsPDF({ orientation: 'landscape', unit: 'pt', format: 'a4' });
        doc.setFontSize(14);
        doc.text('AcceptPro Licenses - Full Export', 36, 30);
        doc.setFontSize(10);
        doc.text(`Generated: ${new Date().toLocaleString('en-IN')}`, 36, 48);

        const body = licenses.map((l) => {
            const features = FEATURE_OPTIONS
                .filter(f => (l.features ? l.features[f.key] !== false : true))
                .map(f => f.label)
                .join(', ');

            const details = [
                `Phone: ${l.clientPhone || '-'}`,
                `Email: ${l.clientEmail || '-'}`,
                `Type: ${l.licenseMode === 'cloud' ? 'Cloud' : l.licenseMode === 'app' ? 'App' : 'Desktop'}`,
                `Machine: ${l.licenseMode === 'cloud' ? 'N/A' : (l.machineId || '-')}`,
                `Key: ${l.key || '-'}`,
                `Features: ${features || '-'}`,
                `Notes: ${l.notes || '-'}`,
            ].join('\n');

            return [
                l.clientName || '-',
                l.plan || '-',
                fmtMoney(l.discountedPrice ?? l.price),
                l.deviceLimit || 1,
                l.issuedByName || '-',
                fmtDate(l.issuedAt),
                l.isLifetime ? 'Lifetime' : fmtDate(l.expiryTs),
                getLicenseStatus(l, nowTs),
                details,
            ];
        });

        autoTable(doc, {
            startY: 60,
            head: [[
                'Client', 'Plan', 'Price', 'Devices', 'Issued By',
                'Issued At', 'Expiry', 'Status', 'Details'
            ]],
            body,
            styles: { fontSize: 8, cellPadding: 3, valign: 'top' },
            headStyles: { fillColor: [124, 58, 237] },
            columnStyles: {
                0: { cellWidth: 85 },
                1: { cellWidth: 50 },
                2: { cellWidth: 52 },
                3: { cellWidth: 40 },
                4: { cellWidth: 68 },
                5: { cellWidth: 58 },
                6: { cellWidth: 58 },
                7: { cellWidth: 48 },
                8: { cellWidth: 250 },
            },
            didDrawPage: (data) => {
                const pageNo = doc.getNumberOfPages();
                doc.setFontSize(8);
                doc.text(`Page ${pageNo}`, data.settings.margin.left, doc.internal.pageSize.height - 12);
            },
        });

        const stamp = new Date().toISOString().slice(0, 10);
        doc.save(`licenses-full-${stamp}.pdf`);
    };

    const downloadLicenses = async () => {
        if (!licenses.length) return;
        setExportBusy(true);
        try {
            if (exportFormat === 'pdf') {
                await downloadPdf();
            } else {
                downloadCsv();
            }
        } finally {
            setExportBusy(false);
        }
    };

    const now = Math.floor(Date.now() / 1000);

    return (<>
        <AppLayout>
            <div className="page">
                <div className="page-header">
                    <div>
                        <div className="page-title">Licenses</div>
                        <div className="page-subtitle">Generate, track and revoke license keys</div>
                    </div>
                    <div style={{ display: 'flex', gap: 8, alignItems: 'center' }}>
                        <select
                            className="form-select"
                            style={{ width: 110 }}
                            value={exportFormat}
                            onChange={e => setExportFormat(e.target.value)}
                        >
                            <option value="csv">CSV</option>
                            <option value="pdf">PDF</option>
                        </select>
                        <button
                            className="btn btn-ghost"
                            onClick={downloadLicenses}
                            disabled={exportBusy || licenses.length === 0}
                            title={licenses.length === 0 ? 'No licenses to export' : 'Download full license data'}
                        >
                            {exportBusy ? 'Preparing…' : 'Export'}
                        </button>
                        <button className="btn btn-primary" onClick={() => { setShowGen(true); setGenKey(''); setGeneratedLicense(null); setForm(DEFAULT_FORM); }}>
                            Generate Key
                        </button>
                    </div>
                </div>

                <div className="page-body">
                    {/* Quiet stat row */}
                    <div className="lic-stats db-in">
                        <div className="lic-stat">
                            <div className="lic-stat-num">{totalKeys}</div>
                            <div className="lic-stat-lab">Issued</div>
                        </div>
                        <div className="lic-stat-sep" />
                        <div className="lic-stat">
                            <div className="lic-stat-num">{activeKeys}</div>
                            <div className="lic-stat-lab">Active</div>
                        </div>
                        <div className="lic-stat-sep" />
                        <div className="lic-stat">
                            <div className="lic-stat-num" style={{ color: expiringKeys > 0 ? 'var(--amber)' : undefined }}>{expiringKeys}</div>
                            <div className="lic-stat-lab">Expiring ≤ 7d</div>
                        </div>
                        <div className="lic-stat-sep" />
                        <div className="lic-stat">
                            <div className="lic-stat-num">{revokedKeys}</div>
                            <div className="lic-stat-lab">Revoked</div>
                        </div>
                        <div className="lic-stat-sep" />
                        <div className="lic-stat">
                            <div className="lic-stat-num">{fmtCompactINR(revenueTotal)}</div>
                            <div className="lic-stat-lab">Revenue booked</div>
                        </div>
                    </div>
                    {/* Whitelabel quota card — live values from the super admin's settings */}
                    {user?.role === 'whitelabel' && wlInfo && (
                        <div className="card" style={{ marginBottom: 16, display: 'flex', flexWrap: 'wrap', gap: 32, alignItems: 'center' }}>
                            <div>
                                <div className="stat-label" style={{ marginBottom: 4 }}>LICENSE QUOTA</div>
                                <div style={{
                                    fontSize: 24, fontWeight: 800,
                                    color: (wlInfo.usage?.remaining ?? 0) <= 0 ? '#ef4444' : (wlInfo.usage?.remaining ?? 0) <= 5 ? '#f59e0b' : '#22c55e',
                                }}>
                                    {wlInfo.usage?.used ?? 0} / {wlInfo.usage?.limit ?? 0}
                                </div>
                                <div className="stat-sub">{wlInfo.usage?.remaining ?? 0} remaining — updates live</div>
                            </div>
                            <div>
                                <div className="stat-label" style={{ marginBottom: 6 }}>ALLOWED LICENSE TYPES</div>
                                <div style={{ display: 'flex', gap: 6, flexWrap: 'wrap' }}>
                                    {(wlInfo.allowedModes || []).map(m => (
                                        <span key={m} className="badge" style={WL_MODE_META[m] || WL_MODE_META.desktop}>
                                            {(WL_MODE_META[m] || WL_MODE_META.desktop).label}
                                        </span>
                                    ))}
                                </div>
                            </div>
                            <div>
                                <div className="stat-label" style={{ marginBottom: 6 }}>ALLOWED DURATIONS</div>
                                <div style={{ display: 'flex', gap: 6, flexWrap: 'wrap' }}>
                                    {(wlAllowedPlans || []).map(p => (
                                        <span key={p} className="badge" style={{ background: 'rgba(124,58,237,.12)', color: '#a78bfa' }}>
                                            {(PLANS.find(x => x.value === p) || {}).label || p}
                                        </span>
                                    ))}
                                </div>
                            </div>
                            <div>
                                <div className="stat-label" style={{ marginBottom: 4 }}>MAX DEVICES / KEY</div>
                                <div style={{ fontSize: 24, fontWeight: 800, color: '#a78bfa' }}>{wlMaxDevices}</div>
                            </div>
                            {wlInfo.partnership?.endTs && (
                                <div>
                                    <div className="stat-label" style={{ marginBottom: 4 }}>PARTNERSHIP</div>
                                    <div style={{
                                        fontSize: 24, fontWeight: 800,
                                        color: wlInfo.partnership.expired ? '#ef4444'
                                            : wlInfo.partnership.daysLeft <= 30 ? '#f59e0b' : '#22c55e',
                                    }}>
                                        {wlInfo.partnership.expired ? 'Expired' : `${wlInfo.partnership.daysLeft} days`}
                                    </div>
                                    <div className="stat-sub">
                                        {wlInfo.partnership.expired ? 'Generation blocked — contact the administrator to renew' : `until ${fmtDate(wlInfo.partnership.endTs)} — updates live`}
                                    </div>
                                </div>
                            )}
                            {!wlInfo.active && (
                                <div style={{ color: '#ef4444', fontWeight: 700, fontSize: 13 }}>Account disabled — contact the administrator</div>
                            )}
                            <div style={{ marginLeft: 'auto', textAlign: 'right', fontSize: 12, color: '#4a5980' }}>
                                {wlInfo.name}<br />@{wlInfo.username}
                            </div>
                        </div>
                    )}

                    {/* Toolbar: search + type segmented control */}
                    <div className="lic-toolbar db-in">
                        <div className="search-bar" style={{ marginBottom: 0, flex: 1 }}>
                            <input
                                className="form-input search-input"
                                style={{ maxWidth: 'none' }}
                                placeholder="Search client, key, phone or machine ID"
                                value={search}
                                onChange={e => setSearch(e.target.value)}
                            />
                            {search && (
                                <button className="btn btn-ghost btn-sm" onClick={() => setSearch('')}>Clear</button>
                            )}
                        </div>
                        <div className="seg">
                            {[
                                { value: 'all',     label: 'All' },
                                { value: 'desktop', label: 'Desktop' },
                                { value: 'cloud',   label: 'Cloud' },
                                { value: 'app',     label: 'App' },
                            ].map(t => (
                                <button
                                    key={t.value}
                                    className={`seg-btn${typeFilter === t.value ? ' on' : ''}`}
                                    onClick={() => setTypeFilter(t.value)}
                                >
                                    {t.label}
                                </button>
                            ))}
                        </div>
                    </div>

                    {/* Status tabs */}
                    <div className="ltabs db-in">
                        {[
                            { value: 'all',      label: 'All',           count: searchTypeBase.length },
                            { value: 'active',   label: 'Active',        count: tabCounts.active },
                            { value: 'expiring', label: 'Expiring soon', count: tabCounts.expiring },
                            { value: 'expired',  label: 'Expired',       count: tabCounts.expired },
                            { value: 'revoked',  label: 'Revoked',       count: tabCounts.revoked },
                        ].map(t => (
                            <button
                                key={t.value}
                                className={`ltab${statusFilter === t.value ? ' on' : ''}`}
                                onClick={() => setStatusFilter(t.value)}
                            >
                                {t.label}
                                <span className="ltab-n">{t.count}</span>
                            </button>
                        ))}
                    </div>

                    {loading ? (
                        <TableSkeleton rows={8} />
                    ) : filtered.length === 0 ? (
                        <div className="lic-empty db-in">
                            <div className="lic-empty-title">
                                {licenses.length === 0 ? 'No licenses yet' : 'No results'}
                            </div>
                            <div className="lic-empty-sub">
                                {licenses.length === 0
                                    ? 'Generate your first key and it will appear here.'
                                    : 'Try a different search, type or status.'}
                            </div>
                            {licenses.length > 0 && (search || typeFilter !== 'all' || statusFilter !== 'all') && (
                                <button className="btn btn-ghost btn-sm" onClick={() => { setSearch(''); setTypeFilter('all'); setStatusFilter('all'); }}>
                                    Clear filters
                                </button>
                            )}
                        </div>
                    ) : (
                    <>
                    <div className="table-wrap">
                        <table className="licenses-table">
                            <thead>
                                <tr>
                                    <th>Client</th>
                                    <th>Key</th>
                                    <th>Type</th>
                                    <th>Plan</th>
                                    <th style={{ textAlign: 'center' }}>Devices</th>
                                    <th>Validity</th>
                                    <th>Machine ID</th>
                                    <th>Issued</th>
                                    <th>Status</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                {paged.map(l => {
                                    const days = daysLeftOf(l, NOW);
                                    const isExpired = !l.isLifetime && days !== null && days < 0;
                                    return (
                                        <tr key={l.key}>
                                            <td>
                                                <div className="lic-name" onClick={() => setShowDetail(l)}>{l.clientName || '—'}</div>
                                                {l.clientPhone && <div className="lic-sub">{l.clientPhone}</div>}
                                            </td>
                                            <td>
                                                <button className="lic-key" title="Copy" onClick={() => copyKey(l.key)}>
                                                    {copied === l.key ? 'Copied' : l.key.slice(0, 18) + '…'}
                                                </button>
                                            </td>
                                            <td>
                                                <span className="lic-tag">
                                                    {l.licenseMode === 'cloud' ? 'Cloud' : l.licenseMode === 'app' ? 'App' : 'Desktop'}
                                                    {l.reviewAccess ? ' · Review' : ''}
                                                    {l.source === 'auto' ? ' · Auto' : ''}
                                                </span>
                                            </td>
                                            <td><span className="lic-tag">{l.planTier ? `${l.plan} · ${l.planTier}` : l.plan}</span></td>
                                            <td className="lic-num">{l.deviceLimit}</td>
                                            <td>
                                                {l.isLifetime ? (
                                                    <span className="lic-sub" style={{ color: 'var(--text-dim)' }}>Lifetime</span>
                                                ) : (
                                                    <>
                                                        <div className="lic-sub" style={{ color: 'var(--text-dim)' }}>{fmtDate(l.expiryTs)}</div>
                                                        {days !== null && days >= 0 && (
                                                            <div className="lic-sub" style={{ color: days <= 7 ? 'var(--amber)' : undefined }}>
                                                                {days === 0 ? 'Last day' : `${days}d left`}
                                                            </div>
                                                        )}
                                                        {days !== null && days < 0 && <div className="lic-sub" style={{ color: 'var(--red)' }}>Expired</div>}
                                                    </>
                                                )}
                                            </td>
                                            <td><span className="mono lic-sub">{l.licenseMode === 'cloud' || !l.machineId ? '—' : `${l.machineId.slice(0, 16)}…`}</span></td>
                                            <td>
                                                <div className="lic-sub" style={{ color: 'var(--text-dim)' }}>{l.issuedByName}</div>
                                                <div className="lic-sub">{fmtDate(l.issuedAt)}</div>
                                            </td>
                                            <td>
                                                <span className={`lic-status s-${l.revoked ? 'revoked' : isExpired ? 'expired' : 'active'}`}>
                                                    {l.revoked ? 'Revoked' : isExpired ? 'Expired' : 'Active'}
                                                </span>
                                            </td>
                                            <td>
                                                <div style={{ display: 'flex', gap: 6 }}>
                                                    <button
                                                        className="btn btn-ghost btn-sm"
                                                        onClick={() => { setShowEdit(l); setEditForm({ clientName: l.clientName || '', clientPhone: l.clientPhone || '', clientEmail: l.clientEmail || '', price: l.price ?? '', notes: l.notes || '', affiliateId: l.affiliateId || '', affiliateName: l.affiliateName || '', features: { ...DEFAULT_FEATURES, ...(l.features || {}) } }); setEditErr(''); }}
                                                        title="Edit price & notes"
                                                    >Edit</button>
                                                    {!l.revoked && (
                                                        <button
                                                            className="btn btn-ghost btn-sm"
                                                            onClick={() => { setShowRev(l.key); setRevReason(''); setRevErr(''); }}
                                                        >
                                                            Revoke
                                                        </button>
                                                    )}
                                                    {(l.plan === 'trial' || l.plan === 'trial1day') && !l.revoked && (
                                                        <button
                                                            className="btn btn-ghost btn-sm"
                                                            onClick={() => openConvert(l)}
                                                            title="Convert this trial to a paid plan"
                                                        >
                                                            Convert
                                                        </button>
                                                    )}
                                                    {user?.role === 'super' && (
                                                        <button
                                                            className="btn btn-ghost btn-sm lic-danger"
                                                            onClick={() => { setShowDel({ key: l.key, clientName: l.clientName, price: Math.max(0, parseFloat(l.discountedPrice ?? l.price) || 0), plan: l.plan || '' }); setDelErr(''); }}
                                                        >
                                                            Delete
                                                        </button>
                                                    )}
                                                    {(user?.role === 'super' || user?.role === 'admin') && (
                                                        <>
                                                            <button
                                                                className="btn btn-ghost btn-sm"
                                                                onClick={() => { setShowExt({ key: l.key, clientName: l.clientName }); setExtDays('30'); setExtErr(''); }}
                                                                title="Extend this license on the AcceptPro engine"
                                                            >
                                                                Extend
                                                            </button>
                                                            <button
                                                                className="btn btn-ghost btn-sm"
                                                                onClick={() => openReveal(l)}
                                                                title="Reveal the full license key"
                                                            >
                                                                Reveal key
                                                            </button>
                                                            {l.revoked && (
                                                                <button
                                                                    className="btn btn-ghost btn-sm"
                                                                    onClick={() => { setShowUnrev({ key: l.key, clientName: l.clientName }); setUnrevErr(''); }}
                                                                    title="Undo revocation"
                                                                >
                                                                    Unrevoke
                                                                </button>
                                                            )}
                                                            <button
                                                                className="btn btn-ghost btn-sm"
                                                                onClick={() => { setShowMaxDev({ key: l.key, clientName: l.clientName, current: l.deviceLimit }); setMaxDevVal(String(l.deviceLimit || 1)); setMaxDevErr(''); }}
                                                                title="Set the device cap on the AcceptPro engine"
                                                            >
                                                                Set max devices
                                                            </button>
                                                        </>
                                                    )}
                                                </div>
                                            </td>
                                        </tr>
                                    );
                                })}
                            </tbody>
                        </table>
                    </div>

                    {/* Pagination */}
                    {filtered.length > PAGE_SIZE && (
                        <div className="pager">
                            <span className="pager-info">
                                Showing {(safePage - 1) * PAGE_SIZE + 1}–{Math.min(safePage * PAGE_SIZE, filtered.length)} of {filtered.length}
                            </span>
                            <button className="btn btn-ghost btn-sm" disabled={safePage === 1} onClick={() => setPage(p => Math.max(1, p - 1))}>‹ Prev</button>
                            <span className="pager-page">Page {safePage} / {totalPages}</span>
                            <button className="btn btn-ghost btn-sm" disabled={safePage === totalPages} onClick={() => setPage(p => Math.min(totalPages, p + 1))}>Next ›</button>
                        </div>
                    )}
                    </>
                    )}
                </div>
            </div>

            {/* ── Generate Modal ─────────────────────────────────────────── */}
            {showGen && (
                <Modal
                    title={genKey ? '✓ Key Generated' : 'Generate License Key'}
                    onClose={() => setShowGen(false)}
                    busy={genBusy}
                    backdropClose={!genKey}
                    maxWidth={560}
                >
                        {genKey ? (
                            <div className="modal-body">
                                <div className="gen-head">
                                    <div className="gen-title">License generated</div>
                                    <div className="gen-sub">Send this key to your customer. It activates on first use.</div>
                                </div>
                                <div className="gen-key-box">
                                    <div className="gen-key-label">LICENSE KEY</div>
                                    <div className="gen-key-value">{genKey}</div>
                                </div>
                                {generatedLicense && (
                                    <div className="gen-meta">
                                        {[
                                            generatedLicense.plan,
                                            generatedLicense.isLifetime ? 'Lifetime' : (generatedLicense.expiryTs ? `valid until ${fmtDate(generatedLicense.expiryTs)}` : null),
                                        ].filter(Boolean).join('  ·  ')}
                                    </div>
                                )}
                                <button
                                    className="btn btn-primary"
                                    style={{ width: '100%' }}
                                    onClick={() => { navigator.clipboard.writeText(genKey); setCopied('__genkey__'); setTimeout(() => setCopied(''), 2000); }}
                                >
                                    {copied === '__genkey__' ? 'Key copied' : 'Copy Key'}
                                </button>
                                <button
                                    className="btn btn-ghost"
                                    style={{ width: '100%' }}
                                    onClick={downloadGeneratedInvoice}
                                    disabled={!generatedLicense || invoiceBusy}
                                >
                                    {invoiceBusy ? 'Preparing Invoice…' : 'Download Invoice (PDF)'}
                                </button>
                                <button
                                    className="btn btn-ghost"
                                    style={{ width: '100%' }}
                                    onClick={() => { setGenKey(''); setGeneratedLicense(null); setForm(DEFAULT_FORM); }}
                                >
                                    Generate Another
                                </button>
                            </div>
                        ) : (
                            <form onSubmit={generate}>
                                <div className="modal-body">
                                    <div className="form-section">
                                        <div className="form-section-title">License</div>
                                        <div className="form-group">
                                            <label className="form-label">Machine ID (Device ID) *</label>
                                            <input className="form-input" required value={form.machineId}
                                                onChange={e => setForm(f => ({ ...f, machineId: e.target.value }))}
                                                placeholder="e.g. 7QK2M-3XW8H-PTD4R"
                                                style={{ fontFamily: 'Courier New, monospace', fontSize: 12 }} />
                                            <span style={{ fontSize: 11, color: '#3a4560' }}>
                                                The 15-character Device ID from the Accepter app's device activation screen — unique per device, so every phone needs its own key.
                                            </span>
                                        </div>
                                        {user?.role === 'whitelabel' && wlAllowedModes.length > 0 && !wlAllowedModes.includes('app') && (
                                            <div className="form-error">
                                                App licenses are not allowed on your account — contact the administrator.
                                            </div>
                                        )}
                                    <div className="form-row">
                                        <div className="form-group">
                                            <label className="form-label">Plan *</label>
                                            <select className="form-select" value={form.plan}
                                                onChange={e => setForm(f => ({ ...f, plan: e.target.value }))}>
                                                {visiblePlans.map(p => <option key={p.value} value={p.value}>{p.label}</option>)}
                                            </select>
                                            {user?.role === 'whitelabel' && (
                                                <span style={{ fontSize: 11, color: '#3a4560' }}>Available durations are set by the administrator.</span>
                                            )}
                                        </div>
                                    </div>
                                    {form.plan === 'custom' && (
                                        <div className="form-group">
                                            <label className="form-label">Custom Days *</label>
                                            <input className="form-input" type="number" min={1} required={form.plan === 'custom'} value={form.customDays}
                                                onChange={e => setForm(f => ({ ...f, customDays: e.target.value }))} placeholder="e.g. 45" />
                                        </div>
                                    )}
                                    </div>


                                    {user?.role === 'whitelabel' && wlInfo?.usage && (
                                        <div style={{ fontSize: 12, color: '#94a3b8', background: '#161c2d', border: '1px solid #252d42', borderRadius: 8, padding: '8px 12px' }}>
                                            Quota:{' '}
                                            <b style={{ color: wlInfo.usage.remaining > 0 ? '#22c55e' : '#ef4444' }}>
                                                {wlInfo.usage.used} of {wlInfo.usage.limit} used
                                            </b>{' '}
                                            — {wlInfo.usage.remaining} remaining. Allowed types, durations, device caps and limits are managed by the administrator and update automatically.
                                            {wlInfo.partnership?.endTs && (
                                                <>
                                                    {' '}Partnership:{' '}
                                                    <b style={{ color: wlInfo.partnership.expired ? '#ef4444' : wlInfo.partnership.daysLeft <= 30 ? '#f59e0b' : '#22c55e' }}>
                                                        {wlInfo.partnership.expired ? 'expired' : `${wlInfo.partnership.daysLeft} days left`}
                                                    </b>.
                                                </>
                                            )}
                                        </div>
                                    )}
                                    {genErr && <div className="form-error">{genErr}</div>}
                                </div>
                                <div className="modal-footer">
                                    <button type="button" className="btn btn-ghost" onClick={() => setShowGen(false)}>Cancel</button>
                                    <button type="submit" className="btn btn-primary" disabled={genBusy || (user?.role === 'whitelabel' && wlInfo?.usage && wlInfo.usage.remaining <= 0) || (user?.role === 'whitelabel' && wlInfo?.partnership?.expired)}>
                                        {genBusy ? 'Generating…' : 'Generate Key'}
                                    </button>
                                </div>
                            </form>
                        )}
                </Modal>
            )}

            {/* ── Delete Modal ───────────────────────────────────────────── */}
            {showDel && (
                <Modal title="Delete License" onClose={() => setShowDel(null)} maxWidth={440} busy={delBusy}>
                        <div className="modal-body">
                            {showDel.price > 0 && (
                                <div style={{
                                    background: 'rgba(239,68,68,0.1)',
                                    border: '1px solid rgba(239,68,68,0.4)',
                                    borderRadius: 8,
                                    padding: '12px 14px',
                                    marginBottom: 14,
                                }}>
                                    <div style={{ color: '#ef4444', fontWeight: 700, fontSize: 13, marginBottom: 4 }}>
                                        ⚠ This license has a paid amount!
                                    </div>
                                    <div style={{ color: '#fca5a5', fontSize: 12 }}>
                                        Amount: <strong>₹{showDel.price.toLocaleString('en-IN')}</strong> ({showDel.plan})
                                    </div>
                                    <div style={{ color: '#fca5a5', fontSize: 12, marginTop: 4 }}>
                                        Deleting this will permanently remove it from your sales totals.
                                        This action will be highlighted in <strong>Logs</strong> for audit.
                                    </div>
                                </div>
                            )}
                            <p style={{ color: '#94a3b8', fontSize: 13 }}>
                                Permanently delete license for <span style={{ color: '#e2e8f0', fontWeight: 700 }}>{showDel.clientName}</span>?<br />
                                <span style={{ fontSize: 12, color: '#ef4444' }}>This removes the record entirely and cannot be undone.</span>
                            </p>
                            <div style={{ fontFamily: 'Courier New, monospace', fontSize: 11, color: '#64748b', background: 'rgba(255,255,255,.03)', borderRadius: 7, padding: '8px 12px', wordBreak: 'break-all' }}>
                                {showDel.key}
                            </div>
                            {delErr && <div className="form-error">{delErr}</div>}
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowDel(null)} disabled={delBusy}>Cancel</button>
                            <button className="btn btn-danger" onClick={deleteLic} disabled={delBusy}>
                                {delBusy ? 'Deleting…' : (showDel.price > 0 ? 'Delete Anyway' : 'Delete Permanently')}
                            </button>
                        </div>
                </Modal>
            )}

            {/* ── Revoke Modal ───────────────────────────────────────────── */}
            {showRev && (
                <Modal title="Revoke License" onClose={() => setShowRev(null)} maxWidth={420} busy={revBusy}>
                        <div className="modal-body">
                            <div style={{ color: '#94a3b8', fontSize: 13 }}>
                                This will immediately invalidate the key. The client's app will show as unlicensed on next startup.
                            </div>
                            <div style={{ fontFamily: 'Courier New, monospace', fontSize: 12, color: '#ef4444', background: 'rgba(239,68,68,.08)', borderRadius: 7, padding: '8px 12px', wordBreak: 'break-all' }}>
                                {showRev}
                            </div>
                            <div className="form-group">
                                <label className="form-label">Reason (optional)</label>
                                <input className="form-input" value={revReason}
                                    onChange={e => setRevReason(e.target.value)}
                                    placeholder="e.g. Refund requested" autoFocus />
                            </div>
                            {revErr && <div className="form-error">{revErr}</div>}
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowRev(null)} disabled={revBusy}>Cancel</button>
                            <button className="btn btn-danger" onClick={revoke} disabled={revBusy}>
                                {revBusy ? 'Revoking…' : 'Confirm Revoke'}
                            </button>
                        </div>
                </Modal>
            )}

            {/* ── Extend Modal (AcceptPro engine) ─────────────────────────── */}
            {showExt && (
                <Modal title="Extend License" onClose={() => setShowExt(null)} maxWidth={420} busy={extBusy}>
                        <div className="modal-body">
                            <div style={{ color: '#94a3b8', fontSize: 13 }}>
                                Extend <span style={{ color: '#e2e8f0', fontWeight: 700 }}>{showExt.clientName}</span> on the AcceptPro engine.
                                The new expiry runs from the current expiry (or from now on unused keys).
                            </div>
                            <div style={{ fontFamily: 'Courier New, monospace', fontSize: 12, color: '#a78bfa', background: 'rgba(124,58,237,.07)', borderRadius: 7, padding: '8px 12px', wordBreak: 'break-all' }}>
                                {showExt.key}
                            </div>
                            <div className="form-group">
                                <label className="form-label">Days to add *</label>
                                <input className="form-input" type="number" min={1} max={3650} value={extDays}
                                    onChange={e => setExtDays(e.target.value)} placeholder="e.g. 30" autoFocus />
                            </div>
                            {extErr && <div className="form-error">{extErr}</div>}
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowExt(null)} disabled={extBusy}>Cancel</button>
                            <button className="btn btn-primary" onClick={extendLicense} disabled={extBusy}>
                                {extBusy ? 'Extending…' : 'Extend License'}
                            </button>
                        </div>
                </Modal>
            )}

            {/* ── Reveal Key Modal (AcceptPro engine) ─────────────────────── */}
            {showReveal && (
                <Modal title="Reveal Key" onClose={() => setShowReveal(null)} maxWidth={460}>
                        <div className="modal-body">
                            <div style={{ color: '#94a3b8', fontSize: 13 }}>
                                Full license key for <span style={{ color: '#e2e8f0', fontWeight: 700 }}>{showReveal.clientName}</span>.
                                Anyone holding this key can activate the license — share it only with the client.
                            </div>
                            {revealErr ? (
                                <div className="form-error">{revealErr}</div>
                            ) : !revealKey ? (
                                <div style={{ color: '#3a4560', fontSize: 12 }}>Revealing…</div>
                            ) : (
                                <div className="gen-key-box" style={{ marginBottom: 0 }}>
                                    <div className="gen-key-label">LICENSE KEY</div>
                                    <div className="gen-key-value">{revealKey}</div>
                                </div>
                            )}
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowReveal(null)}>Close</button>
                            <button className="btn btn-primary" disabled={!revealKey}
                                onClick={() => { navigator.clipboard.writeText(revealKey); setCopied('__reveal__'); setTimeout(() => setCopied(''), 2000); }}>
                                {copied === '__reveal__' ? 'Key copied' : 'Copy Key'}
                            </button>
                        </div>
                </Modal>
            )}

            {/* ── Unrevoke Modal (AcceptPro engine) ───────────────────────── */}
            {showUnrev && (
                <Modal title="Unrevoke License" onClose={() => setShowUnrev(null)} maxWidth={420} busy={unrevBusy}>
                        <div className="modal-body">
                            <div style={{ color: '#94a3b8', fontSize: 13 }}>
                                Undo the revocation for <span style={{ color: '#e2e8f0', fontWeight: 700 }}>{showUnrev.clientName}</span>.
                                The key becomes valid again (or stays expired if its validity is over).
                            </div>
                            <div style={{ fontFamily: 'Courier New, monospace', fontSize: 12, color: '#22c55e', background: 'rgba(34,197,94,.08)', borderRadius: 7, padding: '8px 12px', wordBreak: 'break-all' }}>
                                {showUnrev.key}
                            </div>
                            {unrevErr && <div className="form-error">{unrevErr}</div>}
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowUnrev(null)} disabled={unrevBusy}>Cancel</button>
                            <button className="btn btn-primary" onClick={unrevokeLicense} disabled={unrevBusy}>
                                {unrevBusy ? 'Unrevoking…' : 'Confirm Unrevoke'}
                            </button>
                        </div>
                </Modal>
            )}

            {/* ── Set Max Devices Modal (AcceptPro engine) ────────────────── */}
            {showMaxDev && (
                <Modal title="Set Max Devices" onClose={() => setShowMaxDev(null)} maxWidth={420} busy={maxDevBusy}>
                        <div className="modal-body">
                            <div style={{ color: '#94a3b8', fontSize: 13 }}>
                                Device cap for <span style={{ color: '#e2e8f0', fontWeight: 700 }}>{showMaxDev.clientName}</span> on the AcceptPro engine.
                                Current cap: <strong style={{ color: '#e2e8f0' }}>{showMaxDev.current}</strong>.
                            </div>
                            <div style={{ fontFamily: 'Courier New, monospace', fontSize: 12, color: '#a78bfa', background: 'rgba(124,58,237,.07)', borderRadius: 7, padding: '8px 12px', wordBreak: 'break-all' }}>
                                {showMaxDev.key}
                            </div>
                            <div className="form-group">
                                <label className="form-label">Max Devices *</label>
                                <input className="form-input" type="number" min={1} max={255} value={maxDevVal}
                                    onChange={e => setMaxDevVal(e.target.value)} autoFocus />
                            </div>
                            {maxDevErr && <div className="form-error">{maxDevErr}</div>}
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowMaxDev(null)} disabled={maxDevBusy}>Cancel</button>
                            <button className="btn btn-primary" onClick={setMaxDevices} disabled={maxDevBusy}>
                                {maxDevBusy ? 'Saving…' : 'Save Cap'}
                            </button>
                        </div>
                </Modal>
            )}
            {/* ── Detail Modal ──────────────────────────────────────────── */}
            {showDetail && (
                <Modal title="📋 License Details" onClose={() => setShowDetail(null)} maxWidth={580}>
                        <div className="modal-body">
                            <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px 24px' }}>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Client Name</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.clientName}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Type</div>
                                    <div>
                                        <span
                                            className="badge"
                                            style={{
                                                background: showDetail.licenseMode === 'cloud' ? 'rgba(37,211,102,.15)' : showDetail.licenseMode === 'app' ? 'rgba(74,158,255,.15)' : 'rgba(139,146,176,.15)',
                                                color: showDetail.licenseMode === 'cloud' ? '#25D366' : showDetail.licenseMode === 'app' ? '#4a9eff' : '#8b93b0',
                                            }}
                                        >
                                            {showDetail.licenseMode === 'cloud' ? 'Cloud' : showDetail.licenseMode === 'app' ? 'App' : 'Desktop'}
                                        </span>
                                        {showDetail.reviewAccess && (
                                            <span className="badge" style={{ marginLeft: 4, background: 'rgba(245,158,11,.15)', color: '#f59e0b' }} title="Bypasses device binding — works on any device">
                                                Reviewer key
                                            </span>
                                        )}
                                    </div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Phone</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.clientPhone || '—'}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Email</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.clientEmail || '—'}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Plan</div>
                                    <div><span className={`badge badge-plan-${showDetail.plan}`}>{showDetail.plan}</span></div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Expiry</div>
                                    <div style={{ fontSize: 13, color: showDetail.isLifetime ? '#a78bfa' : '#e2e8f0' }}>{showDetail.isLifetime ? 'Lifetime ∞' : fmtDate(showDetail.expiryTs)}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Days Left</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.isLifetime ? '∞' : (() => { const d = getDaysLeft(showDetail); return d !== null && d >= 0 ? `${d}d` : 'Expired'; })()}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Device Limit</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.deviceLimit}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Price</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{fmtMoney(showDetail.price)}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Discounted Price</div>
                                    <div style={{ fontSize: 13, color: '#22c55e' }}>{fmtMoney(showDetail.discountedPrice ?? showDetail.price)}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Discount</div>
                                    <div style={{ fontSize: 13, color: '#f59e0b' }}>
                                        {fmtMoney(Math.max(0, toAmountNumber(showDetail.price) - toAmountNumber(showDetail.discountedPrice ?? showDetail.price)))}
                                    </div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Issued By</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.issuedByName}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Issued At</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{fmtDate(showDetail.issuedAt)}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Activated</div>
                                    <div style={{ fontSize: 13, color: '#e2e8f0' }}>{showDetail.activated ? fmtDate(showDetail.activatedAt) : <span style={{ color: '#64748b' }}>Not yet</span>}</div>
                                </div>
                                <div>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Status</div>
                                    <div>{showDetail.revoked ? <span className="badge badge-revoked">Revoked</span> : (() => { const d = getDaysLeft(showDetail); return (!showDetail.isLifetime && d !== null && d < 0) ? <span className="badge badge-expired">Expired</span> : <span className="badge badge-active">Active</span>; })()}</div>
                                </div>
                                <div style={{ gridColumn: 'span 2' }}>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>{showDetail.licenseMode === 'app' ? 'Android ID' : 'Machine ID'}</div>
                                    <div style={{ fontFamily: 'Courier New, monospace', fontSize: 11, color: '#94a3b8', wordBreak: 'break-all', background: 'rgba(255,255,255,.03)', borderRadius: 6, padding: '6px 10px' }}>{showDetail.licenseMode === 'cloud' ? 'Not applicable — cloud license' : showDetail.machineId}</div>
                                </div>
                                <div style={{ gridColumn: 'span 2' }}>
                                    <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>License Key</div>
                                    <div style={{ fontFamily: 'Courier New, monospace', fontSize: 10, color: '#a78bfa', wordBreak: 'break-all', background: 'rgba(124,58,237,.07)', borderRadius: 6, padding: '6px 10px' }}>{showDetail.key}</div>
                                </div>
                                {showDetail.notes && (
                                    <div style={{ gridColumn: 'span 2' }}>
                                        <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Notes</div>
                                        <div style={{ fontSize: 12, color: '#94a3b8' }}>{showDetail.notes}</div>
                                    </div>
                                )}
                                {showDetail.revoked && (
                                    <div style={{ gridColumn: 'span 2' }}>
                                        <div style={{ fontSize: 10, color: '#ef4444', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Revoke Reason</div>
                                        <div style={{ fontSize: 12, color: '#f87171' }}>{showDetail.revokedReason || '—'} <span style={{ color: '#64748b' }}>(by {showDetail.revokedByName})</span></div>
                                    </div>
                                )}
                            </div>

                            {/* Features */}
                            <div style={{ marginTop: 16 }}>
                                <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 8 }}>Features Opted</div>
                                <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr 1fr', gap: 6 }}>
                                    {FEATURE_OPTIONS.map(({ key, label, sub }) => {
                                        const enabled = showDetail.features ? showDetail.features[key] !== false : true;
                                        return (
                                            <div key={key} style={{ display: 'flex', alignItems: 'center', gap: 7, padding: '7px 10px', borderRadius: 8, background: enabled ? 'rgba(34,197,94,.08)' : 'rgba(239,68,68,.07)', border: `1px solid ${enabled ? 'rgba(34,197,94,.25)' : 'rgba(239,68,68,.2)'}` }}>
                                                <span style={{ fontSize: 13, color: enabled ? '#22c55e' : '#ef4444', flexShrink: 0 }}>{enabled ? '✓' : '✗'}</span>
                                                <span style={{ display: 'flex', flexDirection: 'column', gap: 1 }}>
                                                    <span style={{ fontSize: 11.5, fontWeight: 600, color: enabled ? '#e2e8f0' : '#64748b' }}>{label}</span>
                                                    <span style={{ fontSize: 10, color: '#3a4560' }}>{sub}</span>
                                                </span>
                                            </div>
                                        );
                                    })}
                                </div>
                            </div>

                            {/* AcceptPro binding — engine-side record */}
                            <div style={{ marginTop: 16 }}>
                                <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 8 }}>AcceptPro binding</div>
                                {(!user || (user.role !== 'super' && user.role !== 'admin')) ? (
                                    <div style={{ fontSize: 12, color: '#3a4560' }}>Engine details are visible to admins only.</div>
                                ) : !binding || binding.status === 'loading' ? (
                                    <div style={{ fontSize: 12, color: '#3a4560' }}>Loading engine record…</div>
                                ) : binding.status === 'err' ? (
                                    <div style={{ fontSize: 12, color: '#64748b' }}>No AcceptPro engine record found for this key.</div>
                                ) : (
                                    <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px 24px' }}>
                                        <div>
                                            <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Engine Status</div>
                                            <div>
                                                <span className="badge" style={{
                                                    background: binding.record.status === 'active' ? 'rgba(34,197,94,.15)' : binding.record.status === 'revoked' ? 'rgba(239,68,68,.15)' : 'rgba(100,116,139,.12)',
                                                    color: binding.record.status === 'active' ? '#22c55e' : binding.record.status === 'revoked' ? '#ef4444' : '#94a3b8',
                                                }}>
                                                    {binding.record.status}
                                                </span>
                                            </div>
                                        </div>
                                        <div>
                                            <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Activation Date</div>
                                            <div style={{ fontSize: 13, color: '#e2e8f0' }}>
                                                {binding.record.activatedAt ? fmtDate(Math.floor(binding.record.activatedAt / 1000)) : <span style={{ color: '#64748b' }}>Not yet</span>}
                                            </div>
                                        </div>
                                        <div>
                                            <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Engine Expiry</div>
                                            <div style={{ fontSize: 13, color: '#e2e8f0' }}>
                                                {binding.record.expiresAt ? fmtDate(Math.floor(binding.record.expiresAt / 1000)) : '—'}
                                            </div>
                                        </div>
                                        <div>
                                            <div style={{ fontSize: 10, color: '#4a5980', fontWeight: 600, textTransform: 'uppercase', marginBottom: 3 }}>Bound Device Code(s)</div>
                                            <div style={{ fontFamily: 'Courier New, monospace', fontSize: 11, color: '#94a3b8', wordBreak: 'break-all' }}>
                                                {(binding.record.boundDeviceCodeHashes || []).length
                                                    ? binding.record.boundDeviceCodeHashes.map(h => `${String(h).slice(0, 16)}…`).join(', ')
                                                    : '—'}
                                            </div>
                                            {binding.devices.length > 0 && (
                                                <div style={{ fontSize: 11, color: '#3a4560', marginTop: 3 }}>
                                                    {binding.devices.length} device{binding.devices.length !== 1 ? 's' : ''} activated
                                                </div>
                                            )}
                                        </div>
                                    </div>
                                )}
                            </div>
                        </div>
                        <div className="modal-footer">
                            <button className="btn btn-ghost" onClick={() => setShowDetail(null)}>Close</button>
                            <button className="btn btn-ghost" onClick={() => downloadInvoiceForLicense(showDetail)} disabled={invoiceBusy}>
                                {invoiceBusy ? 'Preparing Invoice…' : 'Download Invoice'}
                            </button>
                            <button className="btn btn-primary" onClick={() => { setShowEdit(showDetail); setEditForm({ clientName: showDetail.clientName || '', clientPhone: showDetail.clientPhone || '', clientEmail: showDetail.clientEmail || '', price: showDetail.price ?? '', notes: showDetail.notes || '', affiliateId: showDetail.affiliateId || '', affiliateName: showDetail.affiliateName || '', features: { ...DEFAULT_FEATURES, ...(showDetail.features || {}) } }); setEditErr(''); setShowDetail(null); }}>✎ Edit</button>
                        </div>
                </Modal>
            )}

            {/* ── Edit Modal ────────────────────────────────────────────── */}
            {showEdit && (
                <Modal title="✎ Edit License" onClose={() => setShowEdit(null)} maxWidth={540} busy={editBusy}>
                        <form onSubmit={updateLicense}>
                            <div className="modal-body">
                                <div className="form-row">
                                    <div className="form-group">
                                        <label className="form-label">Client Name *</label>
                                        <input className="form-input" required value={editForm.clientName}
                                            onChange={e => setEditForm(f => ({ ...f, clientName: e.target.value }))}
                                            placeholder="e.g. John Doe" autoFocus />
                                    </div>
                                    <div className="form-group">
                                        <label className="form-label">WhatsApp / Phone</label>
                                        <input className="form-input" value={editForm.clientPhone}
                                            onChange={e => setEditForm(f => ({ ...f, clientPhone: e.target.value }))}
                                            placeholder="+91 9876543210" />
                                    </div>
                                </div>
                                <div className="form-group">
                                    <label className="form-label">Email</label>
                                    <input className="form-input" type="email" value={editForm.clientEmail}
                                        onChange={e => setEditForm(f => ({ ...f, clientEmail: e.target.value }))}
                                        placeholder="client@email.com" />
                                </div>
                                <div className="form-group">
                                    <label className="form-label">Price (₹)</label>
                                    <input className="form-input" type="number" min="0" step="0.01" value={editForm.price}
                                        onChange={e => setEditForm(f => ({ ...f, price: e.target.value }))}
                                        placeholder="e.g. 999" />
                                </div>
                                {user?.role === 'super' && affiliates.length > 0 && (
                                    <div className="form-group">
                                        <label className="form-label">Referred by Affiliate</label>
                                        <select className="form-select" value={editForm.affiliateId}
                                            onChange={e => {
                                                const aff = affiliates.find(a => a.id === e.target.value);
                                                setEditForm(f => ({ ...f, affiliateId: e.target.value, affiliateName: aff ? aff.name : '' }));
                                            }}>
                                            <option value="">— None —</option>
                                            {affiliates.map(a => (
                                                <option key={a.id} value={a.id}>{a.name} ({a.commission}%)</option>
                                            ))}
                                        </select>
                                    </div>
                                )}
                                <div className="form-group">
                                    <label className="form-label">Notes</label>
                                    <textarea className="form-textarea" value={editForm.notes}
                                        onChange={e => setEditForm(f => ({ ...f, notes: e.target.value }))}
                                        placeholder="Internal notes" style={{ minHeight: 80 }} />
                                </div>
                                <div className="form-group">
                                    <label className="form-label" style={{ marginBottom: 8 }}>Features</label>
                                    <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr 1fr', gap: 8 }}>
                                        {FEATURE_OPTIONS.map(({ key, label, sub }) => (
                                            <label key={key} style={{ display: 'flex', alignItems: 'center', gap: 8, cursor: 'pointer', padding: '7px 10px', borderRadius: 8, border: '1px solid', borderColor: editForm.features[key] ? '#7c3aed' : '#252d42', background: editForm.features[key] ? 'rgba(124,58,237,.1)' : 'transparent', transition: 'all .15s', userSelect: 'none' }}>
                                                <input type="checkbox" checked={editForm.features[key] ?? true}
                                                    onChange={e => setEditForm(f => ({ ...f, features: { ...f.features, [key]: e.target.checked } }))}
                                                    style={{ accentColor: '#7c3aed', width: 14, height: 14, flexShrink: 0 }} />
                                                <span style={{ fontSize: 11.5, fontWeight: 600, color: editForm.features[key] ? '#e2e8f0' : '#4a5980' }}>{label}</span>
                                            </label>
                                        ))}
                                    </div>
                                </div>
                                {editErr && <div className="form-error">{editErr}</div>}
                            </div>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-ghost" onClick={() => setShowEdit(null)} disabled={editBusy}>Cancel</button>
                                <button type="submit" className="btn btn-primary" disabled={editBusy}>
                                    {editBusy ? 'Saving…' : 'Save Changes'}
                                </button>
                            </div>
                        </form>
                </Modal>
            )}
        </AppLayout>

        {/* ── Convert Modal ─────────────────────────────────────────── */}
        {showConvert && (
            <Modal
                title={convertedKey ? '✓ Converted to Paid Plan' : 'Convert Trial → Paid'}
                onClose={() => setShowConvert(null)}
                maxWidth={520}
                busy={convertBusy}
                backdropClose={!convertedKey}
            >

                    {convertedKey ? (
                        <div className="modal-body" style={{ display: 'flex', flexDirection: 'column', gap: 12 }}>
                            <div style={{ fontSize: 13, color: '#94a3b8' }}>
                                Trial for <strong style={{ color: '#e2e8f0' }}>{showConvert.clientName}</strong> has been converted.<br />
                                Old trial key was auto-revoked. New key:
                            </div>
                            <div style={{ background: '#161c2d', border: '1px solid #7c3aed', borderRadius: 10, padding: '14px 16px' }}>
                                <div style={{ fontSize: 11, color: '#4a5980', marginBottom: 5, fontWeight: 600 }}>NEW LICENSE KEY</div>
                                <div style={{ fontFamily: 'Courier New, monospace', fontSize: 14, color: '#a78bfa', wordBreak: 'break-all' }}>{convertedKey}</div>
                            </div>
                            <button className="btn btn-primary" onClick={() => { navigator.clipboard.writeText(convertedKey); setCopied('__conv__'); setTimeout(() => setCopied(''), 2000); }}>
                                {copied === '__conv__' ? '✓ Copied!' : 'Copy New Key'}
                            </button>
                            {convertedLicense && (
                                <button className="btn btn-ghost" onClick={() => { downloadInvoiceForLicense(convertedLicense); }} disabled={invoiceBusy}>
                                    {invoiceBusy ? 'Preparing…' : 'Download Invoice (PDF)'}
                                </button>
                            )}
                            <button className="btn btn-ghost" onClick={() => setShowConvert(null)}>Close</button>
                        </div>
                    ) : (
                        <form onSubmit={convertLicense}>
                            <div className="modal-body">
                                {/* Locked client info preview */}
                                <div style={{ background: '#0f1420', border: '1px solid #1e2640', borderRadius: 8, padding: '10px 14px', marginBottom: 14, fontSize: 12 }}>
                                    <div style={{ color: '#4a5980', marginBottom: 4, fontWeight: 600, fontSize: 11 }}>CONVERTING FROM TRIAL</div>
                                    <div><span style={{ color: '#64748b' }}>Client:</span> <strong style={{ color: '#e2e8f0' }}>{showConvert.clientName}</strong></div>
                                    {showConvert.clientPhone && <div><span style={{ color: '#64748b' }}>Phone:</span> {showConvert.clientPhone}</div>}
                                    <div style={{ marginTop: 4 }}><span style={{ color: '#64748b' }}>Machine ID:</span> <span style={{ fontFamily: 'Courier New, monospace', color: '#7c3aed', fontSize: 11 }}>{showConvert.machineId}</span></div>
                                    <div style={{ display: 'flex', alignItems: 'center', gap: 8, marginTop: 6, flexWrap: 'wrap' }}>
                                        <div style={{ color: '#f59e0b', fontSize: 11 }}>⚠ Machine ID is locked — new key will be bound to the same machine.</div>
                                        <button type="button" className="btn btn-sm btn-ghost" style={{ fontSize: 11, padding: '2px 8px' }}
                                            onClick={() => setConvertForm(f => ({ ...f, _overrideMachineId: !f._overrideMachineId, machineId: f._overrideMachineId ? showConvert.machineId : f.machineId }))}>
                                            {convertForm._overrideMachineId ? 'Use Original ID' : 'Different ID?'}
                                        </button>
                                    </div>
                                    {convertForm._overrideMachineId && (
                                        <div style={{ marginTop: 8 }}>
                                            <input className="form-input" style={{ fontFamily: 'Courier New, monospace', fontSize: 12 }}
                                                placeholder="Enter new Machine ID"
                                                value={convertForm.machineId}
                                                onChange={e => setConvertForm(f => ({ ...f, machineId: e.target.value.toUpperCase() }))}
                                            />
                                        </div>
                                    )}
                                </div>

                                <div className="form-row">
                                    <div className="form-group">
                                        <label className="form-label">New Plan *</label>
                                        <select className="form-select" value={convertForm.plan}
                                            onChange={e => setConvertForm(f => ({ ...f, plan: e.target.value }))}>
                                            {visiblePlans.filter(p => p.value !== 'trial' && p.value !== 'trial1day').map(p => (
                                                <option key={p.value} value={p.value}>{p.label}</option>
                                            ))}
                                        </select>
                                    </div>
                                    <div className="form-group">
                                        <label className="form-label">Device Limit</label>
                                        <input className="form-input" type="number" min={1} max={user?.role === 'whitelabel' ? wlMaxDevices : 255} value={convertForm.deviceLimit}
                                            onChange={e => setConvertForm(f => ({ ...f, deviceLimit: e.target.value }))} />
                                    </div>
                                </div>

                                {convertForm.plan === 'custom' && (
                                    <div className="form-group" style={{ marginTop: 10 }}>
                                        <label className="form-label">Custom Days *</label>
                                        <input className="form-input" type="number" min={1} required={convertForm.plan === 'custom'} value={convertForm.customDays}
                                            onChange={e => setConvertForm(f => ({ ...f, customDays: e.target.value }))} placeholder="e.g. 45" />
                                    </div>
                                )}

                                <div className="form-row" style={{ marginTop: 10 }}>
                                    <div className="form-group">
                                        <label className="form-label">Price (₹) *</label>
                                        <input className="form-input" type="number" min="0.01" step="0.01" required value={convertForm.price}
                                            onChange={e => setConvertForm(f => ({ ...f, price: e.target.value }))} placeholder="e.g. 999" />
                                    </div>
                                    <div className="form-group">
                                        <label className="form-label">Discounted Price (₹)</label>
                                        <input className="form-input" type="number" min="0" step="0.01" value={convertForm.discountedPrice}
                                            onChange={e => setConvertForm(f => ({ ...f, discountedPrice: e.target.value }))} placeholder="Leave blank for no discount" />
                                    </div>
                                </div>

                                <div className="form-group" style={{ marginTop: 10 }}>
                                    <label className="form-label">Notes</label>
                                    <input className="form-input" value={convertForm.notes}
                                        onChange={e => setConvertForm(f => ({ ...f, notes: e.target.value }))} placeholder="Optional" />
                                </div>

                                {convertErr && <div className="form-error" style={{ marginTop: 10 }}>{convertErr}</div>}
                            </div>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-ghost" onClick={() => setShowConvert(null)}>Cancel</button>
                                <button type="submit" className="btn btn-primary" disabled={convertBusy}>
                                    {convertBusy ? 'Converting…' : 'Convert & Generate Key'}
                                </button>
                            </div>
                        </form>
                    )}
            </Modal>
        )}
    </>
    );
}
