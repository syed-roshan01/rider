package f1;

/* JADX INFO: loaded from: classes.dex */
public final class p extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f6074a = i10;
        this.f6075b = qVar;
    }

    public final Double a(double d10) {
        int i10 = this.f6074a;
        q qVar = this.f6075b;
        switch (i10) {
            case 0:
                return Double.valueOf(qVar.f6087n.b(z6.a.p(d10, qVar.f6078e, qVar.f6079f)));
            default:
                return Double.valueOf(z6.a.p(qVar.f6084k.b(d10), qVar.f6078e, qVar.f6079f));
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f6074a) {
            case 0:
                break;
        }
        return a(((Number) obj).doubleValue());
    }
}
