package j7;

import java.security.SecureRandom;
import u1.c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f8431a = new c1(7);

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f8431a.get()).nextBytes(bArr);
        return bArr;
    }
}
