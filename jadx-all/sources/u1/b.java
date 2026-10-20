package u1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15030b = new int[2];

    public final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f15030b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public final String d() {
        String str = this.f15029a;
        if (str != null) {
            return str;
        }
        d7.a.D("text");
        throw null;
    }
}
