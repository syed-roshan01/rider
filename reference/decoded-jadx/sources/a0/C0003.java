package a0;

import a8.C0009;
import android.view.KeyEvent;
import androidx.annotation.C0019;
import androidx.compose.foundation.text.modifiers.C0025;
import ca.C0070;
import com.google.android.gms.internal.measurement.zzqd;
import dagger.hilt.android.internal.modules.C0234;
import e1.C0257;
import ea.C0268;
import f0.c1;
import f0.k1;
import i.C0315;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import k0.g3;
import k0.m1;
import k6.a5;
import k6.d5;
import k6.z4;
import l8.C0346;
import r2.C0395;
import u.C0428;

/* JADX INFO: renamed from: a0.ۣ۟ۤۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0003 {

    /* JADX INFO: renamed from: ۟ۦ۟ۥۣ, reason: collision with root package name */
    public static int f881 = -861;

    /* JADX INFO: renamed from: ۟۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m59(Object obj) {
        if (C0268.m5123() > 0) {
            return ((URLConnection) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m60(Object obj, Object obj2, Object obj3) {
        if (C0009.m177() >= 0) {
            ((k6.k) obj).V((String) obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m61(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static float m62() {
        if (C0257.m4918() > 0) {
            return m1.f9205d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۤ, reason: not valid java name and contains not printable characters */
    public static k1 m63(Object obj) {
        if (C0019.m375() < 0) {
            return ((c1) obj).f5635c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۡ, reason: not valid java name and contains not printable characters */
    public static String m64(String str) {
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

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Long m66(Object obj) {
        if (C0070.m1363() > 0) {
            return ((k6.t) obj).f10372h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m67() {
        if (C0428.m8409() < 0) {
            return zzqd.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static y0.o m68(Object obj) {
        if (C0395.m7737() > 0) {
            return ((g3) obj).f8945a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡ۟, reason: contains not printable characters */
    public static d5 m69(Object obj, Object obj2) {
        if (C0315.m6111() >= 0) {
            return ((z4) obj).q((Callable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static int m70() {
        return (-308) ^ C0346.f617;
    }

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m71(Object obj) {
        if (C0234.m4512() > 0) {
            return ((KeyEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧ۠۟, reason: not valid java name and contains not printable characters */
    public static void m72(Object obj, long j10) {
        if (C0025.m495() >= 0) {
            ((a5) obj).q(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m65(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
