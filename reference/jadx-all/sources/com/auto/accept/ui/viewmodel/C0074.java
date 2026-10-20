package com.auto.accept.ui.viewmodel;

import androidx.compose.ui.node.a;
import c0.C0057;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.protobuf.v;
import d3.C0217;
import d5.g1;
import d5.i;
import d5.i2;
import d5.s1;
import d7.C0221;
import dagger.hilt.android.components.C0228;
import e1.C0258;
import e1.l0;
import f0.c2;
import f0.o;
import f0.t0;
import h5.C0308;
import h7.C0311;
import ia.C0323;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import k0.t3;
import k6.f5;
import k6.v5;
import k6.x;
import k6.x3;
import k6.x7;
import k6.y5;
import l0.C0341;
import l0.c;
import l9.h;
import m0.l3;
import m0.q;
import q7.C0390;
import s3.C0413;
import u4.C0437;
import v7.C0450;
import z.C0482;

/* JADX INFO: renamed from: com.auto.accept.ui.viewmodel.ۦۨۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0074 {

    /* JADX INFO: renamed from: ۢۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int f108 = -685;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static c2 m1602(Object obj) {
        if (C0228.m4380() >= 0) {
            return ((o) obj).f5830b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m1603() {
        if (C0258.m4918() > 0) {
            return "app_id=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Integer m1604(Object obj) {
        if (C0311.m5997() >= 0) {
            return h.D0((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1605(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1606() {
        if (C0450.m8755() > 0) {
            return zzpf.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m1607() {
        return 249 ^ C0311.f458;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static v5 m1608(Object obj) {
        if (C0170.m3247() <= 0) {
            return ((y5) obj).f10569d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1609(Object obj) {
        if (C0308.m5935() >= 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static a m1610(Object obj) {
        if (C0323.m6244() > 0) {
            return ((a) obj).q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m1611(Object obj) {
        if (C0341.m6681() >= 0) {
            return ((i) obj).f4559o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Map m1612(Object obj) {
        if (C0133.m2559() > 0) {
            return ((zzfy) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static l3 m1613(Object obj) {
        if (C0057.m1090() <= 0) {
            return ((g1) obj).f4517n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static Serializable m1614(Object obj) {
        if (C0117.m2257() > 0) {
            return ((s1) obj).f4773c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m1615(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m1616() {
        if (C0138.m2662() >= 0) {
            return "Anti-Detection (Stealth Mode)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static x3 m1618() {
        if (C0111.m2143() > 0) {
            return x.f10520y0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1619(Object obj, byte b10) {
        if (C0169.m3245() > 0) {
            ((v) obj).r0(b10);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static long m1620() {
        if (C0482.m9373() < 0) {
            return c.f11034z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1621(Object obj) {
        if (C0308.m5935() >= 0) {
            ((f5) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۤۨۥۤ, reason: not valid java name and contains not printable characters */
    public static l0 m1622(Object obj) {
        if (C0413.m8089() < 0) {
            return ((t3) obj).f9495o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟۠, reason: contains not printable characters */
    public static t0 m1623() {
        if (C0390.m7627() <= 0) {
            return t0.O;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1624(Object obj) {
        if (C0217.m4114() < 0) {
            return ((x7) obj).f10543a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1625(Object obj) {
        if (C0221.m4261() >= 0) {
            return ((q) obj).G();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۤۡ, reason: not valid java name and contains not printable characters */
    public static m0.g1 m1626(Object obj) {
        if (C0437.m8524() <= 0) {
            return ((i2) obj).f4580c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1617(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
