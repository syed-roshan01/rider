package v6;

import com.google.crypto.tink.shaded.protobuf.h0;
import i7.a1;
import i7.c1;
import i7.d1;
import i7.t1;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import k6.w4;
import w6.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f15931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f15932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f15933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f15934d;

    static {
        Logger.getLogger(q.class.getName());
        f15931a = new AtomicReference(new f());
        f15932b = new ConcurrentHashMap();
        f15933c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f15934d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z10) {
        if (z10) {
            try {
                ConcurrentHashMap concurrentHashMap = f15933c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            if (((f) f15931a.get()).f15911a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f15934d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f15934d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static e7.f b(b bVar, Class cls) throws GeneralSecurityException {
        f7.a aVar;
        d7.r rVar = (d7.r) d7.j.f4896b.f4897a.get();
        rVar.getClass();
        d7.q qVar = new d7.q(bVar.getClass(), cls);
        HashMap map = rVar.f4910a;
        if (!map.containsKey(qVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + qVar + " available");
        }
        switch (((t) ((d7.n) map.get(qVar)).f4906c).f16240a) {
            case 12:
                aVar = new f7.a();
                if (!a7.a.e(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new f7.a();
                if (!a7.a.f(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static Object c(String str, com.google.crypto.tink.shaded.protobuf.l lVar, Class cls) throws GeneralSecurityException {
        f fVar = (f) f15931a.get();
        fVar.getClass();
        e eVarA = fVar.a(str);
        boolean zContains = eVarA.f15909a.f4891b.keySet().contains(cls);
        d7.f fVar2 = eVarA.f15909a;
        if (zContains) {
            try {
                if (!fVar2.f4891b.keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", fVar2.toString(), cls.getName()));
                }
                try {
                    com.google.crypto.tink.shaded.protobuf.b bVarF = fVar2.f(lVar);
                    if (Void.class.equals(cls)) {
                        throw new GeneralSecurityException("Cannot create a primitive for Void");
                    }
                    fVar2.g(bVarF);
                    return fVar2.c(bVarF, cls);
                } catch (h0 e4) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(fVar2.f4890a.getName()), e4);
                }
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(fVar2.getClass());
        sb.append(", supported primitives: ");
        Set<Class> setKeySet = fVar2.f4891b.keySet();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : setKeySet) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static Object d(String str, byte[] bArr) {
        com.google.crypto.tink.shaded.protobuf.k kVar = com.google.crypto.tink.shaded.protobuf.l.f3571b;
        return c(str, com.google.crypto.tink.shaded.protobuf.l.i(bArr, 0, bArr.length), a.class);
    }

    public static synchronized a1 e(d1 d1Var) {
        d dVar;
        d7.f fVar = ((f) f15931a.get()).a(d1Var.C()).f15909a;
        dVar = new d(fVar, fVar.f4892c);
        if (!((Boolean) f15933c.get(d1Var.C())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + d1Var.C());
        }
        return dVar.m(d1Var.D());
    }

    public static synchronized void f(d7.f fVar, boolean z10) {
        try {
            AtomicReference atomicReference = f15931a;
            f fVar2 = new f((f) atomicReference.get());
            fVar2.b(fVar);
            String strB = fVar.b();
            a(strB, z10 ? fVar.d().m() : Collections.emptyMap(), z10);
            if (!((f) atomicReference.get()).f15911a.containsKey(strB)) {
                f15932b.put(strB, new w4(fVar, 7));
                if (z10) {
                    g(strB, fVar.d().m());
                }
            }
            f15933c.put(strB, Boolean.valueOf(z10));
            atomicReference.set(fVar2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void g(String str, Map map) {
        t1 t1Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f15934d;
            String str2 = (String) entry.getKey();
            byte[] bArrD = ((com.google.crypto.tink.shaded.protobuf.b) ((d7.e) entry.getValue()).f4888a).d();
            int i10 = ((d7.e) entry.getValue()).f4889b;
            c1 c1VarE = d1.E();
            c1VarE.d();
            d1.x((d1) c1VarE.f3641b, str);
            com.google.crypto.tink.shaded.protobuf.k kVarI = com.google.crypto.tink.shaded.protobuf.l.i(bArrD, 0, bArrD.length);
            c1VarE.d();
            d1.y((d1) c1VarE.f3641b, kVarI);
            int iE = t.k.e(i10);
            if (iE == 0) {
                t1Var = t1.TINK;
            } else if (iE == 1) {
                t1Var = t1.LEGACY;
            } else if (iE == 2) {
                t1Var = t1.RAW;
            } else {
                if (iE != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                t1Var = t1.CRUNCHY;
            }
            c1VarE.d();
            d1.z((d1) c1VarE.f3641b, t1Var);
            concurrentHashMap.put(str2, new h((d1) c1VarE.a()));
        }
    }

    public static synchronized void h(p pVar) {
        d7.j jVar = d7.j.f4896b;
        synchronized (jVar) {
            j0.s sVar = new j0.s((d7.r) jVar.f4897a.get());
            sVar.b(pVar);
            jVar.f4897a.set(new d7.r(sVar));
        }
    }
}
