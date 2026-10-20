package u1;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f15138a;

    public k(Context context) {
        Object systemService = context.getSystemService("accessibility");
        d7.a.k(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f15138a = (AccessibilityManager) systemService;
    }
}
