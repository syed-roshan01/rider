package y9;

import a7.C0008;
import androidx.compose.foundation.layout.C0021;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import dagger.hilt.android.migration.C0240;
import e1.n0;
import f5.u;
import h0.C0300;
import h5.C0307;
import i1.e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k6.d;
import k6.u7;
import k6.x;
import k6.x3;
import m7.C0358;
import r6.C0402;
import s3.C0413;
import t.t0;
import t.u0;

/* JADX INFO: renamed from: y9.ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0480 {

    /* JADX INFO: renamed from: ۡۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int f753 = -959;

    /* JADX INFO: renamed from: ۟ۡ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m9336() {
        if (C0240.m4596() > 0) {
            return "User property updated immediately";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static x3 m9337() {
        if (C0307.m5925() <= 0) {
            return x.C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static t0 m9338(Object obj, int i10, Object obj2) {
        if (C0300.m5752() <= 0) {
            return ((u0) obj).a(i10, (Float) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int m9339(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m9340(String str) {
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

    /* JADX INFO: renamed from: ۠ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9341(Object obj, Object obj2, Object obj3) {
        if (C0008.m169() <= 0) {
            e.a((e) obj, (ArrayList) obj2, (n0) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۦۤۦ, reason: not valid java name and contains not printable characters */
    public static Boolean m9342(long j10, Object obj) {
        if (C0413.m8089() < 0) {
            return d.b(j10, (zzew.zzd) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡۢ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m9343(Object obj) {
        if (m9346() >= 0) {
            return ((u) obj).f6331c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟۟, reason: contains not printable characters */
    public static boolean m9344(Object obj, Object obj2, Object obj3) {
        if (C0358.m7001() <= 0) {
            return ((u7) obj).h0((String) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static int m9346() {
        return 107 ^ C0021.f41;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ, reason: contains not printable characters */
    public static boolean m9347(Object obj) {
        if (C0402.m7881() <= 0) {
            return ((zzfc.zzd) obj).zzq();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static String m9345(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
