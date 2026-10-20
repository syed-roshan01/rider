package q0;

import a8.C0010;
import android.content.res.Resources;
import android.os.Bundle;
import c4.C0066;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0182;
import com.google.firebase.remoteconfig.interop.C0198;
import e8.C0266;
import g.C0285;
import h.C0299;
import h3.C0302;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import k0.c0;
import k0.g3;
import k0.i0;
import k0.l;
import k4.C0337;
import k6.h6;
import k7.C0338;
import l0.p;
import m0.q;
import m7.C0359;
import q6.C0388;
import r6.C0403;
import r8.r;
import x4.C0470;
import y6.C0477;

/* JADX INFO: renamed from: q0.ۥۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0383 {

    /* JADX INFO: renamed from: ۟ۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f653 = 813;

    /* JADX INFO: renamed from: ۟۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7484(Object obj) {
        if (C0066.m1277() > 0) {
            return ((zzfi.zzj.zza) obj).zzr();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m7485(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static long m7486(Object obj) {
        if (C0470.m9143() >= 0) {
            return ((h6) obj).f10086c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static int m7487() {
        return (-834) ^ C0010.f30;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7488() {
        if (C0337.m6515() <= 0) {
            return p.f11110e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m7489(Object obj) {
        if (C0182.m3488() > 0) {
            return ((c0) obj).f8774a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7490(Object obj) throws IOException {
        if (C0302.m5797() < 0) {
            ((BufferedWriter) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7491(Object obj, int i10) {
        if (C0388.m7585() > 0) {
            return ((Resources) obj).getString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m7493(Object obj) {
        if (C0359.m7035() < 0) {
            return ((g3) obj).f8954q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static long m7494(Object obj) {
        if (C0139.m2684() <= 0) {
            return ((i0) obj).f9007k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۡ, reason: not valid java name and contains not printable characters */
    public static x.h m7495(Object obj) {
        if (C0477.m9298() <= 0) {
            return ((x.i) obj).f16273a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m7496(Object obj) {
        if (C0180.m3448() > 0) {
            return ((Map) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m7497(Object obj) {
        if (C0086.m1846() > 0) {
            return ((l) obj).f9127p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۡ, reason: not valid java name and contains not printable characters */
    public static int m7498(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m7499() {
        if (C0403.m7897() > 0) {
            return "source";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۢ, reason: contains not printable characters */
    public static r m7500() {
        if (C0285.m5483() >= 0) {
            return r.f13661a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m7501() {
        if (C0266.m5069() <= 0) {
            return zzne.zzz();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7502(Object obj) {
        if (C0198.m3800() > 0) {
            return ((q) obj).O;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7503() {
        if (C0299.m5742() >= 0) {
            return "Storing bundle outside of the max uploading time span. appId, now, timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m7504(Object obj, Object obj2, Object obj3) {
        if (C0338.m6638() <= 0) {
            ((Bundle) obj).putParcelableArrayList((String) obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m7492(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
