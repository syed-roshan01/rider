package b8;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.C0019;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.firestore.ktx.C0156;
import d5.i;
import f0.e1;
import f0.k1;
import fa.C0280;
import java.io.ByteArrayOutputStream;
import k0.d5;
import k6.w5;
import m0.l3;
import o1.C0367;
import p0.C0373;
import s0.C0410;
import t2.C0423;
import u7.C0437;
import v.C0439;
import v0.C0443;
import w2.C0456;

/* JADX INFO: renamed from: b8.ۣ۟ۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0055 {

    /* JADX INFO: renamed from: ۠ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static int f75 = -711;

    /* JADX INFO: renamed from: ۟۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static l3 m1055(Object obj) {
        if (C0437.m8543() >= 0) {
            return ((i) obj).f4553b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1056() {
        return 344 ^ C0410.f681;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m1057() {
        if (C0456.m8890() > 0) {
            return zzne.zze();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m1058(Object obj, Object obj2) {
        if (C0373.m7322() <= 0) {
            return ((PackageManager) obj).getApplicationLabel((ApplicationInfo) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static long m1059(Object obj) {
        if (C0367.m7199() <= 0) {
            return ((d5) obj).f8842d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static void m1060(Object obj, Object obj2) {
        if (C0443.m8654() < 0) {
            ((Parcel) obj).writeBundle((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1061(Object obj) {
        if (C0114.m2205() < 0) {
            return ((w5) obj).f10465j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static u0.b m1062() {
        if (C0156.m2976() > 0) {
            return c5.c.f2969a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m1063(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1065(Object obj) {
        if (C0423.m8307() > 0) {
            return ((zzfi.zzg) obj).zzk();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۧ۟, reason: contains not printable characters */
    public static String m1066() {
        if (C0019.m375() < 0) {
            return "realtime";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۤ, reason: contains not printable characters */
    public static k1 m1067(Object obj) {
        if (C0439.m8582() < 0) {
            return ((e1) obj).f5686c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۤ, reason: contains not printable characters */
    public static String m1068(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۤۧۢ, reason: not valid java name and contains not printable characters */
    public static void m1069(Object obj, Object obj2) {
        if (C0280.m5432() >= 0) {
            ((Bundle) obj).remove((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1064(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
