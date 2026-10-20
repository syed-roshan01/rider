package l;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends o1 implements p1 {
    public static final Method G;
    public p1 F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                G = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.p1
    public final void d(k.l lVar, k.m mVar) {
        p1 p1Var = this.F;
        if (p1Var != null) {
            p1Var.d(lVar, mVar);
        }
    }

    @Override // l.p1
    public final void f(k.l lVar, MenuItem menuItem) {
        p1 p1Var = this.F;
        if (p1Var != null) {
            p1Var.f(lVar, menuItem);
        }
    }
}
