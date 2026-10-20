package p5;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.protobuf.e1;
import d2.C0216;
import d5.h2;
import f0.t;
import h0.v0;
import i3.u;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.m2;
import k6.c6;
import k6.s5;
import n7.C0364;
import r1.C0394;

/* JADX INFO: renamed from: p5.۟ۡۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0378 {

    /* JADX INFO: renamed from: ۟ۦ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int f648 = 191;

    /* JADX INFO: renamed from: ۟۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m7389() {
        return (-234) ^ C0186.f210;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static long m7390(Object obj) {
        if (C0394.m7716() >= 0) {
            return ((zzfi.zzd) obj).zzb();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int m7391(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m7392(Object obj) {
        if (C0183.m3510() >= 0) {
            return ((h2) obj).f4548b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7394(Object obj) {
        if (C0216.m4108() < 0) {
            return ((zzew.zzf) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m7395(Object obj, int i10) {
        if (C0125.m2408() > 0) {
            return ((e1) obj).c(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m7396(Object obj) {
        if (C0105.m2045() > 0) {
            return ((c6) obj).f9937a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7397(String str) {
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

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static u m7398() {
        if (C0122.m2355() >= 0) {
            return q9.c.f13247b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static List m7399(Object obj) {
        if (C0175.m3346() > 0) {
            return ((m2) obj).f9219t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static boolean m7400(Object obj) {
        if (C0196.m3762() < 0) {
            return ((s5) obj).m();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۨ۠, reason: contains not printable characters */
    public static int m7401(Object obj, int i10) {
        if (C0109.m2116() < 0) {
            return ((String) obj).lastIndexOf(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۨۦ, reason: not valid java name and contains not printable characters */
    public static v0 m7402(Object obj) {
        if (C0364.m7127() <= 0) {
            return ((t) obj).f5912t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m7393(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
