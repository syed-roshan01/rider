package u8;

import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.ktx.C0180;
import d5.i1;
import dagger.hilt.internal.aggregatedroot.C0247;
import e1.k0;
import g.C0283;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import k0.t4;
import k0.z1;
import k6.d7;
import k6.r;
import m1.C0351;
import o8.C0372;
import p3.C0376;
import r2.C0395;
import t8.C0427;

/* JADX INFO: renamed from: u8.ۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0439 {

    /* JADX INFO: renamed from: ۟ۡۥۢۢ, reason: not valid java name and contains not printable characters */
    public static int f709 = 646;

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m8551(Object obj) throws IOException {
        if (C0395.m7729() >= 0) {
            ((ByteArrayInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8552(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m8553(Object obj) {
        if (C0376.m7362() >= 0) {
            ((d7) obj).v();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Long m8554(long j10) {
        if (C0090.m1920() > 0) {
            return Long.valueOf(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m8555(Object obj) {
        if (C0247.m4717() < 0) {
            return ((i1) obj).f4575a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8556(Object obj) {
        if (C0115.m2227() < 0) {
            return ((zzfc.zzd.zza) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8557(Object obj) {
        if (C0150.m2892() < 0) {
            return ((AppConfig) obj).getMaintenanceMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m8558(Object obj) {
        if (C0351.m6878() <= 0) {
            return ((t4) obj).f9505e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۦۡ, reason: not valid java name and contains not printable characters */
    public static float m8559(Object obj) {
        if (C0427.m8356() < 0) {
            return ((k0) obj).f5041c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m8560(Object obj, int i10) {
        if (C0283.m5446() > 0) {
            return ((String) obj).substring(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static int m8561(Object obj) {
        if (C0372.m7283() > 0) {
            return ((z1) obj).f9694f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۧۢ, reason: contains not printable characters */
    public static long m8562(Object obj) {
        if (C0139.m2684() <= 0) {
            return ((r) obj).p();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m8564() {
        return (-741) ^ C0180.f204;
    }

    /* JADX INFO: renamed from: ۨۨۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8565(String str) {
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

    /* JADX INFO: renamed from: ۨۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8563(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
