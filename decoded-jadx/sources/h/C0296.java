package h;

import a2.c0;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewManager;
import c0.f;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.internal.C0195;
import d.C0210;
import d1.d;
import d5.j1;
import e2.C0260;
import g.C0284;
import g2.C0287;
import g8.g1;
import i9.C0321;
import java.io.ByteArrayOutputStream;
import java.nio.channels.FileLock;
import k0.a4;
import k0.e5;
import k1.C0332;
import k3.C0335;
import k6.n5;
import k7.C0337;
import l6.C0344;
import r6.C0402;
import u8.e;
import w6.C0464;
import y.C0475;
import y3.j;

/* JADX INFO: renamed from: h.۟ۡۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0296 {

    /* JADX INFO: renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int f444 = -994;

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static Parcel m5694(Object obj, int i10, Object obj2) {
        if (C0335.m6500() <= 0) {
            return ((zzbu) obj).zza(i10, (Parcel) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5695(Object obj) {
        if (C0464.m9059() <= 0) {
            return ((FileLock) obj).isValid();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5696(Object obj, Object obj2) {
        if (C0475.m9266() >= 0) {
            return ((j) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static c0 m5697(Object obj) {
        if (C0337.m6638() <= 0) {
            return ((e5) obj).f8891l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m5698(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5699(Object obj, int i10) {
        if (C0284.m5483() >= 0) {
            return ((zzfi.zzj.zza) obj).zze(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5700(Object obj, Object obj2) {
        if (C0104.m2034() < 0) {
            ((ViewManager) obj).removeView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m5701(Object obj) {
        if (C0321.m6226() < 0) {
            return ((KeyEvent) obj).getUnicodeChar();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5702(Object obj) {
        if (C0260.m4984() >= 0) {
            return ((n5) obj).f10226a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m5703(Object obj, Object obj2, Object obj3) {
        if (C0287.m5529() >= 0) {
            return ((f) obj).a((d) obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۥ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5704(Object obj, Object obj2) {
        if (C0133.m2559() >= 0) {
            return ((zzfi.zzj.zza) obj).zza((zzfi.zzn.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m5705() {
        if (C0210.m4028() < 0) {
            return Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ۟, reason: not valid java name and contains not printable characters */
    public static long m5706(Object obj) {
        if (C0195.m3737() < 0) {
            return ((g1) obj).f6803i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static e m5707(Object obj, Object obj2, Object obj3) {
        if (C0332.m6454() < 0) {
            return ((j1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5709() {
        return (-98) ^ C0344.f615;
    }

    /* JADX INFO: renamed from: ۢۡۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m5710(Object obj) {
        if (C0402.m7897() >= 0) {
            return ((a4) obj).f8719b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5711(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m5712() {
        if (C0101.m1975() > 0) {
            return "Service Stopped";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m5708(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
