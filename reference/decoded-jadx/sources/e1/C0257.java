package e1;

import androidx.annotation.C0018;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.data.model.C0071;
import com.auto.accept.data.model.RideDetectionResult;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.C0128;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.a1;
import g3.C0288;
import g5.C0291;
import ga.C0295;
import java.io.ByteArrayOutputStream;
import k0.e5;
import k0.n2;
import k0.o1;
import k6.f5;
import k6.o5;
import m0.l3;
import m0.q2;
import r2.C0397;
import r5.C0399;
import u1.C0432;
import u4.C0436;
import y.i1;
import z8.C0492;

/* JADX INFO: renamed from: e1.۟ۡۡۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0257 {

    /* JADX INFO: renamed from: ۟ۡ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f337 = -352;

    /* JADX INFO: renamed from: ۣ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4909(Object obj) {
        if (C0397.m7764() < 0) {
            return ((zzew.zza) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static RideDetectionResult m4910(Object obj, Object obj2, int i10, Object obj3, boolean z10, Object obj4, long j10) {
        if (C0152.m2931() >= 0) {
            return ((RideDetectionResult) obj).copy((String) obj2, i10, (String) obj3, z10, (String) obj4, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۡ, reason: not valid java name and contains not printable characters */
    public static a2.c0 m4911(Object obj) {
        if (C0203.m3894() > 0) {
            return ((e5) obj).f8882c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4912(float f10) {
        if (C0399.m7828() >= 0) {
            return d7.t.p0(f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۥ, reason: not valid java name and contains not printable characters */
    public static long m4913(long j10, long j11) {
        if (C0492.m9578() > 0) {
            return o1.s.o(j10, j11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m4915(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4916(Object obj, int i10) {
        if (C0186.m3548() <= 0) {
            ((q2) obj).a(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۟, reason: not valid java name and contains not printable characters */
    public static Task m4917(Object obj, Object obj2) {
        if (C0071.m1458() >= 0) {
            return ((FirebaseRemoteConfig) obj).setConfigSettingsAsync((FirebaseRemoteConfigSettings) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4918() {
        return (-722) ^ C0291.f439;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m4919(Object obj) {
        if (C0432.m8470() > 0) {
            return ((o1) obj).f9288a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m4920(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, long j10, long j11, Object obj6, Object obj7, Object obj8, int i11, int i12) {
        if (C0024.m487() >= 0) {
            n2.b((y0.o) obj, (c9.e) obj2, (c9.e) obj3, (c9.e) obj4, (c9.e) obj5, i10, j10, j11, (i1) obj6, (c9.f) obj7, (m0.m) obj8, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4921(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۥۨۧ, reason: not valid java name and contains not printable characters */
    public static l9.c m4922(Object obj, Object obj2, boolean z10, int i10) {
        if (C0172.m3296() > 0) {
            return l9.i.X0((CharSequence) obj, (String[]) obj2, z10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۢ, reason: not valid java name and contains not printable characters */
    public static l3 m4923(Object obj) {
        if (C0295.m5679() >= 0) {
            return ((a1) obj).f4395c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨ۟, reason: contains not printable characters */
    public static void m4924(Object obj) {
        if (C0436.m8524() < 0) {
            f5.d((o5) obj);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۡۦ, reason: contains not printable characters */
    public static int m4925(Object obj, int i10, int i11) {
        if (C0288.m5547() > 0) {
            return ((String) obj).offsetByCodePoints(i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4926(Object obj) {
        if (C0128.m2475() <= 0) {
            return ((a5.w) obj).f1316a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦ۟, reason: not valid java name and contains not printable characters */
    public static float m4927() {
        if (C0018.m354() > 0) {
            return f0.f.f5694b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m4914(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
