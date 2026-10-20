package ca;

import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.graphics.C0031;
import c1.C0061;
import c1.p;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.messaging.reporting.C0188;
import d5.u0;
import f1.C0274;
import h1.C0301;
import java.io.ByteArrayOutputStream;
import k0.i0;
import k6.l4;
import k6.o4;
import k6.x7;
import m1.C0351;
import m1.C0352;
import n.C0362;
import s4.j;
import t2.C0422;
import u4.C0436;
import y1.i;
import y1.u;

/* JADX INFO: renamed from: ca.ۨۤۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0070 {

    /* JADX INFO: renamed from: ۥۥۧۢ, reason: contains not printable characters */
    public static int f90 = 765;

    /* JADX INFO: renamed from: ۟۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1353(Object obj) {
        if (C0436.m8516() >= 0) {
            return ((zzew.zzb) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static o4 m1354(Object obj) {
        if (C0031.m598() > 0) {
            return ((l4) obj).f10171d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m1355(Object obj, int i10) {
        if (C0188.m3594() > 0) {
            return androidx.compose.ui.focus.a.x((p) obj, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨ۟, reason: not valid java name and contains not printable characters */
    public static long m1356(Object obj) {
        if (C0352.m6885() > 0) {
            return ((i0) obj).f9014r;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1357(Object obj) {
        if (C0351.m6878() < 0) {
            return ((u0) obj).f4791a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1358(Object obj) {
        if (C0274.m5273() < 0) {
            return ((x7) obj).f10551p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟۠, reason: not valid java name and contains not printable characters */
    public static zzew.zzd m1359(Object obj) {
        if (C0021.m417() >= 0) {
            return ((zzew.zzb) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m1361(Object obj, Object obj2) {
        if (C0362.m7097() < 0) {
            ((TaskCompletionSource) obj).setException((Exception) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m1362(String str) {
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

    /* JADX INFO: renamed from: ۢۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m1363() {
        return (-358) ^ C0124.f150;
    }

    /* JADX INFO: renamed from: ۣۤۧۡ, reason: not valid java name and contains not printable characters */
    public static u m1364() {
        if (C0422.m8278() <= 0) {
            return i.f16762b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1365(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public static j m1366(Object obj) {
        if (C0301.m5773() < 0) {
            return ((s4.h) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m1367() {
        if (C0061.m1161() < 0) {
            return zzne.zzb();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m1360(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
