package com.google.firebase.concurrent;

import android.app.DownloadManager;
import android.os.Parcel;
import android.widget.TextView;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.data.model.TransactionData;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.ktx.C0180;
import d5.x;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e2.C0263;
import h4.C0305;
import i.C0315;
import ja.l;
import ja.m;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import k0.c2;
import k0.i0;
import k6.p6;
import m0.g1;
import m0.q;
import o1.C0367;
import r4.C0398;
import t8.C0426;
import u4.C0436;
import y6.C0476;
import z7.C0488;

/* JADX INFO: renamed from: com.google.firebase.concurrent.ۣۦۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0137 {

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f163 = 98;

    /* JADX INFO: renamed from: ۟۟ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m2641(Object obj, Object obj2) {
        if (C0245.m4710() >= 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static z1.a m2643() {
        if (C0426.m8356() < 0) {
            return z1.a.f17193b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m2644(Object obj) {
        if (C0263.m5033() <= 0) {
            zzbw.zzb((Parcel) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2645(Object obj, Object obj2, boolean z10) {
        if (C0488.m9505() >= 0) {
            return l9.i.F0((CharSequence) obj, (String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m2646() {
        return (-564) ^ C0315.f463;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۦ, reason: not valid java name and contains not printable characters */
    public static List m2647(Object obj) {
        if (C0436.m8524() < 0) {
            return ((zzfc.zza) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۥ, reason: not valid java name and contains not printable characters */
    public static g1 m2648(Object obj) {
        if (C0108.m2101() <= 0) {
            return ((d5.e) obj).f4459c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static c2 m2649(Object obj) {
        if (C0367.m7199() <= 0) {
            return ((i0) obj).Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m2650(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Object m2651(Object obj, int i10) {
        if (C0024.m487() > 0) {
            return a7.a.k((ArrayList) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2652(Object obj) {
        if (C0180.m3448() > 0) {
            return ((q) obj).F();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2653(Object obj) {
        if (C0476.m9298() <= 0) {
            return ((TransactionData) obj).getPlanType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۦ, reason: not valid java name and contains not printable characters */
    public static long m2654(Object obj) {
        if (C0305.m5904() >= 0) {
            return ((i0) obj).C;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2655(Object obj) {
        if (C0398.m7797() <= 0) {
            return ((c1.q) obj).f2916c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡۦ, reason: not valid java name and contains not printable characters */
    public static String m2656(String str) {
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

    /* JADX INFO: renamed from: ۤۢۢۨ, reason: not valid java name and contains not printable characters */
    public static DownloadManager m2657(Object obj) {
        if (C0121.m2336() <= 0) {
            return ((x) obj).f4832a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟۠, reason: contains not printable characters */
    public static boolean m2658(Object obj) {
        if (C0173.m3314() >= 0) {
            return ((p6) obj).f10281h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۢ, reason: contains not printable characters */
    public static l m2659(Object obj, Object obj2) {
        if (C0228.m4402() >= 0) {
            return ((m) obj).h((ja.x) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2642(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
