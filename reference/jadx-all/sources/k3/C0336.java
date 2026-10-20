package k3;

import a.C0001;
import a0.C0003;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.input.pointer.C0034;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.messaging.C0192;
import d9.C0223;
import e1.C0258;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import k0.b0;
import k0.d2;
import k0.i0;
import k6.d4;
import k6.f4;
import k6.p7;
import k6.v;
import k6.x;
import k6.x3;
import k6.x7;
import m7.C0359;
import q1.C0384;
import s8.C0417;
import v5.C0446;
import x.l;
import z8.C0493;

/* JADX INFO: renamed from: k3.ۦ۠ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0336 {

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int f519 = 313;

    /* JADX INFO: renamed from: ۟۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m6496(Object obj) {
        if (C0223.m4279() < 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m6497(Object obj, int i10) {
        if (C0446.m8692() <= 0) {
            ((HttpURLConnection) obj).setFixedLengthStreamingMode(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static f4 m6498(Object obj) {
        if (C0417.m8173() <= 0) {
            return ((d4) obj).f9965g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static x3 m6499() {
        if (C0359.m7035() < 0) {
            return x.f10509t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int m6500() {
        return 1015 ^ C0003.f881;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m6501(Object obj, Object obj2) {
        if (C0493.m9578() > 0) {
            d7.a.l(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6502(Object obj, Object obj2, Object obj3) {
        if (C0021.m417() > 0) {
            ((zzb) obj).zza((String) obj2, (Callable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۡۧ۠, reason: not valid java name and contains not printable characters */
    public static long m6503(Object obj) {
        if (C0034.m667() >= 0) {
            return ((i0) obj).f9012p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int m6504(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static long m6505(Object obj) {
        if (C0001.m35() < 0) {
            return ((zzfi.zze) obj).zzd();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m6506(Object obj, long j10, Object obj2) {
        if (C0258.m4918() >= 0) {
            return ((FutureTask) obj).get(j10, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m6507(Object obj) {
        if (C0192.m3659() >= 0) {
            ((MainViewModel) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۤۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6508(Object obj) {
        if (C0120.m2311() <= 0) {
            return ((d2) obj).f8827a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static String m6509(String str) {
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

    /* JADX INFO: renamed from: ۥۤ۠, reason: contains not printable characters */
    public static l m6510(Object obj) {
        if (C0331.m6374() > 0) {
            return ((b0) obj).f8726b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۨ, reason: contains not printable characters */
    public static void m6511(Object obj, Object obj2, Object obj3) {
        if (C0384.m7523() < 0) {
            ((p7) obj).n((v) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۡۢ, reason: contains not printable characters */
    public static String m6512(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
