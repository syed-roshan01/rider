package v7;

import a4.c0;
import android.os.Bundle;
import androidx.startup.C0047;
import b4.C0052;
import com.auto.accept.data.model.AppConfig;
import com.google.firebase.inject.C0172;
import com.google.protobuf.i2;
import d5.m0;
import d5.u1;
import dagger.hilt.migration.C0254;
import fa.C0280;
import g8.t3;
import h7.C0310;
import h8.n;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import k0.l2;
import k6.w4;
import m0.g1;
import m0.m;
import m0.s;
import m0.x1;
import m7.C0358;
import p9.g;
import p9.z;
import r2.C0396;
import r9.e;
import s7.C0415;
import t2.C0420;
import t8.C0426;
import v0.C0441;
import w4.C0460;
import z4.d;
import z7.C0488;

/* JADX INFO: renamed from: v7.ۤۦۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0449 {

    /* JADX INFO: renamed from: ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int f720 = 360;

    /* JADX INFO: renamed from: ۣ۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static g1 m8752(Object obj) {
        if (C0441.m8612() > 0) {
            return ((m0) obj).f4675d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8753(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8754(Object obj) {
        if (C0420.m8263() > 0) {
            return ((AppConfig) obj).getToastMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8755() {
        return (-840) ^ C0488.f762;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static long m8756(Object obj) {
        if (C0396.m7755() >= 0) {
            return ((l2) obj).f9178o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۡ, reason: not valid java name and contains not printable characters */
    public static e m8758(Object obj) {
        if (C0415.m8144() > 0) {
            return s.h((m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Executor m8759(Object obj) {
        if (C0358.m7035() < 0) {
            return ((y3.b) obj).f16877a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static t3 m8760(Object obj) {
        if (C0052.m1013() > 0) {
            return ((n) obj).f7679h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۢ, reason: not valid java name and contains not printable characters */
    public static void m8761(Object obj, Object obj2, Object obj3) {
        if (C0172.m3296() >= 0) {
            ((i2) obj).j(obj2, (w4) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static String m8762() {
        if (C0047.m904() < 0) {
            return "active";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m8763(Object obj, Object obj2, float f10) {
        if (C0280.m5432() >= 0) {
            ((Bundle) obj).putFloat((String) obj2, f10);
        }
    }

    /* JADX INFO: renamed from: ۡۡۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m8764(Object obj, Object obj2, Object obj3) {
        if (C0426.m8356() < 0) {
            return ((c0) obj).collect((g) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8765(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m8766(Object obj, Object obj2) {
        if (C0310.m5997() >= 0) {
            ((x1) obj).d((c9.e) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static z m8767(Object obj) {
        if (C0254.m4866() <= 0) {
            return ((d) obj).f17218s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨۨ, reason: contains not printable characters */
    public static int m8768(Object obj) {
        if (C0460.m8972() > 0) {
            return ((u1) obj).f4793a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8757(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
