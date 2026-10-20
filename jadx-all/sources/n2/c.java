package n2;

import java.util.Arrays;
import l2.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f12128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f12129b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.f12128a = fArr;
        this.f12129b = fArr2;
    }

    @Override // n2.a
    public final float a(float f10) {
        return l.a(f10, this.f12129b, this.f12128a);
    }

    @Override // n2.a
    public final float b(float f10) {
        return l.a(f10, this.f12128a, this.f12129b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f12128a, cVar.f12128a) && Arrays.equals(this.f12129b, cVar.f12129b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12129b) + (Arrays.hashCode(this.f12128a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f12128a);
        d7.a.l(string, "toString(this)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f12129b);
        d7.a.l(string2, "toString(this)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
