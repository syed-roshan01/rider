package b4;

import a2.C0004;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import b.C0049;
import b2.v;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.messaging.ktx.C0186;
import d5.n1;
import h6.C0310;
import java.io.ByteArrayOutputStream;
import k0.c3;
import k0.h4;
import k0.j3;
import k6.k;
import m0.q2;
import m7.C0358;
import o8.C0372;
import okhttp3.internal.publicsuffix.C0373;
import r6.C0402;
import u.C0429;
import x7.C0472;

/* JADX INFO: renamed from: b4.ۦۣۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0052 {

    /* JADX INFO: renamed from: ۣۣ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int f72 = 929;

    /* JADX INFO: renamed from: ۟۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1008() {
        if (C0310.m5971() < 0) {
            return " AND (retry_count IS NULL OR retry_count < 2147483647)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1009(Object obj) {
        if (C0372.m7283() >= 0) {
            return ((n1) obj).f4704f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1010(Object obj, Object obj2) {
        if (C0402.m7881() < 0) {
            return ((q2) obj).c((m0.c) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1011(Object obj) {
        if (C0186.m3548() <= 0) {
            return ((z7.b) obj).f17321a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m1012(Object obj, Object obj2, int i10) {
        if (C0429.m8409() < 0) {
            ((Parcelable) obj).writeToParcel((Parcel) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m1013() {
        return (-485) ^ C0004.f1062;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m1014(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m1015(String str) {
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

    /* JADX INFO: renamed from: ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static o8.c m1016(Object obj) {
        if (C0358.m7001() <= 0) {
            return ((k) obj).f10146e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢ, reason: contains not printable characters */
    public static String m1018() {
        if (C0373.m7309() <= 0) {
            return "Database error";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m1019(Object obj) {
        if (C0049.m945() >= 0) {
            return ((c3) obj).f8796e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Layout m1020(Object obj) {
        if (C0109.m2116() < 0) {
            return ((v) obj).f2578d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m1021(Object obj) {
        if (C0472.m9190() <= 0) {
            return ((h4) obj).f8987f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1022(Object obj) {
        if (C0101.m1975() > 0) {
            return ((j3) obj).f9074a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۣۡ, reason: contains not printable characters */
    public static String m1017(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
