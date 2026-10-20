package x8;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import b1.C0050;
import c1.C0058;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzix;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.remoteconfig.C0200;
import d5.j1;
import dagger.hilt.android.migration.C0239;
import f0.C0273;
import f5.g0;
import g.C0285;
import g7.C0293;
import g9.c;
import g9.d;
import h8.C0314;
import i6.C0321;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.TreeMap;
import k.f;
import k0.z2;
import k6.r7;
import k6.s6;
import k6.x;
import k6.x3;
import l2.e;
import l2.p;
import p3.C0376;
import p9.q0;
import r2.C0395;
import u.C0429;
import w0.C0455;
import w0.i;
import z8.C0492;

/* JADX INFO: renamed from: x8.ۢۨۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0474 {

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int f744 = 644;

    /* JADX INFO: renamed from: ۟۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9210() {
        return (-1024) ^ C0285.f429;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m9211(Object obj) {
        if (C0429.m8409() < 0) {
            return ((TreeMap) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9212() {
        if (C0314.m6072() < 0) {
            return "G1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static x3 m9213() {
        if (C0200.m3841() < 0) {
            return x.f10492k0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static c m9214() {
        if (C0141.m2714() < 0) {
            return d.f7313a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m9215(Object obj, Object obj2) {
        if (C0395.m7729() > 0) {
            return ((j1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m9216(Object obj) {
        if (C0239.m4587() < 0) {
            return ((e) obj).f11200a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9217(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۥۧۧ, reason: not valid java name and contains not printable characters */
    public static i m9218(Object obj, Object obj2) {
        if (C0492.m9566() >= 0) {
            return ((i) obj).t((c9.c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m9219(Object obj, boolean z10) {
        if (C0050.m982() < 0) {
            return r7.B((Bundle) obj, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m9220(Object obj, Object obj2) {
        if (C0455.m8861() < 0) {
            return ((g0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m9221(Object obj, float f10, float f11) {
        if (C0321.m6200() >= 0) {
            ((f) obj).B(f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۣۥۨۤ, reason: not valid java name and contains not printable characters */
    public static String m9222(Object obj) {
        if (C0285.m5483() > 0) {
            return ((Bundle) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9223(Object obj) {
        if (C0273.m5249() < 0) {
            return ((z2) obj).f9701f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static String m9224() {
        if (C0376.m7362() >= 0) {
            return "accept_timer_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢۢ, reason: contains not printable characters */
    public static p m9225() {
        if (C0293.m5634() <= 0) {
            return p.f11219c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static int m9226(Object obj) {
        if (C0086.m1846() >= 0) {
            return ((zzix) obj).zzbw();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۤۤ, reason: contains not printable characters */
    public static Network m9228(Object obj) {
        if (C0161.m3081() <= 0) {
            return ((ConnectivityManager) obj).getActiveNetwork();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۡ, reason: contains not printable characters */
    public static o8.c m9229(Object obj) {
        if (C0088.m1874() > 0) {
            return ((s6) obj).f10361g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static q0 m9230(Object obj) {
        if (C0058.m1106() >= 0) {
            return ((MainViewModel) obj).P;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m9231(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۠۟ۡ, reason: contains not printable characters */
    public static String m9227(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
