package dagger.hilt.internal.aggregatedroot.codegen;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.C0014;
import b1.C0050;
import c9.e;
import c9.f;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.C0205;
import com.google.firebase.components.C0135;
import com.google.firebase.measurement.C0181;
import d.C0210;
import d5.r;
import f.C0269;
import f0.h;
import f0.m1;
import f0.n;
import h0.v0;
import i5.C0318;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import k0.q4;
import k0.t3;
import k6.u;
import k6.u7;
import k6.w6;
import l0.c;
import m0.l3;
import m3.C0352;
import p8.C0379;
import r.C0392;
import r1.d;
import r1.o;
import u.C0429;
import u0.b;

/* JADX INFO: renamed from: dagger.hilt.internal.aggregatedroot.codegen.۟۠۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0245 {

    /* JADX INFO: renamed from: ۦۢۢ, reason: contains not printable characters */
    public static int f325 = 294;

    /* JADX INFO: renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m4697(Object obj) {
        if (C0083.m1779() > 0) {
            return ((u) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4698() {
        if (C0329.m6367() > 0) {
            return zzpm.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m4699(Object obj, Object obj2) {
        if (C0205.m3914() > 0) {
            return ((m1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static e m4700(Object obj) {
        if (C0352.m6904() <= 0) {
            return ((q4) obj).f9414e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static o m4701() {
        if (C0050.m982() < 0) {
            return d.f13353b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4702(Object obj) {
        if (C0181.m3452() <= 0) {
            return u7.j0((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4703(Object obj) {
        if (C0379.m7433() > 0) {
            return ((w6) obj).f10468c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m4704(Object obj, Object obj2) {
        if (C0318.m6163() < 0) {
            return ((Bundle) obj).getBundle((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡ۟, reason: not valid java name and contains not printable characters */
    public static v0 m4705(Object obj) {
        if (C0135.m2608() < 0) {
            return ((n) obj).f5820c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4706(String str) {
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

    /* JADX INFO: renamed from: ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static long m4707() {
        if (C0392.m7675() < 0) {
            return c.f11016h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static f m4708(Object obj) {
        if (C0210.m4028() < 0) {
            return ((h) obj).f5725v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static b m4709() {
        if (C0106.m2067() >= 0) {
            return r.f4745c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4710() {
        return 479 ^ C0429.f700;
    }

    /* JADX INFO: renamed from: ۦ۟ۥ۟, reason: contains not printable characters */
    public static long m4711(Object obj, Object obj2, long j10) {
        if (C0269.m5152() >= 0) {
            return ((SharedPreferences) obj).getLong((String) obj2, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۟ۨ۠, reason: contains not printable characters */
    public static int m4712(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static l3 m4714(Object obj) {
        if (C0014.m269() < 0) {
            return ((t3) obj).f9492e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۢ, reason: contains not printable characters */
    public static String m4713(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
