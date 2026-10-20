package l8;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.lifecycle.C0043;
import com.google.firebase.abt.C0113;
import com.google.firebase.components.C0134;
import com.google.firebase.encoders.C0143;
import d3.C0217;
import dagger.hilt.components.C0245;
import f0.i1;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import k0.m4;
import k6.l4;
import k6.p4;
import m0.m3;
import m7.C0358;
import m7.C0359;
import m9.p1;
import p0.C0374;
import u1.s1;
import z7.C0489;
import z7.C0490;

/* JADX INFO: renamed from: l8.ۣ۟ۧۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0346 {

    /* JADX INFO: renamed from: ۨۨۧ۠, reason: not valid java name and contains not printable characters */
    public static int f616 = 690;

    /* JADX INFO: renamed from: ۟۠ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static m3 m6755() {
        if (C0490.m9528() >= 0) {
            return s1.f15278h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m6756(int i10) {
        if (C0358.m7001() <= 0) {
            return z6.a.T(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m6757(Object obj) {
        if (C0245.m4685() > 0) {
            return ((l4) obj).f10170c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6758(Object obj) {
        if (C0134.m2587() < 0) {
            return ((p4) obj).f10273c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m6759() {
        return (-431) ^ C0359.f629;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m6760(Object obj) {
        if (C0217.m4114() < 0) {
            return ((PackageInfo) obj).firstInstallTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String m6761(Object obj) {
        if (C0113.m2182() < 0) {
            return ((Class) obj).getSimpleName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m6762() {
        if (C0374.m7322() <= 0) {
            return "trigger_timeout";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int m6763(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6765(String str) {
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

    /* JADX INFO: renamed from: ۤۧۥۣ, reason: not valid java name and contains not printable characters */
    public static long m6766() {
        if (C0043.m833() > 0) {
            return i1.f5765k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۦۡ, reason: contains not printable characters */
    public static long m6767(Object obj) {
        if (C0489.m9505() > 0) {
            return ((m4) obj).f9246z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۡۦ, reason: not valid java name and contains not printable characters */
    public static void m6768(Object obj, Object obj2) {
        if (C0143.m2751() >= 0) {
            ((p1) obj).a((CancellationException) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6764(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
