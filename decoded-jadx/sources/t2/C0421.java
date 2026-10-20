package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznj;
import com.google.firebase.components.C0134;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.C0191;
import com.google.firebase.remoteconfig.ktx.C0199;
import dagger.hilt.internal.C0252;
import java.io.ByteArrayOutputStream;
import k6.c5;
import k6.f5;
import o1.C0367;
import u.C0429;
import z7.C0490;

/* JADX INFO: renamed from: t2.۟ۦۣۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0421 {

    /* JADX INFO: renamed from: ۟ۡۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int f692 = -287;

    /* JADX INFO: renamed from: ۣ۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static long m8269() {
        if (C0174.m3323() < 0) {
            return zznj.zza();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m8270(Object obj) {
        if (C0429.m8415() >= 0) {
            return ((z4.b) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8271(Object obj, Object obj2) {
        if (C0367.m7199() <= 0) {
            ((c5) obj).a((InterruptedException) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m8272(Object obj) {
        if (C0134.m2587() <= 0) {
            return ((zzfi.zzg.zza) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8273(Object obj) {
        if (C0191.m3643() > 0) {
            return ((f5) obj).e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8274(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m8275(String str) {
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

    /* JADX INFO: renamed from: ۢۦۣۥ, reason: not valid java name and contains not printable characters */
    public static int m8277(Object obj) {
        if (C0252.m4832() <= 0) {
            return ((k6.m) obj).f10195a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m8278() {
        return (-540) ^ C0490.f764;
    }

    /* JADX INFO: renamed from: ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static PackageManager m8279(Object obj) {
        if (C0199.m3818() > 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static String m8276(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
