package u0;

import android.graphics.Rect;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.C0255;
import f0.g0;
import f5.q;
import h.C0296;
import h5.C0306;
import i.C0315;
import java.io.ByteArrayOutputStream;
import k0.a3;
import k0.d5;
import k0.e0;
import k0.f0;
import k0.p;
import k6.s6;
import m7.C0358;
import n.C0360;
import q5.C0385;
import s0.C0409;
import y0.o;
import z0.C0482;

/* JADX INFO: renamed from: u0.ۣ۟ۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0430 {

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int f701 = 990;

    /* JADX INFO: renamed from: ۟۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8424(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8425() {
        return 464 ^ C0315.f463;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8426(Object obj) {
        if (C0409.m8037() <= 0) {
            return ((q) obj).f6313c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8427(Object obj) {
        if (C0385.m7546() > 0) {
            return ((f0) obj).f8903d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m8428(Object obj) {
        if (C0255.m4876() < 0) {
            return ((e0) obj).f8861c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static e1.g m8429() {
        if (C0198.m3800() > 0) {
            return androidx.compose.ui.graphics.a.f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m8430(Object obj, Object obj2) {
        if (C0296.m5709() <= 0) {
            return ((g0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ, reason: not valid java name and contains not printable characters */
    public static o m8431(Object obj, float f10) {
        if (C0360.m7073() <= 0) {
            return androidx.compose.foundation.layout.c.k((o) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static int m8433(Object obj) {
        if (C0306.m5925() <= 0) {
            return ((Rect) obj).centerY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8434(Object obj, Object obj2) {
        if (C0173.m3314() >= 0) {
            ((s6) obj).x((k6.e) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m8435(Object obj, Object obj2, Object obj3) {
        if (C0358.m7035() <= 0) {
            return a3.b((a3) obj, (String) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡ, reason: contains not printable characters */
    public static int m8436(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static d5 m8437(Object obj) {
        if (C0482.m9389() > 0) {
            return ((p) obj).f9327b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8432(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
