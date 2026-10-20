package com.google.android.gms.internal.tasks;

import a2.C0004;
import a5.w;
import android.content.Context;
import android.content.Intent;
import c3.C0063;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.protobuf.v;
import d1.C0212;
import d1.C0214;
import d5.h2;
import e0.C0256;
import f0.w1;
import f5.g0;
import g4.C0289;
import g7.C0292;
import h8.C0313;
import i4.C0317;
import java.io.ByteArrayOutputStream;
import k0.i2;
import k0.r3;
import k0.t;
import k6.a5;
import k6.d;
import k6.f5;
import k6.l6;
import k6.x;
import k6.x3;
import o2.C0368;
import o8.C0371;
import q9.g;
import s3.C0412;
import u8.e;

/* JADX INFO: renamed from: com.google.android.gms.internal.tasks.ۢ۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0102 {

    /* JADX INFO: renamed from: ۟ۤۢۧۡ, reason: not valid java name and contains not printable characters */
    public static int f128 = 238;

    /* JADX INFO: renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1989(Object obj, Object obj2) {
        if (C0256.m4901() <= 0) {
            return ((Context) obj).stopService((Intent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m1990(Object obj) {
        if (C0180.m3448() > 0) {
            return ((w1) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1991(Object obj) {
        if (C0212.m4051() > 0) {
            return ((zzew.zzf) obj).zzh();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m1992(Object obj, Object obj2, Object obj3) {
        if (C0089.m1902() < 0) {
            return ((g) obj).collect((p9.g) obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m1993(Object obj, int i10, int i11) {
        if (C0368.m7234() > 0) {
            ((v) obj).w0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static e m1994(Object obj, Object obj2, Object obj3) {
        if (C0412.m8089() <= 0) {
            return ((r3) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1995(Object obj) {
        if (C0371.m7283() > 0) {
            return ((a5) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1996(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m1997(Object obj) {
        if (C0317.m6144() <= 0) {
            return ((i2) obj).f9026d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1998(Object obj) {
        if (C0199.m3818() > 0) {
            return ((d) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static x3 m2000() {
        if (C0313.m6072() < 0) {
            return x.f10484g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m2001(Object obj) {
        if (C0004.m76() < 0) {
            return ((h2) obj).f4550d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static int m2002(Object obj) {
        if (C0180.m3448() > 0) {
            return ((t) obj).f9470a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static l6 m2003(Object obj) {
        if (C0063.m1217() >= 0) {
            return ((f5) obj).f10041r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m2004(String str) {
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

    /* JADX INFO: renamed from: ۢۥۥۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m2005(Object obj, Object obj2) {
        if (C0107.m2075() <= 0) {
            return ((zzfi.zzj.zza) obj).zzi((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2006(Object obj) {
        if (C0292.m5634() <= 0) {
            return ((g0) obj).f6263e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۦ, reason: contains not printable characters */
    public static int m2007() {
        return 948 ^ C0214.f238;
    }

    /* JADX INFO: renamed from: ۧۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2008(Object obj) {
        if (C0289.m5580() <= 0) {
            return ((w) obj).f1317b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1999(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
