package u;

/* JADX INFO: loaded from: classes.dex */
public final class r extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f14910b = new r(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f14911c = new r(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f14912d = new r(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f14913e = new r(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f14914f = new r(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10) {
        super(1);
        this.f14915a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14915a) {
            case 0:
                ((t1.i0) ((g1.e) obj)).a();
                return lVar;
            case 1:
                return lVar;
            case 2:
                ((Number) obj).longValue();
                return lVar;
            case 3:
                y1.f fVar = y1.f.f16753d;
                j9.f[] fVarArr = y1.t.f16843a;
                y1.u uVar = y1.r.f16818c;
                j9.f fVar2 = y1.t.f16843a[1];
                uVar.a((y1.v) obj, fVar);
                return lVar;
            default:
                return new p2(((Number) obj).intValue());
        }
    }
}
