package d1;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.graphics.C0031;
import androidx.lifecycle.C0043;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.installations.C0177;
import com.google.firebase.provider.C0194;
import d9.C0224;
import e7.C0265;
import f0.g0;
import h5.C0309;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.util.TreeSet;
import k0.c3;
import k0.n1;
import k0.n3;
import k3.C0335;
import k6.a5;
import k6.k;
import k6.n;
import k6.p7;
import k6.r7;
import k6.x;
import k6.x3;
import l3.C0343;
import m0.m;
import o1.z;
import r1.C0394;
import s0.C0411;
import t2.C0421;
import t2.C0422;
import y.a1;
import y0.o;

/* JADX INFO: renamed from: d1.۟ۡۨۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0213 {

    /* JADX INFO: renamed from: ۟ۢۢۦۤ, reason: not valid java name and contains not printable characters */
    public static int f236 = 232;

    /* JADX INFO: renamed from: ۟۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m4047(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4048(Object obj) {
        if (C0177.m3380() > 0) {
            return ((Class) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4049(Object obj) {
        if (C0327.m6304() <= 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4050(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4051() {
        return 159 ^ C0043.f63;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۡ, reason: not valid java name and contains not printable characters */
    public static o m4052(Object obj) {
        if (C0159.m3030() <= 0) {
            return ((n3) obj).f9269a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4054(Object obj) {
        if (C0421.m8263() > 0) {
            return ((c3) obj).f8793b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4055(Object obj) {
        if (C0141.m2714() < 0) {
            return ((zzfi.zzj) obj).zzbf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static z m4056(Object obj) {
        if (C0031.m598() > 0) {
            return ((g0) obj).f5706b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4057(Object obj, Object obj2, Object obj3, int i10) {
        if (C0121.m2336() < 0) {
            ((d5.b) obj).b((a1) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۠, reason: not valid java name and contains not printable characters */
    public static x3 m4058() {
        if (C0335.m6491() >= 0) {
            return x.f10485g0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۣ, reason: not valid java name and contains not printable characters */
    public static x3 m4059() {
        if (C0028.m557() > 0) {
            return x.f10502p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4060(Object obj) {
        if (C0142.m2725() > 0) {
            return ((TreeSet) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۦۡ, reason: not valid java name and contains not printable characters */
    public static t.d m4061(float f10) {
        if (C0194.m3713() > 0) {
            return t.e.a(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static c9.e m4062(Object obj) {
        if (C0394.m7716() >= 0) {
            return ((n1) obj).f9259p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥ۠, reason: contains not printable characters */
    public static void m4063(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0309.m5962() > 0) {
            y3.e.h((String) obj, (String) obj2, (c9.a) obj3, (m) obj4, i10);
        }
    }

    /* JADX INFO: renamed from: ۦۡ۟ۥ, reason: contains not printable characters */
    public static boolean m4064(Object obj, Object obj2) {
        if (C0411.m8063() >= 0) {
            return ((r7) obj).U((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static boolean m4065(Object obj) {
        if (C0422.m8278() <= 0) {
            return ((a5) obj).f9887v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static boolean m4066(Object obj) {
        if (C0224.m4304() <= 0) {
            return Settings.canDrawOverlays((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static long m4067(Object obj) {
        if (C0265.m5062() < 0) {
            return ((n) obj).f10216c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۦۡۧ, reason: not valid java name and contains not printable characters */
    public static k m4068(Object obj) {
        if (C0343.m6720() >= 0) {
            return ((p7) obj).f10288c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4053(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
