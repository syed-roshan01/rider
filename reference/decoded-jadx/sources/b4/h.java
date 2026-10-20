package b4;

import android.view.View;
import com.ride.accepter.R;
import d9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f2710b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f2711c = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2712a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f2712a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f2712a) {
            case 0:
                View view = (View) obj;
                d7.a.m(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                d7.a.m(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof g) {
                    return (g) tag;
                }
                return null;
        }
    }
}
