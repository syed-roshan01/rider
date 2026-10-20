'use client';
import { Suspense, useEffect, useRef, useState } from 'react';
import { useSearchParams } from 'next/navigation';

const CSS = `
.buy-wrap{min-height:100vh;background:#0b1220;color:#e8eefc;font-family:system-ui,-apple-system,Segoe UI,Roboto,sans-serif;padding:28px 16px 60px}
.buy-in{max-width:1040px;margin:0 auto}
.buy-h{text-align:center;margin-bottom:26px}
.buy-h h1{font-size:28px;margin:0 0 6px}
.buy-h p{margin:0;color:#8fa3c7;font-size:14px}
.buy-grid{display:grid;grid-template-columns:repeat(3,1fr);gap:14px;margin-bottom:22px}
.plan{position:relative;display:flex;flex-direction:column;justify-content:flex-start;align-items:stretch;text-align:left;background:#111b2e;border:2px solid #1f2c47;border-radius:16px;padding:20px 18px;cursor:pointer;color:inherit;font:inherit;transition:border-color .15s,transform .15s}
.plan:hover{transform:translateY(-2px)}
.plan.sel{border-color:#25d366;background:#0f2a24}
.plan .pop{position:absolute;top:-11px;right:14px;background:#25d366;color:#04140d;font-size:11px;font-weight:700;padding:3px 10px;border-radius:99px}
.plan h3{margin:0 0 4px;font-size:18px}
.plan .pr{font-size:30px;font-weight:800;margin:6px 0 2px}
.plan .pr small{font-size:13px;font-weight:500;color:#8fa3c7}
.plan ul{list-style:none;padding:0;margin:12px 0 0;display:grid;gap:7px;font-size:13.5px;color:#c4d2ee}
.plan li::before{content:'\\2713';color:#25d366;font-weight:700;margin-right:8px}
.card{background:#111b2e;border:1px solid #1f2c47;border-radius:16px;padding:22px 20px;max-width:560px;margin:0 auto}
.card h2{margin:0 0 14px;font-size:18px}
.fld{margin-bottom:14px}
.fld label{display:block;font-size:12.5px;color:#8fa3c7;margin-bottom:5px}
.fld input{width:100%;box-sizing:border-box;background:#0b1220;border:1.5px solid #26355a;border-radius:10px;color:#e8eefc;padding:11px 12px;font-size:15px;outline:none}
.fld input:focus{border-color:#25d366}
.fld .hint{font-size:12px;color:#8fa3c7;margin-top:5px}
.row2{display:grid;grid-template-columns:1fr 1fr;gap:12px}
.pay{width:100%;border:0;border-radius:12px;padding:14px;font-size:16px;font-weight:700;cursor:pointer;background:linear-gradient(135deg,#47d98d,#2eb878);color:#04140d}
.pay:disabled{opacity:.5;cursor:not-allowed}
.err{background:#3a1520;border:1px solid #7a2438;color:#ffb3c0;padding:10px 12px;border-radius:10px;font-size:13.5px;margin-bottom:14px}
.note{text-align:center;color:#6f84ab;font-size:12.5px;margin-top:14px}
@media(max-width:820px){.buy-grid{grid-template-columns:1fr}.row2{grid-template-columns:1fr}.buy-h h1{font-size:23px}}
`;

