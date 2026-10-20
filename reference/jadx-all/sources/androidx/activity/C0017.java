package androidx.activity;

import a6.C0007;
import android.net.Uri;
import androidx.profileinstaller.C0046;
import c3.C0062;
import com.google.android.datatransport.cct.C0077;
import com.google.firebase.components.C0135;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.interop.C0198;
import d5.C0219;
import d5.y1;
import d9.C0223;
import dagger.hilt.android.migration.C0240;
import e2.C0262;
import ea.C0268;
import f0.u1;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import k0.c1;
import k0.j2;
import k0.p1;
import k0.z0;
import k6.x3;
import k6.x7;
import m0.q2;
import m5.C0356;
import p0.C0374;
import q0.C0383;
import s.C0408;
import u2.C0434;
import v.C0440;

/* JADX INFO: renamed from: androidx.activity.ۣۧۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0017 {

    /* JADX INFO: renamed from: ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int f37 = -433;

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m331(Object obj) {
        if (C0198.m3800() >= 0) {
            return ((p1) obj).f9337d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m332() {
        return 244 ^ C0356.f626;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static String m333(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static void m334(Object obj, Object obj2, Object obj3, int i10) {
        if (C0077.m1663() < 0) {
            ((f0.e) obj).a((c9.e) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۥ۠, reason: not valid java name and contains not printable characters */
    public static long m335(Object obj) {
        if (C0262.m4991() >= 0) {
            return ((x7) obj).K;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static int m336(Object obj) {
        if (C0219.m4224() < 0) {
            return ((y1) obj).f4866b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m337(Object obj) {
        if (C0186.m3548() < 0) {
            return ((c1.o) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ۟, reason: not valid java name and contains not printable characters */
    public static Set m338(Object obj) {
        if (C0331.m6374() > 0) {
            return ((Uri) obj).getQueryParameterNames();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۨ, reason: not valid java name and contains not printable characters */
    public static int m339(Object obj, Object obj2, int i10) {
        if (C0240.m4596() >= 0) {
            return ((q2) obj).G((int[]) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m340(Object obj) {
        if (C0046.m893() > 0) {
            return ((f5.l) obj).f6292e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m341(Object obj) {
        if (C0268.m5113() < 0) {
            return ((j2) obj).f9067c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static c9.e m342(Object obj) {
        if (C0408.m7989() > 0) {
            return ((k0.j) obj).f9053c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static k0.j0 m343() {
        if (C0434.m8481() > 0) {
            return k0.j0.f9061p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static x3 m344() {
        if (C0135.m2608() < 0) {
            return k6.x.K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۢ, reason: contains not printable characters */
    public static void m346(Object obj, Object obj2) {
        if (C0175.m3346() > 0) {
            ((m0.q) obj).o((c9.a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۧۡ, reason: contains not printable characters */
    public static c9.a m347(Object obj) {
        if (C0374.m7322() <= 0) {
            return ((c1) obj).f8780a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۡ, reason: contains not printable characters */
    public static Object m348(Object obj) {
        if (C0383.m7487() < 0) {
            return ((z0) obj).f9687a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static int m349() {
        if (C0062.m1186() > 0) {
            return l0.d.f11036b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۨ, reason: contains not printable characters */
    public static String[] m350(Object obj) {
        if (C0440.m8582() < 0) {
            return ((SSLSocket) obj).getEnabledProtocols();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۢ, reason: contains not printable characters */
    public static m9.d0 m351(Object obj) {
        if (C0223.m4279() <= 0) {
            return ((u1) obj).f5968d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m352(Object obj) {
        if (C0007.m154() < 0) {
            return ((k0.u) obj).f9515q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int m353(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m345(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
