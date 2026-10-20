package d4;

import android.content.Context;
import b8.C0055;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.internal.api.C0178;
import d7.t;
import d8.C0221;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import f0.c2;
import g2.s;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import k0.l0;
import k0.o1;
import k0.u4;
import k4.C0336;
import k6.c8;
import k6.p7;
import k6.s5;
import k6.t5;
import l0.c;
import m0.m;
import m5.C0355;
import n1.C0362;
import r4.C0398;
import s3.C0412;
import w9.C0465;
import z.C0480;
import z2.C0484;

/* JADX INFO: renamed from: d4.۟۠۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0217 {

    /* JADX INFO: renamed from: ۣ۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int f241 = 978;

    /* JADX INFO: renamed from: ۟۟ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static zzew.zzd.zzb m4130() {
        if (C0324.m6278() <= 0) {
            return zzew.zzd.zzb.GREATER_THAN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zze m4131(Object obj) {
        if (C0178.m3402() > 0) {
            return ((c8) obj).f9947a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static s5 m4132(Object obj, Object obj2) {
        if (C0055.m1056() >= 0) {
            return ((p7) obj).x((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m4133(Object obj, Object obj2) {
        if (C0412.m8089() < 0) {
            return ((Context) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۧ, reason: not valid java name and contains not printable characters */
    public static l0 m4135() {
        if (C0398.m7797() <= 0) {
            return l0.f9145r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۤ, reason: not valid java name and contains not printable characters */
    public static long m4136() {
        if (C0362.m7099() < 0) {
            return c.f11012d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4137() {
        if (C0480.m9354() < 0) {
            return "unlimited_auto_accept";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4138(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static Float m4139(float f10) {
        if (C0157.m2999() >= 0) {
            return Float.valueOf(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String[] m4140() {
        if (C0148.m2838() < 0) {
            return t5.f10393c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۦ, reason: not valid java name and contains not printable characters */
    public static float m4141() {
        if (C0336.m6515() <= 0) {
            return u4.f9533d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static c9.c m4142(Object obj) {
        if (C0484.m9436() < 0) {
            return ((o1) obj).f9293f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4143(Object obj, int i10) {
        if (C0221.m4264() >= 0) {
            return ((s) obj).b(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
    public static int m4144() {
        return 442 ^ C0245.f325;
    }

    /* JADX INFO: renamed from: ۦۧۤ۟, reason: contains not printable characters */
    public static String m4145(String str) {
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

    /* JADX INFO: renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4146(Object obj) {
        if (C0465.m9068() <= 0) {
            t.r((c2) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m4147(Object obj, Object obj2, int i10) {
        if (C0355.m6968() >= 0) {
            ((f0.b) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4134(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
