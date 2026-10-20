package t4;

import android.content.Context;
import android.util.DisplayMetrics;
import i4.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14649a;

    public c(Context context) {
        this.f14649a = context;
    }

    @Override // t4.g
    public final Object c(l lVar) {
        DisplayMetrics displayMetrics = this.f14649a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new f(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (d7.a.d(this.f14649a, ((c) obj).f14649a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14649a.hashCode();
    }
}
