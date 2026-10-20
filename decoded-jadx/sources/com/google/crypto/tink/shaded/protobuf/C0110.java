package com.google.crypto.tink.shaded.protobuf;

import androidx.compose.ui.draw.C0027;
import androidx.versionedparcelable.C0048;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.codegen.C0242;
import dagger.hilt.components.C0244;
import h1.C0300;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import k0.m4;
import k6.l4;
import k6.p4;
import o5.C0370;
import p0.C0374;
import q5.C0385;
import r5.C0400;
import w4.C0461;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ۣۡۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0110 {

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f136 = 475;

    /* JADX INFO: renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2122(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m2123() {
        return 423 ^ C0048.f68;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦ۠, reason: not valid java name and contains not printable characters */
    public static int m2124(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static long m2126(Object obj) {
        if (C0461.m8993() > 0) {
            return ((m4) obj).f9223c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static a2.c0 m2127() {
        if (C0385.m7546() > 0) {
            return l0.u.f11186k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۡ, reason: not valid java name and contains not printable characters */
    public static AppConfig m2128(Object obj, boolean z10, boolean z11, int i10, int i11, int i12, Object obj2, Object obj3, boolean z12, Object obj4, boolean z13, long j10, long j11, Object obj5, Object obj6, boolean z14, Object obj7, Object obj8, int i13, boolean z15, Object obj9, int i14, int i15, int i16, int i17, int i18, Object obj10, Object obj11, boolean z16, boolean z17, Object obj12, Object obj13, boolean z18) {
        if (C0300.m5773() < 0) {
            return ((AppConfig) obj).copy(z10, z11, i10, i11, i12, (String) obj2, (String) obj3, z12, (String) obj4, z13, j10, j11, (Map) obj5, (List) obj6, z14, (String) obj7, (String) obj8, i13, z15, (String) obj9, i14, i15, i16, i17, i18, (String) obj10, (String) obj11, z16, z17, (List) obj12, (String) obj13, z18);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m2129(Object obj) {
        if (C0244.m4685() > 0) {
            return ((a5.i) obj).f1268a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤ۠, reason: not valid java name and contains not printable characters */
    public static l4 m2130(Object obj) {
        if (C0235.m4538() > 0) {
            return ((p4) obj).f10275e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟۟, reason: not valid java name and contains not printable characters */
    public static long m2131(Object obj) {
        if (C0323.m6259() <= 0) {
            return ((y3.c) obj).f16888d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤۢ۟, reason: contains not printable characters */
    public static List m2132(Object obj) {
        if (C0242.m4660() < 0) {
            return ((zzfc.zzd) obj).zzo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m2133(Object obj) {
        if (C0400.m7847() < 0) {
            return ((f0.m1) obj).f5816a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static g2.l0 m2134(Object obj) {
        if (C0370.m7269() > 0) {
            return ((k0.n1) obj).f9254d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۡۦ, reason: not valid java name and contains not printable characters */
    public static b.l m2135(Object obj) {
        if (C0027.m541() >= 0) {
            return ((d5.g1) obj).f4515e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤۢ, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m2136(Object obj) {
        if (C0374.m7350() <= 0) {
            return ((zzfi.zze.zza) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2125(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
