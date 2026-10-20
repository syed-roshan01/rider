package m5;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.C0018;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.index.C0154;
import d1.C0213;
import e1.C0258;
import ea.C0268;
import f.C0270;
import f0.C0272;
import f4.y;
import f5.l;
import g5.C0290;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.EnumMap;
import k0.s1;
import k0.v4;
import k6.m6;
import k6.s5;
import k6.u7;
import k6.x;
import k6.x3;
import p7.n;
import r6.C0401;
import s8.C0417;
import u1.k;
import v6.C0446;
import y.t0;
import z2.C0484;

/* JADX INFO: renamed from: m5.۟ۥۣۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0354 {

    /* JADX INFO: renamed from: ۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int f625 = 297;

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6944(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m6945(Object obj) {
        if (C0446.m8696() >= 0) {
            return ((k.f) obj).f8599b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static c9.e m6946(Object obj) {
        if (C0401.m7881() <= 0) {
            return ((v4) obj).f9572f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m6947(Object obj, Object obj2, Object obj3) {
        if (C0125.m2408() > 0) {
            ((ConnectivityManager) obj).registerNetworkCallback((NetworkRequest) obj2, (ConnectivityManager.NetworkCallback) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m6948(Object obj) {
        if (C0270.m5170() <= 0) {
            return ((k0.e) obj).f8848e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static int m6949(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, Object obj) {
        if (C0213.m4083() < 0) {
            return s1.c(i10, i11, i12, i13, i14, i15, i16, i17, f10, j10, f11, (t0) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static u7 m6951(Object obj) {
        if (C0272.m5249() < 0) {
            return ((y) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۥ, reason: not valid java name and contains not printable characters */
    public static EnumMap m6952(Object obj) {
        if (C0258.m4939() <= 0) {
            return ((s5) obj).f10355a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6953() {
        return 631 ^ C0355.f626;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m6954(Object obj) {
        if (C0154.m2958() < 0) {
            return ((l) obj).f6295o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static x3 m6955() {
        if (C0268.m5123() >= 0) {
            return x.f10498n0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۥ, reason: not valid java name and contains not printable characters */
    public static String m6956() {
        if (C0484.m9436() <= 0) {
            return "_gbraid";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityManager m6957(Object obj) {
        if (C0417.m8208() >= 0) {
            return ((k) obj).f15138a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡ۠, reason: contains not printable characters */
    public static String m6958(String str) {
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

    /* JADX INFO: renamed from: ۦ۟ۡۥ, reason: contains not printable characters */
    public static int m6959(Object obj) {
        if (C0018.m354() >= 0) {
            return ((m6) obj).f10209b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۧ, reason: contains not printable characters */
    public static String m6960(Object obj, Object obj2) {
        if (C0290.m5589() < 0) {
            return ((n) obj).e((ArrayList) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m6950(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
