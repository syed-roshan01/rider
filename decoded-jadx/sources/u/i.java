package u;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f14799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar) {
        super(1);
        this.f14799a = jVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        long j10 = ((m2.k) obj).f11814a;
        long jM0 = o1.s.m0(j10);
        j jVar = this.f14799a;
        boolean z10 = !d1.f.a(jM0, jVar.f14819p);
        jVar.f14819p = o1.s.m0(j10);
        if (z10) {
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            jVar.f14806c.setSize(i10, i11);
            jVar.f14807d.setSize(i10, i11);
            jVar.f14808e.setSize(i11, i10);
            jVar.f14809f.setSize(i11, i10);
            jVar.f14811h.setSize(i10, i11);
            jVar.f14812i.setSize(i10, i11);
            jVar.f14813j.setSize(i11, i10);
            jVar.f14814k.setSize(i11, i10);
        }
        if (z10) {
            jVar.i();
            jVar.e();
        }
        return q8.l.f13235a;
    }
}
