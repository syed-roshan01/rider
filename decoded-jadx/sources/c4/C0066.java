package c4;

import a8.C0010;
import android.accessibilityservice.GestureDescription;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0198;
import d.C0210;
import d1.C0213;
import d5.l;
import d7.t;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0262;
import f0.c2;
import f0.n;
import g8.q2;
import java.io.ByteArrayOutputStream;
import k0.p4;
import k0.u;
import k0.v1;
import k0.z;
import k6.x;
import k6.x3;
import l0.h;
import m0.m;
import m7.C0357;
import r2.C0395;
import r6.C0402;
import r8.p;
import u4.C0436;
import u7.C0437;
import v8.C0450;
import w5.C0463;
import x8.C0473;
import y.i1;
import y.u0;
import y0.o;

/* JADX INFO: renamed from: c4.ۡ۟۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0066 {

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int f86 = -218;

    /* JADX INFO: renamed from: ۣ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static GestureDescription m1266(Object obj) {
        if (C0198.m3800() > 0) {
            return ((GestureDescription.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1267(Object obj, float f10, long j10, Object obj2, int i10, int i11) {
        if (C0195.m3737() <= 0) {
            t.f((o) obj, f10, j10, (m) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m1268(Object obj, Object obj2) {
        if (C0402.m7897() > 0) {
            return ((zzfi.zze.zza) obj).zza((zzfi.zzg.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1269(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1270(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static l m1271() {
        if (C0437.m8543() > 0) {
            return l.E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static float m1272(Object obj) {
        if (C0142.m2725() > 0) {
            return ((p4) obj).f9359a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static c2 m1273(Object obj) {
        if (C0119.m2289() > 0) {
            return ((n) obj).f5818a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m1274() {
        if (C0146.m2776() >= 0) {
            return h.f11063h;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static zzew.zzb.zza m1275(Object obj, Object obj2) {
        if (C0010.m199() > 0) {
            return ((zzew.zzb.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1277() {
        return (-265) ^ C0250.f330;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static d5.m m1278() {
        if (C0213.m4083() <= 0) {
            return d5.m.A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn.zza m1279(Object obj, Object obj2) {
        if (C0196.m3762() <= 0) {
            return ((zzfi.zzn.zza) obj).zzb((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static u0 m1280() {
        if (C0148.m2838() < 0) {
            return z.f9683a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠۠, reason: not valid java name and contains not printable characters */
    public static c9.e m1281(Object obj) {
        if (C0262.m5016() <= 0) {
            return ((k0.d) obj).f8814o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static Double m1282(Object obj) {
        if (C0436.m8524() < 0) {
            return p.N0((Iterable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1283(Object obj) {
        if (C0395.m7737() > 0) {
            return ((u) obj).f9507b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static int m1284() {
        if (C0357.m7001() < 0) {
            return v1.f9550b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۨۧ, reason: contains not printable characters */
    public static Float m1285(Object obj) {
        if (C0253.m4844() > 0) {
            return l9.h.C0((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤۦ, reason: contains not printable characters */
    public static int m1286(Object obj, Object obj2) {
        if (C0473.m9210() < 0) {
            return ((i1) obj).d((m2.b) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static zzfc.zzc.zza m1287(Object obj, Object obj2) {
        if (C0463.m9033() > 0) {
            return ((zzfc.zzc.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1288(Object obj) {
        if (C0450.m8792() <= 0) {
            ((q2) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static x3 m1289() {
        if (C0210.m4028() < 0) {
            return x.f10513v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1276(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
