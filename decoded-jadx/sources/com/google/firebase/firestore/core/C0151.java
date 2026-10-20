package com.google.firebase.firestore.core;

import android.app.job.JobInfo;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewManager;
import androidx.compose.ui.draw.C0027;
import c7.C0068;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzce;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.remoteconfig.interop.C0198;
import d1.C0214;
import d3.C0216;
import d5.w0;
import e8.C0265;
import f0.c1;
import fa.C0279;
import h3.C0302;
import h7.C0312;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Map;
import k0.m0;
import k6.d4;
import k6.u7;
import m0.l3;
import m0.m;
import o1.z;
import p9.q0;
import s.C0408;
import t.e0;
import t.o1;
import t2.C0422;
import w5.C0463;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.ۣۣۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0151 {

    /* JADX INFO: renamed from: ۟ۡۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int f176 = -946;

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2894() {
        if (C0265.m5069() <= 0) {
            return "daily_conversions_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static z m2895(Object obj) {
        if (C0422.m8294() >= 0) {
            return ((c1) obj).f5634b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2896() {
        if (C0198.m3800() > 0) {
            return e6.e.f5148a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static String m2897(Object obj) {
        if (C0109.m2116() <= 0) {
            return ((zzfi.zzj) obj).zzaf();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2898(Object obj, Object obj2, Object obj3) {
        if (C0068.m1322() >= 0) {
            ((u7) obj).G((zzcv) obj2, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m2899(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0312.m6046() > 0) {
            f6.a.n0((d4) obj, (SQLiteDatabase) obj2, (String) obj3, (String) obj4, (String) obj5, (String[]) obj6);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠۟, reason: not valid java name and contains not printable characters */
    public static l3 m2900(Object obj) {
        if (C0463.m9033() > 0) {
            return ((w0) obj).f4827q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2901(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static q0 m2902(Object obj) {
        if (C0302.m5836() > 0) {
            return ((MainViewModel) obj).f3111q0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۡ, reason: not valid java name and contains not printable characters */
    public static int m2903() {
        return 727 ^ C0027.f47;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2904(Object obj, Object obj2, Object obj3) {
        if (C0214.m4096() >= 0) {
            ((ViewManager) obj).addView((android.view.View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m2905() {
        if (C0408.m8009() <= 0) {
            return l0.c.f11020l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2906(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0122.m2355() > 0) {
            return zzce.zza((Context) obj, (JobInfo) obj2, (String) obj3, (String) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۨ, reason: contains not printable characters */
    public static void m2907(Object obj, int i10) {
        if (C0279.m5406() <= 0) {
            ((p) obj).U0(i10);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۢۨ, reason: contains not printable characters */
    public static String m2909(String str) {
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

    /* JADX INFO: renamed from: ۦۣۢ۟, reason: contains not printable characters */
    public static Map m2910(Object obj) {
        if (C0216.m4114() < 0) {
            return Collections.unmodifiableMap((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static e0 m2911(Object obj, Object obj2, Object obj3) {
        if (C0108.m2101() < 0) {
            return ((m0) obj).a((o1) obj2, (m) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static String m2908(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
