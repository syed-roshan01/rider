package y0;

import m9.a0;
import m9.d0;
import m9.f1;
import m9.i1;
import t.y0;
import t1.c1;
import t1.g1;
import u1.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements t1.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r9.e f16731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16732c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f16734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f16735f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g1 f16736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c1 f16737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16742t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f16730a = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16733d = -1;

    public void A0() {
    }

    public void B0() {
    }

    public void C0() {
        if (!this.f16742t) {
            throw new IllegalStateException("reset() called on an unattached node".toString());
        }
        B0();
    }

    public void D0() {
        if (!this.f16742t) {
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }
        if (!this.f16740r) {
            throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
        }
        this.f16740r = false;
        z0();
        this.f16741s = true;
    }

    public void E0() {
        if (!this.f16742t) {
            throw new IllegalStateException("node detached multiple times".toString());
        }
        if (this.f16737o == null) {
            throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
        }
        if (!this.f16741s) {
            throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
        }
        this.f16741s = false;
        A0();
    }

    public void F0(c1 c1Var) {
        this.f16737o = c1Var;
    }

    public final d0 v0() {
        r9.e eVar = this.f16731b;
        if (eVar != null) {
            return eVar;
        }
        r9.e eVarB = d7.a.b(((w) t1.g.A(this)).getCoroutineContext().O(new i1((f1) ((w) t1.g.A(this)).getCoroutineContext().f(a0.f11902b))));
        this.f16731b = eVarB;
        return eVarB;
    }

    public boolean w0() {
        return !(this instanceof b1.j);
    }

    public void x0() {
        if (!(!this.f16742t)) {
            throw new IllegalStateException("node attached multiple times".toString());
        }
        if (this.f16737o == null) {
            throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
        }
        this.f16742t = true;
        this.f16740r = true;
    }

    public void y0() {
        if (!this.f16742t) {
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }
        if (!(!this.f16740r)) {
            throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
        }
        if (!(!this.f16741s)) {
            throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
        }
        this.f16742t = false;
        r9.e eVar = this.f16731b;
        if (eVar != null) {
            d7.a.i(eVar, new y0(3));
            this.f16731b = null;
        }
    }

    public void z0() {
    }
}
