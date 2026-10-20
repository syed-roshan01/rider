package v6;

import androidx.compose.ui.layout.C0036;
import b7.C0053;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.C0205;
import com.google.firebase.annotations.C0127;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.RemoteMessage;
import d1.C0214;
import d5.c0;
import f0.c2;
import f5.f0;
import h8.C0314;
import i1.j0;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.d0;
import k0.i0;
import k0.t1;
import k6.a5;
import l9.C0347;
import m9.e0;
import n1.C0362;
import r1.x0;
import w4.C0461;
import w9.C0465;
import y9.C0479;

/* JADX INFO: renamed from: v6.۟ۦۨۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0447 {

    /* JADX INFO: renamed from: ۟ۥۧۥۧ, reason: not valid java name and contains not printable characters */
    public static int f718 = -186;

    /* JADX INFO: renamed from: ۣ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m8713(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static j0 m8714(Object obj, Object obj2) {
        if (C0362.m7099() <= 0) {
            return i1.b.E((i1.f) obj, (m0.m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8715(Object obj, Object obj2) {
        if (C0127.m2448() > 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8716(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static long m8717(Object obj) {
        if (C0329.m6367() >= 0) {
            return ((i0) obj).f8999c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m8718(Object obj) {
        if (C0131.m2522() > 0) {
            return ((f0.i0) obj).f5751a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8720(Object obj) {
        if (C0205.m3914() >= 0) {
            return ((UserProfile) obj).getPlanType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static d5.l m8721() {
        if (C0036.m698() <= 0) {
            return d5.l.f4628e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠۠, reason: not valid java name and contains not printable characters */
    public static RemoteMessage.Notification m8722(Object obj) {
        if (C0479.m9346() >= 0) {
            return ((RemoteMessage) obj).getNotification();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8723(Object obj, Object obj2) {
        if (C0167.m3200() > 0) {
            ((a5) obj).p((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠۠, reason: not valid java name and contains not printable characters */
    public static y0.o m8724(Object obj, Object obj2) {
        if (C0157.m2999() >= 0) {
            return e0.v((y0.o) obj, (c9.f) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static void m8725(Object obj, float f10, float f11) {
        if (C0465.m9068() < 0) {
            ((k.f) obj).D(f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Map m8726(Object obj) {
        if (C0174.m3323() < 0) {
            return ((c0) obj).f4431e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m8727(Object obj) {
        if (C0347.m6808() < 0) {
            obj.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۢۥۢۥ, reason: not valid java name and contains not printable characters */
    public static r1.s m8728(Object obj) {
        if (C0153.m2938() <= 0) {
            return ((c2) obj).f5643h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m8729(Object obj) {
        if (C0073.m1597() >= 0) {
            return ((f0) obj).f6257c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float m8730(Object obj) {
        if (C0314.m6079() >= 0) {
            return ((d0) obj).f8818d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۣۧۤ, reason: contains not printable characters */
    public static x0 m8731(Object obj) {
        if (C0053.m1029() <= 0) {
            return ((t1) obj).f9481p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥۣ, reason: contains not printable characters */
    public static int m8732() {
        return 331 ^ C0107.f133;
    }

    /* JADX INFO: renamed from: ۧۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m8733() {
        if (C0461.m8993() >= 0) {
            return "Location Filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۧ, reason: not valid java name and contains not printable characters */
    public static long m8734(Object obj) {
        if (C0214.m4096() >= 0) {
            return ((k0.l) obj).f9129r;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8719(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