function BuyInner() {
    const sp = useSearchParams();
    const [plans, setPlans] = useState([]);
    const [enabled, setEnabled] = useState(true);
    const [sdkMode, setSdkMode] = useState('sandbox');
    const [planId, setPlanId] = useState(sp.get('plan') || 'pro');
    const [mode] = useState(sp.get('mode') === 'app' ? 'app' : 'desktop');
    const [form, setForm] = useState({ name: '', phone: '', email: '', machineId: (sp.get('machineId') || '').toUpperCase() });
    const [error, setError] = useState('');
    const [busy, setBusy] = useState(false);
    const sdkRef = useRef(null);

    useEffect(() => {
        fetch('/api/checkout/plans').then(r => r.json()).then(d => {
            setPlans(d.plans || []);
            setEnabled(d.enabled !== false);
            setSdkMode(d.mode || 'sandbox');
        }).catch(() => setError('Could not load plans. Please refresh.'));
        const s = document.createElement('script');
        s.src = 'https://sdk.cashfree.com/js/v3/cashfree.js';
        s.async = true;
        document.body.appendChild(s);
        return () => { try { document.body.removeChild(s); } catch { /* ignore */ } };
    }, []);

    const set = (k) => (e) => setForm(f => ({ ...f, [k]: k === 'machineId' ? e.target.value.toUpperCase().replace(/[^0-9A-Z-]/g, '') : e.target.value }));
    const plan = plans.find(p => p.id === planId);
    const locked = !!sp.get('machineId'); // opened from the app: machine id is pre-filled

    async function pay(e) {
        e.preventDefault();
        setError('');
        // Loose client-side check only (the server validates strictly): the
        // Device ID is accepted with any hyphenation and normalized to its
        // 15 alphanumeric characters.
        const deviceId = String(form.machineId || '').toUpperCase().replace(/[^0-9A-Z]/g, '');
        if (deviceId.length !== 15) {
            setError('Machine ID must be the 15-character Device ID shown in the app');
            return;
        }
        setBusy(true);
        try {
            const res = await fetch('/api/checkout/create-order', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ planId, mode, ...form }),
            });
            const data = await res.json();
            if (!res.ok) throw new Error(data.error || 'Could not start the payment');
            if (!window.Cashfree) throw new Error('Payment window did not load. Check your connection and try again.');
            sdkRef.current = sdkRef.current || window.Cashfree({ mode: data.mode || sdkMode });
            await sdkRef.current.checkout({ paymentSessionId: data.paymentSessionId, redirectTarget: '_self' });
        } catch (err) {
            setError(err.message);
            setBusy(false);
        }
    }

    return (
        <div className="buy-wrap">
            <style dangerouslySetInnerHTML={{ __html: CSS }} />
            <div className="buy-in">
                <div className="buy-h">
                    <h1>Get your AcceptPro license</h1>
                    <p>Pay once for a year. Your key is delivered instantly — no waiting.</p>
                </div>

                <div className="buy-grid">
                    {plans.map(p => (
                        <button type="button" key={p.id} className={`plan${p.id === planId ? ' sel' : ''}`} onClick={() => setPlanId(p.id)}>
                            {p.popular && <span className="pop">MOST POPULAR</span>}
                            <h3>{p.name}</h3>
                            <div className="pr">₹{p.price.toLocaleString('en-IN')} <small>/ year</small></div>
                            <ul>{p.highlights.map(h => <li key={h}>{h}</li>)}</ul>
                        </button>
                    ))}
                </div>

                <p className="note" style={{ marginTop: 0, marginBottom: 18 }}>
                    Need more devices or extra features? <a href="https://wa.me/919217758442?text=Hi%2C%20I%20need%20more%20devices%20or%20features%20for%20AcceptPro" style={{ color: '#25d366' }}>Contact support</a>
                </p>

                <form className="card" onSubmit={pay}>
                    <h2>Your details {plan ? `· ${plan.name}` : ''}</h2>
                    {!enabled && <div className="err">Online payment is being set up. Please contact support on WhatsApp +91 92177 58442.</div>}
                    {error && <div className="err">{error}</div>}
                    <div className="fld">
                        <label>Machine ID (shown in the AcceptPro app{mode === 'app' ? ' on your phone' : ''})</label>
                        <input value={form.machineId} onChange={set('machineId')} readOnly={locked} placeholder="e.g. 56F04B1E640F4A2E" maxLength={17} inputMode="text" autoCapitalize="characters" />
                        <div className="hint">{locked ? 'Filled in from the app.' : 'Open AcceptPro → Device activation screen → copy the 15-character Device ID. Your key works only on this device.'}</div>
                    </div>
                    <div className="fld"><label>Full name</label><input value={form.name} onChange={set('name')} placeholder="Your name" /></div>
                    <div className="row2">
                        <div className="fld"><label>WhatsApp / phone number</label><input value={form.phone} onChange={set('phone')} placeholder="919876543210" inputMode="tel" /></div>
                        <div className="fld"><label>Email (for your receipt &amp; key)</label><input value={form.email} onChange={set('email')} placeholder="you@example.com" inputMode="email" /></div>
                    </div>
                    <button className="pay" disabled={busy || !enabled || !plan}>
                        {busy ? 'Opening secure payment…' : plan ? `Pay ₹${plan.price.toLocaleString('en-IN')} securely` : 'Choose a plan'}
                    </button>
                    <div className="note">Secure payment by Cashfree · UPI, cards &amp; netbanking</div>
                </form>
            </div>
        </div>
    );
}

export default function BuyPage() {
    return <Suspense fallback={null}><BuyInner /></Suspense>;
}
