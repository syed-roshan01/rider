package androidx.lifecycle;

import android.view.View;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f2140b = new h1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f2141c = new h1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f2142d = new h1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h1 f2143e = new h1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i10) {
        super(1);
        this.f2144a = i10;
    }

    public final View a(View view) {
        switch (this.f2144a) {
            case 0:
                d7.a.m(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                d7.a.m(view, "view");
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f2144a) {
            case 0:
                return a((View) obj);
            case 1:
                View view = (View) obj;
                d7.a.m(view, "viewParent");
                Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof w) {
                    return (w) tag;
                }
                return null;
            case 2:
                return a((View) obj);
            default:
                View view2 = (View) obj;
                d7.a.m(view2, "view");
                Object tag2 = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof g1) {
                    return (g1) tag2;
                }
                return null;
        }
    }
}
