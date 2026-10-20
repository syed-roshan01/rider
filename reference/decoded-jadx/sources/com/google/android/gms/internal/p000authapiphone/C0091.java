package com.google.android.gms.internal.p000authapiphone;

import a5.k;
import android.os.Parcel;
import androidx.compose.ui.platform.C0038;
import c6.C0067;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import d5.g2;
import d5.l;
import d5.p1;
import e1.j0;
import e2.C0262;
import e9.C0266;
import f4.y;
import g2.C0286;
import h0.C0299;
import h7.C0312;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.j3;
import k0.t;
import k0.u;
import k6.f;
import k6.f5;
import k6.k7;
import k6.t4;
import l0.r;
import l2.b;
import m5.C0354;
import r1.x0;
import u.C0429;
import w6.C0464;
import x4.C0468;
import y3.e;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth-api-phone.ۣۨۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0091 {

    /* JADX INFO: renamed from: ۢۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int f125 = -168;

    /* JADX INFO: renamed from: ۟۠ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static String m1936(Object obj) {
        if (C0299.m5752() <= 0) {
            return ((f5) obj).f10042s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static j0 m1937(Object obj) {
        if (C0262.m5016() < 0) {
            return ((b) obj).f11195a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1938(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1939(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m1940() {
        return 969 ^ C0132.f158;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1941(Object obj) {
        if (C0286.m5522() >= 0) {
            return ((l) obj).f4643a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m1942(Object obj) {
        if (C0115.m2227() < 0) {
            return ((j3) obj).f9075b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1943(Object obj) {
        if (C0149.m2863() >= 0) {
            return ((k) obj).f1279c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m1944() {
        if (C0429.m8415() >= 0) {
            return r.f11123d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static p1 m1945(Object obj) {
        if (C0104.m2034() <= 0) {
            return ((g2) obj).f4529a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧ۟, reason: not valid java name and contains not printable characters */
    public static x0 m1947(Object obj) {
        if (C0312.m6046() >= 0) {
            return ((u) obj).f9506a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static l m1948() {
        if (C0468.m9123() <= 0) {
            return l.f4642z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static void m1949(Object obj, int i10, Object obj2) {
        if (C0067.m1309() <= 0) {
            e.U0((Parcel) obj, i10, (List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۨ, reason: not valid java name and contains not printable characters */
    public static t4 m1950(Object obj) {
        if (C0038.m750() < 0) {
            return ((k7) obj).o();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static f m1951(Object obj) {
        if (C0266.m5099() < 0) {
            return ((y) obj).h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static t m1952() {
        if (C0354.m6953() < 0) {
            return t.f9469o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۡ, reason: not valid java name and contains not printable characters */
    public static FirebaseRemoteConfigSettings m1953(Object obj) {
        if (C0464.m9059() < 0) {
            return ((FirebaseRemoteConfigSettings.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1946(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
