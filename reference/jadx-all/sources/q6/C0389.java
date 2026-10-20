package q6;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.compose.ui.graphics.C0031;
import androidx.preference.C0044;
import b0.h0;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzmy;
import com.google.firebase.abt.C0112;
import com.google.firebase.messaging.ktx.C0186;
import com.google.gson.internal.bind.C0206;
import d5.t0;
import d9.C0227;
import dagger.hilt.internal.generatesrootinput.C0251;
import e2.C0261;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k.C0332;
import k0.f3;
import k0.v3;
import k6.a5;
import k6.d4;
import k6.u7;
import l6.C0345;
import m0.u2;
import m5.C0356;
import p8.C0380;
import p9.z;
import s0.C0411;
import t3.C0425;
import u1.r1;
import v5.C0445;
import z1.C0484;

/* JADX INFO: renamed from: q6.ۡۨۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0389 {

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f659 = 528;

    /* JADX INFO: renamed from: ۟۠۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static long m7599(Object obj) {
        if (C0089.m1902() < 0) {
            return ((v3) obj).f9562n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۡ, reason: not valid java name and contains not printable characters */
    public static int m7600() {
        return (-637) ^ C0380.f650;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m7601(Object obj) {
        if (C0186.m3548() < 0) {
            return ((f3) obj).f8927c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m7602(Object obj, int i10, boolean z10, boolean z11, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0206.m3931() > 0) {
            ((d4) obj).s(i10, z10, z11, (String) obj2, obj3, obj4, obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m7603(Object obj, int i10) {
        if (C0345.m6746() >= 0) {
            ((u2) obj).f(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۣ, reason: not valid java name and contains not printable characters */
    public static u0.b m7604() {
        if (C0251.m4793() > 0) {
            return d5.q.f4729f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static z m7605(Object obj) {
        if (C0411.m8063() > 0) {
            return ((z4.d) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static h0 m7606(Object obj) {
        if (C0332.m6408() <= 0) {
            return ((t0) obj).f4779b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7607(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m7608() {
        if (C0425.m8322() > 0) {
            return "Shizuku Not Installed ✗";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7609(Object obj, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (C0112.m2176() >= 0) {
            ((k.f) obj).u(f10, f11, f12, f13, f14, f15);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m7610(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7611() {
        if (C0031.m598() >= 0) {
            return zzmy.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7612(Object obj, long j10) {
        if (C0044.m860() > 0) {
            ((a5) obj).I(j10);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۥ۠, reason: contains not printable characters */
    public static Bundle m7614(Object obj, Object obj2, Object obj3, Object obj4, boolean z10) {
        if (C0261.m4984() >= 0) {
            return ((u7) obj).v((String) obj2, (Bundle) obj3, (List) obj4, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡۦ, reason: contains not printable characters */
    public static void m7615(Object obj, Object obj2) {
        if (C0445.m8673() >= 0) {
            ((r1) obj).setContent((c9.e) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۢۡ, reason: contains not printable characters */
    public static SharedPreferences.Editor m7616(Object obj, Object obj2, long j10) {
        if (C0356.m6968() > 0) {
            return ((SharedPreferences.Editor) obj).putLong((String) obj2, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۥ, reason: contains not printable characters */
    public static void m7617(Object obj, Object obj2, Object obj3) {
        if (C0227.m4372() < 0) {
            ((MainViewModel) obj).u((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m7618() {
        if (C0484.m9403() >= 0) {
            return "shizuku_stopped_desc";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7613(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
