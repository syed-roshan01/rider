package r6;

import androidx.compose.ui.node.C0037;
import c7.C0068;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.model.C0161;
import dagger.hilt.android.migration.C0239;
import f0.C0272;
import f0.s1;
import h.C0296;
import h6.C0309;
import java.io.ByteArrayOutputStream;
import k0.b3;
import k0.c4;
import k3.C0334;
import k6.k4;
import k6.p7;
import k6.t4;
import k6.x3;
import l6.C0344;
import p4.C0376;
import t2.C0422;
import v0.C0440;
import v7.C0449;

/* JADX INFO: renamed from: r6.ۥۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0402 {

    /* JADX INFO: renamed from: ۟ۥ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f673 = 776;

    /* JADX INFO: renamed from: ۟۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static float m7882(Object obj) {
        if (C0143.m2751() > 0) {
            return ((l2.p) obj).f11220a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m7883(Object obj) {
        if (C0068.m1322() > 0) {
            return ((b3) obj).f8738a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static zzfc.zza m7884(Object obj, Object obj2) {
        if (C0087.m1852() >= 0) {
            return ((t4) obj).A((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m7885() {
        if (C0440.m8597() > 0) {
            return "Shizuku app is not installed. Required for Ola & Uber.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m7886() {
        if (C0309.m5971() <= 0) {
            return "Error deleting over the limit events. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7887(Object obj) {
        if (C0376.m7371() > 0) {
            return ((g5.a) obj).f6613a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m7888(Object obj) {
        if (C0037.m733() >= 0) {
            return ((s1) obj).f5895a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۣ, reason: not valid java name and contains not printable characters */
    public static zzfc.zzc m7889(Object obj, int i10) {
        if (C0296.m5709() < 0) {
            return ((zzfc.zzd.zza) obj).zza(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۧ, reason: not valid java name and contains not printable characters */
    public static x3 m7890() {
        if (C0129.m2492() >= 0) {
            return k6.x.J0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static k4 m7891(Object obj) {
        if (C0422.m8294() > 0) {
            return ((p7) obj).f10289d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7892(Object obj, Object obj2, Object obj3) {
        if (C0239.m4596() >= 0) {
            return ((k6.f) obj).u((String) obj2, (x3) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7893(Object obj) {
        if (C0103.m2022() >= 0) {
            return ((f5.f0) obj).f6256b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m7895(String str) {
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

    /* JADX INFO: renamed from: ۢ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m7896(Object obj) {
        if (C0272.m5249() <= 0) {
            ((p7) obj).u();
        }
    }

    /* JADX INFO: renamed from: ۣۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m7897() {
        return 779 ^ C0344.f615;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7898(boolean z10, Object obj, Object obj2, boolean z11, long j10, long j11, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        if (C0334.m6491() > 0) {
            c4.a(z10, (c9.a) obj, (y0.o) obj2, z11, j10, j11, (x.m) obj3, (c9.f) obj4, (m0.m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7899(double d10) {
        if (C0449.m8755() > 0) {
            return Double.isNaN(d10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static x3 m7900() {
        if (C0130.m2511() > 0) {
            return k6.x.O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۧ, reason: contains not printable characters */
    public static int m7901(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m7902(Object obj) {
        if (C0161.m3081() < 0) {
            return ((zzdd) obj).zze;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7894(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
