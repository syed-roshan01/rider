package z7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f17324d;

    public final boolean a(int i10, int i11) {
        return ((this.f17324d[(i10 / 32) + (i11 * this.f17323c)] >>> (i10 & 31)) & 1) != 0;
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f17324d.clone();
        b bVar = new b();
        bVar.f17321a = this.f17321a;
        bVar.f17322b = this.f17322b;
        bVar.f17323c = this.f17323c;
        bVar.f17324d = iArr;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17321a == bVar.f17321a && this.f17322b == bVar.f17322b && this.f17323c == bVar.f17323c && Arrays.equals(this.f17324d, bVar.f17324d);
    }

    public final int hashCode() {
        int i10 = this.f17321a;
        return Arrays.hashCode(this.f17324d) + (((((((i10 * 31) + i10) * 31) + this.f17322b) * 31) + this.f17323c) * 31);
    }

    public final String toString() {
        int i10 = this.f17321a;
        int i11 = this.f17322b;
        StringBuilder sb = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sb.append(a(i13, i12) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
