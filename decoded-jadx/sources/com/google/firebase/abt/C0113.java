package com.google.firebase.abt;

import a0.C0003;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.foundation.layout.a;
import androidx.lifecycle.x0;
import b7.C0053;
import b7.C0054;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.protobuf.l;
import com.google.protobuf.n;
import com.google.protobuf.v;
import d1.C0211;
import d5.a0;
import d5.h0;
import d9.C0224;
import e9.C0266;
import i1.f;
import java.io.ByteArrayOutputStream;
import k6.u;
import k6.w5;
import l2.C0341;
import m9.d0;
import n.C0361;
import o1.s;
import y.d;
import y.k;
import y.t0;
import y0.o;
import y6.C0476;

/* JADX INFO: renamed from: com.google.firebase.abt.ۢۦۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0113 {

    /* JADX INFO: renamed from: ۨ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int f139 = -96;

    /* JADX INFO: renamed from: ۟۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static d0 m2178(Object obj) {
        if (C0211.m4046() > 0) {
            return s.R((x0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2179() {
        if (C0109.m2116() < 0) {
            return "No expired configs for apps with pending events";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static d m2180() {
        if (C0023.m461() > 0) {
            return k.f16605a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static o m2181(Object obj, Object obj2) {
        if (C0476.m9298() < 0) {
            return a.k((o) obj, (t0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m2182() {
        return (-582) ^ C0125.f151;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2183(Object obj) {
        if (C0361.m7097() < 0) {
            return ((h0) obj).f4541a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2184(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static Boolean m2185(Object obj) {
        if (C0150.m2892() <= 0) {
            return ((w5) obj).f10460e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m2186(Object obj, int i10, boolean z10) {
        if (C0266.m5099() <= 0) {
            ((v) obj).s0(i10, z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۧ, reason: not valid java name and contains not printable characters */
    public static int m2187(Object obj) {
        if (C0224.m4316() >= 0) {
            return ((f) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2188(Object obj, Object obj2) {
        if (C0003.m70() > 0) {
            ((zzb) obj).zza((zzfp.zzc) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static long m2189() {
        if (C0053.m1029() <= 0) {
            return zzne.zzae();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m2190(Object obj) {
        if (C0341.m6699() < 0) {
            return ((a0) obj).f4392n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ۟, reason: contains not printable characters */
    public static int m2191(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۨۥ۠, reason: contains not printable characters */
    public static float m2193(Object obj) {
        if (C0054.m1047() >= 0) {
            return ((Float) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۡۢۦ, reason: not valid java name and contains not printable characters */
    public static l m2194(Object obj, Object obj2) {
        if (C0203.m3894() >= 0) {
            return ((u) obj).a((n) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static String m2192(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
