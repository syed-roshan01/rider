package t;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.c f14227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(int i10, c9.c cVar) {
        super(1);
        this.f14226a = i10;
        this.f14227b = cVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10;
        Object objN;
        Throwable th;
        switch (this.f14226a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                int i11 = this.f14226a;
                c9.c cVar = this.f14227b;
                switch (i11) {
                    case 0:
                        return cVar.invoke(Long.valueOf(jLongValue));
                    default:
                        return cVar.invoke(Long.valueOf(jLongValue / 1000000));
                }
            case 1:
                a7.a.w(obj);
                switch (this.f14226a) {
                    case 1:
                        throw null;
                    default:
                        throw null;
                }
            case 2:
            default:
                Throwable th2 = (Throwable) obj;
                try {
                    th = (Throwable) this.f14227b.invoke(th2);
                    boolean zD = d7.a.d(th2.getMessage(), th.getMessage());
                    objN = th;
                    if (!zD && !d7.a.d(th.getMessage(), th2.toString())) {
                        objN = th;
                        objN = null;
                    }
                } catch (Throwable th3) {
                    objN = d7.t.N(th3);
                }
                objN = th;
                return (Throwable) (objN instanceof q8.g ? null : objN);
            case 3:
                long jLongValue2 = ((Number) obj).longValue();
                int i12 = this.f14226a;
                c9.c cVar2 = this.f14227b;
                switch (i12) {
                    case 0:
                        return cVar2.invoke(Long.valueOf(jLongValue2));
                    default:
                        return cVar2.invoke(Long.valueOf(jLongValue2 / 1000000));
                }
            case 4:
                w0.n nVar = (w0.n) obj;
                synchronized (w0.p.f16109b) {
                    i10 = w0.p.f16111d;
                    w0.p.f16111d = i10 + 1;
                }
                return new w0.g(i10, nVar, this.f14227b);
            case 5:
                w0.i iVar = (w0.i) this.f14227b.invoke((w0.n) obj);
                synchronized (w0.p.f16109b) {
                    w0.p.f16110c = w0.p.f16110c.o(iVar.d());
                }
                return iVar;
        }
    }
}
