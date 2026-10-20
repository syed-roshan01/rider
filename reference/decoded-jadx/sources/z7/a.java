package z7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17318c = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17320b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f17319a = f17318c;

    public final void a(boolean z10) {
        c(this.f17320b + 1);
        if (z10) {
            int[] iArr = this.f17319a;
            int i10 = this.f17320b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f17320b++;
    }

    public final void b(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f17320b;
        c(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f17319a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f17320b = i12;
    }

    public final void c(int i10) {
        if (i10 > this.f17319a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i10 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f17319a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f17319a = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f17319a.clone();
        int i10 = this.f17320b;
        a aVar = new a();
        aVar.f17319a = iArr;
        aVar.f17320b = i10;
        return aVar;
    }

    public final boolean d(int i10) {
        return ((1 << (i10 & 31)) & this.f17319a[i10 / 32]) != 0;
    }

    public final int e() {
        return (this.f17320b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17320b == aVar.f17320b && Arrays.equals(this.f17319a, aVar.f17319a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17319a) + (this.f17320b * 31);
    }

    public final String toString() {
        int i10 = this.f17320b;
        StringBuilder sb = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f17320b; i11++) {
            if ((i11 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i11) ? 'X' : '.');
        }
        return sb.toString();
    }
}
