package androidx.lifecycle;

import aa.C0011;
import androidx.compose.foundation.text.modifiers.C0025;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.ktx.C0180;
import d5.b2;
import f0.C0271;
import f0.a2;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import java.util.PriorityQueue;
import k0.i2;
import k0.j2;
import k2.C0333;
import k6.f7;
import k6.s5;
import k6.x3;
import k6.y5;
import m0.k1;
import m4.C0353;
import w4.C0460;
import z3.C0486;

/* JADX INFO: renamed from: androidx.lifecycle.ۧۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0043 {

    /* JADX INFO: renamed from: ۣ۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int f63 = 854;

    /* JADX INFO: renamed from: ۟۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static int m833() {
        return 242 ^ C0328.f476;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m834(int i10) {
        if (C0121.m2336() <= 0) {
            return com.google.crypto.tink.shaded.protobuf.p.K0(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static x3 m835() {
        if (C0025.m495() > 0) {
            return k6.x.f10495m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static u8.e m837(Object obj, Object obj2, Object obj3) {
        if (C0271.m5222() < 0) {
            return ((b2) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۢ, reason: not valid java name and contains not printable characters */
    public static c9.f m838(Object obj) {
        if (C0131.m2522() >= 0) {
            return ((j2) obj).f9068d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Boolean m839(Object obj) {
        if (C0486.m9464() > 0) {
            return s5.g((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static Task m840(Object obj) {
        if (C0353.m6940() <= 0) {
            return ((FirebaseUser) obj).reload();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m841(Object obj) {
        if (C0333.m6472() <= 0) {
            return ((f7) obj).f10053b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m842(String str) {
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

    /* JADX INFO: renamed from: ۢۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static k1 m843(Object obj) {
        if (C0011.m208() <= 0) {
            return ((a2) obj).f5601b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static long m844(Object obj, Object obj2) {
        if (C0460.m8972() > 0) {
            return ((k6.k) obj).W((String) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۣۧ, reason: contains not printable characters */
    public static int m845(Object obj) {
        if (C0180.m3448() > 0) {
            return ((i2) obj).f9027e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static int m846(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static PriorityQueue m847(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((y5) obj).Q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m836(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
