package l6;

import androidx.compose.ui.graphics.C0031;
import c9.e;
import ca.C0070;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement_impl.C0185;
import d5.b2;
import d5.s;
import d7.y;
import f0.C0272;
import f0.m0;
import java.io.ByteArrayOutputStream;
import k0.q1;
import k6.f4;
import m3.C0353;
import p9.q0;
import u0.b;
import w2.C0459;

/* JADX INFO: renamed from: l6.ۣۧۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0345 {

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static int f615 = 712;

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6744(Object obj, Object obj2, Object obj3) {
        if (C0185.m3538() >= 0) {
            return ((q0) obj).j(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static m0 m6745() {
        if (C0353.m6904() < 0) {
            return m0.f5815a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m6746() {
        return 967 ^ C0070.f90;
    }

    /* JADX INFO: renamed from: ۠ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6747() {
        if (C0459.m8930() >= 0) {
            return y.a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۤ۠, reason: not valid java name and contains not printable characters */
    public static b m6748() {
        if (C0080.m1729() < 0) {
            return s.f4765i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6749(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧ۟, reason: contains not printable characters */
    public static boolean m6751(Object obj) {
        if (C0272.m5222() <= 0) {
            return ((f4) obj).f10021b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static e m6752(Object obj) {
        if (C0180.m3448() >= 0) {
            return ((q1) obj).f9379n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6753(Object obj) {
        if (C0031.m598() > 0) {
            return ((b2) obj).f4420e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6754(String str) {
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

    /* JADX INFO: renamed from: ۤۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m6750(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
