package d7;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f4896b = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f4897a = new AtomicReference(new r(new j0.s(1)));

    public final Class a(Class cls) throws GeneralSecurityException {
        HashMap map = ((r) this.f4897a.get()).f4911b;
        if (map.containsKey(cls)) {
            return ((v6.p) map.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(n nVar) {
        j0.s sVar = new j0.s((r) this.f4897a.get());
        sVar.a(nVar);
        this.f4897a.set(new r(sVar));
    }
}
