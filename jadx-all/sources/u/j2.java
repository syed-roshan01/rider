package u;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2 f14828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(boolean z10, boolean z11, boolean z12, p2 p2Var, m9.d0 d0Var) {
        super(1);
        this.f14825a = z10;
        this.f14826b = z11;
        this.f14827c = z12;
        this.f14828d = p2Var;
        this.f14829e = d0Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        y1.v vVar = (y1.v) obj;
        j9.f[] fVarArr = y1.t.f16843a;
        y1.u uVar = y1.r.f16827l;
        j9.f[] fVarArr2 = y1.t.f16843a;
        j9.f fVar = fVarArr2[6];
        uVar.a(vVar, Boolean.TRUE);
        p2 p2Var = this.f14828d;
        y1.h hVar = new y1.h(new m2(p2Var, 0), new m2(p2Var, 1), this.f14825a);
        boolean z10 = this.f14826b;
        if (z10) {
            y1.u uVar2 = y1.r.f16831p;
            j9.f fVar2 = fVarArr2[9];
            uVar2.a(vVar, hVar);
        } else {
            y1.u uVar3 = y1.r.f16830o;
            j9.f fVar3 = fVarArr2[8];
            uVar3.a(vVar, hVar);
        }
        if (this.f14827c) {
            y1.j jVar = (y1.j) vVar;
            jVar.k(y1.i.f16764d, new y1.a(null, new l2((m9.d0) this.f14829e, z10, p2Var)));
        }
        return q8.l.f13235a;
    }
}
