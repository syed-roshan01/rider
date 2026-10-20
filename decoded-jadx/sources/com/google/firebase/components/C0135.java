package com.google.firebase.components;

import a.C0002;
import android.os.BaseBundle;
import androidx.fragment.app.C0042;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfiginterop.C0202;
import d8.C0221;
import d9.C0226;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.generatesrootinput.C0250;
import e1.C0258;
import ea.C0268;
import f0.g1;
import f0.k0;
import f0.k1;
import h.C0298;
import h7.C0312;
import ja.x;
import java.io.ByteArrayOutputStream;
import k0.b3;
import k0.e3;
import k0.k2;
import k0.k3;
import k0.l1;
import k0.n4;
import k0.r3;
import k0.u3;
import k0.y2;
import k6.f4;
import l2.C0341;
import m4.C0353;
import o1.s;
import r9.C0405;
import rikka.shizuku.C0406;
import t7.C0425;
import w.C0453;
import x7.C0471;

/* JADX INFO: renamed from: com.google.firebase.components.ۧ۠ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0135 {

    /* JADX INFO: renamed from: ۟ۥۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int f161 = -901;

    /* JADX INFO: renamed from: ۟۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2592(Object obj) {
        if (C0226.m4372() < 0) {
            return ((y2) obj).f9670b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۡ, reason: not valid java name and contains not printable characters */
    public static c9.e m2593(Object obj) {
        if (C0151.m2903() > 0) {
            return ((n4) obj).f9278c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m2594(Object obj) {
        if (C0298.m5742() >= 0) {
            return ((b3) obj).f8742e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2595(Object obj) {
        if (C0425.m8351() <= 0) {
            ((k1) obj).g();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m2597(Object obj, long j10) {
        if (C0174.m3323() <= 0) {
            return ((zzfi.zzg.zza) obj).zza(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2598(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2599(Object obj, Object obj2) {
        if (C0002.m46() <= 0) {
            y3.e.a0((l4.h) obj, (x) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2600(Object obj) {
        if (C0244.m4685() >= 0) {
            return ((MainViewModel) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m2601(int i10) {
        if (C0250.m4793() >= 0) {
            return s.N(i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۡ, reason: not valid java name and contains not printable characters */
    public static double m2602(Object obj, Object obj2) {
        return C0405.m7952() < 0 ? ((BaseBundle) obj).getDouble((String) obj2) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m2603(Object obj, Object obj2) {
        if (C0268.m5123() >= 0) {
            return ((zzfi.zzj.zza) obj).zzb((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m2604(Object obj, Object obj2) {
        if (C0312.m6046() >= 0) {
            ((f4) obj).b((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2605(Object obj) {
        if (C0042.m820() >= 0) {
            return ((k2) obj).f9106d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m2606(Object obj) {
        if (C0258.m4939() < 0) {
            return ((e3) obj).f8871e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m2607(Object obj) {
        if (C0341.m6699() < 0) {
            return ((g1) obj).f5708a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static int m2608() {
        return 31 ^ C0124.f150;
    }

    /* JADX INFO: renamed from: ۠ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2609(Object obj, Object obj2) {
        if (C0221.m4264() > 0) {
            return f6.a.p0(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2610(Object obj) {
        if (C0471.m9190() <= 0) {
            return ((l1) obj).f9163s;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m2611() {
        if (C0202.m3868() > 0) {
            return k3.f9115e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۡۢۢ, reason: not valid java name and contains not printable characters */
    public static float m2612() {
        if (C0406.m7977() <= 0) {
            return u3.f9527d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۦۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2613(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static t.d m2614(Object obj) {
        if (C0453.m8831() < 0) {
            return ((r3) obj).f9421b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2615(Object obj) {
        if (C0353.m6940() < 0) {
            return ((k2) obj).f9109n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static Integer m2616(Object obj) {
        if (C0128.m2475() <= 0) {
            return ((k0) obj).f5809a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static String m2596(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
