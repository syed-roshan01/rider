package s3;

import a.C0001;
import a.C0002;
import a2.c0;
import android.content.pm.PackageInfo;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.key.C0033;
import c7.C0069;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.remoteconfig.interop.C0197;
import d.C0211;
import d5.j1;
import dagger.hilt.internal.aggregatedroot.C0247;
import f0.f0;
import f0.r0;
import f0.u;
import f0.w;
import g2.a0;
import g2.n;
import h5.C0307;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.PriorityQueue;
import k0.m4;
import k6.y5;
import m0.m;
import r6.C0403;
import t3.C0425;
import v0.C0442;
import y3.e;

/* JADX INFO: renamed from: s3.۟ۧ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0413 {

    /* JADX INFO: renamed from: ۟۠ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int f683 = -794;

    /* JADX INFO: renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static long m8087(Object obj) {
        if (C0122.m2355() >= 0) {
            return ((m4) obj).f9233m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m8088(Object obj, Object obj2, int i10) {
        if (C0307.m5925() < 0) {
            ((f0) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static int m8089() {
        return (-997) ^ C0211.f234;
    }

    /* JADX INFO: renamed from: ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static f m8090() {
        if (C0442.m8612() > 0) {
            return f6.a.f6367p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m8091() {
        if (C0032.m620() <= 0) {
            return "gmp_version";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m8092(int i10) {
        if (C0016.m315() >= 0) {
            return n.b(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static a0 m8093(Object obj) {
        if (C0033.m652() <= 0) {
            return ((w) obj).f5982c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8094() {
        if (C0425.m8322() >= 0) {
            return "Select App Language";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۥ, reason: not valid java name and contains not printable characters */
    public static PriorityQueue m8095(Object obj) {
        if (C0069.m1332() <= 0) {
            return ((y5) obj).f10575j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8096(Object obj) {
        if (C0197.m3786() < 0) {
            return ((y3.c) obj).f16889e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m8097(Object obj) {
        if (C0148.m2838() < 0) {
            return ((j1) obj).f4588a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۡ۠, reason: not valid java name and contains not printable characters */
    public static c0 m8098(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((u) obj).f5948c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8099(Object obj, Object obj2) {
        if (C0403.m7897() >= 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m8100(Object obj) {
        if (C0001.m35() < 0) {
            return ((r0) obj).f5870c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static int m8101(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۟۠۟, reason: contains not printable characters */
    public static String m8102() {
        if (C0002.m46() <= 0) {
            return "last_sampling_rate";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8104(Object obj, Object obj2) {
        if (C0247.m4717() <= 0) {
            e.o0((PackageInfo) obj, (File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m8105(String str) {
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

    /* JADX INFO: renamed from: ۦۤۢ۠, reason: contains not printable characters */
    public static String m8103(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
