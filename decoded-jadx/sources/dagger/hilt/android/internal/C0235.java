package dagger.hilt.android.internal;

import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.draw.C0028;
import c1.C0059;
import c9.e;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzqj;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.internal.bind.C0207;
import dagger.hilt.internal.C0252;
import e2.C0260;
import f0.c;
import f0.h0;
import f4.C0274;
import fa.C0281;
import g.C0282;
import h0.v0;
import java.io.ByteArrayOutputStream;
import k0.j0;
import k0.l2;
import k6.d4;
import k6.f;
import k6.j7;
import k6.l4;
import k6.p4;
import k6.r;
import k6.w5;
import k6.x3;
import l0.d;
import m4.C0353;
import m9.e0;
import n8.C0365;
import okhttp3.internal.publicsuffix.C0372;
import t9.C0427;
import x4.C0469;

/* JADX INFO: renamed from: dagger.hilt.android.internal.ۣۧۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0235 {

    /* JADX INFO: renamed from: ۣ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int f315 = -695;

    /* JADX INFO: renamed from: ۟۠۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static Boolean m4521(Object obj) {
        if (C0165.m3154() < 0) {
            return Boolean.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static p4 m4522(Object obj) {
        if (C0469.m9143() >= 0) {
            return ((l4) obj).f10182o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static void m4523(Object obj, Object obj2) {
        if (C0185.m3538() > 0) {
            zzbw.zzb((Parcel) obj, (Parcelable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4524(Object obj) {
        if (C0252.m4832() <= 0) {
            return ((w5) obj).f10459d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۥ, reason: not valid java name and contains not printable characters */
    public static AlarmManager m4525(Object obj) {
        if (C0274.m5286() < 0) {
            return ((j7) obj).f10132d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m4526(Object obj, Object obj2, Object obj3) {
        if (C0059.m1117() <= 0) {
            ((BaseBundle) obj).putString((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ServiceInfo m4527(Object obj, Object obj2, int i10) {
        if (C0365.m7172() > 0) {
            return ((PackageManager) obj).getServiceInfo((ComponentName) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static e m4528(Object obj) {
        if (C0175.m3346() >= 0) {
            return ((l2) obj).f9174d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m4529(Object obj) {
        if (C0156.m2976() > 0) {
            return ((zzfi.zzn) obj).zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4530() {
        if (C0028.m557() > 0) {
            return zzqj.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ۠, reason: not valid java name and contains not printable characters */
    public static j0 m4531() {
        if (C0260.m4984() > 0) {
            return j0.f9060o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4532(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۤۦۥ, reason: not valid java name and contains not printable characters */
    public static v0 m4533(Object obj) {
        if (C0353.m6940() <= 0) {
            return ((h0) obj).f5732c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m4535(Object obj) {
        if (C0079.m1701() >= 0) {
            return ((c) obj).f5627e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4536(Object obj) {
        if (C0281.m5443() <= 0) {
            return ((r) obj).q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m4537() {
        if (C0102.m2007() >= 0) {
            e0.C();
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4538() {
        return 679 ^ C0427.f698;
    }

    /* JADX INFO: renamed from: ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m4539() {
        if (C0207.m3957() >= 0) {
            return d.f11041g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۣ۠, reason: contains not printable characters */
    public static double m4540(Object obj, Object obj2, Object obj3) {
        return C0282.m5446() > 0 ? ((f) obj).m((String) obj2, (x3) obj3) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۡ, reason: contains not printable characters */
    public static int m4541(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4542(Object obj, boolean z10) {
        if (C0372.m7309() <= 0) {
            return d4.p(obj, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4534(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
