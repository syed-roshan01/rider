package b7;

import a0.C0003;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import c9.e;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.messaging.reporting.C0189;
import d7.t;
import d9.C0226;
import dagger.hilt.codegen.C0243;
import dagger.hilt.migration.C0255;
import i6.C0321;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import k0.b0;
import k0.g;
import k0.h2;
import k6.y5;
import m0.m;
import o0.d;
import o8.C0372;
import p8.C0380;
import s2.C0412;
import s4.j;
import s7.C0415;
import t9.C0428;
import u4.C0436;
import y0.o;

/* JADX INFO: renamed from: b7.ۣ۟۟ۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0054 {

    /* JADX INFO: renamed from: ۟ۥ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int f74 = 334;

    /* JADX INFO: renamed from: ۟ۡ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m1039(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1040(Object obj) {
        if (C0436.m8516() > 0) {
            return ((d) obj).k();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static u4.a m1041(Object obj) {
        if (C0321.m6200() > 0) {
            return ((j) obj).f13997c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۡ, reason: not valid java name and contains not printable characters */
    public static float m1042(Object obj) {
        if (C0226.m4339() <= 0) {
            return ((g) obj).f8935b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1044(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m1045(Object obj, Object obj2, Object obj3, long j10, Object obj4, boolean z10, boolean z11, boolean z12, Object obj5) {
        if (C0243.m4660() <= 0) {
            ((y5) obj).A((String) obj2, (String) obj3, j10, (Bundle) obj4, z10, z11, z12, (String) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1046() {
        if (C0121.m2336() <= 0) {
            return "Tap to start";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1047() {
        return (-635) ^ C0189.f213;
    }

    /* JADX INFO: renamed from: ۢۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m1048(Object obj, Object obj2) {
        if (C0380.m7433() > 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Object m1049(Object obj, Object obj2) {
        if (C0415.m8130() < 0) {
            return ((b0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۢ, reason: contains not printable characters */
    public static String m1050() {
        if (C0372.m7283() > 0) {
            return "Distance Filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۥۨ, reason: contains not printable characters */
    public static String m1051() {
        if (C0255.m4866() <= 0) {
            return "select count(1) from events where app_id=? and name not like '!_%' escape '!'";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۧ, reason: contains not printable characters */
    public static e m1052(Object obj) {
        if (C0412.m8066() <= 0) {
            return ((h2) obj).f8970b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m1053(Object obj, float f10, long j10, Object obj2, int i10, int i11) {
        if (C0428.m8371() <= 0) {
            t.d((o) obj, f10, j10, (m) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m1054(Object obj) {
        if (C0003.m70() > 0) {
            return ((f5.m) obj).f6298c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1043(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
