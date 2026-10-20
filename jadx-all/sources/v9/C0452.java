package v9;

import a8.C0009;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityManager;
import c7.C0069;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.annotations.C0127;
import d5.n;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0243;
import f4.C0277;
import g.C0284;
import g4.C0290;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import k0.m1;
import k6.a5;
import m9.f1;
import r.C0393;
import w5.C0463;
import y1.i;
import y1.u;

/* JADX INFO: renamed from: v9.۟۟ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0452 {

    /* JADX INFO: renamed from: ۟ۥۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int f722 = 716;

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8793() {
        return 1013 ^ C0009.f29;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8794(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static u m8795() {
        if (C0393.m7675() <= 0) {
            return i.f16775o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۧ, reason: not valid java name and contains not printable characters */
    public static float m8797() {
        if (C0069.m1332() < 0) {
            return m1.f9203b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8798() {
        if (C0277.m5315() <= 0) {
            return "Error storing raw event. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m8799(Object obj, Object obj2, int i10) {
        if (C0284.m5468() >= 0) {
            return ((PackageManager) obj).getReceiverInfo((ComponentName) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8800(Object obj, Object obj2) {
        if (C0290.m5580() < 0) {
            ((f1) obj).a((CancellationException) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8801(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8802(Object obj) {
        if (C0463.m9013() < 0) {
            return ((AccessibilityManager) obj).isTouchExplorationEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static long m8803(Object obj) {
        if (C0127.m2448() >= 0) {
            return ((a5) obj).f9889x;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8804() {
        if (C0234.m4495() < 0) {
            return "ಕನ್ನಡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static String m8805(Object obj, Object obj2) {
        if (C0106.m2067() >= 0) {
            return ((String) obj).concat((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static u0.b m8806() {
        if (C0243.m4660() <= 0) {
            return n.f4683d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8796(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
