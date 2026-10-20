package com.google.firebase.measurement;

import a2.p;
import a2.r;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.C0127;
import dagger.hilt.android.internal.modules.C0234;
import f0.j;
import java.io.ByteArrayOutputStream;
import k0.m4;
import k0.p1;
import k6.g5;
import k6.g6;
import k6.o;
import k6.p7;
import m7.C0357;
import o2.C0368;
import p0.C0374;

/* JADX INFO: renamed from: com.google.firebase.measurement.ۧۦ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0184 {

    /* JADX INFO: renamed from: ۡۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int f208 = -734;

    /* JADX INFO: renamed from: ۟۠ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static m4 m3513(Object obj) {
        if (C0030.m575() > 0) {
            return ((p1) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static zzfc.zza.zze m3514(Object obj) {
        if (C0127.m2448() > 0) {
            return ((zzfc.zza.zzb) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3515(Object obj) {
        if (C0234.m4512() > 0) {
            return ((g6) obj).f10066c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static j m3516() {
        if (C0035.m690() < 0) {
            return j.f5779b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3517() {
        return (-538) ^ C0368.f639;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m3518(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3520(Object obj) {
        if (C0080.m1729() <= 0) {
            return ((g5) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int m3521(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۠ۥۥ, reason: contains not printable characters */
    public static zzfy m3522(Object obj, Object obj2, Object obj3) {
        if (C0103.m2022() >= 0) {
            return zzfy.zza((ContentResolver) obj, (Uri) obj2, (Runnable) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧۥ, reason: not valid java name and contains not printable characters */
    public static o m3523(Object obj, Object obj2) {
        if (C0374.m7350() < 0) {
            return ((p7) obj).F((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۡ, reason: not valid java name and contains not printable characters */
    public static r m3524(Object obj) {
        if (C0357.m7001() < 0) {
            return ((p) obj).f961e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3519(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
