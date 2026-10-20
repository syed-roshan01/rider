package g5;

import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.graphics.C0031;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.bundle.C0148;
import d7.C0220;
import fa.C0282;
import g2.C0287;
import i6.C0321;
import java.io.ByteArrayOutputStream;
import k0.b4;
import k0.d2;
import k0.y0;
import k6.f;
import k6.p2;
import k6.t;
import l2.d;
import r7.C0405;
import t2.C0421;
import t7.C0426;

/* JADX INFO: renamed from: g5.ۣۡۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0292 {

    /* JADX INFO: renamed from: ۥۥۨۡ, reason: contains not printable characters */
    public static int f439 = -884;

    /* JADX INFO: renamed from: ۟ۡۡۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m5603(Object obj) {
        if (C0287.m5522() >= 0) {
            return ((p2) obj).f10269b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m5604(Object obj, Object obj2, Object obj3) {
        if (C0220.m4237() > 0) {
            a7.a.t((String) obj, (String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5605() {
        return (-290) ^ C0282.f426;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static int m5606(Object obj) {
        if (C0148.m2838() <= 0) {
            return ((d) obj).f11198a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5608(Object obj, Object obj2) {
        if (C0405.m7934() > 0) {
            return ((zzfi.zzj.zza) obj).zzr((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5609(Object obj) {
        if (C0025.m495() > 0) {
            return ((y0) obj).f9664a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m5610(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static long m5611(Object obj) {
        if (C0321.m6200() > 0) {
            return ((t) obj).f10370f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m5612(Object obj) {
        if (C0127.m2448() >= 0) {
            return ((d2) obj).f8834o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static long m5613() {
        if (C0016.m315() > 0) {
            return l0.c.f11018j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static long m5614() {
        if (C0031.m598() >= 0) {
            return f.y();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۨۥ, reason: not valid java name and contains not printable characters */
    public static long m5615(Object obj) {
        if (C0421.m8263() > 0) {
            return ((b4) obj).f8747b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۢ, reason: not valid java name and contains not printable characters */
    public static String m5616() {
        if (C0426.m8351() < 0) {
            return zzne.zzar();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5617(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m5607(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
