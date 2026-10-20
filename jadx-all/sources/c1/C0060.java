package c1;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.platform.C0038;
import androidx.preference.C0044;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.C0195;
import d5.t0;
import dagger.hilt.android.components.C0230;
import dagger.hilt.internal.aggregatedroot.C0247;
import e7.C0265;
import f0.h1;
import g.C0284;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import k0.i0;
import k6.x;
import k6.x3;
import k6.z4;
import m9.d0;
import p9.z;
import t.x1;
import t7.C0426;
import w4.C0462;
import x4.C0470;
import z3.C0486;

/* JADX INFO: renamed from: c1.ۣۢۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0060 {

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f80 = -896;

    /* JADX INFO: renamed from: ۟۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int m1139(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m1140(Object obj) {
        if (C0044.m860() >= 0) {
            return ((h1) obj).f5735d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۦ, reason: not valid java name and contains not printable characters */
    public static d0 m1141(Object obj) {
        if (C0470.m9143() > 0) {
            return ((t0) obj).f4778a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m1142(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1143(Object obj, Object obj2) {
        if (C0195.m3737() <= 0) {
            ((z4) obj).s((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static long m1144(Object obj) {
        if (C0247.m4717() < 0) {
            return ((i0) obj).f9001e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static zzfc.zza.zze[] m1145() {
        if (C0100.m1959() < 0) {
            return zzfc.zza.zze.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1146(long j10) {
        if (C0038.m750() < 0) {
            return Long.hashCode(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static void m1147(Object obj, Object obj2, Object obj3) {
        if (C0462.m8993() >= 0) {
            ((Bundle) obj).putParcelableArray((String) obj2, (Parcelable[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1148() {
        return (-333) ^ C0183.f207;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static d5.l m1150() {
        if (C0284.m5468() >= 0) {
            return d5.l.I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static d6.a m1151() {
        if (C0486.m9449() < 0) {
            return d6.a.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۢ۠, reason: not valid java name and contains not printable characters */
    public static Set m1152(Object obj) {
        if (C0426.m8351() <= 0) {
            return ((BaseBundle) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static String m1153() {
        if (C0021.m417() > 0) {
            return " order by rowid desc limit -1 offset ?)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۨ, reason: contains not printable characters */
    public static c9.c m1154(Object obj) {
        if (C0265.m5062() < 0) {
            return ((x1) obj).f14351a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۤ, reason: contains not printable characters */
    public static x3 m1155() {
        if (C0115.m2227() < 0) {
            return x.G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۨ, reason: not valid java name and contains not printable characters */
    public static z m1156(Object obj) {
        if (C0230.m4421() < 0) {
            return ((z4.d) obj).I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1149(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
