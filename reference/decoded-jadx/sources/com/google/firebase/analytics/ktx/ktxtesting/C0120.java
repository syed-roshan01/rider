package com.google.firebase.analytics.ktx.ktxtesting;

import android.app.NotificationChannel;
import android.view.View;
import androidx.fragment.app.C0042;
import c9.a;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.measurement.C0181;
import dagger.hilt.migration.C0254;
import ea.C0267;
import f0.v;
import g2.a0;
import g2.b0;
import g2.h0;
import g2.j;
import h0.C0299;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import k6.b4;
import k6.b6;
import k6.p;
import k6.p7;
import k6.q3;
import k6.s5;
import k6.y5;
import m0.C0349;
import m0.c;
import m0.m;
import m5.C0355;
import okhttp3.internal.publicsuffix.C0372;
import p8.C0379;
import r1.e1;
import v5.C0444;
import w2.C0457;
import y0.o;
import y3.e;

/* JADX INFO: renamed from: com.google.firebase.analytics.ktx.ktxtesting.۟ۧۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0120 {

    /* JADX INFO: renamed from: ۣ۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int f146 = 479;

    /* JADX INFO: renamed from: ۟۠۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m2308(Object obj, boolean z10) {
        if (C0081.m1735() > 0) {
            ((NotificationChannel) obj).setShowBadge(z10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2309(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static b4 m2310(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((q3) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2311() {
        return 295 ^ C0355.f626;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static y5 m2312(Object obj) {
        if (C0267.m5113() <= 0) {
            return ((b6) obj).f9917c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2313(Object obj, Object obj2) {
        if (C0042.m820() > 0) {
            return ((p7) obj).b((s5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2314(Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, int i11) {
        if (C0372.m7309() < 0) {
            e.k((MainViewModel) obj, (String) obj2, i10, (String) obj3, (a) obj4, (m) obj5, i11);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m2315(Object obj, float f10) {
        if (C0102.m2007() >= 0) {
            ((View) obj).setElevation(f10);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۨ, reason: not valid java name and contains not printable characters */
    public static URLConnection m2316(Object obj, Object obj2, Object obj3) {
        if (C0379.m7433() > 0) {
            return ((zzcd) obj).zza((URL) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2317(Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0349.m6838() <= 0) {
            e1.b((o) obj, (c9.e) obj2, (m) obj3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۡۧۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2318(Object obj) {
        if (C0181.m3452() < 0) {
            return ((c) obj).f11464a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static Iterator m2319(Object obj) {
        if (C0254.m4866() <= 0) {
            return ((q.c) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static h0 m2320(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0299.m5752() <= 0) {
            return a.a.d((b0) obj, (a0) obj2, (j) obj3, (g2.o) obj4, (v) obj5, (v) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۡ, reason: contains not printable characters */
    public static long m2321(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((p) obj).f10264d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2322(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۡۢۢ, reason: not valid java name and contains not printable characters */
    public static f m2324() {
        if (C0457.m8901() < 0) {
            return z6.a.f17304e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2323(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
