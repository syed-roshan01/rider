package com.google.firebase.installations.ktx;

import a.C0000;
import a5.y;
import androidx.appcompat.widget.C0020;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzhd;
import com.google.firebase.iid.C0170;
import d7.C0221;
import d9.C0226;
import f0.j;
import f0.k1;
import f0.s1;
import f5.e0;
import fa.C0281;
import h8.C0314;
import j2.C0325;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import k0.b5;
import k0.h4;
import k3.C0335;
import n.C0361;
import o1.s;
import p9.z;
import q0.C0383;
import q6.C0387;
import u8.e;
import x.m;
import x5.C0471;
import z.C0482;
import z0.C0483;

/* JADX INFO: renamed from: com.google.firebase.installations.ktx.ۡۥۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0175 {

    /* JADX INFO: renamed from: ۟ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f199 = 562;

    /* JADX INFO: renamed from: ۟۠۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m3329(Object obj, Object obj2) {
        if (C0221.m4261() >= 0) {
            return ((zzfi.zzj.zza) obj).zzg((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static j m3330() {
        if (C0482.m9373() < 0) {
            return j.f5791u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3331(Object obj, char c10) {
        if (C0226.m4339() <= 0) {
            return ((StringBuilder) obj).append(c10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۢ, reason: not valid java name and contains not printable characters */
    public static long m3332(int i10, int i11, int i12, int i13) {
        if (C0361.m7073() <= 0) {
            return s.a(i10, i11, i12, i13);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static long m3333(Object obj) {
        if (C0387.m7564() >= 0) {
            return ((h4) obj).f8984c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3334(Object obj) {
        if (C0170.m3247() < 0) {
            return ((e0) obj).f6253e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3336() {
        if (C0314.m6072() < 0) {
            return "filter_saved";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static zzfc.zza m3337(Object obj) {
        if (C0000.m12() < 0) {
            return ((zzfc.zzd) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3338(Object obj) {
        if (C0335.m6491() > 0) {
            ((HashSet) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static m m3339(Object obj) {
        if (C0326.m6295() >= 0) {
            return ((s1) obj).f5899e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m3340(Object obj, long j10) {
        if (C0325.m6278() < 0) {
            ((k1) obj).f(j10);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static byte[] m3341(Object obj) {
        if (C0020.m399() < 0) {
            return ((zzhd) obj).zzbv();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۧ, reason: contains not printable characters */
    public static String m3342() {
        if (C0281.m5432() > 0) {
            return "Read more than the max allowed user properties, ignoring excess";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۤ, reason: contains not printable characters */
    public static long m3343(Object obj) {
        if (C0086.m1846() > 0) {
            return ((b5) obj).f8753c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۧۢۨ, reason: contains not printable characters */
    public static String m3344(String str) {
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

    /* JADX INFO: renamed from: ۦۨۡ۠, reason: contains not printable characters */
    public static int m3345(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m3346() {
        return 268 ^ C0471.f741;
    }

    /* JADX INFO: renamed from: ۧۨۦۢ, reason: not valid java name and contains not printable characters */
    public static z m3347(Object obj) {
        if (C0383.m7487() <= 0) {
            return ((MainViewModel) obj).L0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۢۧ, reason: not valid java name and contains not printable characters */
    public static e m3348(Object obj, Object obj2, Object obj3) {
        if (C0483.m9389() > 0) {
            return ((y) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3335(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
