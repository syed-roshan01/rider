package q9;

import s.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p9.f f13261d;

    public i(int i10, u8.j jVar, o9.a aVar, p9.f fVar) {
        super(jVar, i10, aVar);
        this.f13261d = fVar;
    }

    @Override // q9.g
    public final Object c(o9.r rVar, u8.e eVar) {
        Object objG = g(new x(rVar), eVar);
        return objG == v8.a.f15963a ? objG : q8.l.f13235a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // q9.g, p9.f
    public final Object collect(p9.g gVar, u8.e eVar) {
        Object objCollect;
        q8.l lVar = q8.l.f13235a;
        if (this.f13256b == -3) {
            u8.j context = eVar.getContext();
            Boolean bool = Boolean.FALSE;
            m9.w wVar = m9.w.f12014c;
            u8.j jVar = this.f13255a;
            u8.j jVarO = !((Boolean) jVar.e(bool, wVar)).booleanValue() ? context.O(jVar) : z6.a.C(context, jVar, false);
            if (d7.a.d(jVarO, context)) {
                objCollect = g(gVar, eVar);
                if (objCollect != v8.a.f15963a) {
                    return lVar;
                }
            } else {
                u8.f fVar = u8.f.f15436a;
                if (d7.a.d(jVarO.f(fVar), context.f(fVar))) {
                    u8.j context2 = eVar.getContext();
                    if (!(gVar instanceof x) && !(gVar instanceof s)) {
                        gVar = new c0(gVar, context2);
                    }
                    objCollect = z6.a.v0(jVarO, gVar, r9.a.s(jVarO), new h(this, null), eVar);
                    v8.a aVar = v8.a.f15963a;
                    if (objCollect != aVar) {
                        objCollect = lVar;
                    }
                    if (objCollect != aVar) {
                        return lVar;
                    }
                } else {
                    objCollect = super.collect(gVar, eVar);
                    if (objCollect != v8.a.f15963a) {
                        return lVar;
                    }
                }
            }
        } else {
            objCollect = super.collect(gVar, eVar);
            if (objCollect != v8.a.f15963a) {
                return lVar;
            }
        }
        return objCollect;
    }

    public abstract Object g(p9.g gVar, u8.e eVar);

    @Override // q9.g
    public final String toString() {
        return this.f13261d + " -> " + super.toString();
    }
}
