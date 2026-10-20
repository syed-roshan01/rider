package com.google.firebase.firestore.proto;

import android.content.Intent;
import androidx.versionedparcelable.C0048;
import c9.e;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.messaging.reporting.C0190;
import d5.c2;
import d5.f2;
import d7.C0220;
import d7.t;
import d9.C0226;
import dagger.hilt.internal.componenttreedeps.C0249;
import f0.i;
import f0.p1;
import f0.t0;
import f0.u0;
import g.C0284;
import g5.C0292;
import h8.C0315;
import i9.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import k0.j0;
import k0.j2;
import k6.a5;
import k6.u7;
import p9.q0;
import q5.C0386;
import r1.k;
import r2.C0396;
import s7.C0416;
import t3.C0425;
import t8.C0427;
import x9.v;

/* JADX INFO: renamed from: com.google.firebase.firestore.proto.۟ۥۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0162 {

    /* JADX INFO: renamed from: ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int f186 = 836;

    /* JADX INFO: renamed from: ۟۠ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static q0 m3094(Object obj) {
        if (C0190.m3639() > 0) {
            return ((MainViewModel) obj).I0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m3095(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((f) obj).b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m3096(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static j0 m3097() {
        if (C0292.m5605() < 0) {
            return j0.f9058f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧ۠, reason: not valid java name and contains not printable characters */
    public static v m3098() {
        if (C0100.m1959() <= 0) {
            return k.f13392b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Intent m3099(Object obj, Object obj2, int i10) {
        if (C0284.m5468() > 0) {
            return ((Intent) obj).putExtra((String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3100(Object obj) {
        if (C0220.m4237() >= 0) {
            return ((i) obj).f5747n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m3101(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3102(Object obj, Object obj2) {
        if (C0396.m7737() >= 0) {
            ((a5) obj).t((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m3103(Object obj, boolean z10) throws IOException {
        if (C0249.m4762() > 0) {
            ((FileChannel) obj).force(z10);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3104() {
        if (C0139.m2684() < 0) {
            t.u0();
        }
    }

    /* JADX INFO: renamed from: ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int m3105() {
        return (-716) ^ C0386.f656;
    }

    /* JADX INFO: renamed from: ۡۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String[] m3106() {
        if (C0226.m4339() < 0) {
            return u7.f10423i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3107(Object obj) {
        if (C0425.m8322() > 0) {
            return ((zzfi.zzb) obj).zze();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۨۢ, reason: contains not printable characters */
    public static t0 m3108() {
        if (C0425.m8322() >= 0) {
            return t0.W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3109(Object obj) {
        if (C0427.m8356() <= 0) {
            return ((z4.f) obj).f17231a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m3110(Object obj) {
        if (C0416.m8144() > 0) {
            return ((c2) obj).f4441d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static u0 m3111(Object obj) {
        if (C0315.m6079() > 0) {
            return ((p1) obj).f5855j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۢ, reason: not valid java name and contains not printable characters */
    public static e m3112(Object obj) {
        if (C0161.m3081() < 0) {
            return ((j2) obj).f9069e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤۨ, reason: not valid java name and contains not printable characters */
    public static d5.p1 m3113(Object obj) {
        if (C0048.m925() > 0) {
            return ((f2) obj).f4493b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3093(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
