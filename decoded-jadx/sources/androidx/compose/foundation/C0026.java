package androidx.compose.foundation;

import a5.u;
import androidx.compose.ui.draw.C0027;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.util.C0166;
import d5.m;
import d5.w;
import e9.C0266;
import f0.C0272;
import java.io.ByteArrayOutputStream;
import k6.a5;
import k6.r7;
import m0.f1;
import r0.d;
import s0.C0409;
import t2.C0421;
import u.C0429;
import w0.C0454;
import w4.C0461;

/* JADX INFO: renamed from: androidx.compose.foundation.۟ۥۦ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0026 {

    /* JADX INFO: renamed from: ۨۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int f46 = -313;

    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m508() {
        return 576 ^ C0429.f700;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static m m509() {
        if (C0166.m3170() < 0) {
            return m.f4657f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m511(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۣ, reason: not valid java name and contains not printable characters */
    public static void m512(Object obj, long j10) {
        if (C0272.m5249() < 0) {
            ((a5) obj).s(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m513(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m514(Object obj) {
        if (C0409.m8037() < 0) {
            return ((u) obj).f1312f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m515(Object obj, Object obj2, Object obj3) {
        if (C0454.m8861() <= 0) {
            r7.H((zzfi.zze.zza) obj, (String) obj2, (Long) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static String m516() {
        if (C0160.m3070() < 0) {
            return "daily_public_events_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡۥ, reason: not valid java name and contains not printable characters */
    public static f1 m517(Object obj) {
        if (C0421.m8278() < 0) {
            return ((w) obj).f4813b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static d m518(Object obj) {
        if (C0266.m5099() <= 0) {
            return ((s0.b) obj).f13901c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۦ, reason: contains not printable characters */
    public static AppMeasurementDynamiteService m519(Object obj) {
        if (C0461.m8993() > 0) {
            return ((k6.a) obj).f9861b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m520() {
        if (C0027.m541() >= 0) {
            return "shizuku_not_installed_desc";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m510(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
