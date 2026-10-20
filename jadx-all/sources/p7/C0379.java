package p7;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.graphics.C0032;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.ktx.C0180;
import com.google.gson.internal.bind.C0206;
import d5.d1;
import d5.t1;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.C0247;
import f4.C0275;
import fa.C0280;
import g3.C0289;
import g9.C0295;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import k0.i0;
import k6.d5;
import k6.s5;
import k6.s6;
import k6.z4;
import m7.C0359;
import m9.p1;
import p0.C0374;
import p9.q0;
import t2.C0421;
import v0.C0441;
import v0.C0442;
import w4.C0462;
import x4.C0470;

/* JADX INFO: renamed from: p7.ۣۣۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0379 {

    /* JADX INFO: renamed from: ۣۥۥۨ, reason: not valid java name and contains not printable characters */
    public static int f649 = -884;

    /* JADX INFO: renamed from: ۟۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static View m7403(Object obj) {
        if (C0289.m5547() >= 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7404(Object obj, long j10, float f10, float f11, long j11, long j12, float f12, Object obj2, Object obj3, int i10) {
        if (C0421.m8263() > 0) {
            ((g1.g) obj).f0(j10, f10, f11, j11, j12, f12, (g1.h) obj2, (e1.l) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m7405(Object obj) {
        if (C0470.m9143() >= 0) {
            return ((p1) obj).N();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7406(Object obj) {
        if (C0295.m5663() > 0) {
            return ((k6.r) obj).f10332d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7407(Object obj) {
        if (C0076.m1655() >= 0) {
            return ((s5) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m7408(Object obj, Object obj2, Object obj3, int i10) {
        if (C0206.m3931() > 0) {
            ((t1) obj).a((y.v) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m7409(Object obj) {
        if (C0180.m3448() >= 0) {
            return ((AppConfig) obj).getPlanPrice1Year();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۡ, reason: not valid java name and contains not printable characters */
    public static k0.y m7410(Object obj) {
        if (C0031.m598() > 0) {
            return k0.z.c((i0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7411(int i10) {
        if (C0462.m8993() > 0) {
            return s5.a(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static q0 m7412(Object obj) {
        if (C0374.m7322() < 0) {
            return ((MainViewModel) obj).Q0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨ۟, reason: not valid java name and contains not printable characters */
    public static void m7413(Object obj, Object obj2) {
        if (C0442.m8612() >= 0) {
            ((s6) obj).w((AtomicReference) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static Context m7414(Object obj) {
        if (C0253.m4832() < 0) {
            return ((d5.a0) obj).f4390e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7415(Object obj, Object obj2) {
        if (C0247.m4717() <= 0) {
            return Settings.Secure.getString((ContentResolver) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn.zza m7416() {
        if (C0280.m5406() < 0) {
            return zzfi.zzn.zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7417(Object obj) {
        if (C0032.m620() <= 0) {
            return ((AccessibilityNodeInfo) obj).isVisibleToUser();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠۟۠, reason: not valid java name and contains not printable characters */
    public static d5 m7418(Object obj, Object obj2) {
        if (C0275.m5286() < 0) {
            return ((z4) obj).t((Callable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static long m7419(Object obj) {
        if (C0359.m7035() <= 0) {
            return ((k0.d5) obj).f8843e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int m7420() {
        return (-941) ^ C0441.f711;
    }

    /* JADX INFO: renamed from: ۧۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m7421(Object obj) {
        if (C0244.m4678() > 0) {
            return ((d1) obj).f4451c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static String m7422(String str) {
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

    /* JADX INFO: renamed from: ۨۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m7423(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static String m7424(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
