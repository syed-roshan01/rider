package m3;

import a5.d0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.core.app.C0040;
import c0.C0057;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.ktx.C0156;
import com.google.gson.internal.sql.C0208;
import d5.g1;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import h8.C0313;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import k0.f0;
import k0.m4;
import k6.u6;
import l.q;
import l3.C0342;
import m0.l2;
import m0.l3;
import n.C0360;
import n8.C0365;
import u.w;
import u0.b;
import x7.C0471;

/* JADX INFO: renamed from: m3.۟ۦۦۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0352 {

    /* JADX INFO: renamed from: ۟۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int f623 = -627;

    /* JADX INFO: renamed from: ۟۟ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static l3 m6901(Object obj) {
        if (C0360.m7073() <= 0) {
            return ((g1) obj).f4523t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static long m6902(Object obj) {
        if (C0040.m792() > 0) {
            return ((m4) obj).f9245y;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m6903(Object obj, int i10) {
        if (C0365.m7172() > 0) {
            return ((Calendar) obj).get(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6904() {
        return (-1009) ^ C0313.f461;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧۦ, reason: not valid java name and contains not printable characters */
    public static w m6905(Object obj) {
        if (C0471.m9190() <= 0) {
            return ((f0) obj).f8907o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m6906(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m6907(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m6908(Object obj) {
        if (C0057.m1090() <= 0) {
            return ((d0) obj).f1242d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static int m6909(Object obj) {
        if (C0342.m6720() >= 0) {
            return ((u6) obj).f10420a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۤۧ, reason: not valid java name and contains not printable characters */
    public static long m6911(Object obj) {
        if (C0156.m2976() >= 0) {
            return ((zzfi.zze.zza) obj).zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۢۧۢ, reason: contains not printable characters */
    public static void m6912(int i10, Object obj, Object obj2, Object obj3, int i11) {
        if (C0230.m4440() > 0) {
            q.s(i10, (b) obj, (l2) obj2, (m0.q) obj3, i11);
        }
    }

    /* JADX INFO: renamed from: ۨۢۦ۠, reason: not valid java name and contains not printable characters */
    public static Cursor m6913(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (C0208.m3984() <= 0) {
            return ((SQLiteDatabase) obj).query((String) obj2, (String[]) obj3, (String) obj4, (String[]) obj5, (String) obj6, (String) obj7, (String) obj8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m6910(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
