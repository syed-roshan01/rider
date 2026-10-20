package com.google.firebase.database.collection;

import a5.n;
import android.support.v4.app.C0015;
import b2.v;
import c3.C0062;
import c9.e;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.C0179;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfiginterop.C0203;
import d3.C0216;
import dagger.hilt.migration.C0254;
import f0.o;
import fa.C0279;
import g7.C0292;
import h.C0296;
import h0.h;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicLong;
import k0.l4;
import k0.m0;
import k0.w;
import k6.i;
import k6.w4;
import k6.x7;
import k6.z3;
import m0.l3;
import n.C0360;
import n1.C0362;
import p9.z;
import q0.C0382;
import q5.C0385;
import r.C0392;
import x.d;
import z0.C0482;

/* JADX INFO: renamed from: com.google.firebase.database.collection.ۨۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0138 {

    /* JADX INFO: renamed from: ۟ۤۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int f164 = -566;

    /* JADX INFO: renamed from: ۣ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m2660(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0062.m1186() > 0) {
            return ((m0) obj).e(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2661(Object obj, int i10) {
        if (C0015.m294() <= 0) {
            return ((w4) obj).h(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m2662() {
        return 713 ^ C0360.f631;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۨ, reason: not valid java name and contains not printable characters */
    public static l3 m2663(Object obj) {
        if (C0382.m7487() < 0) {
            return ((o) obj).f5831c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static l4 m2664() {
        if (C0482.m9389() >= 0) {
            return l4.f9188c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2665(Object obj) {
        if (C0254.m4866() <= 0) {
            return ((v) obj).f2580f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2666(Object obj, long j10) {
        if (C0385.m7546() > 0) {
            ((AtomicLong) obj).set(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static e m2668(Object obj) {
        if (C0362.m7099() < 0) {
            return ((w) obj).f9595u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2669() {
        if (C0201.m3855() <= 0) {
            return FirebaseAnalytics.Param.ORIGIN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۢ, reason: not valid java name and contains not printable characters */
    public static i m2670() {
        if (C0392.m7675() <= 0) {
            return i.f10095c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2671(Object obj) {
        if (C0203.m3894() > 0) {
            return ((AppConfig) obj).getForceUpdater();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2672(Object obj) {
        if (C0296.m5709() <= 0) {
            return ((n) obj).f1289a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2673(Object obj, int i10, int i11) {
        if (C0113.m2182() < 0) {
            ((h) obj).l(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static d m2674(Object obj) {
        if (C0279.m5406() <= 0) {
            return ((x.e) obj).f16266a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static long m2675(Object obj) {
        if (C0216.m4114() <= 0) {
            return ((z3) obj).f10603o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۦۥۡ, reason: contains not printable characters */
    public static String m2676(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦۦۦۨ, reason: contains not printable characters */
    public static z m2677(Object obj) {
        if (C0292.m5634() < 0) {
            return ((MainViewModel) obj).f3093h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2678(Object obj) {
        if (C0179.m3417() > 0) {
            return ((x7) obj).f10544b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2679(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2667(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
