package androidx.recyclerview.widget;

import a4.a1;
import a4.d0;
import a4.e0;
import a4.f;
import a4.f0;
import a4.l0;
import a4.o;
import a4.o0;
import a4.q;
import a4.t;
import a4.t0;
import a4.v0;
import a4.w0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b3.c0;
import b3.q0;
import java.lang.reflect.Field;
import java.util.BitSet;
import java.util.List;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0[] f2276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f2277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f2278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2281n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a1 f2282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v0 f2284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f2286s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2275h = -1;
        this.f2280m = false;
        a1 a1Var = new a1(1);
        this.f2282o = a1Var;
        this.f2283p = 2;
        new Rect();
        new q(this);
        this.f2285r = true;
        this.f2286s = new f(this, 1);
        d0 d0VarX = e0.x(context, attributeSet, i10, i11);
        int i12 = d0VarX.f1084a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i12 != this.f2279l) {
            this.f2279l = i12;
            t tVar = this.f2277j;
            this.f2277j = this.f2278k;
            this.f2278k = tVar;
            I();
        }
        int i13 = d0VarX.f1085b;
        a(null);
        if (i13 != this.f2275h) {
            a1Var.a();
            I();
            this.f2275h = i13;
            new BitSet(this.f2275h);
            this.f2276i = new w0[this.f2275h];
            for (int i14 = 0; i14 < this.f2275h; i14++) {
                this.f2276i[i14] = new w0(this, i14);
            }
            I();
        }
        boolean z10 = d0VarX.f1086c;
        a(null);
        v0 v0Var = this.f2284q;
        if (v0Var != null && v0Var.f1202o != z10) {
            v0Var.f1202o = z10;
        }
        this.f2280m = z10;
        I();
        o oVar = new o();
        oVar.f1164a = 0;
        oVar.f1165b = 0;
        this.f2277j = t.a(this, this.f2279l);
        this.f2278k = t.a(this, 1 - this.f2279l);
    }

    @Override // a4.e0
    public final void A(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1100b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2286s);
        }
        for (int i10 = 0; i10 < this.f2275h; i10++) {
            this.f2276i[i10].b();
        }
        recyclerView.requestLayout();
    }

    @Override // a4.e0
    public final void B(AccessibilityEvent accessibilityEvent) {
        super.B(accessibilityEvent);
        if (p() > 0) {
            View viewP = P(false);
            View viewO = O(false);
            if (viewP == null || viewO == null) {
                return;
            }
            ((f0) viewP.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // a4.e0
    public final void C(Parcelable parcelable) {
        if (parcelable instanceof v0) {
            this.f2284q = (v0) parcelable;
            I();
        }
    }

    @Override // a4.e0
    public final Parcelable D() {
        int[] iArr;
        v0 v0Var = this.f2284q;
        if (v0Var != null) {
            v0 v0Var2 = new v0();
            v0Var2.f1197c = v0Var.f1197c;
            v0Var2.f1195a = v0Var.f1195a;
            v0Var2.f1196b = v0Var.f1196b;
            v0Var2.f1198d = v0Var.f1198d;
            v0Var2.f1199e = v0Var.f1199e;
            v0Var2.f1200f = v0Var.f1200f;
            v0Var2.f1202o = v0Var.f1202o;
            v0Var2.f1203p = v0Var.f1203p;
            v0Var2.f1204q = v0Var.f1204q;
            v0Var2.f1201n = v0Var.f1201n;
            return v0Var2;
        }
        v0 v0Var3 = new v0();
        v0Var3.f1202o = this.f2280m;
        v0Var3.f1203p = false;
        v0Var3.f1204q = false;
        a1 a1Var = this.f2282o;
        if (a1Var == null || (iArr = (int[]) a1Var.f1071b) == null) {
            v0Var3.f1199e = 0;
        } else {
            v0Var3.f1200f = iArr;
            v0Var3.f1199e = iArr.length;
            v0Var3.f1201n = (List) a1Var.f1072c;
        }
        if (p() > 0) {
            Q();
            v0Var3.f1195a = 0;
            View viewO = this.f2281n ? O(true) : P(true);
            if (viewO != null) {
                ((f0) viewO.getLayoutParams()).getClass();
                throw null;
            }
            v0Var3.f1196b = -1;
            int i10 = this.f2275h;
            v0Var3.f1197c = i10;
            v0Var3.f1198d = new int[i10];
            for (int i11 = 0; i11 < this.f2275h; i11++) {
                int iD = this.f2276i[i11].d(Integer.MIN_VALUE);
                if (iD != Integer.MIN_VALUE) {
                    iD -= this.f2277j.e();
                }
                v0Var3.f1198d[i11] = iD;
            }
        } else {
            v0Var3.f1195a = -1;
            v0Var3.f1196b = -1;
            v0Var3.f1197c = 0;
        }
        return v0Var3;
    }

    @Override // a4.e0
    public final void E(int i10) {
        if (i10 == 0) {
            K();
        }
    }

    public final boolean K() {
        if (p() != 0 && this.f2283p != 0 && this.f1103e) {
            if (this.f2281n) {
                R();
                Q();
            } else {
                Q();
                R();
            }
            View viewS = S();
            a1 a1Var = this.f2282o;
            if (viewS != null) {
                a1Var.a();
                I();
                return true;
            }
        }
        return false;
    }

    public final int L(o0 o0Var) {
        if (p() == 0) {
            return 0;
        }
        t tVar = this.f2277j;
        boolean z10 = this.f2285r;
        return e.P(o0Var, tVar, P(!z10), O(!z10), this, this.f2285r);
    }

    public final void M(o0 o0Var) {
        if (p() == 0) {
            return;
        }
        boolean z10 = !this.f2285r;
        View viewP = P(z10);
        View viewO = O(z10);
        if (p() == 0 || o0Var.a() == 0 || viewP == null || viewO == null) {
            return;
        }
        ((f0) viewP.getLayoutParams()).getClass();
        throw null;
    }

    public final int N(o0 o0Var) {
        if (p() == 0) {
            return 0;
        }
        t tVar = this.f2277j;
        boolean z10 = this.f2285r;
        return e.Q(o0Var, tVar, P(!z10), O(!z10), this, this.f2285r);
    }

    public final View O(boolean z10) {
        int iE = this.f2277j.e();
        int iD = this.f2277j.d();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iC = this.f2277j.c(viewO);
            int iB = this.f2277j.b(viewO);
            if (iB > iE && iC < iD) {
                if (iB <= iD || !z10) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View P(boolean z10) {
        int iE = this.f2277j.e();
        int iD = this.f2277j.d();
        int iP = p();
        View view = null;
        for (int i10 = 0; i10 < iP; i10++) {
            View viewO = o(i10);
            int iC = this.f2277j.c(viewO);
            if (this.f2277j.b(viewO) > iE && iC < iD) {
                if (iC >= iE || !z10) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void Q() {
        if (p() == 0) {
            return;
        }
        e0.w(o(0));
        throw null;
    }

    public final void R() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        e0.w(o(iP - 1));
        throw null;
    }

    public final View S() {
        int iP = p();
        int i10 = iP - 1;
        new BitSet(this.f2275h).set(0, this.f2275h, true);
        if (this.f2279l == 1) {
            T();
        }
        if (this.f2281n) {
            iP = -1;
        } else {
            i10 = 0;
        }
        if (i10 == iP) {
            return null;
        }
        ((t0) o(i10).getLayoutParams()).getClass();
        throw null;
    }

    public final boolean T() {
        RecyclerView recyclerView = this.f1100b;
        Field field = q0.f2670a;
        return c0.d(recyclerView) == 1;
    }

    @Override // a4.e0
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2284q != null || (recyclerView = this.f1100b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // a4.e0
    public final boolean b() {
        return this.f2279l == 0;
    }

    @Override // a4.e0
    public final boolean c() {
        return this.f2279l == 1;
    }

    @Override // a4.e0
    public final boolean d(f0 f0Var) {
        return f0Var instanceof t0;
    }

    @Override // a4.e0
    public final int f(o0 o0Var) {
        return L(o0Var);
    }

    @Override // a4.e0
    public final void g(o0 o0Var) {
        M(o0Var);
    }

    @Override // a4.e0
    public final int h(o0 o0Var) {
        return N(o0Var);
    }

    @Override // a4.e0
    public final int i(o0 o0Var) {
        return L(o0Var);
    }

    @Override // a4.e0
    public final void j(o0 o0Var) {
        M(o0Var);
    }

    @Override // a4.e0
    public final int k(o0 o0Var) {
        return N(o0Var);
    }

    @Override // a4.e0
    public final f0 l() {
        return this.f2279l == 0 ? new t0(-2, -1) : new t0(-1, -2);
    }

    @Override // a4.e0
    public final f0 m(Context context, AttributeSet attributeSet) {
        return new t0(context, attributeSet);
    }

    @Override // a4.e0
    public final f0 n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t0((ViewGroup.MarginLayoutParams) layoutParams) : new t0(layoutParams);
    }

    @Override // a4.e0
    public final int q(l0 l0Var, o0 o0Var) {
        if (this.f2279l == 1) {
            return this.f2275h;
        }
        super.q(l0Var, o0Var);
        return 1;
    }

    @Override // a4.e0
    public final int y(l0 l0Var, o0 o0Var) {
        if (this.f2279l == 0) {
            return this.f2275h;
        }
        super.y(l0Var, o0Var);
        return 1;
    }

    @Override // a4.e0
    public final boolean z() {
        return this.f2283p != 0;
    }
}
