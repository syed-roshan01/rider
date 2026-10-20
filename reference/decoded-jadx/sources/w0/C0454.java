package w0;

import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import androidx.lifecycle.C0043;
import c4.C0064;
import com.google.firebase.iid.C0169;
import com.google.firebase.remoteconfiginterop.C0203;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.aliasof.C0247;
import e2.C0263;
import h5.C0308;
import h8.C0313;
import java.io.ByteArrayOutputStream;
import k0.b5;
import k6.c7;
import k6.c8;
import k6.d4;
import k6.f4;
import k6.h5;
import k6.m5;
import k6.p4;
import k6.q3;
import k6.u7;
import k6.z3;
import m9.C0359;
import q6.C0387;
import t9.C0427;
import v6.C0447;
import w2.C0456;
import y.t0;

/* JADX INFO: renamed from: w0.۟ۤۧۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0454 {

    /* JADX INFO: renamed from: ۥۢۦۣ, reason: contains not printable characters */
    public static int f725 = 308;

    /* JADX INFO: renamed from: ۟۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static g2.s m8857(Object obj) {
        if (C0024.m487() >= 0) {
            return ((f0.o) obj).f5835n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static u0.b m8858() {
        if (C0064.m1243() >= 0) {
            return d5.o.f4707b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m8859(Object obj, float f10) {
        if (C0387.m7585() > 0) {
            ((k.f) obj).J(f10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m8860(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8861() {
        return (-645) ^ C0427.f698;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8862(Object obj) {
        if (C0252.m4832() < 0) {
            return ((m5) obj).f10204a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static void m8863(Object obj, Object obj2, boolean z10) {
        if (C0022.m444() <= 0) {
            ((h5) obj).b((String) obj2, z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۥ, reason: not valid java name and contains not printable characters */
    public static long m8864(Object obj) {
        if (C0456.m8890() > 0) {
            return ((e1.r) obj).f5067a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ۠, reason: not valid java name and contains not printable characters */
    public static d5.l m8865() {
        if (C0247.m4732() < 0) {
            return d5.l.f4626c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static l2.i m8866(Object obj) {
        if (C0313.m6072() < 0) {
            return ((b5) obj).f8760q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static p4 m8867(Object obj) {
        if (C0169.m3245() > 0) {
            return ((c7) obj).f9946i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m8869(Object obj, Object obj2) {
        if (C0263.m5033() < 0) {
            return u7.X((String) obj, (String[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static Long m8870(Object obj) {
        if (C0359.m7059() < 0) {
            return ((c8) obj).f9948b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ۠, reason: not valid java name and contains not printable characters */
    public static f4 m8871(Object obj) {
        if (C0203.m3894() > 0) {
            return ((d4) obj).f9964f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۧ, reason: not valid java name and contains not printable characters */
    public static long m8872(long j10, long j11) {
        if (C0043.m833() > 0) {
            return Math.min(j10, j11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۠ۨ۠, reason: contains not printable characters */
    public static int m8873(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static z3 m8874(Object obj) {
        if (C0308.m5962() >= 0) {
            return ((q3) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
    public static float m8875(Object obj, Object obj2) {
        if (C0447.m8732() < 0) {
            return androidx.compose.foundation.layout.a.f((t0) obj, (m2.l) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m8868(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
