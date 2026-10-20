package com.google.firebase.firestore.ktx;

import a3.C0006;
import android.graphics.Matrix;
import android.os.Process;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import b0.k0;
import c1.k;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.connector.C0116;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0237;
import f0.i0;
import h0.v0;
import h7.C0310;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.d2;
import k6.p7;
import k6.r7;
import k6.x7;
import l0.C0340;
import m1.C0350;
import q6.C0388;
import v0.p;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.firestore.ktx.۟ۥۧۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0157 {

    /* JADX INFO: renamed from: ۨ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int f181 = -324;

    /* JADX INFO: renamed from: ۟ۢۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m2986(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2987() {
        if (C0310.m5997() >= 0) {
            return "last_sampled_complex_event_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static o m2988(Object obj) {
        if (C0006.m112() <= 0) {
            return ((d2) obj).f8831e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static void m2989(Object obj, int i10) {
        if (C0231.m4453() <= 0) {
            r7.J((StringBuilder) obj, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2990(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣۥ۟, reason: not valid java name and contains not printable characters */
    public static p m2991() {
        if (C0340.m6681() >= 0) {
            return k0.G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۤ, reason: not valid java name and contains not printable characters */
    public static void m2992(Object obj, float f10, float f11) {
        if (C0116.m2247() >= 0) {
            ((Matrix) obj).setTranslate(f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۢۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2994(Object obj, Object obj2) {
        if (C0006.m112() <= 0) {
            ((p7) obj).G((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۣ۠, reason: not valid java name and contains not printable characters */
    public static v0 m2995(Object obj) {
        if (C0350.m6878() < 0) {
            return ((i0) obj).f5754d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2996() {
        if (C0040.m792() >= 0) {
            return "select max(bundle_end_timestamp) from queue";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠۠, reason: contains not printable characters */
    public static long m2997() {
        if (C0388.m7600() <= 0) {
            return e5.a.f5130f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۥ, reason: contains not printable characters */
    public static List m2998(Object obj) {
        if (C0237.m4583() > 0) {
            return ((zzfi.zzg) obj).zzi();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۧ, reason: contains not printable characters */
    public static int m2999() {
        return 770 ^ C0075.f109;
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3000(Object obj) {
        if (C0029.m568() <= 0) {
            return ((AppConfig) obj).getDialogEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3001(Object obj) {
        if (C0028.m557() > 0) {
            return ((k) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3002(int i10) {
        if (C0109.m2116() < 0) {
            return Process.getThreadPriority(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2993(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
