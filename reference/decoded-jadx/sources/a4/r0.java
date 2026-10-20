package a4;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends b3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0 f1186d;

    public r0(s0 s0Var) {
        this.f1186d = s0Var;
    }

    @Override // b3.c
    public final void g(View view, c3.k kVar) {
        this.f2606a.onInitializeAccessibilityNodeInfo(view, kVar.f2942a);
        s0 s0Var = this.f1186d;
        if (s0Var.f1188d.l()) {
            return;
        }
        RecyclerView recyclerView = s0Var.f1188d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // b3.c
    public final boolean h(View view, int i10, Bundle bundle) {
        if (super.h(view, i10, bundle)) {
            return true;
        }
        s0 s0Var = this.f1186d;
        if (!s0Var.f1188d.l()) {
            RecyclerView recyclerView = s0Var.f1188d;
            if (recyclerView.getLayoutManager() != null) {
                l0 l0Var = recyclerView.getLayoutManager().f1100b.f2242a;
            }
        }
        return false;
    }
}
