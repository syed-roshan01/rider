package k2;

import a.C0000;
import a5.k;
import android.content.SharedPreferences;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.remoteconfig.internal.C0195;
import e1.l0;
import f0.t;
import f4.C0277;
import g8.C0294;
import i.C0316;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.PriorityQueue;
import k0.m4;
import k6.t7;
import p8.C0380;
import p8.C0381;
import t2.C0422;
import u4.C0436;
import w5.C0464;
import y0.o;
import y3.e;

/* JADX INFO: renamed from: k2.۟ۢۦۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0334 {

    /* JADX INFO: renamed from: ۥۢۧۤ, reason: contains not printable characters */
    public static int f517 = 778;

    /* JADX INFO: renamed from: ۟۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static long m6466(Object obj) {
        if (C0316.m6111() > 0) {
            return ((zzfi.zze) obj).zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m6467(Object obj) {
        if (C0464.m9033() > 0) {
            return ((k) obj).f1277a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۧ, reason: not valid java name and contains not printable characters */
    public static String m6469(Object obj) {
        if (C0422.m8278() < 0) {
            return ((t7) obj).f10407e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static o m6470(Object obj, Object obj2) {
        if (C0195.m3737() < 0) {
            return androidx.compose.ui.draw.a.b((o) obj, (l0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6471(Object obj) {
        if (C0294.m5656() > 0) {
            return ((zzew.zzc) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int m6472() {
        return 388 ^ C0381.f651;
    }

    /* JADX INFO: renamed from: ۟ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m6473(Object obj) {
        if (C0100.m1959() <= 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۠ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static void m6474(Object obj, int i10, Object obj2) {
        if (C0436.m8516() > 0) {
            e.O0((Parcel) obj, i10, (Long) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m6475(Object obj, int i10) {
        if (C0000.m12() <= 0) {
            ((URLConnection) obj).setConnectTimeout(i10);
        }
    }

    /* JADX INFO: renamed from: ۡۧۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6476(Object obj, Object obj2) {
        if (C0174.m3323() < 0) {
            return ((PriorityQueue) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m6477(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static long m6478(Object obj) {
        if (C0277.m5315() <= 0) {
            return ((m4) obj).f9240t;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m6479(Object obj) {
        if (C0380.m7433() > 0) {
            return ((zzfi.zzj) obj).zzag();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥ۟, reason: not valid java name and contains not printable characters */
    public static void m6480(Object obj) {
        if (C0137.m2646() < 0) {
            ((SharedPreferences.Editor) obj).apply();
        }
    }

    /* JADX INFO: renamed from: ۨۢۤۢ, reason: not valid java name and contains not printable characters */
    public static o m6481(Object obj) {
        if (C0195.m3737() <= 0) {
            return ((t) obj).f5908p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6482(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m6468(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
