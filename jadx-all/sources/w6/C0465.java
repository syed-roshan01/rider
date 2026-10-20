package w6;

import android.graphics.Path;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.ktx.C0180;
import com.google.gson.internal.bind.C0207;
import d7.C0220;
import d9.C0225;
import dagger.hilt.codegen.C0242;
import f0.c2;
import h7.C0311;
import java.io.ByteArrayOutputStream;
import k0.e3;
import k0.i4;
import k0.n1;
import k6.q6;
import k6.u7;
import k6.x3;
import l8.C0347;
import m7.C0358;
import p3.C0376;
import t2.C0423;
import v0.C0442;

/* JADX INFO: renamed from: w6.۟ۥۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0465 {

    /* JADX INFO: renamed from: ۟ۥۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int f735 = 446;

    /* JADX INFO: renamed from: ۟۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9045(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m9046(Object obj) {
        if (C0347.m6774() >= 0) {
            return ((KeyEvent) obj).getKeyCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m9047(Object obj) {
        if (C0358.m7001() < 0) {
            return ((i4) obj).f9046e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static x3 m9048() {
        if (C0311.m5997() > 0) {
            return k6.x.Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m9049(Object obj, Object obj2, Object obj3) {
        if (C0176.m3367() <= 0) {
            return ((c9.e) obj).invoke(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9050(Object obj) {
        if (C0225.m4316() >= 0) {
            return ((n1) obj).f9251a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m9051(Object obj) {
        if (C0114.m2205() < 0) {
            w0.i.p((w0.i) obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9052() {
        if (C0129.m2492() > 0) {
            return zzpl.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۦۤ, reason: not valid java name and contains not printable characters */
    public static m0.n1 m9054(Object obj) {
        if (C0423.m8294() > 0) {
            return ((c2) obj).f5644i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static t1.i m9055() {
        if (C0242.m4629() <= 0) {
            return t1.k.f14460d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m9056(String str) {
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

    /* JADX INFO: renamed from: ۦ۠۟ۧ, reason: contains not printable characters */
    public static long m9057(Object obj) {
        if (C0180.m3448() >= 0) {
            return ((e3) obj).f8872f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۧۡۨ, reason: contains not printable characters */
    public static void m9058(Object obj, Object obj2, float f10, float f11) {
        if (C0442.m8612() > 0) {
            ((Path) obj).addPath((Path) obj2, f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۧۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int m9059() {
        return 11 ^ C0376.f646;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m9060(Object obj, Object obj2, boolean z10) {
        if (C0220.m4237() >= 0) {
            u7.N((q6) obj, (Bundle) obj2, z10);
        }
    }

    /* JADX INFO: renamed from: ۨۧۢۦ, reason: not valid java name and contains not printable characters */
    public static float m9061() {
        if (C0207.m3957() > 0) {
            return l0.h.f11060e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m9053(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
