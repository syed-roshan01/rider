package c0;

import a2.c0;
import a8.C0009;
import dagger.hilt.migration.C0254;
import e1.l0;
import f0.w;
import h.C0296;
import h1.C0300;
import h3.C0302;
import java.io.ByteArrayOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import k0.n1;
import l9.C0347;
import r5.C0400;
import t.q1;

/* JADX INFO: renamed from: c0.ۦ۠۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0056 {

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int f76 = -846;

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static l0 m1070(Object obj) {
        if (C0302.m5836() > 0) {
            return ((n1) obj).f9265v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static FileLock m1072(Object obj) {
        if (C0009.m177() >= 0) {
            return ((FileChannel) obj).tryLock();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۦۨ, reason: not valid java name and contains not printable characters */
    public static c0 m1073(Object obj) {
        if (C0400.m7847() <= 0) {
            return ((f0.h) obj).f5714d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static m0.n1 m1074(Object obj) {
        if (C0254.m4866() <= 0) {
            return ((q1) obj).f14293o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m1075(String str) {
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

    /* JADX INFO: renamed from: ۤۤۤۨ, reason: not valid java name and contains not printable characters */
    public static f m1076(Object obj) {
        if (C0347.m6808() <= 0) {
            return ((w) obj).f5981b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۦ, reason: contains not printable characters */
    public static int m1077() {
        return 684 ^ C0300.f448;
    }

    /* JADX INFO: renamed from: ۦۨۨۥ, reason: contains not printable characters */
    public static int m1078(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1079() {
        if (C0296.m5709() <= 0) {
            return w4.g.f16172e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1071(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
