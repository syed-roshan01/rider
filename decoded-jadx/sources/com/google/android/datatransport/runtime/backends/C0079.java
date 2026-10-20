package com.google.android.datatransport.runtime.backends;

import a8.C0009;
import aa.C0012;
import android.widget.Toast;
import androidx.compose.ui.draw.C0027;
import b0.h0;
import b1.C0050;
import c5.c;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement.C0182;
import d5.e1;
import d5.s0;
import e1.C0259;
import e1.l0;
import g.C0282;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import k0.d0;
import k0.i;
import k0.p1;
import k6.n6;
import k6.v7;
import k6.z4;
import m0.m;
import n9.C0366;
import o2.C0368;
import p9.q0;
import q6.C0386;
import t0.C0418;
import t1.p;
import u0.b;
import u8.e;
import w9.C0465;
import x9.g;
import y0.o;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.backends.ۦۣۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0079 {

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int f113 = -556;

    /* JADX INFO: renamed from: ۟ۡۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1701() {
        return (-868) ^ C0386.f657;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static void m1702(Object obj) {
        if (C0169.m3245() >= 0) {
            ((Toast) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۢ, reason: not valid java name and contains not printable characters */
    public static float m1703(Object obj) {
        if (C0418.m8221() > 0) {
            return ((d0) obj).f8819e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1704(Object obj, int i10, Object obj2, Object obj3, Object obj4) {
        if (C0071.m1458() > 0) {
            ((n6) obj).a(i10, (IOException) obj2, (byte[]) obj3, (Map) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static b m1705() {
        if (C0282.m5446() >= 0) {
            return c.f2972d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1706(Object obj) {
        if (C0009.m177() > 0) {
            return ((p1) obj).f9352z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1707(Object obj) {
        if (C0368.m7234() >= 0) {
            return ((v7) obj).f10445a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1708(String str) {
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

    /* JADX INFO: renamed from: ۡ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static e m1709(Object obj, Object obj2, Object obj3) {
        if (C0050.m982() <= 0) {
            return ((e1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦۦ, reason: not valid java name and contains not printable characters */
    public static p m1710() {
        if (C0465.m9068() < 0) {
            return g.f16391c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1711(Object obj) {
        if (C0012.m226() > 0) {
            return ((zzfc.zza) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static q0 m1712(Object obj) {
        if (C0366.m7189() > 0) {
            return ((MainViewModel) obj).R;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ۟, reason: contains not printable characters */
    public static void m1713(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, long j10, float f10, long j11, long j12, long j13, long j14, Object obj7, int i10, int i11, int i12) {
        if (C0259.m4959() < 0) {
            i.a((c9.e) obj, (o) obj2, (c9.e) obj3, (c9.e) obj4, (c9.e) obj5, (l0) obj6, j10, f10, j11, j12, j13, j14, (m) obj7, i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۧۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1714(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤۧۥ, reason: not valid java name and contains not printable characters */
    public static void m1715(Object obj) {
        if (C0027.m541() > 0) {
            ((z4) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۨۨۡ۠, reason: not valid java name and contains not printable characters */
    public static h0 m1716(Object obj) {
        if (C0182.m3488() > 0) {
            return ((s0) obj).f4769b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1700(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
