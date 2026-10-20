package p3;

import androidx.compose.ui.draw.C0029;
import b.C0049;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.heartbeatinfo.C0167;
import d5.b2;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.C0253;
import f0.v1;
import g.C0284;
import g0.C0285;
import h6.g;
import h8.C0314;
import i1.f;
import i7.d1;
import java.io.ByteArrayOutputStream;
import k0.t1;
import k0.w0;
import k6.d;
import k6.t;
import k6.u7;
import p9.q0;
import p9.z;
import r1.x0;
import u7.C0437;
import x.m;
import z.C0480;
import z3.C0486;

/* JADX INFO: renamed from: p3.۟ۢ۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0375 {

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int f646 = -121;

    /* JADX INFO: renamed from: ۟۠ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static f m7356() {
        if (C0167.m3200() >= 0) {
            return g.b0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m7357(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7358(Object obj) {
        if (C0253.m4844() > 0) {
            return ((t) obj).f10365a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static MainViewModel m7359(Object obj) {
        if (C0125.m2408() >= 0) {
            return ((b2) obj).f4418c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7360(Object obj, Object obj2) {
        if (C0480.m9354() < 0) {
            d7.a.m(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۨ, reason: not valid java name and contains not printable characters */
    public static int m7361(Object obj) {
        if (C0314.m6079() > 0) {
            return ((d) obj).f9952b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m7362() {
        return 698 ^ C0284.f429;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static m m7363(Object obj) {
        if (C0285.m5504() > 0) {
            return ((v1) obj).f5978e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢۤ, reason: not valid java name and contains not printable characters */
    public static float m7364(Object obj) {
        if (C0049.m945() > 0) {
            return ((w0) obj).f9598a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۦۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7365(Object obj, Object obj2) {
        if (C0029.m568() <= 0) {
            return ((u7) obj).r0((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢۨۧ, reason: not valid java name and contains not printable characters */
    public static z m7366(Object obj) {
        if (C0126.m2434() > 0) {
            return ((MainViewModel) obj).i0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static x0 m7367(Object obj) {
        if (C0486.m9464() >= 0) {
            return ((t1) obj).f9482q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static q0 m7368(Object obj) {
        if (C0437.m8543() >= 0) {
            return ((MainViewModel) obj).B0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۧ, reason: not valid java name and contains not printable characters */
    public static i7.t1 m7369(Object obj) {
        if (C0243.m4678() >= 0) {
            return ((d1) obj).B();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m7370(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m7355(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
