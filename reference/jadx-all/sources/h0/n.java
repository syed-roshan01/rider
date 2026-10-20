package h0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.a0 f7430d;

    public n(int i10, int i11, int i12, a2.a0 a0Var) {
        this.f7427a = i10;
        this.f7428b = i11;
        this.f7429c = i12;
        this.f7430d = a0Var;
    }

    public final o a(int i10) {
        return new o(m9.e0.A(this.f7430d, i10), i10, 1L);
    }

    public final int b() {
        int i10 = this.f7427a;
        int i11 = this.f7428b;
        if (i10 < i11) {
            return 2;
        }
        return i10 > i11 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
        int i10 = this.f7427a;
        sb.append(i10);
        sb.append('-');
        a2.a0 a0Var = this.f7430d;
        sb.append(m9.e0.A(a0Var, i10));
        sb.append(',');
        int i11 = this.f7428b;
        sb.append(i11);
        sb.append('-');
        sb.append(m9.e0.A(a0Var, i11));
        sb.append("), prevOffset=");
        return a7.a.o(sb, this.f7429c, ')');
    }
}
