package c3;

import android.os.Bundle;
import b3.C0051;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.components.C0135;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d1.C0212;
import d5.d1;
import d5.d2;
import d5.g1;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.C0253;
import e2.C0262;
import e9.C0267;
import f0.e2;
import f0.p1;
import f0.t0;
import f5.z;
import h.C0298;
import h7.C0311;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.net.URLConnection;
import java.util.List;
import k0.m4;
import k0.n1;
import k0.u2;
import k0.w3;
import k0.w4;
import k0.y2;
import k4.C0337;
import k6.d8;
import k6.u7;
import k6.x7;
import k6.z7;
import m0.C0350;
import m0.l3;
import m7.C0359;
import q0.C0383;
import r1.x0;
import r2.C0395;
import r2.C0397;
import v5.C0446;
import x5.C0471;
import x7.C0473;
import y6.C0477;
import z7.C0489;

/* JADX INFO: renamed from: c3.۟ۡۧۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0062 {

    /* JADX INFO: renamed from: ۨۦۤۨ, reason: not valid java name and contains not printable characters */
    public static int f82 = 322;

    /* JADX INFO: renamed from: ۟۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m1176(Object obj, Object obj2) {
        if (C0149.m2863() > 0) {
            return ((f0.o) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m1177(Object obj, int i10) {
        if (C0477.m9298() <= 0) {
            ((URLConnection) obj).setReadTimeout(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static x0 m1178(Object obj) {
        if (C0471.m9151() > 0) {
            return ((w4) obj).f9628q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m1179(Object obj) {
        if (C0267.m5099() < 0) {
            return ((d2) obj).f4456a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static y0.o m1181(Object obj) {
        if (C0253.m4832() < 0) {
            return ((w3) obj).f9612a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static BigDecimal m1182(Object obj, Object obj2) {
        if (C0350.m6838() <= 0) {
            return ((BigDecimal) obj).add((BigDecimal) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static z7 m1183(Object obj) {
        if (C0395.m7729() > 0) {
            return ((d8) obj).f9986h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1184() {
        if (C0383.m7487() < 0) {
            return "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۥ, reason: not valid java name and contains not printable characters */
    public static l3 m1185(Object obj) {
        if (C0234.m4495() <= 0) {
            return ((d1) obj).f4454f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m1186() {
        return 853 ^ C0359.f629;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m1187(Object obj) {
        if (C0051.m992() > 0) {
            return u7.w((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static t0 m1188() {
        if (C0446.m8692() <= 0) {
            return t0.P;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static x.m m1189(Object obj) {
        if (C0489.m9505() > 0) {
            return ((n1) obj).f9255e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1190(Object obj) {
        if (C0397.m7755() >= 0) {
            return ((a2.p) obj).f964h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1191(int i10, int i11) {
        if (C0138.m2662() >= 0) {
            return Math.min(i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1192(boolean z10) {
        if (C0328.m6319() < 0) {
            return Boolean.hashCode(z10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1193() {
        if (C0116.m2247() > 0) {
            return zzob.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static int m1194(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static e2 m1195(Object obj) {
        if (C0337.m6515() <= 0) {
            return ((p1) obj).f5853h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static c9.a m1196(Object obj) {
        if (C0473.m9193() < 0) {
            return ((g1) obj).f4513c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1197(Object obj) {
        if (C0101.m1975() >= 0) {
            return ((z) obj).f6351p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1198(Object obj) {
        if (C0311.m5997() > 0) {
            ((k6.k) obj).f0();
        }
    }

    /* JADX INFO: renamed from: ۤۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1199(Object obj) {
        if (C0193.m3691() <= 0) {
            return ((f0.r) obj).f5867f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۨۥ, reason: contains not printable characters */
    public static int m1200(Object obj) {
        if (C0243.m4660() < 0) {
            return ((y2) obj).f9672d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static String m1201(String str) {
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

    /* JADX INFO: renamed from: ۦۤۡۧ, reason: contains not printable characters */
    public static long m1202() {
        if (C0135.m2608() < 0) {
            return zzne.zzaj();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static double m1203(double d10, double d11) {
        return C0262.m4991() >= 0 ? Math.pow(d10, d11) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static long m1204(Object obj) {
        if (C0395.m7729() > 0) {
            return ((m4) obj).f9234n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1205(Object obj) {
        if (C0212.m4046() >= 0) {
            return ((x7) obj).f10549n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static u8.e m1206(Object obj, Object obj2, Object obj3) {
        if (C0298.m5722() >= 0) {
            return ((u2) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1180(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
