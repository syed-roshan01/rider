package com.google.firebase.firestore.util;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.profileinstaller.C0046;
import c0.C0057;
import c1.C0061;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.measurement_impl.C0185;
import d5.a2;
import d5.n;
import e2.C0263;
import f4.y;
import h6.C0309;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import k0.h3;
import k0.k3;
import k0.l;
import k6.a5;
import k6.l7;
import m0.m;
import p8.C0379;
import r1.C0393;
import r2.C0395;
import t2.C0423;
import v6.C0447;
import v9.C0452;
import x4.C0469;
import y.C0474;
import y0.g;

/* JADX INFO: renamed from: com.google.firebase.firestore.util.ۣۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0166 {

    /* JADX INFO: renamed from: ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int f190 = -569;

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3167(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static long m3168() {
        if (C0057.m1090() < 0) {
            return zzne.zzs();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3170() {
        return (-668) ^ C0469.f740;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static g m3171() {
        if (C0395.m7737() >= 0) {
            return y0.a.f16711d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Bitmap m3172(Object obj) {
        if (C0379.m7433() > 0) {
            return ((a2) obj).f4400c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3173() {
        if (C0263.m5033() <= 0) {
            return "super_fast_mode";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static u0.b m3174() {
        if (C0447.m8732() <= 0) {
            return n.f4682c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3175(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static e6.b m3176(Object obj) {
        if (C0474.m9246() <= 0) {
            return ((y) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3177() {
        if (C0185.m3538() >= 0) {
            return "dynamite_version";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m3178() {
        if (C0452.m8825() > 0) {
            return k3.f9113c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3179(Object obj, Object obj2) {
        if (C0090.m1920() >= 0) {
            ((Bundle) obj).putAll((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3180(Object obj, Object obj2) {
        if (C0061.m1161() < 0) {
            ((Executor) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m3181() {
        if (C0076.m1655() > 0) {
            return zzfi.zzj.zzu();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۥ, reason: not valid java name and contains not printable characters */
    public static long m3182() {
        if (C0153.m2938() <= 0) {
            return l0.c.f11021m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۥۦۡ, reason: contains not printable characters */
    public static boolean m3183(Object obj) {
        if (C0046.m893() > 0) {
            return ((a5) obj).I;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۡۨ, reason: contains not printable characters */
    public static String m3184(Object obj, Object obj2) {
        if (C0393.m7716() > 0) {
            return ((l7) obj).q((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3185(Object obj, Object obj2, int i10) {
        if (C0423.m8307() > 0) {
            ((h3) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۧۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m3186(Object obj) {
        if (C0309.m5971() < 0) {
            return ((l) obj).f9133v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3169(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
