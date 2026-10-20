package com.google.android.datatransport.cct;

import a2.e;
import a5.o;
import a5.p;
import androidx.compose.ui.node.C0037;
import androidx.core.app.C0040;
import c1.C0058;
import c9.f;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.firebase.remoteconfiginterop.C0203;
import d9.C0224;
import dagger.hilt.android.C0240;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.aggregatedroot.C0246;
import f0.h;
import f6.C0278;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import k0.i0;
import k0.l2;
import k0.m4;
import k0.s3;
import k0.y0;
import m0.j0;
import m0.m3;
import o1.C0367;
import p9.z;
import u1.f2;
import v5.C0444;
import w0.i;
import x.m;
import y0.n;
import z4.d;
import z4.g;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.ۤۨۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0077 {

    /* JADX INFO: renamed from: ۧ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int f111 = -660;

    /* JADX INFO: renamed from: ۟۠ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static List m1659(Object obj) {
        if (C0085.m1825() > 0) {
            return ((g) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1660(Object obj) {
        if (C0108.m2101() < 0) {
            return ((File) obj).isDirectory();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1661(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1662(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۢۤۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1663() {
        return (-911) ^ C0037.f57;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m1664(Object obj, Object obj2) {
        if (C0330.m6374() > 0) {
            return ((zzfi.zzg.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m1665(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((o) obj).f1290a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static long m1666(Object obj) {
        if (C0058.m1106() >= 0) {
            return ((i0) obj).f9000d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static i m1667() {
        if (C0224.m4316() > 0) {
            return y0.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int m1668(Object obj) {
        if (C0278.m5394() >= 0) {
            return ((h) obj).f5726w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۧۡ, reason: not valid java name and contains not printable characters */
    public static m m1669(Object obj) {
        if (C0246.m4717() <= 0) {
            return ((s3) obj).f9455n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤۧ, reason: not valid java name and contains not printable characters */
    public static long m1670(Object obj) {
        if (C0201.m3855() <= 0) {
            return ((m4) obj).f9237q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧۥۢ, reason: contains not printable characters */
    public static m3 m1671() {
        if (C0367.m7199() <= 0) {
            return f2.f15090a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۤ, reason: contains not printable characters */
    public static int m1673(Object obj) {
        if (C0193.m3691() < 0) {
            return ((n) obj).f16733d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ۟, reason: contains not printable characters */
    public static f m1674(Object obj) {
        if (C0199.m3818() > 0) {
            return ((l2) obj).f9180q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۤ, reason: contains not printable characters */
    public static z m1675(Object obj) {
        if (C0203.m3894() >= 0) {
            return ((d) obj).K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨ۟, reason: contains not printable characters */
    public static Object m1676(Object obj, Object obj2) {
        if (C0234.m4512() > 0) {
            return ((p) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m1677(Object obj) {
        if (C0240.m4609() >= 0) {
            return ((j0) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۨ, reason: not valid java name and contains not printable characters */
    public static e m1678() {
        if (C0040.m792() >= 0) {
            return a2.f.f923a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨۥ, reason: contains not printable characters */
    public static String m1672(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
