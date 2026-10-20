package b3;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u1 f2674b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f2675a;

    static {
        l1 j1Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            j1Var = new k1();
        } else {
            j1Var = i10 >= 29 ? new j1() : new i1();
        }
        f2674b = j1Var.b().f2683a.a().f2683a.b().f2683a.c();
    }

    public r1(u1 u1Var) {
        this.f2675a = u1Var;
    }

    public u1 a() {
        return this.f2675a;
    }

    public u1 b() {
        return this.f2675a;
    }

    public u1 c() {
        return this.f2675a;
    }

    public void d(View view) {
    }

    public f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return o() == r1Var.o() && n() == r1Var.n() && a3.b.a(k(), r1Var.k()) && a3.b.a(i(), r1Var.i()) && a3.b.a(e(), r1Var.e());
    }

    public u2.c f(int i10) {
        return u2.c.f15394e;
    }

    public u2.c g(int i10) {
        if ((i10 & 8) == 0) {
            return u2.c.f15394e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public u2.c h() {
        return k();
    }

    public int hashCode() {
        return a3.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public u2.c i() {
        return u2.c.f15394e;
    }

    public u2.c j() {
        return k();
    }

    public u2.c k() {
        return u2.c.f15394e;
    }

    public u2.c l() {
        return k();
    }

    public u1 m(int i10, int i11, int i12, int i13) {
        return f2674b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void q(u2.c[] cVarArr) {
    }

    public void r(u1 u1Var) {
    }

    public void s(u2.c cVar) {
    }
}
