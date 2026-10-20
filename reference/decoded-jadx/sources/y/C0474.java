package y;

import android.os.C0013;
import android.os.IBinder;
import android.os.Parcel;
import c7.C0068;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.C0127;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.platforminfo.C0193;
import d5.o1;
import g.C0282;
import h5.C0307;
import h7.C0310;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocket;
import k0.q1;
import k1.C0332;
import k6.w5;
import m0.u2;
import n8.C0365;
import o8.C0371;
import r7.C0404;
import u.C0428;

/* JADX INFO: renamed from: y.۟ۤۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0474 {

    /* JADX INFO: renamed from: ۟ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int f745 = -610;

    /* JADX INFO: renamed from: ۟۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static long m9232(Object obj) {
        if (C0282.m5446() >= 0) {
            return ((k0.i0) obj).f9022z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9233(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static o7.d0 m9234() {
        if (C0404.m7934() >= 0) {
            return t7.c.f14667a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۟, reason: not valid java name and contains not printable characters */
    public static c9.e m9235(Object obj) {
        if (C0013.m253() >= 0) {
            return ((k0.d) obj).f8808b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m9236(Object obj) {
        if (C0332.m6454() <= 0) {
            return ((q1) obj).f9377e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m9237(Object obj, Object obj2, int i10) {
        if (C0068.m1322() > 0) {
            o1.e((MainViewModel) obj, (m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m9238(Object obj, Object obj2) {
        if (C0073.m1597() > 0) {
            return ((f5.y) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9239(Object obj) {
        if (C0154.m2958() < 0) {
            return ((k0.n1) obj).f9253c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9241(Object obj, Object obj2) {
        if (C0371.m7283() >= 0) {
            ((Parcel) obj).writeStrongBinder((IBinder) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9242(Object obj, boolean z10) {
        if (C0307.m5935() > 0) {
            ((h0.v0) obj).d(z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String[] m9243(Object obj) {
        if (C0107.m2075() < 0) {
            return ((SSLSocket) obj).getEnabledCipherSuites();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m9244(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static k0.d0 m9245(float f10, Object obj, int i10) {
        if (C0310.m5997() >= 0) {
            return k0.z.b(f10, (m0.m) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m9246() {
        return 489 ^ C0365.f636;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9247(Object obj) {
        if (C0140.m2699() > 0) {
            return ((u2) obj).d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m9248(Object obj) {
        if (C0193.m3691() < 0) {
            return ((a5.c) obj).f1231b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟۠, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m9249() {
        if (C0127.m2448() >= 0) {
            return y1.l.f16789a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۣ, reason: not valid java name and contains not printable characters */
    public static String m9250(Object obj) {
        if (C0428.m8409() < 0) {
            return ((w5) obj).f10458c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m9240(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
