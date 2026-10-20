package h4;

import a4.q;
import a8.C0010;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.m0;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.emulators.C0141;
import com.google.firebase.messaging.reporting.C0188;
import com.google.gson.internal.bind.C0207;
import com.google.protobuf.v;
import d5.y;
import dagger.hilt.internal.C0253;
import e9.C0266;
import f0.p1;
import f0.z1;
import f5.w;
import h7.C0311;
import i1.f;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k6.p6;
import k6.q6;
import k6.x;
import k6.x3;
import k6.x7;
import l6.C0343;
import l9.C0347;
import o4.C0369;
import u.C0428;
import v0.C0443;
import y3.k;
import z2.C0484;

/* JADX INFO: renamed from: h4.ۣ۟ۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0304 {

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int f452 = 18;

    /* JADX INFO: renamed from: ۟۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5862(Object obj) {
        if (C0188.m3594() > 0) {
            return ((y) obj).f4857n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static q m5863() {
        if (C0253.m4844() >= 0) {
            return k.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m5864(Object obj, Object obj2, Object obj3, long j10, boolean z10, Object obj4) {
        if (C0266.m5099() <= 0) {
            ((p6) obj).z((q6) obj2, (q6) obj3, j10, z10, (Bundle) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m5866(Object obj, Object obj2) {
        if (C0074.m1607() <= 0) {
            ((p1) obj).a((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۢ۠, reason: not valid java name and contains not printable characters */
    public static int[] m5867(Object obj, Object obj2) {
        if (C0369.m7254() > 0) {
            return ((BaseBundle) obj).getIntArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۡ, reason: not valid java name and contains not printable characters */
    public static int m5868(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static f m5869() {
        if (C0141.m2714() < 0) {
            return f6.a.f6363l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5870(Object obj, int i10) {
        if (C0207.m3957() >= 0) {
            return Log.isLoggable((String) obj, i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5871(Object obj, Object obj2) {
        if (C0324.m6278() <= 0) {
            ((zzcv) obj).zza((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static z1 m5872() {
        if (C0311.m6027() < 0) {
            return z1.f6017a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Intent m5873(Object obj, Object obj2, boolean z10) {
        if (C0086.m1846() >= 0) {
            return ((Intent) obj).putExtra((String) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5874() {
        if (C0100.m1959() < 0) {
            return m0.f1412c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static int m5875(Object obj) {
        if (C0116.m2247() > 0) {
            return ((w) obj).f6335a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥ۠, reason: not valid java name and contains not printable characters */
    public static long m5876(Object obj) {
        if (C0347.m6808() < 0) {
            return ((x7) obj).f10548f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static x3 m5877() {
        if (C0010.m199() > 0) {
            return x.f10491k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5878(Object obj, int i10, int i11) {
        if (C0343.m6738() < 0) {
            ((v) obj).H0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۢۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m5879(String str) {
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

    /* JADX INFO: renamed from: ۥۨ۠ۡ, reason: contains not printable characters */
    public static zzfi.zzg.zza m5880(Object obj, double d10) {
        if (C0428.m8409() <= 0) {
            return ((zzfi.zzg.zza) obj).zza(d10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۠ۦ, reason: contains not printable characters */
    public static zzfi.zzn.zza m5881(Object obj) {
        if (C0443.m8654() <= 0) {
            return ((zzfi.zzn.zza) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m5882() {
        return 999 ^ C0484.f758;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m5865(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
