package g0;

import android.os.Parcel;
import android.view.View;
import androidx.lifecycle.w;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ktx.C0186;
import d1.C0213;
import d7.t;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.aggregatedroot.C0247;
import g.C0285;
import java.io.ByteArrayOutputStream;
import java.io.File;
import k0.j1;
import k6.c5;
import k6.f5;
import k6.p7;
import k6.x7;
import k6.z4;
import l0.q;
import m0.n1;
import m5.C0355;
import o1.s;
import p9.z;
import r5.C0401;
import s8.C0418;
import v0.C0444;
import x7.C0472;
import y0.o;

/* JADX INFO: renamed from: g0.۟ۥۢۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0286 {

    /* JADX INFO: renamed from: ۟ۥۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int f430 = -872;

    /* JADX INFO: renamed from: ۟۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5491(Object obj, long j10) {
        if (C0176.m3367() <= 0) {
            return ((zzfi.zzj.zza) obj).zzk(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static long m5492(Object obj) {
        if (C0074.m1607() < 0) {
            return ((f5) obj).f10049z;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m5493(long j10, Object obj) {
        if (C0247.m4717() < 0) {
            return t.P(j10, (u8.e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m5494(Object obj) {
        if (C0213.m4051() > 0) {
            return ((r0.d) obj).f13305b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static w m5495(Object obj) {
        if (C0122.m2355() > 0) {
            return s.A((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۡ, reason: not valid java name and contains not printable characters */
    public static k6.h m5496() {
        if (C0285.m5483() > 0) {
            return y3.e.f16908o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۧ, reason: not valid java name and contains not printable characters */
    public static n1 m5497(Object obj) {
        if (C0355.m6953() <= 0) {
            return ((j1) obj).f9064a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟۟, reason: not valid java name and contains not printable characters */
    public static o m5498(Object obj, Object obj2) {
        if (C0401.m7847() < 0) {
            return androidx.compose.ui.layout.a.h((o) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۦ, reason: not valid java name and contains not printable characters */
    public static void m5499(Object obj, Object obj2, Object obj3) {
        if (C0192.m3659() >= 0) {
            ((p7) obj).k((String) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m5500() {
        if (C0444.m8654() < 0) {
            return "com.google.android.gms";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static float m5501() {
        if (C0472.m9190() <= 0) {
            return q.f11113a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m5502(Object obj, Object obj2) {
        if (C0418.m8208() > 0) {
            ((y3.j) obj).b((File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۟ۦ, reason: contains not printable characters */
    public static int m5504() {
        return (-511) ^ C0228.f307;
    }

    /* JADX INFO: renamed from: ۥۨۤۤ, reason: contains not printable characters */
    public static z m5505(Object obj) {
        if (C0089.m1902() < 0) {
            return ((z4.d) obj).f17214o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۢ, reason: contains not printable characters */
    public static String m5506(String str) {
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

    /* JADX INFO: renamed from: ۦۢ۠۟, reason: contains not printable characters */
    public static int m5507(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۧۦۦ, reason: contains not printable characters */
    public static void m5508(Object obj, Object obj2) {
        if (C0186.m3548() < 0) {
            ((Parcel) obj).writeString((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۥۣ, reason: not valid java name and contains not printable characters */
    public static z4 m5509(Object obj) {
        if (C0129.m2492() >= 0) {
            return ((c5) obj).f9936d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static String m5503(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
