package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
        return popupWindow.getMaxAvailableHeight(view, i10, z10);
    }
}
