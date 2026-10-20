package g5;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import androidx.profileinstaller.C0045;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0184;
import d8.C0222;
import dagger.hilt.internal.aggregatedroot.C0247;
import f0.j1;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.o3;
import k0.p1;
import k0.v4;
import k6.a5;
import k6.f;
import k6.u5;
import k6.v;
import k6.x3;
import m0.g1;
import m0.m;
import o7.d0;
import q0.C0382;
import q7.C0390;
import r1.C0394;
import s.C0409;
import v7.C0450;
import w4.C0461;
import w4.C0462;
import x.l;
import y0.o;

/* JADX INFO: renamed from: g5.۟ۥۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0291 {

    /* JADX INFO: renamed from: ۟۟۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int f438 = -350;

    /* JADX INFO: renamed from: ۟۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static List m5586(Object obj) {
        if (C0247.m4717() <= 0) {
            return ((zzfi.zzl) obj).zzh();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static g1 m5587(Object obj, Object obj2, int i10) {
        if (C0382.m7481() > 0) {
            return d0.o((l) obj, (m) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m5588(Object obj, Object obj2, int i10) {
        if (C0170.m3247() < 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m5589() {
        return 705 ^ C0409.f679;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static Signature[] m5590(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((PackageInfo) obj).signatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۤ, reason: not valid java name and contains not printable characters */
    public static int m5591(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5592(String str) {
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

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m5594(Object obj, long j10) {
        if (C0184.m3517() >= 0) {
            ((a5) obj).u(j10);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static o m5595(Object obj) {
        if (C0222.m4264() > 0) {
            return ((v4) obj).f9567a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5596(Object obj) {
        if (C0045.m874() >= 0) {
            return ((o3) obj).f9319n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static long m5597(Object obj) {
        if (C0461.m8972() > 0) {
            return ((v) obj).f10434d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5598(Object obj, Object obj2) {
        if (C0305.m5882() <= 0) {
            ((j1) obj).a((m2.l) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5599(Object obj, Object obj2) {
        if (C0462.m8993() >= 0) {
            return ((f) obj).o((x3) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m5600() {
        if (C0450.m8755() >= 0) {
            return "The number of upload retries exceeds the limit. Will remain unchanged.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۤۤ, reason: not valid java name and contains not printable characters */
    public static void m5601(Object obj, Object obj2, Object obj3, Object obj4, long j10) {
        if (C0394.m7716() >= 0) {
            ((u5) obj).onEvent((String) obj2, (String) obj3, (Bundle) obj4, j10);
        }
    }

    /* JADX INFO: renamed from: ۨۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5602(Object obj) {
        if (C0390.m7627() < 0) {
            return ((p1) obj).A;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5593(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
