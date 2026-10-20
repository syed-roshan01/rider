package g8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends e8.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.o0 f7301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.j0 f7302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f7303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e8.p1 f7304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e8.b0 f7305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e8.h f7306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e8.k f7307g;

    public z2(e8.o0 o0Var, e3 e3Var, Executor executor, e8.p1 p1Var, e8.h hVar) {
        this.f7301a = o0Var;
        this.f7302b = e3Var;
        this.f7304d = p1Var;
        Executor executor2 = hVar.f5268b;
        executor = executor2 != null ? executor2 : executor;
        this.f7303c = executor;
        e8.g gVarB = e8.h.b(hVar);
        gVarB.f5249b = executor;
        this.f7306f = new e8.h(gVarB);
        this.f7305e = e8.b0.b();
    }

    @Override // e8.i0, e8.k
    public final void cancel(String str, Throwable th) {
        e8.k kVar = this.f7307g;
        if (kVar != null) {
            kVar.cancel(str, th);
        }
    }

    @Override // e8.i0
    public final e8.k delegate() {
        return this.f7307g;
    }

    @Override // e8.i0, e8.k
    public final void start(e8.j jVar, e8.l1 l1Var) {
        e8.h hVar = this.f7306f;
        e8.p1 p1Var = this.f7304d;
        y3.e.J(p1Var, FirebaseAnalytics.Param.METHOD);
        y3.e.J(l1Var, "headers");
        y3.e.J(hVar, "callOptions");
        l.z2 z2VarA = this.f7301a.a();
        e8.c2 c2Var = (e8.c2) z2VarA.f10983b;
        if (!c2Var.e()) {
            this.f7303c.execute(new d0(this, jVar, s1.h(c2Var)));
            this.f7307g = l3.i0;
            return;
        }
        a7.a.w(z2VarA.f10985d);
        s3 s3Var = (s3) z2VarA.f10984c;
        s3Var.getClass();
        q3 q3Var = (q3) s3Var.f7104b.get(p1Var.f5334b);
        if (q3Var == null) {
            q3Var = (q3) s3Var.f7105c.get(p1Var.f5335c);
        }
        if (q3Var == null) {
            q3Var = s3Var.f7103a;
        }
        if (q3Var != null) {
            this.f7306f = this.f7306f.c(q3.f7054g, q3Var);
        }
        e8.k kVarM = this.f7302b.m(p1Var, this.f7306f);
        this.f7307g = kVarM;
        kVarM.start(jVar, l1Var);
    }
}
