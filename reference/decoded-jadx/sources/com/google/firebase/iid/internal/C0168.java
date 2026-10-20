package com.google.firebase.iid.internal;

import a2.c0;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0029;
import b.j;
import b4.h;
import b7.C0054;
import c0.C0057;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.C0205;
import com.google.protobuf.C0209;
import d5.n0;
import d5.o1;
import dagger.hilt.C0255;
import e1.C0257;
import f0.b0;
import f0.c2;
import g.C0282;
import g.C0284;
import g7.C0292;
import h8.C0314;
import java.io.ByteArrayOutputStream;
import k0.f2;
import k0.u2;
import k0.u3;
import k0.u4;
import k0.x2;
import k6.k;
import k6.m;
import k6.y5;
import l9.i;
import m0.C0349;
import m0.l3;
import m0.p0;
import m2.a;
import p8.C0379;
import q7.C0389;
import r0.d;
import s.C0408;
import s0.C0409;
import t1.g;
import t1.n;
import v0.C0442;
import w6.C0464;

/* JADX INFO: renamed from: com.google.firebase.iid.internal.ۨۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0168 {

    /* JADX INFO: renamed from: ۟ۧۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int f192 = 944;

    /* JADX INFO: renamed from: ۣ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static m m3205(Object obj) {
        if (C0022.m444() <= 0) {
            return ((k) obj).f10145d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3206(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3207(Object obj, boolean z10, Object obj2, int i10) {
        if (C0389.m7627() <= 0) {
            o1.d((MainViewModel) obj, z10, (m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3208(long j10, Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0100.m1959() <= 0) {
            u4.b(j10, (c0) obj, (e) obj2, (m0.m) obj3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static d m3209() {
        if (C0255.m4876() <= 0) {
            return d.f13303c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static float m3210() {
        if (C0292.m5634() <= 0) {
            return u3.f9524a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3211(Object obj) {
        if (C0054.m1047() >= 0) {
            return ((f2) obj).f8917a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int m3212(long j10) {
        if (C0107.m2075() < 0) {
            return a.i(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3213(Object obj, Object obj2) {
        if (C0314.m6079() > 0) {
            return i.K0((String) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡ۟, reason: not valid java name and contains not printable characters */
    public static l3 m3214(Object obj) {
        if (C0284.m5483() > 0) {
            return ((n0) obj).f4692b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3215(Object obj) {
        if (C0379.m7433() > 0) {
            return ((AccessibilityNodeInfo) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3216() {
        if (C0282.m5446() >= 0) {
            return "The accept timer countdown animation will be removed and popups will appear instantly. Requires Shizuku.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3217() {
        if (C0349.m6838() < 0) {
            return "Hindi";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۤ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m3218(Object obj, Object obj2, float f10) {
        if (C0029.m568() <= 0) {
            return ((SharedPreferences.Editor) obj).putFloat((String) obj2, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static p0 m3219() {
        if (C0442.m8630() < 0) {
            return j.f2312a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m3220(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۧۨۥ, reason: not valid java name and contains not printable characters */
    public static x2 m3221(Object obj) {
        if (C0205.m3914() >= 0) {
            return ((u2) obj).f9522b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m3222(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0103.m2022() >= 0) {
            ((y5) obj).S((String) obj2, (String) obj3, (Bundle) obj4);
        }
    }

    /* JADX INFO: renamed from: ۤۥۡۧ, reason: not valid java name and contains not printable characters */
    public static h m3224() {
        if (C0409.m8037() < 0) {
            return h.f2710b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۧ, reason: contains not printable characters */
    public static long m3225(Object obj) {
        if (C0078.m1692() >= 0) {
            return ((y3.j) obj).f16914d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤۤۨ, reason: contains not printable characters */
    public static androidx.compose.ui.node.a m3226(Object obj) {
        if (C0257.m4918() >= 0) {
            return g.y((n) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3227(Object obj, int i10) {
        if (C0464.m9059() < 0) {
            return ((z5.k) obj).d(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۦ۠, reason: not valid java name and contains not printable characters */
    public static c2 m3228(Object obj) {
        if (C0057.m1090() <= 0) {
            return ((b0) obj).f5610c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3229() {
        return (-920) ^ C0408.f679;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m3230() {
        if (C0209.m4013() > 0) {
            return y3.e.f16903j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3223(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
