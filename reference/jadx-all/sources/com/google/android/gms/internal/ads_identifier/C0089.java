package com.google.android.gms.internal.ads_identifier;

import android.os.Bundle;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0028;
import b0.h0;
import b0.j;
import b7.C0054;
import c7.C0069;
import c9.e;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.remoteconfig.interop.C0196;
import d5.b2;
import d5.r1;
import d5.x;
import d7.t;
import f5.q;
import g3.C0289;
import g8.C0294;
import h6.g;
import i.C0316;
import i.C0317;
import i1.f;
import i4.C0318;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import k0.s4;
import k6.c4;
import k6.u7;
import k6.v;
import l6.C0344;
import m0.C0350;
import m0.m;
import m9.e0;
import n1.a;
import p9.z;
import q1.C0384;
import q2.C0385;
import r1.C0394;
import s0.C0410;
import w.h;
import y.t0;
import y0.c;
import y0.o;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads_identifier.۟ۤۨۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0089 {

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f123 = 394;

    /* JADX INFO: renamed from: ۣ۟۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1893(Object obj, Object obj2, int i10) {
        if (C0317.m6120() <= 0) {
            ((r1) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m1894() {
        if (C0054.m1047() >= 0) {
            return "Error storing event aggregates. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static f m1895() {
        if (C0072.m1556() > 0) {
            return g.f7596s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m1896(Object obj, Object obj2, Object obj3, Object obj4, int i10, float f10, Object obj5, Object obj6, boolean z10, boolean z11, Object obj7, Object obj8, Object obj9, Object obj10, int i11, int i12, int i13) {
        if (C0108.m2101() < 0) {
            e0.f((h0) obj, (o) obj2, (t0) obj3, (j) obj4, i10, f10, (c) obj5, (h) obj6, z10, z11, (c9.c) obj7, (a) obj8, (c9.g) obj9, (m) obj10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m1897(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static long m1898() {
        if (C0384.m7523() <= 0) {
            return l0.c.f11014f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1899(Object obj, int i10) {
        if (C0316.m6111() >= 0) {
            ((p) obj).R0(i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static z m1900(Object obj) {
        if (C0117.m2257() >= 0) {
            return ((MainViewModel) obj).f3127y0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m1901(Object obj, Object obj2) {
        if (C0196.m3762() <= 0) {
            return ((zzfi.zzj.zza) obj).zzm((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m1902() {
        return (-246) ^ C0394.f664;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static f m1903() {
        if (C0069.m1332() < 0) {
            return f6.a.S();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ۠, reason: not valid java name and contains not printable characters */
    public static void m1904(Object obj, Object obj2, Object obj3) {
        if (C0294.m5656() >= 0) {
            t.s0((m) obj, obj2, (e) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m1905(Object obj) {
        if (C0289.m5547() >= 0) {
            return ((ArrayDeque) obj).peek();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1906(Object obj, Object obj2) {
        if (C0344.m6738() < 0) {
            return ((c4) obj).d((v) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1907() {
        if (C0165.m3154() < 0) {
            return "Scheduling upload, millis";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1908(Object obj, Object obj2, int i10) {
        if (C0318.m6144() < 0) {
            y3.e.f((c9.f) obj, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m1909(Object obj) {
        if (C0350.m6838() < 0) {
            return ((s4) obj).f9461d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static String m1910(String str) {
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

    /* JADX INFO: renamed from: ۣۦۤۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m1911(Object obj, Object obj2, Object obj3) {
        if (C0028.m557() > 0) {
            return ((q) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ۟, reason: contains not printable characters */
    public static Object m1912(Object obj) {
        if (C0385.m7527() <= 0) {
            return ((Queue) obj).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۨ, reason: contains not printable characters */
    public static void m1914(Object obj, Object obj2, Object obj3) {
        if (C0410.m8037() <= 0) {
            ((u7) obj).C((Bundle) obj2, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m1915(Object obj) {
        if (C0118.m2274() <= 0) {
            return ((b2) obj).f4416a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m1916(Object obj, Object obj2) {
        if (C0024.m487() >= 0) {
            return ((x) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۡ, reason: contains not printable characters */
    public static String m1913(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
