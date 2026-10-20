package com.google.firebase.annotations.concurrent;

import a2.c0;
import a2.e;
import a2.z;
import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0016;
import android.view.Window;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import androidx.versionedparcelable.C0048;
import c4.C0064;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.tracing.C0204;
import d5.g;
import d5.y;
import e2.C0260;
import f0.x1;
import g.C0282;
import g0.C0285;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;
import k0.e5;
import k0.l0;
import k0.u4;
import k0.w4;
import k6.i;
import k6.l4;
import k6.m;
import k6.n;
import k6.o4;
import k6.z4;
import m0.j0;
import m7.C0358;
import p9.q0;
import r1.p;
import r1.x0;
import r7.C0403;
import t.d;
import t.t;
import w4.C0460;
import x0.C0466;
import y.C0474;
import z.C0480;

/* JADX INFO: renamed from: com.google.firebase.annotations.concurrent.۟ۥۤۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0123 {

    /* JADX INFO: renamed from: ۨ۠۠۠, reason: not valid java name and contains not printable characters */
    public static int f149 = -413;

    /* JADX INFO: renamed from: ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static t m2360(Object obj) {
        if (C0113.m2182() < 0) {
            return ((d) obj).f14116i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static l4 m2361(Object obj) {
        if (C0115.m2227() < 0) {
            return ((o4) obj).f10257e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m2362(Object obj) {
        if (C0105.m2045() >= 0) {
            return ((g) obj).f4495a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2363(Object obj) {
        if (C0282.m5446() >= 0) {
            return ((ApplicationInfo) obj).sourceDir;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Window m2364(Object obj) {
        if (C0480.m9354() < 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static SQLiteDatabase m2365(Object obj) {
        if (C0466.m9086() > 0) {
            return ((m) obj).getWritableDatabase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2366(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m2367(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۡ۠۠, reason: not valid java name and contains not printable characters */
    public static q0 m2368(Object obj) {
        if (C0204.m3905() <= 0) {
            return ((MainViewModel) obj).f3125x0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Handler m2369(Object obj) {
        if (C0165.m3154() <= 0) {
            return ((n) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m2370(Object obj) {
        if (C0460.m8972() >= 0) {
            return ((l0) obj).f9151a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static FillElement m2371() {
        if (C0016.m315() >= 0) {
            return c.f1667a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۨ, reason: not valid java name and contains not printable characters */
    public static x0 m2372(Object obj) {
        if (C0048.m925() >= 0) {
            return ((w4) obj).f9629r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۢ, reason: not valid java name and contains not printable characters */
    public static e m2373(Object obj) {
        if (C0260.m4984() >= 0) {
            return ((z) obj).f1052a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static j0 m2374(Object obj) {
        if (C0358.m7035() < 0) {
            return ((x1) obj).f6000b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2376(Object obj) {
        if (C0285.m5504() > 0) {
            obj.notify();
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static i m2377() {
        if (C0064.m1243() >= 0) {
            return i.f10096d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤۡ, reason: not valid java name and contains not printable characters */
    public static c0 m2378(Object obj) {
        if (C0073.m1597() > 0) {
            return ((e5) obj).f8893n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟ۨ, reason: contains not printable characters */
    public static int m2379() {
        return (-190) ^ C0474.f745;
    }

    /* JADX INFO: renamed from: ۦۢ, reason: contains not printable characters */
    public static int m2380(Object obj) {
        if (C0020.m399() < 0) {
            return ((y) obj).f4856f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m2381(Object obj) {
        if (C0403.m7911() <= 0) {
            return u4.c((p) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m2382(Object obj, Object obj2, long j10, Object obj3, Object obj4) {
        if (C0147.m2805() < 0) {
            return ((z4) obj).p((AtomicReference) obj2, j10, (String) obj3, (Runnable) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static String m2375(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
