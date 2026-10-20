package com.google.firebase.firestore.ktx;

import android.os.Bundle;
import android.support.v4.app.C0015;
import androidx.compose.ui.input.key.C0033;
import c0.C0056;
import dagger.hilt.codegen.C0243;
import g.C0283;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.PriorityBlockingQueue;
import k0.a3;
import k0.z2;
import k6.y5;
import m7.C0358;
import r1.d;
import r1.o;
import r2.C0397;
import x5.C0471;
import z2.C0485;

/* JADX INFO: renamed from: com.google.firebase.firestore.ktx.۟ۢۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0156 {

    /* JADX INFO: renamed from: ۟۟ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int f180 = 394;

    /* JADX INFO: renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2974(Object obj, Object obj2, Object obj3, Object obj4, long j10) {
        if (C0015.m294() < 0) {
            ((y5) obj).C((String) obj2, (String) obj3, (Bundle) obj4, j10);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2975() {
        if (C0485.m9436() <= 0) {
            return "Grant Overlay Permission";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2976() {
        return 512 ^ C0471.f741;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2977(String str) {
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

    /* JADX INFO: renamed from: ۟ۨۨۤ, reason: not valid java name and contains not printable characters */
    public static a3 m2978(Object obj) {
        if (C0397.m7755() > 0) {
            return ((z2) obj).f9696a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2979(Object obj) {
        if (C0033.m652() < 0) {
            d7.a.D((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static u9.a m2981(Object obj) {
        if (C0243.m4660() < 0) {
            return ((z2) obj).f9698c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2982(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static o m2983() {
        if (C0283.m5446() >= 0) {
            return d.f13352a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۦ, reason: contains not printable characters */
    public static f m2984() {
        if (C0358.m7001() <= 0) {
            return f6.a.f6372u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2985(Object obj, Object obj2) {
        if (C0056.m1077() <= 0) {
            return ((PriorityBlockingQueue) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2980(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
