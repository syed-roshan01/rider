package o2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f12478b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f12479c = new k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(2);
        this.f12480a = i10;
    }

    public final void a(m0.m mVar, int i10) {
        switch (this.f12480a) {
            case 0:
                if ((i10 & 11) == 2) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                        break;
                    }
                }
                break;
            default:
                if ((i10 & 11) == 2) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                        break;
                    }
                }
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f12480a) {
            case 0:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m0.m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
