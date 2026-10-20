package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import c1.C0058;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0075;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.measurement.C0182;
import com.google.firebase.remoteconfig.interop.C0198;
import d8.C0222;
import f2.l;
import h3.C0302;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k0.b2;
import k0.i3;
import k0.s3;
import k1.C0333;
import k6.k;
import k6.x6;
import k6.x7;
import p9.q0;
import q0.C0383;
import r1.m0;
import u1.C0433;
import v.C0440;
import y0.g;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.۟ۥۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0205 {

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static int f229 = 429;

    /* JADX INFO: renamed from: ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3910(Object obj, Object obj2, Object obj3) {
        if (C0383.m7487() <= 0) {
            ((k) obj).I((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m3911(Object obj) {
        if (C0153.m2938() < 0) {
            return ((x6) obj).f10536a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static q0 m3912(Object obj) {
        if (C0328.m6319() <= 0) {
            return ((MainViewModel) obj).E0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۢ, reason: not valid java name and contains not printable characters */
    public static l m3913() {
        if (C0433.m8470() > 0) {
            return l.f6120o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3914() {
        return 138 ^ C0198.f222;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨ۟, reason: not valid java name and contains not printable characters */
    public static List m3915(Object obj) {
        if (C0131.m2522() >= 0) {
            return ((zzfi.zzm) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static o m3916(Object obj, Object obj2) {
        if (C0058.m1106() > 0) {
            return ((androidx.compose.foundation.layout.b) obj).a((g) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3917(Object obj) {
        if (C0062.m1186() >= 0) {
            return ((zzew.zze) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3918(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m3919(Object obj) {
        if (C0222.m4264() > 0) {
            return ((zzix.zzb) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3920(Object obj, Object obj2) {
        if (C0440.m8582() <= 0) {
            return ((m0) obj).p((r1.a) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۥ۟, reason: not valid java name and contains not printable characters */
    public static o m3921() {
        if (C0083.m1779() > 0) {
            return b2.f8733b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m3922() {
        if (C0134.m2587() <= 0) {
            return x7.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3923(Object obj) {
        if (C0198.m3800() > 0) {
            return ((s3) obj).f9457p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3924(Object obj, Object obj2) {
        if (C0182.m3488() > 0) {
            ((Context) obj).unregisterReceiver((BroadcastReceiver) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static String m3925() {
        if (C0333.m6454() < 0) {
            return "Tamil";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۨ, reason: contains not printable characters */
    public static void m3926(Object obj, int i10, Object obj2) {
        if (C0149.m2863() >= 0) {
            ((View) obj).setTag(i10, obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦ۠ۦ, reason: contains not printable characters */
    public static long m3927(Object obj) {
        if (C0302.m5797() <= 0) {
            return ((i3) obj).f9039p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۢ, reason: contains not printable characters */
    public static int m3928(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3929(Object obj) {
        if (C0075.m1631() <= 0) {
            return ((a5.k) obj).f1284o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3930(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
