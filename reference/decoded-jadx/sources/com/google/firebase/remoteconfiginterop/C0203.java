package com.google.firebase.remoteconfiginterop;

import a5.i;
import a5.j;
import b.g;
import com.google.android.gms.internal.measurement.zzpl;
import d1.C0214;
import dagger.hilt.internal.aggregatedroot.C0246;
import e1.C0259;
import g5.C0290;
import h4.C0304;
import ja.x;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import l4.h;
import la.C0348;
import o2.C0368;
import q6.C0387;

/* JADX INFO: renamed from: com.google.firebase.remoteconfiginterop.ۢ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0203 {

    /* JADX INFO: renamed from: ۧۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int f227 = -27;

    /* JADX INFO: renamed from: ۟ۡ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m3888(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3889(Object obj) {
        if (C0246.m4717() <= 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m3890(Object obj, Object obj2) {
        if (C0304.m5882() <= 0) {
            return ((g) obj).invoke(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۨ, reason: not valid java name and contains not printable characters */
    public static j m3891(Object obj) {
        if (C0290.m5589() < 0) {
            return ((i) obj).f1269b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3892(Object obj, Object obj2) {
        if (C0387.m7585() > 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3893() {
        if (C0348.m6818() < 0) {
            return zzpl.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3894() {
        return 360 ^ C0214.f238;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3895(Object obj, Object obj2) {
        if (C0259.m4959() <= 0) {
            ((h) obj).d((x) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3896() {
        if (C0368.m7234() >= 0) {
            return "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧ۟, reason: contains not printable characters */
    public static int m3897(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3898(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
