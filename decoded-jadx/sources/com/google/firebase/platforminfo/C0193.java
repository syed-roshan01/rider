package com.google.firebase.platforminfo;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.input.key.C0033;
import c1.C0060;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.C0201;
import d5.f1;
import d5.u0;
import d8.C0221;
import d9.C0226;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.internal.componenttreedeps.C0248;
import e1.C0258;
import f0.C0272;
import f5.m;
import g9.C0294;
import h1.C0300;
import h7.C0311;
import i6.C0319;
import j0.y;
import java.io.ByteArrayOutputStream;
import k.f;
import k0.b;
import k0.b2;
import k0.l0;
import k0.l1;
import k0.n1;
import k6.a5;
import k6.f5;
import k6.r5;
import k6.s6;
import k6.y6;
import k6.z6;
import m0.m3;
import m9.x1;
import n.g;
import p9.z;
import q5.C0385;
import r9.C0405;
import v0.C0441;
import w6.C0464;
import y.C0474;
import y9.C0478;

/* JADX INFO: renamed from: com.google.firebase.platforminfo.۟۟۟ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0193 {

    /* JADX INFO: renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f217 = 204;

    /* JADX INFO: renamed from: ۟۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static void m3680(Object obj, Object obj2, int i10) {
        if (C0385.m7546() >= 0) {
            ((f) obj).M((r5) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static l0 m3681() {
        if (C0162.m3105() > 0) {
            return l0.f9139e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static e m3682(Object obj) {
        if (C0226.m4372() <= 0) {
            return ((n1) obj).f9263t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static long m3683(Object obj) {
        if (C0300.m5773() <= 0) {
            return ((f1) obj).f4488e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza[] m3684() {
        if (C0112.m2176() > 0) {
            return zzew.zzf.zza.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static z6 m3685(Object obj) {
        if (C0464.m9059() <= 0) {
            return ((y6) obj).f10585c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3686() {
        if (C0060.m1148() > 0) {
            return "Service is currently stopped. Turn on Service Switch above to start.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m3687(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static long m3688(Object obj) {
        if (C0248.m4762() > 0) {
            return ((a5) obj).D;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static z m3689(Object obj) {
        if (C0272.m5249() < 0) {
            return ((MainViewModel) obj).f3123w0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۢ, reason: not valid java name and contains not printable characters */
    public static m3 m3690() {
        if (C0151.m2903() > 0) {
            return y.f8321a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3691() {
        return (-105) ^ C0319.f467;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static e m3692(Object obj) {
        if (C0258.m4939() <= 0) {
            return ((l1) obj).f9158n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static s6 m3693(Object obj) {
        if (C0294.m5663() >= 0) {
            return ((f5) obj).f10044u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۤۨ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3694(Object obj) {
        if (C0221.m4264() >= 0) {
            return ((m) obj).f6296a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3695(Object obj) {
        if (C0478.m9326() <= 0) {
            return ((a5) obj).f9868c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m3696(Object obj, Object obj2) {
        if (C0311.m6027() <= 0) {
            return ((g) obj).g(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static Object m3697(Object obj, Object obj2) {
        if (C0474.m9246() < 0) {
            return ((u0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3698(Object obj) {
        if (C0405.m7952() <= 0) {
            return ((m) obj).f6301f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static Bundle m3699(Object obj) {
        if (C0441.m8612() >= 0) {
            return ((zzdd) obj).zzg;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static float m3700(Object obj) {
        if (C0133.m2559() > 0) {
            return ((MainViewModel) obj).g();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static int m3701(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static x1 m3703(Object obj) {
        if (C0033.m652() < 0) {
            return ((MainViewModel) obj).f3095i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3704(Object obj) {
        if (C0119.m2289() >= 0) {
            return ((com.google.android.gms.common.internal.f) obj).isConnecting();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m3705(Object obj, Object obj2, long j10) {
        if (C0191.m3643() > 0) {
            return ((Intent) obj).getLongExtra((String) obj2, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3706(Object obj, Object obj2, int i10) {
        if (C0235.m4538() > 0) {
            ((b) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static float m3707() {
        if (C0201.m3855() < 0) {
            return b2.f8734c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۨ, reason: contains not printable characters */
    public static String m3702(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
