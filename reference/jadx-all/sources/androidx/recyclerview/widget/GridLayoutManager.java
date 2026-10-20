package androidx.recyclerview.widget;

import a4.e0;
import a4.f0;
import a4.l0;
import a4.n;
import a4.o0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import l.q;
import m0.z1;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f2229q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f2228p = -1;
        new SparseIntArray();
        new SparseIntArray();
        z1 z1Var = new z1();
        this.f2229q = z1Var;
        new Rect();
        int i12 = e0.x(context, attributeSet, i10, i11).f1085b;
        if (i12 == this.f2228p) {
            return;
        }
        if (i12 < 1) {
            throw new IllegalArgumentException(q.g("Span count should be at least 1. Provided ", i12));
        }
        this.f2228p = i12;
        z1Var.b();
        I();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.R(false);
    }

    public final int S(int i10, l0 l0Var, o0 o0Var) {
        boolean z10 = o0Var.f1169d;
        z1 z1Var = this.f2229q;
        if (!z10) {
            int i11 = this.f2228p;
            z1Var.getClass();
            return z1.a(i10, i11);
        }
        int iA = l0Var.a(i10);
        if (iA != -1) {
            int i12 = this.f2228p;
            z1Var.getClass();
            return z1.a(iA, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // a4.e0
    public final boolean d(f0 f0Var) {
        return f0Var instanceof n;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, a4.e0
    public final f0 l() {
        return this.f2230h == 0 ? new n(-2, -1) : new n(-1, -2);
    }

    @Override // a4.e0
    public final f0 m(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    @Override // a4.e0
    public final f0 n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
    }

    @Override // a4.e0
    public final int q(l0 l0Var, o0 o0Var) {
        if (this.f2230h == 1) {
            return this.f2228p;
        }
        if (o0Var.a() < 1) {
            return 0;
        }
        return S(o0Var.a() - 1, l0Var, o0Var) + 1;
    }

    @Override // a4.e0
    public final int y(l0 l0Var, o0 o0Var) {
        if (this.f2230h == 0) {
            return this.f2228p;
        }
        if (o0Var.a() < 1) {
            return 0;
        }
        return S(o0Var.a() - 1, l0Var, o0Var) + 1;
    }
}
