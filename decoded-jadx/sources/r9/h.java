package r9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.a2;
import m9.e0;
import m9.l0;
import m9.w0;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class h extends l0 implements w8.d, u8.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13701o = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f13702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u8.e f13703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13704f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f13705n;

    public h(z zVar, u8.e eVar) {
        super(-1);
        this.f13702d = zVar;
        this.f13703e = eVar;
        this.f13704f = a.f13690c;
        this.f13705n = a.s(eVar.getContext());
    }

    @Override // m9.l0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof m9.v) {
            ((m9.v) obj).f12009b.invoke(cancellationException);
        }
    }

    @Override // m9.l0
    public final u8.e e() {
        return this;
    }

    @Override // w8.d
    public final w8.d getCallerFrame() {
        u8.e eVar = this.f13703e;
        if (eVar instanceof w8.d) {
            return (w8.d) eVar;
        }
        return null;
    }

    @Override // u8.e
    public final u8.j getContext() {
        return this.f13703e.getContext();
    }

    @Override // m9.l0
    public final Object i() {
        Object obj = this.f13704f;
        this.f13704f = a.f13690c;
        return obj;
    }

    @Override // u8.e
    public final void resumeWith(Object obj) {
        u8.e eVar = this.f13703e;
        u8.j context = eVar.getContext();
        Throwable thA = q8.h.a(obj);
        Object uVar = thA == null ? obj : new m9.u(thA, false);
        z zVar = this.f13702d;
        if (zVar.d0()) {
            this.f13704f = uVar;
            this.f11963c = 0;
            zVar.c0(context, this);
            return;
        }
        w0 w0VarA = a2.a();
        if (w0VarA.j0()) {
            this.f13704f = uVar;
            this.f11963c = 0;
            w0VarA.g0(this);
            return;
        }
        w0VarA.i0(true);
        try {
            u8.j context2 = eVar.getContext();
            Object objT = a.t(context2, this.f13705n);
            try {
                eVar.resumeWith(obj);
                a.k(context2, objT);
                while (w0VarA.l0()) {
                }
            } catch (Throwable th) {
                a.k(context2, objT);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2, null);
            } finally {
                w0VarA.f0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f13702d + ", " + e0.M(this.f13703e) + ']';
    }
}
