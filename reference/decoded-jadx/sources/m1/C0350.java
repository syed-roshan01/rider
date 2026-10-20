package m1;

import a.C0000;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.core.app.C0040;
import androidx.lifecycle.C0043;
import c3.C0063;
import c9.f;
import ca.C0070;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.C0127;
import d4.C0217;
import dagger.hilt.android.migration.C0239;
import e1.l0;
import ea.C0267;
import f5.l;
import h.C0296;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import k0.a3;
import k0.k;
import k0.m4;
import k0.r3;
import k6.h5;
import k6.j;
import k6.p7;
import k6.x7;
import k6.y6;
import m0.m;
import m9.e0;
import r1.x0;
import r9.C0405;
import u3.C0434;
import u8.C0438;
import w4.C0461;
import y.C0474;
import y0.o;

/* JADX INFO: renamed from: m1.۟ۧۥ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0350 {

    /* JADX INFO: renamed from: ۟ۤۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int f621 = -720;

    /* JADX INFO: renamed from: ۣ۟ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static String m6859(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static ServiceInfo m6860(Object obj) {
        if (C0434.m8498() <= 0) {
            return ((ResolveInfo) obj).serviceInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static float m6861(Object obj) {
        if (C0043.m833() > 0) {
            return ((r3) obj).f9422c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m6862(Object obj) {
        if (C0296.m5709() <= 0) {
            return ((y6) obj).f10583a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m6863(Object obj) {
        if (C0474.m9246() < 0) {
            return ((l) obj).f6289b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m6864() {
        if (C0267.m5113() < 0) {
            return zzew.zzf.zza.PARTIAL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠۠, reason: not valid java name and contains not printable characters */
    public static void m6865(Object obj, Object obj2) {
        if (C0438.m8564() >= 0) {
            ((p7) obj).E((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m6866(Object obj) {
        if (C0040.m792() >= 0) {
            ((Iterator) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۡۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m6867(Object obj) {
        if (C0121.m2336() <= 0) {
            return ((x0) obj).f13424b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6869() {
        if (C0063.m1217() >= 0) {
            return "(";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6870(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        if (C0405.m7952() < 0) {
            e0.i((a3) obj, (o) obj2, (f) obj3, (m) obj4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static void m6871(Object obj) throws IOException {
        if (C0000.m12() < 0) {
            ((GZIPInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m6872(Object obj) {
        if (C0239.m4596() > 0) {
            return ((zzad) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۥ, reason: contains not printable characters */
    public static j m6873(Object obj, Object obj2) {
        if (C0461.m8993() >= 0) {
            return ((h5) obj).d((x7) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static String m6874() {
        if (C0127.m2448() >= 0) {
            return zzpa.zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۡ, reason: contains not printable characters */
    public static int m6875(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۢۦ, reason: not valid java name and contains not printable characters */
    public static long m6876(Object obj) {
        if (C0217.m4144() > 0) {
            return ((m4) obj).f9228h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static l0 m6877(Object obj) {
        if (C0474.m9246() < 0) {
            return ((k) obj).f9083d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m6878() {
        return (-76) ^ C0070.f90;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static String m6868(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
