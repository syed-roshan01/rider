package e7;

import j0.b0;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements v6.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5166a = new h();

    @Override // v6.p
    public final Class a() {
        return f.class;
    }

    @Override // v6.p
    public final Object b(b0 b0Var) throws GeneralSecurityException {
        if (((v6.n) b0Var.f8250c) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentMap) b0Var.f8249b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new g();
    }

    @Override // v6.p
    public final Class c() {
        return f.class;
    }
}
