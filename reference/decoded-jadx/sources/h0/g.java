package h0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.a f7386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7387b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c9.a aVar, boolean z10) {
        super(3);
        this.f7386a = aVar;
        this.f7387b = z10;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        y0.o oVar = (y0.o) obj;
        ((Number) obj3).intValue();
        m0.q qVar = (m0.q) ((m0.m) obj2);
        qVar.Z(-196777734);
        long j10 = ((b1) qVar.m(c1.f7366a)).f7354a;
        qVar.Z(-433018279);
        boolean zF = qVar.f(j10);
        c9.a aVar = this.f7386a;
        boolean zI = zF | qVar.i(aVar);
        boolean z10 = this.f7387b;
        boolean zH = zI | qVar.h(z10);
        Object objP = qVar.P();
        if (zH || objP == m0.l.f11578a) {
            objP = new f(j10, aVar, z10);
            qVar.l0(objP);
        }
        qVar.t(false);
        y0.o oVarE = androidx.compose.ui.draw.a.e(oVar, (c9.c) objP);
        qVar.t(false);
        return oVarE;
    }
}
