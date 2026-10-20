package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2044b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f2045c;

    public w0(x0 x0Var, int i10) {
        this.f2045c = x0Var;
        this.f2043a = i10;
    }

    @Override // androidx.fragment.app.v0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        x0 x0Var = this.f2045c;
        d0 d0Var = x0Var.f2070w;
        int i10 = this.f2043a;
        if (d0Var == null || i10 >= 0 || !d0Var.getChildFragmentManager().G()) {
            return x0Var.H(arrayList, arrayList2, i10, this.f2044b);
        }
        return false;
    }
}
