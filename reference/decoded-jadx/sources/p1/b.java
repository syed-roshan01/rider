package p1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12744b;

    public final void a(long j10) {
        int i10 = this.f12743a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f12744b[i11] == j10) {
                return;
            }
        }
        int i12 = this.f12743a;
        long[] jArr = this.f12744b;
        if (i12 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i12 + 1, jArr.length * 2));
            d7.a.l(jArrCopyOf, "copyOf(this, newSize)");
            this.f12744b = jArrCopyOf;
        }
        this.f12744b[i12] = j10;
        if (i12 >= this.f12743a) {
            this.f12743a = i12 + 1;
        }
    }

    public final void b(int i10) {
        int i11 = this.f12743a;
        if (i10 < i11) {
            int i12 = i11 - 1;
            while (i10 < i12) {
                long[] jArr = this.f12744b;
                int i13 = i10 + 1;
                jArr[i10] = jArr[i13];
                i10 = i13;
            }
            this.f12743a--;
        }
    }
}
