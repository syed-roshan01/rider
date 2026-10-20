package com.google.firebase.remoteconfig.interop;

import a2.c0;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0015;
import androidx.compose.ui.platform.C0038;
import b7.C0054;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzob;
import com.google.firebase.auth.ktx.C0132;
import d5.g;
import i5.C0318;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.TreeMap;
import k0.b4;
import k0.d0;
import k0.i0;
import k0.k3;
import k0.t1;
import k0.v2;
import k0.x3;
import k6.x;
import k8.C0338;
import l6.C0343;
import l6.C0344;
import m0.m;
import m1.C0351;
import m5.C0354;
import o8.C0371;
import r2.k;
import t.d;
import v7.C0449;
import x7.C0472;
import y.C0474;
import y.C0475;
import y3.e;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.interop.ۨۨۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0198 {

    /* JADX INFO: renamed from: ۟۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int f222 = 299;

    /* JADX INFO: renamed from: ۟ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Set m3790(Object obj) {
        if (C0015.m294() <= 0) {
            return ((TreeMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static long m3791(Object obj) {
        if (C0351.m6885() >= 0) {
            return ((x3) obj).f9651e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static d m3792(Object obj) {
        if (C0338.m6645() < 0) {
            return ((v2) obj).f9552b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m3793() {
        if (C0344.m6746() > 0) {
            return zzne.zzaf();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static long m3794(Object obj) {
        if (C0371.m7283() > 0) {
            return ((b4) obj).f8746a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3795() {
        if (C0318.m6163() < 0) {
            return zznp.zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static k6.x3 m3796() {
        if (C0354.m6953() < 0) {
            return x.f10475b0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m3797(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0475.m9266() > 0) {
            return e.Z0((Bundle) obj, (String) obj2, (Class) obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3798() {
        if (C0054.m1047() > 0) {
            return "Pair & Authorize Shizuku App";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3799(Object obj, Object obj2, Object obj3, Object obj4, long j10, long j11, Object obj5, int i10) {
        if (C0343.m6738() <= 0) {
            k3.d((c9.e) obj, (c9.e) obj2, (c9.e) obj3, (c0) obj4, j10, j11, (m) obj5, i10);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3800() {
        return 35 ^ C0015.f35;
    }

    /* JADX INFO: renamed from: ۣۣۦ۠, reason: not valid java name and contains not printable characters */
    public static int m3801(Object obj, Object obj2) {
        if (C0324.m6278() < 0) {
            return k.checkSelfPermission((Context) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static d0 m3802(Object obj) {
        if (C0449.m8755() >= 0) {
            return ((k0.c0) obj).f8778e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤ, reason: contains not printable characters */
    public static int m3803(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۟ۦۨ, reason: contains not printable characters */
    public static String m3804(String str) {
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

    /* JADX INFO: renamed from: ۦۨ۟, reason: contains not printable characters */
    public static int m3805(Object obj) {
        if (C0038.m750() < 0) {
            return ((t1) obj).f9474b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۦ, reason: contains not printable characters */
    public static boolean m3806() {
        if (C0132.m2543() <= 0) {
            return zzob.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static String m3807(Object obj) {
        if (C0472.m9193() <= 0) {
            return ((UserProfile) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m3808(Object obj) {
        if (C0073.m1597() >= 0) {
            return ((g) obj).f4497c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m3809(Object obj) {
        if (C0474.m9246() <= 0) {
            return ((i0) obj).J;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3789(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
