package dagger.hilt.android.internal.migration;

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0040;
import c6.C0067;
import c9.c;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.measurement.C0181;
import d5.j1;
import dagger.hilt.components.C0244;
import e9.C0267;
import f0.f0;
import f0.h;
import f5.u;
import g2.l0;
import h.C0299;
import i7.a1;
import i7.d1;
import java.io.ByteArrayOutputStream;
import k0.g0;
import k0.i0;
import k0.q1;
import k0.w;
import k6.c4;
import k6.s5;
import k6.x7;
import m0.g1;
import m5.C0356;
import q6.C0387;
import s.C0408;
import v6.q;
import w4.C0461;
import y.i;
import y6.C0477;

/* JADX INFO: renamed from: dagger.hilt.android.internal.migration.ۣۣۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0233 {

    /* JADX INFO: renamed from: ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int f312 = 572;

    /* JADX INFO: renamed from: ۟۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m4464(Object obj, boolean z10) {
        if (C0299.m5742() >= 0) {
            return ((zzfi.zzb.zza) obj).zza(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static g0 m4465(Object obj) {
        if (C0089.m1902() <= 0) {
            return ((i0) obj).N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4466(Object obj) {
        if (C0103.m2022() > 0) {
            return ((x7) obj).f10553r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static i m4467(Object obj) {
        if (C0244.m4678() >= 0) {
            return ((w) obj).f9590p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۤ, reason: not valid java name and contains not printable characters */
    public static AccountManager m4468(Object obj) {
        if (C0408.m7989() >= 0) {
            return AccountManager.get((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static g1 m4469(Object obj) {
        if (C0040.m792() >= 0) {
            return ((j1) obj).f4591d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static l0 m4470(Object obj) {
        if (C0136.m2627() >= 0) {
            return ((h) obj).f5715e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4471(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۤۢ۟, reason: not valid java name and contains not printable characters */
    public static zzfc.zza.zze m4472() {
        if (C0067.m1309() <= 0) {
            return zzfc.zza.zze.AD_PERSONALIZATION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4473(Object obj) {
        if (C0181.m3452() <= 0) {
            return ((f0) obj).f5696b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4474(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static c m4475(Object obj) {
        if (C0356.m6968() >= 0) {
            return ((q1) obj).f9383r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4476() {
        if (C0267.m5099() < 0) {
            return "UploadAlarm";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4478() {
        if (C0139.m2684() < 0) {
            return "Quick App Setup & Permissions";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۥ, reason: contains not printable characters */
    public static String m4479(Object obj, Object obj2) {
        if (C0477.m9298() < 0) {
            return ((c4) obj).a((Bundle) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static a1 m4480(Object obj) {
        if (C0034.m667() > 0) {
            return q.e((d1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m4481(Object obj) {
        if (C0387.m7564() >= 0) {
            return ((u) obj).f6329a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4482() {
        return 765 ^ C0087.f121;
    }

    /* JADX INFO: renamed from: ۨۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4483(Object obj) {
        if (C0461.m8972() > 0) {
            return ((s5) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥ۟, reason: not valid java name and contains not printable characters */
    public static void m4484(Object obj, boolean z10) {
        if (C0164.m3153() > 0) {
            ((PowerManager.WakeLock) obj).setReferenceCounted(z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4477(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
