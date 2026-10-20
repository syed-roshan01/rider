package o2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12450b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12451c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f12452d = new b(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f12453e = new b(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f12454f = new b(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f12455n = new b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f12456a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f12456a;
        switch (i10) {
            case 0:
                y1.v vVar = (y1.v) obj;
                switch (i10) {
                    case 0:
                        j9.f[] fVarArr = y1.t.f16843a;
                        ((y1.j) vVar).k(y1.r.f16833r, lVar);
                        break;
                    default:
                        j9.f[] fVarArr2 = y1.t.f16843a;
                        ((y1.j) vVar).k(y1.r.f16832q, lVar);
                        break;
                }
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                y1.v vVar2 = (y1.v) obj;
                switch (i10) {
                    case 0:
                        j9.f[] fVarArr3 = y1.t.f16843a;
                        ((y1.j) vVar2).k(y1.r.f16833r, lVar);
                        break;
                    default:
                        j9.f[] fVarArr4 = y1.t.f16843a;
                        ((y1.j) vVar2).k(y1.r.f16832q, lVar);
                        break;
                }
                break;
            case 4:
                break;
            default:
                r rVar = (r) obj;
                if (rVar.isAttachedToWindow()) {
                    rVar.l();
                }
                break;
        }
        return lVar;
    }
}
