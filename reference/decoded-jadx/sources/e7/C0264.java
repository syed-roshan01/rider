package e7;

import a2.C0004;
import androidx.annotation.C0018;
import androidx.core.content.C0041;
import com.auto.accept.ui.viewmodel.C0075;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.C0127;
import d5.l0;
import dagger.hilt.android.migration.C0238;
import f0.z0;
import f5.y;
import g2.C0286;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import k6.z3;
import m0.g1;
import p4.C0376;
import q9.C0391;
import s.C0408;
import v0.C0441;
import y.u0;
import z.C0481;

/* JADX INFO: renamed from: e7.ۧ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0264 {

    /* JADX INFO: renamed from: ۟۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int f344 = 575;

    /* JADX INFO: renamed from: ۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m5048(Object obj) {
        if (C0481.m9373() < 0) {
            return ((z3) obj).v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5049(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢۤۨ, reason: not valid java name and contains not printable characters */
    public static u0 m5050() {
        if (C0018.m354() >= 0) {
            return k0.i.f8995e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۣ, reason: not valid java name and contains not printable characters */
    public static Locale m5051() {
        if (C0286.m5522() >= 0) {
            return Locale.US;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static int m5052(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m5053(Object obj) {
        if (C0238.m4587() < 0) {
            return ((f5.k) obj).f6280b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m5054(Object obj, Object obj2, Object obj3) {
        if (C0376.m7371() > 0) {
            return ((k6.k) obj).C((String) obj2, (String[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m5056(Object obj) {
        if (C0127.m2448() > 0) {
            return ((y) obj).f6341b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static i1.f m5057() {
        if (C0004.m76() < 0) {
            return h6.g.e0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m5058() {
        if (C0075.m1631() <= 0) {
            return l0.m.f11098e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static d5.l m5059() {
        if (C0391.m7657() >= 0) {
            return d5.l.f4637u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۢ, reason: contains not printable characters */
    public static c1.e m5060(Object obj) {
        if (C0408.m8009() < 0) {
            return ((z0) obj).f6016c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧۨ, reason: contains not printable characters */
    public static String m5061(Object obj) {
        if (C0041.m812() >= 0) {
            return l0.a((g1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5062() {
        return 257 ^ C0441.f712;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m5055(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
