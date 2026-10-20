package com.google.firebase.emulators;

import a.C0001;
import androidx.compose.foundation.gestures.a;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.ktx.C0175;
import d5.n0;
import dagger.hilt.android.lifecycle.C0238;
import e1.l0;
import f5.j;
import g0.C0286;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import k0.k3;
import k0.m0;
import k0.x2;
import k6.y3;
import m0.C0350;
import m0.g1;
import r8.p;
import s0.C0411;
import u.b2;
import u4.C0436;
import v.f2;
import v.h1;
import v.y0;
import x.m;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.emulators.۟ۥۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0140 {

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int f166 = 67;

    /* JADX INFO: renamed from: ۟ۢۧۨۧ, reason: not valid java name and contains not printable characters */
    public static int m2693(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static g1 m2694(Object obj) {
        if (C0436.m8516() > 0) {
            return ((n0) obj).f4697n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static m0 m2695() {
        if (C0001.m35() < 0) {
            return m0.f9193c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۨ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m2697(Object obj) {
        if (C0165.m3154() < 0) {
            return ((j) obj).f6278b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static o m2698(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, boolean z11, Object obj5, Object obj6) {
        if (C0286.m5504() >= 0) {
            return a.c((o) obj, (f2) obj2, (h1) obj3, (b2) obj4, z10, z11, (y0) obj5, (m) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2699() {
        return 881 ^ C0411.f681;
    }

    /* JADX INFO: renamed from: ۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2700(String str) {
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

    /* JADX INFO: renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static List m2701(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0089.m1902() < 0) {
            return ((y3) obj).r((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2702() {
        if (C0238.m4583() > 0) {
            return "creation_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۤ, reason: contains not printable characters */
    public static void m2703(Object obj, Object obj2, boolean z10, Object obj3, long j10, long j11, long j12, long j13, long j14, Object obj4, int i10, int i11) {
        if (C0175.m3346() >= 0) {
            k3.b((x2) obj, (o) obj2, z10, (l0) obj3, j10, j11, j12, j13, j14, (m0.m) obj4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2704(Object obj) {
        if (C0350.m6838() < 0) {
            ((InputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۧۤۧ, reason: not valid java name and contains not printable characters */
    public static List m2705(Object obj, int i10) {
        if (C0171.m3272() < 0) {
            return p.S0((Iterable) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2696(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
