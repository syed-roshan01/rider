package j2;

import a.C0002;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.compose.ui.graphics.C0032;
import b3.C0051;
import ca.C0070;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.ktx.C0179;
import d2.C0216;
import d5.d;
import d5.q1;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import f0.a0;
import f0.a1;
import f0.z0;
import g7.C0293;
import g9.C0295;
import h8.k;
import i.C0317;
import java.io.ByteArrayOutputStream;
import k0.b3;
import k0.d5;
import k0.y2;
import k6.a5;
import k6.t5;
import l0.g;
import m0.g1;
import p7.C0379;
import s0.C0411;
import u.C0429;
import w.C0454;
import w2.C0458;
import w6.C0465;

/* JADX INFO: renamed from: j2.۠ۤۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0324 {

    /* JADX INFO: renamed from: ۣ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f471 = -982;

    /* JADX INFO: renamed from: ۟۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m6249() {
        if (C0293.m5634() <= 0) {
            return "Filter by Drop Location";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6251(Object obj) {
        if (C0295.m5663() >= 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static int m6252(Object obj) {
        if (C0454.m8831() <= 0) {
            return ((y2) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m6253(Object obj) {
        return obj.hashCode();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /* JADX INFO: renamed from: ۟ۢۤۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m6254(Object obj, Object obj2) {
        C0051.m992();
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۥ, reason: not valid java name and contains not printable characters */
    public static long m6255(Object obj) {
        if (C0465.m9059() <= 0) {
            return ((d5) obj).f8839a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static a1 m6256(Object obj) {
        if (C0216.m4108() < 0) {
            return ((z0) obj).f6015b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6257() {
        if (C0179.m3417() > 0) {
            return "Read invalid user property value, ignoring it. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡ۠, reason: not valid java name and contains not printable characters */
    public static Intent m6258(Object obj, Object obj2) {
        if (C0234.m4495() < 0) {
            return ((PackageManager) obj).getLaunchIntentForPackage((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6259() {
        return (-973) ^ C0429.f699;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static g1 m6260(Object obj) {
        if (C0032.m620() <= 0) {
            return ((d) obj).f4445d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6261(Object obj) {
        if (C0411.m8063() > 0) {
            return ((a5) obj).K();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤۢ, reason: not valid java name and contains not printable characters */
    public static String m6262(Object obj) {
        if (C0163.m3132() > 0) {
            return ((q1) obj).f4742d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6263(Object obj) {
        if (C0089.m1902() <= 0) {
            return ((a0) obj).f5589b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m6264(Object obj) {
        if (C0379.m7420() >= 0) {
            return ((k) obj).f7660x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۡ, reason: contains not printable characters */
    public static String m6265(Object obj) {
        if (C0070.m1363() > 0) {
            return ((k6.k) obj).t();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۨ, reason: contains not printable characters */
    public static Object m6266(Object obj) {
        if (C0002.m46() < 0) {
            return ((b3) obj).f8741d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۦ, reason: contains not printable characters */
    public static String m6267(String str) {
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

    /* JADX INFO: renamed from: ۦۦۤۢ, reason: contains not printable characters */
    public static String[] m6268() {
        if (C0246.m4710() > 0) {
            return t5.f10396f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۧ, reason: not valid java name and contains not printable characters */
    public static float m6269() {
        if (C0317.m6120() <= 0) {
            return g.f11053g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۢۨۦ, reason: not valid java name and contains not printable characters */
    public static String m6270() {
        if (C0458.m8901() <= 0) {
            return "Service running — setup Shizuku in Settings tab for Ola & Uber.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6250(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
