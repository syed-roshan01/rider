package c7;

import a.C0002;
import a2.C0004;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import d3.C0217;
import d5.b2;
import d5.g0;
import dagger.hilt.android.internal.C0236;
import f5.e0;
import ga.C0296;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Map;
import k0.e4;
import k0.m4;
import k6.m7;
import m0.l1;
import o7.d0;
import r7.e;
import t8.C0427;
import y.C0476;
import z0.C0483;

/* JADX INFO: renamed from: c7.۟ۦۣۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0068 {

    /* JADX INFO: renamed from: ۟ۦ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f88 = -762;

    /* JADX INFO: renamed from: ۟۟ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static l1 m1316(int i10) {
        if (C0217.m4114() < 0) {
            return d0.Z(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Locale m1317() {
        if (C0427.m8356() <= 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۤ, reason: not valid java name and contains not printable characters */
    public static long m1318(Object obj) {
        if (C0136.m2627() > 0) {
            return ((m4) obj).f9239s;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m1319(Object obj) {
        if (C0002.m46() <= 0) {
            return ((e4) obj).f8877d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1320(Object obj) {
        if (C0483.m9389() >= 0) {
            return ((b2) obj).f4417b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۡ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m1321(Object obj) {
        if (C0296.m5679() > 0) {
            return ((g0) obj).f4508c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1322() {
        return (-600) ^ C0236.f315;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1323(int i10) {
        if (C0148.m2838() < 0) {
            return Integer.toString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۧۧ, reason: not valid java name and contains not printable characters */
    public static z7.b m1324(Object obj, Object obj2) {
        if (C0111.m2143() > 0) {
            return e.c((String) obj, (Map) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1325(Object obj) {
        if (C0476.m9266() >= 0) {
            return ((f5.g0) obj).f6259a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m1326(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۥۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1327(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static void m1328(Object obj, Object obj2, Object obj3) {
        if (C0142.m2725() >= 0) {
            ((Resources) obj).updateConfiguration((Configuration) obj2, (DisplayMetrics) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static void m1329(Object obj) {
        if (C0129.m2492() > 0) {
            ((m7) obj).p();
        }
    }

    /* JADX INFO: renamed from: ۨۥۦۧ, reason: not valid java name and contains not printable characters */
    public static String m1330(Object obj) {
        if (C0004.m76() <= 0) {
            return ((e0) obj).f6252d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m1331(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
