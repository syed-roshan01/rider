package l0;

import androidx.annotation.C0019;
import c7.C0068;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.remoteconfig.C0200;
import com.google.gson.internal.sql.C0208;
import d5.z;
import f.C0271;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import k0.v4;
import k6.x;
import k6.x3;
import l8.C0347;
import s0.C0411;
import u.C0430;
import v.h1;
import x4.C0469;
import y.C0475;
import z.g0;
import z1.C0484;

/* JADX INFO: renamed from: l0.ۡۦۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0340 {

    /* JADX INFO: renamed from: ۦۨۨۥ, reason: contains not printable characters */
    public static int f610 = -969;

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static x3 m6655() {
        if (C0484.m9403() > 0) {
            return x.F0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m6656(Object obj) {
        if (C0327.m6304() <= 0) {
            return ((v4) obj).f9571e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static float m6657(Object obj, int i10) {
        if (C0347.m6774() > 0) {
            return ((t.t) obj).a(i10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m6658() {
        return (-225) ^ C0411.f681;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static v0.p m6659() {
        if (C0469.m9123() < 0) {
            return g0.A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m6660(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m6662(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0271.m5170() < 0) {
            return t.d.b((t.d) obj, obj2, (t.n) obj3, (u8.e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m6663(Object obj, Object obj2) {
        if (C0200.m3841() <= 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m6664(Object obj, Object obj2, Object obj3) {
        if (C0430.m8415() >= 0) {
            return ((z) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m6665(String str) {
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

    /* JADX INFO: renamed from: ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m6666(long j10, int i10, int i11, int i12) {
        if (C0161.m3081() <= 0) {
            return o1.s.b0(j10, i10, i11, i12);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۤ۠, reason: contains not printable characters */
    public static String m6667(int i10, Object obj) {
        if (C0475.m9246() <= 0) {
            return f6.a.T(i10, (m0.m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static zzfc.zza.zze m6668() {
        if (C0208.m3984() <= 0) {
            return zzfc.zza.zze.AD_STORAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡۡ, reason: contains not printable characters */
    public static String m6669() {
        if (C0068.m1322() >= 0) {
            return "app_id = ?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m6670() {
        if (C0019.m375() <= 0) {
            return zzne.zzab();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static h1 m6671() {
        if (C0130.m2511() >= 0) {
            return h1.f15593a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m6661(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
