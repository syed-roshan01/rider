package a8;

import android.net.Uri;
import android.os.Bundle;
import android.os.C0013;
import androidx.compose.ui.graphics.C0030;
import c9.c;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.inject.C0172;
import d4.C0218;
import d5.z;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.C0253;
import f0.f2;
import f0.p1;
import f0.t;
import f0.u1;
import g.C0284;
import g7.C0293;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k6.u7;
import k6.v;
import k6.y5;
import k6.z3;
import l6.C0345;
import la.g;
import m0.g1;
import m0.m;
import n.C0361;
import o2.C0369;
import p0.C0375;
import r7.C0405;
import t2.C0423;
import w4.C0460;
import y3.e;

/* JADX INFO: renamed from: a8.ۣۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0009 {

    /* JADX INFO: renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static int f29 = -437;

    /* JADX INFO: renamed from: ۟۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m175(Object obj, Object obj2) {
        if (C0030.m575() > 0) {
            return ((zzfi.zzj.zza) obj).zzl((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static c m176(Object obj) {
        if (C0460.m8951() <= 0) {
            return ((p1) obj).f5856k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m177() {
        return (-419) ^ C0231.f310;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int m178(Object obj) {
        if (C0172.m3296() > 0) {
            return ((f2) obj).f5702b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m180(Object obj, Object obj2) {
        if (C0361.m7073() <= 0) {
            return ((Uri) obj).getQueryParameter((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static String m181() {
        if (C0218.m4144() > 0) {
            return "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m182(Object obj) {
        if (C0293.m5634() < 0) {
            return ((t) obj).f5913u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۤ, reason: not valid java name and contains not printable characters */
    public static v m183(Object obj, Object obj2, Object obj3, Object obj4, long j10, boolean z10) {
        if (C0284.m5468() >= 0) {
            return ((u7) obj).z((String) obj2, (Bundle) obj3, (String) obj4, j10, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m184(Object obj, Object obj2, Object obj3, Object obj4, boolean z10) {
        if (C0345.m6746() > 0) {
            ((y5) obj).G((String) obj2, (String) obj3, (String) obj4, z10);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m185(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        if (C0405.m7934() >= 0) {
            e.s((String) obj, (String) obj2, i10, (c9.a) obj3, (m) obj4, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static g1 m186(Object obj) {
        if (C0253.m4832() <= 0) {
            return ((z) obj).f4872b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m187(Object obj) {
        if (C0369.m7234() > 0) {
            return ((z3) obj).f10594f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m188() {
        if (C0013.m253() > 0) {
            return g.f11422g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m189(Object obj) {
        if (C0375.m7350() < 0) {
            return ((u1) obj).f5965a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۧ, reason: contains not printable characters */
    public static String m190(String str) {
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

    /* JADX INFO: renamed from: ۦۡۡۤ, reason: contains not printable characters */
    public static float m191(Object obj) {
        if (C0423.m8294() > 0) {
            return ((MainViewModel) obj).i();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Boolean m192(boolean z10) {
        if (C0117.m2257() > 0) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m193(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m179(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
