package l;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z10) {
        absListView.setSelectedChildViewEnabled(z10);
    }
}
