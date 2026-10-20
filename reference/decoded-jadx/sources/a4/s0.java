package a4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends b3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f1188d;

    public s0(RecyclerView recyclerView) {
        this.f1188d = recyclerView;
        new r0(this);
    }

    @Override // b3.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f1188d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().B(accessibilityEvent);
        }
    }

    @Override // b3.c
    public final void g(View view, c3.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2606a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2942a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        kVar.g("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f1188d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        e0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1100b;
        l0 l0Var = recyclerView2.f2242a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1100b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1100b.canScrollVertically(1) || layoutManager.f1100b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        o0 o0Var = recyclerView2.f2253f0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.y(l0Var, o0Var), layoutManager.q(l0Var, o0Var), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
  0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b3.c
    public final boolean h(View view, int i10, Bundle bundle) {
        int iV;
        int iT;
        if (super.h(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1188d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        e0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1100b;
        l0 l0Var = recyclerView2.f2242a;
        if (i10 == 4096) {
            iV = recyclerView2.canScrollVertically(1) ? (layoutManager.f1105g - layoutManager.v()) - layoutManager.s() : 0;
            if (layoutManager.f1100b.canScrollHorizontally(1)) {
                iT = (layoutManager.f1104f - layoutManager.t()) - layoutManager.u();
            } else {
                iT = 0;
            }
        } else if (i10 != 8192) {
            iT = 0;
            iV = 0;
        } else {
            iV = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1105g - layoutManager.v()) - layoutManager.s()) : 0;
            if (layoutManager.f1100b.canScrollHorizontally(-1)) {
                iT = -((layoutManager.f1104f - layoutManager.t()) - layoutManager.u());
            } else {
                iT = 0;
            }
        }
        if (iV == 0 && iT == 0) {
            return false;
        }
        layoutManager.f1100b.t(iT, iV);
        return true;
    }
}
