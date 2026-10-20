package com.google.firebase.installations;

import a2.C0005;
import aa.C0011;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.draw.C0028;
import androidx.lifecycle.C0043;
import c9.e;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.internal.api.C0178;
import d5.w0;
import f0.u1;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import k0.p;
import k0.r2;
import k0.z3;
import k6.s5;
import l0.g;
import m0.m3;
import m9.l;
import q6.C0387;
import v6.C0446;
import w4.C0459;
import z1.C0483;

/* JADX INFO: renamed from: com.google.firebase.installations.۠ۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0177 {

    /* JADX INFO: renamed from: ۤۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int f201 = 471;

    /* JADX INFO: renamed from: ۟۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m3370(Object obj, Object obj2) {
        if (C0446.m8696() > 0) {
            return ((u1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static int m3371(Object obj) {
        if (C0011.m208() <= 0) {
            return ((a5.b) obj).f1224c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static List m3372(Object obj) {
        if (C0028.m557() > 0) {
            return ((w0) obj).f4819b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3373() {
        if (C0387.m7585() >= 0) {
            return g.f11054h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Integer m3374(Object obj) {
        if (C0043.m833() >= 0) {
            return ((z3) obj).f9708n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧۡ, reason: not valid java name and contains not printable characters */
    public static m3 m3375() {
        if (C0459.m8951() <= 0) {
            return r2.f9419a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3377(Object obj, long j10, long j11) {
        if (C0005.m104() > 0) {
            return ((AtomicLong) obj).compareAndSet(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m3378(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m3379(Object obj) {
        if (C0153.m2938() < 0) {
            return ((l) obj).s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m3380() {
        return 31 ^ C0021.f41;
    }

    /* JADX INFO: renamed from: ۤۡۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3381(Object obj) {
        if (C0483.m9403() > 0) {
            return ((s5) obj).l();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static String m3382() {
        if (C0023.m461() >= 0) {
            return "retry_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3383(String str) {
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

    /* JADX INFO: renamed from: ۧ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static e m3384(Object obj) {
        if (C0114.m2205() <= 0) {
            return ((p) obj).f9332n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3385() {
        if (C0178.m3402() > 0) {
            return "current_bundle_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3376(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
