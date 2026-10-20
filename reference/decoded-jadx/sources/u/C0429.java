package u;

import androidx.compose.ui.draw.C0027;
import androidx.lifecycle.C0043;
import c3.C0062;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0165;
import d1.C0211;
import e0.C0256;
import h8.C0313;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import k6.t7;
import k6.x7;
import k6.y3;
import l8.C0346;

/* JADX INFO: renamed from: u.ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0429 {

    /* JADX INFO: renamed from: ۠ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int f700 = 328;

    /* JADX INFO: renamed from: ۟۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8410(Object obj, Object obj2, Object obj3) {
        if (C0324.m6278() < 0) {
            ((y3) obj).l((k6.e) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8411(Object obj) {
        if (C0165.m3154() < 0) {
            return ((f0.h) obj).f5721r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static androidx.concurrent.futures.o m8412() {
        if (C0027.m541() > 0) {
            return y3.k.f16915a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8413(Object obj) {
        if (C0256.m4901() <= 0) {
            return ((k0.d2) obj).f8833n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8414(Object obj, Object obj2) {
        if (C0346.m6774() >= 0) {
            h6.g.e((Closeable) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8415() {
        return 227 ^ C0043.f63;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m8417(Object obj, Object obj2, Object obj3, int i10) {
        if (C0151.m2903() > 0) {
            ((d5.f0) obj).a((y.a1) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static int m8418(Object obj) {
        if (C0211.m4046() > 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static long m8419(Object obj) {
        if (C0159.m3030() <= 0) {
            return ((e1.k0) obj).f5039a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8420() {
        if (C0313.m6072() <= 0) {
            return zzoo.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۨۡ, reason: not valid java name and contains not printable characters */
    public static long m8421(Object obj) {
        if (C0062.m1186() > 0) {
            return ((t7) obj).f10405c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8422(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۡۦۦ, reason: contains not printable characters */
    public static String m8423(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m8416(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
