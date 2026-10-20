package h5;

import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.node.C0037;
import androidx.profileinstaller.C0045;
import c1.C0058;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.annotations.C0127;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.ktx.C0180;
import d5.i;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.components.C0243;
import h7.C0311;
import j5.C0327;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import k0.f1;
import k0.f2;
import k0.m4;
import k0.p3;
import k0.q1;
import k0.u3;
import k6.f5;
import k6.t4;
import k6.x;
import k6.x3;
import k6.z3;
import la.C0348;
import m0.g1;
import m0.m;
import m0.q;
import o1.C0367;
import q5.C0385;
import s8.C0416;
import v8.C0450;
import z.C0481;

/* JADX INFO: renamed from: h5.۟ۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0306 {

    /* JADX INFO: renamed from: ۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int f454 = -382;

    /* JADX INFO: renamed from: ۟۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static g1 m5905(Object obj) {
        if (C0481.m9373() <= 0) {
            return ((i) obj).f4556e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static List m5906(Object obj) {
        if (C0327.m6319() <= 0) {
            return ((f2) obj).f8920d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5907(Object obj) {
        if (C0045.m874() > 0) {
            return ((q1) obj).f9381p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static f1 m5908() {
        if (C0243.m4678() >= 0) {
            return f1.f8914b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m5909() {
        if (C0127.m2448() > 0) {
            return "stealth_mode";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static x3 m5910() {
        if (C0023.m461() >= 0) {
            return x.f10488i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static Task m5912(Object obj, Object obj2, Object obj3) {
        if (C0058.m1106() >= 0) {
            return ((FirebaseAuth) obj).signInWithEmailAndPassword((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m5913(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۤۤ۠, reason: not valid java name and contains not printable characters */
    public static long m5914() {
        if (C0152.m2931() >= 0) {
            return l0.c.f11019k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۟, reason: not valid java name and contains not printable characters */
    public static k6.i m5915() {
        if (C0348.m6818() <= 0) {
            return k6.i.f10101p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۡ, reason: not valid java name and contains not printable characters */
    public static zzfc.zzd m5916(Object obj, Object obj2, Object obj3) {
        if (C0367.m7199() < 0) {
            return ((t4) obj).t((String) obj2, (byte[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۡ, reason: not valid java name and contains not printable characters */
    public static z3 m5917(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((f5) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static Timestamp m5918() {
        if (C0236.m4549() < 0) {
            return Timestamp.now();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5919(Object obj, float f10) {
        if (C0416.m8173() <= 0) {
            return ((q) obj).d(f10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5920(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static float m5921() {
        if (C0311.m6027() <= 0) {
            return u3.f9526c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static long m5922(Object obj) {
        if (C0153.m2938() <= 0) {
            return ((m4) obj).J;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۦۦ, reason: contains not printable characters */
    public static int m5923(Object obj) {
        if (C0385.m7546() > 0) {
            return ((DisplayMetrics) obj).widthPixels;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۧۨ, reason: not valid java name and contains not printable characters */
    public static long m5924(long j10, float f10, Object obj) {
        if (C0037.m733() >= 0) {
            return p3.c(j10, f10, (m) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۧۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5925() {
        return 508 ^ C0450.f721;
    }

    /* JADX INFO: renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m5926(Object obj) {
        if (C0180.m3448() > 0) {
            return ((Locale) obj).getLanguage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m5911(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
