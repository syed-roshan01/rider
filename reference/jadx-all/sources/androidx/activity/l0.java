package androidx.activity;

import android.content.res.Resources;
import android.view.View;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f1406b = new l0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f1407c = new l0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f1408d = new l0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10) {
        super(1);
        this.f1409a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f1409a) {
            case 0:
                Resources resources = (Resources) obj;
                d7.a.m(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                View view = (View) obj;
                d7.a.m(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                d7.a.m(view2, "it");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof k0) {
                    return (k0) tag;
                }
                return null;
        }
    }
}
