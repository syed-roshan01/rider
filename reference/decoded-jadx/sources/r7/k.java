package r7;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13614a;

    public k(String str) {
        this.f13614a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f13614a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Object obj2 = ((k) obj).f13614a;
        String str = this.f13614a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f13614a);
    }

    public final int hashCode() {
        return this.f13614a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f13614a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f13614a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f13614a;
    }
}
