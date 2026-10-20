package com.google.firebase.messaging;

import a2.C0005;
import a5.u;
import android.os.Bundle;
import androidx.compose.ui.graphics.C0032;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0169;
import com.google.gson.internal.bind.C0207;
import d1.C0211;
import d5.q1;
import e1.l0;
import e8.C0265;
import g2.C0286;
import h5.C0308;
import ia.C0322;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import k.C0331;
import k0.i0;
import k0.m2;
import k0.o1;
import k6.a5;
import k6.u7;
import k6.x7;
import l6.C0344;
import s0.C0410;
import t7.C0425;
import z.C0480;

/* JADX INFO: renamed from: com.google.firebase.messaging.۠ۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0192 {

    /* JADX INFO: renamed from: ۟۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int f216 = -802;

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3659() {
        return 804 ^ C0286.f431;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3661(int i10) {
        if (C0330.m6374() > 0) {
            return Character.charCount(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3662(Object obj, Object obj2) {
        if (C0084.m1804() >= 0) {
            return ((X500Principal) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3663(Object obj) {
        if (C0005.m104() >= 0) {
            return ((f0.o) obj).f5829a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3664(Object obj) {
        if (C0265.m5069() < 0) {
            return ((o1) obj).f9295o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static zzew.zzc m3665(Object obj, int i10) {
        if (C0331.m6408() < 0) {
            return ((zzew.zzb.zza) obj).zza(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static List m3666(Object obj) {
        if (C0164.m3153() > 0) {
            return ((x7) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3667(Object obj) {
        if (C0410.m8063() > 0) {
            return ((u) obj).f1309c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3668(Object obj, long j10) throws IOException {
        if (C0480.m9354() < 0) {
            ((DataOutputStream) obj).writeLong(j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3669(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Integer m3670(Object obj) {
        if (C0032.m620() <= 0) {
            return ((u7) obj).f10430h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m3671(Object obj) {
        if (C0344.m6746() > 0) {
            return ((i0) obj).f9021y;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static d5.m m3672() {
        if (C0169.m3245() > 0) {
            return d5.m.f4655d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3673(Object obj, Object obj2, long j10) {
        if (C0425.m8351() < 0) {
            ((u7) obj).B((Bundle) obj2, j10);
        }
    }

    /* JADX INFO: renamed from: ۣۥۦۢ, reason: not valid java name and contains not printable characters */
    public static List m3674(Object obj) {
        if (C0148.m2838() < 0) {
            return ((m2) obj).f9209c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3675(Object obj) {
        if (C0322.m6244() >= 0) {
            return ((y3.j) obj).f16912b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۡۦ, reason: contains not printable characters */
    public static int m3676(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m3677(Object obj) {
        if (C0308.m5962() > 0) {
            return ((a5) obj).f9886u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤۦ, reason: not valid java name and contains not printable characters */
    public static c9.a m3678(Object obj) {
        if (C0207.m3957() > 0) {
            return ((q1) obj).f4741c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static y0.o m3679(float f10, Object obj, Object obj2, Object obj3) {
        if (C0211.m4046() > 0) {
            return androidx.compose.foundation.a.g(f10, (y0.o) obj, (e1.n) obj2, (l0) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m3660(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
