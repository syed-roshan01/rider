package g8;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 extends e8.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.c1 f6979a;

    public n1(l3 l3Var) {
        this.f6979a = l3Var;
    }

    @Override // e8.j0
    public final String g() {
        return this.f6979a.g();
    }

    @Override // e8.j0
    public final e8.k m(e8.p1 p1Var, e8.h hVar) {
        return this.f6979a.m(p1Var, hVar);
    }

    @Override // e8.c1
    public final boolean s(long j10, TimeUnit timeUnit) {
        return this.f6979a.s(j10, timeUnit);
    }

    @Override // e8.c1
    public final void t() {
        this.f6979a.t();
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f6979a, "delegate");
        return gVarJ0.toString();
    }

    @Override // e8.c1
    public final e8.x u() {
        return this.f6979a.u();
    }

    @Override // e8.c1
    public final void v(e8.x xVar, com.google.firebase.firestore.remote.f fVar) {
        this.f6979a.v(xVar, fVar);
    }
}
