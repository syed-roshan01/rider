package com.google.firebase.firestore.core;

import a2.b0;
import a5.j;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.input.key.C0033;
import androidx.startup.C0047;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.tracing.C0204;
import d5.h0;
import dagger.hilt.android.internal.modules.C0233;
import e7.C0264;
import java.io.ByteArrayOutputStream;
import k0.j2;
import k0.v0;
import k6.n6;
import k6.p7;
import k6.t4;
import r5.C0400;
import t.d0;
import y0.o;
import z2.C0484;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.ۧۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0153 {

    /* JADX INFO: renamed from: ۡ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f178 = -174;

    /* JADX INFO: renamed from: ۟۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static c9.e m2933(Object obj) {
        if (C0264.m5062() <= 0) {
            return ((j2) obj).f9070f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static h0 m2935() {
        if (C0186.m3548() <= 0) {
            return h0.f4540c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2936(Object obj) {
        if (C0169.m3245() > 0) {
            return ((n6) obj).f10229a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2937() {
        if (C0185.m3538() >= 0) {
            return b0.f904c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m2938() {
        return (-465) ^ C0400.f671;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m2939(String str) {
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

    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static o m2940(Object obj) {
        if (C0233.m4495() < 0) {
            return ((v0) obj).f9544b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2941(Object obj, Object obj2) {
        if (C0484.m9436() <= 0) {
            return f6.a.c0((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m2942(Object obj) {
        if (C0033.m652() < 0) {
            return ((CharSequence) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m2943(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۡ۠۟, reason: contains not printable characters */
    public static t.b0 m2944() {
        if (C0204.m3905() <= 0) {
            return d0.f14122c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۧ, reason: contains not printable characters */
    public static long m2945() {
        if (C0020.m399() <= 0) {
            return l0.c.f11017i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۤۡۧ, reason: not valid java name and contains not printable characters */
    public static j m2946(Object obj) {
        if (C0047.m904() <= 0) {
            return ((a5.g) obj).f1257b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۧۦ, reason: not valid java name and contains not printable characters */
    public static t4 m2947(Object obj) {
        if (C0169.m3245() > 0) {
            return ((p7) obj).K();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2934(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
