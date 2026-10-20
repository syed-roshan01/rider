package h7;

import android.app.Service;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0169;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.C0192;
import d5.d0;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.internal.definecomponent.C0250;
import f0.b1;
import h1.C0301;
import h3.C0302;
import i4.C0318;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import k0.h0;
import k6.i5;
import k6.r7;
import m0.g1;
import m0.m;
import m7.C0357;
import q9.C0392;
import t.e;
import t.j0;
import t.k0;
import t.p0;
import t.x1;
import t2.C0423;
import v0.C0441;
import y3.c;

/* JADX INFO: renamed from: h7.ۣ۟ۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0312 {

    /* JADX INFO: renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
    public static int f459 = 748;

    /* JADX INFO: renamed from: ۟۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static k0 m6014(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        if (C0164.m3153() > 0) {
            return e.i((p0) obj, (Number) obj2, (Number) obj3, (x1) obj4, (j0) obj5, (String) obj6, (m) obj7, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۨ, reason: not valid java name and contains not printable characters */
    public static int m6015(Object obj) {
        if (C0192.m3659() >= 0) {
            return ((c) obj).f16890f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6016(Object obj) {
        if (C0441.m8597() > 0) {
            return ((b1) obj).f5615c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m6017(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۢ, reason: not valid java name and contains not printable characters */
    public static g1 m6018(Object obj) {
        if (C0318.m6144() <= 0) {
            return ((d5.k0) obj).f4606p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int m6019(Object obj) {
        if (C0250.m4779() <= 0) {
            return ((d0) obj).f4446a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static d0.a m6020() {
        if (C0169.m3245() >= 0) {
            return d0.a.f4318a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۧ, reason: not valid java name and contains not printable characters */
    public static Serializable m6022(Object obj, Object obj2) {
        if (C0302.m5797() <= 0) {
            return r7.R((zzfi.zze) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m6023(Object obj) {
        if (C0080.m1729() < 0) {
            return ((i5) obj).f10108a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۥۨ, reason: not valid java name and contains not printable characters */
    public static void m6024(Object obj, int i10) {
        if (C0172.m3296() > 0) {
            ((Service) obj).stopForeground(i10);
        }
    }

    /* JADX INFO: renamed from: ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static long m6025() {
        if (C0392.m7657() >= 0) {
            return l0.c.A;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static String m6026() {
        if (C0301.m5773() < 0) {
            return "google_app_measurement.db";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m6027() {
        return (-734) ^ C0357.f627;
    }

    /* JADX INFO: renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m6028(String str) {
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

    /* JADX INFO: renamed from: ۨ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static float m6029(Object obj) {
        if (C0423.m8294() >= 0) {
            return ((h0) obj).f8966d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۥۣۡ, reason: not valid java name and contains not printable characters */
    public static zzcm m6030() {
        if (C0235.m4512() >= 0) {
            return zzcl.zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m6021(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
