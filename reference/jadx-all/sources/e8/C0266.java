package e8;

import androidx.lifecycle.C0043;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.annotations.C0128;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e1.C0260;
import f0.C0272;
import h0.C0300;
import i4.C0318;
import java.io.ByteArrayOutputStream;
import java.util.EnumMap;
import k0.w4;
import k6.a5;
import k6.x3;
import r6.C0402;
import u.C0430;
import w5.C0463;
import x2.C0468;

/* JADX INFO: renamed from: e8.۟۠ۦ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0266 {

    /* JADX INFO: renamed from: ۥۢۨ, reason: contains not printable characters */
    public static int f345 = 926;

    /* JADX INFO: renamed from: ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static x3 m5063() {
        if (C0252.m4811() < 0) {
            return k6.x.V;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5064(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static m0.g1 m5065(Object obj) {
        if (C0102.m2007() > 0) {
            return ((d5.w) obj).f4815d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static double m5066(Object obj) {
        return C0463.m9013() < 0 ? ((zzfi.zzn) obj).zza() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۥ, reason: not valid java name and contains not printable characters */
    public static long m5067(Object obj) {
        if (C0402.m7881() <= 0) {
            return ((a5) obj).B;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m5068(Object obj, Object obj2, Object obj3) {
        if (C0272.m5222() <= 0) {
            return ((EnumMap) obj).put((Enum) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5069() {
        return 806 ^ C0079.f113;
    }

    /* JADX INFO: renamed from: ۡۧۤۦ, reason: not valid java name and contains not printable characters */
    public static long m5071(Object obj) {
        if (C0260.m4959() < 0) {
            return ((k0.w) obj).f9586e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m5072(Object obj, Object obj2) {
        if (C0166.m3170() <= 0) {
            return ((f5.l) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static y0.n m5073(Object obj) {
        if (C0300.m5752() < 0) {
            return t1.g.f((o0.i) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦ, reason: not valid java name and contains not printable characters */
    public static float m5074() {
        if (C0246.m4710() > 0) {
            return k0.m1.f9206e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۥۣ, reason: not valid java name and contains not printable characters */
    public static g2.g m5075(Object obj, Object obj2) {
        if (C0468.m9101() < 0) {
            return ((f0.j) obj).a((h0.r0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۡ, reason: not valid java name and contains not printable characters */
    public static int m5076(Object obj) {
        if (C0318.m6144() < 0) {
            return ((d5.h) obj).f4534a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static r1.x0 m5077(Object obj) {
        if (C0430.m8415() > 0) {
            return ((w4) obj).f9619a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣ, reason: contains not printable characters */
    public static int m5078(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
    public static y0.o m5079(Object obj) {
        if (C0128.m2475() < 0) {
            return ((d5.n1) obj).f4703e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۠, reason: contains not printable characters */
    public static long m5080() {
        if (C0043.m833() >= 0) {
            return zzne.zzag();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5070(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
