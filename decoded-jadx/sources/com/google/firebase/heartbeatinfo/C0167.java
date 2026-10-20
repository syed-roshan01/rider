package com.google.firebase.heartbeatinfo;

import a2.r;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.node.C0037;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.messaging.C0192;
import d5.m;
import d8.C0221;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.migration.C0239;
import f0.C0272;
import g0.C0285;
import g2.C0287;
import i1.h0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import k0.n2;
import k0.t3;
import k6.a5;
import k6.o5;
import k6.p;
import k6.p7;
import k6.r5;
import k6.s;
import k6.t4;
import k6.x7;
import m0.m3;
import n.C0361;
import n9.C0366;
import v7.C0449;

/* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.ۤ۠ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0167 {

    /* JADX INFO: renamed from: ۟۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f191 = 942;

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static m m3187() {
        if (C0361.m7097() < 0) {
            return m.f4667w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3188(Object obj, int i10) {
        if (C0078.m1692() >= 0) {
            ((LinearLayout) obj).setOrientation(i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3189(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3190() {
        if (C0192.m3659() > 0) {
            return h0.f7832a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static r5 m3191(Object obj) {
        if (C0272.m5249() < 0) {
            return t4.u((zzfc.zza.zze) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m3192(Object obj) {
        if (C0037.m733() >= 0) {
            return ((r) obj).f970b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static s m3193(Object obj) {
        if (C0118.m2274() <= 0) {
            return ((p) obj).f10266f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۡ, reason: not valid java name and contains not printable characters */
    public static a5 m3194(Object obj, Object obj2) {
        if (C0449.m8755() >= 0) {
            return ((p7) obj).d((x7) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3195(Object obj) {
        if (C0239.m4596() > 0) {
            return ((t3) obj).f9500t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static float m3197(float f10, float f11, float f12) {
        if (C0229.m4421() < 0) {
            return o1.s.W(f10, f11, f12);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۥۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3198(Object obj, Object obj2, int i10, Object obj3) {
        if (C0287.m5529() >= 0) {
            return ((Bitmap) obj).compress((Bitmap.CompressFormat) obj2, i10, (OutputStream) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۤۤ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m3199(Object obj) {
        if (C0366.m7189() >= 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3200() {
        return (-705) ^ C0285.f430;
    }

    /* JADX INFO: renamed from: ۥۢۡ۟, reason: contains not printable characters */
    public static int m3201(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۟ۧۢ, reason: contains not printable characters */
    public static m3 m3202() {
        if (C0021.m417() >= 0) {
            return n2.f9267b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۡ, reason: contains not printable characters */
    public static void m3203(Object obj) {
        if (C0227.m4380() >= 0) {
            ((o5) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۨ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m3204(Object obj) {
        if (C0221.m4264() > 0) {
            return ((zzfi.zze) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3196(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
