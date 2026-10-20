package com.google.firebase.installations.interop;

import a3.C0006;
import c9.f;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement.C0183;
import com.google.firebase.tracing.C0204;
import d3.C0216;
import d7.t;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.migration.C0238;
import e0.C0256;
import e1.k0;
import f0.q0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.b2;
import k0.q;
import k6.f5;
import k6.m7;
import k6.p7;
import m0.m;
import m0.n1;
import m0.z2;
import o0.d;
import v6.C0446;
import w0.c;
import w4.C0459;
import w4.C0460;
import y0.a;
import y0.e;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.installations.interop.۠ۨۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0173 {

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int f197 = -816;

    /* JADX INFO: renamed from: ۟۠ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3298(Object obj) {
        if (C0232.m4482() > 0) {
            p7.o((m7) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۡ, reason: not valid java name and contains not printable characters */
    public static float m3299(Object obj) {
        if (C0460.m8972() > 0) {
            return ((Number) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۨ, reason: not valid java name and contains not printable characters */
    public static e m3300() {
        if (C0126.m2434() >= 0) {
            return a.f16715o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3301(Object obj) {
        if (C0216.m4114() < 0) {
            return ((q0) obj).f5860c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static d m3302(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((c) obj).f16039i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3303(String str) {
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

    /* JADX INFO: renamed from: ۡۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m3304(Object obj) {
        if (C0171.m3272() <= 0) {
            return ((k0) obj).f5040b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static n1 m3305(Object obj, Object obj2) {
        if (C0446.m8696() >= 0) {
            return t.g0(obj, (z2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨۤ, reason: not valid java name and contains not printable characters */
    public static f m3306(Object obj) {
        if (C0006.m112() < 0) {
            return ((q) obj).f9367f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m3307(Object obj, boolean z10) {
        if (C0153.m2938() < 0) {
            return ((zzfi.zzb.zza) obj).zzg(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3308(Object obj, Object obj2) {
        if (C0171.m3272() < 0) {
            return ((ArrayList) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3309(Object obj, Object obj2, long j10, long j11, int i10, Object obj3, int i11, int i12) {
        if (C0459.m8951() <= 0) {
            b2.b((c9.a) obj, (o) obj2, j10, j11, i10, (m) obj3, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m3310(Object obj) {
        if (C0238.m4587() <= 0) {
            return ((f5) obj).F;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m3311() {
        if (C0256.m4901() <= 0) {
            return "Error querying events. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡ۠, reason: contains not printable characters */
    public static int m3312(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static String m3313() {
        if (C0183.m3510() > 0) {
            return "ml";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3314() {
        return 52 ^ C0204.f228;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3297(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
