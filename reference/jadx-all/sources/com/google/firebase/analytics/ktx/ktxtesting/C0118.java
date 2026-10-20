package com.google.firebase.analytics.ktx.ktxtesting;

import a5.p;
import a5.y;
import android.content.Context;
import android.net.NetworkRequest;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.input.pointer.C0034;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.measurement.C0183;
import com.google.protobuf.n;
import d3.C0217;
import d5.b0;
import d5.f0;
import dagger.hilt.android.migration.C0239;
import f5.z;
import java.io.ByteArrayOutputStream;
import k0.i;
import k0.m2;
import k6.f5;
import k6.g5;
import k6.s5;
import k6.x;
import k6.x3;
import k6.y5;
import m0.g1;
import n7.C0364;
import s2.C0412;
import t0.C0419;
import t2.C0421;
import u.C0429;
import u0.C0431;
import u8.e;
import v0.C0443;
import x7.C0472;
import z3.C0488;
import z7.C0489;

/* JADX INFO: renamed from: com.google.firebase.analytics.ktx.ktxtesting.۟ۤ۠ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0118 {

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static int f144 = -956;

    /* JADX INFO: renamed from: ۟۠ۥۤۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m2269(Object obj) {
        if (C0364.m7127() <= 0) {
            return ((y) obj).f1322b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static NetworkRequest m2270(Object obj) {
        if (C0034.m667() > 0) {
            return ((NetworkRequest.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤ۠, reason: not valid java name and contains not printable characters */
    public static e m2271(Object obj, Object obj2, Object obj3) {
        if (C0217.m4114() <= 0) {
            return ((p) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2273(Object obj) {
        if (C0488.m9496() <= 0) {
            return ((zzfi.zzj) obj).zzan();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2274() {
        return (-121) ^ C0472.f742;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static FirebaseUser m2275(Object obj) {
        if (C0489.m9505() > 0) {
            return ((z) obj).f6346d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۧ, reason: not valid java name and contains not printable characters */
    public static long m2276() {
        if (C0431.m8425() > 0) {
            return zzne.zzp();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2277(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m2278(Object obj, Object obj2, long j10) {
        if (C0149.m2863() > 0) {
            ((y5) obj).J((s5) obj2, j10);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static Context m2279(Object obj) {
        if (C0183.m3510() >= 0) {
            return ((b0) obj).f4411n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2280(Object obj) {
        if (C0021.m417() >= 0) {
            return ((n) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m2281() {
        if (C0412.m8066() <= 0) {
            return "service_control";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤ۟, reason: contains not printable characters */
    public static String m2282(String str) {
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

    /* JADX INFO: renamed from: ۥۧۢۥ, reason: contains not printable characters */
    public static f5 m2283(Object obj) {
        if (C0443.m8630() <= 0) {
            return ((g5) obj).f10063a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۤ, reason: contains not printable characters */
    public static float m2284() {
        if (C0429.m8409() < 0) {
            return i.f8991a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۧ۟۠, reason: contains not printable characters */
    public static g1 m2285(Object obj) {
        if (C0419.m8221() > 0) {
            return ((f0) obj).f4482b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static x3 m2286() {
        if (C0421.m8263() >= 0) {
            return x.F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2287(Object obj) {
        if (C0239.m4587() < 0) {
            return ((m2) obj).f9216q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2272(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
