package e1;

import android.graphics.ColorFilter;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorFilter f5042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5044c;

    public l(long j10, int i10, ColorFilter colorFilter) {
        this.f5042a = colorFilter;
        this.f5043b = j10;
        this.f5044c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return r.c(this.f5043b, lVar.f5043b) && g0.b(this.f5044c, lVar.f5044c);
    }

    public final int hashCode() {
        int i10 = r.f5066h;
        return Integer.hashCode(this.f5044c) + (Long.hashCode(this.f5043b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        k1.d(this.f5043b, sb, ", blendMode=");
        int i10 = this.f5044c;
        if (g0.b(i10, 0)) {
            str = "Clear";
        } else if (g0.b(i10, 1)) {
            str = "Src";
        } else if (g0.b(i10, 2)) {
            str = "Dst";
        } else if (g0.b(i10, 3)) {
            str = "SrcOver";
        } else if (g0.b(i10, 4)) {
            str = "DstOver";
        } else if (g0.b(i10, 5)) {
            str = "SrcIn";
        } else if (g0.b(i10, 6)) {
            str = "DstIn";
        } else if (g0.b(i10, 7)) {
            str = "SrcOut";
        } else if (g0.b(i10, 8)) {
            str = "DstOut";
        } else if (g0.b(i10, 9)) {
            str = "SrcAtop";
        } else if (g0.b(i10, 10)) {
            str = "DstAtop";
        } else if (g0.b(i10, 11)) {
            str = "Xor";
        } else if (g0.b(i10, 12)) {
            str = "Plus";
        } else if (g0.b(i10, 13)) {
            str = "Modulate";
        } else if (g0.b(i10, 14)) {
            str = "Screen";
        } else if (g0.b(i10, 15)) {
            str = "Overlay";
        } else if (g0.b(i10, 16)) {
            str = "Darken";
        } else if (g0.b(i10, 17)) {
            str = "Lighten";
        } else if (g0.b(i10, 18)) {
            str = "ColorDodge";
        } else if (g0.b(i10, 19)) {
            str = "ColorBurn";
        } else if (g0.b(i10, 20)) {
            str = "HardLight";
        } else if (g0.b(i10, 21)) {
            str = "Softlight";
        } else if (g0.b(i10, 22)) {
            str = "Difference";
        } else if (g0.b(i10, 23)) {
            str = "Exclusion";
        } else if (g0.b(i10, 24)) {
            str = "Multiply";
        } else if (g0.b(i10, 25)) {
            str = "Hue";
        } else if (g0.b(i10, 26)) {
            str = "Saturation";
        } else if (g0.b(i10, 27)) {
            str = "Color";
        } else {
            str = g0.b(i10, 28) ? "Luminosity" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
