package u1;

import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f15385a = new y3();

    public final void a(w wVar) {
        ViewParent parent = wVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(wVar, wVar);
        }
    }
}
