package dagger.hilt.internal;

import a5.q;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.graphics.C0030;
import b.C0049;
import c3.C0063;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.remoteconfig.C0200;
import f5.d;
import f5.f;
import g2.i0;
import g2.s;
import g5.C0290;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import k6.a5;
import k6.h5;
import k6.k5;
import k6.r7;
import n1.C0362;
import r1.C0393;
import r1.p;
import r7.C0403;
import s.C0408;
import s7.C0414;
import x8.C0473;
import y3.e;

/* JADX INFO: renamed from: dagger.hilt.internal.ۡۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0253 {

    /* JADX INFO: renamed from: ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f333 = 209;

    /* JADX INFO: renamed from: ۣۣ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4834(Object obj, int i10) {
        if (C0085.m1825() > 0) {
            return ((p) obj).Q(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m4835(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4836(float f10) {
        if (C0403.m7911() <= 0) {
            return Float.floatToRawIntBits(f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۧ, reason: not valid java name and contains not printable characters */
    public static h5 m4837(Object obj) {
        if (C0063.m1217() >= 0) {
            return ((k5) obj).f10158e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static f m4838() {
        if (C0362.m7099() < 0) {
            return f.f6254a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4840(Object obj) {
        if (C0393.m7716() >= 0) {
            return ((q) obj).f1297d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4841(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4842(Object obj, Object obj2) {
        if (C0414.m8130() <= 0) {
            return ((String) obj).indexOf((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m4843(Object obj, long j10, Object obj2) {
        if (C0165.m3154() < 0) {
            return ((Future) obj).get(j10, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4844() {
        return (-636) ^ C0118.f144;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static Boolean m4845() {
        if (C0200.m3841() <= 0) {
            return e.f16904k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static long m4846(Object obj) {
        if (C0290.m5589() <= 0) {
            return ((a5) obj).f9888w;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۨۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m4847(Object obj, Object obj2) {
        if (C0109.m2116() <= 0) {
            return ((r7) obj).V((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static d m4848() {
        if (C0049.m945() >= 0) {
            return d.f6243a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧ, reason: contains not printable characters */
    public static boolean m4849(Object obj) {
        if (C0408.m8009() < 0) {
            return ((zzew.zzd) obj).zzl();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
    public static String m4850(Object obj) {
        if (C0473.m9210() < 0) {
            return ((Field) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ۟, reason: contains not printable characters */
    public static Object m4851(Object obj) {
        if (C0030.m575() > 0) {
            return ((a5.f) obj).f1250a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static s m4852(Object obj) {
        if (C0026.m508() > 0) {
            return ((i0) obj).f6568b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۥ, reason: not valid java name and contains not printable characters */
    public static String m4839(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
