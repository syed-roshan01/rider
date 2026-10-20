package v5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.C0021;
import androidx.core.app.C0040;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement_impl.C0185;
import d1.C0215;
import d8.C0222;
import f0.j1;
import g.C0284;
import h5.C0309;
import i6.C0321;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import k0.k0;
import k0.v0;
import k6.d;
import k6.d4;
import k6.j6;
import k6.s6;
import k6.t4;
import k6.u6;
import k6.y4;
import m0.m3;
import m0.q;
import p9.q0;
import s2.C0412;
import u1.C0433;
import z7.C0490;

/* JADX INFO: renamed from: v5.ۧۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0446 {

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f716 = 573;

    /* JADX INFO: renamed from: ۟ۢ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8676(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8677(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8678() {
        if (C0222.m4264() >= 0) {
            return zzqd.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8679(Object obj) {
        if (C0087.m1852() > 0) {
            return ((j6) obj).f10126a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8680(Object obj) {
        if (C0021.m417() >= 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb m8681(Object obj) {
        if (C0088.m1874() >= 0) {
            return ((zzfi.zzj) obj).zzt();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8683(Object obj) {
        if (C0129.m2492() >= 0) {
            return ((v0) obj).f9547e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static q0 m8684(Object obj) {
        if (C0321.m6200() > 0) {
            return ((MainViewModel) obj).f3120v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۨ, reason: not valid java name and contains not printable characters */
    public static void m8685(Object obj) {
        if (C0215.m4096() > 0) {
            ((q) obj).o0();
        }
    }

    /* JADX INFO: renamed from: ۢۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Boolean m8686(Object obj, Object obj2, Object obj3) {
        if (C0284.m5468() >= 0) {
            return d.d((String) obj, (zzew.zzf) obj2, (d4) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static m3 m8687() {
        if (C0178.m3402() >= 0) {
            return k0.f9091a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8688(boolean z10, int i10, int i11) {
        if (C0490.m9528() > 0) {
            return l.q.c(z10, i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static s6 m8689(Object obj) {
        if (C0040.m792() >= 0) {
            return ((u6) obj).f10422c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m8690(Object obj) {
        if (C0116.m2247() >= 0) {
            return ((j1) obj).f5799c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m8691(Object obj) {
        if (C0433.m8470() > 0) {
            return ((d) obj).f9954d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static int m8692() {
        return 231 ^ C0309.f456;
    }

    /* JADX INFO: renamed from: ۥۨۨۨ, reason: contains not printable characters */
    public static SharedPreferences m8693(Object obj, Object obj2, int i10) {
        if (C0412.m8066() < 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۡ, reason: contains not printable characters */
    public static String m8694() {
        if (C0185.m3538() > 0) {
            return "adid_reporting_enabled";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡ۟, reason: contains not printable characters */
    public static t4 m8695(Object obj) {
        if (C0328.m6319() < 0) {
            return ((y4) obj).f10567b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m8682(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
