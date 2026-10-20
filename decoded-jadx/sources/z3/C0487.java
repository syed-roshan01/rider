package z3;

import a2.c0;
import a5.f0;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0018;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.platform.C0038;
import androidx.compose.ui.semantics.C0039;
import c9.e;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.iid.C0170;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.provider.C0194;
import com.google.firebase.tracing.C0204;
import d5.v1;
import dagger.hilt.android.internal.modules.C0234;
import f0.r;
import g2.a0;
import g7.C0292;
import h3.C0302;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import k0.h2;
import k0.m4;
import k0.q4;
import k0.u4;
import k2.C0333;
import k6.t7;
import m5.C0354;
import o1.C0367;
import r2.C0396;
import u.i1;
import u.k1;
import w4.C0460;
import x.m;
import y0.o;
import y1.g;

/* JADX INFO: renamed from: z3.ۦۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0487 {

    /* JADX INFO: renamed from: ۨۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f761 = -286;

    /* JADX INFO: renamed from: ۟۟ۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m9481() {
        if (C0038.m750() < 0) {
            return zzew.zzf.zza.ENDS_WITH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m9482(Object obj) {
        if (C0170.m3247() < 0) {
            return ((AccessibilityEvent) obj).getEventType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static o m9483(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Object obj5, Object obj6) {
        if (C0367.m7199() < 0) {
            return androidx.compose.foundation.a.i((o) obj, (m) obj2, (i1) obj3, z10, (String) obj4, (g) obj5, (c9.a) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static long m9484(Object obj) {
        if (C0354.m6953() < 0) {
            return ((m4) obj).f9244x;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m9486(Object obj, int i10) {
        if (C0194.m3713() >= 0) {
            return ((ByteBuffer) obj).putInt(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9487(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static c9.a m9488(Object obj) {
        if (C0396.m7755() > 0) {
            return ((v1) obj).f4810b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Double m9489(Object obj) {
        if (C0018.m354() >= 0) {
            return ((t7) obj).f10409n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9490(Object obj) {
        if (C0234.m4512() >= 0) {
            return ((f0) obj).f1255c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static c0 m9491(Object obj) {
        if (C0020.m399() <= 0) {
            return ((q4) obj).f9413d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۧ, reason: not valid java name and contains not printable characters */
    public static e m9492(Object obj) {
        if (C0079.m1701() > 0) {
            return ((h2) obj).f8977p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m9493(Object obj) {
        if (C0292.m5634() < 0) {
            return ((TreeSet) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۥ, reason: not valid java name and contains not printable characters */
    public static a0 m9494(Object obj) {
        if (C0323.m6259() <= 0) {
            return ((r) obj).f5864c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m9495() {
        if (C0333.m6472() <= 0) {
            return "Shizuku Service Stopped \u2717";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦۨ, reason: not valid java name and contains not printable characters */
    public static int m9496() {
        return (-24) ^ C0460.f731;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m9497(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9498(Object obj) {
        if (C0302.m5836() >= 0) {
            return ((zzew.zze) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۦ۟, reason: not valid java name and contains not printable characters */
    public static float m9499() {
        if (C0190.m3639() > 0) {
            return u4.f9532c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m9500(long j10, Object obj, Object obj2) {
        if (C0204.m3905() < 0) {
            k1.d(j10, (StringBuilder) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۠ۨ, reason: contains not printable characters */
    public static Object m9501(Object obj, Object obj2) {
        if (C0039.m764() > 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static e m9502(Object obj) {
        if (C0105.m2045() >= 0) {
            return ((h2) obj).f8971c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m9485(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
