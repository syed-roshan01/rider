package u4;

import android.content.pm.ActivityInfo;
import android.support.v4.graphics.drawable.C0016;
import androidx.profileinstaller.C0046;
import b3.s;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement.C0184;
import d5.n1;
import d5.o0;
import f5.m;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import k0.f0;
import k0.g2;
import k0.t3;
import k6.t4;
import k6.x6;
import k6.x7;
import m1.C0352;
import n8.C0366;
import q2.C0385;
import t3.C0425;
import v0.C0443;
import x4.C0470;
import y3.f;

/* JADX INFO: renamed from: u4.۟ۡۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0436 {

    /* JADX INFO: renamed from: ۠ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int f706 = -924;

    /* JADX INFO: renamed from: ۟۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static String m8504(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static s m8506(Object obj) {
        if (C0016.m315() > 0) {
            return ((g2) obj).f8943b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m8507(Object obj) {
        if (C0385.m7527() <= 0) {
            return ((m) obj).f6297b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m8508(Object obj) {
        if (C0470.m9143() >= 0) {
            return ((f) obj).f16909a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m8509(Object obj) {
        if (C0352.m6885() >= 0) {
            return ((o0) obj).f4709a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static float m8510(Object obj) {
        if (C0182.m3488() > 0) {
            return ((t3) obj).f9496p;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8511(Object obj, Object obj2, Object obj3) {
        if (C0184.m3517() > 0) {
            return ((t4) obj).E((String) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8512() {
        if (C0138.m2662() > 0) {
            return "Super Fast Auto-Accept Engine";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8513(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8514(Object obj) {
        if (C0425.m8322() > 0) {
            return ((ActivityInfo) obj).enabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m8515(Object obj) {
        if (C0078.m1692() > 0) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8516() {
        return 794 ^ C0326.f473;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn.zza m8517(Object obj) {
        if (C0104.m2034() <= 0) {
            return ((zzfi.zzn.zza) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ, reason: contains not printable characters */
    public static String m8518(Object obj) {
        if (C0366.m7172() > 0) {
            return ((n1) obj).f4700b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۨ, reason: contains not printable characters */
    public static void m8519(Object obj, Object obj2, int i10) {
        if (C0443.m8630() < 0) {
            ((f0) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۨۥۥۣ, reason: not valid java name and contains not printable characters */
    public static x7 m8520(Object obj) {
        if (C0046.m893() > 0) {
            return ((x6) obj).f10540e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m8505(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
