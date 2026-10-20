package u1;

import android.content.SharedPreferences;
import androidx.annotation.C0019;
import androidx.compose.ui.graphics.C0031;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.firestore.core.C0151;
import com.google.gson.internal.sql.C0208;
import d1.C0215;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import f1.C0274;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import k6.g4;
import k6.n4;
import m7.C0358;
import m9.C0360;
import v6.C0447;
import z1.C0484;
import z3.C0487;

/* JADX INFO: renamed from: u1.ۢۥ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0433 {

    /* JADX INFO: renamed from: ۠ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int f703 = 525;

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static long m8454(Object obj) {
        if (C0274.m5273() < 0) {
            return ((b1.a) obj).e();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m8455(Object obj) {
        if (C0447.m8696() >= 0) {
            return ((g4) obj).f10060b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m8456(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۥۤ۠, reason: not valid java name and contains not printable characters */
    public static MainViewModel m8457(Object obj) {
        if (C0231.m4440() >= 0) {
            return ((d5.w0) obj).f4821d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8459(Object obj, Object obj2) {
        if (C0086.m1846() >= 0) {
            return ((BlockingQueue) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8460(Object obj) {
        if (C0043.m833() > 0) {
            return ((d5.i0) obj).f4565d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۥ۟, reason: not valid java name and contains not printable characters */
    public static String m8461(String str) {
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

    /* JADX INFO: renamed from: ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8462() {
        if (C0151.m2903() > 0) {
            return "Receiver not registered/enabled";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8463(Object obj, Object obj2) {
        if (C0358.m7001() < 0) {
            return ((SharedPreferences) obj).contains((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۨۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m8464(Object obj) {
        if (C0031.m598() >= 0) {
            return ((k0.g3) obj).f8947c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static Object[] m8465(Object obj, int i10) {
        if (C0208.m3984() <= 0) {
            return Arrays.copyOf((Object[]) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static y.g m8466(Object obj) {
        if (C0122.m2355() >= 0) {
            return ((k0.w) obj).f9591q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static f0.o0 m8467() {
        if (C0487.m9464() >= 0) {
            return f0.o0.f5837b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static r1.x0 m8468(Object obj) {
        if (C0360.m7059() < 0) {
            return ((k0.t1) obj).f9476d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8469(Object obj) {
        if (C0484.m9403() >= 0) {
            return ((a2.r) obj).f969a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۧۥ, reason: contains not printable characters */
    public static int m8470() {
        return 0 ^ C0215.f238;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۢ, reason: contains not printable characters */
    public static boolean m8471(Object obj) {
        if (C0019.m375() < 0) {
            return ((n4) obj).f10224d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m8458(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
