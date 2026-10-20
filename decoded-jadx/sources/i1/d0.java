package i1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f7763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f7762a = i10;
        this.f7763b = e0Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f7762a;
        e0 e0Var = this.f7763b;
        switch (i10) {
            case 0:
                e0Var.f7777d = true;
                e0Var.f7779f.invoke();
                break;
            default:
                g1.g gVar = (g1.g) obj;
                c cVar = e0Var.f7775b;
                float f10 = e0Var.f7784k;
                float f11 = e0Var.f7785l;
                long j10 = d1.c.f4326b;
                g1.b bVarA = gVar.A();
                long jB = bVarA.b();
                bVarA.a().j();
                bVarA.f6494a.b(f10, f11, j10);
                cVar.a(gVar);
                bVarA.a().h();
                bVarA.c(jB);
                break;
        }
        return lVar;
    }
}
