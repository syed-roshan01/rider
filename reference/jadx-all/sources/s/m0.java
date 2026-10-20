package s;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, long j10, long j11, Object obj2, int i10) {
        super(1);
        this.f13834a = i10;
        this.f13837d = obj;
        this.f13835b = j10;
        this.f13836c = j11;
        this.f13838e = obj2;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13834a;
        Object obj2 = this.f13838e;
        Object obj3 = this.f13837d;
        switch (i10) {
            case 0:
                int i11 = m2.i.f11808c;
                long j10 = this.f13835b;
                long j11 = this.f13836c;
                ((r1.w0) obj).getClass();
                r1.w0.j((r1.x0) obj3, ((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)), 0.0f, (c9.c) obj2);
                break;
            default:
                t1.i0 i0Var = (t1.i0) ((g1.e) obj);
                i0Var.a();
                g1.g.Y(i0Var, (e1.n) obj3, this.f13835b, this.f13836c, 0.0f, (g1.h) obj2, 104);
                break;
        }
        return lVar;
    }
}
