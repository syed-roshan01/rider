package com.google.firebase.annotations.concurrent;

import android.view.accessibility.AccessibilityWindowInfo;
import androidx.compose.ui.platform.C0038;
import c9.a;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.tasks.C0103;
import d5.b;
import d5.i;
import d5.k0;
import d5.l;
import d5.m;
import d7.C0220;
import dagger.hilt.android.components.C0230;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.codegen.C0243;
import f0.C0273;
import f0.v1;
import g9.C0295;
import h0.C0300;
import java.io.ByteArrayOutputStream;
import k6.j5;
import k6.z3;
import m0.g1;
import n1.C0363;
import p9.z;
import r1.C0394;
import s8.C0417;
import y0.n;

/* JADX INFO: renamed from: com.google.firebase.annotations.concurrent.ۧ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0126 {

    /* JADX INFO: renamed from: ۟ۤۥۤۤ, reason: not valid java name and contains not printable characters */
    public static int f152 = -208;

    /* JADX INFO: renamed from: ۟ۡ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static long m2428() {
        if (C0363.m7099() < 0) {
            return zzne.zzah();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m2429(Object obj) {
        if (C0273.m5249() <= 0) {
            return ((j5) obj).f10121b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۢ, reason: not valid java name and contains not printable characters */
    public static a m2430(Object obj) {
        if (C0230.m4421() <= 0) {
            return ((i) obj).f4561q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۧ, reason: not valid java name and contains not printable characters */
    public static m m2431() {
        if (C0220.m4237() >= 0) {
            return m.f4658n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static z m2432(Object obj) {
        if (C0243.m4660() <= 0) {
            return ((MainViewModel) obj).N0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2433() {
        if (m2434() > 0) {
            return "(Without Filter)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2434() {
        return 135 ^ C0394.f664;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m2435(Object obj) {
        if (C0300.m5752() < 0) {
            return ((b) obj).f4403a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2436(Object obj) {
        if (C0038.m750() <= 0) {
            return ((z3) obj).f10593e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2438(Object obj) {
        if (C0417.m8173() < 0) {
            return ((n) obj).f16742t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static g1 m2439(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((k0) obj).f4602e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢۤ, reason: contains not printable characters */
    public static int m2440(Object obj) {
        if (C0103.m2022() >= 0) {
            return ((AccessibilityWindowInfo) obj).getType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۧۧ, reason: contains not printable characters */
    public static l m2441() {
        if (C0236.m4538() >= 0) {
            return l.f4630n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m2442(String str) {
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

    /* JADX INFO: renamed from: ۧۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m2443(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static g1 m2444(Object obj) {
        if (C0295.m5663() > 0) {
            return ((v1) obj).f5977d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2445() {
        if (C0077.m1663() <= 0) {
            return "session_stitching_token_hash";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String m2437(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
