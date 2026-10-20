package dagger.hilt.android;

import a2.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0183;
import d5.f;
import d5.m;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0242;
import e7.C0265;
import fa.C0280;
import g5.C0292;
import h0.a1;
import h0.h;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k6.g4;
import k6.x;
import k6.x3;
import l0.c;
import m0.m3;
import p8.C0380;
import r7.C0404;
import u1.y0;
import y3.e;
import z3.C0486;

/* JADX INFO: renamed from: dagger.hilt.android.۟ۤ۟ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0241 {

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int f320 = 459;

    /* JADX INFO: renamed from: ۟۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static m m4601() {
        if (C0114.m2205() <= 0) {
            return m.f4654c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static Intent m4602(Object obj, Object obj2, Object obj3) {
        if (C0380.m7433() >= 0) {
            return ((Context) obj).registerReceiver((BroadcastReceiver) obj2, (IntentFilter) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static m3 m4603() {
        if (C0486.m9449() < 0) {
            return y0.f15379d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m4604(Object obj) {
        if (C0180.m3448() > 0) {
            return Long.parseLong((String) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m4605(Object obj) {
        if (C0183.m3510() > 0) {
            return ((f) obj).f4477a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m4606(Object obj) {
        if (C0292.m5605() <= 0) {
            return ((g4) obj).f10062d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۨ, reason: not valid java name and contains not printable characters */
    public static a1 m4607(Object obj) {
        if (C0133.m2559() > 0) {
            return ((h) obj).f7396e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4609() {
        return 733 ^ C0265.f344;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m4610(Object obj) {
        if (C0126.m2434() > 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4611(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static x3 m4612() {
        if (C0103.m2022() > 0) {
            return x.S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4613(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m4614() {
        if (C0280.m5406() < 0) {
            return c.C;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m4615(int i10, int i11, Object obj) {
        if (C0404.m7911() < 0) {
            return e.C(i10, i11, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۡ, reason: contains not printable characters */
    public static String m4616(Object obj) {
        if (C0242.m4629() <= 0) {
            return ((zzfi.zzj) obj).zzaa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧۢ, reason: not valid java name and contains not printable characters */
    public static s m4617() {
        if (C0234.m4495() < 0) {
            return s.f971a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4608(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
