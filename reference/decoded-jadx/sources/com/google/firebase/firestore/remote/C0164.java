package com.google.firebase.firestore.remote;

import android.os.C0013;
import android.util.SparseArray;
import androidx.appcompat.widget.C0020;
import androidx.core.content.C0041;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.C0127;
import com.google.firebase.emulators.C0141;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.messaging.reporting.C0188;
import d5.a0;
import d5.k2;
import d7.C0219;
import dagger.hilt.internal.C0253;
import f5.g0;
import h5.C0306;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k6.c4;
import k6.l4;
import k6.n;
import k6.p;
import k6.r7;
import m0.z1;
import q1.C0383;
import t8.C0426;
import u2.C0433;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.۟۟ۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0164 {

    /* JADX INFO: renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int f188 = 413;

    /* JADX INFO: renamed from: ۟۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m3134(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m3135() {
        if (C0433.m8481() > 0) {
            return "Error querying user properties. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static SparseArray m3136(Object obj) {
        if (C0127.m2448() > 0) {
            return ((l4) obj).t();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3137() {
        if (C0118.m2274() <= 0) {
            return "(2)Too many active user properties, ignoring";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3138(Object obj) {
        if (C0020.m399() <= 0) {
            return ((k2) obj).f4612a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static Map m3139(Object obj) {
        if (C0306.m5925() < 0) {
            return ((a0) obj).f4387b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤ۠, reason: not valid java name and contains not printable characters */
    public static Double m3140(Object obj) {
        if (C0329.m6367() >= 0) {
            return l9.h.B0((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m3141(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3142() {
        if (C0167.m3200() > 0) {
            return "English";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3143(Object obj) {
        if (C0141.m2714() < 0) {
            return ((p) obj).f10263c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static u m3144() {
        if (C0383.m7523() < 0) {
            return r.f16825j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3145(Object obj) {
        if (C0041.m812() >= 0) {
            return ((g0) obj).f6270s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static zzkm m3146(Object obj, Object obj2) {
        if (C0253.m4844() > 0) {
            return r7.x((zzix.zzb) obj, (byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m3148(Object obj) {
        if (C0219.m4237() >= 0) {
            return ((zzfi.zzj.zza) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static String m3149(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0013.m253() >= 0) {
            return c4.c((String) obj, (String[]) obj2, (String[]) obj3, (AtomicReference) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static void m3150(Object obj) {
        if (C0101.m1975() >= 0) {
            ((n) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۦۣۨۧ, reason: contains not printable characters */
    public static Object m3151(Object obj) {
        if (C0188.m3594() > 0) {
            return ((z1) obj).f11771c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m3152(float f10, float f11) {
        if (C0087.m1852() > 0) {
            return d9.i.f(f10, f11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3153() {
        return 401 ^ C0426.f697;
    }

    /* JADX INFO: renamed from: ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3147(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
