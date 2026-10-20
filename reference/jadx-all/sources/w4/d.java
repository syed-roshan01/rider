package w4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.a0;
import l.q;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s4.c f16162a = new s4.c();

    public static final boolean a(s4.j jVar) {
        int iOrdinal = jVar.f14003i.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new a0();
            }
            if (jVar.L.f13950b != null || !(jVar.B instanceof t4.c)) {
                return false;
            }
        }
        return true;
    }

    public static final Drawable b(s4.j jVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context context = jVar.f13995a;
        int iIntValue = num.intValue();
        Drawable drawableC = d0.C(context, iIntValue);
        if (drawableC != null) {
            return drawableC;
        }
        throw new IllegalStateException(q.g("Invalid resource ID: ", iIntValue).toString());
    }
}
