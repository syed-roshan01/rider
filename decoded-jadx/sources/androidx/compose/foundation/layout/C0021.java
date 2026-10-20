package androidx.compose.foundation.layout;

import androidx.compose.ui.draw.C0029;
import com.google.android.gms.internal.measurement.zzfi;
import d5.m1;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import fa.C0279;
import g2.o;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.i0;
import k6.p7;
import l3.C0342;
import r1.p;
import t2.C0421;
import u.C0429;
import x0.C0466;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.۟۟ۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0021 {

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static int f41 = 972;

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m414(Object obj) {
        if (C0342.m6720() >= 0) {
            return ((o) obj).f6588e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۤ, reason: not valid java name and contains not printable characters */
    public static String m415(Object obj) {
        if (C0466.m9086() >= 0) {
            return ((m1) obj).f4679d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m416(Object obj, Object obj2) {
        if (C0429.m8415() >= 0) {
            return ((zzfi.zze.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m417() {
        return (-942) ^ C0029.f49;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static long m418(Object obj) {
        if (C0421.m8278() < 0) {
            return ((i0) obj).f9016t;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m419(Object obj) {
        if (C0230.m4440() > 0) {
            return ((p7) obj).f10310y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m420(Object obj, int i10) {
        if (C0279.m5406() < 0) {
            return ((p) obj).V(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۨ, reason: contains not printable characters */
    public static String m422(String str) {
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

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m423(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۦۦۨ, reason: not valid java name and contains not printable characters */
    public static String m421(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
