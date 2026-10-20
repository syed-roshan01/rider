package k4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f9759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9760b;

    public g(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f9759a = bitmapDrawable;
        this.f9760b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (d7.a.d(this.f9759a, gVar.f9759a) && this.f9760b == gVar.f9760b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9760b) + (this.f9759a.hashCode() * 31);
    }
}
