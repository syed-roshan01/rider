package d7;

import i7.b0;
import i7.f0;
import i7.j0;
import i7.o1;
import i7.r0;
import i7.r1;
import i7.t0;
import i7.w1;
import i7.z0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import w6.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f4892c;

    public f(Class cls, p... pVarArr) {
        this.f4890a = cls;
        HashMap map = new HashMap();
        for (p pVar : pVarArr) {
            boolean zContainsKey = map.containsKey(pVar.f4907a);
            Class cls2 = pVar.f4907a;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
            map.put(cls2, pVar);
        }
        if (pVarArr.length > 0) {
            this.f4892c = pVarArr[0].f4907a;
        } else {
            this.f4892c = Void.class;
        }
        this.f4891b = Collections.unmodifiableMap(map);
    }

    public int a() {
        return 1;
    }

    public abstract String b();

    public final Object c(com.google.crypto.tink.shaded.protobuf.b bVar, Class cls) throws GeneralSecurityException {
        p pVar = (p) this.f4891b.get(cls);
        if (pVar == null) {
            throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
        }
        switch (((w6.f) pVar).f16206b) {
            case 0:
                i7.h hVar = (i7.h) bVar;
                return new j7.h((j7.l) new w6.h(1).c(hVar.A(), j7.l.class), (v6.m) new e7.j().c(hVar.B(), v6.m.class), hVar.B().C().B());
            case 1:
                i7.l lVar = (i7.l) bVar;
                return new j7.a(lVar.B().o(), lVar.C().z());
            case 2:
                i7.r rVar = (i7.r) bVar;
                return new j7.b(rVar.A().o(), rVar.B().z());
            case 3:
                return new j7.c(((i7.x) bVar).z().o());
            case 4:
                return new y6.a(((b0) bVar).z().o());
            case 5:
                return new j7.g(((j0) bVar).z().o(), 0);
            case 6:
                String strZ = ((o1) bVar).z().z();
                return ((c7.d) v6.l.a(strZ)).c(strZ);
            case 7:
                r1 r1Var = (r1) bVar;
                String strA = r1Var.z().A();
                return new z(r1Var.z().z(), ((c7.d) v6.l.a(strA)).c(strA));
            case 8:
                return new j7.g(((w1) bVar).z().o(), 1);
            case 9:
                return new j7.d(((f0) bVar).z().o());
            case 10:
                i7.b bVar2 = (i7.b) bVar;
                return new j7.p(new j7.m(bVar2.A().o()), bVar2.B().z());
            default:
                t0 t0Var = (t0) bVar;
                r0 r0VarA = t0Var.C().A();
                SecretKeySpec secretKeySpec = new SecretKeySpec(t0Var.B().o(), "HMAC");
                int iB = t0Var.C().B();
                int iOrdinal = r0VarA.ordinal();
                if (iOrdinal == 1) {
                    return new j7.p(new j7.o("HMACSHA1", secretKeySpec), iB);
                }
                if (iOrdinal == 2) {
                    return new j7.p(new j7.o("HMACSHA384", secretKeySpec), iB);
                }
                if (iOrdinal == 3) {
                    return new j7.p(new j7.o("HMACSHA256", secretKeySpec), iB);
                }
                if (iOrdinal == 4) {
                    return new j7.p(new j7.o("HMACSHA512", secretKeySpec), iB);
                }
                if (iOrdinal == 5) {
                    return new j7.p(new j7.o("HMACSHA224", secretKeySpec), iB);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }

    public abstract w6.g d();

    public abstract z0 e();

    public abstract com.google.crypto.tink.shaded.protobuf.b f(com.google.crypto.tink.shaded.protobuf.l lVar);

    public abstract void g(com.google.crypto.tink.shaded.protobuf.b bVar);
}
