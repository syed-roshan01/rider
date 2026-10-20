package l3;

import androidx.core.app.C0040;
import androidx.lifecycle.C0043;
import b3.C0051;
import c1.C0058;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.firestore.ktx.C0156;
import d5.b0;
import d5.n0;
import dagger.hilt.internal.C0253;
import f0.C0272;
import f0.t0;
import g2.a0;
import g9.C0295;
import h5.C0309;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import k0.q2;
import k6.c5;
import k6.p7;
import k6.x;
import k6.x3;
import k6.z4;
import m0.g1;
import m5.C0355;
import p7.C0379;
import r2.C0398;
import s4.j;
import s6.C0414;
import w9.C0466;
import z.C0481;
import z3.C0486;

/* JADX INFO: renamed from: l3.ۥۣۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0343 {

    /* JADX INFO: renamed from: ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int f613 = 57;

    /* JADX INFO: renamed from: ۟۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m6707(Object obj) {
        if (C0466.m9068() < 0) {
            return ((b0) obj).f4407c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static g1 m6708(Object obj) {
        if (C0481.m9354() < 0) {
            return ((n0) obj).f4695e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6709(Object obj) {
        if (C0398.m7764() < 0) {
            return ((t0) obj).f5940a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6710(Object obj) {
        if (C0355.m6953() < 0) {
            return ((p7) obj).f10306u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m6711(Object obj) {
        if (C0156.m2976() >= 0) {
            return ((j) obj).f13996b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m6712(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static e0.a m6713(Object obj) {
        if (C0379.m7420() >= 0) {
            return ((q2) obj).f9393e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ۠, reason: not valid java name and contains not printable characters */
    public static float m6714(float f10) {
        if (C0043.m833() >= 0) {
            return Math.abs(f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۨ, reason: not valid java name and contains not printable characters */
    public static zzew.zze m6716(Object obj, int i10) {
        if (C0253.m4832() < 0) {
            return ((zzew.zza.C0093zza) obj).zzb(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static x3 m6717() {
        if (C0486.m9449() <= 0) {
            return x.W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static a0 m6718(Object obj, Object obj2) {
        if (C0051.m992() > 0) {
            return ((g2.j) obj).a((List) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static void m6719(Object obj, Object obj2) {
        if (C0058.m1106() > 0) {
            ((z4) obj).u((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6720() {
        return (-453) ^ C0295.f442;
    }

    /* JADX INFO: renamed from: ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static long m6721(int i10, int i11, int i12, int i13) {
        if (C0309.m5962() >= 0) {
            return m2.a.a(i10, i11, i12, i13);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static BlockingQueue m6722(Object obj) {
        if (C0272.m5222() <= 0) {
            return ((c5) obj).f9934b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6723() {
        if (C0414.m8107() < 0) {
            return "referrer API v2";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6724() {
        if (C0040.m792() >= 0) {
            return "last_bundle_start_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static int m6725(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m6715(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
