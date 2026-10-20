package u8;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f15431b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f15432c = new c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(2);
        this.f15433a = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        d dVar;
        switch (this.f15433a) {
            case 0:
                String str = (String) obj;
                h hVar = (h) obj2;
                d7.a.m(str, "acc");
                d7.a.m(hVar, "element");
                if (str.length() == 0) {
                    return hVar.toString();
                }
                return str + ", " + hVar;
            default:
                j jVar = (j) obj;
                h hVar2 = (h) obj2;
                d7.a.m(jVar, "acc");
                d7.a.m(hVar2, "element");
                j jVarU = jVar.u(hVar2.getKey());
                k kVar = k.f15438a;
                if (jVarU == kVar) {
                    return hVar2;
                }
                f fVar = f.f15436a;
                g gVar = (g) jVarU.f(fVar);
                if (gVar == null) {
                    dVar = new d(hVar2, jVarU);
                } else {
                    j jVarU2 = jVarU.u(fVar);
                    if (jVarU2 == kVar) {
                        return new d(gVar, hVar2);
                    }
                    dVar = new d(gVar, new d(hVar2, jVarU2));
                }
                return dVar;
        }
    }
}
