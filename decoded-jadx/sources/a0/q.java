package a0;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.e f845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f847c = new LinkedHashMap();

    public q(v0.e eVar, z.o oVar) {
        this.f845a = eVar;
        this.f846b = oVar;
    }

    public final c9.e a(int i10, Object obj, Object obj2) {
        u0.b bVar;
        LinkedHashMap linkedHashMap = this.f847c;
        p pVar = (p) linkedHashMap.get(obj);
        int i11 = 1;
        if (pVar != null && pVar.f839c == i10 && d7.a.d(pVar.f838b, obj2)) {
            c9.e eVar = pVar.f840d;
            if (eVar != null) {
                return eVar;
            }
            bVar = new u0.b(1403994769, new v.n0(i11, pVar.f841e, pVar), true);
            pVar.f840d = bVar;
        } else {
            p pVar2 = new p(this, i10, obj, obj2);
            linkedHashMap.put(obj, pVar2);
            c9.e eVar2 = pVar2.f840d;
            if (eVar2 != null) {
                return eVar2;
            }
            bVar = new u0.b(1403994769, new v.n0(i11, this, pVar2), true);
            pVar2.f840d = bVar;
        }
        return bVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = (p) this.f847c.get(obj);
        if (pVar != null) {
            return pVar.f838b;
        }
        s sVar = (s) this.f846b.invoke();
        int iB = sVar.b(obj);
        if (iB != -1) {
            return sVar.d(iB);
        }
        return null;
    }
}
