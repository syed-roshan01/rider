package n7;

import a2.i;
import android.app.Application;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.graphics.C0032;
import c3.C0063;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.reporting.C0189;
import com.google.protobuf.v;
import d7.C0221;
import dagger.hilt.android.components.C0229;
import f6.C0278;
import i1.f;
import i4.C0318;
import i9.C0322;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k0.l0;
import k6.a5;
import k6.a6;
import k6.d;
import k6.x;
import k6.x3;
import o7.d0;
import r6.C0403;
import t1.x0;
import u3.C0435;
import x0.C0467;
import x4.C0470;
import y0.n;
import z3.C0486;

/* JADX INFO: renamed from: n7.۟ۤ۠۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0365 {

    /* JADX INFO: renamed from: ۟۠۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int f635 = -742;

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m7138(Object obj, Object obj2) {
        if (C0169.m3245() > 0) {
            ((Application) obj).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static n m7139(Object obj) {
        if (C0130.m2511() >= 0) {
            return ((x0) obj).f14579e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static f m7141() {
        if (C0063.m1217() > 0) {
            return d0.f12586o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7142(Object obj, int i10, long j10) {
        if (C0467.m9086() >= 0) {
            ((v) obj).J0(i10, j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String m7143(Object obj, Object obj2) {
        if (C0435.m8498() <= 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static Object m7144(Object obj) {
        if (C0403.m7897() >= 0) {
            return ((s0.a) obj).f13897b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static x3 m7145() {
        if (C0016.m315() >= 0) {
            return x.L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۦ, reason: not valid java name and contains not printable characters */
    public static long m7146(Object obj) {
        if (C0470.m9143() >= 0) {
            return ((a5) obj).A;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static int m7147() {
        return 888 ^ C0229.f308;
    }

    /* JADX INFO: renamed from: ۠ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7148(Object obj) {
        if (C0189.m3621() > 0) {
            a7.a.w(obj);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m7149(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static x3 m7150() {
        if (C0182.m3488() > 0) {
            return x.f10511u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m7151(Object obj) {
        if (C0221.m4261() > 0) {
            return ((i) obj).f936e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m7152() {
        if (C0322.m6226() < 0) {
            return "audience_filter_values";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7153(Object obj) {
        if (C0318.m6144() <= 0) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m7154(Object obj, Object obj2, Object obj3) {
        if (C0032.m620() < 0) {
            return ((l0) obj).invoke(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m7155(Object obj) {
        if (C0486.m9449() <= 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۧ, reason: not valid java name and contains not printable characters */
    public static String m7156(String str) {
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

    /* JADX INFO: renamed from: ۦۡۡ, reason: contains not printable characters */
    public static a6 m7157() {
        if (C0125.m2408() >= 0) {
            return a6.f9892a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static Boolean m7158(Object obj, boolean z10) {
        if (C0278.m5361() < 0) {
            return d.c((Boolean) obj, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7140(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
