package j6;

import a5.i;
import a8.C0010;
import android.content.Context;
import android.os.C0013;
import androidx.startup.C0047;
import c4.b;
import c4.d;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.firebase.analytics.ktxtesting.C0121;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.internal.aliasof.C0247;
import f0.e2;
import h.C0298;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import k2.C0333;
import k6.f;
import k6.n7;
import k6.o7;
import k6.p7;
import l.t;
import m0.s;
import m5.C0354;
import n7.C0363;
import v.f2;
import z3.C0485;

/* JADX INFO: renamed from: j6.ۣۦۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0328 {

    /* JADX INFO: renamed from: ۟۠ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int f476 = 743;

    /* JADX INFO: renamed from: ۟۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m6337(Object obj) {
        if (C0047.m904() < 0) {
            return ((p7) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m6338(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m6339(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۥۡۦ, reason: not valid java name and contains not printable characters */
    public static t m6340(Object obj) {
        if (C0363.m7127() < 0) {
            return ((e2) obj).f5688b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m6341(Object obj) {
        if (C0485.m9449() <= 0) {
            s.g((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static b m6343(Object obj, Object obj2) {
        if (C0236.m4549() <= 0) {
            return b.a((Context) obj, (d) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m6344(Object obj) {
        if (C0121.m2336() < 0) {
            return ((i) obj).f1270c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m6345(Object obj) {
        if (C0333.m6472() <= 0) {
            return ((n7) obj).f10238c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m6346(Object obj) {
        if (C0010.m199() > 0) {
            return ((o7) obj).f10259a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6347(Object obj, Object obj2) {
        if (C0298.m5742() >= 0) {
            return ((f) obj).t((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static float m6348(Object obj, float f10) {
        if (C0354.m6953() <= 0) {
            return ((f2) obj).e(f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static i1.f m6349() {
        if (C0013.m253() >= 0) {
            return z6.a.G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۤ, reason: contains not printable characters */
    public static int m6350() {
        return (-298) ^ C0080.f114;
    }

    /* JADX INFO: renamed from: ۧۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6351() {
        if (C0247.m4732() <= 0) {
            return "Enable Accessibility Service";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m6342(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
