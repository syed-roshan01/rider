package i3;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7990b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7991c = -1;

    public t(int i10) {
        this.f7989a = i10;
    }

    @Override // i3.s
    public final Object a() {
        return this;
    }

    @Override // i3.s
    public final boolean b(CharSequence charSequence, int i10, int i11, d0 d0Var) {
        int i12 = this.f7989a;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.f7990b = i10;
        this.f7991c = i11;
        return false;
    }
}
