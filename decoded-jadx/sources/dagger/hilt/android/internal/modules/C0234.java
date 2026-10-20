package dagger.hilt.android.internal.modules;

import a5.f0;
import aa.C0011;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.measurement.C0181;
import d5.l;
import dagger.hilt.android.components.C0229;
import e8.C0265;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import k0.k0;
import k6.h5;
import k6.k;
import k6.n6;
import k6.x7;
import m0.m;
import p0.C0373;
import r5.C0399;
import u8.C0438;
import v0.C0442;
import v7.C0449;
import y6.C0477;

/* JADX INFO: renamed from: dagger.hilt.android.internal.modules.ۣۨۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0234 {

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static int f314 = 994;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static long m4507(int i10, Object obj) {
        if (C0438.m8564() >= 0) {
            return k0.d(i10, (m) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4508(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4509(Object obj, Object obj2) {
        if (C0449.m8755() >= 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4510() {
        if (C0399.m7828() > 0) {
            return "Error querying app. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4511(Object obj, Object obj2) {
        if (C0011.m208() < 0) {
            ((h5) obj).n((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4512() {
        return (-996) ^ C0229.f309;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4513(Object obj) {
        if (C0373.m7322() <= 0) {
            return ((zzfi.zzl) obj).zzd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4514(Object obj) {
        if (C0265.m5069() <= 0) {
            return ((f0) obj).f1253a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4515(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4517() {
        if (C0181.m3452() <= 0) {
            return "Registering connectivity change receiver. Network connected";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m4518(Object obj) {
        if (C0305.m5904() > 0) {
            return ((n6) obj).f10234f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥ۠, reason: not valid java name and contains not printable characters */
    public static List m4519(Object obj, Object obj2) {
        if (C0477.m9312() <= 0) {
            return ((k) obj).e0((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥۨ, reason: contains not printable characters */
    public static l m4520() {
        if (C0442.m8630() < 0) {
            return l.F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4516(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
