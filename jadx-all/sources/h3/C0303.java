package h3;

import android.content.Context;
import android.content.SharedPreferences;
import c0.f;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.connector.internal.C0114;
import d3.C0217;
import d5.h1;
import d7.C0221;
import d7.t;
import dagger.hilt.internal.generatesrootinput.C0251;
import f0.u;
import f5.d0;
import g.C0285;
import g7.C0293;
import h8.C0314;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import k0.h2;
import k0.o1;
import k0.u2;
import k6.i7;
import k6.k;
import k6.o0;
import k6.q3;
import m7.C0359;
import o1.s;
import o4.C0370;
import p3.C0376;
import r1.i1;
import u1.i;
import v5.C0445;
import x.m;
import x7.C0473;
import y0.o;
import y1.g;
import y6.C0478;

/* JADX INFO: renamed from: h3.ۣ۟ۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0303 {

    /* JADX INFO: renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f450 = -348;

    /* JADX INFO: renamed from: ۟۠۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m5820(Object obj, Object obj2) {
        if (C0370.m7254() >= 0) {
            return ((d0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m5821(Object obj) {
        if (C0314.m6072() <= 0) {
            return s.D((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5822(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m5823() {
        if (C0103.m2022() > 0) {
            return "fare_filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۨ, reason: not valid java name and contains not printable characters */
    public static q3 m5824(Object obj) {
        if (C0285.m5483() >= 0) {
            return ((o0) obj).f10249c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m5825(Object obj) {
        if (C0217.m4114() < 0) {
            return ((f0.s) obj).f5890p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static i m5826(Object obj) {
        if (C0251.m4793() >= 0) {
            return ((u2) obj).f9523c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static long m5827(Object obj) {
        if (C0473.m9193() <= 0) {
            return ((zzfi.zzj) obj).zzk();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m5828(String str) {
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

    /* JADX INFO: renamed from: ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5830(Object obj) {
        if (C0114.m2205() < 0) {
            return ((o1) obj).f9299s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۤ۟, reason: contains not printable characters */
    public static o m5831(Object obj, float f10, float f11, int i10) {
        if (C0445.m8673() > 0) {
            return androidx.compose.foundation.layout.a.p((r1.o) obj, f10, f11, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۥ, reason: contains not printable characters */
    public static i1 m5832(Object obj) {
        if (C0376.m7362() >= 0) {
            return ((h2) obj).f8969a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۤ, reason: contains not printable characters */
    public static void m5833(Object obj, Object obj2, Object obj3, long j10, Object obj4) {
        if (C0376.m7362() > 0) {
            ((k) obj).H((String) obj2, (Long) obj3, j10, (zzfi.zze) obj4);
        }
    }

    /* JADX INFO: renamed from: ۦۡۥۣ, reason: contains not printable characters */
    public static c9.a m5834(Object obj) {
        if (C0478.m9312() <= 0) {
            return ((h1) obj).f4544c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۤ, reason: contains not printable characters */
    public static f m5835(Object obj) {
        if (C0293.m5634() < 0) {
            return ((u) obj).f5958t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5836() {
        return 962 ^ C0359.f629;
    }

    /* JADX INFO: renamed from: ۨۦ۠۠, reason: not valid java name and contains not printable characters */
    public static long m5837(Object obj) {
        if (C0221.m4261() >= 0) {
            return ((i7) obj).f10113b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static o m5838(Object obj, boolean z10, Object obj2, Object obj3, boolean z11, Object obj4, Object obj5) {
        if (C0326.m6295() > 0) {
            return t.r0((o) obj, z10, (m) obj2, (u.i1) obj3, z11, (g) obj4, (c9.a) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5829(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
