package f;

import a2.c0;
import a5.h0;
import a5.i0;
import a5.q;
import android.os.Bundle;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.graphics.C0032;
import androidx.profileinstaller.C0046;
import c9.c;
import c9.f;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.emulators.C0140;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.interop.C0198;
import d9.i;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.internal.componenttreedeps.C0249;
import e1.C0260;
import e1.n;
import f0.a1;
import f0.b1;
import f2.l;
import g2.l0;
import h7.C0311;
import i6.C0321;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k0.o3;
import k0.x0;
import k6.b6;
import k6.d6;
import k6.e5;
import k6.y5;
import k6.z3;
import l8.C0346;
import n7.C0365;
import q6.C0389;
import q7.C0391;
import t.w1;
import v.C0440;
import w2.C0458;
import x.m;
import y0.o;
import y6.C0478;
import z8.C0493;

/* JADX INFO: renamed from: f.۟ۤۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0271 {

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int f350 = -730;

    /* JADX INFO: renamed from: ۟۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static float m5156(Object obj) {
        if (C0260.m4959() <= 0) {
            return ((o3) obj).f9316d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static double m5157(Object obj) {
        return C0046.m893() > 0 ? ((zzfi.zzg) obj).zza() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5158(float f10) {
        if (C0493.m9578() > 0) {
            return Float.isInfinite(f10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5159() {
        if (C0440.m8582() <= 0) {
            return "gmp_app_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5160(Object obj, Object obj2, Object obj3, boolean z10, boolean z11, Object obj4, Object obj5, Object obj6, boolean z12, int i10, int i11, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i12, int i13, int i14) {
        if (C0311.m5997() >= 0) {
            i.c((String) obj, (c) obj2, (o) obj3, z10, z11, (c0) obj4, (b1) obj5, (a1) obj6, z12, i10, i11, (l0) obj7, (c) obj8, (m) obj9, (n) obj10, (f) obj11, (m0.m) obj12, i12, i13, i14);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5161(Object obj) {
        if (C0140.m2699() > 0) {
            return ((UserInfo) obj).isEmailVerified();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m5162(Object obj) {
        if (C0458.m8901() < 0) {
            return ((q) obj).f1295b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static List m5163(Object obj) {
        if (C0026.m508() > 0) {
            return ((z3) obj).f10597i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static l m5164() {
        if (C0248.m4732() <= 0) {
            return l.f6117e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static i0 m5165(Object obj) {
        if (C0365.m7147() <= 0) {
            return ((h0) obj).f1266c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static o m5166(Object obj, float f10) {
        if (C0198.m3800() >= 0) {
            return androidx.compose.foundation.layout.c.c((o) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5167() {
        if (C0478.m9312() < 0) {
            return "resettable_device_id_hash";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Map m5168(Object obj, Object obj2) {
        if (C0249.m4762() > 0) {
            return Collections.singletonMap(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static w1 m5169() {
        if (C0346.m6759() <= 0) {
            return x0.f9637c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤ, reason: not valid java name and contains not printable characters */
    public static int m5170() {
        return (-654) ^ C0075.f109;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m5171(Object obj) {
        if (C0391.m7643() < 0) {
            return ((b6) obj).f9916b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static y5 m5172(Object obj) {
        if (C0321.m6200() > 0) {
            return ((d6) obj).f9979c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥۡ, reason: contains not printable characters */
    public static void m5173(Object obj) {
        if (C0389.m7600() <= 0) {
            f6.a.x(obj);
        }
    }

    /* JADX INFO: renamed from: ۦ۠۠ۤ, reason: contains not printable characters */
    public static String m5174(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static l m5175() {
        if (C0031.m598() >= 0) {
            return l.f6114b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static int m5176(Object obj) {
        if (C0032.m620() < 0) {
            return ((e5) obj).f10002a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m5177(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m5178(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
