package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f2025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f2027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f2030h;

    public s1(int i10, int i11, e1 e1Var, x2.g gVar) {
        d0 d0Var = e1Var.f1899c;
        this.f2026d = new ArrayList();
        this.f2027e = new HashSet();
        this.f2028f = false;
        this.f2029g = false;
        this.f2023a = i10;
        this.f2024b = i11;
        this.f2025c = d0Var;
        gVar.b(new w(this));
        this.f2030h = e1Var;
    }

    public final void a() {
        if (this.f2028f) {
            return;
        }
        this.f2028f = true;
        HashSet hashSet = this.f2027e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((x2.g) it.next()).a();
        }
    }

    public final void b() {
        if (!this.f2029g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2029g = true;
            Iterator it = this.f2026d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f2030h.j();
    }

    public final void c(int i10, int i11) {
        if (i11 == 0) {
            throw null;
        }
        int i12 = i11 - 1;
        d0 d0Var = this.f2025c;
        if (i12 == 0) {
            if (this.f2023a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + d0Var + " mFinalState = " + a7.a.z(this.f2023a) + " -> " + a7.a.z(i10) + ". ");
                }
                this.f2023a = i10;
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (this.f2023a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + d0Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a7.a.y(this.f2024b) + " to ADDING.");
                }
                this.f2023a = 2;
                this.f2024b = 2;
                return;
            }
            return;
        }
        if (i12 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + d0Var + " mFinalState = " + a7.a.z(this.f2023a) + " -> REMOVED. mLifecycleImpact  = " + a7.a.y(this.f2024b) + " to REMOVING.");
        }
        this.f2023a = 1;
        this.f2024b = 3;
    }

    public final void d() {
        int i10 = this.f2024b;
        e1 e1Var = this.f2030h;
        if (i10 != 2) {
            if (i10 == 3) {
                d0 d0Var = e1Var.f1899c;
                View viewRequireView = d0Var.requireView();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + d0Var);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        d0 d0Var2 = e1Var.f1899c;
        View viewFindFocus = d0Var2.mView.findFocus();
        if (viewFindFocus != null) {
            d0Var2.setFocusedView(viewFindFocus);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + d0Var2);
            }
        }
        View viewRequireView2 = this.f2025c.requireView();
        if (viewRequireView2.getParent() == null) {
            e1Var.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(d0Var2.getPostOnViewCreatedAlpha());
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + a7.a.z(this.f2023a) + "} {mLifecycleImpact = " + a7.a.y(this.f2024b) + "} {mFragment = " + this.f2025c + "}";
    }
}
