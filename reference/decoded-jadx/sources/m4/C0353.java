package m4;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.C0037;
import b3.C0051;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.messaging.C0192;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.C0195;
import d2.C0215;
import d3.C0216;
import d5.e0;
import d5.z0;
import dagger.hilt.android.lifecycle.C0236;
import f0.h1;
import f4.C0276;
import g2.C0287;
import h3.C0301;
import h8.C0313;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import k0.i0;
import k0.k0;
import k0.m4;
import k0.o1;
import k0.u;
import k0.v3;
import k3.C0335;
import k8.C0338;
import l0.q;
import la.C0348;
import m0.q2;
import m9.C0359;
import n8.C0365;
import p9.q0;
import q6.C0387;
import r1.l0;
import r7.C0403;
import r7.C0404;
import s7.C0415;
import t3.C0424;
import v0.C0441;
import v6.C0447;
import v9.C0451;
import w5.C0463;

/* JADX INFO: renamed from: m4.۟ۧۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0353 {

    /* JADX INFO: renamed from: ۟ۥۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int f624 = 889;

    /* JADX INFO: renamed from: ۟۠ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static String m6914() {
        if (C0451.m8793() <= 0) {
            return "Error deleting conditional property";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6915(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6916(Object obj, Object obj2, int i10) {
        if (C0192.m3659() > 0) {
            return ((q2) obj).f((int[]) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static q0 m6917(Object obj) {
        if (C0415.m8144() > 0) {
            return ((MainViewModel) obj).f3082b0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥ۟, reason: not valid java name and contains not printable characters */
    public static long m6918() {
        if (C0037.m733() > 0) {
            return e5.a.b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static i1.f m6919() {
        if (C0463.m9033() >= 0) {
            return f6.a.R();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢ۠, reason: not valid java name and contains not printable characters */
    public static float m6920(Object obj) {
        if (C0313.m6072() <= 0) {
            return ((k0.k) obj).f9085f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m6921(Object obj) {
        if (C0424.m8322() > 0) {
            return ((AccessibilityNodeInfo) obj).getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m6922(Object obj) {
        if (C0359.m7059() <= 0) {
            return ((ArrayDeque) obj).pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int m6923(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۥ, reason: not valid java name and contains not printable characters */
    public static UserProfile m6924(Object obj) {
        if (C0348.m6818() <= 0) {
            return ((f5.a) obj).f6229a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m6925(Object obj) {
        if (C0301.m5797() < 0) {
            return ((e0) obj).f4465a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ۠, reason: not valid java name and contains not printable characters */
    public static float m6926() {
        if (C0387.m7585() > 0) {
            return q.f11118f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m6927() {
        if (C0051.m992() >= 0) {
            return "timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static m4 m6928(Object obj) {
        if (C0338.m6645() < 0) {
            return ((o1) obj).f9291d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦ۠, reason: not valid java name and contains not printable characters */
    public static y.f m6929() {
        if (C0404.m7934() > 0) {
            return y.k.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥۥ, reason: not valid java name and contains not printable characters */
    public static int m6930(Object obj, int i10) {
        if (C0447.m8732() < 0) {
            return ((g9.c) obj).c(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static l0 m6931(Object obj) {
        if (C0276.m5315() <= 0) {
            return ((u) obj).f9512n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static q0 m6932(Object obj) {
        if (C0236.m4549() < 0) {
            return ((MainViewModel) obj).f3129z0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۨۢ, reason: contains not printable characters */
    public static u8.e m6933(Object obj, Object obj2, Object obj3) {
        if (C0403.m7911() <= 0) {
            return ((z0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥ, reason: contains not printable characters */
    public static long m6934(long j10, Object obj) {
        if (C0149.m2863() >= 0) {
            return k0.b(j10, (m0.m) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۨ۟ۥ, reason: contains not printable characters */
    public static zzew.zzb m6935(Object obj, int i10) {
        if (C0365.m7172() > 0) {
            return ((zzew.zza.C0093zza) obj).zza(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static void m6936() {
        if (C0216.m4114() <= 0) {
            o8.b.d();
        }
    }

    /* JADX INFO: renamed from: ۦۤۨۢ, reason: contains not printable characters */
    public static int m6937(Object obj) {
        if (C0451.m8793() <= 0) {
            return ((h1) obj).f5734c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۥۥ, reason: contains not printable characters */
    public static long m6938(Object obj) {
        if (C0287.m5529() >= 0) {
            return ((i0) obj).f9002f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۡۥ, reason: not valid java name and contains not printable characters */
    public static double m6939() {
        return C0195.m3737() <= 0 ? zzpa.zza() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۨ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m6940() {
        return 59 ^ C0441.f712;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6941(Object obj) {
        if (C0215.m4108() <= 0) {
            return ((v3) obj).f9559d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۡۦ, reason: not valid java name and contains not printable characters */
    public static e0.e m6942() {
        if (C0335.m6500() <= 0) {
            return e0.f.f4988a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6943(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
