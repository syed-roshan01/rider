package m4;

import android.graphics.drawable.Drawable;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f11835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.f f11837c;

    public d(Drawable drawable, boolean z10, k4.f fVar) {
        this.f11835a = drawable;
        this.f11836b = z10;
        this.f11837c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (d7.a.d(this.f11835a, dVar.f11835a) && this.f11836b == dVar.f11836b && this.f11837c == dVar.f11837c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11837c.hashCode() + q.c(this.f11836b, this.f11835a.hashCode() * 31, 31);
    }
}
