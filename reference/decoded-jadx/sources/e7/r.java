package e7;

import j0.b0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class r implements v6.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f5192a = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5193b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f5194c = new r();

    @Override // v6.p
    public final Class a() {
        return v6.m.class;
    }

    @Override // v6.p
    public final Object b(b0 b0Var) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) b0Var.f8249b).values().iterator();
        while (it.hasNext()) {
            for (v6.n nVar : (List) it.next()) {
                v6.b bVar = nVar.f15929h;
                if (bVar instanceof p) {
                    p pVar = (p) bVar;
                    byte[] bArr = nVar.f15924c;
                    k7.a aVarA = k7.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(pVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.c() + " has wrong output prefix (" + pVar.b() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new q(b0Var);
    }

    @Override // v6.p
    public final Class c() {
        return v6.m.class;
    }
}
