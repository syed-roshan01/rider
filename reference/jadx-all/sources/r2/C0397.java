package r2;

import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.PowerManager;
import android.view.ViewGroup;
import androidx.compose.ui.draw.C0027;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.ktx.C0180;
import d5.j0;
import d5.l0;
import e1.C0258;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import k0.w;
import k1.C0333;
import k6.w5;
import k6.x;
import k6.x3;
import m7.C0358;
import o1.C0368;
import s8.C0418;
import t2.C0421;
import t2.C0422;
import w2.C0459;
import x4.C0469;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: r2.ۡۧۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0397 {

    /* JADX INFO: renamed from: ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int f667 = -197;

    /* JADX INFO: renamed from: ۟۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m7744(Object obj) {
        if (C0027.m541() >= 0) {
            return ((w) obj).f9592r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m7745() {
        if (C0422.m8278() <= 0) {
            return b.i.f2311a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۦ, reason: not valid java name and contains not printable characters */
    public static long m7746() {
        if (C0368.m7199() < 0) {
            return zzpa.zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m7747(Object obj, Object obj2) {
        if (C0150.m2892() < 0) {
            return ((PackageManager) obj).getInstallerPackageName((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7748(Object obj) {
        if (C0333.m6454() < 0) {
            ((PowerManager.WakeLock) obj).acquire();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static long m7749(Object obj) {
        if (C0459.m8930() >= 0) {
            return ((k6.l) obj).f10161b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۢۦ, reason: not valid java name and contains not printable characters */
    public static x3 m7750() {
        if (C0118.m2274() <= 0) {
            return x.f10493l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦۡ, reason: not valid java name and contains not printable characters */
    public static u m7751() {
        if (C0081.m1735() > 0) {
            return r.C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۦ, reason: not valid java name and contains not printable characters */
    public static zzew.zza.C0093zza m7752(Object obj, int i10, Object obj2) {
        if (C0358.m7001() <= 0) {
            return ((zzew.zza.C0093zza) obj).zza(i10, (zzew.zzb.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static void m7753(Object obj, double d10) {
        if (C0180.m3448() > 0) {
            ((Parcel) obj).writeDouble(d10);
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m7754(Object obj, boolean z10) {
        if (C0258.m4918() >= 0) {
            ((j0) obj).a(z10);
        }
    }

    /* JADX INFO: renamed from: ۢۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m7755() {
        return 260 ^ C0329.f476;
    }

    /* JADX INFO: renamed from: ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7756(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۦۥ۟, reason: contains not printable characters */
    public static String m7758(Object obj) {
        if (C0163.m3132() >= 0) {
            return ((w5) obj).f10457b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۢ, reason: contains not printable characters */
    public static String m7759(String str) {
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

    /* JADX INFO: renamed from: ۦۤۢۦ, reason: contains not printable characters */
    public static c9.e m7760(Object obj) {
        if (C0418.m8208() >= 0) {
            return ((k0.e) obj).f8846c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7761(Object obj) {
        if (C0469.m9123() <= 0) {
            return ((l0) obj).f4647d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۤۢ, reason: not valid java name and contains not printable characters */
    public static String m7762(Object obj, Object obj2) {
        if (C0421.m8263() >= 0) {
            return ((ContentValues) obj).getAsString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠۟, reason: contains not printable characters */
    public static String m7757(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
