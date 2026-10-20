package u0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f15010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f15011c;

    public f(int i10, long[] jArr, Object[] objArr) {
        this.f15009a = i10;
        this.f15010b = jArr;
        this.f15011c = objArr;
    }

    public final int a(long j10) {
        int i10 = this.f15009a - 1;
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.f15010b;
        int i11 = 0;
        if (i10 == 0) {
            long j11 = jArr[0];
            if (j11 == j10) {
                return 0;
            }
            return j11 > j10 ? -2 : -1;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j12 = jArr[i12] - j10;
            if (j12 < 0) {
                i11 = i12 + 1;
            } else {
                if (j12 <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final f b(Object obj, long j10) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f15011c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f15010b;
                i10 = this.f15009a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j11 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j11 > j10) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j11;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j10;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j12 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j12;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j10;
            objArr2[0] = obj;
        }
        return new f(i13, jArr2, objArr2);
    }
}
