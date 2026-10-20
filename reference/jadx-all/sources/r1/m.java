package r1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f13396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13398c;

    public m(p pVar, int i10, int i11) {
        this.f13396a = pVar;
        this.f13397b = i10;
        this.f13398c = i11;
    }

    @Override // r1.p
    public final int Q(int i10) {
        return this.f13396a.Q(i10);
    }

    @Override // r1.p
    public final int V(int i10) {
        return this.f13396a.V(i10);
    }

    @Override // r1.p
    public final int X(int i10) {
        return this.f13396a.X(i10);
    }

    @Override // r1.p
    public final Object a() {
        return this.f13396a.a();
    }

    @Override // r1.i0
    public final x0 f(long j10) {
        int i10 = this.f13398c;
        int i11 = this.f13397b;
        p pVar = this.f13396a;
        if (i10 == 1) {
            return new n(i11 == 2 ? pVar.V(m2.a.h(j10)) : pVar.Q(m2.a.h(j10)), m2.a.d(j10) ? m2.a.h(j10) : 32767, 0);
        }
        return new n(m2.a.e(j10) ? m2.a.i(j10) : 32767, i11 == 2 ? pVar.g(m2.a.i(j10)) : pVar.X(m2.a.i(j10)), 0);
    }

    @Override // r1.p
    public final int g(int i10) {
        return this.f13396a.g(i10);
    }
}
