package g;

import a2.C0005;
import android.graphics.Matrix;
import android.graphics.Path;
import c9.e;
import c9.f;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.C0128;
import com.google.firebase.concurrent.C0136;
import d5.n1;
import d5.p0;
import dagger.hilt.android.lifecycle.C0237;
import f0.r;
import f5.q;
import h8.C0313;
import java.io.ByteArrayOutputStream;
import k0.n2;
import k0.o1;
import l0.h;
import l2.C0341;
import m0.C0349;
import m0.m;
import m2.b;
import m7.C0356;
import u4.C0435;
import y.i1;
import z7.C0490;

/* JADX INFO: renamed from: g.۟۠ۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0282 {

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static int f427 = -980;

    /* JADX INFO: renamed from: ۣ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5444(Object obj) {
        if (C0490.m9552() >= 0) {
            return ((q) obj).f6311a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5445(Object obj, Object obj2) {
        if (C0128.m2475() <= 0) {
            ((Path) obj).transform((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m5446() {
        return (-136) ^ C0136.f162;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۨ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m5447(Object obj) {
        if (C0356.m6984() > 0) {
            return ((p0) obj).f4714a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5448(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m5449(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        if (C0237.m4583() > 0) {
            n2.a(i10, (e) obj, (f) obj2, (e) obj3, (e) obj4, (i1) obj5, (e) obj6, (m) obj7, i11);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m5450(String str) {
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

    /* JADX INFO: renamed from: ۡۤۨ۠, reason: not valid java name and contains not printable characters */
    public static float m5451() {
        if (C0349.m6838() <= 0) {
            return h.f11059d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۥ, reason: not valid java name and contains not printable characters */
    public static b m5452(Object obj) {
        if (C0313.m6072() <= 0) {
            return ((r) obj).f5866e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static void m5453(Object obj, float f10, float f11) {
        if (C0005.m104() > 0) {
            ((k.f) obj).C(f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static long m5454(Object obj) {
        if (C0435.m8516() >= 0) {
            return ((n1) obj).f4702d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡ۠۠, reason: not valid java name and contains not printable characters */
    public static x.m m5455(Object obj) {
        if (C0341.m6699() <= 0) {
            return ((o1) obj).f9303w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5456(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
