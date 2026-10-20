package f4;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import l.o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f6227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f6228b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f6227a = new e0();
        } else {
            f6227a = new d0();
        }
        f6228b = new o2(Float.class, "translationAlpha", 6);
        new o2(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f6227a.P(view, i10, i11, i12, i13);
    }
}
