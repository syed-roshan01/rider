package r1;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f13380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(h1 h1Var, int i10) {
        super(2);
        this.f13379a = i10;
        this.f13380b = h1Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13379a;
        h1 h1Var = this.f13380b;
        switch (i10) {
            case 0:
                h1Var.a().f13360b = (m0.u) obj2;
                break;
            case 1:
                f0 f0VarA = h1Var.a();
                ((androidx.compose.ui.node.a) obj).W(new c0(f0VarA, (c9.e) obj2, f0VarA.f13374w));
                break;
            default:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                f0 f0Var = aVar.E;
                if (f0Var == null) {
                    f0Var = new f0(aVar, h1Var.f13383a);
                    aVar.E = f0Var;
                }
                h1Var.f13384b = f0Var;
                h1Var.a().e();
                f0 f0VarA2 = h1Var.a();
                k1 k1Var = f0VarA2.f13361c;
                k1 k1Var2 = h1Var.f13383a;
                if (k1Var != k1Var2) {
                    f0VarA2.f13361c = k1Var2;
                    f0VarA2.f(false);
                    androidx.compose.ui.node.a.Q(f0VarA2.f13359a, false, 3);
                }
                break;
        }
        return lVar;
    }
}
