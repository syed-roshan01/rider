package u;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(String str, int i10) {
        super(1);
        this.f14796a = i10;
        this.f14797b = str;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        String str = this.f14797b;
        int i10 = this.f14796a;
        switch (i10) {
            case 0:
                y1.v vVar = (y1.v) obj;
                switch (i10) {
                    case 0:
                        j9.f[] fVarArr = y1.t.f16843a;
                        ((y1.j) vVar).k(y1.r.f16816a, d7.t.d0(str));
                        y1.t.d(vVar, 5);
                        return lVar;
                    default:
                        j9.f[] fVarArr2 = y1.t.f16843a;
                        ((y1.j) vVar).k(y1.r.f16816a, d7.t.d0(str));
                        return lVar;
                }
            case 1:
                y1.v vVar2 = (y1.v) obj;
                switch (i10) {
                    case 0:
                        j9.f[] fVarArr3 = y1.t.f16843a;
                        ((y1.j) vVar2).k(y1.r.f16816a, d7.t.d0(str));
                        y1.t.d(vVar2, 5);
                        return lVar;
                    default:
                        j9.f[] fVarArr4 = y1.t.f16843a;
                        ((y1.j) vVar2).k(y1.r.f16816a, d7.t.d0(str));
                        return lVar;
                }
            default:
                String str2 = (String) obj;
                d7.a.m(str2, "line");
                return str + str2;
        }
    }
}
