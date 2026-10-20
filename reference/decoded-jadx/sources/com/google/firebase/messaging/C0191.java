package com.google.firebase.messaging;

import android.os.Bundle;
import c1.C0059;
import c1.C0061;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.heartbeatinfo.C0167;
import d5.j0;
import dagger.hilt.codegen.C0241;
import e7.C0264;
import f0.y;
import g8.C0293;
import java.io.ByteArrayOutputStream;
import java.util.AbstractMap;
import k0.k1;
import k0.w;
import k6.q;
import k6.x;
import k6.x3;
import l0.C0340;
import n7.C0364;
import p9.q0;
import rikka.shizuku.C0406;
import t7.C0425;
import u.C0429;
import u3.C0434;
import v0.C0440;
import v6.C0446;

/* JADX INFO: renamed from: com.google.firebase.messaging.۟۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0191 {

    /* JADX INFO: renamed from: ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f215 = -450;

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m3641(Object obj) {
        if (C0151.m2903() > 0) {
            return ((x3) obj).f10532f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3643() {
        return 16 ^ C0059.f79;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static float m3644(Object obj) {
        if (C0446.m8696() >= 0) {
            return ((k1) obj).f9100o;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨ۠, reason: not valid java name and contains not printable characters */
    public static q0 m3645(Object obj) {
        if (C0293.m5656() >= 0) {
            return ((MainViewModel) obj).f3117t0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3646(Object obj, long j10) {
        if (C0434.m8498() < 0) {
            ((q) obj).w(j10);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3647(Object obj) {
        if (C0364.m7147() <= 0) {
            return ((j0) obj).f4586c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3648(Object obj) {
        if (C0425.m8351() < 0) {
            return ((zzew.zzb) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static x3 m3649() {
        if (C0264.m5062() < 0) {
            return x.f10508s0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ, reason: not valid java name and contains not printable characters */
    public static float m3650(Object obj) {
        if (C0429.m8415() > 0) {
            return ((w) obj).f9583b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۥۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3651(String str) {
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

    /* JADX INFO: renamed from: ۥۢۨۦ, reason: contains not printable characters */
    public static long m3652() {
        if (C0340.m6681() >= 0) {
            return d1.c.f4327c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۦۡ, reason: contains not printable characters */
    public static boolean m3653(Object obj) {
        if (C0406.m7977() < 0) {
            return ((y) obj).f6004c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۤ, reason: contains not printable characters */
    public static int m3654(Object obj) {
        if (C0241.m4629() < 0) {
            return ((k0.f) obj).f8898d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۥ۠, reason: contains not printable characters */
    public static boolean m3655(Object obj, Object obj2) {
        if (C0061.m1161() <= 0) {
            return ((AbstractMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۤۨ, reason: contains not printable characters */
    public static int m3656(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3657(Object obj) {
        if (C0440.m8597() > 0) {
            ((k6.k) obj).i0();
        }
    }

    /* JADX INFO: renamed from: ۨۢۡۦ, reason: not valid java name and contains not printable characters */
    public static k6.o m3658(int i10, Object obj) {
        if (C0167.m3200() > 0) {
            return k6.o.a(i10, (Bundle) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3642(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
