package g2;

import a3.C0006;
import android.app.Application;
import android.os.Process;
import c4.C0066;
import com.auto.accept.service.C0072;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0184;
import d5.r1;
import dagger.hilt.codegen.C0241;
import dagger.hilt.internal.definecomponent.C0249;
import f0.i1;
import fa.C0280;
import g4.C0289;
import ga.C0295;
import h3.C0303;
import i6.C0320;
import i7.a1;
import i7.h1;
import i7.t1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import k6.l4;
import k6.v6;
import k6.w4;
import k6.x3;
import o8.C0371;
import q5.C0385;
import r4.C0398;
import z7.C0490;

/* JADX INFO: renamed from: g2.ۢۥۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0287 {

    /* JADX INFO: renamed from: ۟ۧۥۦۤ, reason: not valid java name and contains not printable characters */
    public static int f432 = -541;

    /* JADX INFO: renamed from: ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m5523(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5524(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5525(int i10) {
        if (C0490.m9552() >= 0) {
            Process.setThreadPriority(i10);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5526(Object obj) {
        if (C0066.m1277() > 0) {
            return ((zzfi.zzc) obj).zzh();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static h1 m5527(Object obj, Object obj2, Object obj3) {
        if (C0249.m4779() <= 0) {
            return ((w4) obj).d((a1) obj2, (t1) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5528(Object obj) {
        if (C0072.m1556() > 0) {
            return ((r1) obj).f4752a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5529() {
        return (-557) ^ C0320.f468;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m5530() {
        if (C0280.m5432() > 0) {
            return zzne.zzac();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static String m5531(Object obj) {
        if (C0082.m1758() >= 0) {
            return ((k6.b) obj).f9904b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨ۟, reason: not valid java name and contains not printable characters */
    public static i0 m5532(Object obj, Object obj2) {
        if (C0170.m3247() <= 0) {
            return ((l0) obj).a((a2.e) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m5533(Object obj) {
        if (C0241.m4629() < 0) {
            return ((v6) obj).f10443d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۣ, reason: not valid java name and contains not printable characters */
    public static j0.b0 m5534(Object obj) {
        if (C0289.m5580() < 0) {
            return ((l4) obj).f10188u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۟, reason: not valid java name and contains not printable characters */
    public static long m5535() {
        if (C0385.m7546() > 0) {
            return i1.f5766l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m5536() {
        if (C0006.m112() <= 0) {
            return l0.p.f11108c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5537(Object obj) {
        if (C0371.m7283() > 0) {
            return ((AbstractInterruptibleChannel) obj).isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static x3 m5539() {
        if (C0295.m5679() > 0) {
            return k6.x.E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Application m5540(Object obj) {
        if (C0184.m3517() >= 0) {
            return ((androidx.lifecycle.a) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۨ, reason: contains not printable characters */
    public static void m5541(Object obj, Object obj2) throws IOException {
        if (C0156.m2976() >= 0) {
            ((Writer) obj).write((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۧۥ, reason: contains not printable characters */
    public static int m5542(Object obj) {
        if (C0398.m7797() < 0) {
            return ((d5.g0) obj).f4506a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۥ, reason: contains not printable characters */
    public static boolean m5543(Object obj) {
        if (C0303.m5859() <= 0) {
            return ((k0.w) obj).f9593s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m5544(Object obj, Object obj2) {
        if (C0385.m7546() >= 0) {
            ((Thread) obj).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m5538(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
