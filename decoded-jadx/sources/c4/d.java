package c4;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2957a;

    public d(KeyGenParameterSpec keyGenParameterSpec, String str) {
        this.f2957a = str;
    }

    public final String toString() {
        boolean zContainsAlias;
        StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
        String str = this.f2957a;
        sb.append(str);
        sb.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            zContainsAlias = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            zContainsAlias = false;
        }
        sb.append(zContainsAlias);
        sb.append("}");
        return sb.toString();
    }
}
