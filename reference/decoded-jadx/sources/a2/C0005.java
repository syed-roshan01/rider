package a2;

import androidx.compose.foundation.layout.C0023;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.emulators.C0141;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.installations.ktx.C0175;
import dagger.hilt.C0255;
import f0.a1;
import g.C0282;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import k0.d5;
import k0.k2;
import k0.w3;
import m1.C0350;
import m1.C0351;
import m7.C0356;
import p9.q0;
import v5.C0444;
import y.i1;

/* JADX INFO: renamed from: a2.ۢۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0005 {

    /* JADX INFO: renamed from: ۟ۡۦۨ۠, reason: collision with root package name */
    public static int f1063 = 520;

    /* JADX INFO: renamed from: ۟۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static int m94(Object obj) {
        if (C0141.m2714() < 0) {
            return ((k2) obj).f9104b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static float m95() {
        if (C0444.m8673() > 0) {
            return l0.g.f11055i;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static float m96() {
        if (C0356.m6984() > 0) {
            return l0.h.f11062g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟۠, reason: not valid java name and contains not printable characters */
    public static q0 m97(Object obj) {
        if (C0023.m461() > 0) {
            return ((MainViewModel) obj).f3105n0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m98(Object obj) {
        if (C0255.m4876() < 0) {
            return ((f5.y) obj).f6342c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m99(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, int i11) {
        if (C0282.m5446() > 0) {
            k0.x.b((c9.e) obj, (y0.o) obj2, (c9.e) obj3, (c9.f) obj4, (i1) obj5, (d5) obj6, (m0.m) obj7, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m100() {
        if (C0109.m2116() <= 0) {
            return "Filters";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۦ, reason: not valid java name and contains not printable characters */
    public static long m101() {
        if (C0350.m6878() <= 0) {
            return l0.c.F;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static c9.c m103(Object obj) {
        if (C0142.m2725() >= 0) {
            return ((a1) obj).f5595d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m104() {
        return 548 ^ C0139.f165;
    }

    /* JADX INFO: renamed from: ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static x.m m105(Object obj) {
        if (C0004.m76() <= 0) {
            return ((w3) obj).f9614c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static long m106(Object obj) {
        if (C0351.m6885() >= 0) {
            return ((k6.p) obj).f10265e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static int m107(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۨۨۧ, reason: contains not printable characters */
    public static Set m108(Object obj) {
        if (C0175.m3346() >= 0) {
            return ((q.f) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m109(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m102(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
