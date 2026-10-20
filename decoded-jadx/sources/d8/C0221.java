package d8;

import a2.b0;
import android.support.v4.app.C0015;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.components.C0134;
import com.google.firebase.remoteconfig.C0200;
import d5.i0;
import d5.p0;
import dagger.hilt.internal.aliasof.C0247;
import f5.t;
import g2.C0286;
import h.C0297;
import h7.C0310;
import java.io.ByteArrayOutputStream;
import k0.h;
import k6.f5;
import k6.y5;
import m0.l3;
import o2.C0368;
import s.C0407;
import u0.C0430;
import y.a1;
import y0.o;

/* JADX INFO: renamed from: d8.ۣۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0221 {

    /* JADX INFO: renamed from: ۨۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int f301 = -747;

    /* JADX INFO: renamed from: ۟۠۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static l3 m4262(Object obj) {
        if (C0430.m8425() > 0) {
            return ((p0) obj).f4716c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4263() {
        if (C0200.m3841() <= 0) {
            return "gclid";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۤ, reason: not valid java name and contains not printable characters */
    public static int m4264() {
        return (-374) ^ C0118.f144;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4265() {
        if (C0297.m5722() > 0) {
            return "Data loss. Failed to serialize bundle. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m4266(Object obj) {
        if (C0134.m2587() < 0) {
            return ((zzfi.zzj) obj).zzau();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4267(Object obj) {
        if (C0407.m7989() >= 0) {
            return ((i0) obj).f4563b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۤ, reason: not valid java name and contains not printable characters */
    public static e m4268(Object obj) {
        if (C0286.m5522() >= 0) {
            return ((h) obj).f8961c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static o m4269() {
        if (C0015.m294() <= 0) {
            return a1.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4270(Object obj) {
        if (C0310.m5997() > 0) {
            return ((zzfi.zzj) obj).zzah();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m4272(Object obj) {
        if (C0247.m4732() < 0) {
            return ((t) obj).f6326b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4273(long j10) {
        if (C0084.m1804() >= 0) {
            return b0.b(j10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4274() {
        if (C0117.m2257() >= 0) {
            return zzne.zzat();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static String m4275(String str) {
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

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static int m4276(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۡ۠۟, reason: not valid java name and contains not printable characters */
    public static y5 m4277(Object obj) {
        if (C0368.m7234() >= 0) {
            return ((f5) obj).f10039p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4271(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
