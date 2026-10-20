package o4;

import a8.C0010;
import android.content.res.AssetManager;
import android.os.Bundle;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.installations.C0177;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.v;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.aggregatedroot.C0247;
import f0.c2;
import f0.h;
import f0.i0;
import f0.k0;
import f0.o0;
import f0.p1;
import h7.C0313;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import k0.b5;
import k0.c4;
import k1.C0333;
import k6.a5;
import k6.i5;
import k6.r7;
import k6.x7;
import m7.C0359;
import p9.z;
import q6.C0387;
import r2.C0395;
import s6.C0414;
import s7.C0415;
import u4.C0436;
import v5.C0446;
import v9.C0453;
import x8.C0474;
import y0.o;
import z0.C0483;
import z2.C0485;

/* JADX INFO: renamed from: o4.۟۟ۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0370 {

    /* JADX INFO: renamed from: ۡۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int f640 = -376;

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m7240(Object obj, int i10, Object obj2) {
        if (C0010.m199() >= 0) {
            return ((ArrayList) obj).set(i10, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7241() {
        if (C0436.m8516() >= 0) {
            return "Error querying database.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m7242(long j10) {
        if (C0333.m6454() < 0) {
            return v.o0(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static x7 m7243(Object obj) {
        if (C0247.m4717() <= 0) {
            return ((i5) obj).f10109b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static k0 m7244(Object obj) {
        if (C0247.m4717() < 0) {
            return ((p1) obj).f5854i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ۟, reason: not valid java name and contains not printable characters */
    public static Task m7245(Object obj, Object obj2) {
        if (C0313.m6046() > 0) {
            return ((FirebaseRemoteConfig) obj).setDefaultsAsync((Map<String, Object>) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7246(Object obj) {
        if (C0446.m8692() <= 0) {
            return ((h) obj).f5723t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m7247(Object obj, Object obj2) {
        if (C0387.m7564() > 0) {
            return ((i0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static float m7248() {
        if (C0395.m7729() >= 0) {
            return c4.f8801b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static void m7249(Object obj, int i10, int i11) {
        if (C0359.m7035() < 0) {
            ((v) obj).A0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۡۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static FileInputStream m7250(Object obj, Object obj2, Object obj3) {
        if (C0208.m3984() <= 0) {
            return ((y3.b) obj).a((AssetManager) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m7251(Object obj, boolean z10) {
        if (C0414.m8107() < 0) {
            return r7.u((Map) obj, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static o0 m7252(Object obj) {
        if (C0483.m9389() > 0) {
            return ((c2) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7253(String str) {
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

    /* JADX INFO: renamed from: ۣۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m7254() {
        return 173 ^ C0177.f201;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m7255(Object obj) {
        if (C0234.m4495() <= 0) {
            return ((b5) obj).f8769z;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m7256(Object obj, long j10) {
        if (C0149.m2863() > 0) {
            ((a5) obj).A(j10);
        }
    }

    /* JADX INFO: renamed from: ۤۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static z m7257(Object obj) {
        if (C0414.m8107() < 0) {
            return ((MainViewModel) obj).O0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۥ, reason: contains not printable characters */
    public static long m7258(Object obj) {
        if (C0485.m9436() < 0) {
            return ((zzfi.zzj) obj).zzl();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static o m7259() {
        if (C0180.m3448() > 0) {
            return androidx.compose.foundation.layout.c.l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۦ, reason: contains not printable characters */
    public static String m7260() {
        if (C0474.m9210() < 0) {
            return "Service not registered/enabled";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦۣ, reason: contains not printable characters */
    public static int m7261(Object obj) {
        if (C0453.m8825() >= 0) {
            return ((HttpURLConnection) obj).getResponseCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۢ, reason: contains not printable characters */
    public static String m7262(Object obj) {
        if (C0415.m8130() < 0) {
            return ((zzdd) obj).zzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m7263(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m7264(Object obj) {
        if (C0149.m2863() >= 0) {
            return ((UserProfile) obj).getDeviceId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m7239(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
