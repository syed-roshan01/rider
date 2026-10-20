package fa;

import android.view.View;
import androidx.compose.ui.graphics.C0032;
import b7.C0053;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.tracing.C0204;
import d5.a2;
import d5.k0;
import dagger.hilt.android.internal.C0235;
import e0.C0256;
import f0.p1;
import g2.C0286;
import h0.a1;
import h8.n;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.logging.Logger;
import k0.b2;
import k0.c2;
import k0.i0;
import k0.m4;
import k6.r7;
import k6.t4;
import l0.C0340;
import o5.C0370;
import p8.C0380;
import q6.C0388;
import q9.C0391;
import r2.C0397;
import u.C0428;
import u1.x1;
import v0.C0442;
import w1.C0455;

/* JADX INFO: renamed from: fa.ۣ۟ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0280 {

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int f425 = -452;

    /* JADX INFO: renamed from: ۟۠ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static q.f m5416(Object obj) {
        if (C0388.m7600() <= 0) {
            return ((t4) obj).f10385i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۨ, reason: not valid java name and contains not printable characters */
    public static int m5417(Object obj) {
        if (C0116.m2247() >= 0) {
            return ((a2) obj).f4399b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static long m5418(Object obj) {
        if (C0072.m1556() >= 0) {
            return ((m4) obj).Q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static MainViewModel m5419(Object obj) {
        if (C0397.m7764() <= 0) {
            return ((k0) obj).f4598a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static c9.a m5420(Object obj) {
        if (C0391.m7657() > 0) {
            return ((d5.e) obj).f4464o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m5421(Object obj, Object obj2) {
        if (C0442.m8630() <= 0) {
            ((View) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۨ, reason: not valid java name and contains not printable characters */
    public static Logger m5422() {
        if (C0235.m4538() > 0) {
            return n.T;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static f2.l m5423() {
        if (C0032.m620() <= 0) {
            return x1.p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۦ, reason: not valid java name and contains not printable characters */
    public static long m5424(Object obj) {
        if (C0204.m3905() < 0) {
            return ((c2) obj).f8788a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m5425(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m5426(Object obj) {
        if (C0286.m5522() > 0) {
            ((Thread) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static long m5428(Object obj) {
        if (C0053.m1029() < 0) {
            return ((i0) obj).f9018v;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m5429(Object obj, int i10, Object obj2, Object obj3) {
        if (C0380.m7467() >= 0) {
            r7.L((StringBuilder) obj, i10, (String) obj2, (zzew.zzd) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5430(String str) {
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

    /* JADX INFO: renamed from: ۥۦ۟ۧ, reason: contains not printable characters */
    public static a1 m5431(Object obj) {
        if (C0340.m6681() > 0) {
            return ((p1) obj).f5851f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۦ, reason: contains not printable characters */
    public static int m5432() {
        return 554 ^ C0428.f699;
    }

    /* JADX INFO: renamed from: ۦۨۨ۟, reason: contains not printable characters */
    public static Object m5433(Object obj) {
        if (C0455.m8885() < 0) {
            return ((t.d) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5434(Object obj, Object obj2) {
        if (C0256.m4901() < 0) {
            return ((Set) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦ۠۟, reason: not valid java name and contains not printable characters */
    public static float m5435() {
        if (C0370.m7269() >= 0) {
            return b2.f8736e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5427(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
