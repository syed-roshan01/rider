package v7;

import android.os.Build;
import c4.C0066;
import c7.C0069;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.protobuf.n;
import d9.C0224;
import f4.C0277;
import h5.C0309;
import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import k0.i3;
import k6.t5;
import k6.t7;
import k6.w4;
import m0.m;
import m9.e0;
import p3.C0376;
import p7.C0379;
import r4.C0399;
import s3.C0413;
import w0.i;
import w0.p;
import y0.o;

/* JADX INFO: renamed from: v7.ۢ۟ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0449 {

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f719 = -829;

    /* JADX INFO: renamed from: ۟ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static long m8735(Object obj) {
        if (C0413.m8089() <= 0) {
            return ((i3) obj).f9036f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m8736(Object obj) {
        if (C0090.m1920() > 0) {
            return ((zzew.zze) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m8737(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8738() {
        return 691 ^ C0069.f89;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8739(Object obj) {
        if (C0066.m1277() > 0) {
            return e0.y((m) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8740() {
        if (C0399.m7797() <= 0) {
            return Build.VERSION.RELEASE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8741() {
        if (C0309.m5962() > 0) {
            return "Marathi";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static String[] m8742() {
        if (C0110.m2123() < 0) {
            return t5.f10391a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۢ, reason: not valid java name and contains not printable characters */
    public static o m8743(Object obj, Object obj2) {
        if (C0224.m4304() < 0) {
            return ((o) obj).j((o) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static Long m8744(Object obj) {
        if (C0277.m5315() < 0) {
            return ((t7) obj).f10406d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static i m8746(Object obj, Object obj2, boolean z10) {
        if (C0085.m1825() >= 0) {
            return p.g((i) obj, (c9.c) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8747(Object obj, Object obj2) {
        if (C0376.m7362() > 0) {
            ((w4) obj).f((n) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8748(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۦۦۧ, reason: not valid java name and contains not printable characters */
    public static long m8749() {
        if (C0379.m7420() > 0) {
            return l0.c.f11011c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m8750(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        if (C0086.m1846() > 0) {
            return ((u0.b) obj).a(obj2, obj3, obj4, obj5, obj6, (m) obj7, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟۟, reason: not valid java name and contains not printable characters */
    public static Level m8751() {
        if (C0091.m1940() < 0) {
            return Level.FINE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8745(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
