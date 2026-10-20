package c4;

import android.os.IBinder;
import android.os.IInterface;
import android.support.v4.app.C0014;
import androidx.compose.foundation.text.modifiers.C0025;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.bind.C0207;
import d7.C0219;
import d9.C0222;
import dagger.hilt.internal.generatesrootinput.C0250;
import dagger.hilt.internal.processedrootsentinel.C0251;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ThreadPoolExecutor;
import k0.c1;
import k0.d1;
import k0.i0;
import k0.l0;
import k0.q3;
import k0.u3;
import k6.d5;
import k6.h6;
import k6.p7;
import k6.s5;
import k6.x;
import k6.x3;
import o1.c0;
import p8.C0379;
import u4.C0436;
import x.m;
import x7.C0472;
import y0.o;

/* JADX INFO: renamed from: c4.۟ۢۨۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0064 {

    /* JADX INFO: renamed from: ۥۧۨۧ, reason: contains not printable characters */
    public static int f84 = -931;

    /* JADX INFO: renamed from: ۟۠۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static s5 m1227(Object obj) {
        if (C0330.m6374() > 0) {
            return ((h6) obj).f10088e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1228(Object obj) {
        if (C0472.m9193() <= 0) {
            return ((d5) obj).f9974b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m1229(Object obj) {
        if (C0436.m8524() < 0) {
            return ((i0) obj).f9009m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1230() {
        if (C0136.m2627() > 0) {
            return "ad_services_version";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static x3 m1231() {
        if (C0130.m2511() > 0) {
            return x.f10515w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1232(String str) {
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
    public static String m1233(Object obj) {
        if (C0250.m4793() > 0) {
            return ((zzfi.zzn) obj).zzh();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static o m1235(Object obj, Object obj2, Object obj3) {
        if (C0014.m269() <= 0) {
            return c0.a((o) obj, obj2, (c9.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m1236(boolean z10, Object obj, Object obj2, Object obj3, boolean z11, Object obj4, Object obj5, Object obj6, int i10, int i11) {
        if (C0175.m3346() > 0) {
            u3.a(z10, (c9.c) obj, (o) obj2, (c9.e) obj3, z11, (q3) obj4, (m) obj5, (m0.m) obj6, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1237(Object obj, Object obj2) {
        if (C0178.m3402() >= 0) {
            ((ThreadPoolExecutor) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1238(Object obj) {
        if (C0025.m495() >= 0) {
            return ((c1) obj).f8782c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1239(Object obj) {
        if (C0222.m4279() < 0) {
            return ((p7) obj).f10305t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1240() {
        if (C0199.m3818() >= 0) {
            return zzpg.zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۧۧ, reason: not valid java name and contains not printable characters */
    public static l0 m1241() {
        if (C0207.m3957() > 0) {
            return l0.f9143p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۣ, reason: not valid java name and contains not printable characters */
    public static IInterface m1242(Object obj, Object obj2) {
        if (C0219.m4237() >= 0) {
            return ((IBinder) obj).queryLocalInterface((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static int m1243() {
        return 251 ^ C0251.f331;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۨ, reason: contains not printable characters */
    public static int m1244(long j10) {
        if (C0379.m7433() >= 0) {
            return p.M0(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1245(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1246(Object obj) {
        if (C0014.m269() <= 0) {
            return ((d1) obj).f8820a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1234(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
