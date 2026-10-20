package com.google.firebase.appcheck;

import a5.y;
import a5.z;
import android.database.Cursor;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.protobuf.v;
import d2.C0216;
import d5.f1;
import d9.C0223;
import e7.C0265;
import fa.C0281;
import g3.C0289;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import k6.r7;
import k6.u7;
import k6.x7;
import la.g;
import n8.C0366;
import q6.C0388;
import q7.C0391;
import t2.C0421;
import u8.e;
import v0.C0441;
import z7.C0490;
import z7.C0491;

/* JADX INFO: renamed from: com.google.firebase.appcheck.ۤۦۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0131 {

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int f157 = -873;

    /* JADX INFO: renamed from: ۟۟ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m2518(Object obj, Object obj2) {
        if (C0391.m7643() <= 0) {
            return ((u7) obj).b0((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static String m2519(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2520(Object obj) {
        if (C0188.m3594() >= 0) {
            return ((y) obj).f1321a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2521() {
        if (C0223.m4279() <= 0) {
            return g.c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m2522() {
        return 444 ^ C0421.f691;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m2523() {
        if (C0082.m1758() >= 0) {
            return "has_realtime";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2524(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static Task m2525(Object obj, Object obj2) {
        if (C0441.m8597() >= 0) {
            return ((FirebaseAuth) obj).sendPasswordResetEmail((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠۠, reason: not valid java name and contains not printable characters */
    public static Task m2526(Object obj, Object obj2, Object obj3) {
        if (C0199.m3818() >= 0) {
            return ((FirebaseAuth) obj).createUserWithEmailAndPassword((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2527() {
        if (C0289.m5547() > 0) {
            return "user_attributes";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static List m2528(Object obj) {
        if (C0216.m4108() < 0) {
            return ((zzfi.zze) obj).zzh();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2530(Object obj) {
        if (C0366.m7172() >= 0) {
            return ((x7) obj).f10545c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2531(Object obj) {
        if (C0281.m5432() >= 0) {
            return ((Cursor) obj).moveToNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m2532(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0388.m7585() > 0) {
            return ((z) obj).h((String) obj2, (byte[]) obj3, (e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static void m2533(Object obj, long j10) {
        if (C0490.m9528() >= 0) {
            ((v) obj).z0(j10);
        }
    }

    /* JADX INFO: renamed from: ۧۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2534(Object obj, Object obj2, int i10, Object obj3) {
        if (C0491.m9552() >= 0) {
            ((r7) obj).K((StringBuilder) obj2, i10, (zzew.zzc) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m2535(Object obj) {
        if (C0105.m2045() >= 0) {
            return ((AppConfig) obj).getPlanPrice15Days();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡ۠۟, reason: not valid java name and contains not printable characters */
    public static Throwable m2536(Object obj) {
        if (C0132.m2543() < 0) {
            return ((InvocationTargetException) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۢ, reason: not valid java name and contains not printable characters */
    public static long m2537(Object obj) {
        if (C0265.m5062() < 0) {
            return ((f1) obj).f4491o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2529(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
