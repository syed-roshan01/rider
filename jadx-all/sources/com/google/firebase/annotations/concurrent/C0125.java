package com.google.firebase.annotations.concurrent;

import a.C0000;
import androidx.compose.foundation.layout.C0021;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.remoteconfig.C0201;
import d5.k1;
import d5.k2;
import d5.u1;
import dagger.hilt.android.migration.C0239;
import g7.C0293;
import h.C0299;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k0.f0;
import k0.y0;
import k0.y1;
import k3.C0335;
import k6.a5;
import k6.s6;
import k6.w5;
import m0.g1;
import m0.l;
import m0.l3;
import m2.g;
import o5.C0371;
import p9.c0;
import q.n;
import q6.C0387;
import q6.C0388;
import t2.C0424;
import u8.e;
import v8.a;
import w4.C0461;
import x4.C0469;
import z.C0481;
import z3.C0487;

/* JADX INFO: renamed from: com.google.firebase.annotations.concurrent.ۦۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0125 {

    /* JADX INFO: renamed from: ۣۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f151 = 809;

    /* JADX INFO: renamed from: ۟۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2403() {
        if (C0160.m3070() <= 0) {
            return "Subscription";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static float m2404(long j10) {
        if (C0239.m4587() < 0) {
            return g.b(j10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2405(Object obj) {
        if (C0175.m3346() > 0) {
            return ((y1) obj).f9666b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static Long m2406(Object obj) {
        if (C0481.m9354() <= 0) {
            return ((w5) obj).f10464i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2408() {
        return 722 ^ C0021.f41;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m2409(Object obj) {
        if (C0388.m7585() > 0) {
            return ((zzfi.zzm) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2410(Object obj, int i10, int i11) {
        if (C0201.m3855() < 0) {
            ((p) obj).W0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static MainViewModel m2411(Object obj) {
        if (C0424.m8307() >= 0) {
            return ((k2) obj).f4613b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static a m2412(Object obj, Object obj2, Object obj3) {
        if (C0387.m7564() > 0) {
            return c0.k((c0) obj, (p9.g) obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m2413(Object obj, Object obj2, Object obj3) {
        if (C0174.m3323() <= 0) {
            return ((ConcurrentHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static g1 m2414(Object obj) {
        if (C0201.m3855() <= 0) {
            return ((u1) obj).f4795c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2415(Object obj) {
        if (C0335.m6491() > 0) {
            return ((s6) obj).D();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۢ, reason: not valid java name and contains not printable characters */
    public static long m2416(Object obj) {
        if (C0469.m9123() <= 0) {
            return ((k0.e) obj).f8850n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static y0 m2417() {
        if (C0299.m5742() > 0) {
            return l.f11578a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2418(Object obj, int i10, int i11) {
        if (C0487.m9464() > 0) {
            return ((String) obj).substring(i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static l3 m2419(Object obj) {
        if (C0461.m8972() > 0) {
            return ((k1) obj).f4609b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2420(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((f0) obj).f8912t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2421(Object obj) {
        if (C0293.m5634() <= 0) {
            return ((a5) obj).f9867b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۢ۟, reason: contains not printable characters */
    public static int m2422(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۢۦۦ, reason: contains not printable characters */
    public static Object m2423(Object obj, Object obj2) {
        if (C0371.m7269() > 0) {
            return ((n) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۥ, reason: contains not printable characters */
    public static int m2424(Object obj) {
        if (C0481.m9354() < 0) {
            return ((zzfi.zzg.zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2425(String str) {
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

    /* JADX INFO: renamed from: ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m2426(Object obj) {
        if (C0000.m12() <= 0) {
            return ((d5.y1) obj).f4867c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m2427(Object obj) {
        if (C0114.m2205() < 0) {
            return ((AtomicInteger) obj).incrementAndGet();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2407(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
