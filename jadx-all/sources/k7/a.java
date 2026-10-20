package k7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10625a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f10625a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f10625a, this.f10625a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10625a);
    }

    public final String toString() {
        return "Bytes(" + d7.a.t(this.f10625a) + ")";
    }
}
