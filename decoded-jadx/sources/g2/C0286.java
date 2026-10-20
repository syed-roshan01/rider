package g2;

import androidx.core.content.C0041;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.inject.C0172;
import com.google.firebase.remoteconfig.internal.C0195;
import d5.e1;
import d5.x1;
import f4.C0274;
import f6.C0277;
import g5.C0290;
import i4.C0317;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.util.List;
import k.C0331;
import k0.w2;
import k6.p7;
import m0.g1;
import m0.q2;
import m0.z1;

/* JADX INFO: renamed from: g2.۟۠ۡۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0286 {

    /* JADX INFO: renamed from: ۧۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int f431 = 356;

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5510(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5511(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m5512(Object obj, Object obj2, Object obj3) {
        if (C0195.m3737() < 0) {
            return ((w2) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m5513() {
        if (C0041.m812() >= 0) {
            return "Error storing complex main event. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static u0.b m5514() {
        if (C0172.m3296() >= 0) {
            return d5.n.f4680a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۥ, reason: not valid java name and contains not printable characters */
    public static String m5515() {
        if (C0274.m5286() < 0) {
            return "Error deleting user property. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static List m5517(Object obj) {
        if (C0331.m6408() < 0) {
            return ((x1) obj).f4847c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m5518(Object obj) {
        if (C0164.m3153() >= 0) {
            return ((z1) obj).f11770b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5519(Object obj) throws MalformedURLException {
        if (C0277.m5361() < 0) {
            ((p7) obj).P();
        }
    }

    /* JADX INFO: renamed from: ۦۥۧ۠, reason: contains not printable characters */
    public static g1 m5520(Object obj) {
        if (C0290.m5589() < 0) {
            return ((e1) obj).f4473c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m5521(Object obj, int i10) {
        if (C0317.m6144() <= 0) {
            ((q2) obj).r(i10);
        }
    }

    /* JADX INFO: renamed from: ۨۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5522() {
        return (-541) ^ C0323.f471;
    }

    /* JADX INFO: renamed from: ۡۡۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5516(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
