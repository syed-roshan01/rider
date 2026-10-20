package com.google.firebase.encoders;

import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import b3.C0051;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.internal.measurement.zzps;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.remoteconfig.interop.C0198;
import d5.m;
import dagger.hilt.android.internal.modules.C0234;
import f5.l;
import f6.C0278;
import g2.a0;
import g2.j0;
import g2.k0;
import java.io.ByteArrayOutputStream;
import k0.i0;
import k6.r;
import l2.C0342;
import o2.C0369;
import o5.C0371;
import p9.d0;
import p9.q0;
import p9.z;
import r5.C0401;
import s0.b;
import t1.j;
import t1.k;
import u8.e;

/* JADX INFO: renamed from: com.google.firebase.encoders.ۣۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0143 {

    /* JADX INFO: renamed from: ۣۣۣ, reason: not valid java name and contains not printable characters */
    public static int f169 = -375;

    /* JADX INFO: renamed from: ۟۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m2741(Object obj) {
        if (C0167.m3200() >= 0) {
            return ((i0) obj).D;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2742(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static j m2743() {
        if (C0342.m6699() < 0) {
            return k.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2744(Object obj) {
        if (C0150.m2892() < 0) {
            return ((b) obj).f13899a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static j0 m2745() {
        if (C0022.m444() < 0) {
            return k0.f6576a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static m m2746() {
        if (C0369.m7234() > 0) {
            return m.f4664t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int m2747(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۣ, reason: not valid java name and contains not printable characters */
    public static FillElement m2748() {
        if (C0371.m7269() > 0) {
            return c.f1668b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦ۟, reason: not valid java name and contains not printable characters */
    public static Boolean m2749(Object obj) {
        if (C0234.m4495() < 0) {
            return ((r) obj).f10334f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static e m2750(Object obj, Object obj2, Object obj3) {
        if (C0198.m3800() > 0) {
            return ((l) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m2751() {
        return 223 ^ C0401.f671;
    }

    /* JADX INFO: renamed from: ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static q0 m2752(Object obj) {
        if (C0278.m5361() < 0) {
            return d0.a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2753() {
        if (C0077.m1663() < 0) {
            return zzps.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۡۤ, reason: not valid java name and contains not printable characters */
    public static a2.e m2754(Object obj) {
        if (C0146.m2776() > 0) {
            return ((a0) obj).f6509a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static z m2755(Object obj) {
        if (C0051.m992() > 0) {
            return ((MainViewModel) obj).S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2756(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
