package j0;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8310b;

    public s(d7.r rVar) {
        this.f8309a = new HashMap(rVar.f4910a);
        this.f8310b = new HashMap(rVar.f4911b);
    }

    public final void a(d7.n nVar) throws GeneralSecurityException {
        d7.q qVar = new d7.q(nVar.f4904a, nVar.f4905b);
        HashMap map = this.f8309a;
        if (!map.containsKey(qVar)) {
            map.put(qVar, nVar);
            return;
        }
        d7.n nVar2 = (d7.n) map.get(qVar);
        if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + qVar);
    }

    public final void b(v6.p pVar) throws GeneralSecurityException {
        if (pVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsC = pVar.c();
        HashMap map = this.f8310b;
        if (!map.containsKey(clsC)) {
            map.put(clsC, pVar);
            return;
        }
        v6.p pVar2 = (v6.p) map.get(clsC);
        if (pVar2.equals(pVar) && pVar.equals(pVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsC);
    }

    public s(int i10) {
        if (i10 != 1) {
            this.f8309a = new LinkedHashMap();
            this.f8310b = new LinkedHashMap();
        } else {
            this.f8309a = new HashMap();
            this.f8310b = new HashMap();
        }
    }
}
