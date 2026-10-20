package m0;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11566c;

    public i1(d dVar, int i10) {
        this.f11564a = dVar;
        this.f11565b = i10;
    }

    @Override // m0.d
    public final void a(int i10, Object obj) {
        this.f11564a.a(i10 + (this.f11566c == 0 ? this.f11565b : 0), obj);
    }

    @Override // m0.d
    public final void b(Object obj) {
        this.f11566c++;
        this.f11564a.b(obj);
    }

    @Override // m0.d
    public final void c(int i10, Object obj) {
        this.f11564a.c(i10 + (this.f11566c == 0 ? this.f11565b : 0), obj);
    }

    @Override // m0.d
    public final void clear() {
        s.g("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // m0.d
    public final void e(int i10, int i11, int i12) {
        int i13 = this.f11566c == 0 ? this.f11565b : 0;
        this.f11564a.e(i10 + i13, i11 + i13, i12);
    }

    @Override // m0.d
    public final Object f() {
        return this.f11564a.f();
    }

    @Override // m0.d
    public final void g(int i10, int i11) {
        this.f11564a.g(i10 + (this.f11566c == 0 ? this.f11565b : 0), i11);
    }

    @Override // m0.d
    public final void h() {
        int i10 = this.f11566c;
        if (i10 <= 0) {
            s.g("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.f11566c = i10 - 1;
        this.f11564a.h();
    }
}
