package d9;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0022;
import b0.h0;
import c4.C0065;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.emulators.C0140;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.gson.internal.sql.C0208;
import d5.o1;
import d5.w0;
import dagger.hilt.internal.definecomponent.C0250;
import f0.s1;
import fa.C0282;
import g4.C0290;
import h3.C0302;
import h5.C0309;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k0.b0;
import k6.j5;
import k6.m7;
import k6.x7;
import k6.y3;
import l0.C0340;
import p8.C0381;
import p9.q0;
import t.d0;
import w2.C0459;
import x4.C0469;

/* JADX INFO: renamed from: d9.ۧۧۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0226 {

    /* JADX INFO: renamed from: ۟ۥۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int f305 = -150;

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4329(Object obj, Object obj2) {
        if (C0208.m3984() <= 0) {
            ((AtomicReference) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4330(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4331(Object obj, Object obj2) {
        if (C0065.m1257() < 0) {
            return ((String) obj).toUpperCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۦ, reason: not valid java name and contains not printable characters */
    public static w0.u m4332(Object obj) {
        if (C0140.m2699() > 0) {
            return ((b0) obj).f8727c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m4333(Object obj) {
        if (C0309.m5962() > 0) {
            return ((j5) obj).f10122c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static h0 m4334(Object obj) {
        if (C0250.m4779() <= 0) {
            return ((w0) obj).f4818a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static t.w m4335() {
        if (C0381.m7467() > 0) {
            return d0.f14120a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4336(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m4337(Object obj) {
        if (C0340.m6658() <= 0) {
            return ((ApplicationInfo) obj).metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4338(Object obj) {
        if (C0302.m5797() < 0) {
            ((a5.j) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۠ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4339() {
        return (-465) ^ C0469.f739;
    }

    /* JADX INFO: renamed from: ۢۡۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4340(Object obj, Object obj2, Object obj3, int i10) {
        if (C0116.m2247() > 0) {
            o1.a((MainViewModel) obj, (Map) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static boolean m4342(Object obj) {
        if (C0459.m8930() > 0) {
            return ((m7) obj).r();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static Certificate m4343(Object obj, Object obj2) {
        if (C0080.m1729() < 0) {
            return ((CertificateFactory) obj).generateCertificate((InputStream) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۧ, reason: contains not printable characters */
    public static u8.e m4344(Object obj, Object obj2, Object obj3) {
        if (C0022.m444() <= 0) {
            return ((s1) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۢ, reason: contains not printable characters */
    public static q0 m4345(Object obj) {
        if (C0282.m5443() <= 0) {
            return ((MainViewModel) obj).f3091g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m4346(Object obj, Object obj2) {
        if (C0203.m3894() > 0) {
            ((y3) obj).s((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m4347(Object obj) {
        if (C0290.m5580() < 0) {
            return ((d5.b0) obj).f4413p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4348(int i10, int i11, int i12, Object obj, Object obj2) {
        if (C0102.m2007() >= 0) {
            b9.b.H(i10, i11, i12, (Object[]) obj, (Object[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4341(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
