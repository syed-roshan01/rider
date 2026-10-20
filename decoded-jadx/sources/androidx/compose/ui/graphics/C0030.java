package androidx.compose.ui.graphics;

import a.C0002;
import a2.C0005;
import android.content.ContentValues;
import android.os.PowerManager;
import androidx.fragment.app.C0042;
import c9.e;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.appcheck.C0131;
import com.google.protobuf.e1;
import com.google.protobuf.u2;
import d7.t;
import dagger.hilt.android.internal.C0235;
import e7.C0264;
import f0.i;
import g.C0283;
import g9.C0294;
import i4.C0317;
import j3.C0325;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import k0.i2;
import k3.C0334;
import k6.f5;
import k6.k;
import l9.C0347;
import n1.C0362;
import t.d;
import u0.c;
import v0.C0442;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.۟ۥۨۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0030 {

    /* JADX INFO: renamed from: ۟ۦۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int f50 = 742;

    /* JADX INFO: renamed from: ۟۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m575() {
        return 833 ^ C0325.f473;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m577(Object obj, int i10) {
        if (C0283.m5468() > 0) {
            return t.v((int[]) obj, i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static u m578() {
        if (C0334.m6491() >= 0) {
            return r.f16827l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m579(Object obj, Object obj2) {
        if (C0294.m5663() > 0) {
            return ((d) obj).c(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static e1 m580(Object obj) {
        if (C0085.m1825() > 0) {
            return ((u2) obj).f4247a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m581(Object obj) {
        if (C0330.m6374() > 0) {
            return ((c) obj).f15006a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String[] m582() {
        if (C0317.m6144() < 0) {
            return k.f10140k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static void m583(Object obj, Object obj2, Object obj3) {
        if (C0005.m104() > 0) {
            ((ContentValues) obj).put((String) obj2, (Boolean) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m584(Object obj) {
        if (C0042.m820() > 0) {
            return ((PowerManager.WakeLock) obj).isHeld();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m585(Object obj, boolean z10) {
        if (C0235.m4538() > 0) {
            return ((StringBuilder) obj).append(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۡ, reason: not valid java name and contains not printable characters */
    public static String m586(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۡ۠, reason: not valid java name and contains not printable characters */
    public static int m587(Object obj) {
        if (C0002.m46() < 0) {
            return ((i) obj).f5745e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m588(Object obj) {
        if (C0264.m5062() <= 0) {
            return ((f5) obj).f10028e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m589(Object obj) {
        if (C0088.m1874() > 0) {
            return ((zzfi.zzj) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m590(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۤۡۤ, reason: not valid java name and contains not printable characters */
    public static long m591() {
        if (C0442.m8630() < 0) {
            return zzne.zzd();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۤۡ, reason: not valid java name and contains not printable characters */
    public static long m592() {
        if (C0362.m7099() < 0) {
            return zzne.zzn();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static long m593() {
        if (C0131.m2522() >= 0) {
            return e5.a.c();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static e m594(Object obj) {
        if (C0347.m6808() <= 0) {
            return ((i2) obj).f9024b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static String m576(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
