package com.google.firebase.appcheck.interop;

import a.C0001;
import android.view.accessibility.AccessibilityNodeInfo;
import b7.C0054;
import c1.C0061;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.measurement.zzps;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.measurement.C0182;
import d5.t1;
import d5.y0;
import dagger.hilt.android.internal.modules.C0233;
import f0.d0;
import f0.v;
import f0.w;
import f5.p;
import g.C0283;
import g.C0284;
import j0.b0;
import java.io.ByteArrayOutputStream;
import k6.a5;
import k6.b4;
import k6.l4;
import k6.x;
import k6.x3;
import l0.C0339;
import m5.C0354;
import q9.C0391;
import u8.e;
import v6.C0447;
import x.k;
import x.m;

/* JADX INFO: renamed from: com.google.firebase.appcheck.interop.۟ۦۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0130 {

    /* JADX INFO: renamed from: ۠۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static int f156 = -57;

    /* JADX INFO: renamed from: ۟ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static x3 m2501() {
        if (C0354.m6953() < 0) {
            return x.f10486h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2503(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۢ, reason: not valid java name and contains not printable characters */
    public static void m2504(Object obj, Object obj2) {
        if (C0182.m3488() > 0) {
            ((a5) obj).b((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2505(Object obj, int i10, Object obj2) {
        if (C0061.m1161() < 0) {
            return ((b4) obj).w(i10, (byte[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2506(Object obj) {
        if (C0283.m5468() > 0) {
            return ((y0) obj).f4859b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static e m2507(Object obj, Object obj2, Object obj3) {
        if (C0391.m7657() >= 0) {
            return ((w) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m2508(Object obj, int i10) {
        if (C0339.m6658() < 0) {
            return ((AccessibilityNodeInfo) obj).getChild(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۡ, reason: contains not printable characters */
    public static String m2509(String str) {
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

    /* JADX INFO: renamed from: ۥۤ۠ۡ, reason: contains not printable characters */
    public static MainViewModel m2510(Object obj) {
        if (C0233.m4495() < 0) {
            return ((p) obj).f6309b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥ۟, reason: contains not printable characters */
    public static int m2511() {
        return 166 ^ C0284.f429;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static int m2512(Object obj) {
        if (C0001.m35() < 0) {
            return ((t1) obj).f4781a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m2513(Object obj, Object obj2) {
        if (C0159.m3030() < 0) {
            return ((v) obj).invoke(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2514() {
        if (C0076.m1655() > 0) {
            return zzps.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2515(Object obj) {
        if (C0447.m8732() < 0) {
            return ((d0) obj).f5660a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۨۨ, reason: not valid java name and contains not printable characters */
    public static b0 m2516(Object obj) {
        if (C0160.m3070() <= 0) {
            return ((l4) obj).f10179l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m2517(Object obj, Object obj2, Object obj3) {
        if (C0054.m1047() > 0) {
            return ((m) obj).a((k) obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m2502(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
