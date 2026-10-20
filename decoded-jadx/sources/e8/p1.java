package e8;

import com.google.protobuf.r2;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f5333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1 f5336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f5337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5341i;

    public p1(o1 o1Var, String str, n1 n1Var, n1 n1Var2, boolean z10) {
        new AtomicReferenceArray(2);
        y3.e.J(o1Var, "type");
        this.f5333a = o1Var;
        y3.e.J(str, "fullMethodName");
        this.f5334b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f5335c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        y3.e.J(n1Var, "requestMarshaller");
        this.f5336d = n1Var;
        y3.e.J(n1Var2, "responseMarshaller");
        this.f5337e = n1Var2;
        this.f5338f = null;
        this.f5339g = false;
        this.f5340h = false;
        this.f5341i = z10;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        y3.e.J(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        y3.e.J(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public static m1 b() {
        m1 m1Var = new m1();
        m1Var.f5313a = null;
        m1Var.f5314b = null;
        return m1Var;
    }

    public final com.google.protobuf.t1 c(InputStream inputStream) {
        com.google.protobuf.s sVarG;
        byte[] bArr;
        l8.b bVar = (l8.b) this.f5337e;
        bVar.getClass();
        if ((inputStream instanceof l8.a) && ((l8.a) inputStream).f11386b == bVar.f11389a) {
            try {
                com.google.protobuf.t1 t1Var = ((l8.a) inputStream).f11385a;
                if (t1Var != null) {
                    return t1Var;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof t0) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return bVar.f11390b;
                    }
                    sVarG = null;
                } else {
                    ThreadLocal threadLocal = l8.b.f11388d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i10 = iAvailable;
                    while (i10 > 0) {
                        int i11 = inputStream.read(bArr, iAvailable - i10, i10);
                        if (i11 == -1) {
                            break;
                        }
                        i10 -= i11;
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i10));
                    }
                    sVarG = com.google.protobuf.s.f(bArr, 0, iAvailable, false);
                }
            } else {
                sVarG = null;
            }
            if (sVarG == null) {
                sVarG = com.google.protobuf.s.g(inputStream);
            }
            sVarG.f4232c = Integer.MAX_VALUE;
            int i12 = bVar.f11391c;
            if (i12 >= 0) {
                if (i12 < 0) {
                    throw new IllegalArgumentException(l.q.g("Recursion limit cannot be negative: ", i12));
                }
                sVarG.f4231b = i12;
            }
            try {
                com.google.protobuf.l0 partialFrom = com.google.protobuf.l0.parsePartialFrom(((com.google.protobuf.h0) bVar.f11389a).f4119a, sVarG, l8.c.f11392a);
                if (partialFrom != null && !partialFrom.isInitialized()) {
                    r2 r2VarNewUninitializedMessageException = partialFrom.newUninitializedMessageException();
                    r2VarNewUninitializedMessageException.getClass();
                    throw new com.google.protobuf.a1(r2VarNewUninitializedMessageException.getMessage());
                }
                sVarG.a(0);
                return partialFrom;
            } catch (com.google.protobuf.a1 e4) {
                throw new e2(c2.f5223l.g("Invalid protobuf byte sequence").f(e4));
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final l8.a d(Object obj) {
        l8.b bVar = (l8.b) this.f5336d;
        bVar.getClass();
        return new l8.a((com.google.protobuf.t1) obj, bVar.f11389a);
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5334b, "fullMethodName");
        gVarJ0.a(this.f5333a, "type");
        gVarJ0.c("idempotent", this.f5339g);
        gVarJ0.c("safe", this.f5340h);
        gVarJ0.c("sampledToLocalTracing", this.f5341i);
        gVarJ0.a(this.f5336d, "requestMarshaller");
        gVarJ0.a(this.f5337e, "responseMarshaller");
        gVarJ0.a(this.f5338f, "schemaDescriptor");
        gVarJ0.f13208d = true;
        return gVarJ0.toString();
    }
}
