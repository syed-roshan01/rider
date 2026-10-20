package com.google.firebase.remoteconfig;

import androidx.activity.C0017;
import com.auto.accept.ui.viewmodel.C0075;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.installations.C0177;
import com.google.firebase.tracing.C0204;
import d5.n;
import d9.C0226;
import f0.f2;
import fa.C0282;
import g2.s;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import k0.m2;
import k6.f5;
import k6.j7;
import l6.C0345;
import l9.i;
import m0.m;
import m3.C0353;
import m9.C0360;
import p4.C0377;
import p9.q0;
import q6.C0387;
import y3.e;
import z2.C0485;
import z8.C0492;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.۟ۡ۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0200 {

    /* JADX INFO: renamed from: ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int f224 = 310;

    /* JADX INFO: renamed from: ۟ۢۨۥۣ, reason: not valid java name and contains not printable characters */
    public static List m3832(Object obj) {
        if (C0177.m3380() > 0) {
            return ((m2) obj).f9207a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۢ, reason: not valid java name and contains not printable characters */
    public static s m3833(Object obj) {
        if (C0387.m7564() > 0) {
            return ((f2) obj).f5701a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۦ, reason: not valid java name and contains not printable characters */
    public static q0 m3835(Object obj) {
        if (C0075.m1631() < 0) {
            return ((MainViewModel) obj).f3101l0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3836(Object obj) {
        if (C0377.m7371() > 0) {
            return ((j7) obj).t();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m3837(Object obj) {
        if (C0345.m6746() > 0) {
            return ((f5) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3838(Object obj, Object obj2) {
        if (C0353.m6904() <= 0) {
            ((Thread) obj).setName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3839(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۥۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m3840(Object obj) {
        if (C0492.m9566() >= 0) {
            return ((k6.s) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m3841() {
        return 967 ^ C0017.f37;
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3842(Object obj) {
        if (C0360.m7059() <= 0) {
            return ((d5.d) obj).f4443b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static String m3843(Object obj, Object obj2) {
        if (C0204.m3905() < 0) {
            return i.m1((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۤ۠, reason: contains not printable characters */
    public static String m3844(String str) {
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

    /* JADX INFO: renamed from: ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m3845(Object obj, Object obj2, Object obj3, int i10) {
        if (C0485.m9436() <= 0) {
            e.u((MainViewModel) obj, (c9.a) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧۥ, reason: not valid java name and contains not printable characters */
    public static u0.b m3846() {
        if (C0226.m4339() <= 0) {
            return n.f4685f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3847(Object obj, Object obj2) {
        if (C0282.m5443() <= 0) {
            ((ArrayDeque) obj).push(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3834(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
