package com.google.android.gms.internal.stats;

import a.a;
import android.app.DownloadManager;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.compose.foundation.layout.C0023;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.data.model.UserProfile;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.C0128;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.auth.C0146;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.internal.aliasof.C0247;
import f0.c2;
import g2.j;
import g5.C0291;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import java.security.cert.CertificateFactory;
import java.util.BitSet;
import k0.l0;
import k0.z1;
import k6.a8;
import k6.f5;
import k6.n7;
import k6.p7;
import k6.q;
import k6.y5;
import k8.C0338;
import l6.C0344;
import m0.g1;
import m1.C0351;
import n7.C0363;
import s2.C0411;
import u3.C0434;
import v0.C0440;

/* JADX INFO: renamed from: com.google.android.gms.internal.stats.ۧۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0101 {

    /* JADX INFO: renamed from: ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int f127 = 768;

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1968(Object obj) {
        if (C0023.m461() > 0) {
            return ((CouponData) obj).getDiscountFixed();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static CertificateFactory m1969(Object obj) {
        if (C0363.m7127() <= 0) {
            return CertificateFactory.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1970() {
        if (C0247.m4732() <= 0) {
            return "app_store";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1971(Object obj) {
        if (C0079.m1701() > 0) {
            return ((UserProfile) obj).getApproved();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static p7 m1972(Object obj) {
        if (C0351.m6885() >= 0) {
            return ((n7) obj).f10240e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static BitSet m1973(Object obj) {
        if (C0291.m5605() < 0) {
            return ((a8) obj).f9898d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1974(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m1975() {
        return 622 ^ C0137.f163;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static q m1976(Object obj) {
        if (C0132.m2543() < 0) {
            return ((f5) obj).f10040q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1977(Object obj, Object obj2) {
        if (C0128.m2475() <= 0) {
            return ((PowerManager) obj).isIgnoringBatteryOptimizations((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static Task m1978(Object obj) {
        if (C0138.m2662() >= 0) {
            return ((DocumentReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m1979(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m1980(Object obj) {
        if (C0434.m8498() <= 0) {
            return ((a) obj).f767a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۥ, reason: not valid java name and contains not printable characters */
    public static long m1982() {
        if (C0411.m8066() < 0) {
            return zzne.zzl();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m1983(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, boolean z11, long j10) {
        if (C0440.m8597() > 0) {
            ((y5) obj).D((String) obj2, (String) obj3, (Bundle) obj4, z10, z11, j10);
        }
    }

    /* JADX INFO: renamed from: ۣۥۦۥ, reason: not valid java name and contains not printable characters */
    public static j m1984(Object obj) {
        if (C0235.m4538() >= 0) {
            return ((c2) obj).f5639d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static g1 m1985(Object obj) {
        if (C0146.m2776() > 0) {
            return ((d5.g1) obj).f4520q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۦ, reason: contains not printable characters */
    public static int m1986(Object obj) {
        if (C0338.m6645() < 0) {
            return ((z1) obj).f9695n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۡۢ, reason: contains not printable characters */
    public static DownloadManager.Query m1987(Object obj, Object obj2) {
        if (C0330.m6374() > 0) {
            return ((DownloadManager.Query) obj).setFilterById((long[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static l0 m1988() {
        if (C0344.m6746() >= 0) {
            return l0.f9136b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m1981(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
