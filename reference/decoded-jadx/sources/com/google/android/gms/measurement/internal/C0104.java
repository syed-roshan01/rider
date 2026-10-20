package com.google.android.gms.measurement.internal;

import aa.C0011;
import androidx.compose.ui.input.pointer.C0034;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0124;
import e5.a;
import ea.C0267;
import f5.d0;
import g.C0284;
import java.io.ByteArrayOutputStream;
import k0.p;
import k0.t1;
import k0.v4;
import k2.C0333;
import r1.x0;
import y.i1;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.۟۟ۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0104 {

    /* JADX INFO: renamed from: ۠ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f130 = 787;

    /* JADX INFO: renamed from: ۟۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m2033(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2034() {
        return (-742) ^ C0284.f429;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static i1 m2035(Object obj) {
        if (C0034.m667() >= 0) {
            return ((p) obj).f9326a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2037(Object obj) {
        if (C0267.m5113() <= 0) {
            return ((zzfi.zze) obj).zzg();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۢ, reason: not valid java name and contains not printable characters */
    public static e m2038(Object obj) {
        if (C0333.m6472() < 0) {
            return ((v4) obj).f9568b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static long m2039() {
        if (C0124.m2386() >= 0) {
            return a.f5132h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m2040(Object obj) {
        if (C0011.m208() <= 0) {
            return ((d0) obj).f6245b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۨ, reason: contains not printable characters */
    public static x0 m2041(Object obj) {
        if (C0085.m1825() > 0) {
            return ((t1) obj).f9475c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2042(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2036(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
