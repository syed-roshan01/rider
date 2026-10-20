package androidx.compose.foundation.relocation;

import a8.C0009;
import android.content.SharedPreferences;
import androidx.compose.ui.draw.C0028;
import androidx.profileinstaller.C0046;
import c9.c;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.iid.C0171;
import com.google.firebase.ktx.C0179;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.protobuf.v;
import d1.d;
import d5.k2;
import d7.C0221;
import f0.a1;
import f0.f0;
import f0.m1;
import f0.u;
import f5.a0;
import g3.C0289;
import ga.C0296;
import h7.C0313;
import i1.f;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k0.l0;
import k6.c5;
import k6.z4;
import l0.q;
import m0.g1;
import m0.w2;
import okhttp3.internal.publicsuffix.C0373;
import r5.C0401;
import u.C0429;
import u1.C0433;
import u8.e;
import v6.C0447;
import w6.C0465;
import x4.C0469;
import y0.o;
import z2.C0485;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.۟۟ۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0024 {

    /* JADX INFO: renamed from: ۟ۦۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f44 = 535;

    /* JADX INFO: renamed from: ۟۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static float m467(Object obj) {
        if (C0028.m557() > 0) {
            return ((d) obj).f4332a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static List m468(Object obj) {
        if (C0433.m8470() >= 0) {
            return ((z4.d) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static a0 m470() {
        if (C0327.m6304() < 0) {
            return a0.f6230a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static e m471(Object obj, Object obj2, Object obj3) {
        if (C0221.m4261() >= 0) {
            return ((m1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static c m472(Object obj) {
        if (C0289.m5547() >= 0) {
            return ((a1) obj).f5592a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static o m473(Object obj) {
        if (C0469.m9123() <= 0) {
            return ((u) obj).f5956r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String[] m474(Object obj) {
        if (C0447.m8696() > 0) {
            return ((SSLSocket) obj).getSupportedCipherSuites();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m475(int i10) {
        if (C0373.m7309() <= 0) {
            return v.m0(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static c5 m476(Object obj) {
        if (C0171.m3272() < 0) {
            return ((z4) obj).f10606c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static String m477(long j10) {
        if (C0401.m7847() <= 0) {
            return String.valueOf(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m478(Object obj, Object obj2) {
        if (C0485.m9436() <= 0) {
            return ((SharedPreferences.Editor) obj).remove((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m479(Object obj) {
        if (C0327.m6304() < 0) {
            return f9.a.y0((Iterable) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m480(String str) {
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

    /* JADX INFO: renamed from: ۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static long m481() {
        if (C0429.m8409() < 0) {
            return e5.a.e();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static String m482() {
        if (C0009.m177() > 0) {
            return "Grant Display Over Other Apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m483(Object obj) {
        if (C0296.m5679() >= 0) {
            return ((f0) obj).f5697c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۣۢ, reason: not valid java name and contains not printable characters */
    public static l0 m484() {
        if (C0179.m3417() > 0) {
            return l0.f9138d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static long m485() {
        if (C0313.m6046() > 0) {
            return l0.c.f11022n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static int m486(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۨ۠۟, reason: contains not printable characters */
    public static int m487() {
        return (-777) ^ C0203.f227;
    }

    /* JADX INFO: renamed from: ۦ۟۠۠, reason: contains not printable characters */
    public static int m488(Object obj) {
        if (C0469.m9123() < 0) {
            return ((k0.f0) obj).f8900a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static f m489() {
        if (C0465.m9059() <= 0) {
            return f6.a.f6374w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static g1 m490(Object obj) {
        if (C0108.m2101() <= 0) {
            return ((k2) obj).f4619o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡ۠, reason: not valid java name and contains not printable characters */
    public static long m491(Object obj) {
        if (C0046.m893() > 0) {
            return ((w2) obj).d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static float m492() {
        if (C0106.m2067() > 0) {
            return q.f11116d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m469(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
