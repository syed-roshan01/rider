package d5;

import android.content.Intent;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.input.pointer.C0034;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.platforminfo.C0193;
import dagger.hilt.android.components.C0229;
import e0.C0257;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import k3.C0336;
import k6.h5;
import k6.p2;
import m5.C0355;
import q1.C0384;
import v8.C0451;
import z.C0481;
import z.C0482;

/* JADX INFO: renamed from: d5.ۣۦۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0219 {

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int f298 = -545;

    /* JADX INFO: renamed from: ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4211(Object obj) {
        if (C0355.m6953() <= 0) {
            return ((zzfi.zzj) obj).zzbi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static Bitmap m4212(Object obj, int i10, int i11, boolean z10) {
        if (C0146.m2776() >= 0) {
            return Bitmap.createScaledBitmap((Bitmap) obj, i10, i11, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m4213(Object obj, Object obj2) {
        if (C0481.m9354() <= 0) {
            ((h5) obj).a((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static a5.z m4214(Object obj) {
        if (C0115.m2227() <= 0) {
            return ((a5.x) obj).f1319b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static g2.a0 m4215(Object obj) {
        if (C0229.m4402() >= 0) {
            return ((f0.p1) obj).f5848c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4216(Object obj, int i10) {
        if (C0021.m417() >= 0) {
            y3.e.x((m0.m) obj, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠۟, reason: not valid java name and contains not printable characters */
    public static y0.o m4217(Object obj, Object obj2) {
        if (C0034.m667() > 0) {
            return androidx.compose.foundation.layout.a.i((y0.o) obj, (c9.c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4218(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4219(Object obj) {
        if (C0257.m4901() <= 0) {
            return ((p2) obj).u();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4220(Object obj) {
        if (C0193.m3691() < 0) {
            return ((zzfi.zzj) obj).zzbe();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m4221(Object obj) {
        if (C0482.m9373() <= 0) {
            return ((m0) obj).f4672a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m4222(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static l m4223() {
        if (C0336.m6500() <= 0) {
            return l.f4627d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4224() {
        return 904 ^ C0384.f654;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۤ, reason: contains not printable characters */
    public static void m4225(Object obj) {
        if (C0081.m1735() >= 0) {
            ((h0.v0) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۦۡ۠۠, reason: contains not printable characters */
    public static String m4226(Object obj) {
        if (C0188.m3594() >= 0) {
            return ((Intent) obj).getAction();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static m0.n1 m4227(Object obj) {
        if (C0451.m8792() < 0) {
            return ((f0.c2) obj).f5641f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۡ, reason: not valid java name and contains not printable characters */
    public static y0.g m4228() {
        if (C0326.m6295() >= 0) {
            return y0.a.f16709b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m4230(Object obj, Object obj2, Object obj3, long j10, Object obj4, Object obj5) {
        if (C0110.m2123() <= 0) {
            return ((a5.z) obj).a((String) obj2, (String) obj3, j10, (String) obj4, (u8.e) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۦ, reason: not valid java name and contains not printable characters */
    public static r1.j0 m4231(Object obj, Object obj2, Object obj3) {
        if (C0080.m1729() <= 0) {
            return y.u.a((y.i) obj, (y0.e) obj2, (m0.m) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۡ, reason: not valid java name and contains not printable characters */
    public static String m4229(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
