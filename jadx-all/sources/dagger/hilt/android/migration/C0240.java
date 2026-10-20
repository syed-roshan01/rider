package dagger.hilt.android.migration;

import android.view.View;
import android.view.ViewGroup;
import c9.c;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.stats.C0101;
import com.google.protobuf.C0209;
import d5.f1;
import dagger.hilt.internal.aliasof.C0248;
import f0.a1;
import f0.c0;
import h0.v0;
import java.io.ByteArrayOutputStream;
import k0.b2;
import k3.C0335;
import k6.x;
import k6.x3;
import m5.C0355;
import p0.C0375;
import t.k;
import t3.C0425;
import t9.C0428;
import w9.C0466;

/* JADX INFO: renamed from: dagger.hilt.android.migration.۟ۧ۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0240 {

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static int f319 = 202;

    /* JADX INFO: renamed from: ۟۠ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static c m4589(Object obj) {
        if (C0355.m6953() <= 0) {
            return ((a1) obj).f5596e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static x3 m4590() {
        if (C0466.m9068() <= 0) {
            return x.N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨ۠, reason: not valid java name and contains not printable characters */
    public static v0 m4591(Object obj) {
        if (C0425.m8322() > 0) {
            return ((c0) obj).f5631d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m4592(Object obj) {
        if (C0375.m7350() <= 0) {
            return ((f1) obj).f4486c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m4593(int i10) {
        if (C0209.m4013() > 0) {
            return k.e(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۦ, reason: not valid java name and contains not printable characters */
    public static float m4594() {
        if (C0101.m1975() > 0) {
            return b2.f8735d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4595() {
        if (C0335.m6491() > 0) {
            return zzot.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4596() {
        return 988 ^ C0428.f698;
    }

    /* JADX INFO: renamed from: ۣۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m4597(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۧ, reason: contains not printable characters */
    public static void m4598(Object obj, Object obj2) {
        if (C0248.m4732() <= 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۨۧۢ, reason: contains not printable characters */
    public static String m4599(String str) {
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

    /* JADX INFO: renamed from: ۨۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4600(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
