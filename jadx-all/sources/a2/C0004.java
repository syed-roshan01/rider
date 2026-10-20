package a2;

import a.C0001;
import aa.C0011;
import androidx.activity.C0017;
import c1.C0060;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.remoteconfig.interop.C0197;
import d4.C0218;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import f0.c1;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import k.C0332;
import k3.C0336;
import k6.a5;
import k6.b7;
import k6.h5;
import k6.m4;
import k6.t4;
import k6.z4;
import t2.C0422;
import x7.C0472;

/* JADX INFO: renamed from: a2.۟ۡۥۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0004 {

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: collision with root package name */
    public static int f1062 = -224;

    /* JADX INFO: renamed from: ۟ۡۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m73(Object obj, Object obj2) {
        if (C0336.m6500() <= 0) {
            ((z4) obj).v((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static Callable m74(Object obj, Object obj2) {
        if (C0081.m1735() >= 0) {
            return ((zzcm) obj).zza((Callable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m75(Object obj) {
        if (C0472.m9190() <= 0) {
            return ((k0.p) obj).f9328c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m76() {
        return 670 ^ C0124.f150;
    }

    /* JADX INFO: renamed from: ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static g2.a0 m77(Object obj) {
        if (C0197.m3786() < 0) {
            return ((f0.x) obj).f5993e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m78(Object obj) {
        if (C0332.m6408() < 0) {
            return ((c1) obj).f5633a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m79(Object obj) {
        if (C0218.m4144() > 0) {
            return ((f5.n) obj).f6302a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m80(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m81(Object obj) {
        if (C0167.m3200() > 0) {
            return ((zzfi.zzg.zza) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m82(Object obj, Object obj2, Object obj3) {
        if (C0017.m332() < 0) {
            ((t4) obj).x((String) obj2, (zzfc.zzd) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m83(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۦ۟۠, reason: not valid java name and contains not printable characters */
    public static Object m84(Object obj) {
        if (C0135.m2608() < 0) {
            return ((q8.f) obj).f13225a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m85(int i10) {
        if (C0162.m3105() > 0) {
            return com.google.crypto.tink.shaded.protobuf.p.A0(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static List m86(Object obj) {
        if (C0422.m8278() <= 0) {
            return ((zzew.zzb) obj).zzg();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m87(Object obj) {
        if (C0060.m1148() > 0) {
            return ((a5) obj).J;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۤۧۢ, reason: not valid java name and contains not printable characters */
    public static long m88() {
        if (C0137.m2646() <= 0) {
            return l0.c.f11010b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۡ, reason: contains not printable characters */
    public static boolean m90(Object obj) {
        if (C0001.m35() < 0) {
            return ((m4) obj).f10202b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۦ, reason: contains not printable characters */
    public static x.o m91(Object obj) {
        if (C0161.m3081() <= 0) {
            return ((x.n) obj).f16278a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۨۦ, reason: contains not printable characters */
    public static String m92(Object obj) {
        if (C0231.m4440() > 0) {
            return ((b7) obj).f9918a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m93(Object obj, Object obj2, Object obj3) {
        if (C0011.m208() <= 0) {
            return ((h5) obj).k((k6.v) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟۟, reason: contains not printable characters */
    public static String m89(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
