'use client';
import { Suspense, useEffect, useState } from 'react';
import { useSearchParams } from 'next/navigation';

const CSS = `
.ok-wrap{min-height:100vh;background:#0b1220;color:#e8eefc;font-family:system-ui,-apple-system,Segoe UI,Roboto,sans-serif;padding:40px 16px;display:flex;justify-content:center}
.ok-card{background:#111b2e;border:1px solid #1f2c47;border-radius:18px;padding:28px 22px;max-width:520px;width:100%;height:fit-content;text-align:center}
.ok-card h1{font-size:22px;margin:10px 0 6px}
.ok-card p{color:#8fa3c7;font-size:14px;line-height:1.5;margin:6px 0}
.key{font-family:ui-monospace,Menlo,Consolas,monospace;font-size:15px;word-break:break-all;background:#0b1220;border:1.5px dashed #25d366;border-radius:12px;padding:14px;margin:16px 0;color:#7dffb7}
.btn{border:0;border-radius:10px;padding:11px 18px;font-weight:700;font-size:14px;cursor:pointer;background:#25d366;color:#04140d}
.steps{text-align:left;margin:18px 0 0;padding-left:20px;color:#c4d2ee;font-size:14px;line-height:1.7}
.spin{width:38px;height:38px;border:4px solid #26355a;border-top-color:#25d366;border-radius:50%;margin:8px auto;animation:sp 1s linear infinite}
@keyframes sp{to{transform:rotate(360deg)}}
`;

function SuccessInner() {
    const sp = useSearchParams();
    const orderId = sp.get('order_id') || '';
    const [state, setState] = useState({ status: 'pending' });
    const [copied, setCopied] = useState(false);

    useEffect(() => {
        if (!orderId) { setState({ status: 'unknown' }); return; }
        let stop = false;
        let tries = 0;
        const tick = async () => {
            if (stop) return;
            tries += 1;
            try {
                const r = await fetch(`/api/checkout/status?order_id=${encodeURIComponent(orderId)}`);
                const d = await r.json();
                if (d.status === 'paid' || d.status === 'failed' || d.status === 'unknown') { setState(d); return; }
            } catch { /* keep trying */ }
            if (tries < 80) setTimeout(tick, 2500); else setState({ status: 'slow' });
        };
        tick();
        return () => { stop = true; };
    }, [orderId]);

    const copy = async () => {
        try { await navigator.clipboard.writeText(state.key); setCopied(true); setTimeout(() => setCopied(false), 2000); } catch { /* ignore */ }
    };

    return (
        <div className="ok-wrap"><style dangerouslySetInnerHTML={{ __html: CSS }} />
            <div className="ok-card">
                {state.status === 'pending' && (<><div className="spin" /><h1>Confirming your payment…</h1><p>This usually takes a few seconds. Please don&apos;t close this page.</p></>)}
                {state.status === 'paid' && (<>
                    <div style={{ fontSize: 42 }}>🎉</div>
                    <h1>Payment successful</h1>
                    <p>Your AcceptPro {state.planName} license key:</p>
                    <div className="key">{state.key}</div>
                    <button className="btn" onClick={copy}>{copied ? 'Copied ✓' : 'Copy key'}</button>
                    <ol className="steps">
                        <li>Go back to the AcceptPro app{state.mode === 'app' ? ' on your phone' : ''}.</li>
                        <li>If you bought from inside the app, it activates automatically within a few seconds.</li>
                        <li>Otherwise, paste this key on the activation screen and tap Activate.</li>
                    </ol>
                    <p style={{ marginTop: 16 }}>A copy was also sent to your email (if provided). Need help? WhatsApp +91 92177 58442.</p>
                </>)}
                {state.status === 'failed' && (<><div style={{ fontSize: 42 }}>⚠️</div><h1>Payment not completed</h1><p>No money was taken, or it will be refunded by your bank. You can try again from the Buy page.</p></>)}
                {state.status === 'slow' && (<><h1>Still confirming…</h1><p>Your bank is taking longer than usual. If money was deducted, your key will be sent to your email, or contact WhatsApp +91 92177 58442 with your order id: <b>{orderId}</b></p></>)}
                {state.status === 'unknown' && (<><h1>Order not found</h1><p>We could not find this order. If you paid, contact WhatsApp +91 92177 58442.</p></>)}
            </div>
        </div>
    );
}

export default function SuccessPage() {
    return <Suspense fallback={null}><SuccessInner /></Suspense>;
}
