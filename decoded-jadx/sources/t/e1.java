package t;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i10, Object obj, Object obj2) {
        super(1);
        this.f14138a = i10;
        this.f14139b = obj;
        this.f14140c = obj2;
    }

    public final m0.n0 a(m0.o0 o0Var) {
        int i10 = this.f14138a;
        Object obj = this.f14140c;
        Object obj2 = this.f14139b;
        switch (i10) {
            case 1:
                p0 p0Var = (p0) obj2;
                k0 k0Var = (k0) obj;
                p0Var.f14273a.c(k0Var);
                p0Var.f14274b.setValue(Boolean.TRUE);
                return new r0(0, p0Var, k0Var);
            case 2:
                u1 u1Var = (u1) obj2;
                u1 u1Var2 = (u1) obj;
                u1Var.f14327i.add(u1Var2);
                return new r0(1, u1Var, u1Var2);
            case 3:
                return new r0(2, (u1) obj2, (n1) obj);
            default:
                u1 u1Var3 = (u1) obj2;
                q1 q1Var = (q1) obj;
                u1Var3.f14326h.add(q1Var);
                return new r0(3, u1Var3, q1Var);
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f14138a) {
            case 0:
                m mVar = (m) obj;
                ((c9.e) this.f14139b).invoke(mVar.f14245e.getValue(), ((x1) this.f14140c).f14352b.invoke(mVar.f14246f));
                return q8.l.f13235a;
            case 1:
                return a((m0.o0) obj);
            case 2:
                return a((m0.o0) obj);
            case 3:
                return a((m0.o0) obj);
            default:
                return a((m0.o0) obj);
        }
    }
}
