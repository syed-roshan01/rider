package ea;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5449b = new int[10];

    public final int a() {
        if ((this.f5448a & 128) != 0) {
            return this.f5449b[7];
        }
        return 65535;
    }

    public final void b(c0 c0Var) {
        d7.a.m(c0Var, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & c0Var.f5448a) != 0) {
                c(i10, c0Var.f5449b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f5449b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f5448a = (1 << i10) | this.f5448a;
            iArr[i10] = i11;
        }
    }
}
