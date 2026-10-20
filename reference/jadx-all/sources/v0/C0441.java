package v0;

import a5.t;
import android.os.Bundle;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.measurement_impl.C0185;
import d5.C0219;
import d5.h1;
import d5.u;
import e1.r;
import e2.C0264;
import f5.g0;
import fa.C0282;
import g7.C0293;
import h3.C0304;
import h7.C0313;
import java.io.ByteArrayOutputStream;
import k6.e6;
import k6.h7;
import k6.k4;
import k7.C0338;
import m9.C0360;
import p8.C0380;
import r2.C0398;
import s8.C0418;
import z.C0481;

/* JADX INFO: renamed from: v0.ۣ۟۟ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0441 {

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static int f711 = -882;

    /* JADX INFO: renamed from: ۟۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8587(Object obj) {
        if (C0185.m3538() >= 0) {
            return ((zzfi.zzj) obj).zzbg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8588(Object obj) {
        if (C0398.m7764() < 0) {
            return ((k6.e) obj).f9991e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m8589(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m8590() {
        if (C0338.m6638() < 0) {
            return "Loaded invalid unknown value type, ignoring it";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m8591(Object obj) {
        if (C0118.m2274() < 0) {
            return ((g0) obj).f6272u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m8592(Object obj) {
        if (C0293.m5634() < 0) {
            return ((t) obj).f1304a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤ۟, reason: not valid java name and contains not printable characters */
    public static void m8593(Object obj, Object obj2, Object obj3, Object obj4, long j10) {
        if (C0313.m6046() > 0) {
            ((zzda) obj).zza((String) obj2, (String) obj3, (Bundle) obj4, j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8594(Object obj) {
        if (C0380.m7433() > 0) {
            return ((k4) obj).f10153c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8595(Object obj) {
        if (C0360.m7059() <= 0) {
            return ((e6) obj).f10008e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8596(long j10) {
        if (C0481.m9354() <= 0) {
            return r.i(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m8597() {
        return 437 ^ C0282.f426;
    }

    /* JADX INFO: renamed from: ۣۡۥۥ, reason: not valid java name and contains not printable characters */
    public static long m8599(Object obj) {
        if (C0304.m5859() < 0) {
            return ((k6.l) obj).f10162c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m8600(Object obj) {
        if (C0111.m2143() >= 0) {
            return ((h1) obj).f4542a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m8601(Object obj) {
        if (C0418.m8208() > 0) {
            return ((u) obj).f4788d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m8602(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static d5.m m8603() {
        if (C0304.m5859() <= 0) {
            return d5.m.f4665u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m8604(Object obj) {
        if (C0264.m5033() <= 0) {
            return ((h7) obj).f10090a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m8605(Object obj) {
        if (C0219.m4224() <= 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8598(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
