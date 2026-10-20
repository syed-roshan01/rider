package w0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f16085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16086e;

    public final int a(int i10) {
        int i11 = this.f16082a + 1;
        int[] iArr = this.f16083b;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            b9.b.K(iArr, iArr2, 0, 14);
            b9.b.K(this.f16084c, iArr3, 0, 14);
            this.f16083b = iArr2;
            this.f16084c = iArr3;
        }
        int i13 = this.f16082a;
        this.f16082a = i13 + 1;
        int length2 = this.f16085d.length;
        if (this.f16086e >= length2) {
            int i14 = length2 * 2;
            int[] iArr4 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr4[i15] = i16;
                i15 = i16;
            }
            b9.b.K(this.f16085d, iArr4, 0, 14);
            this.f16085d = iArr4;
        }
        int i17 = this.f16086e;
        int[] iArr5 = this.f16085d;
        this.f16086e = iArr5[i17];
        int[] iArr6 = this.f16083b;
        iArr6[i13] = i10;
        this.f16084c[i13] = i17;
        iArr5[i17] = i13;
        int i18 = iArr6[i13];
        while (i13 > 0) {
            int i19 = ((i13 + 1) >> 1) - 1;
            if (iArr6[i19] <= i18) {
                break;
            }
            b(i19, i13);
            i13 = i19;
        }
        return i17;
    }

    public final void b(int i10, int i11) {
        int[] iArr = this.f16083b;
        int[] iArr2 = this.f16084c;
        int[] iArr3 = this.f16085d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
