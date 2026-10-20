package c3;

import android.os.Bundle;
import androidx.compose.foundation.relocation.C0024;
import androidx.preference.C0044;
import c0.C0057;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.messaging.C0192;
import dagger.hilt.components.C0244;
import e0.C0257;
import e2.C0261;
import f0.c0;
import f5.g0;
import h0.b1;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import k0.f4;
import k0.i0;
import k0.i2;
import k0.v2;
import k6.g6;
import k6.u7;
import k6.x;
import k6.x3;
import k6.z4;
import p0.C0374;
import t7.C0426;
import y.i1;
import y.u0;
import z.C0482;
import z0.C0483;
import z3.C0487;

/* JADX INFO: renamed from: c3.۟ۥ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0063 {

    /* JADX INFO: renamed from: ۣ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int f83 = -822;

    /* JADX INFO: renamed from: ۟۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static i1 m1207(Object obj) {
        if (C0487.m9464() >= 0) {
            return ((i2) obj).f9028f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static t1.i m1208() {
        if (m1217() >= 0) {
            return t1.k.f14461e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m1209(Object obj, long j10, Object obj2) {
        if (C0257.m4901() < 0) {
            return ((TimeUnit) obj).convert(j10, (TimeUnit) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1210(long j10, long j11) {
        if (C0374.m7322() < 0) {
            return e1.r.c(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static u0 m1211() {
        if (C0483.m9389() >= 0) {
            return f4.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static AuthCredential m1212(Object obj, Object obj2) {
        if (C0192.m3659() > 0) {
            return EmailAuthProvider.getCredential((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1213(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1215(Object obj) {
        if (C0081.m1735() >= 0) {
            return ((g0) obj).f6266o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۤ, reason: not valid java name and contains not printable characters */
    public static x3 m1216() {
        if (C0024.m487() >= 0) {
            return x.I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1217() {
        return 498 ^ C0244.f323;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧ۟, reason: not valid java name and contains not printable characters */
    public static Bundle m1218(Object obj, Object obj2) {
        if (C0044.m860() > 0) {
            return ((u7) obj).c0((Bundle) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static void m1219(Object obj) {
        if (C0107.m2075() <= 0) {
            ((z4) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۢۦۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1220(Object obj) {
        if (C0073.m1597() > 0) {
            return ((g6) obj).f10064a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1221(Object obj) {
        if (C0482.m9373() < 0) {
            return ((c0) obj).f5629b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static c9.a m1222(Object obj) {
        if (C0426.m8351() <= 0) {
            return ((v2) obj).f9555e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1223(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static long m1224(Object obj) {
        if (C0261.m4984() > 0) {
            return ((b1) obj).f7354a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧ۟۠, reason: not valid java name and contains not printable characters */
    public static long m1225(Object obj) {
        if (C0057.m1090() < 0) {
            return ((i0) obj).f8998b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static float m1226() {
        if (C0156.m2976() > 0) {
            return l0.g.f11052f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1214(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
