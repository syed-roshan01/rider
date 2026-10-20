package dagger.hilt.internal.aggregatedroot;

import a.C0001;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Bundle;
import androidx.compose.ui.graphics.C0031;
import c9.e;
import ca.C0070;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.internal.measurement.zznw;
import com.google.firebase.installations.local.C0176;
import d1.C0211;
import dagger.hilt.android.components.C0229;
import dagger.hilt.internal.aliasof.C0247;
import f5.w;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import k0.c1;
import k0.e3;
import k0.m;
import k0.v4;
import k6.u7;
import p9.q0;
import rikka.shizuku.C0406;
import t2.C0422;
import u0.C0430;
import v0.C0440;
import w0.u;

/* JADX INFO: renamed from: dagger.hilt.internal.aggregatedroot.ۢ۟ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0246 {

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f326 = -654;

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4715(Object obj, Object obj2) {
        if (C0422.m8294() > 0) {
            return ((u) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m4716(Object obj) {
        if (C0211.m4046() >= 0) {
            return ((q0) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4717() {
        return 954 ^ C0247.f327;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static e m4718(Object obj) {
        if (C0031.m598() > 0) {
            return ((v4) obj).f9569c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4719() {
        if (C0229.m4421() <= 0) {
            return "Failed to insert bundle (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4721(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۢ, reason: not valid java name and contains not printable characters */
    public static AssetFileDescriptor m4722(Object obj, Object obj2) {
        if (C0406.m7977() < 0) {
            return ((AssetManager) obj).openFd((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4723(int i10, Object obj) {
        if (C0077.m1663() < 0) {
            return u7.f0(i10, (Bundle) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4724(Object obj) {
        if (C0070.m1363() >= 0) {
            return ((e3) obj).f8873n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Object m4725(Object obj, Object obj2) {
        if (C0001.m35() <= 0) {
            return ((w) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4726(Object obj) {
        if (C0440.m8597() > 0) {
            return ((m) obj).f9191b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4727(String str) {
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

    /* JADX INFO: renamed from: ۥۥۧ۟, reason: contains not printable characters */
    public static long m4728(Object obj) {
        if (C0176.m3367() < 0) {
            return ((u7) obj).t0();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣۦ۠, reason: contains not printable characters */
    public static e m4729(Object obj) {
        if (C0328.m6350() >= 0) {
            return ((c1) obj).f8785f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧ۟, reason: contains not printable characters */
    public static boolean m4730() {
        if (C0430.m8425() > 0) {
            return zznw.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m4720(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
