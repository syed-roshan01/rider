package v6;

import androidx.fragment.app.a0;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.t;
import i7.a1;
import i7.b1;
import i7.h1;
import i7.i1;
import i7.q0;
import i7.t1;
import i7.z0;
import j0.b0;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f15918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7.a f15920c = g7.a.f6624b;

    public j(i1 i1Var, List list) {
        this.f15918a = i1Var;
        this.f15919b = list;
    }

    public static final j a(i1 i1Var) throws GeneralSecurityException {
        if (i1Var.A() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(i1Var.A());
        for (h1 h1Var : i1Var.B()) {
            h1Var.C();
            try {
                try {
                    b bVarA = d7.k.f4898b.a(d7.s.a(h1Var.B().C(), h1Var.B().D(), h1Var.B().B(), h1Var.D(), h1Var.D() == t1.RAW ? null : Integer.valueOf(h1Var.C())));
                    int iOrdinal = h1Var.E().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new i(bVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e4) {
                throw new a0("Creating a protokey serialization failed", e4);
            }
        }
        return new j(i1Var, Collections.unmodifiableList(arrayList));
    }

    public static final j c(w4 w4Var, a aVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        try {
            q0 q0VarB = q0.B((InputStream) w4Var.f10455b, t.a());
            ((InputStream) w4Var.f10455b).close();
            if (q0VarB.z().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                i1 i1VarF = i1.F(aVar.b(q0VarB.z().o(), bArr), t.a());
                if (i1VarF.A() > 0) {
                    return a(i1VarF);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (h0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            ((InputStream) w4Var.f10455b).close();
            throw th;
        }
    }

    public final Object b(Class cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        e7.f fVarB;
        AtomicReference atomicReference = q.f15931a;
        try {
            clsA = d7.j.f4896b.a(cls);
        } catch (GeneralSecurityException unused) {
            clsA = null;
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i10 = s.f15936a;
        i1 i1Var = this.f15918a;
        int iC = i1Var.C();
        Iterator it = i1Var.B().iterator();
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            b1 b1Var = b1.ENABLED;
            if (!zHasNext) {
                if (i11 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z11 && !z10) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                i3.a0 a0Var = new i3.a0();
                a0Var.f7942b = new ConcurrentHashMap();
                a0Var.f7941a = clsA;
                g7.a aVar = g7.a.f6624b;
                a0Var.f7944d = this.f15920c;
                for (int i12 = 0; i12 < i1Var.A(); i12++) {
                    h1 h1VarZ = i1Var.z(i12);
                    if (h1VarZ.E().equals(b1Var)) {
                        try {
                            a1 a1VarB = h1VarZ.B();
                            AtomicReference atomicReference2 = q.f15931a;
                            objC = q.c(a1VarB.C(), a1VarB.D(), clsA);
                        } catch (GeneralSecurityException e4) {
                            if (!e4.getMessage().contains("No key manager found for key type ") && !e4.getMessage().contains(" not supported by key manager of type ")) {
                                throw e4;
                            }
                            objC = null;
                        }
                        List list = this.f15919b;
                        if (list.get(i12) != null) {
                            try {
                                fVarB = q.b(((i) list.get(i12)).f15917a, clsA);
                            } catch (GeneralSecurityException unused2) {
                                fVarB = null;
                            }
                        } else {
                            fVarB = null;
                        }
                        if (h1VarZ.C() == i1Var.C()) {
                            a0Var.a(fVarB, objC, h1VarZ, true);
                        } else {
                            a0Var.a(fVarB, objC, h1VarZ, false);
                        }
                    }
                }
                ConcurrentMap concurrentMap = (ConcurrentMap) a0Var.f7942b;
                if (concurrentMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                n nVar = (n) a0Var.f7943c;
                g7.a aVar2 = (g7.a) a0Var.f7944d;
                Class cls2 = (Class) a0Var.f7941a;
                b0 b0Var = new b0();
                b0Var.f8249b = concurrentMap;
                b0Var.f8250c = nVar;
                b0Var.f8251d = cls2;
                b0Var.f8252e = aVar2;
                b0Var.f8248a = false;
                a0Var.f7942b = null;
                AtomicReference atomicReference3 = q.f15931a;
                HashMap map = ((d7.r) d7.j.f4896b.f4897a.get()).f4911b;
                if (!map.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                p pVar = (p) map.get(cls);
                if (((Class) b0Var.f8251d).equals(pVar.a()) && pVar.a().equals((Class) b0Var.f8251d)) {
                    return pVar.b(b0Var);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            h1 h1Var = (h1) it.next();
            if (h1Var.E() == b1Var) {
                if (!h1Var.F()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(h1Var.C())));
                }
                if (h1Var.D() == t1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(h1Var.C())));
                }
                if (h1Var.E() == b1.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(h1Var.C())));
                }
                if (h1Var.C() == iC) {
                    if (z11) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z11 = true;
                }
                if (h1Var.B().B() != z0.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i11++;
            }
        }
    }

    public final String toString() {
        return s.a(this.f15918a).toString();
    }
}
