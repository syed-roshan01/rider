package com.google.firebase.installations.local;

import a5.i0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0019;
import c9.a;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.C0205;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0181;
import d5.a0;
import d5.r;
import d9.C0227;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import e1.C0258;
import f0.d1;
import f0.p1;
import g5.C0291;
import h3.C0302;
import h3.C0304;
import h8.C0314;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.f0;
import k6.o5;
import k6.p7;
import k6.s6;
import p5.C0378;
import s6.c;
import u0.b;
import u8.e;
import v7.C0450;
import w6.C0465;

/* JADX INFO: renamed from: com.google.firebase.installations.local.ۧۤۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0176 {

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f200 = -801;

    /* JADX INFO: renamed from: ۟۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static e m3349(Object obj, Object obj2, Object obj3) {
        if (C0450.m8755() >= 0) {
            return ((d1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3350(Object obj, float f10) {
        if (C0232.m4453() < 0) {
            return ((StringBuilder) obj).append(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3351(Object obj) {
        if (C0378.m7389() >= 0) {
            return ((zzfi.zzj) obj).zzax();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static a m3352(Object obj) {
        if (C0139.m2684() <= 0) {
            return ((f0) obj).f8901b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3353(Object obj) {
        if (C0324.m6259() <= 0) {
            return ((o5) obj).f10258b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static Map m3355(Object obj) {
        if (C0236.m4538() > 0) {
            return ((a0) obj).f4389d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3356(Object obj) {
        if (C0227.m4372() < 0) {
            return ((s6) obj).G();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3357(Object obj, Object obj2) {
        if (C0291.m5589() <= 0) {
            return ((i0) obj).b((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static c m3358() {
        if (C0314.m6072() <= 0) {
            return s6.e.f14057c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3359(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3360(Object obj, int i10, int i11, int i12) {
        if (C0205.m3914() >= 0) {
            ((Bitmap) obj).setPixel(i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Parcelable[] m3361(Object obj, Object obj2) {
        if (C0304.m5859() <= 0) {
            return ((Bundle) obj).getParcelableArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3362(Object obj) {
        if (C0465.m9059() < 0) {
            return ((p7) obj).f10304s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۤ۠, reason: not valid java name and contains not printable characters */
    public static b m3363() {
        if (C0181.m3452() <= 0) {
            return r.f4744b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3364(Object obj) {
        if (C0109.m2116() < 0) {
            return ((p1) obj).f5849d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3365(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3366(Object obj) {
        if (C0019.m375() <= 0) {
            return ((i0) obj).f1273c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3367() {
        return 23 ^ C0170.f194;
    }

    /* JADX INFO: renamed from: ۥۥۣۦ, reason: contains not printable characters */
    public static String m3368() {
        if (C0258.m4918() >= 0) {
            return "Loaded invalid blob type value, ignoring it";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3369(Object obj, Object obj2) {
        if (C0302.m5797() < 0) {
            return ((Intent) obj).getStringExtra((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3354(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
