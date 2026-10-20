package l2;

/* JADX INFO: loaded from: classes.dex */
public final class n extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(0);
        this.f11217a = i10;
        this.f11218b = oVar;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f11217a;
        o oVar = this.f11218b;
        switch (i10) {
            case 0:
                return Float.valueOf(oVar.c());
            default:
                return oVar;
        }
    }
}
