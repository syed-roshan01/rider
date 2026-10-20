package com.google.firebase.measurement_impl;

import a2.c0;
import a6.C0007;
import android.graphics.BlendModeColorFilter;
import android.support.v4.graphics.drawable.C0016;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.annotations.C0128;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.c;
import d5.j2;
import d5.l0;
import d8.C0222;
import dagger.hilt.android.C0241;
import e1.m;
import f0.f0;
import f2.j;
import f2.l;
import g4.C0290;
import java.io.ByteArrayOutputStream;
import k0.b1;
import k0.c1;
import k0.c5;
import k6.f5;
import k6.h5;
import k6.v;
import k6.x7;
import l2.i;
import m0.g1;
import o1.h0;
import p9.z;
import s7.C0415;
import t.d;
import t.t;
import t9.C0428;
import u3.C0435;
import u8.e;
import v.k3;
import w5.C0464;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.measurement_impl.۟ۧۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0185 {

    /* JADX INFO: renamed from: ۧۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f209 = 784;

    /* JADX INFO: renamed from: ۟۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static t m3525(Object obj) {
        if (m3538() > 0) {
            return ((d) obj).f14117j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static long m3526(double d10) {
        if (C0222.m4264() >= 0) {
            return Math.round(d10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m3527(Object obj) {
        if (C0016.m315() > 0) {
            return ((Boolean) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3528(Object obj) {
        if (C0174.m3323() < 0) {
            return ((f5) obj).f10026c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3529(Object obj) {
        if (C0073.m1597() > 0) {
            return ((a5.d) obj).f1238c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3530(Object obj) {
        if (C0435.m8498() <= 0) {
            return ((j2) obj).f4592a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۤ, reason: not valid java name and contains not printable characters */
    public static b1 m3531(Object obj) {
        if (C0007.m154() <= 0) {
            return ((c1) obj).f8783d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۣ, reason: not valid java name and contains not printable characters */
    public static e m3532(Object obj, Object obj2, Object obj3) {
        if (C0172.m3296() >= 0) {
            return ((f5.t) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3533(String str) {
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

    /* JADX INFO: renamed from: ۠ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m3534() {
        if (C0128.m2475() < 0) {
            return c.f4326b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static BlendModeColorFilter m3535(Object obj, long j10, int i10) {
        if (C0241.m4609() > 0) {
            return ((m) obj).a(j10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3536(Object obj) {
        if (C0082.m1758() > 0) {
            return ((h5) obj).f10083c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3537(Object obj, Object obj2, long j10, long j11, Object obj3, Object obj4, Object obj5, long j12, Object obj6, Object obj7, long j13, int i10, boolean z10, int i11, int i12, Object obj8, Object obj9, Object obj10, int i13, int i14, int i15) {
        if (C0197.m3786() <= 0) {
            c5.b((String) obj, (o) obj2, j10, j11, (j) obj3, (l) obj4, (f2.e) obj5, j12, (l2.j) obj6, (i) obj7, j13, i10, z10, i11, i12, (c9.c) obj8, (c0) obj9, (m0.m) obj10, i13, i14, i15);
        }
    }

    /* JADX INFO: renamed from: ۤۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3538() {
        return 176 ^ C0428.f698;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۦ, reason: contains not printable characters */
    public static int m3540(Object obj) {
        if (C0007.m154() < 0) {
            return ((f0) obj).f5695a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static Object m3541(Object obj, Object obj2, int i10) {
        if (C0290.m5580() <= 0) {
            return k3.b((h0) obj, (2 & 1) != 0, (2 & 2) != 0 ? o1.l.f12401b : null, (e) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static void m3542(Object obj, Object obj2, Object obj3) {
        if (C0158.m3012() > 0) {
            ((h5) obj).g((v) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۦۢۤ, reason: contains not printable characters */
    public static g1 m3543(Object obj) {
        if (C0464.m9033() > 0) {
            return ((l0) obj).f4648e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢۥ, reason: contains not printable characters */
    public static int m3544(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static z m3545(Object obj) {
        if (C0415.m8130() < 0) {
            return ((MainViewModel) obj).K;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3539(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
