package com.auto.accept.data.model;

import a2.c0;
import android.content.Intent;
import android.os.BaseBundle;
import b8.C0055;
import c9.e;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.remote.C0163;
import dagger.hilt.android.migration.C0238;
import e7.C0264;
import fa.C0279;
import g2.C0287;
import g9.C0294;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.b3;
import k0.e3;
import k0.j2;
import k0.k3;
import k0.l0;
import k0.p;
import m0.C0349;
import m0.l3;
import m0.m;
import q7.C0389;
import r1.i1;
import r7.C0403;
import s2.C0411;
import t0.C0418;
import v9.C0451;
import w6.C0464;

/* JADX INFO: renamed from: com.auto.accept.data.model.ۣ۟ۥۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0071 {

    /* JADX INFO: renamed from: ۥۢۥۣ, reason: contains not printable characters */
    public static int f98 = -530;

    /* JADX INFO: renamed from: ۟ۢۡۦۦ, reason: not valid java name and contains not printable characters */
    public static e m1448(Object obj) {
        if (C0264.m5062() < 0) {
            return ((e3) obj).f8867a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۤ, reason: not valid java name and contains not printable characters */
    public static e m1449(Object obj) {
        if (C0403.m7911() <= 0) {
            return ((p) obj).f9331f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1450() {
        if (C0349.m6838() < 0) {
            return "main_event_params";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۦ, reason: not valid java name and contains not printable characters */
    public static l3 m1451(Object obj) {
        if (C0238.m4587() <= 0) {
            return ((d5.e) obj).f4463n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1452(Object obj) {
        if (C0411.m8066() < 0) {
            return ((b3) obj).f8745o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m1453(Object obj, Object obj2, Object obj3, Object obj4, long j10, long j11, Object obj5, int i10) {
        if (C0163.m3132() > 0) {
            k3.c((e) obj, (e) obj2, (e) obj3, (c0) obj4, j10, j11, (m) obj5, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Intent m1454(Object obj, int i10) {
        if (C0389.m7627() < 0) {
            return ((Intent) obj).addFlags(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static l0 m1455() {
        if (C0055.m1056() > 0) {
            return l0.f9140f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1456() {
        if (C0151.m2903() > 0) {
            return "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۤ, reason: not valid java name and contains not printable characters */
    public static String m1457(String str) {
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

    /* JADX INFO: renamed from: ۤۥۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1458() {
        return (-4) ^ C0279.f424;
    }

    /* JADX INFO: renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1459(Object obj) {
        if (C0451.m8793() < 0) {
            ((f) obj).disconnect();
        }
    }

    /* JADX INFO: renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static long[] m1460(Object obj, Object obj2) {
        if (C0464.m9059() <= 0) {
            return ((BaseBundle) obj).getLongArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۦۤ, reason: contains not printable characters */
    public static e m1461(Object obj) {
        if (C0294.m5663() > 0) {
            return ((j2) obj).f9072o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۤۦ, reason: not valid java name and contains not printable characters */
    public static List m1463(Object obj, Object obj2, Object obj3) {
        if (C0418.m8221() >= 0) {
            return ((i1) obj).H(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m1464(Object obj, boolean z10) {
        if (C0323.m6259() <= 0) {
            return ((zzfi.zzb.zza) obj).zzd(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1465(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1466(double d10) {
        if (C0287.m5529() > 0) {
            return Double.hashCode(d10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۡ۟, reason: contains not printable characters */
    public static String m1462(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
