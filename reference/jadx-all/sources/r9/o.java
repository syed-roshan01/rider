package r9;

import java.util.Iterator;
import java.util.List;
import m9.s1;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f13724a;

    static {
        String property;
        Object next;
        int i10 = v.f13730a;
        s1 s1VarB = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator itY = l.q.y();
        d7.a.m(itY, "<this>");
        r8.o oVar = new r8.o(itY, 2);
        boolean z10 = oVar instanceof k9.a;
        k9.i aVar = oVar;
        if (!z10) {
            aVar = new k9.a(oVar);
        }
        List listI0 = k9.k.I0(aVar);
        Iterator it = listI0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iC = ((n) next).c();
                do {
                    Object next2 = it.next();
                    int iC2 = ((n) next2).c();
                    if (iC < iC2) {
                        next = next2;
                        iC = iC2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        n nVar = (n) next;
        if (nVar != null) {
            try {
                s1VarB = nVar.b(listI0);
            } catch (Throwable unused2) {
                nVar.a();
            }
            if (s1VarB != null) {
                f13724a = s1VarB;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
