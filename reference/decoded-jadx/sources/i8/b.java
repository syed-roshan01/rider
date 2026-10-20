package i8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l.q;
import l.t2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f8124e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f8126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f8127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8128d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        t2 t2Var = new t2(true);
        t2Var.a(aVarArr);
        m mVar = m.TLS_1_3;
        m mVar2 = m.TLS_1_2;
        t2Var.b(mVar, mVar2);
        if (!t2Var.f10940a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        t2Var.f10941b = true;
        b bVar = new b(t2Var);
        f8124e = bVar;
        t2 t2Var2 = new t2(bVar);
        t2Var2.b(mVar, mVar2, m.TLS_1_1, m.TLS_1_0);
        if (!t2Var2.f10940a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        t2Var2.f10941b = true;
        new b(t2Var2);
        new b(new t2(false));
    }

    public b(t2 t2Var) {
        this.f8125a = t2Var.f10940a;
        this.f8126b = (String[]) t2Var.f10942c;
        this.f8127c = (String[]) t2Var.f10943d;
        this.f8128d = t2Var.f10941b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = bVar.f8125a;
        boolean z11 = this.f8125a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f8126b, bVar.f8126b) && Arrays.equals(this.f8127c, bVar.f8127c) && this.f8128d == bVar.f8128d);
    }

    public final int hashCode() {
        if (this.f8125a) {
            return ((((527 + Arrays.hashCode(this.f8126b)) * 31) + Arrays.hashCode(this.f8127c)) * 31) + (!this.f8128d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        m mVar;
        if (!this.f8125a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f8126b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                aVarArr[i10] = str.startsWith("SSL_") ? a.valueOf("TLS_" + str.substring(4)) : a.valueOf(str);
            }
            String[] strArr2 = n.f8172a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder sbR = a7.a.r("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f8127c;
        m[] mVarArr = new m[strArr3.length];
        for (int i11 = 0; i11 < strArr3.length; i11++) {
            String str2 = strArr3[i11];
            if ("TLSv1.3".equals(str2)) {
                mVar = m.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                mVar = m.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                mVar = m.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                mVar = m.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(q.x("Unexpected TLS version: ", str2));
                }
                mVar = m.SSL_3_0;
            }
            mVarArr[i11] = mVar;
        }
        String[] strArr4 = n.f8172a;
        sbR.append(Collections.unmodifiableList(Arrays.asList((Object[]) mVarArr.clone())));
        sbR.append(", supportsTlsExtensions=");
        sbR.append(this.f8128d);
        sbR.append(")");
        return sbR.toString();
    }
}
