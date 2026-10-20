package g8;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f6732a = Logger.getLogger(d6.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6733b = "-bin".getBytes(q6.d.f13203a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }
}
