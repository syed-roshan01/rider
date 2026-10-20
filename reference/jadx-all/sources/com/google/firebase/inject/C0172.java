package com.google.firebase.inject;

import aa.C0012;
import android.os.Parcel;
import androidx.compose.ui.draw.C0029;
import c1.C0059;
import c5.m;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.C0170;
import f5.b0;
import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.o1;
import k0.p1;
import k0.v;
import l0.C0341;
import l0.q;
import m0.g1;
import m0.q2;
import q9.C0392;
import r2.C0395;
import t.j0;
import t.k0;
import t.p0;
import t9.C0428;
import u.k1;
import w5.C0463;
import x.a;
import x.b;
import x9.h;
import x9.i;

/* JADX INFO: renamed from: com.google.firebase.inject.ۣۣ۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0172 {

    /* JADX INFO: renamed from: ۟ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int f196 = 288;

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static float m3280() {
        if (C0170.m3247() < 0) {
            return q.f11117e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static e m3281(Object obj) {
        if (C0428.m8371() <= 0) {
            return ((o1) obj).f9304x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۤ, reason: not valid java name and contains not printable characters */
    public static i m3282(Object obj) {
        if (C0395.m7729() >= 0) {
            return ((h) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static b m3284(Object obj) {
        if (C0392.m7657() > 0) {
            return ((a) obj).f16264a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3285(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Matcher m3286(Object obj, Object obj2) {
        if (C0341.m6681() > 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3287(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static float m3288(Object obj) {
        if (C0012.m226() >= 0) {
            return ((zzfi.zzg) obj).zzb();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static m m3289(int i10, Object obj, Object obj2) {
        if (C0059.m1117() <= 0) {
            return k1.b(i10, (g1) obj, (m0.q) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3290(Object obj) {
        if (C0117.m2257() > 0) {
            return ((b0) obj).f6234c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static k0 m3291(Object obj, float f10, float f11, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        if (C0029.m568() < 0) {
            return t.e.f((p0) obj, f10, f11, (j0) obj2, (String) obj3, (m0.m) obj4, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static e m3292(Object obj) {
        if (C0162.m3105() >= 0) {
            return ((p1) obj).f9346t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3293(Object obj) {
        if (C0146.m2776() > 0) {
            return ((q2) obj).f11678n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3294(Object obj) {
        if (C0463.m9013() <= 0) {
            ((Parcel) obj).writeNoException();
        }
    }

    /* JADX INFO: renamed from: ۦۢۧۥ, reason: contains not printable characters */
    public static int m3295(Object obj) {
        if (C0395.m7729() > 0) {
            return ((v) obj).f9542d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۡ۟, reason: contains not printable characters */
    public static int m3296() {
        return (-275) ^ C0080.f114;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3283(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
