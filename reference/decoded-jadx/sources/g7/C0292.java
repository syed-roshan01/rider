package g7;

import a5.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznp;
import com.google.firebase.emulators.C0141;
import com.google.firebase.ktx.C0180;
import d1.C0211;
import d5.c0;
import dagger.hilt.android.components.C0228;
import e1.C0258;
import f0.i0;
import f0.s0;
import g5.C0291;
import h7.C0312;
import i6.C0319;
import java.io.ByteArrayOutputStream;
import k6.t;
import m0.g1;
import okhttp3.internal.publicsuffix.C0372;
import p9.z;
import q.f;
import q5.C0385;
import r.C0392;
import u8.C0438;
import v5.C0445;
import y3.e;
import z4.d;

/* JADX INFO: renamed from: g7.۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0292 {

    /* JADX INFO: renamed from: ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int f440 = 47;

    /* JADX INFO: renamed from: ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m5618() {
        if (C0291.m5605() < 0) {
            return e.f16898e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5619(Object obj) {
        if (C0228.m4402() > 0) {
            return ((c0) obj).f4429c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static z m5620(Object obj) {
        if (C0312.m6046() >= 0) {
            return ((d) obj).f17224y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5621(Object obj, Object obj2) {
        if (C0024.m487() >= 0) {
            return ((PackageManager) obj).hasSystemFeature((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5622() {
        if (C0141.m2714() <= 0) {
            return zznp.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۣ, reason: not valid java name and contains not printable characters */
    public static String m5624(Object obj) {
        if (C0319.m6181() > 0) {
            return e.o((g1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static o1.z m5625(Object obj) {
        if (C0258.m4939() < 0) {
            return ((i0) obj).f5752b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۦ, reason: not valid java name and contains not printable characters */
    public static c9.a m5626(Object obj) {
        if (C0392.m7675() < 0) {
            return ((s0) obj).f5894e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Object m5627(Object obj, Object obj2) {
        if (C0445.m8692() < 0) {
            return ((f) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m5628(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۤ, reason: not valid java name and contains not printable characters */
    public static ComponentName m5629(Object obj, Object obj2) {
        if (C0438.m8564() > 0) {
            return ((Context) obj).startForegroundService((Intent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m5630(Object obj) {
        if (C0385.m7546() >= 0) {
            return ((zzfi.zzj.zza) obj).zzv();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static z m5631(Object obj) {
        if (C0089.m1902() <= 0) {
            return ((MainViewModel) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5632(String str) {
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

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static Object m5633(Object obj) {
        if (C0211.m4046() >= 0) {
            return ((l) obj).f1286b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m5634() {
        return 970 ^ C0180.f204;
    }

    /* JADX INFO: renamed from: ۨۦ۠۠, reason: not valid java name and contains not printable characters */
    public static long m5635(Object obj) {
        if (C0372.m7309() <= 0) {
            return ((t) obj).f10371g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5623(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
