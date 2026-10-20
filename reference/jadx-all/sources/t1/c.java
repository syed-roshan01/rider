package t1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f14394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(0);
        this.f14393a = i10;
        this.f14394b = dVar;
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVar = q8.l.f13235a;
        d dVar = this.f14394b;
        int i10 = this.f14393a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        dVar.I0();
                        break;
                    default:
                        y0.m mVar = dVar.f14406u;
                        d7.a.k(mVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        ((s1.d) mVar).g(dVar);
                        break;
                }
                break;
            default:
                switch (i10) {
                    case 0:
                        dVar.I0();
                        break;
                    default:
                        y0.m mVar2 = dVar.f14406u;
                        d7.a.k(mVar2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        ((s1.d) mVar2).g(dVar);
                        break;
                }
                break;
        }
        return lVar;
    }
}
