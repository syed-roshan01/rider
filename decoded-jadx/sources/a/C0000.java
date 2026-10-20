package a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.C0023;
import b1.C0050;
import c0.C0057;
import c9.e;
import com.auto.accept.data.model.UserProfile;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.C0192;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.h1;
import d5.t;
import d5.v0;
import d5.w;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0241;
import dagger.hilt.migration.C0254;
import f5.s;
import g2.c0;
import g4.C0289;
import h5.C0307;
import i6.C0320;
import j4.C0326;
import java.io.ByteArrayOutputStream;
import k0.b5;
import k0.l;
import k0.m0;
import k0.z2;
import k6.a5;
import k6.e6;
import k6.f;
import k6.x3;
import k6.z7;
import l2.o;
import m0.l3;
import m0.q2;
import o2.C0368;
import v6.C0446;
import w9.C0465;
import x7.C0472;
import y6.C0476;

/* JADX INFO: renamed from: a.ۥۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0000 {

    /* JADX INFO: renamed from: ۟۟ۡۨۤ, reason: collision with root package name */
    public static int f768 = -119;

    /* JADX INFO: renamed from: ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static long m0(Object obj) {
        if (C0254.m4866() <= 0) {
            return ((e6) obj).f10006c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static int m1(Object obj, Object obj2, Object obj3) {
        if (C0203.m3894() >= 0) {
            return ((f) obj).q((String) obj2, (x3) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m2(Object obj) {
        if (C0241.m4629() < 0) {
            return ((s) obj).f6324b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static e m3(Object obj) {
        if (C0183.m3510() >= 0) {
            return ((l) obj).f9123e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static long m4(int i10, int i11) {
        if (C0465.m9068() < 0) {
            return o1.s.e(i10, i11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m6(Object obj) {
        if (C0136.m2627() >= 0) {
            return ((b5) obj).f8768y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static c0 m7() {
        if (C0446.m8696() > 0) {
            return c0.f6516c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static q.f m8(Object obj) {
        if (C0307.m5935() >= 0) {
            return ((z7) obj).f10622f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static String m9(String str) {
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

    /* JADX INFO: renamed from: ۟ۦ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Context m10(Object obj) {
        if (C0161.m3081() < 0) {
            return ((w) obj).f4812a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m11(Object obj) {
        if (C0057.m1090() < 0) {
            return ((m0) obj).f9201a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m12() {
        return (-694) ^ C0152.f177;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m13() {
        if (C0289.m5580() <= 0) {
            return "_lgclid";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m14(Object obj) {
        if (C0050.m982() < 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static UserProfile m15(Object obj) {
        if (C0023.m461() > 0) {
            return ((h1) obj).f4543b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨۡ, reason: not valid java name and contains not printable characters */
    public static l3 m16(Object obj) {
        if (C0476.m9298() < 0) {
            return ((t) obj).f4777b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m17(Object obj) {
        if (C0234.m4512() > 0) {
            return ((a5) obj).f9876k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static int m18(Object obj) {
        if (C0320.m6200() >= 0) {
            return ((Bitmap) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static long m19(Object obj) {
        if (C0163.m3132() >= 0) {
            return ((o) obj).d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static long m20(int i10) {
        if (C0368.m7234() > 0) {
            return androidx.compose.ui.input.key.a.a(i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static int m21(Object obj, int i10) {
        if (C0192.m3659() > 0) {
            return ((q2) obj).p(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۧۦ, reason: contains not printable characters */
    public static l3 m23(Object obj) {
        if (C0472.m9193() < 0) {
            return ((v0) obj).f4801e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Object m24(Object obj) {
        if (C0326.m6304() < 0) {
            return ((z2) obj).f9699d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m22(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
