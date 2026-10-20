package l2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f11204c = new g(f.f11202b, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11206b;

    public g(float f10, int i10) {
        this.f11205a = f10;
        this.f11206b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f10 = gVar.f11205a;
        float f11 = f.f11201a;
        if (Float.compare(this.f11205a, f10) == 0) {
            if (this.f11206b == gVar.f11206b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f10 = f.f11201a;
        return Integer.hashCode(this.f11206b) + (Float.hashCode(this.f11205a) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f10 = this.f11205a;
        if (f10 == 0.0f) {
            float f11 = f.f11201a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f10 == f.f11201a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f10 == f.f11202b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f10 == f.f11203c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i10 = this.f11206b;
        if (i10 == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else {
            str2 = i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
