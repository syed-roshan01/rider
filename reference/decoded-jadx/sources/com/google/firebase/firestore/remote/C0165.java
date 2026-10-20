package com.google.firebase.firestore.remote;

import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.ktx.C0156;
import f0.c2;
import f0.o0;
import f0.y;
import h0.C0299;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.LinkedHashMap;
import java.util.Set;
import k0.i0;
import k6.f5;
import m4.C0353;
import p9.z;
import q5.C0385;
import s7.C0414;
import y.C0474;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.۟ۦۨۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0165 {

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f189 = 295;

    /* JADX INFO: renamed from: ۟۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3154() {
        return 380 ^ C0103.f129;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ۠, reason: not valid java name and contains not printable characters */
    public static z m3155(Object obj) {
        if (C0385.m7546() > 0) {
            return ((MainViewModel) obj).f3099k0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3156() {
        if (C0474.m9246() < 0) {
            return "save_language";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3157(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static c2 m3158(Object obj) {
        if (C0414.m8130() <= 0) {
            return ((y) obj).f6002a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3160(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Set m3161(Object obj) {
        if (C0156.m2976() >= 0) {
            return ((LinkedHashMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static o0 m3162() {
        if (C0114.m2205() <= 0) {
            return o0.f5838c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3163(Object obj) {
        if (C0119.m2289() > 0) {
            return ((f5) obj).g();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static long m3164(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((i0) obj).f9015s;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡۧ۠, reason: not valid java name and contains not printable characters */
    public static r0.d m3165(Object obj, Object obj2, Object obj3) {
        if (C0353.m6940() < 0) {
            return ((r0.d) obj).b(obj2, (s0.a) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m3166(Object obj) {
        if (C0299.m5752() <= 0) {
            return ((HttpURLConnection) obj).getErrorStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m3159(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
