package e7;

import d7.y;
import i7.r0;
import i7.t1;
import java.security.GeneralSecurityException;
import w6.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7.m f5185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d7.l f5186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d7.d f5187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d7.b f5188d;

    static {
        k7.a aVarB = y.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f5185a = new d7.m(m.class);
        f5186b = new d7.l(aVarB);
        f5187c = new d7.d(i.class);
        f5188d = new d7.b(new t(21), aVarB);
    }

    public static k a(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return k.f5170b;
        }
        if (iOrdinal == 2) {
            return k.f5173e;
        }
        if (iOrdinal == 3) {
            return k.f5172d;
        }
        if (iOrdinal == 4) {
            return k.f5174f;
        }
        if (iOrdinal == 5) {
            return k.f5171c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + r0Var.b());
    }

    public static l b(t1 t1Var) throws GeneralSecurityException {
        int iOrdinal = t1Var.ordinal();
        if (iOrdinal == 1) {
            return l.f5176b;
        }
        if (iOrdinal == 2) {
            return l.f5178d;
        }
        if (iOrdinal == 3) {
            return l.f5179e;
        }
        if (iOrdinal == 4) {
            return l.f5177c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var.b());
    }
}
