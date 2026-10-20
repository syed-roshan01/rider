package a4;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f1142d;

    public /* synthetic */ k(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f1142d = new int[10];
    }

    public boolean a(int i10) {
        return ((1 << i10) & this.f1139a) != 0;
    }

    public void b(int i10, int i11) {
        int[] iArr = this.f1142d;
        if (i10 >= iArr.length) {
            return;
        }
        int i12 = 1 << i10;
        this.f1139a |= i12;
        this.f1140b &= ~i12;
        this.f1141c = (~i12) & this.f1141c;
        iArr[i10] = i11;
    }

    public k(int i10, int i11, int i12, int[] iArr) {
        this.f1139a = i10;
        this.f1140b = 0;
        this.f1141c = i12;
        this.f1142d = iArr;
    }
}
