package e2;

import android.os.Parcelable;
import c4.C0066;
import com.google.firebase.installations.local.C0176;
import com.google.gson.internal.bind.C0206;
import com.google.gson.internal.bind.C0207;
import e0.C0257;
import e1.l0;
import f0.C0273;
import f0.b1;
import f0.g0;
import f0.s;
import g5.C0292;
import g9.C0295;
import java.io.ByteArrayOutputStream;
import k0.h4;
import k0.o3;
import k0.s4;
import k6.f6;
import k6.j7;
import k6.r7;
import k6.t4;
import k6.y5;
import la.C0349;
import m1.C0352;
import q.f;
import q.r;
import s7.C0416;
import u0.C0431;
import u8.h;
import u8.i;
import u8.j;
import w9.C0466;
import x2.C0468;
import x4.C0470;
import x7.C0473;
import y1.u;

/* JADX INFO: renamed from: e2.ۨۥ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0263 {

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int f342 = 189;

    /* JADX INFO: renamed from: ۟۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static j m5003(Object obj, Object obj2) {
        if (C0206.m3931() > 0) {
            return z6.a.V((h) obj, (i) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5004(Object obj) {
        if (C0257.m4901() <= 0) {
            return ((s4) obj).f9459b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m5005(Object obj) {
        if (C0273.m5249() < 0) {
            return ((r) obj).f13022b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m5006(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static u m5007() {
        if (C0466.m9068() <= 0) {
            return y1.i.f16768h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static f m5008(Object obj) {
        if (C0416.m8144() >= 0) {
            return ((t4) obj).f10389m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5009(Object obj) {
        if (C0349.m6818() < 0) {
            return ((s) obj).f5884c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static long m5011(Object obj) {
        if (C0470.m9143() > 0) {
            return ((h4) obj).f8985d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m5012(Object obj) {
        if (C0176.m3367() <= 0) {
            return ((b1) obj).f5613a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Parcelable m5013(Object obj, Object obj2, Object obj3) {
        if (C0468.m9101() <= 0) {
            return ((r7) obj).v((byte[]) obj2, (Parcelable.Creator) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5014(String str) {
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

    /* JADX INFO: renamed from: ۤۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5015(Object obj) {
        if (C0207.m3957() >= 0) {
            return ((g0) obj).f5705a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5016() {
        return (-332) ^ C0352.f622;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static String m5017() {
        if (C0431.m8425() >= 0) {
            return "expired_event";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۧ, reason: contains not printable characters */
    public static void m5018(Object obj) {
        if (C0473.m9193() < 0) {
            ((y5) obj).M();
        }
    }

    /* JADX INFO: renamed from: ۧۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m5019() {
        if (C0066.m1277() > 0) {
            return "മലയാളം";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥۤ, reason: not valid java name and contains not printable characters */
    public static l0 m5020(Object obj) {
        if (C0292.m5605() < 0) {
            return ((o3) obj).f9314b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static f6 m5021(Object obj) {
        if (C0295.m5663() >= 0) {
            return ((j7) obj).f10133e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5010(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
