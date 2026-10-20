package dagger.hilt.android.lifecycle;

import a2.a;
import androidx.compose.foundation.layout.C0022;
import b8.C0055;
import c9.e;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.Source;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.remoteconfig.C0200;
import com.google.protobuf.C0209;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import f5.i;
import f6.C0277;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.a0;
import k0.r4;
import k0.w4;
import k6.f5;
import k6.o5;
import k6.p;
import l.q;
import l3.C0342;
import m0.m;
import p3.C0375;
import u0.b;
import v5.C0444;
import w4.C0459;
import x.k;
import z.C0480;
import z5.f;

/* JADX INFO: renamed from: dagger.hilt.android.lifecycle.۟۠ۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0236 {

    /* JADX INFO: renamed from: ۟۠ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int f316 = -774;

    /* JADX INFO: renamed from: ۟ۡۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4543(Object obj) {
        if (C0022.m444() <= 0) {
            return ((i) obj).f6275c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۨۧ, reason: not valid java name and contains not printable characters */
    public static e m4544(Object obj) {
        if (C0342.m6720() > 0) {
            return ((r4) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static f m4545() {
        if (C0091.m1940() <= 0) {
            return f.f17253b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4546(Object obj) {
        if (C0277.m5361() < 0) {
            return ((a) obj).f890e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۦ, reason: not valid java name and contains not printable characters */
    public static p m4547(Object obj, Object obj2, long j10) {
        if (C0459.m8951() < 0) {
            return ((p) obj).a((f5) obj2, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4548(Object obj) {
        if (C0200.m3841() < 0) {
            return ((w4) obj).f9620b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static int m4549() {
        return 482 ^ C0055.f75;
    }

    /* JADX INFO: renamed from: ۟ۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4550(Object obj) {
        if (C0166.m3170() < 0) {
            f5.c((o5) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4551(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Source m4553() {
        if (C0125.m2408() >= 0) {
            return Source.SERVER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4554(String str) {
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

    /* JADX INFO: renamed from: ۡۢۤۦ, reason: not valid java name and contains not printable characters */
    public static List m4555(Object obj) {
        if (C0480.m9354() <= 0) {
            return ((AppConfig) obj).getVersionBlocked();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4556(Object obj, int i10, int i11, Object obj2, Object obj3, Object obj4, int i12) {
        if (C0444.m8673() >= 0) {
            y3.e.t((List) obj, i10, i11, (c9.a) obj2, (c9.a) obj3, (m) obj4, i12);
        }
    }

    /* JADX INFO: renamed from: ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m4557(Object obj, Object obj2) {
        if (C0209.m4013() >= 0) {
            return ((a0) obj).b((k) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static long m4558(Object obj, Object obj2) {
        if (C0375.m7362() >= 0) {
            return ((k6.k) obj).S((String) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۣۢ, reason: not valid java name and contains not printable characters */
    public static long m4559(Object obj) {
        if (C0147.m2805() <= 0) {
            return ((k0.k) obj).f9088p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4560(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0230.m4440() >= 0) {
            q.u((m0.q) obj, (b) obj2, (m0.q) obj3, (Integer) obj4, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m4552(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
