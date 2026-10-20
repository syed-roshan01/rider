package com.google.firebase.tracing;

import android.app.Notification;
import c0.C0057;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.firebase.analytics.connector.internal.C0115;
import d4.C0218;
import f2.l;
import h3.C0303;
import h5.C0307;
import java.io.ByteArrayOutputStream;
import k0.d5;
import k0.i0;
import k6.c8;
import k6.z7;
import q2.x;
import q6.C0387;
import y.e;
import y.k;

/* JADX INFO: renamed from: com.google.firebase.tracing.ۢۤۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0204 {

    /* JADX INFO: renamed from: ۦۥۥۨ, reason: contains not printable characters */
    public static int f228 = 793;

    /* JADX INFO: renamed from: ۣ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3899() {
        if (C0218.m4144() > 0) {
            return zzoc.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static e m3900() {
        if (C0387.m7564() >= 0) {
            return k.f16607c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3901() {
        if (C0057.m1090() < 0) {
            return "accept_timer_desc";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m3902(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۢ, reason: not valid java name and contains not printable characters */
    public static z7 m3903(Object obj) {
        if (C0303.m5836() >= 0) {
            return ((c8) obj).f9950d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۤ۠, reason: not valid java name and contains not printable characters */
    public static l m3904() {
        if (C0115.m2227() < 0) {
            return l.f6116d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3905() {
        return (-604) ^ C0087.f121;
    }

    /* JADX INFO: renamed from: ۥۢۦۣ, reason: contains not printable characters */
    public static Notification m3907(Object obj) {
        if (C0307.m5925() <= 0) {
            return ((x) obj).f13121t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3908(String str) {
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

    /* JADX INFO: renamed from: ۨۢۦۦ, reason: not valid java name and contains not printable characters */
    public static d5 m3909(Object obj) {
        if (C0080.m1729() < 0) {
            return ((i0) obj).O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m3906(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
