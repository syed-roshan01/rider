package r1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f13400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f13401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f13402d;

    public /* synthetic */ n0(p pVar, Enum r10, Enum r11, int i10) {
        this.f13399a = i10;
        this.f13400b = pVar;
        this.f13401c = r10;
        this.f13402d = r11;
    }

    @Override // r1.p
    public final int Q(int i10) {
        int i11 = this.f13399a;
        p pVar = this.f13400b;
        switch (i11) {
            case 0:
                break;
        }
        return pVar.Q(i10);
    }

    @Override // r1.p
    public final int V(int i10) {
        int i11 = this.f13399a;
        p pVar = this.f13400b;
        switch (i11) {
            case 0:
                break;
        }
        return pVar.V(i10);
    }

    @Override // r1.p
    public final int X(int i10) {
        int i11 = this.f13399a;
        p pVar = this.f13400b;
        switch (i11) {
            case 0:
                break;
        }
        return pVar.X(i10);
    }

    @Override // r1.p
    public final Object a() {
        int i10 = this.f13399a;
        p pVar = this.f13400b;
        switch (i10) {
            case 0:
                break;
        }
        return pVar.a();
    }

    @Override // r1.i0
    public final x0 f(long j10) {
        int i10 = this.f13399a;
        p pVar = this.f13400b;
        Enum r10 = this.f13401c;
        Enum r11 = this.f13402d;
        switch (i10) {
            case 0:
                p0 p0Var = (p0) r11;
                p0 p0Var2 = p0.f13406a;
                o0 o0Var = o0.f13404b;
                if (p0Var == p0Var2) {
                    return new n(((o0) r10) == o0Var ? pVar.V(m2.a.h(j10)) : pVar.Q(m2.a.h(j10)), m2.a.d(j10) ? m2.a.h(j10) : 32767, 1);
                }
                return new n(m2.a.e(j10) ? m2.a.i(j10) : 32767, ((o0) r10) == o0Var ? pVar.g(m2.a.i(j10)) : pVar.X(m2.a.i(j10)), 1);
            default:
                t1.e1 e1Var = (t1.e1) r11;
                t1.e1 e1Var2 = t1.e1.f14412a;
                t1.d1 d1Var = t1.d1.f14410b;
                if (e1Var == e1Var2) {
                    return new n(((t1.d1) r10) == d1Var ? pVar.V(m2.a.h(j10)) : pVar.Q(m2.a.h(j10)), m2.a.d(j10) ? m2.a.h(j10) : 32767, 2);
                }
                return new n(m2.a.e(j10) ? m2.a.i(j10) : 32767, ((t1.d1) r10) == d1Var ? pVar.g(m2.a.i(j10)) : pVar.X(m2.a.i(j10)), 2);
        }
    }

    @Override // r1.p
    public final int g(int i10) {
        int i11 = this.f13399a;
        p pVar = this.f13400b;
        switch (i11) {
            case 0:
                break;
        }
        return pVar.g(i10);
    }
}
