package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.measurement.C0183;
import d1.C0214;
import d5.C0219;
import d5.y0;
import e1.C0258;
import g7.C0293;
import h3.C0302;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.concurrent.FutureTask;
import k0.g1;
import k0.q1;
import k4.C0337;
import k6.s5;
import k6.u7;
import k8.C0339;
import m0.l3;
import o1.C0368;
import s0.C0410;
import v0.C0444;
import v9.C0452;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ۣ۟۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0082 {

    /* JADX INFO: renamed from: ۟۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int f116 = 377;

    /* JADX INFO: renamed from: ۟۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static long m1751() {
        if (C0126.m2434() > 0) {
            return g1.f8941b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡۦ, reason: not valid java name and contains not printable characters */
    public static s5 m1752(Object obj) {
        if (C0214.m4083() <= 0) {
            return s5.d((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m1754(Object obj) {
        if (C0410.m8037() <= 0) {
            ((FutureTask) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static b0.h0 m1755(Object obj) {
        if (C0258.m4918() >= 0) {
            return ((d5.v0) obj).f4808s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static void m1756(Object obj) {
        if (C0128.m2475() < 0) {
            ((Parcel) obj).recycle();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1757(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z10, boolean z11) {
        if (C0337.m6515() < 0) {
            return ((u7) obj).r((String) obj2, (String) obj3, obj4, (Bundle) obj5, (List) obj6, z10, z11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1758() {
        return 755 ^ C0452.f722;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1759(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۦۡ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn.zza m1760(Object obj) {
        if (C0302.m5797() <= 0) {
            return ((zzfi.zzn.zza) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m1761(Object obj, Object obj2) {
        if (C0293.m5634() < 0) {
            return ((FileChannel) obj).read((ByteBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static float m1762() {
        if (C0219.m4224() < 0) {
            return k0.n.f9248b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static i1.f m1763(Object obj) {
        if (C0090.m1920() > 0) {
            return ((y0) obj).f4862e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥ۠, reason: not valid java name and contains not printable characters */
    public static u8.e m1764(Object obj, Object obj2, Object obj3) {
        if (C0152.m2931() >= 0) {
            return ((f5.x) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1765(Object obj) {
        if (C0368.m7199() < 0) {
            return ((k0.b0) obj).f8725a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static l3 m1766(Object obj) {
        if (C0444.m8654() <= 0) {
            return ((d5.g1) obj).f4516f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧۡ, reason: not valid java name and contains not printable characters */
    public static zzs m1767() {
        if (C0339.m6645() < 0) {
            return zzs.WARN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static long m1768(Object obj) {
        if (C0183.m3510() > 0) {
            return ((f5.k) obj).f6285n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m1769(Object obj) {
        if (C0138.m2662() >= 0) {
            return ((q1) obj).f9374b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1770(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m1753(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
