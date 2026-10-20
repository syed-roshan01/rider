package j3;

import a5.a0;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.remote.C0163;
import d5.l;
import dagger.hilt.android.components.C0227;
import ga.C0295;
import h8.n;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import k0.a3;
import k0.m3;
import k0.y2;
import k6.t7;
import k6.x;
import k6.x3;
import l2.i;
import m0.g1;
import q6.C0388;
import v7.C0449;
import w9.C0465;
import x2.C0467;
import x4.C0469;
import y3.e;

/* JADX INFO: renamed from: j3.۟ۧۧۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0325 {

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static int f473 = 371;

    /* JADX INFO: renamed from: ۟۠, reason: not valid java name and contains not printable characters */
    public static x3 m6283() {
        if (C0467.m9101() <= 0) {
            return x.f10497n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static l m6284() {
        if (C0465.m9068() < 0) {
            return l.f4632p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static String m6285(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۤۥۨ, reason: not valid java name and contains not printable characters */
    public static String m6286() {
        if (C0449.m8755() >= 0) {
            return "select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6287(Object obj) {
        if (C0149.m2863() > 0) {
            return e.n((g1) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6288(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m6289(Object obj, Object obj2, Object obj3) {
        if (C0061.m1161() <= 0) {
            return ((a3) obj).a((y2) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6290(Object obj, int i10, Object obj2) {
        if (C0123.m2379() > 0) {
            return ((ArrayList) obj).addAll(i10, (Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static t7 m6291(Object obj) {
        if (C0122.m2355() >= 0) {
            return ((k6.e) obj).f9989c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m6292(Object obj) {
        if (C0123.m2379() > 0) {
            return ((i) obj).f11210a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۡ, reason: not valid java name and contains not printable characters */
    public static u8.e m6293(Object obj, Object obj2, Object obj3) {
        if (C0388.m7600() <= 0) {
            return ((m3) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m6294(Object obj) {
        if (C0469.m9143() >= 0) {
            return ((n) obj).f7682k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m6295() {
        return 296 ^ C0295.f443;
    }

    /* JADX INFO: renamed from: ۤۨۧۥ, reason: not valid java name and contains not printable characters */
    public static a0 m6297() {
        if (C0163.m3132() > 0) {
            return a0.f1220c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static String m6298(Object obj) {
        if (C0141.m2714() < 0) {
            return Arrays.toString((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨ۟, reason: contains not printable characters */
    public static boolean m6299(Object obj) {
        if (C0127.m2448() >= 0) {
            return ((zzfi.zzg) obj).zzl();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۡ, reason: contains not printable characters */
    public static long m6300(Object obj) {
        if (C0227.m4380() > 0) {
            return ((a2.a0) obj).f895c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m6296(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
