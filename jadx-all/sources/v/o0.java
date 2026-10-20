package v;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, o9.c cVar, boolean z10) {
        super(1);
        this.f15723b = obj;
        this.f15724c = cVar;
        this.f15722a = z10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        o1.u uVar = (o1.u) obj;
        p1.e.a((p1.d) this.f15723b, uVar);
        if (!m9.e0.t(uVar)) {
            long jI = m9.e0.I(uVar, false);
            uVar.a();
            o9.t tVar = (o9.t) this.f15724c;
            if (this.f15722a) {
                jI = d1.c.h(-1.0f, jI);
            }
            tVar.n(new a0(jI));
        }
        return q8.l.f13235a;
    }
}
