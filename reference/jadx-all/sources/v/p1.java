package v;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d9.r f15735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f15736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(d9.r rVar, r1 r1Var, int i10) {
        super(2);
        this.f15734a = i10;
        this.f15735b = rVar;
        this.f15736c = r1Var;
    }

    public final void a(float f10) {
        int i10 = this.f15734a;
        r1 r1Var = this.f15736c;
        d9.r rVar = this.f15735b;
        switch (i10) {
            case 0:
                float f11 = rVar.f4949a;
                rVar.f4949a = r1Var.a(f10 - f11) + f11;
                break;
            default:
                rVar.f4949a += r1Var.a(f10 - rVar.f4949a);
                break;
        }
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f15734a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                a(fFloatValue);
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                a(fFloatValue2);
                break;
        }
        return lVar;
    }
}
