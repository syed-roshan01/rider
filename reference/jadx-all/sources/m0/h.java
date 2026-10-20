package m0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f11548b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f11549c = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(2);
        this.f11550a = i10;
    }

    public final void a(m mVar, int i10) {
        switch (this.f11550a) {
            case 0:
                if ((i10 & 11) == 2) {
                    q qVar = (q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                        break;
                    }
                }
                break;
            default:
                if ((i10 & 11) == 2) {
                    q qVar2 = (q) mVar;
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
        switch (this.f11550a) {
            case 0:
                a((m) obj, ((Number) obj2).intValue());
                break;
            default:
                a((m) obj, ((Number) obj2).intValue());
                break;
        }
        return lVar;
    }
}
