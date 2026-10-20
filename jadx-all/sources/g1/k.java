package g1;

import e1.g0;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6506d;

    public k(float f10, float f11, int i10, int i11, int i12) {
        f10 = (i12 & 1) != 0 ? 0.0f : f10;
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f6503a = f10;
        this.f6504b = f11;
        this.f6505c = i10;
        this.f6506d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6503a != kVar.f6503a || this.f6504b != kVar.f6504b || !g0.f(this.f6505c, kVar.f6505c) || !g0.g(this.f6506d, kVar.f6506d)) {
            return false;
        }
        kVar.getClass();
        return d7.a.d(null, null);
    }

    public final int hashCode() {
        return a7.a.u(this.f6506d, a7.a.u(this.f6505c, q.a(this.f6504b, Float.hashCode(this.f6503a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f6503a);
        sb.append(", miter=");
        sb.append(this.f6504b);
        sb.append(", cap=");
        int i10 = this.f6505c;
        String str2 = "Unknown";
        if (g0.f(i10, 0)) {
            str = "Butt";
        } else if (g0.f(i10, 1)) {
            str = "Round";
        } else {
            str = g0.f(i10, 2) ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i11 = this.f6506d;
        if (g0.g(i11, 0)) {
            str2 = "Miter";
        } else if (g0.g(i11, 1)) {
            str2 = "Round";
        } else if (g0.g(i11, 2)) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
