package com.google.android.gms.tasks;

import a.C0000;
import a5.o;
import a5.z;
import androidx.compose.foundation.layout.C0021;
import c4.C0064;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.C0111;
import d5.g0;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.internal.aliasof.C0248;
import ea.C0268;
import f0.v1;
import h.C0299;
import h3.C0304;
import i5.C0319;
import i9.C0322;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.i4;
import k6.p6;
import k6.u;
import k6.x;
import k6.x3;
import m0.q2;
import o4.C0370;
import o7.d0;
import r5.C0401;

/* JADX INFO: renamed from: com.google.android.gms.tasks.ۡۤۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0106 {

    /* JADX INFO: renamed from: ۥۢ۠ۡ, reason: contains not printable characters */
    public static int f132 = -236;

    /* JADX INFO: renamed from: ۟۠ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static int m2054(Object obj) {
        if (C0021.m417() > 0) {
            return ((zzfi.zzg) obj).zzc();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m2055(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static List m2057(Object obj) {
        if (C0064.m1243() > 0) {
            return ((i4) obj).f9049o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2058(Object obj, int i10, int i11) {
        if (C0304.m5859() < 0) {
            ((q2) obj).w(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2059(Object obj) {
        if (C0322.m6226() < 0) {
            return ((v1) obj).f5975b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2060(Object obj, Object obj2) {
        if (C0268.m5113() <= 0) {
            return ((p6) obj).v((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2061(int i10, int i11, int i12) {
        if (C0111.m2143() > 0) {
            d0.u(i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static x3 m2062() {
        if (C0370.m7254() > 0) {
            return x.f10477c0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2063(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2064(Object obj) {
        if (C0319.m6163() <= 0) {
            return ((AppConfig) obj).getDialogMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Iterable m2065(Object obj) {
        if (C0236.m4538() > 0) {
            return ((u) obj).f10412c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static x3 m2066() {
        if (C0401.m7847() < 0) {
            return x.H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2067() {
        return (-412) ^ C0000.f768;
    }

    /* JADX INFO: renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static zzew.zzf.zza m2068() {
        if (C0248.m4732() < 0) {
            return zzew.zzf.zza.UNKNOWN_MATCH_TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۨ, reason: contains not printable characters */
    public static z m2069(Object obj) {
        if (C0299.m5742() > 0) {
            return ((o) obj).f1291b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2070(Object obj) {
        if (C0108.m2101() < 0) {
            return ((g0) obj).f4509d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m2056(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
