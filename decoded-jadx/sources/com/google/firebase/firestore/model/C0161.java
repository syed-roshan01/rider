package com.google.firebase.firestore.model;

import a2.c0;
import a4.q;
import androidx.compose.ui.draw.C0029;
import b0.k0;
import b4.C0052;
import c1.C0059;
import com.auto.accept.ui.viewmodel.C0075;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.firestore.remote.C0165;
import dagger.hilt.internal.componenttreedeps.C0248;
import e2.C0261;
import e2.C0262;
import f6.C0278;
import h5.C0308;
import i9.e;
import j4.C0326;
import java.io.ByteArrayOutputStream;
import k0.j;
import k6.r7;
import l0.u;
import m0.n1;
import m7.C0357;
import p3.C0375;
import p9.z;
import t0.C0418;
import v.h1;
import z4.d;

/* JADX INFO: renamed from: com.google.firebase.firestore.model.ۤۥۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0161 {

    /* JADX INFO: renamed from: ۠ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static int f185 = -774;

    /* JADX INFO: renamed from: ۟۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m3075() {
        if (C0075.m1631() <= 0) {
            return zzne.zzh();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static long m3076() {
        if (C0326.m6304() <= 0) {
            return zzne.zzx();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟۠, reason: not valid java name and contains not printable characters */
    public static h1 m3077() {
        if (C0375.m7362() >= 0) {
            return h1.f15594b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡ۟, reason: not valid java name and contains not printable characters */
    public static c0 m3078() {
        if (C0091.m1940() < 0) {
            return u.f11180e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3079(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m3080(Object obj) {
        if (C0165.m3154() <= 0) {
            return ((e) obj).f8184b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3081() {
        return 576 ^ C0261.f341;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static z m3083(Object obj) {
        if (C0308.m5962() > 0) {
            return ((d) obj).f17220u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3084(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((zzfi.zze) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static n1 m3085(Object obj) {
        if (C0059.m1117() < 0) {
            return ((k0) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3086(Object obj) {
        if (C0278.m5394() > 0) {
            return ((f0.u) obj).f5961w;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m3087(Object obj, Object obj2) {
        if (C0029.m568() < 0) {
            return ((d5.z) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۤ, reason: contains not printable characters */
    public static c9.e m3088(Object obj) {
        if (C0418.m8221() >= 0) {
            return ((j) obj).f9052b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۠ۦ, reason: contains not printable characters */
    public static q m3089(Object obj) {
        if (C0357.m7001() <= 0) {
            return ((MainViewModel) obj).f3115s0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤ۟, reason: contains not printable characters */
    public static int m3090(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m3091(Object obj) {
        if (C0248.m4762() > 0) {
            return r7.S((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static long m3092() {
        if (C0262.m5016() < 0) {
            return zzne.zzo();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m3082(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
