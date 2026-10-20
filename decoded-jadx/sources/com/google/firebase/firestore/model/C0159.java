package com.google.firebase.firestore.model;

import a2.m;
import android.database.sqlite.SQLiteDatabase;
import android.os.BaseBundle;
import android.os.Parcel;
import androidx.compose.ui.platform.C0038;
import androidx.fragment.app.C0042;
import androidx.lifecycle.C0043;
import c3.C0063;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.abt.C0112;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.measurement.C0181;
import d5.d1;
import d5.h2;
import d5.q0;
import d5.y0;
import dagger.hilt.android.lifecycle.C0236;
import e1.C0258;
import e1.n;
import f0.a1;
import f0.d2;
import f0.z0;
import g2.C0286;
import ga.C0295;
import h1.c;
import i6.C0320;
import i9.C0321;
import java.io.ByteArrayOutputStream;
import k0.k2;
import k2.C0333;
import k6.x7;
import l0.d;
import okhttp3.internal.publicsuffix.C0372;
import r1.s;
import t.d0;
import t.w;
import u1.k1;
import u4.C0436;

/* JADX INFO: renamed from: com.google.firebase.firestore.model.۟ۥۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0159 {

    /* JADX INFO: renamed from: ۠ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int f183 = 18;

    /* JADX INFO: renamed from: ۟۠ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m3027(Object obj, Object obj2) {
        if (C0063.m1217() > 0) {
            return ((q0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static w m3028() {
        if (C0181.m3452() <= 0) {
            return d0.f14121b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3029(Object obj) {
        if (C0112.m2176() > 0) {
            return ((zzfi.zze) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3030() {
        return 626 ^ C0236.f316;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m3031(Object obj) {
        if (C0320.m6200() > 0) {
            return ((k2) obj).f9108f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static float m3032(Object obj) {
        if (C0258.m4939() <= 0) {
            return ((m) obj).f952f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static k1 m3033() {
        if (C0321.m6226() <= 0) {
            return k1.f15145a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۥ, reason: not valid java name and contains not printable characters */
    public static s m3034(Object obj) {
        if (C0042.m820() > 0) {
            return ((d2) obj).f5668b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3035(Object obj) {
        if (C0436.m8524() < 0) {
            return ((SQLiteDatabase) obj).inTransaction();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3036(Object obj) {
        if (C0101.m1975() >= 0) {
            return ((MainViewModel) obj).f3089f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3037(Object obj) {
        if (C0295.m5679() >= 0) {
            return ((y0) obj).f4861d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3038(Object obj) {
        if (C0140.m2699() >= 0) {
            return ((d1) obj).f4449a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static n m3039(Object obj) {
        if (C0372.m7309() <= 0) {
            return ((u.w) obj).f14968b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3040(Object obj, Object obj2, int i10) {
        if (C0148.m2838() < 0) {
            ((BaseBundle) obj).putInt((String) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3041(Object obj) {
        if (C0038.m750() < 0) {
            return ((x7) obj).I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3042(String str) {
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

    /* JADX INFO: renamed from: ۤۨۢ۟, reason: not valid java name and contains not printable characters */
    public static a1 m3043(Object obj) {
        if (C0286.m5522() > 0) {
            return ((z0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۤ, reason: contains not printable characters */
    public static int m3044(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤۧۦ, reason: not valid java name and contains not printable characters */
    public static long m3046(Object obj) {
        if (C0043.m833() >= 0) {
            return ((c) obj).h();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3047(Object obj) {
        if (C0333.m6472() <= 0) {
            return ((h2) obj).f4551e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m3048(Object obj, Object obj2) {
        if (C0163.m3132() >= 0) {
            ((Parcel) obj).writeByteArray((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۨۡ, reason: not valid java name and contains not printable characters */
    public static float m3049() {
        if (C0102.m2007() > 0) {
            return d.f11035a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۨۨ۟, reason: contains not printable characters */
    public static String m3045(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
