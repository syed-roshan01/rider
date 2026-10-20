package c7;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import j7.q;
import j7.r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import v6.k;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3036c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyStore f3038b;

    public d() {
        v6.d dVar = new v6.d(2);
        this.f3037a = (String) dVar.f15907b;
        this.f3038b = (KeyStore) dVar.f15908c;
    }

    public static boolean a(String str) {
        d dVar = new d();
        synchronized (f3036c) {
            try {
                if (dVar.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = r.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized c c(String str) {
        c cVar;
        try {
            String str2 = this.f3037a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f3037a, str));
            }
            cVar = new c(r.b(str), this.f3038b);
            byte[] bArrA = q.a(10);
            byte[] bArr = new byte[0];
            if (!Arrays.equals(bArrA, cVar.b(cVar.a(bArrA, bArr), bArr))) {
                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
            }
        } catch (Throwable th) {
            throw th;
        }
        return cVar;
    }

    public final synchronized boolean d(String str) {
        String strB;
        strB = r.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("d", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f3038b = keyStore;
                keyStore.load(null);
                return this.f3038b.containsAlias(strB);
            } catch (IOException e4) {
                throw new GeneralSecurityException(e4);
            }
        }
        return this.f3038b.containsAlias(strB);
    }
}
