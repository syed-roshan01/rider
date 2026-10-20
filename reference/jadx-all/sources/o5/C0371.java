package o5;

import a8.C0009;
import androidx.lifecycle.C0043;
import com.google.firebase.installations.C0177;
import com.google.firebase.remoteconfiginterop.C0202;
import f0.h1;
import g9.C0295;
import java.io.ByteArrayOutputStream;
import k0.k1;
import k0.m4;
import k0.o1;
import k0.q;
import k0.v4;
import k6.s6;
import k6.z6;
import o1.u;
import p8.C0380;
import r1.C0394;
import t9.C0428;
import x2.C0468;
import y0.o;

/* JADX INFO: renamed from: o5.۟ۧۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0371 {

    /* JADX INFO: renamed from: ۟ۡۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int f641 = 794;

    /* JADX INFO: renamed from: ۟۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m7265(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static long m7266(Object obj) {
        if (C0043.m833() > 0) {
            return ((u) obj).f12414a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static o m7268(Object obj) {
        if (C0202.m3868() >= 0) {
            return ((o1) obj).f9289b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۦ, reason: not valid java name and contains not printable characters */
    public static int m7269() {
        return 682 ^ C0394.f664;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨ۟, reason: not valid java name and contains not printable characters */
    public static String m7270(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۤۧۤ, reason: not valid java name and contains not printable characters */
    public static long m7271(Object obj) {
        if (C0428.m8371() <= 0) {
            return ((m4) obj).f9243w;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static s6 m7272(Object obj) {
        if (C0009.m177() >= 0) {
            return ((z6) obj).f10619c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7273(Object obj) {
        if (C0468.m9101() < 0) {
            return ((k1) obj).f9095c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۤۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m7274(Object obj) {
        if (C0177.m3380() >= 0) {
            return ((v4) obj).f9574o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static int m7275(Object obj) {
        if (C0380.m7433() >= 0) {
            return ((q) obj).f9370p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m7276(Object obj, Object obj2) {
        if (C0295.m5663() >= 0) {
            return ((h1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m7267(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
