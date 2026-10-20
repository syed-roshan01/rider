package q1;

import android.content.SharedPreferences;
import android.os.Parcel;
import androidx.profileinstaller.C0046;
import c9.e;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0153;
import d7.t;
import e1.C0258;
import f0.C0273;
import f0.b1;
import fa.C0282;
import g5.C0292;
import g9.C0295;
import h5.C0308;
import java.io.ByteArrayOutputStream;
import java.util.EnumMap;
import k0.g0;
import k0.p1;
import k6.k;
import k6.p7;
import k6.x7;
import m0.m;
import m9.d0;
import m9.x1;
import n9.d;
import o5.C0371;
import p0.C0375;
import p8.C0381;
import r9.C0406;
import u3.C0435;
import v.k3;
import v.p0;
import w0.i;

/* JADX INFO: renamed from: q1.۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0384 {

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int f654 = -54;

    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m7505(Object obj) {
        if (C0295.m5663() >= 0) {
            return ((g0) obj).f8937b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m7506(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7507(Object obj) {
        if (C0371.m7269() > 0) {
            return ((b1) obj).f5614b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۧ, reason: not valid java name and contains not printable characters */
    public static x1 m7508(Object obj, Object obj2, int i10, Object obj3, int i11) {
        if (C0140.m2699() > 0) {
            return z6.a.Q((d0) obj, (d) obj2, i10, (e) obj3, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m7509(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7510(Object obj) {
        if (C0046.m893() > 0) {
            return ((x7) obj).J;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7511(Object obj) {
        if (C0308.m5935() >= 0) {
            return ((p7) obj).f10299n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn m7512(Object obj, int i10) {
        if (C0406.m7952() < 0) {
            return ((zzfi.zzj.zza) obj).zzj(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7513(boolean z10, Object obj, Object obj2, int i10, int i11) {
        if (C0282.m5443() <= 0) {
            t.a(z10, (c9.a) obj, (m) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m7514(Object obj, Object obj2) {
        if (C0375.m7350() <= 0) {
            return ((EnumMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static Appendable m7515(Object obj, char c10) {
        if (C0116.m2247() > 0) {
            return ((StringBuilder) obj).append(c10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m7516(Object obj) {
        if (C0435.m8498() < 0) {
            ((k) obj).h0();
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static p0 m7517() {
        if (C0150.m2892() <= 0) {
            return k3.f15663a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۦ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m7519(Object obj, Object obj2, Object obj3) {
        if (C0153.m2938() <= 0) {
            return ((SharedPreferences.Editor) obj).putString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static e m7520(Object obj) {
        if (C0381.m7467() >= 0) {
            return ((p1) obj).f9340n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۤ, reason: contains not printable characters */
    public static Parcel m7521() {
        if (C0273.m5249() < 0) {
            return Parcel.obtain();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m7522(Object obj) {
        if (C0258.m4918() > 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m7523() {
        return 644 ^ C0123.f149;
    }

    /* JADX INFO: renamed from: ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static i m7524(Object obj) {
        if (C0292.m5605() < 0) {
            return ((i) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7518(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
