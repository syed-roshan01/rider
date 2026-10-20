package com.google.android.gms.auth.api.signin;

import android.app.ActivityManager;
import androidx.compose.ui.draw.a;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.remoteconfig.interop.C0198;
import d2.C0216;
import h7.C0311;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import k0.d5;
import k0.i4;
import k0.q;
import k6.g5;
import k6.y5;
import k6.z4;
import s0.C0411;
import t2.C0421;
import y0.o;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.ۣ۟۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0080 {

    /* JADX INFO: renamed from: ۣۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int f114 = -608;

    /* JADX INFO: renamed from: ۟۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1717(Object obj) {
        if (C0216.m4108() < 0) {
            return ((i4) obj).f9050p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۦ, reason: not valid java name and contains not printable characters */
    public static g5 m1718(Object obj) {
        if (C0075.m1631() < 0) {
            return ((y5) obj).f10579n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static String m1719() {
        if (C0198.m3800() >= 0) {
            return "rowid";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1720(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1721(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1722(Object obj) {
        if (C0411.m8063() > 0) {
            ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m1723(Object obj) {
        if (C0161.m3081() < 0) {
            return ((z4) obj).f10612i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static d5 m1724(Object obj) {
        if (C0311.m5997() >= 0) {
            return ((q) obj).f9369o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static o m1725(Object obj, float f10) {
        if (C0328.m6319() <= 0) {
            return a.a((o) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۦ, reason: contains not printable characters */
    public static String[] m1726(Object obj, Object obj2, int i10) {
        if (C0421.m8263() > 0) {
            return ((String) obj).split((String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨۥ, reason: contains not printable characters */
    public static zzfc.zza.zzd m1727(Object obj) {
        if (C0110.m2123() < 0) {
            return ((zzfc.zza.zzb) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1729() {
        return 791 ^ C0124.f150;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m1728(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
