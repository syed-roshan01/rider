package q7;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.ktx.C0175;
import d1.C0215;
import dagger.hilt.internal.generatesrootinput.C0251;
import e1.C0259;
import ea.C0268;
import f0.e0;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import k0.m4;
import k0.q;
import k0.q0;
import k4.C0337;
import k6.d4;
import k6.p7;
import k6.q7;
import m0.m3;
import m7.C0358;
import u.m1;
import u1.C0432;
import x2.C0468;
import y9.C0480;

/* JADX INFO: renamed from: q7.۟ۢۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0390 {

    /* JADX INFO: renamed from: ۣۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int f660 = 199;

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static m3 m7619() {
        if (C0268.m5113() < 0) {
            return m1.f14851a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m7620(Object obj) {
        if (C0480.m9346() >= 0) {
            return ((q) obj).f9371q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static int m7621(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m7622(float f10, float f11) {
        if (C0251.m4793() >= 0) {
            return z6.a.o(f10, f11);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7623(Object obj) {
        if (C0170.m3247() <= 0) {
            return ((e0) obj).f5679f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m7624(Object obj) {
        if (C0337.m6515() <= 0) {
            c1.q.a((c1.q) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7625(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Bitmap.CompressFormat m7626() {
        if (C0215.m4096() > 0) {
            return Bitmap.CompressFormat.JPEG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۦ, reason: not valid java name and contains not printable characters */
    public static int m7627() {
        return 173 ^ C0432.f702;
    }

    /* JADX INFO: renamed from: ۠ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static q7 m7628(Object obj) {
        if (C0175.m3346() > 0) {
            return ((p7) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7629(Object obj, Object obj2) {
        if (C0259.m4939() <= 0) {
            f6.a.m0((d4) obj, (SQLiteDatabase) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static long m7630(Object obj) {
        if (C0358.m7001() <= 0) {
            return ((m4) obj).f9241u;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m7632() {
        if (C0305.m5882() <= 0) {
            return "Error selecting default event parameters";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۨ, reason: not valid java name and contains not printable characters */
    public static u0.b m7633() {
        if (C0468.m9101() < 0) {
            return q0.f9372a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static String m7631(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
