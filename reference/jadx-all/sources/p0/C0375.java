package p0;

import a2.c0;
import android.accessibilityservice.GestureDescription;
import c3.C0063;
import c4.C0065;
import c7.C0068;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0180;
import d5.c2;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e2.C0262;
import f5.k;
import h5.C0309;
import h7.C0311;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Random;
import k0.g3;
import k0.h2;
import k0.l1;
import k0.w4;
import k6.u7;
import k6.x;
import k6.x3;
import l0.u;
import m0.g1;
import r1.x0;
import t3.C0425;
import u.s1;
import v.f2;
import v9.C0453;
import w2.C0459;

/* JADX INFO: renamed from: p0.۟ۧۧۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0375 {

    /* JADX INFO: renamed from: ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f645 = -778;

    /* JADX INFO: renamed from: ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m7339(Object obj) {
        if (C0425.m8322() >= 0) {
            return ((g3) obj).f8953p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m7340(Object obj) {
        if (C0262.m4991() > 0) {
            return ((k) obj).f6282d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static c9.e m7341(Object obj) {
        if (C0252.m4811() < 0) {
            return ((l1) obj).f9161q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۤ, reason: not valid java name and contains not printable characters */
    public static GestureDescription.Builder m7342(Object obj, Object obj2) {
        if (C0063.m1217() > 0) {
            return ((GestureDescription.Builder) obj).addStroke((GestureDescription.StrokeDescription) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۤ, reason: not valid java name and contains not printable characters */
    public static int m7343(Object obj) {
        if (C0453.m8825() >= 0) {
            return ((h2) obj).f8973e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static int m7344(Object obj, int i10) {
        if (C0173.m3314() >= 0) {
            return ((Random) obj).nextInt(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static x3 m7345() {
        if (C0180.m3448() > 0) {
            return x.f10504q0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static c0 m7346() {
        if (C0309.m5962() >= 0) {
            return u.f11181f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۣ, reason: not valid java name and contains not printable characters */
    public static g1 m7347(Object obj) {
        if (C0116.m2247() > 0) {
            return ((c2) obj).f4438a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static w3.d m7348(Object obj) {
        if (C0459.m8930() > 0) {
            return ((u7) obj).f10428f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static float m7349() {
        if (C0235.m4512() >= 0) {
            return l0.a.f10986a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۧ۟۠, reason: contains not printable characters */
    public static int m7350() {
        return 233 ^ C0311.f458;
    }

    /* JADX INFO: renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static x0 m7351(Object obj) {
        if (C0065.m1257() < 0) {
            return ((w4) obj).f9624f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥۢ, reason: not valid java name and contains not printable characters */
    public static int m7352(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۢۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m7353(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0068.m1322() >= 0) {
            return ((f2) obj).c((s1) obj2, (c9.e) obj3, (u8.e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۥۨ, reason: not valid java name and contains not printable characters */
    public static String m7354(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static String m7338(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
