package s8;

import a2.C0005;
import a5.q;
import a5.z;
import androidx.core.content.C0041;
import ca.C0070;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.core.C0152;
import d5.C0218;
import d5.g;
import d5.q1;
import d5.r1;
import f0.f1;
import f0.r0;
import f5.d0;
import g3.C0288;
import g9.C0294;
import h.C0297;
import h0.h;
import j6.C0328;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.q3;
import k6.a8;
import k6.u7;
import l.z2;
import o2.C0368;
import o5.C0370;
import s0.C0410;
import v0.C0441;

/* JADX INFO: renamed from: s8.ۣۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0417 {

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int f688 = 541;

    /* JADX INFO: renamed from: ۟۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8191(Object obj, Object obj2, Object obj3) {
        if (C0370.m7269() > 0) {
            return ((u7) obj).p(obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟۠, reason: not valid java name and contains not printable characters */
    public static Integer m8193(Object obj) {
        if (C0107.m2075() <= 0) {
            return ((h) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m8194(Object obj) {
        if (C0329.m6367() >= 0) {
            return ((r1) obj).f4753b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static String m8195(Object obj) {
        if (C0441.m8612() >= 0) {
            return ((d0) obj).f6246c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m8196(Object obj) {
        if (C0297.m5722() >= 0) {
            return ((g) obj).f4504q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۧ, reason: not valid java name and contains not printable characters */
    public static long m8197(Object obj) {
        if (C0328.m6350() > 0) {
            return ((q3) obj).f9399f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m8198(Object obj) {
        if (C0070.m1363() > 0) {
            return ((z2) obj).f10983b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m8199(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m8200(Object obj) {
        if (C0288.m5547() > 0) {
            return ((q1) obj).f4740b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۥ, reason: not valid java name and contains not printable characters */
    public static String m8201() {
        if (C0410.m8063() >= 0) {
            return "shizuku_active_btn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static String m8202(Object obj) {
        if (C0218.m4224() < 0) {
            return ((a8) obj).f9895a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m8203(Object obj) {
        if (C0041.m812() > 0) {
            return ((r0) obj).f5869b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static List m8204(Object obj) {
        if (C0368.m7234() >= 0) {
            return ((zzfc.zzd.zza) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static z m8205(Object obj) {
        if (C0005.m104() >= 0) {
            return ((q) obj).f1296c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static int m8206(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۥۨ, reason: contains not printable characters */
    public static int m8207(Object obj) {
        if (C0152.m2931() > 0) {
            return ((f1) obj).f5699a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m8208() {
        return (-427) ^ C0294.f442;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8192(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
