package com.google.firebase.remoteconfig.internal;

import a6.C0007;
import aa.C0012;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import c3.C0063;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.reporting.C0188;
import d5.a1;
import d5.p1;
import d5.v0;
import d7.t;
import dagger.hilt.components.C0245;
import e1.C0258;
import e2.C0261;
import ea.C0268;
import f5.s;
import h4.C0306;
import i1.f;
import i9.C0322;
import java.io.ByteArrayOutputStream;
import java.io.File;
import k0.b4;
import k0.d1;
import k0.u;
import k6.a5;
import k6.y5;
import k6.z7;
import l3.C0343;
import m0.l3;
import q5.C0386;
import q8.g;
import w.C0454;
import y9.C0480;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.ۨ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0195 {

    /* JADX INFO: renamed from: ۟ۦۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int f219 = -952;

    /* JADX INFO: renamed from: ۟۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static g m3728(Object obj) {
        if (C0169.m3245() >= 0) {
            return t.N((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3729(Object obj) {
        if (C0063.m1217() > 0) {
            return ((BaseBundle) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3730(Object obj) {
        if (C0188.m3594() >= 0) {
            return ((a5) obj).H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3731(Object obj) {
        if (C0480.m9346() > 0) {
            return ((a1) obj).f4397e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3732(Object obj, Object obj2) {
        if (C0261.m4984() >= 0) {
            ((a5) obj).j((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۡ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3733(Object obj) {
        if (C0176.m3367() < 0) {
            return ((s) obj).f6323a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3734(Object obj) {
        if (C0268.m5113() < 0) {
            return ((AppConfig) obj).getForceUpdateVersion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3735(Object obj) {
        if (C0245.m4685() >= 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static l3 m3736(Object obj) {
        if (C0454.m8831() < 0) {
            return ((v0) obj).f4803n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m3737() {
        return 678 ^ C0183.f207;
    }

    /* JADX INFO: renamed from: ۢۧۥۦ, reason: not valid java name and contains not printable characters */
    public static f m3739(Object obj) {
        if (C0386.m7546() >= 0) {
            return ((p1) obj).f4723e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3740(Object obj) {
        if (C0258.m4918() > 0) {
            return f6.a.X((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3741(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m3742(Object obj, Object obj2, int i10, long j10) {
        if (C0012.m226() > 0) {
            ((y5) obj).w((Bundle) obj2, i10, j10);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۥۧ, reason: contains not printable characters */
    public static int m3743(Object obj) {
        if (C0306.m5904() >= 0) {
            return ((u) obj).f9514p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۨ, reason: contains not printable characters */
    public static String m3744(Object obj) {
        if (C0322.m6226() < 0) {
            return ((d1) obj).f8821b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static String m3745(Object obj) {
        if (C0343.m6720() >= 0) {
            return ((z7) obj).f10620d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3746(Object obj) {
        if (C0007.m154() < 0) {
            return ((b4) obj).f8748c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3747(String str) {
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

    /* JADX INFO: renamed from: ۢۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3738(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
