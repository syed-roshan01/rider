package ea;

import a2.C0004;
import androidx.compose.ui.platform.C0038;
import c4.C0064;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.measurement_impl.C0185;
import d1.C0213;
import d5.g0;
import e1.C0258;
import f0.r1;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import k0.e3;
import k6.p6;
import m0.l3;
import q6.C0387;
import q9.C0392;
import t1.C0420;

/* JADX INFO: renamed from: ea.۟ۦۢۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0268 {

    /* JADX INFO: renamed from: ۢۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int f347 = -331;

    /* JADX INFO: renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m5100(Object obj) {
        if (C0185.m3538() > 0) {
            return ((p6) obj).f10279f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5101(Object obj) {
        if (C0387.m7564() >= 0) {
            return ((zzfi.zzg) obj).zzn();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m5102(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static String m5103() {
        if (C0392.m7657() > 0) {
            return "Please keep your driving app's language set to English for reliable auto-accept detection.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static a5.z m5104(Object obj) {
        if (C0119.m2289() >= 0) {
            return ((a5.t) obj).f1305b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m5105(Object obj) {
        if (C0038.m750() <= 0) {
            ((d5.h) obj).m4175invoke();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static l3 m5106(Object obj) {
        if (C0420.m8247() >= 0) {
            return ((g0) obj).f4507b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m5107(Object obj) {
        if (C0004.m76() < 0) {
            return ((e3) obj).f8869c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m5108(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5109() {
        if (C0258.m4918() > 0) {
            return zzpy.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m5111(Object obj) {
        if (C0328.m6319() < 0) {
            return ((zzfi.zzj) obj).zzw();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۠ۡ, reason: contains not printable characters */
    public static boolean m5112(Object obj) {
        if (C0213.m4051() >= 0) {
            return ((r1) obj).f5877e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5113() {
        return 800 ^ C0064.f84;
    }

    /* JADX INFO: renamed from: ۡۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m5110(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
