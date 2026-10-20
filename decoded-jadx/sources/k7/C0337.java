package k7;

import android.app.Application;
import android.content.Context;
import android.os.C0013;
import b4.C0052;
import c9.c;
import com.auto.accept.service.C0072;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.reporting.C0188;
import d1.d;
import d5.b1;
import d5.p1;
import d9.C0226;
import e1.C0257;
import e7.C0264;
import f0.a2;
import f0.e;
import f0.i;
import f0.u;
import f5.o;
import g2.l0;
import g8.C0293;
import h3.C0303;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import k0.n1;
import k6.d7;
import k6.f5;
import m3.C0352;
import n8.C0365;
import t7.C0425;
import x0.C0466;
import y.f;
import y.k;
import y.t0;

/* JADX INFO: renamed from: k7.۟ۤۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0337 {

    /* JADX INFO: renamed from: ۟۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int f608 = 243;

    /* JADX INFO: renamed from: ۟۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static float m6619(Object obj) {
        if (C0425.m8351() <= 0) {
            return ((t0) obj).d();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m6620(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static c9.a m6621(Object obj) {
        if (C0133.m2559() >= 0) {
            return ((b1) obj).f4415b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Application m6622(Object obj) {
        if (C0169.m3245() > 0) {
            return ((o) obj).f6304a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static f m6623() {
        if (C0257.m4918() >= 0) {
            return k.f16611g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6624(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m6625(Object obj) {
        if (C0013.m253() > 0) {
            f6.a.t((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۥ, reason: not valid java name and contains not printable characters */
    public static e m6626() {
        if (C0264.m5062() <= 0) {
            return e.f5672d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Charset m6627() {
        if (C0052.m1013() >= 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static c9.e m6628(Object obj) {
        if (C0165.m3154() < 0) {
            return ((n1) obj).f9261r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static l0 m6629(Object obj) {
        if (C0466.m9086() >= 0) {
            return ((u) obj).f5953o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6630(Object obj) {
        if (C0138.m2662() > 0) {
            return ((p1) obj).f4722d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static d m6631(Object obj) {
        if (C0352.m6904() < 0) {
            return ((a2) obj).f5602c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۦ, reason: not valid java name and contains not printable characters */
    public static void m6632(Object obj, Object obj2, int i10, int i11) throws IOException {
        if (C0226.m4372() < 0) {
            ((OutputStream) obj).write((byte[]) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۢۢۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6633(Object obj, int i10) {
        if (C0293.m5656() > 0) {
            return f6.a.W((Context) obj, i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static c m6635(Object obj) {
        if (C0188.m3594() > 0) {
            return ((i) obj).f5744d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String m6636() {
        if (C0303.m5859() <= 0) {
            return "pair_shizuku";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢ۟, reason: contains not printable characters */
    public static d7 m6637(Object obj) {
        if (C0072.m1556() > 0) {
            return ((f5) obj).f10034k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۣ, reason: contains not printable characters */
    public static int m6638() {
        return 394 ^ C0365.f636;
    }

    /* JADX INFO: renamed from: ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m6634(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
