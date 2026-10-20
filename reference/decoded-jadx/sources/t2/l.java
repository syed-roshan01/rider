package t2;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f14619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f14620b;

    public l(Resources resources, Resources.Theme theme) {
        this.f14619a = resources;
        this.f14620b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f14619a.equals(lVar.f14619a) && a3.b.a(this.f14620b, lVar.f14620b);
    }

    public final int hashCode() {
        return a3.b.b(this.f14619a, this.f14620b);
    }
}
