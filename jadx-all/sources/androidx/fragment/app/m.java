package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1970e;

    public m(s1 s1Var, x2.g gVar, boolean z10, boolean z11) {
        super(s1Var, gVar);
        int i10 = s1Var.f2023a;
        d0 d0Var = s1Var.f2025c;
        if (i10 == 2) {
            this.f1968c = z10 ? d0Var.getReenterTransition() : d0Var.getEnterTransition();
            this.f1969d = z10 ? d0Var.getAllowReturnTransitionOverlap() : d0Var.getAllowEnterTransitionOverlap();
        } else {
            this.f1968c = z10 ? d0Var.getReturnTransition() : d0Var.getExitTransition();
            this.f1969d = true;
        }
        if (!z11) {
            this.f1970e = null;
        } else if (z10) {
            this.f1970e = d0Var.getSharedElementReturnTransition();
        } else {
            this.f1970e = d0Var.getSharedElementEnterTransition();
        }
    }

    public final o1 c(Object obj) {
        if (obj == null) {
            return null;
        }
        m1 m1Var = h1.f1933a;
        if (obj instanceof Transition) {
            return m1Var;
        }
        o1 o1Var = h1.f1934b;
        if (o1Var != null && o1Var.e(obj)) {
            return o1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1964a.f2025c + " is not a valid framework Transition or AndroidX Transition");
    }
}
