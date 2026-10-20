package r7;

import android.content.Context;
import android.os.BaseBundle;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.tracing.C0204;
import com.google.protobuf.C0209;
import d1.C0211;
import d2.C0215;
import d5.g2;
import d5.i0;
import d9.C0222;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aliasof.C0247;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;
import k0.f2;
import k0.m4;
import k0.q3;
import k6.f5;
import k6.t6;
import k6.x7;
import r5.C0400;
import v6.C0447;
import w6.C0464;
import y.C0475;
import z7.C0488;

/* JADX INFO: renamed from: r7.ۧ۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0404 {

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static int f675 = 806;

    /* JADX INFO: renamed from: ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7925() {
        if (C0116.m2247() > 0) {
            return "quick_setup";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7926(Object obj, float f10, float f11, float f12, float f13) {
        if (C0130.m2511() >= 0) {
            ((k.f) obj).H(f10, f11, f12, f13);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static long m7927(Object obj) {
        if (C0253.m4844() > 0) {
            return ((m4) obj).f9226f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7928(Object obj, Object obj2, boolean z10) {
        if (C0488.m9505() >= 0) {
            return ((BaseBundle) obj).getBoolean((String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m7929(Object obj, Object obj2) {
        if (C0475.m9266() >= 0) {
            return ((Context) obj).checkCallingOrSelfPermission((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m7930(Object obj) {
        if (C0164.m3153() >= 0) {
            return ((zzew.zzf) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۤ, reason: not valid java name and contains not printable characters */
    public static Integer m7931(Object obj) {
        if (C0209.m4013() >= 0) {
            return ((f2) obj).f8923n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m7932(Object obj) {
        if (C0447.m8732() < 0) {
            return ((f0.h) obj).f5729z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7933(Object obj) {
        if (C0464.m9059() <= 0) {
            return ((x7) obj).f10557v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7934() {
        return (-482) ^ C0134.f160;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡ۠, reason: not valid java name and contains not printable characters */
    public static int m7935(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۦ, reason: not valid java name and contains not printable characters */
    public static String m7936(String str) {
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

    /* JADX INFO: renamed from: ۠ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m7938(Object obj, int i10) {
        if (C0215.m4108() < 0) {
            return ((SparseArray) obj).keyAt(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7939(Object obj) {
        if (C0118.m2274() <= 0) {
            return ((i0) obj).f4574t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static y.e m7940() {
        if (C0222.m4279() < 0) {
            return y.k.f16608d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۥ, reason: not valid java name and contains not printable characters */
    public static int m7941(Object obj) {
        if (C0204.m3905() <= 0) {
            return ((t6) obj).f10401e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m7942(Object obj) {
        if (C0211.m4046() > 0) {
            return ((f5) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7943(Object obj) {
        if (C0235.m4538() >= 0) {
            return ((g2) obj).f4530b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۢ, reason: contains not printable characters */
    public static a4.q m7944(Object obj) {
        if (C0403.m7911() < 0) {
            return ((a5.c) obj).f1230a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static long m7945(Object obj) {
        if (C0247.m4732() < 0) {
            return ((q3) obj).f9396c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m7946(Object obj) {
        if (C0400.m7847() < 0) {
            ((Closeable) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7937(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
