package com.google.firebase.ktx;

import a2.C0004;
import a8.C0009;
import android.os.Parcel;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.foundation.text.modifiers.C0025;
import c9.a;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.auth.FirebaseAuth;
import d9.C0225;
import e1.r;
import g5.C0290;
import h0.C0299;
import h3.C0303;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;
import k.f;
import k0.f2;
import k0.m4;
import k0.y4;
import k3.C0335;
import k6.b8;
import k6.d4;
import k6.f5;
import k6.f6;
import k6.h5;
import k6.n6;
import k6.u7;
import k6.x;
import k6.x3;
import k6.x7;
import l0.c;
import l8.C0346;
import m0.m;
import m2.b;
import m2.l;
import o8.C0371;
import p4.C0376;
import r2.C0397;
import s.C0408;
import s3.C0412;
import s7.C0414;
import t9.C0427;
import u0.C0430;
import v0.C0443;
import v0.p;
import y.i1;
import y.t0;
import y3.e;
import z8.C0492;

/* JADX INFO: renamed from: com.google.firebase.ktx.ۨۢۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0180 {

    /* JADX INFO: renamed from: ۟۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int f204 = -376;

    /* JADX INFO: renamed from: ۟۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3425(Object obj) {
        if (C0335.m6500() <= 0) {
            return ((f6) obj).f10050e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3426(Object obj, float f10) {
        if (C0290.m5589() <= 0) {
            ((f) obj).A(f10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m3428() {
        if (C0090.m1920() >= 0) {
            return c.H;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3429(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3430(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3431(Object obj, Object obj2, Object obj3) {
        if (C0371.m7283() > 0) {
            return ((i1) obj).c((b) obj2, (l) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۣ, reason: not valid java name and contains not printable characters */
    public static x3 m3432() {
        if (C0225.m4339() <= 0) {
            return x.A0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۧ, reason: not valid java name and contains not printable characters */
    public static i1 m3433(Object obj) {
        if (C0414.m8130() < 0) {
            return ((f2) obj).f8918b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static d4 m3434(Object obj) {
        if (C0408.m8009() < 0) {
            return ((f5) obj).f10032i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3435(Object obj) {
        if (C0303.m5859() < 0) {
            ((FirebaseAuth) obj).signOut();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3436(Object obj) {
        if (C0009.m177() > 0) {
            return ((zzfi.zzj) obj).zzbm();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۨ, reason: not valid java name and contains not printable characters */
    public static long m3437() {
        if (C0430.m8425() > 0) {
            return r.f5060b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۥ, reason: not valid java name and contains not printable characters */
    public static long m3438(Object obj) {
        if (C0492.m9578() > 0) {
            return ((m4) obj).F;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۨ, reason: not valid java name and contains not printable characters */
    public static float m3439(Object obj, Object obj2) {
        if (C0376.m7371() >= 0) {
            return ((t0) obj).b((l) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int m3440(Object obj) {
        if (C0023.m461() > 0) {
            return ((zzew.zzb.zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۤۢ, reason: not valid java name and contains not printable characters */
    public static int m3441(Object obj) {
        if (C0025.m495() >= 0) {
            return ((y4) obj).f9682o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3442(long j10) {
        if (C0084.m1804() >= 0) {
            return Long.toString(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Serializable m3443(Object obj) {
        if (C0303.m5859() <= 0) {
            return ((n6) obj).f10230b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧ۠, reason: not valid java name and contains not printable characters */
    public static long m3444(Object obj) {
        if (C0412.m8089() < 0) {
            return ((u7) obj).p0();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m3445(Object obj, int i10, int i11) {
        if (C0427.m8371() < 0) {
            e.e1((Parcel) obj, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static void m3446(Object obj, Object obj2, Object obj3, long j10, Object obj4) {
        if (C0397.m7764() <= 0) {
            ((h5) obj).h((String) obj2, (String) obj3, j10, (String) obj4);
        }
    }

    /* JADX INFO: renamed from: ۦۢۡۡ, reason: contains not printable characters */
    public static List m3447(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0299.m5752() < 0) {
            return ((h5) obj).m((String) obj2, (String) obj3, (x7) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static int m3448() {
        return (-295) ^ C0346.f617;
    }

    /* JADX INFO: renamed from: ۦۧۧۢ, reason: contains not printable characters */
    public static Object m3449(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0004.m76() <= 0) {
            return x3.c.d((Object[]) obj, (p) obj2, (a) obj3, (m) obj4, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۢ, reason: contains not printable characters */
    public static int[] m3450() {
        if (C0443.m8654() <= 0) {
            return b8.f9921a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m3427(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
