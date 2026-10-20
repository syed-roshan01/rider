package w2;

import a.C0001;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.abt.C0112;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.ktx.C0179;
import com.google.firebase.remoteconfiginterop.C0202;
import e7.C0264;
import f0.t1;
import f5.j;
import h4.C0304;
import ia.C0322;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import k0.x3;
import k6.z4;
import l8.C0346;
import m9.e0;
import o1.u;
import u.p2;
import u8.e;
import w1.C0455;
import x.m;
import y0.g;
import y0.o;
import y6.C0477;

/* JADX INFO: renamed from: w2.۟ۧۥۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0456 {

    /* JADX INFO: renamed from: ۥۥ۟۠, reason: contains not printable characters */
    public static int f727 = 706;

    /* JADX INFO: renamed from: ۟ۢۦۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8886(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static long m8887(Object obj) {
        if (C0264.m5062() < 0) {
            return ((x3) obj).f9652f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static long m8888(Object obj, boolean z10) {
        if (C0455.m8885() <= 0) {
            return e0.I((u) obj, z10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۧ, reason: not valid java name and contains not printable characters */
    public static g m8889() {
        if (C0346.m6774() >= 0) {
            return y0.a.f16708a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m8890() {
        return 446 ^ C0304.f452;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۧ, reason: not valid java name and contains not printable characters */
    public static e m8891(Object obj, Object obj2, Object obj3) {
        if (C0202.m3868() >= 0) {
            return ((j) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤۥ, reason: not valid java name and contains not printable characters */
    public static o m8892(Object obj, Object obj2) {
        if (C0112.m2176() > 0) {
            return androidx.compose.foundation.a.n((o) obj, (p2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static List m8893(Object obj) {
        if (C0001.m35() <= 0) {
            return ((zzew.zza) obj).zzf();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static AtomicLong m8894() {
        if (C0477.m9312() <= 0) {
            return z4.f10605k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m8895(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static m m8896(Object obj) {
        if (C0147.m2805() < 0) {
            return ((t1) obj).f5945e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8897() {
        if (C0322.m6244() > 0) {
            return zzne.zzal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۦ, reason: not valid java name and contains not printable characters */
    public static String m8899(Object obj) {
        if (C0179.m3417() >= 0) {
            return ((AppConfig) obj).getPaymentUpiId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static String m8898(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
