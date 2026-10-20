package o2;

import android.content.Context;
import android.view.View;
import android.view.Window;
import m0.n1;
import m0.o3;
import m0.x1;
import t.o0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends u1.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Window f12483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n1 f12484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12486s;

    public n(Context context, Window window) {
        super(context);
        this.f12483p = window;
        this.f12484q = d7.t.g0(l.f12481a, o3.f11621a);
    }

    @Override // u1.a
    public final void a(m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(1735448596);
        ((c9.e) this.f12484q.getValue()).invoke(qVar, 0);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new o0(this, i10, 5);
        }
    }

    @Override // u1.a
    public final void d(int i10, int i11, int i12, int i13, boolean z10) {
        View childAt;
        super.d(i10, i11, i12, i13, z10);
        if (this.f12485r || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f12483p.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // u1.a
    public final void e(int i10, int i11) {
        if (this.f12485r) {
            super.e(i10, i11);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(d7.t.p0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(d7.t.p0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // u1.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12486s;
    }
}
