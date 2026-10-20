package k3;

import a2.c0;
import androidx.compose.foundation.C0026;
import c4.C0064;
import com.google.firebase.dynamicloading.C0139;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.migration.C0254;
import fa.C0281;
import java.io.ByteArrayOutputStream;
import k0.i0;
import k0.t;
import k0.y;
import k0.z;
import k6.h6;
import r2.C0396;
import v0.C0443;
import y0.o;
import y3.k;
import z3.C0486;

/* JADX INFO: renamed from: k3.۟ۧ۠۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0334 {

    /* JADX INFO: renamed from: ۟ۥۢۦۢ, reason: not valid java name and contains not printable characters */
    public static int f518 = -723;

    /* JADX INFO: renamed from: ۟۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m6483() {
        if (C0250.m4793() >= 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m6484() {
        if (C0486.m9464() > 0) {
            return k.f16916b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m6485() {
        if (C0254.m4866() < 0) {
            return "app_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m6486(long j10) {
        if (C0026.m508() > 0) {
            return Math.abs(j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m6487(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۤ, reason: not valid java name and contains not printable characters */
    public static int m6488(Object obj) {
        if (C0064.m1243() > 0) {
            return ((c0) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static t m6489() {
        if (C0396.m7755() > 0) {
            return t.f9465d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6490(String str) {
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

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int m6491() {
        return 940 ^ C0281.f426;
    }

    /* JADX INFO: renamed from: ۣۤۢ۟, reason: not valid java name and contains not printable characters */
    public static long m6492(Object obj) {
        if (C0281.m5443() < 0) {
            return ((h6) obj).f10085b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۥۤ, reason: not valid java name and contains not printable characters */
    public static y m6493(Object obj) {
        if (C0443.m8654() < 0) {
            return z.d((i0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static o m6495(Object obj, float f10, float f11) {
        if (C0139.m2684() <= 0) {
            return androidx.compose.foundation.layout.a.j((o) obj, f10, f11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m6494(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
