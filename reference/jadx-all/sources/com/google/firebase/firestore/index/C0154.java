package com.google.firebase.firestore.index;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.fragment.app.C0042;
import c9.e;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.concurrent.C0136;
import d5.q;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import e1.C0259;
import f0.i0;
import f0.k1;
import f0.r0;
import fa.C0282;
import h0.v0;
import h6.C0310;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import k0.r4;
import k0.x;
import k0.x3;
import k6.a5;
import k6.c5;
import k6.f5;
import k6.s5;
import k6.s7;
import k6.t5;
import k6.y5;
import k6.z4;
import m7.C0357;
import n7.C0365;
import p3.C0376;
import p8.C0380;
import q7.C0391;
import t2.C0424;
import t8.C0427;
import u0.b;
import w4.C0462;
import y0.o;
import z0.C0483;
import z6.a;
import z7.C0490;

/* JADX INFO: renamed from: com.google.firebase.firestore.index.ۣ۟۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0154 {

    /* JADX INFO: renamed from: ۥۤۦۨ, reason: contains not printable characters */
    public static int f179 = -39;

    /* JADX INFO: renamed from: ۟۠ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m2948(Object obj) {
        if (C0232.m4453() < 0) {
            return ((f5) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static o m2949(Object obj, float f10) {
        if (C0122.m2355() >= 0) {
            return c.h((o) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2950(int i10, int i11) {
        if (C0103.m2022() > 0) {
            return a.B(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static o m2952(Object obj) {
        if (C0136.m2627() >= 0) {
            return ((x3) obj).f9649c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static c5 m2953(Object obj) {
        if (C0357.m6984() > 0) {
            return ((z4) obj).f10607d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2954(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2955(Object obj, boolean z10) {
        if (C0376.m7362() >= 0) {
            ((v0) obj).h(z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۦ, reason: not valid java name and contains not printable characters */
    public static e m2956(Object obj) {
        if (C0424.m8307() > 0) {
            return ((r4) obj).f9428f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static k1 m2957(Object obj) {
        if (C0328.m6319() <= 0) {
            return ((i0) obj).f5753c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2958() {
        return (-38) ^ C0483.f756;
    }

    /* JADX INFO: renamed from: ۢۡۨۦ, reason: not valid java name and contains not printable characters */
    public static b m2959() {
        if (C0427.m8356() < 0) {
            return q.f4737n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static void m2960(Object obj, Object obj2) {
        if (C0365.m7147() <= 0) {
            ((y5) obj).I((s5) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String[] m2961() {
        if (C0282.m5443() < 0) {
            return t5.f10394d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ, reason: not valid java name and contains not printable characters */
    public static String m2962() {
        if (C0310.m5971() < 0) {
            return "Working perfectly for";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2963(Object obj) {
        if (C0391.m7643() <= 0) {
            return ((a5) obj).f9871f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Context m2964(Object obj) {
        if (C0042.m820() > 0) {
            return ((s7) obj).f10364a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦۡ, reason: contains not printable characters */
    public static float m2965() {
        if (C0380.m7433() >= 0) {
            return x.f9634b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧ۟۟, reason: not valid java name and contains not printable characters */
    public static int m2966(Object obj) {
        if (C0259.m4939() <= 0) {
            return ((k0.e) obj).f8857u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m2967(Object obj) {
        if (C0490.m9528() >= 0) {
            return ((r0) obj).f5872e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2968() {
        if (C0462.m8993() >= 0) {
            return zzob.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m2969(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2951(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
