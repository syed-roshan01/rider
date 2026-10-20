package com.google.firebase.iid;

import a0.C0003;
import a5.d0;
import a8.C0010;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.graphics.C0031;
import androidx.fragment.app.C0042;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.messaging.reporting.C0190;
import dagger.hilt.android.internal.migration.C0233;
import ea.C0269;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import k0.g3;
import k0.s3;
import k6.c4;
import k6.f5;
import m0.q;
import m1.C0351;
import o1.l;
import r6.C0402;
import u.r;

/* JADX INFO: renamed from: com.google.firebase.iid.ۣۨۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0171 {

    /* JADX INFO: renamed from: ۟ۡۥۤۡ, reason: not valid java name and contains not printable characters */
    public static int f195 = -80;

    /* JADX INFO: renamed from: ۟۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static l m3264() {
        if (C0402.m7881() < 0) {
            return l.f12401b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3265(Object obj) {
        if (C0010.m199() > 0) {
            return ((s3) obj).f9449a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static c4 m3266(Object obj) {
        if (C0269.m5123() >= 0) {
            return ((f5) obj).f10036m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3267(Object obj) {
        if (C0031.m598() >= 0) {
            return ((y3.l) obj).f16918a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static r m3268() {
        if (C0042.m820() > 0) {
            return r.f14913e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3269() {
        if (C0233.m4482() >= 0) {
            return "select parameters from default_event_params where app_id=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3270(Object obj, boolean z10) {
        if (C0190.m3639() > 0) {
            ((q) obj).t(z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3271(Object obj) {
        if (C0324.m6259() < 0) {
            return ((d0) obj).f1241c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3272() {
        return 632 ^ C0324.f471;
    }

    /* JADX INFO: renamed from: ۢۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3273(String str) {
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

    /* JADX INFO: renamed from: ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static long m3274(Object obj) {
        if (C0023.m461() > 0) {
            return ((zzad) obj).zza();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static Iterator m3276(Object obj) {
        if (C0351.m6878() <= 0) {
            return ((HashSet) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢ, reason: contains not printable characters */
    public static int m3277(Object obj) {
        if (C0324.m6259() <= 0) {
            return ((zzew.zzb) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3278(Object obj) {
        if (C0003.m70() > 0) {
            return ((g3) obj).f8955r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3279(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3275(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
