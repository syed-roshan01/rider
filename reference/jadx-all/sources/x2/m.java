package x2;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f16298b = new m(new o(l.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f16299a;

    public m(o oVar) {
        this.f16299a = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (this.f16299a.equals(((m) obj).f16299a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16299a.hashCode();
    }

    public final String toString() {
        return this.f16299a.toString();
    }
}
