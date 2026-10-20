package com.google.firebase.firestore.bundle;

import a2.x;
import a6.a;
import android.os.BaseBundle;
import android.widget.TextView;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.semantics.C0039;
import c9.c;
import c9.e;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.messaging.ktx.C0186;
import d4.C0217;
import d5.q;
import d7.C0220;
import d8.C0221;
import e2.C0261;
import f0.c2;
import f0.q0;
import f2.l;
import fa.C0280;
import h5.C0307;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import k0.k;
import k6.a5;
import k6.p7;
import k6.u7;
import k6.w6;
import l0.p;
import m0.m;
import m0.s;
import m7.C0357;
import m7.C0358;
import p9.z;
import u0.b;
import v6.C0446;
import z0.C0482;

/* JADX INFO: renamed from: com.google.firebase.firestore.bundle.ۣۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0150 {

    /* JADX INFO: renamed from: ۟ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f175 = -861;

    /* JADX INFO: renamed from: ۟۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2871() {
        if (C0135.m2608() < 0) {
            return "Error storing conditional user property";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m2872(Object obj) {
        if (C0482.m9389() >= 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static float m2873() {
        if (C0307.m5935() >= 0) {
            return p.f11111f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static e m2875(Object obj) {
        if (C0358.m7035() <= 0) {
            return ((k) obj).f9080a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ۠, reason: not valid java name and contains not printable characters */
    public static a m2876(Object obj) {
        if (C0039.m764() > 0) {
            return ((w6) obj).f10470e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m2877() {
        if (C0357.m7001() < 0) {
            return "measurement_enabled";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۨ, reason: not valid java name and contains not printable characters */
    public static l m2878(Object obj) {
        if (C0446.m8696() > 0) {
            return ((x) obj).f1033c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2879(Object obj, Object obj2) {
        if (C0220.m4261() > 0) {
            s.d((c9.a) obj, (m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2880(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Boolean m2881(Object obj) {
        if (C0261.m4991() > 0) {
            return ((a5) obj).f9883r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m2882(Object obj) {
        if (C0217.m4144() >= 0) {
            return ((p7) obj).f10301p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m2883(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static z m2884(Object obj) {
        if (C0074.m1607() < 0) {
            return ((MainViewModel) obj).f3119u0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2885(Object obj, Object obj2) {
        if (C0114.m2205() < 0) {
            return ((BaseBundle) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m2886(Object obj) {
        if (C0280.m5432() >= 0) {
            return ((q0) obj).f5861d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2887(Object obj, int i10) {
        if (C0121.m2336() < 0) {
            return ((u7) obj).a0(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۨۦ, reason: not valid java name and contains not printable characters */
    public static b m2888() {
        if (C0086.m1846() >= 0) {
            return q.f4736m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static zzfi.zzl m2889(Object obj) {
        if (C0027.m541() > 0) {
            return ((zzfi.zzc) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static c m2890(Object obj) {
        if (C0186.m3548() <= 0) {
            return ((c2) obj).f5654s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۦ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m2891(Object obj) {
        if (C0221.m4264() >= 0) {
            return ((CopyOnWriteArraySet) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۨۤ, reason: contains not printable characters */
    public static int m2892() {
        return (-94) ^ C0164.f188;
    }

    /* JADX INFO: renamed from: ۦۦۣۨ, reason: contains not printable characters */
    public static void m2893(Object obj, float f10) {
        if (C0029.m568() < 0) {
            ((TextView) obj).setTextSize(f10);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۣ, reason: not valid java name and contains not printable characters */
    public static String m2874(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
