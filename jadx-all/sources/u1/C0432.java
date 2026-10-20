package u1;

import a.C0002;
import androidx.compose.foundation.C0026;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.iid.C0170;
import h3.C0303;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import k6.t4;
import t0.C0419;
import u4.C0437;
import x2.C0468;
import z8.C0493;

/* JADX INFO: renamed from: u1.۟ۧۥۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0432 {

    /* JADX INFO: renamed from: ۟ۥ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f702 = -216;

    /* JADX INFO: renamed from: ۟۟ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8441(Object obj, Object obj2) {
        if (C0002.m46() <= 0) {
            return ((Collection) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8442(Object obj, Object obj2) {
        if (C0437.m8524() <= 0) {
            return ((t4) obj).F((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۢ, reason: not valid java name and contains not printable characters */
    public static int m8443(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m8444(Object obj) {
        if (C0026.m508() > 0) {
            return ((d5.x) obj).f4833b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8445(Object obj) {
        if (C0419.m8221() >= 0) {
            return ((m0.q2) obj).f11675k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۥۣ, reason: not valid java name and contains not printable characters */
    public static t.j0 m8446() {
        if (C0468.m9101() <= 0) {
            return f0.n1.f5827a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m8447() {
        return 794 ^ C0493.f766;
    }

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static String m8448(String str) {
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

    /* JADX INFO: renamed from: ۤۤۧۤ, reason: not valid java name and contains not printable characters */
    public static long m8449(Object obj) {
        if (C0075.m1631() <= 0) {
            return ((d1.f) obj).f4347a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۡۦۡ, reason: contains not printable characters */
    public static Object m8450(Object obj) {
        if (C0070.m1363() >= 0) {
            return ((f5.g0) obj).f6261c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m8451(long j10) {
        if (C0170.m3247() <= 0) {
            return m2.a.h(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۥۢ, reason: not valid java name and contains not printable characters */
    public static zzew.zzd m8453(Object obj) {
        if (C0303.m5836() >= 0) {
            return ((zzew.zzc) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m8452(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
