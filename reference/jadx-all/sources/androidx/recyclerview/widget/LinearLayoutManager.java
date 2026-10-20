package androidx.recyclerview.widget;

import a4.d0;
import a4.e0;
import a4.f0;
import a4.o0;
import a4.p;
import a4.q;
import a4.r;
import a4.s;
import a4.t;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f2231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f2232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2234l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2235m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2236n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r f2237o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2230h = 1;
        this.f2233k = false;
        new p().a();
        d0 d0VarX = e0.x(context, attributeSet, i10, i11);
        int i12 = d0VarX.f1084a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException(l.q.g("invalid orientation:", i12));
        }
        a(null);
        if (i12 != this.f2230h || this.f2232j == null) {
            this.f2232j = t.a(this, i12);
            this.f2230h = i12;
            I();
        }
        boolean z10 = d0VarX.f1086c;
        a(null);
        if (z10 != this.f2233k) {
            this.f2233k = z10;
            I();
        }
        R(d0VarX.f1087d);
    }

    @Override // a4.e0
    public final void A(RecyclerView recyclerView) {
    }

    @Override // a4.e0
    public final void B(AccessibilityEvent accessibilityEvent) {
        super.B(accessibilityEvent);
        if (p() > 0) {
            View viewQ = Q(0, p(), false);
            if (viewQ != null) {
                ((f0) viewQ.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewQ2 = Q(p() - 1, -1, false);
            if (viewQ2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((f0) viewQ2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // a4.e0
    public final void C(Parcelable parcelable) {
        if (parcelable instanceof r) {
            this.f2237o = (r) parcelable;
            I();
        }
    }

    @Override // a4.e0
    public final Parcelable D() {
        r rVar = this.f2237o;
        if (rVar != null) {
            r rVar2 = new r();
            rVar2.f1183a = rVar.f1183a;
            rVar2.f1184b = rVar.f1184b;
            rVar2.f1185c = rVar.f1185c;
            return rVar2;
        }
        r rVar3 = new r();
        if (p() <= 0) {
            rVar3.f1183a = -1;
            return rVar3;
        }
        N();
        boolean z10 = this.f2234l;
        rVar3.f1185c = z10;
        if (!z10) {
            e0.w(o(z10 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z10 ? 0 : p() - 1);
        rVar3.f1184b = this.f2232j.d() - this.f2232j.b(viewO);
        ((f0) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int K(o0 o0Var) {
        if (p() == 0) {
            return 0;
        }
        N();
        s sVar = this.f2232j;
        boolean z10 = !this.f2236n;
        return e.P(o0Var, sVar, P(z10), O(z10), this, this.f2236n);
    }

    public final void L(o0 o0Var) {
        if (p() == 0) {
            return;
        }
        N();
        boolean z10 = !this.f2236n;
        View viewP = P(z10);
        View viewO = O(z10);
        if (p() == 0 || o0Var.a() == 0 || viewP == null || viewO == null) {
            return;
        }
        ((f0) viewP.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(o0 o0Var) {
        if (p() == 0) {
            return 0;
        }
        N();
        s sVar = this.f2232j;
        boolean z10 = !this.f2236n;
        return e.Q(o0Var, sVar, P(z10), O(z10), this, this.f2236n);
    }

    public final void N() {
        if (this.f2231i == null) {
            this.f2231i = new q();
        }
    }

    public final View O(boolean z10) {
        return this.f2234l ? Q(0, p(), z10) : Q(p() - 1, -1, z10);
    }

    public final View P(boolean z10) {
        return this.f2234l ? Q(p() - 1, -1, z10) : Q(0, p(), z10);
    }

    public final View Q(int i10, int i11, boolean z10) {
        N();
        int i12 = z10 ? 24579 : 320;
        return this.f2230h == 0 ? this.f1101c.b(i10, i11, i12, 320) : this.f1102d.b(i10, i11, i12, 320);
    }

    public void R(boolean z10) {
        a(null);
        if (this.f2235m == z10) {
            return;
        }
        this.f2235m = z10;
        I();
    }

    @Override // a4.e0
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2237o != null || (recyclerView = this.f1100b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // a4.e0
    public final boolean b() {
        return this.f2230h == 0;
    }

    @Override // a4.e0
    public final boolean c() {
        return this.f2230h == 1;
    }

    @Override // a4.e0
    public final int f(o0 o0Var) {
        return K(o0Var);
    }

    @Override // a4.e0
    public final void g(o0 o0Var) {
        L(o0Var);
    }

    @Override // a4.e0
    public final int h(o0 o0Var) {
        return M(o0Var);
    }

    @Override // a4.e0
    public final int i(o0 o0Var) {
        return K(o0Var);
    }

    @Override // a4.e0
    public final void j(o0 o0Var) {
        L(o0Var);
    }

    @Override // a4.e0
    public final int k(o0 o0Var) {
        return M(o0Var);
    }

    @Override // a4.e0
    public f0 l() {
        return new f0(-2, -2);
    }

    @Override // a4.e0
    public final boolean z() {
        return true;
    }
}
