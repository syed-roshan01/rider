package com.google.firebase.emulators;

import android.content.res.Resources;
import android.view.View;
import androidx.profileinstaller.C0045;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.firebase.firestore.auth.C0147;
import com.google.gson.internal.bind.C0207;
import d5.v1;
import e0.e;
import e2.C0261;
import e9.C0267;
import g.C0284;
import h.C0299;
import i1.f;
import i6.C0321;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import k0.g0;
import k0.k2;
import k6.a5;
import k6.o;
import k6.s6;
import k6.y5;
import l0.c;
import m0.g1;
import p0.C0375;
import p3.C0376;
import y.C0476;
import y.w;
import z6.a;
import z7.C0489;
import z8.C0493;

/* JADX INFO: renamed from: com.google.firebase.emulators.ۣۧ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0141 {

    /* JADX INFO: renamed from: ۠ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static int f167 = 162;

    /* JADX INFO: renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Resources m2706(Object obj) {
        if (C0321.m6200() > 0) {
            return ((View) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۨ, reason: not valid java name and contains not printable characters */
    public static long m2707() {
        if (C0327.m6304() < 0) {
            return c.f11015g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2708(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2709(Object obj, Object obj2) {
        if (C0147.m2805() <= 0) {
            ((y5) obj).H((o) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m2711(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۤ, reason: not valid java name and contains not printable characters */
    public static g1 m2712(Object obj) {
        if (C0299.m5742() > 0) {
            return ((v1) obj).f4811c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m2713(Object obj) {
        if (C0284.m5468() >= 0) {
            ((s6) obj).E();
        }
    }

    /* JADX INFO: renamed from: ۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2714() {
        return (-48) ^ C0045.f65;
    }

    /* JADX INFO: renamed from: ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m2715(Object obj) {
        if (C0207.m3957() > 0) {
            return ((k2) obj).f9110o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m2716(Object obj) {
        if (C0493.m9578() > 0) {
            return ((g0) obj).f8936a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2717() {
        if (C0261.m4984() >= 0) {
            return zznk.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static f m2718() {
        if (C0267.m5099() <= 0) {
            return a.f17303d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static e m2719() {
        if (C0489.m9505() >= 0) {
            return l0.o.f11101a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۦ, reason: contains not printable characters */
    public static long m2720(Object obj) {
        if (C0476.m9266() >= 0) {
            return ((a5) obj).K;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static w m2721() {
        if (C0376.m7362() >= 0) {
            return w.f16687a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2722() {
        if (C0375.m7350() <= 0) {
            return zzoi.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2710(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
