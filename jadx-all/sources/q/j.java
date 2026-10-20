package q;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12997a;

    static {
        long[] jArr = v.f13035a;
        int iD = v.d(0);
        int iMax = iD > 0 ? Math.max(7, v.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            b9.b.P(jArr);
        }
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        v.a(iMax);
        int[] iArr = new int[iMax];
        f12997a = new int[0];
    }
}
