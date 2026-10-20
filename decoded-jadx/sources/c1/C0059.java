package c1;

import a2.C0005;
import a6.C0007;
import androidx.lifecycle.y0;
import c0.C0057;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.inject.C0172;
import d1.C0211;
import d5.x1;
import d7.t;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.aliasof.C0247;
import f0.t0;
import g4.C0289;
import g7.C0292;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import k0.o1;
import k0.t1;
import k0.x4;
import k6.x;
import k6.x3;
import k8.C0338;
import m0.g1;
import o2.C0368;
import p9.q0;
import r1.l0;
import r5.C0400;
import rikka.shizuku.C0406;
import s7.C0415;
import u.w;
import u0.C0430;
import v9.C0451;
import y1.u;

/* JADX INFO: renamed from: c1.ۣۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0059 {

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int f79 = 888;

    /* JADX INFO: renamed from: ۟۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static x3 m1116() {
        if (C0368.m7234() > 0) {
            return x.f10473a0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1117() {
        return 270 ^ C0246.f326;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static float m1118() {
        if (C0057.m1090() <= 0) {
            return l0.p.f11112g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1119(int i10, int i11) {
        if (C0430.m8425() >= 0) {
            return Math.max(i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static l0 m1120(Object obj) {
        if (C0247.m4732() < 0) {
            return ((t1) obj).f9485t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Method m1121(Object obj, Object obj2, Object obj3) {
        if (C0415.m8144() > 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۢ, reason: not valid java name and contains not printable characters */
    public static u0.b m1122(Object obj, int i10, Object obj2) {
        if (C0406.m7977() <= 0) {
            return t.K((m0.m) obj, i10, (d9.j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static long m1124(Object obj) {
        if (C0292.m5634() <= 0) {
            return ((y3.j) obj).f16913c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m1125(String str) {
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

    /* JADX INFO: renamed from: ۟ۦ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1126(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m1127(Object obj) {
        if (C0289.m5580() < 0) {
            return ((o1) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static g1 m1128(Object obj) {
        if (C0165.m3154() < 0) {
            return ((x1) obj).f4850f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m1129(Object obj, int i10) throws IOException {
        if (C0108.m2101() < 0) {
            ((DataOutputStream) obj).writeInt(i10);
        }
    }

    /* JADX INFO: renamed from: ۡۨۢۧ, reason: not valid java name and contains not printable characters */
    public static q0 m1130(Object obj) {
        if (C0338.m6645() < 0) {
            return ((MainViewModel) obj).f3086d0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1131() {
        if (C0211.m4046() > 0) {
            return zzpg.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1132(Object obj) {
        if (C0243.m4678() >= 0) {
            return ((x4) obj).f9657a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1133() {
        if (C0007.m154() <= 0) {
            return "audience_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۨ, reason: not valid java name and contains not printable characters */
    public static w m1134(float f10, long j10) {
        if (C0005.m104() > 0) {
            return androidx.compose.foundation.a.a(f10, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢۨ, reason: not valid java name and contains not printable characters */
    public static u m1135() {
        if (C0086.m1846() > 0) {
            return y1.r.f16819d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1136(Object obj) {
        if (C0172.m3296() >= 0) {
            ((j8.i) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static t0 m1137() {
        if (C0400.m7847() < 0) {
            return t0.f5937x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m1138(Object obj) {
        if (C0451.m8793() <= 0) {
            return ((y0) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1123(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
