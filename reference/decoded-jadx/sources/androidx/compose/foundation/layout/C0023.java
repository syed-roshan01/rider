package androidx.compose.foundation.layout;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.iid.C0171;
import com.google.firebase.remoteconfig.interop.C0198;
import d5.s1;
import d9.C0225;
import dagger.hilt.android.C0240;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e1.l0;
import f0.c1;
import f6.C0277;
import fa.C0281;
import g2.C0286;
import g3.C0288;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.f0;
import k0.h;
import k0.i0;
import k0.r4;
import k6.l4;
import k6.n4;
import k6.t;
import k6.u7;
import k6.z6;
import l0.g;
import p7.C0378;
import q1.C0383;
import t1.C0419;
import u7.C0437;
import v9.C0452;
import x8.C0473;
import y0.n;
import y6.C0477;
import z.C0481;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.ۧۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0023 {

    /* JADX INFO: renamed from: ۥۨ۠۠, reason: contains not printable characters */
    public static int f43 = -949;

    /* JADX INFO: renamed from: ۟۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m445(Object obj, Object obj2) {
        if (C0225.m4339() < 0) {
            return ((c1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m446(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static Context m447(Object obj) {
        if (C0452.m8825() > 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m448() {
        if (C0281.m5443() < 0) {
            return g.f11051e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۡ, reason: not valid java name and contains not printable characters */
    public static void m449(Object obj, Object obj2) {
        if (C0240.m4609() >= 0) {
            ((TaskCompletionSource) obj).setResult(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟۟, reason: not valid java name and contains not printable characters */
    public static long m450() {
        if (C0481.m9373() <= 0) {
            return l0.c.G;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static l0 m451(Object obj) {
        if (C0277.m5361() <= 0) {
            return ((f0) obj).f8904e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m453(Object obj) {
        if (C0245.m4710() > 0) {
            return ((s1) obj).f4772b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۦ, reason: not valid java name and contains not printable characters */
    public static String m454(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m455(Object obj) {
        if (C0288.m5547() >= 0) {
            return ((z6) obj).f10617a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static n m456(Object obj) {
        if (C0419.m8247() >= 0) {
            return ((n) obj).f16735f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static n4 m457(Object obj) {
        if (C0473.m9210() <= 0) {
            return ((l4) obj).f10186s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static zzew.zze m458(Object obj) {
        if (C0383.m7523() <= 0) {
            return ((k6.c) obj).f9923g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m459(Object obj, Object obj2) {
        if (C0452.m8825() > 0) {
            return ((zzfi.zzj.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m460(Object obj, int i10, boolean z10) {
        if (C0378.m7420() >= 0) {
            return u7.y((String) obj, i10, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m461() {
        return 452 ^ C0198.f222;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۢ, reason: contains not printable characters */
    public static void m462(Object obj) {
        if (C0115.m2227() < 0) {
            ((List) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۥۧۢۢ, reason: contains not printable characters */
    public static int m463(Object obj) {
        if (C0477.m9312() <= 0) {
            return ((h) obj).f8962d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۤۢ, reason: contains not printable characters */
    public static Long m464(Object obj) {
        if (C0171.m3272() < 0) {
            return ((t) obj).f10374j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠۟, reason: contains not printable characters */
    public static boolean m465(Object obj) {
        if (C0286.m5522() > 0) {
            return ((r4) obj).f9426d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۢۡ, reason: not valid java name and contains not printable characters */
    public static long m466(Object obj) {
        if (C0437.m8543() >= 0) {
            return ((i0) obj).f9004h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m452(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
