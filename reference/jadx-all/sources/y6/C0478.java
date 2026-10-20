package y6;

import a2.c0;
import androidx.compose.ui.layout.C0036;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.core.C0151;
import d9.C0223;
import e1.l0;
import e9.C0267;
import f0.C0273;
import f2.l;
import h8.n;
import j8.i;
import j9.C0330;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Map;
import k0.m1;
import k0.m4;
import k0.o;
import k0.o2;
import k6.p7;
import k6.t4;
import k6.v6;
import l0.u;
import l3.C0343;
import m0.m;
import t.d;
import u8.C0439;
import y.C0476;
import z3.C0487;

/* JADX INFO: renamed from: y6.۟ۤۥۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0478 {

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f751 = 413;

    /* JADX INFO: renamed from: ۟ۡ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static l m9305() {
        if (C0140.m2699() > 0) {
            return l.f6119n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static o2 m9306() {
        if (C0476.m9266() >= 0) {
            return o2.f9310d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9307(Object obj, Object obj2) {
        if (C0267.m5099() <= 0) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9308(Object obj, Object obj2) {
        if (C0330.m6367() > 0) {
            return ((i) obj).a((v6) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static c0 m9309() {
        if (C0487.m9464() >= 0) {
            return u.f11183h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m9310(Object obj, boolean z10, boolean z11, Object obj2, Object obj3, Object obj4, float f10, float f11, Object obj5, int i10, int i11) {
        if (C0151.m2903() >= 0) {
            ((m1) obj).a(z10, z11, (x.l) obj2, (m4) obj3, (l0) obj4, f10, f11, (m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۦ, reason: not valid java name and contains not printable characters */
    public static t4 m9311(Object obj) {
        if (C0135.m2608() < 0) {
            return ((p7) obj).f10286a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m9312() {
        return (-393) ^ C0273.f388;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static float m9313(Object obj) {
        if (C0343.m6720() > 0) {
            return ((o) obj).f9282b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۥۧ, reason: not valid java name and contains not printable characters */
    public static d5.m m9314() {
        if (C0223.m4279() < 0) {
            return d5.m.f4670z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦۥ, reason: contains not printable characters */
    public static Map m9315() {
        if (C0036.m698() <= 0) {
            return n.S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m9316(String str) {
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

    /* JADX INFO: renamed from: ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m9317(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۧۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m9318(Object obj) {
        if (C0439.m8564() >= 0) {
            return ((d) obj).f14114g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m9304(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
