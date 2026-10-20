package s6;

import androidx.compose.ui.draw.C0029;
import androidx.profileinstaller.C0045;
import c1.C0061;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0153;
import d1.C0213;
import d2.C0215;
import dagger.hilt.android.internal.modules.C0233;
import f5.t;
import j4.C0326;
import j4.l;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import k0.d1;
import k0.m;
import k0.o3;
import k6.p7;
import k6.u7;
import l6.C0343;
import m0.n1;
import p9.z;
import w2.C0457;
import y0.o;
import y1.v;
import z3.C0485;

/* JADX INFO: renamed from: s6.۟ۡ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0413 {

    /* JADX INFO: renamed from: ۧۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int f684 = -957;

    /* JADX INFO: renamed from: ۟۟۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m8106(Object obj, Object obj2) {
        if (C0149.m2863() >= 0) {
            ((m) obj).a((v) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8107() {
        return 530 ^ C0326.f474;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m8109(Object obj) {
        if (C0213.m4083() < 0) {
            return ((d1) obj).f8823d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static Comparable m8110(Object obj, Object obj2) {
        if (C0045.m874() > 0) {
            return z6.a.t((Float) obj, (i9.d) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static String m8111(Object obj) {
        if (C0485.m9449() < 0) {
            return ((t) obj).f6327c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static z m8112(Object obj) {
        if (C0233.m4495() < 0) {
            return ((MainViewModel) obj).f3103m0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8113(Object obj, boolean z10, int i10, Object obj2, Object obj3) {
        if (C0029.m568() <= 0) {
            ((p7) obj).q(z10, i10, (Throwable) obj2, (byte[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static z m8114(Object obj) {
        if (C0109.m2116() <= 0) {
            return ((MainViewModel) obj).M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢ۟, reason: contains not printable characters */
    public static Object m8115(Object obj) {
        if (C0343.m6738() < 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۧ, reason: contains not printable characters */
    public static n1 m8116(Object obj) {
        if (C0061.m1161() < 0) {
            return ((l) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۢ, reason: contains not printable characters */
    public static String m8117(String str) {
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

    /* JADX INFO: renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static int m8118(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static o m8119(Object obj) {
        if (C0215.m4108() <= 0) {
            return ((o3) obj).f9313a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8120(Object obj) {
        if (C0153.m2938() < 0) {
            return ((k6.f) obj).A();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m8121(Object obj) {
        if (C0457.m8901() <= 0) {
            return u7.s0((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8108(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
