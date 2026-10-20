package com.google.gson.internal.bind;

import android.os.Looper;
import c1.C0058;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzon;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement.C0184;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.interop.C0196;
import d5.t;
import d5.v0;
import d5.y;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.migration.C0255;
import e1.l0;
import e8.C0266;
import f.C0271;
import f0.h2;
import g.C0285;
import java.io.ByteArrayOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import k0.g2;
import k0.o1;
import k0.r2;
import k0.w2;
import k6.l4;
import k6.n4;
import k6.p7;
import k6.v;
import m0.l3;
import org.json.JSONObject;
import p5.C0378;
import p9.q0;
import s6.C0414;
import t1.C0420;
import u3.C0435;
import u8.C0439;
import w2.C0459;
import x4.C0470;

/* JADX INFO: renamed from: com.google.gson.internal.bind.ۥۣۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0207 {

    /* JADX INFO: renamed from: ۟ۥۣۣ۠, reason: not valid java name and contains not printable characters */
    public static int f231 = -619;

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static l3 m3948(Object obj) {
        if (C0234.m4495() < 0) {
            return ((v0) obj).f4804o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3949(Object obj, Object obj2, boolean z10) {
        if (C0184.m3517() > 0) {
            return ((JSONObject) obj).optBoolean((String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۨ, reason: not valid java name and contains not printable characters */
    public static Looper m3950() {
        if (C0414.m8107() < 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m3951(Object obj) {
        if (C0235.m4512() >= 0) {
            return ((t) obj).f4776a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3952(Object obj) {
        if (C0439.m8564() > 0) {
            return ((g2) obj).f8942a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3954(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static l4 m3955(Object obj) {
        if (C0470.m9143() > 0) {
            return ((n4) obj).f10225e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۡ, reason: not valid java name and contains not printable characters */
    public static y0.o m3956(Object obj, Object obj2) {
        if (C0266.m5069() <= 0) {
            return androidx.compose.ui.draw.a.e((y0.o) obj, (c9.c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3957() {
        return (-379) ^ C0271.f350;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۤ, reason: not valid java name and contains not printable characters */
    public static FileChannel m3958(Object obj, long j10) {
        if (C0168.m3229() > 0) {
            return ((FileChannel) obj).position(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static e0.e m3959(Object obj) {
        if (C0132.m2543() <= 0) {
            return r2.b((e0.a) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3960(Object obj, Object obj2) {
        if (C0435.m8498() < 0) {
            ((p7) obj).s((ArrayList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3961() {
        if (C0132.m2543() <= 0) {
            return zzon.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3962(Object obj) {
        if (C0285.m5483() > 0) {
            return ((v) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3963(Object obj) {
        if (C0255.m4866() <= 0) {
            return ((h2) obj).f5738c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3964(String str) {
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

    /* JADX INFO: renamed from: ۢۧۢۤ, reason: not valid java name and contains not printable characters */
    public static q0 m3965(Object obj) {
        if (C0459.m8930() > 0) {
            return ((MainViewModel) obj).f3090f0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3966(Object obj) {
        if (C0378.m7389() > 0) {
            return ((zzfc.zza) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢ, reason: contains not printable characters */
    public static l0 m3967(Object obj) {
        if (C0420.m8247() > 0) {
            return ((o1) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۢ, reason: contains not printable characters */
    public static FirebaseRemoteConfig m3968() {
        if (C0183.m3510() >= 0) {
            return FirebaseRemoteConfig.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥ, reason: contains not printable characters */
    public static t.n m3969(Object obj) {
        if (C0196.m3762() <= 0) {
            return ((w2) obj).f9611d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۡ, reason: not valid java name and contains not printable characters */
    public static String m3970(Object obj) {
        if (C0058.m1106() > 0) {
            return ((y) obj).f4851a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m3953(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
