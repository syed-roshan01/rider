package v6;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f15910b = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f15911a;

    public f(f fVar) {
        this.f15911a = new ConcurrentHashMap(fVar.f15911a);
    }

    public final synchronized e a(String str) {
        if (!this.f15911a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (e) this.f15911a.get(str);
    }

    public final synchronized void b(d7.f fVar) {
        if (!a7.a.b(fVar.a())) {
            throw new GeneralSecurityException("failed to register key manager " + fVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new e(fVar));
    }

    public final synchronized void c(e eVar) {
        try {
            d7.f fVar = eVar.f15909a;
            Class cls = fVar.f4892c;
            if (!fVar.f4891b.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", fVar.toString(), cls.getName()));
            }
            String strB = fVar.b();
            e eVar2 = (e) this.f15911a.get(strB);
            if (eVar2 != null && !eVar2.f15909a.getClass().equals(eVar.f15909a.getClass())) {
                f15910b.warning("Attempted overwrite of a registered key manager for key type " + strB);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strB, eVar2.f15909a.getClass().getName(), eVar.f15909a.getClass().getName()));
            }
            this.f15911a.putIfAbsent(strB, eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public f() {
        this.f15911a = new ConcurrentHashMap();
    }
}
