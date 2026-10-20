package j2;

import android.content.Context;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.measurement.C0183;
import dagger.hilt.C0256;
import e1.f;
import f0.c2;
import java.io.ByteArrayOutputStream;
import k0.j0;
import k6.d4;
import k6.s;
import k6.v;
import m9.e0;
import r5.C0401;
import s7.C0416;
import s8.C0417;
import y3.k;

/* JADX INFO: renamed from: j2.ۥ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0325 {

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static int f472 = -423;

    /* JADX INFO: renamed from: ۟۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static int m6271(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6272(Object obj) {
        if (C0043.m833() > 0) {
            return ((c2) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m6273() {
        if (C0075.m1631() <= 0) {
            return zzfi.zze.zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static long m6274(Object obj) {
        if (C0256.m4876() < 0) {
            return k.a((Context) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static h1.a m6276(Object obj, int i10) {
        if (C0183.m3510() > 0) {
            return e0.c((f) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static j0 m6277() {
        if (C0129.m2492() > 0) {
            return j0.f9062q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int m6278() {
        return (-620) ^ C0401.f671;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static s m6279(Object obj) {
        if (C0417.m8173() < 0) {
            return ((v) obj).f10432b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۥ, reason: not valid java name and contains not printable characters */
    public static String m6280(String str) {
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

    /* JADX INFO: renamed from: ۥۣ۠۟, reason: contains not printable characters */
    public static String m6281() {
        if (C0144.m2767() > 0) {
            return "shizuku_permission_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m6282(Object obj) {
        if (C0416.m8144() > 0) {
            return ((d4) obj).A();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6275(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
