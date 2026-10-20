package com.google.firebase.measurement;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.semantics.C0039;
import c9.e;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0190;
import d5.k;
import d5.q;
import dagger.hilt.internal.C0253;
import e5.a;
import f0.s;
import g7.C0292;
import h1.C0300;
import h5.C0306;
import h7.C0311;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import k0.c4;
import k0.d2;
import k0.i0;
import k0.n;
import k0.s4;
import k6.p6;
import k6.s6;
import k6.t6;
import l2.C0341;
import m0.l3;
import m0.m;
import m0.q2;
import p5.C0377;
import q0.C0382;
import u0.b;
import v0.C0443;
import v9.C0452;
import y0.o;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: com.google.firebase.measurement.ۢۥۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0182 {

    /* JADX INFO: renamed from: ۥۦۥ۠, reason: contains not printable characters */
    public static int f206 = 271;

    /* JADX INFO: renamed from: ۟۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static b m3471() {
        if (C0142.m2725() >= 0) {
            return q.f4732i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static u m3472() {
        if (C0377.m7389() > 0) {
            return r.f16818c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3473(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۧ, reason: not valid java name and contains not printable characters */
    public static l3 m3475(Object obj) {
        if (C0190.m3639() > 0) {
            return ((k) obj).f4596c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static t6 m3476(Object obj) {
        if (C0039.m764() > 0) {
            return ((s6) obj).f10360f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3477(Object obj) {
        if (C0452.m8825() >= 0) {
            return ((d2) obj).f8830d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m3478(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m3479() {
        if (C0443.m8654() < 0) {
            return a.f5131g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m3480() {
        if (C0306.m5925() <= 0) {
            return "Default event parameters not found";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3481(Object obj, Object obj2, Object obj3) {
        if (C0183.m3510() >= 0) {
            ((p6) obj).x((Activity) obj2, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static float m3482() {
        if (C0186.m3548() <= 0) {
            return c4.f8800a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Method m3483(Object obj, Object obj2, Object obj3) {
        if (C0292.m5634() <= 0) {
            return ((Class) obj).getDeclaredMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3484(Object obj) {
        if (C0253.m4844() >= 0) {
            return ((s) obj).f5885d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3485(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        if (C0110.m2123() <= 0) {
            n.b((c9.a) obj, (o) obj2, (o2.o) obj3, (e) obj4, (m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static long m3486(Object obj) {
        if (C0027.m541() > 0) {
            return ((i0) obj).G;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۡ, reason: contains not printable characters */
    public static int m3487(Object obj) {
        if (C0382.m7487() <= 0) {
            return ((s4) obj).f9458a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۦۡ, reason: contains not printable characters */
    public static int m3488() {
        return (-781) ^ C0300.f448;
    }

    /* JADX INFO: renamed from: ۥۤۡۤ, reason: contains not printable characters */
    public static boolean m3489(Object obj, int i10, int i11) {
        if (C0311.m6027() < 0) {
            return ((q2) obj).B(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static String m3490(Object obj) {
        if (C0028.m557() >= 0) {
            return ((zzfi.zzj.zza) obj).zzu();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥ, reason: contains not printable characters */
    public static float m3491() {
        if (C0306.m5925() <= 0) {
            return l0.n.f11100b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m3492(Object obj, long j10) {
        if (C0341.m6699() < 0) {
            return ((zzfi.zzj.zza) obj).zzc(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3474(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
