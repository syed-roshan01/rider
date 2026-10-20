package k4;

import android.os.Handler;
import androidx.compose.ui.draw.C0028;
import androidx.core.content.C0041;
import c0.C0057;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.C0177;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import f5.g0;
import i.C0316;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicLong;
import k0.i4;
import k0.l1;
import k0.q3;
import k6.w4;
import m0.l3;
import m1.C0351;
import r1.i1;
import s.x0;
import t.e0;
import v8.C0451;
import w2.C0459;
import z3.C0486;

/* JADX INFO: renamed from: k4.۟۠ۦ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0337 {

    /* JADX INFO: renamed from: ۨۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int f520 = -837;

    /* JADX INFO: renamed from: ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m6515() {
        return 315 ^ C0251.f330;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m6516() {
        if (C0486.m9449() <= 0) {
            return "dev_cert_hash";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static h0.k m6517() {
        if (C0316.m6111() > 0) {
            return h0.k.f7418c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m6518() {
        if (C0041.m812() >= 0) {
            return "failed_config_fetch_time";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m6519(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m6520() {
        if (C0459.m8930() > 0) {
            return "Grant Shizuku Permission / Pair";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static long m6521(Object obj) {
        if (C0249.m4762() >= 0) {
            return ((AtomicLong) obj).getAndIncrement();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6522(Object obj) {
        if (C0177.m3380() > 0) {
            return ((k0.c) obj).f8770a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static w4 m6523(Object obj) {
        if (C0451.m8792() <= 0) {
            return ((com.google.crypto.tink.shaded.protobuf.p) obj).f3608z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m6524(Object obj) {
        if (C0057.m1090() <= 0) {
            return ((l1) obj).f9156e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static l3 m6525(long j10, Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0351.m6878() < 0) {
            return x0.a(j10, (e0) obj, (String) obj2, (m0.m) obj3, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢۢ, reason: not valid java name and contains not printable characters */
    public static String m6526(String str) {
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

    /* JADX INFO: renamed from: ۦۨۡۡ, reason: contains not printable characters */
    public static i1 m6527(Object obj) {
        if (C0028.m557() >= 0) {
            return ((i4) obj).f9043b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥ۠, reason: not valid java name and contains not printable characters */
    public static String m6528(Object obj) {
        if (C0170.m3247() < 0) {
            return ((g0) obj).f6271t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m6529(Object obj) {
        if (C0074.m1607() <= 0) {
            return ((q3) obj).f9400g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۦۤۦ, reason: not valid java name and contains not printable characters */
    public static long m6530(Object obj) {
        if (C0133.m2559() > 0) {
            return ((zzfi.zzj) obj).zzp();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6531(Object obj, Object obj2, long j10) {
        if (C0316.m6111() > 0) {
            return ((Handler) obj).postDelayed((Runnable) obj2, j10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static String m6514(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
