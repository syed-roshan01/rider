package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f10923b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s f10924c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w1 f10925a;

    public static synchronized s a() {
        try {
            if (f10924c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10924c;
    }

    public static synchronized void c() {
        if (f10924c == null) {
            s sVar = new s();
            f10924c = sVar;
            sVar.f10925a = w1.c();
            w1 w1Var = f10924c.f10925a;
            r rVar = new r(0);
            synchronized (w1Var) {
                w1Var.f10964e = rVar;
            }
        }
    }

    public static void d(Drawable drawable, t2 t2Var, int[] iArr) {
        PorterDuff.Mode mode = w1.f10957f;
        int[] state = drawable.getState();
        int[] iArr2 = v0.f10949a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = t2Var.f10941b;
        if (!z10 && !t2Var.f10940a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterG = null;
        ColorStateList colorStateList = z10 ? (ColorStateList) t2Var.f10942c : null;
        PorterDuff.Mode mode2 = t2Var.f10940a ? (PorterDuff.Mode) t2Var.f10943d : w1.f10957f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterG = w1.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterG);
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f10925a.e(context, i10);
    }
}
