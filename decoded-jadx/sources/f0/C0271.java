package f0;

import a.C0001;
import android.os.BaseBundle;
import androidx.compose.ui.draw.C0028;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.abt.C0113;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.remoteconfig.interop.C0198;
import d.C0210;
import d1.C0214;
import d4.C0217;
import d8.C0221;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0236;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.k3;
import k0.o3;
import k4.C0336;
import k6.a8;
import k6.j6;
import k6.m6;
import k6.s5;
import k6.w4;
import k6.y5;
import m7.C0356;
import n.C0361;
import p3.C0375;
import v0.C0441;
import w4.C0459;

/* JADX INFO: renamed from: f0.ۣۦۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0271 {

    /* JADX INFO: renamed from: ۟ۤۡۡ۟, reason: not valid java name and contains not printable characters */
    public static int f387 = -802;

    /* JADX INFO: renamed from: ۟۠۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static a2.c0 m5215(Object obj, Object obj2) {
        if (C0156.m2976() > 0) {
            return o1.s.g0((a2.c0) obj, (m2.l) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m5216(Object obj) {
        if (C0361.m7097() <= 0) {
            return ((j6) obj).f10129d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5217(Object obj, Object obj2, double d10) {
        if (C0113.m2182() <= 0) {
            ((BaseBundle) obj).putDouble((String) obj2, d10);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static k1 m5218(Object obj) {
        if (C0356.m6984() >= 0) {
            return ((h1) obj).f5736e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟۠, reason: not valid java name and contains not printable characters */
    public static Map m5219(Object obj) {
        if (C0210.m4028() < 0) {
            return ((a8) obj).f9900f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5221(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int m5222() {
        return (-409) ^ C0214.f238;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static String m5223() {
        if (C0336.m6515() <= 0) {
            return "en";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5224(Object obj, Object obj2, Object obj3, int i10) {
        if (C0217.m4144() >= 0) {
            ((d5.k1) obj).a((y.v) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static s5 m5225(int i10, Object obj) {
        if (C0231.m4453() < 0) {
            return s5.c(i10, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5226(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static w4 m5227(Object obj) {
        if (C0123.m2379() >= 0) {
            return ((y5) obj).f10582q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static void m5228(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, long j10, long j11, long j12, long j13, Object obj5, Object obj6, int i10, int i11) {
        if (C0441.m8612() >= 0) {
            k3.a((y0.o) obj, (c9.e) obj2, (c9.e) obj3, z10, (e1.l0) obj4, j10, j11, j12, j13, (c9.e) obj5, (m0.m) obj6, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static i1.f m5229() {
        if (C0221.m4264() >= 0) {
            return o7.d0.H();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5230(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, int i11) {
        if (C0028.m557() > 0) {
            f6.a.a((y0.o) obj, (e1.l0) obj2, (k0.g0) obj3, (k0.h0) obj4, (u.w) obj5, (c9.f) obj6, (m0.m) obj7, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۤۦۧۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m5231() {
        if (C0001.m35() <= 0) {
            return y3.e.f16899f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦ۠, reason: contains not printable characters */
    public static p9.z m5232(Object obj) {
        if (C0090.m1920() > 0) {
            return ((MainViewModel) obj).P0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۡ, reason: contains not printable characters */
    public static float m5233(Object obj) {
        if (C0135.m2608() < 0) {
            return ((o3) obj).f9321p;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۢۧۦ, reason: contains not printable characters */
    public static long m5234(Object obj) {
        if (C0198.m3800() > 0) {
            return ((k6.l) obj).f10163d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m5235(Object obj) {
        if (C0236.m4549() <= 0) {
            return ((k0.b) obj).f8723a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m5236(int i10) {
        if (C0459.m8951() < 0) {
            return com.google.protobuf.h2.D(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m5237(Object obj) {
        if (C0375.m7362() >= 0) {
            return ((m6) obj).f10211d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5220(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
