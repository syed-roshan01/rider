package e7;

import d7.y;
import i7.t1;
import java.security.GeneralSecurityException;
import w6.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7.m f5162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d7.l f5163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d7.d f5164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d7.b f5165d;

    static {
        k7.a aVarB = y.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f5162a = new d7.m(d.class);
        f5163b = new d7.l(aVarB);
        f5164c = new d7.d(a.class);
        f5165d = new d7.b(new t(16), aVarB);
    }

    public static c a(t1 t1Var) throws GeneralSecurityException {
        int iOrdinal = t1Var.ordinal();
        if (iOrdinal == 1) {
            return c.f5154b;
        }
        if (iOrdinal == 2) {
            return c.f5156d;
        }
        if (iOrdinal == 3) {
            return c.f5157e;
        }
        if (iOrdinal == 4) {
            return c.f5155c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var.b());
    }
}
