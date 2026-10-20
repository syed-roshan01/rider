package u7;

import a2.a0;
import a2.x;
import a2.z;
import android.support.v4.app.C0015;
import c9.h;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.installations.interop.C0173;
import dagger.hilt.migration.C0254;
import f0.C0272;
import f2.k;
import f5.r;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;
import k0.m2;
import k0.y4;
import k6.f;
import k6.f5;
import k6.x3;
import k6.z5;
import m3.C0352;
import r6.C0402;
import u8.e;
import v.l1;
import v5.C0445;
import x2.C0467;
import x8.C0473;

/* JADX INFO: renamed from: u7.ۣ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0437 {

    /* JADX INFO: renamed from: ۟۠۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int f708 = -855;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static f m8535(Object obj) {
        if (C0173.m3314() > 0) {
            return ((f5) obj).f10030g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m8536(Object obj, Object obj2) {
        if (C0272.m5249() < 0) {
            return ((l1) obj).b((e) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static b.e m8537() {
        if (C0254.m4866() <= 0) {
            return b.e.f2299b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8538(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m8539(int i10) {
        if (C0144.m2767() >= 0) {
            return f6.a.i0(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj m8540(Object obj, int i10) {
        if (C0473.m9210() < 0) {
            return ((zzfi.zzi.zza) obj).zza(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static z m8541(Object obj) {
        if (C0402.m7897() > 0) {
            return ((a0) obj).f893a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m8542(Object obj, Object obj2) {
        if (C0083.m1779() > 0) {
            return ((BigDecimal) obj).subtract((BigDecimal) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8543() {
        return 352 ^ C0015.f35;
    }

    /* JADX INFO: renamed from: ۡۦۨۢ, reason: not valid java name and contains not printable characters */
    public static k m8544(Object obj) {
        if (C0121.m2336() <= 0) {
            return ((x) obj).f1035e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m8545(Object obj) {
        if (C0123.m2379() > 0) {
            return ((z5) obj).f10615b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static e m8546(Object obj, Object obj2, Object obj3) {
        if (C0445.m8692() <= 0) {
            return ((r) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static x3 m8547() {
        if (C0122.m2355() >= 0) {
            return k6.x.K0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۥ, reason: contains not printable characters */
    public static String m8548(String str) {
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

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8549(Object obj) {
        if (C0467.m9101() < 0) {
            return ((m2) obj).f9212f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۥۦ, reason: not valid java name and contains not printable characters */
    public static h m8550(Object obj) {
        if (C0352.m6904() < 0) {
            return ((y4) obj).f9681n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m8534(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
