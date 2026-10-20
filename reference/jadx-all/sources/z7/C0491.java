package z7;

import android.os.BaseBundle;
import android.util.Base64;
import android.util.Pair;
import androidx.startup.C0047;
import b.C0049;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.components.C0135;
import com.google.firebase.messaging.reporting.C0190;
import com.google.protobuf.v;
import d1.C0212;
import f5.r;
import h8.C0315;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;
import k0.l1;
import k0.w3;
import k6.t7;
import k6.x7;
import l6.C0345;
import m5.C0355;
import r6.C0402;
import u.C0429;
import y.f;
import y.k;

/* JADX INFO: renamed from: z7.۠ۡ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0491 {

    /* JADX INFO: renamed from: ۟ۧۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int f764 = 822;

    /* JADX INFO: renamed from: ۟۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9541(Object obj) {
        if (C0315.m6079() >= 0) {
            return ((t7) obj).f10403a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m9542(Object obj) {
        if (C0081.m1735() > 0) {
            return ((AtomicReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static long m9543(Object obj) {
        if (C0429.m8409() < 0) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static Pair m9544(Object obj, Object obj2) {
        if (C0190.m3639() >= 0) {
            return Pair.create(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m9545(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static f m9546() {
        if (C0212.m4046() > 0) {
            return k.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static c9.a m9547(Object obj) {
        if (C0402.m7881() < 0) {
            return ((w3) obj).f9617f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9548(Object obj, int i10, int i11) {
        if (C0355.m6953() < 0) {
            ((v) obj).G0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m9549(Object obj) {
        if (C0085.m1825() > 0) {
            return ((x7) obj).H;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m9550(Object obj) {
        if (C0049.m945() >= 0) {
            return ((r) obj).f6314a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m9551(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m9552() {
        return 387 ^ C0345.f615;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m9553(Object obj, int i10) {
        if (C0135.m2608() < 0) {
            return Base64.decode((String) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static long m9554(Object obj) {
        if (C0109.m2116() < 0) {
            return ((zzdd) obj).zza;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۢۧۥ, reason: contains not printable characters */
    public static void m9555(Object obj, Object obj2, long j10) {
        if (C0047.m904() <= 0) {
            ((BaseBundle) obj).putLong((String) obj2, j10);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m9557(Object obj) {
        if (C0135.m2608() <= 0) {
            return ((l1) obj).f9154c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m9556(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
