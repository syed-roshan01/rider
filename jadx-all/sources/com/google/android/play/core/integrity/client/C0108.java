package com.google.android.play.core.integrity.client;

import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.input.key.C0033;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.core.C0152;
import d7.a;
import dagger.hilt.codegen.C0242;
import h8.C0315;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.z;
import m0.g1;
import m0.m;
import okhttp3.internal.publicsuffix.C0373;
import u.w;
import u8.j;
import y0.o;
import z8.C0492;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.client.۟ۦۥۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0108 {

    /* JADX INFO: renamed from: ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int f134 = -70;

    /* JADX INFO: renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int m2091(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static j m2092(Object obj, Object obj2) {
        if (C0033.m652() <= 0) {
            return a.A((j) obj, (j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static o m2093(Object obj) {
        if (C0373.m7309() < 0) {
            return androidx.compose.foundation.layout.a.q((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static List m2095(Object obj) {
        if (C0315.m6079() >= 0) {
            return ((zzfi.zzl) obj).zzk();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2096(Object obj) {
        if (C0148.m2838() <= 0) {
            return ((zzew.zzb) obj).zzm();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2097(String str) {
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

    /* JADX INFO: renamed from: ۠ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static w m2098(Object obj) {
        if (C0242.m4629() <= 0) {
            return z.f((m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2099(Object obj, Object obj2) {
        if (C0492.m9566() > 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static g1 m2100(Object obj) {
        if (C0152.m2931() > 0) {
            return ((d5.g1) obj).f4521r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2101() {
        return (-908) ^ C0021.f41;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2094(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
