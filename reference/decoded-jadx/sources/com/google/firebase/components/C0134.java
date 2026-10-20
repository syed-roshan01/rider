package com.google.firebase.components;

import a2.c0;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.foundation.text.modifiers.C0025;
import b.C0049;
import b0.k0;
import com.google.firebase.analytics.connector.internal.C0115;
import d5.n;
import d7.t;
import f0.v1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.k4;
import k0.o3;
import k6.i;
import k6.r5;
import la.C0348;
import m0.l3;
import m0.m;
import p4.C0376;
import p8.C0379;
import q0.C0382;
import t1.C0419;
import t7.C0425;
import v9.C0452;
import y0.o;
import y9.C0479;

/* JADX INFO: renamed from: com.google.firebase.components.ۥۦ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0134 {

    /* JADX INFO: renamed from: ۟ۦۦۥ۟, reason: not valid java name and contains not printable characters */
    public static int f160 = -863;

    /* JADX INFO: renamed from: ۟۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static long m2578(Object obj) {
        if (C0376.m7371() >= 0) {
            return ((c0) obj).b();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static u0.b m2579() {
        if (C0379.m7433() >= 0) {
            return n.f4684e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m2580(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m2582(Object obj, int i10, int i11) {
        if (C0452.m8825() > 0) {
            return t.w((ArrayList) obj, i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۧ, reason: not valid java name and contains not printable characters */
    public static long m2583(Object obj) {
        if (C0382.m7487() < 0) {
            return ((o3) obj).f9315c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Context m2584(Object obj) {
        if (C0348.m6818() <= 0) {
            return ((ContextWrapper) obj).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static String m2585(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m2586(Object obj, long j10, long j11, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        if (C0425.m8351() < 0) {
            k4.b((o) obj, j10, j11, (c9.f) obj2, (c9.e) obj3, (c9.e) obj4, (m) obj5, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m2587() {
        return 627 ^ C0115.f141;
    }

    /* JADX INFO: renamed from: ۣۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m2588(Object obj, Object obj2, Object obj3) {
        if (C0479.m9346() >= 0) {
            ((k.f) obj).N((r5) obj2, (i) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static a.a m2589() {
        if (C0025.m495() > 0) {
            return k0.F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤ, reason: contains not printable characters */
    public static Uri.Builder m2590(Object obj, Object obj2) {
        if (C0419.m8247() > 0) {
            return ((Uri.Builder) obj).authority((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۧۨ, reason: contains not printable characters */
    public static l3 m2591(Object obj) {
        if (C0049.m945() > 0) {
            return ((v1) obj).f5979f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2581(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
