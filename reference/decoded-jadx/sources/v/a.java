package v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f15466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, int i10) {
        super(1);
        this.f15465a = i10;
        this.f15466b = jVar;
    }

    public final Boolean a(o1.u uVar) {
        int i10 = this.f15465a;
        j jVar = this.f15466b;
        switch (i10) {
            case 0:
                return (Boolean) jVar.f15634w.invoke(uVar);
            default:
                return Boolean.valueOf(!(((w0) jVar).O.a(m9.e0.I(uVar, true)) == 0.0f));
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f15465a) {
            case 0:
                break;
        }
        return a((o1.u) obj);
    }
}
