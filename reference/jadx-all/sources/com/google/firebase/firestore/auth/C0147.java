package com.google.firebase.firestore.auth;

import a2.c0;
import a4.t;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.draw.C0027;
import androidx.fragment.app.C0042;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.remoteconfig.interop.C0196;
import d1.d;
import dagger.hilt.migration.C0255;
import e2.C0264;
import f0.C0273;
import f0.a2;
import f0.o;
import f0.w;
import g5.C0292;
import h.C0297;
import h0.v0;
import h6.g;
import i1.f;
import i9.C0322;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import k0.e0;
import k0.g0;
import k0.g4;
import k0.u3;
import k6.x3;
import k8.C0339;
import k9.i;
import k9.l;
import m0.m;
import m7.C0359;
import n9.C0367;
import p8.C0381;
import r8.p;
import t.w1;
import v.h1;
import v5.C0445;
import y.v;
import y0.n;
import y9.C0479;

/* JADX INFO: renamed from: com.google.firebase.firestore.auth.ۨۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0147 {

    /* JADX INFO: renamed from: ۟ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int f172 = 943;

    /* JADX INFO: renamed from: ۟۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m2799(Object obj, Object obj2) {
        if (C0445.m8673() >= 0) {
            return ((w) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static String m2800() {
        if (C0322.m6226() <= 0) {
            return ")";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static v0 m2801(Object obj) {
        if (C0264.m5033() <= 0) {
            return ((o) obj).f5833e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m2802(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2803(Object obj, Object obj2, Object obj3, int i10) {
        if (C0089.m1902() <= 0) {
            ((g4) obj).a((v) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m2804() {
        if (C0255.m4866() <= 0) {
            return "Upload scheduled in approximately ms";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m2805() {
        return (-355) ^ C0273.f388;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static void m2806(Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0381.m7467() >= 0) {
            ((a2) obj).a((h1) obj2, (d) obj3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static c0 m2807(Object obj) {
        if (C0359.m7035() < 0) {
            return ((k0.w) obj).f9588n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static f m2808() {
        if (C0020.m399() <= 0) {
            return g.i0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۧ, reason: not valid java name and contains not printable characters */
    public static long m2809(Object obj) {
        if (C0020.m399() < 0) {
            return ((g0) obj).f8939d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2811(String str) {
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

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2812(Object obj) {
        if (C0292.m5605() <= 0) {
            return ((InputStream) obj).read();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2813(Object obj, Object obj2, Object obj3) {
        if (C0339.m6645() <= 0) {
            return ((k6.f) obj).s((String) obj2, (x3) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Bitmap m2814(Object obj) {
        if (C0108.m2101() < 0) {
            return BitmapFactory.decodeStream((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Buffer m2815(Object obj) {
        if (C0445.m8673() > 0) {
            return ((ByteBuffer) obj).flip();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2816(Object obj, Object obj2, int i10) {
        if (C0367.m7189() >= 0) {
            ((e0) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static float m2817() {
        if (C0297.m5709() <= 0) {
            return l0.m.f11094a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۤۨۡ, reason: contains not printable characters */
    public static i m2818(Object obj, Object obj2) {
        if (C0151.m2903() > 0) {
            return l.F0((c9.c) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟, reason: contains not printable characters */
    public static w1 m2819() {
        if (C0367.m7189() >= 0) {
            return u3.f9529f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۨ, reason: not valid java name and contains not printable characters */
    public static n m2820(Object obj) {
        if (C0196.m3762() <= 0) {
            return ((n) obj).f16730a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۤۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2821(Object obj, Object obj2) {
        if (C0479.m9326() < 0) {
            return p.Q0((Collection) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m2822(Object obj, Object obj2) {
        if (C0042.m820() >= 0) {
            return ((t) obj).b((View) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2823() {
        if (C0078.m1692() > 0) {
            return zznp.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۥۥ, reason: not valid java name and contains not printable characters */
    public static y0.g m2824() {
        if (C0027.m541() >= 0) {
            return y0.a.f16710c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2810(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
