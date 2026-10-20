package n;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f12027e = new HashMap();

    @Override // n.g
    public final c e(Object obj) {
        return (c) this.f12027e.get(obj);
    }

    @Override // n.g
    public final Object g(Object obj) {
        Object objG = super.g(obj);
        this.f12027e.remove(obj);
        return objG;
    }

    public final Object i(Object obj, Object obj2) {
        c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f12030b;
        }
        HashMap map = this.f12027e;
        c cVar = new c(obj, obj2);
        this.f12041d++;
        c cVar2 = this.f12039b;
        if (cVar2 == null) {
            this.f12038a = cVar;
            this.f12039b = cVar;
        } else {
            cVar2.f12031c = cVar;
            cVar.f12032d = cVar2;
            this.f12039b = cVar;
        }
        map.put(obj, cVar);
        return null;
    }
}
