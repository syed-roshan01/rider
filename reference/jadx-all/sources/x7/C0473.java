package x7;

import a4.t;
import android.util.Pair;
import android.view.View;
import androidx.compose.ui.layout.C0035;
import b8.C0055;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.tasks.C0106;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import e8.C0266;
import f0.b0;
import g2.a0;
import i.C0317;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k0.e0;
import k0.l0;
import k0.x4;
import k0.z3;
import k6.c7;
import k6.p6;
import k6.p7;
import k6.q6;
import k6.u7;
import k6.x;
import k6.x3;
import m7.C0359;
import o5.C0371;
import s7.C0416;
import t1.C0420;
import x0.C0467;

/* JADX INFO: renamed from: x7.۟ۤۡ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0473 {

    /* JADX INFO: renamed from: ۟ۧۦۦ۠, reason: not valid java name and contains not printable characters */
    public static int f743 = -558;

    /* JADX INFO: renamed from: ۟۟ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static int m9191(Object obj, int i10, Object obj2) {
        if (C0467.m9086() > 0) {
            return x4.g((List) obj, i10, (l0) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static r1.l0 m9192(Object obj) {
        if (C0317.m6120() < 0) {
            return ((z3) obj).f9704c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9193() {
        return (-682) ^ C0472.f742;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۥ, reason: not valid java name and contains not printable characters */
    public static long m9194(Object obj) {
        if (C0420.m8247() >= 0) {
            return ((e0) obj).f8860b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String m9195(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧۢۡ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m9196() {
        if (C0106.m2067() >= 0) {
            return TimeUnit.MILLISECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static q6 m9197(Object obj) {
        if (C0266.m5069() <= 0) {
            return ((p6) obj).f10276c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۢ, reason: not valid java name and contains not printable characters */
    public static u7 m9198(Object obj) {
        if (C0163.m3132() >= 0) {
            return ((p7) obj).M();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static a0 m9199(Object obj) {
        if (C0416.m8144() > 0) {
            return ((b0) obj).f5611d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m9200(Object obj, Object obj2) {
        if (C0035.m690() <= 0) {
            return ((zzfi.zzj.zza) obj).zzb((Iterable<? extends zzfi.zze>) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short m9201(Object obj) {
        if (C0359.m7035() < 0) {
            return ((Short) obj).shortValue();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static double m9202(double d10) {
        return C0055.m1056() > 0 ? Math.log(d10) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static Pair m9203(Object obj, Object obj2) {
        if (C0371.m7269() > 0) {
            return ((c7) obj).t((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m9204(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m9205(Object obj) {
        if (C0142.m2725() > 0) {
            return ((g5.a) obj).f6614b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۨ, reason: contains not printable characters */
    public static String m9206() {
        if (C0132.m2543() <= 0) {
            return "⚠ Note: Ola & Uber require Shizuku mode for auto-accepting. Please setup Shizuku in Settings tab.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m9208(Object obj, Object obj2) {
        if (C0111.m2143() >= 0) {
            return ((t) obj).c((View) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۤۤ, reason: not valid java name and contains not printable characters */
    public static x3 m9209() {
        if (C0189.m3621() >= 0) {
            return x.T;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡۦ, reason: contains not printable characters */
    public static String m9207(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
