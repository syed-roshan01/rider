package com.google.firebase.firestore.bundle;

import aa.C0012;
import android.os.Bundle;
import androidx.compose.ui.graphics.C0032;
import c4.C0065;
import c9.a;
import c9.e;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzps;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.tracing.C0204;
import com.google.gson.internal.bind.C0206;
import d5.w0;
import d5.y1;
import d7.C0220;
import e1.l0;
import g.C0282;
import g2.s;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k.C0331;
import k0.m2;
import k0.p1;
import k0.p3;
import k6.e6;
import k6.f4;
import k6.f5;
import k6.h5;
import k6.q6;
import k6.u7;
import k6.x7;
import l6.C0344;
import m0.m;
import m1.C0351;
import m5.C0354;
import m7.C0357;
import m9.d0;
import r2.C0395;
import u.w;
import u0.b;
import x0.C0466;
import x2.C0467;
import y0.o;
import y1.t;
import y1.v;
import z0.C0482;

/* JADX INFO: renamed from: com.google.firebase.firestore.bundle.۟ۡۦۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0148 {

    /* JADX INFO: renamed from: ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static int f173 = -242;

    /* JADX INFO: renamed from: ۟۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2825(Object obj, Object obj2, long j10, long j11, float f10, float f11, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        if (C0482.m9389() >= 0) {
            p3.a((o) obj, (l0) obj2, j10, j11, f10, f11, (w) obj3, (b) obj4, (m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2826(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static Bundle m2827(Object obj) {
        if (C0220.m4261() >= 0) {
            return ((e6) obj).f10007d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2828(Object obj) {
        if (C0012.m226() >= 0) {
            return ((f5) obj).f10027d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static e m2829(Object obj) {
        if (C0204.m3905() <= 0) {
            return ((p1) obj).f9344r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static a m2830(Object obj) {
        if (C0185.m3538() >= 0) {
            return ((y1) obj).f4869e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m2831(Object obj, int i10) {
        if (C0282.m5446() >= 0) {
            return ((zzfi.zzj.zza) obj).zzh(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2832() {
        if (C0357.m7001() <= 0) {
            return zzps.zzd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2833(Object obj, int i10) {
        if (C0331.m6408() < 0) {
            t.d((v) obj, i10);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static List m2834(Object obj) {
        if (C0089.m1902() < 0) {
            return ((m2) obj).f9208b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static d0 m2835(Object obj) {
        if (C0466.m9086() >= 0) {
            return ((w0) obj).f4820c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۣ, reason: not valid java name and contains not printable characters */
    public static s m2837(Object obj) {
        if (C0065.m1257() <= 0) {
            return ((f0.t) obj).f5916x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2838() {
        return (-791) ^ C0344.f615;
    }

    /* JADX INFO: renamed from: ۣۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m2839(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2840(Object obj) {
        if (C0467.m9101() <= 0) {
            return ((q6) obj).f10327d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m2841(Object obj, Object obj2, Object obj3) {
        if (C0351.m6885() >= 0) {
            return ((u7) obj).i0(obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2842(Object obj) {
        if (C0032.m620() <= 0) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static void m2843(Object obj, Object obj2) {
        if (C0395.m7737() > 0) {
            ((p) obj).P0((l) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۤۥ, reason: contains not printable characters */
    public static boolean m2844(Object obj) {
        if (C0354.m6953() <= 0) {
            return ((f4) obj).f10022c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۤ۠, reason: contains not printable characters */
    public static void m2845(Object obj, Object obj2, Object obj3) {
        if (C0323.m6259() < 0) {
            ((h5) obj).mo6534c((Bundle) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2846(Object obj) {
        if (C0206.m3931() >= 0) {
            return ((f2.l) obj).f6122a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2836(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
