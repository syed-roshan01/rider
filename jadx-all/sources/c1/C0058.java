package c1;

import a5.u;
import com.auto.accept.service.C0072;
import com.google.android.gms.common.C0087;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.messaging.reporting.C0187;
import d.C0211;
import e8.C0266;
import f0.C0273;
import g4.C0290;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import k0.q2;
import k0.t3;
import k6.f5;
import k6.k4;
import k6.p7;
import k6.u7;
import k6.w7;
import n7.C0365;
import r.C0393;
import r1.l0;
import r7.C0405;
import u4.C0437;
import v5.C0446;
import x5.C0471;
import y.u0;

/* JADX INFO: renamed from: c1.ۣ۟۠ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0058 {

    /* JADX INFO: renamed from: ۟ۥ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f78 = -572;

    /* JADX INFO: renamed from: ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m1097(Object obj) {
        if (C0290.m5580() < 0) {
            return ((u) obj).f1308b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static u0 m1098() {
        if (C0187.m3565() >= 0) {
            return k0.i.f8994d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1099(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1100(Object obj, Object obj2, Object obj3, int i10) {
        if (C0211.m4028() <= 0) {
            y3.e.j((c9.a) obj, (c9.a) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠۠, reason: not valid java name and contains not printable characters */
    public static e0.a m1101(Object obj) {
        if (C0088.m1874() >= 0) {
            return ((q2) obj).f9392d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1103(Object obj) {
        if (C0266.m5069() <= 0) {
            return ((f5) obj).h();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1104(Object obj, boolean z10) {
        if (C0437.m8524() <= 0) {
            ((URLConnection) obj).setUseCaches(z10);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static l0 m1105(Object obj) {
        if (C0273.m5249() <= 0) {
            return ((k0.f) obj).f8896b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1106() {
        return 865 ^ C0087.f121;
    }

    /* JADX INFO: renamed from: ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static void m1107(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        if (C0072.m1556() > 0) {
            u7.O((w7) obj, (String) obj2, i10, (String) obj3, (String) obj4, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m1108(String str) {
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

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1109() {
        if (C0156.m2976() > 0) {
            return "pa";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦۥ, reason: contains not printable characters */
    public static float m1110(Object obj) {
        if (C0103.m2022() > 0) {
            return ((t3) obj).f9497q;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۣۨ۟, reason: contains not printable characters */
    public static String m1111(Object obj, Object obj2, Object obj3) {
        if (C0405.m7934() > 0) {
            return y3.e.a1((String[]) obj, (String[]) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m1112(Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0365.m7147() <= 0) {
            f6.a.j((y0.o) obj, (c9.e) obj2, (m0.m) obj3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۧۧۦ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzi.zza m1113(Object obj, Object obj2) {
        if (C0446.m8692() < 0) {
            return ((zzfi.zzi.zza) obj).zza((zzfi.zzj.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۦۥ, reason: not valid java name and contains not printable characters */
    public static k4 m1114(Object obj) {
        if (C0393.m7675() < 0) {
            return ((p7) obj).R();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static x.m m1115(Object obj) {
        if (C0471.m9151() > 0) {
            return ((f0.h) obj).f5717n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1102(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
