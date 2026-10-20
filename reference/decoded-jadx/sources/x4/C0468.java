package x4;

import a.C0002;
import a2.c0;
import a5.j;
import a5.z;
import android.os.C0013;
import androidx.compose.foundation.layout.C0021;
import b8.C0055;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzot;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.installations.ktx.C0175;
import d1.C0212;
import d5.f1;
import d5.i0;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.internal.migration.C0232;
import e0.C0256;
import h3.C0301;
import h5.C0308;
import i1.f;
import j4.C0326;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k6.a5;
import k6.b5;
import k6.z3;
import l0.q;
import l0.u;
import m0.q2;
import n.C0361;
import s3.C0412;
import t.d;
import t.o;
import t2.C0421;
import u.C0428;
import u8.e;

/* JADX INFO: renamed from: x4.۟ۤۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0468 {

    /* JADX INFO: renamed from: ۧۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int f739 = 297;

    /* JADX INFO: renamed from: ۟۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m9111(Object obj, boolean z10) {
        if (C0175.m3346() > 0) {
            return ((zzfi.zzb.zza) obj).zzc(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m9112(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0212.m4051() > 0) {
            return ((j) obj).e((String) obj2, (String) obj3, (e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static c0 m9113() {
        if (C0055.m1056() >= 0) {
            return u.f11178c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9114(Object obj) {
        if (C0428.m8409() <= 0) {
            return ((b5) obj).f9913a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9115() {
        if (C0361.m7097() <= 0) {
            return zzot.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠۠, reason: not valid java name and contains not printable characters */
    public static String m9116(Object obj) {
        if (C0301.m5797() < 0) {
            return ((a5) obj).f9870e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static o m9117(Object obj) {
        if (C0002.m46() < 0) {
            return ((d) obj).f14110c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m9118(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static long m9119(Object obj) {
        if (C0326.m6304() <= 0) {
            return ((f1) obj).f4489f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m9120(Object obj) {
        if (C0412.m8089() < 0) {
            ((q2) obj).I();
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9121(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨۢۥ, reason: not valid java name and contains not printable characters */
    public static String m9122(Object obj) {
        if (C0232.m4482() >= 0) {
            return ((z3) obj).w();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int m9123() {
        return 1014 ^ C0230.f310;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static f m9124() {
        if (C0013.m253() > 0) {
            return f6.a.P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۣ, reason: not valid java name and contains not printable characters */
    public static float m9125() {
        if (C0021.m417() >= 0) {
            return q.f11119g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m9126(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11, Object obj6) {
        if (C0308.m5962() >= 0) {
            return ((z) obj).f((String) obj2, (String) obj3, (String) obj4, i10, (String) obj5, i11, (e) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static void m9127(Object obj, int i10, Object obj2) {
        if (C0421.m8278() <= 0) {
            ((ArrayList) obj).add(i10, obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static int m9128(Object obj) {
        if (C0126.m2434() >= 0) {
            return ((i0) obj).f4567f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9130(Object obj) {
        if (C0061.m1161() <= 0) {
            return ((zzdd) obj).zzc;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m9131(Object obj, boolean z10) {
        if (C0256.m4901() < 0) {
            return ((zzfi.zzb.zza) obj).zzf(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static String m9129(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
