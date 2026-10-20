package com.google.firebase.annotations;

import android.app.NotificationChannel;
import android.os.Parcel;
import androidx.compose.ui.graphics.C0032;
import c9.e;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.iid.internal.C0168;
import d5.b;
import d5.t;
import d5.u;
import ga.C0295;
import h3.C0301;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.o1;
import k6.z3;
import m0.l3;
import m0.m;
import m7.C0356;
import m7.C0358;
import r8.s;
import u4.C0435;
import v0.C0440;
import w0.C0454;
import y.a1;
import y1.i;

/* JADX INFO: renamed from: com.google.firebase.annotations.ۣۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0127 {

    /* JADX INFO: renamed from: ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int f153 = -514;

    /* JADX INFO: renamed from: ۟۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2446(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m2447(Object obj, Object obj2, Object obj3, int i10) {
        if (C0153.m2938() <= 0) {
            ((t) obj).b((a1) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m2448() {
        return 553 ^ C0356.f627;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2449(Object obj) {
        if (C0305.m5904() >= 0) {
            return ((b) obj).f4404b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static l3 m2450(Object obj) {
        if (C0440.m8597() > 0) {
            return ((u) obj).f4790f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static s m2452() {
        if (C0295.m5679() > 0) {
            return s.f13662a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2453(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2454(Object obj, Object obj2) {
        if (C0032.m620() <= 0) {
            ((NotificationChannel) obj).setDescription((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static e m2455(Object obj) {
        if (C0301.m5797() <= 0) {
            return ((o1) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2456(Object obj) {
        if (C0454.m8861() < 0) {
            return ((z3) obj).f10600l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2457() {
        if (C0358.m7035() < 0) {
            return "bn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟ۤ, reason: contains not printable characters */
    public static List m2458(Object obj) {
        if (C0435.m8516() >= 0) {
            return ((zzfi.zzl) obj).zzi();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢ۠, reason: contains not printable characters */
    public static y1.u m2459() {
        if (C0123.m2379() >= 0) {
            return i.f16763c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ, reason: not valid java name and contains not printable characters */
    public static void m2460(Object obj, Object obj2, int i10, int i11) {
        if (C0168.m3229() > 0) {
            ((Parcel) obj).unmarshall((byte[]) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2451(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
