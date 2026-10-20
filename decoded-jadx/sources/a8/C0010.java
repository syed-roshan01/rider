package a8;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.C0013;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.installations.interop.C0174;
import d1.d;
import d5.f2;
import e1.C0258;
import f4.C0275;
import g.C0284;
import java.io.ByteArrayOutputStream;
import java.security.cert.X509Certificate;
import java.util.concurrent.FutureTask;
import javax.security.auth.x500.X500Principal;
import k0.c;
import m0.m;
import u7.C0437;
import w1.C0455;
import y.f;
import y.k;
import y6.C0476;
import z7.C0489;

/* JADX INFO: renamed from: a8.ۡۦۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0010 {

    /* JADX INFO: renamed from: ۧۡۦۡ, reason: not valid java name and contains not printable characters */
    public static int f30 = 881;

    /* JADX INFO: renamed from: ۟۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static long m194() {
        if (C0258.m4939() < 0) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m195(Object obj, Object obj2) {
        if (C0437.m8543() > 0) {
            return ((BaseBundle) obj).get((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۧ, reason: not valid java name and contains not printable characters */
    public static String m196() {
        if (C0476.m9298() <= 0) {
            return "Service Control";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static f m197() {
        if (C0174.m3323() <= 0) {
            return k.f16610f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static Uri m198(Object obj) {
        if (C0489.m9528() > 0) {
            return ((Uri.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m199() {
        return 497 ^ C0284.f429;
    }

    /* JADX INFO: renamed from: ۣۥۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m200(Object obj) {
        if (C0013.m253() >= 0) {
            return ((f2) obj).f4494c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static int m201(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۨ۟, reason: contains not printable characters */
    public static Object m202(Object obj) {
        if (C0476.m9298() <= 0) {
            return ((FutureTask) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۢ, reason: contains not printable characters */
    public static void m203(Object obj, Object obj2, int i10) {
        if (C0455.m8885() <= 0) {
            ((c) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۦۨۨ۠, reason: contains not printable characters */
    public static String m204(String str) {
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

    /* JADX INFO: renamed from: ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m205(Object obj) {
        if (C0101.m1975() > 0) {
            return ((d) obj).f4333b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static X500Principal m207(Object obj) {
        if (C0275.m5308() >= 0) {
            return ((X509Certificate) obj).getSubjectX500Principal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m206(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
