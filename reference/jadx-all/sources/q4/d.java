package q4;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f13132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13133b;

    public d(Bitmap bitmap, Map map) {
        this.f13132a = bitmap;
        this.f13133b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (d7.a.d(this.f13132a, dVar.f13132a) && d7.a.d(this.f13133b, dVar.f13133b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13133b.hashCode() + (this.f13132a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f13132a + ", extras=" + this.f13133b + ')';
    }
}
