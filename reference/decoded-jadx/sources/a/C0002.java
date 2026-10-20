package a;

import b7.C0053;
import c4.C0066;
import c9.c;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.DocumentReference;
import com.google.protobuf.i2;
import com.google.protobuf.t1;
import com.google.protobuf.v;
import d5.k2;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import e1.l0;
import f0.C0272;
import g.C0282;
import ga.C0295;
import java.io.ByteArrayOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import k0.e;
import k2.C0333;
import m0.g1;
import m0.m;
import m0.s;
import u4.C0436;
import v5.C0444;
import y0.o;
import y3.d;

/* JADX INFO: renamed from: a.ۨۥۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0002 {

    /* JADX INFO: renamed from: ۠ۥ۟ۧ, reason: collision with root package name */
    public static int f770 = -12;

    /* JADX INFO: renamed from: ۟۠ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static String m43(Object obj) {
        if (C0295.m5679() > 0) {
            return ((zzfi.zzj) obj).zzab();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static Task m44(Object obj, Object obj2) {
        if (C0272.m5249() <= 0) {
            return ((DocumentReference) obj).set(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m46() {
        return 101 ^ C0135.f161;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static void m47(Object obj, int i10, Object obj2, Object obj3) {
        if (C0053.m1029() < 0) {
            ((v) obj).C0(i10, (t1) obj2, (i2) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۥ, reason: not valid java name and contains not printable characters */
    public static o m48(Object obj, long j10, Object obj2) {
        if (C0118.m2274() < 0) {
            return androidx.compose.foundation.a.e((o) obj, j10, (l0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m49() {
        if (C0066.m1277() >= 0) {
            return " AND retry_count =  2147483647 LIMIT 1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m50(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static FileChannel m51(Object obj) {
        if (C0115.m2227() <= 0) {
            return ((RandomAccessFile) obj).getChannel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static g1 m52(Object obj) {
        if (C0230.m4440() >= 0) {
            return ((k2) obj).f4614c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m53(Object obj, Object obj2, Object obj3) {
        if (C0282.m5446() > 0) {
            s.a(obj, (c) obj2, (m) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۦۣ, reason: contains not printable characters */
    public static zzfi.zzj.zza m54(Object obj) {
        if (C0333.m6472() <= 0) {
            return ((zzfi.zzj.zza) obj).zzg();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨ۟, reason: contains not printable characters */
    public static String m55(String str) {
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

    /* JADX INFO: renamed from: ۦۧ۠ۡ, reason: contains not printable characters */
    public static void m56(Object obj) {
        if (C0077.m1663() <= 0) {
            ((d) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static l0 m57(Object obj) {
        if (C0436.m8524() <= 0) {
            return ((e) obj).f8849f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static long m58(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((k0.d) obj).f8812f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m45(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
