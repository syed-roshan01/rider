package t3;

import a2.c0;
import a5.d;
import androidx.compose.ui.semantics.C0039;
import b7.C0054;
import com.auto.accept.data.model.C0071;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.ktx.C0180;
import com.google.gson.internal.bind.C0207;
import dagger.hilt.internal.definecomponent.C0250;
import h8.C0315;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import k0.e;
import k0.e5;
import k0.i0;
import k0.m4;
import k6.d4;
import k6.f;
import k6.f4;
import k6.o4;
import q7.C0391;
import t2.C0422;
import w0.C0455;
import y0.o;

/* JADX INFO: renamed from: t3.ۣ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0425 {

    /* JADX INFO: renamed from: ۟ۦ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int f695 = 519;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8317(Object obj, Object obj2) {
        if (C0455.m8861() <= 0) {
            return ((Class) obj).isAssignableFrom((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static Iterator m8318(Object obj) {
        if (C0114.m2205() <= 0) {
            return ((Iterable) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Boolean m8320(Object obj, Object obj2) {
        if (C0207.m3957() > 0) {
            return ((f) obj).w((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static o m8321(Object obj) {
        if (C0250.m4779() <= 0) {
            return ((e) obj).f8845b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int m8322() {
        return (-105) ^ C0422.f692;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m8323(Object obj) {
        if (C0315.m6079() >= 0) {
            return ((d) obj).f1236a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m8324(Object obj) {
        if (C0180.m3448() > 0) {
            return ((o4) obj).f10256d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m8325(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m8326(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۦۡ, reason: not valid java name and contains not printable characters */
    public static c0 m8327(Object obj) {
        if (C0054.m1047() > 0) {
            return ((e5) obj).f8887h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۧ, reason: not valid java name and contains not printable characters */
    public static long m8328(Object obj) {
        if (C0039.m764() >= 0) {
            return ((m4) obj).M;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۤ, reason: contains not printable characters */
    public static f4 m8329(Object obj) {
        if (C0391.m7643() < 0) {
            return ((d4) obj).x();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۤ, reason: contains not printable characters */
    public static long m8330(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((i0) obj).E;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8319(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
