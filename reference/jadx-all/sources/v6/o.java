package v6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15930a;

    public o(byte[] bArr) {
        this.f15930a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        byte[] bArr = this.f15930a;
        int length = bArr.length;
        byte[] bArr2 = oVar.f15930a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = oVar.f15930a[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Arrays.equals(this.f15930a, ((o) obj).f15930a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15930a);
    }

    public final String toString() {
        return d7.a.t(this.f15930a);
    }
}
