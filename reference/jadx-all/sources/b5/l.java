package b5;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f2729b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f2730c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2731a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(1);
        this.f2731a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f2731a;
        switch (i10) {
            case 0:
                q8.f fVar = (q8.f) obj;
                switch (i10) {
                    case 0:
                        d7.a.m(fVar, "it");
                        return (CharSequence) fVar.f13225a;
                    default:
                        d7.a.m(fVar, "it");
                        return (CharSequence) fVar.f13225a;
                }
            default:
                q8.f fVar2 = (q8.f) obj;
                switch (i10) {
                    case 0:
                        d7.a.m(fVar2, "it");
                        return (CharSequence) fVar2.f13225a;
                    default:
                        d7.a.m(fVar2, "it");
                        return (CharSequence) fVar2.f13225a;
                }
        }
    }
}
