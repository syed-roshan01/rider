package com.google.firebase.analytics.ktxtesting;

import a2.x;
import androidx.compose.foundation.layout.c;
import androidx.profileinstaller.C0045;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.measurement.internal.C0105;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.z;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.C0200;
import d5.C0219;
import d5.o0;
import d8.C0222;
import j.a;
import java.io.ByteArrayOutputStream;
import k0.b5;
import k0.d2;
import k0.e1;
import k0.l2;
import k0.s1;
import k6.x3;
import m0.m;
import r1.x0;
import r2.C0395;
import r2.C0398;
import u8.e;
import w2.C0458;
import w5.C0464;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.analytics.ktxtesting.ۤۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0121 {

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int f147 = 598;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m2325(Object obj) {
        if (C0133.m2559() >= 0) {
            return ((x) obj).f1038h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static b0 m2326(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((z) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2328() {
        if (C0173.m3314() >= 0) {
            return "Driver Apps Status";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m2329(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m2330(Object obj) {
        if (C0200.m3841() <= 0) {
            return ((d2) obj).f8832f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int m2331(boolean z10, int i10, int i11, Object obj, Object obj2) {
        if (C0136.m2627() > 0) {
            return s1.e(z10, i10, i11, (x0) obj, (x0) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2332(Object obj) {
        if (C0395.m7729() > 0) {
            return ((b5) obj).f8763t;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۦۥ, reason: not valid java name and contains not printable characters */
    public static e m2333(Object obj, Object obj2, Object obj3) {
        if (C0222.m4264() >= 0) {
            return ((o0) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static x3 m2334() {
        if (C0045.m874() > 0) {
            return k6.x.X;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static c9.e m2335(Object obj) {
        if (C0143.m2751() > 0) {
            return ((k0.e) obj).f8844a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦ۟, reason: contains not printable characters */
    public static int m2336() {
        return (-1002) ^ C0110.f136;
    }

    /* JADX INFO: renamed from: ۦۨۥۦ, reason: contains not printable characters */
    public static o m2337(Object obj) {
        if (C0458.m8901() < 0) {
            return c.j((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m2338(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10, int i11) {
        if (C0105.m2045() >= 0) {
            e1.a((h1.c) obj, (String) obj2, (o) obj3, j10, (m) obj4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m2339() {
        if (C0464.m9033() >= 0) {
            return zzew.zzf.zza.IN_LIST;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟۠, reason: not valid java name and contains not printable characters */
    public static int m2340(Object obj) {
        if (C0219.m4224() < 0) {
            return ((l2) obj).f9176f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m2341(String str) {
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

    /* JADX INFO: renamed from: ۧۧ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m2342(Object obj) {
        if (C0398.m7764() < 0) {
            return ((a) obj).e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2327(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
