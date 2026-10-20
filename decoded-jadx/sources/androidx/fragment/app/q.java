package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f1994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1995b;

    public q(r rVar, j0 j0Var) {
        this.f1995b = rVar;
        this.f1994a = j0Var;
    }

    @Override // androidx.fragment.app.j0
    public final View b(int i10) {
        j0 j0Var = this.f1994a;
        if (j0Var.c()) {
            return j0Var.b(i10);
        }
        Dialog dialog = this.f1995b.f2010q;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.j0
    public final boolean c() {
        return this.f1994a.c() || this.f1995b.f2014u;
    }
}
