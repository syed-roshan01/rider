package com.google.firebase.auth.ktx;

import androidx.compose.foundation.relocation.C0024;
import b0.h0;
import c9.c;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.messaging.C0192;
import d5.g;
import d5.u0;
import d7.C0219;
import d9.C0224;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.C0252;
import f5.f0;
import g7.C0292;
import j4.C0326;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import k0.l;
import k0.w;
import k6.f5;
import k6.x7;
import k6.y3;
import l.q;
import m0.m;
import o5.C0370;
import org.json.JSONObject;
import q.z;
import r2.C0396;
import r7.C0404;
import t1.i;
import t8.C0426;
import v0.C0441;
import w6.C0464;
import y3.e;
import z0.C0482;

/* JADX INFO: renamed from: com.google.firebase.auth.ktx.ۤۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0133 {

    /* JADX INFO: renamed from: ۟ۤۨۦۧ, reason: not valid java name and contains not printable characters */
    public static int f159 = 792;

    /* JADX INFO: renamed from: ۟۠ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m2556(Object obj, int i10, Object obj2) {
        if (C0426.m8356() <= 0) {
            return ((zzfi.zzj.zza) obj).zza(i10, (zzfi.zzn) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m2557(Object obj, Object obj2, int i10) {
        if (C0252.m4832() < 0) {
            return ((JSONObject) obj).optInt((String) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static int m2558(Object obj) {
        if (C0441.m8612() >= 0) {
            return ((z) obj).f13045c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m2559() {
        return 958 ^ C0464.f735;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2560(Object obj, Object obj2) {
        if (C0242.m4660() <= 0) {
            ((y3) obj).p((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2561(Object obj) {
        if (C0224.m4316() > 0) {
            return ((zzew.zzb) obj).zzh();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static c m2562(Object obj) {
        if (C0192.m3659() >= 0) {
            return ((g) obj).f4496b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2563(Object obj, boolean z10, Object obj2, int i10, int i11) {
        if (C0024.m487() > 0) {
            e.y((MainViewModel) obj, z10, (m) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2564(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m2565(Object obj) {
        if (C0370.m7269() > 0) {
            return ((f0) obj).f6255a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2566(String str) {
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

    /* JADX INFO: renamed from: ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2567(Object obj) {
        if (C0126.m2434() > 0) {
            return ((zzfi.zzj) obj).zzaz();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m2568(Object obj) {
        if (C0326.m6304() <= 0) {
            return ((l) obj).f9122d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static c9.e m2569(Object obj) {
        if (C0146.m2776() > 0) {
            return ((w) obj).f9594t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2570(Object obj) {
        if (C0482.m9389() > 0) {
            return ((f5.w) obj).f6337c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤۨ, reason: not valid java name and contains not printable characters */
    public static h0 m2571(Object obj) {
        if (C0292.m5634() <= 0) {
            return ((u0) obj).f4792b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m2572(Object obj, int i10) {
        if (C0082.m1758() > 0) {
            return q.g((String) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2573(Object obj) {
        if (C0404.m7934() >= 0) {
            return ((f5) obj).f10025b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۨ, reason: contains not printable characters */
    public static void m2574(int i10, Object obj, int i11, Object obj2) {
        if (C0219.m4237() > 0) {
            q.r(i10, (m0.q) obj, i11, (i) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۧۡ, reason: contains not printable characters */
    public static boolean m2575(Object obj) {
        if (C0328.m6350() >= 0) {
            return ((zzfi.zzm) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static m2.l m2576(Object obj) {
        if (C0396.m7755() > 0) {
            return ((a2.z) obj).f1059h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2577(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
