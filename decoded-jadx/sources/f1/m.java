package f1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6069b;

    public /* synthetic */ m(q qVar, int i10) {
        this.f6068a = i10;
        this.f6069b = qVar;
    }

    @Override // f1.i
    public final double b(double d10) {
        int i10 = this.f6068a;
        q qVar = this.f6069b;
        switch (i10) {
            case 0:
                return z6.a.p(qVar.f6084k.b(d10), qVar.f6078e, qVar.f6079f);
            default:
                return qVar.f6087n.b(z6.a.p(d10, qVar.f6078e, qVar.f6079f));
        }
    }
}
