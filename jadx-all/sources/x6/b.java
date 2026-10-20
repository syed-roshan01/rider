package x6;

import android.os.Build;
import d7.y;
import j7.r;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import u1.c1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f16309c = new c1(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f16310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16311b;

    public b(byte[] bArr) throws GeneralSecurityException {
        if (!a7.a.f(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f16310a = new SecretKeySpec(bArr, "AES");
        this.f16311b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i10 = y.f4926a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if (numValueOf == null || numValueOf.intValue() <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
