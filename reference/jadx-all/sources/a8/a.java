package a8;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1326g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1332f;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        f1326g = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i10, int i11, int i12) {
        this.f1331e = i10;
        this.f1330d = i11;
        this.f1332f = i12;
        this.f1327a = new int[i11];
        this.f1328b = new int[i11];
        int i13 = 1;
        int i14 = 1;
        for (int i15 = 0; i15 < i11; i15++) {
            this.f1327a[i15] = i14;
            i14 *= 2;
            if (i14 >= i11) {
                i14 = (i14 ^ i10) & (i11 - 1);
            }
        }
        for (int i16 = 0; i16 < i11 - 1; i16++) {
            this.f1328b[this.f1327a[i16]] = i16;
        }
        this.f1329c = new b(this, new int[]{0});
        int[] iArr = {1};
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            return;
        }
        while (i13 < length && iArr[i13] == 0) {
            i13++;
        }
        if (i13 == length) {
            return;
        }
        int[] iArr2 = new int[length - i13];
        System.arraycopy(iArr, i13, iArr2, 0, iArr2.length);
    }

    public final int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f1328b;
        return this.f1327a[(iArr[i10] + iArr[i11]) % (this.f1330d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f1331e));
        sb.append(',');
        return a7.a.o(sb, this.f1330d, ')');
    }
}
