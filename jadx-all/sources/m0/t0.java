package m0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f11704a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11705b;

    public final int a() {
        int[] iArr = this.f11704a;
        int i10 = this.f11705b - 1;
        this.f11705b = i10;
        return iArr[i10];
    }

    public final void b(int i10) {
        int i11 = this.f11705b;
        int[] iArr = this.f11704a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f11704a = iArrCopyOf;
        }
        int[] iArr2 = this.f11704a;
        int i12 = this.f11705b;
        this.f11705b = i12 + 1;
        iArr2[i12] = i10;
    }
}
