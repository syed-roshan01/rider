package ga;

import a2.C0005;
import a3.C0006;
import a5.p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.compose.foundation.layout.C0023;
import b.C0049;
import c4.C0064;
import com.google.android.play.core.integrity.client.C0107;
import d5.b0;
import dagger.hilt.android.migration.C0239;
import g.C0285;
import i5.C0319;
import j3.C0326;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.q3;
import k0.s3;
import k0.v;
import k0.z1;
import k6.x;
import k6.x3;
import l2.q;
import la.C0349;
import r6.C0403;
import w4.C0461;

/* JADX INFO: renamed from: ga.۟ۢۧ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0296 {

    /* JADX INFO: renamed from: ۤۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int f443 = 91;

    /* JADX INFO: renamed from: ۟۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5677(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static e0.e m5678() {
        if (C0326.m6295() >= 0) {
            return l0.o.f11102b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5679() {
        return 3 ^ C0349.f619;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static String m5680(Object obj) {
        if (C0049.m945() >= 0) {
            return ((p) obj).f1293a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static Map m5681(Object obj) {
        if (C0064.m1243() > 0) {
            return ((b0) obj).f4410f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۤ, reason: not valid java name and contains not printable characters */
    public static z5.k m5682(Object obj) {
        if (C0319.m6163() <= 0) {
            return z5.k.a((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۨ, reason: not valid java name and contains not printable characters */
    public static float m5684(Object obj) {
        if (C0239.m4587() <= 0) {
            return ((v) obj).f9539a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m5685(Object obj, int i10, Object obj2) {
        if (C0006.m112() < 0) {
            return ((j.a) obj).c(i10, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static q3 m5686(Object obj) {
        if (C0461.m8972() >= 0) {
            return ((s3) obj).f9454f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static c9.a m5687(Object obj) {
        if (C0285.m5483() >= 0) {
            return ((d5.f) obj).f4479c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static int m5688(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
    public static u0.b m5689() {
        if (C0005.m104() >= 0) {
            return d5.n.f4687h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static x3 m5690() {
        if (C0023.m461() > 0) {
            return x.f10496m0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۧ, reason: contains not printable characters */
    public static d5.l m5691() {
        if (C0403.m7897() > 0) {
            return d5.l.f4634r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static q m5692(Object obj) {
        if (C0107.m2075() < 0) {
            return ((a2.p) obj).f960d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۢ, reason: not valid java name and contains not printable characters */
    public static y0.o m5693(Object obj) {
        if (C0331.m6374() > 0) {
            return ((z1) obj).f9690b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m5683(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
