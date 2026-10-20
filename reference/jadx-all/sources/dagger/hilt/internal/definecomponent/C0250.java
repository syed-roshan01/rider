package dagger.hilt.internal.definecomponent;

import b3.C0051;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.proto.C0162;
import d5.e0;
import d5.t0;
import e7.C0265;
import java.io.ByteArrayOutputStream;
import k0.m2;
import k0.p1;
import k6.r;
import k6.x;
import k6.x3;
import m1.C0351;
import o1.s;
import q0.C0383;
import q1.C0384;
import w2.C0457;
import w6.C0465;
import y0.o;
import y9.C0480;

/* JADX INFO: renamed from: dagger.hilt.internal.definecomponent.ۨۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0250 {

    /* JADX INFO: renamed from: ۠ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static int f329 = -828;

    /* JADX INFO: renamed from: ۟ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static x3 m4767() {
        if (C0384.m7523() <= 0) {
            return x.Z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static Integer m4768(Object obj) {
        if (C0480.m9346() >= 0) {
            return ((m2) obj).f9218s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4769(Object obj) {
        if (C0351.m6878() < 0) {
            return ((zzew.zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4770(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static o m4772(Object obj) {
        if (C0457.m8890() >= 0) {
            return ((p1) obj).f9336c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۥ, reason: not valid java name and contains not printable characters */
    public static Thread m4773() {
        if (C0383.m7487() <= 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4774(Object obj) {
        if (C0051.m992() >= 0) {
            return ((t0) obj).f4780c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4775(Object obj) {
        if (C0265.m5062() < 0) {
            return ((e0) obj).f4467c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4776(int i10, int i11, float f10) {
        if (C0465.m9059() <= 0) {
            return s.X(i10, i11, f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4777() {
        if (C0140.m2699() > 0) {
            return zzne.zzap();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢ۟, reason: contains not printable characters */
    public static long m4778(Object obj) {
        if (C0162.m3105() > 0) {
            return ((r) obj).f10331c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4779() {
        return 159 ^ C0123.f149;
    }

    /* JADX INFO: renamed from: ۨۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4780(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4771(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
