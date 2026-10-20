package r5;

import a0.C0003;
import a2.c0;
import a5.s;
import a6.C0007;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.platform.C0038;
import b1.C0050;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.C0192;
import com.google.firebase.remoteconfig.interop.C0198;
import d4.C0217;
import d5.r0;
import f0.c2;
import f0.e0;
import f0.u;
import f1.C0273;
import f5.f0;
import g3.C0288;
import j4.C0326;
import java.io.ByteArrayOutputStream;
import k.C0331;
import k0.h4;
import k0.r4;
import k6.a5;
import k6.h5;
import k6.t;
import k6.u7;
import k6.x7;
import l6.C0344;
import m0.q2;
import q0.C0381;
import u7.C0437;
import u8.C0438;
import v0.C0442;
import z7.C0490;

/* JADX INFO: renamed from: r5.ۣۢ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0400 {

    /* JADX INFO: renamed from: ۨۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f671 = 122;

    /* JADX INFO: renamed from: ۟۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m7831(Object obj, boolean z10) {
        if (C0123.m2379() > 0) {
            return ((zzfi.zzb.zza) obj).zze(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m7832(Object obj, Object obj2) {
        if (C0007.m154() <= 0) {
            return ((zzfi.zzj.zza) obj).zzd((Iterable<String>) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m7833(Object obj) {
        if (C0050.m982() < 0) {
            return ((r4) obj).f9436u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int m7835(Object obj) {
        if (C0381.m7481() >= 0) {
            return ((s) obj).f1300a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m7836(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((FirebaseUser) obj).getEmail();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7837(Object obj, Object obj2) {
        if (C0331.m6408() < 0) {
            ((h5) obj).p((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static t m7838(Object obj, Object obj2, Object obj3) {
        if (C0198.m3800() >= 0) {
            return ((k6.k) obj).Y((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7839(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m7840(Object obj) {
        if (C0163.m3132() > 0) {
            ((AccessibilityNodeInfo) obj).recycle();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۥ۟, reason: not valid java name and contains not printable characters */
    public static Uri m7841(Object obj) {
        if (C0192.m3659() > 0) {
            return ((Intent) obj).getData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۢ, reason: not valid java name and contains not printable characters */
    public static c0 m7842(int i10, int i11, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0217.m4144() > 0) {
            return c0.e(i10, i11, j10, j11, j12, j13, (c0) obj, (f2.e) obj2, (f2.j) obj3, (f2.l) obj4, (l2.j) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m7843() {
        if (C0122.m2355() > 0) {
            return "service_stopped_tap_to_start";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢ۠, reason: not valid java name and contains not printable characters */
    public static y0.o m7844(Object obj) {
        if (C0288.m5547() >= 0) {
            return ((u) obj).f5955q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m7845(Object obj) {
        if (C0029.m568() < 0) {
            return ((k0.k) obj).f9082c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m7846(Object obj, Object obj2, int i10) {
        if (C0326.m6304() < 0) {
            ((r0) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m7847() {
        return 991 ^ C0442.f713;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7848(Object obj, Object obj2, Object obj3) {
        if (C0438.m8564() > 0) {
            ((d6.a) obj).c((Context) obj2, (ServiceConnection) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۧۡۦ, reason: not valid java name and contains not printable characters */
    public static long m7849() {
        if (C0344.m6746() > 0) {
            return zzne.zza();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۧۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7850(Object obj, Object obj2, int i10, Object obj3) {
        if (C0003.m70() > 0) {
            return ((u7) obj).T((String) obj2, i10, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۦۦ, reason: not valid java name and contains not printable characters */
    public static String m7851(Object obj) {
        if (C0273.m5273() <= 0) {
            return ((zzfi.zzj) obj).zzam();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static Integer m7852(Object obj) {
        if (C0437.m8543() > 0) {
            return ((h0.h) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7853(Object obj) {
        if (C0180.m3448() > 0) {
            return ((a5) obj).h();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m7854(Object obj) {
        if (C0490.m9552() > 0) {
            return ((h4) obj).f8990p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۥۧ, reason: not valid java name and contains not printable characters */
    public static q8.f m7855(Object obj, int i10, Object obj2) {
        if (C0184.m3517() >= 0) {
            return ((f0) obj).a(i10, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۤۨ, reason: contains not printable characters */
    public static int m7856(Object obj, int i10) {
        if (C0038.m750() <= 0) {
            return ((q2) obj).g(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۤۤ, reason: contains not printable characters */
    public static c2 m7857(Object obj) {
        if (C0080.m1729() < 0) {
            return ((e0) obj).f5680n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m7858(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m7834(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
