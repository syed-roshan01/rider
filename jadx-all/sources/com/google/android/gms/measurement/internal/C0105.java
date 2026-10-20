package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import androidx.compose.foundation.a;
import androidx.lifecycle.C0043;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.tasks.C0103;
import d5.j0;
import e1.l0;
import g5.C0292;
import i6.C0320;
import i6.C0321;
import java.io.ByteArrayOutputStream;
import k0.e;
import k6.v;
import m0.n1;
import p9.z;
import t.d;
import t0.C0419;
import y0.o;
import y6.C0478;
import z8.C0493;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.ۥۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0105 {

    /* JADX INFO: renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int f131 = 465;

    /* JADX INFO: renamed from: ۟۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static o m2043(Object obj, float f10, long j10, Object obj2) {
        if (C0043.m833() >= 0) {
            return a.f((o) obj, f10, j10, (l0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static int m2044(Object obj) {
        if (C0419.m8221() >= 0) {
            return ((AppConfig) obj).getDialogStyle();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2045() {
        return 107 ^ C0478.f751;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static void m2046(Object obj, Object obj2, int i10) {
        if (C0292.m5605() <= 0) {
            ((v) obj).writeToParcel((Parcel) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2047(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static z m2048(Object obj) {
        if (C0103.m2022() >= 0) {
            return ((MainViewModel) obj).O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int m2049(Object obj) {
        if (C0321.m6200() > 0) {
            return ((e) obj).f8858v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2050(Object obj) {
        if (C0320.m6181() > 0) {
            return ((j0) obj).f4584a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static int m2051(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۢۢۧ, reason: not valid java name and contains not printable characters */
    public static n1 m2053(Object obj) {
        if (C0493.m9578() > 0) {
            return ((d) obj).f14112e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2052(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
