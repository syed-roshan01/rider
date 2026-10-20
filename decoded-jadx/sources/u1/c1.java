package u1;

import android.os.Looper;
import android.view.Choreographer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15055a;

    public /* synthetic */ c1(int i10) {
        this.f15055a = i10;
    }

    public final Cipher a() {
        switch (this.f15055a) {
            case 2:
                try {
                    return (Cipher) j7.j.f8418b.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 3:
                try {
                    return (Cipher) j7.j.f8418b.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 4:
                try {
                    return (Cipher) j7.j.f8418b.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 5:
                try {
                    return (Cipher) j7.j.f8418b.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            default:
                try {
                    return (Cipher) j7.j.f8418b.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f15055a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread".toString());
                }
                e1 e1Var = new e1(choreographer, o1.s.r(looperMyLooper));
                return e1Var.O(e1Var.f15083s);
            case 1:
                return 0L;
            case 2:
                return a();
            case 3:
                return a();
            case 4:
                return a();
            case 5:
                return a();
            case 6:
                return a();
            case 7:
                c1 c1Var = j7.q.f8431a;
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 8:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(y9.b.f17003d);
                return simpleDateFormat;
        }
    }
}
