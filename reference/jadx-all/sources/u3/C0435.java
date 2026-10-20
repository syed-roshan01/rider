package u3;

import a7.C0008;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.node.C0037;
import b4.C0052;
import c1.C0060;
import c1.C0061;
import com.google.android.gms.internal.measurement.zznv;
import com.google.firebase.analytics.ktxtesting.C0122;
import d5.x;
import e0.e;
import e1.j0;
import f0.C0273;
import f0.u;
import j0.b0;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import k0.y3;
import k6.r7;
import k6.s6;
import l8.C0346;
import w1.C0456;
import w6.C0465;
import x9.i;
import y0.o;
import z7.C0489;

/* JADX INFO: renamed from: u3.ۣۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0435 {

    /* JADX INFO: renamed from: ۨۧۤۢ, reason: not valid java name and contains not printable characters */
    public static int f705 = 446;

    /* JADX INFO: renamed from: ۟۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m8488(Object obj) {
        if (C0052.m1013() > 0) {
            return ((b0) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8489(Object obj) {
        if (C0456.m8885() <= 0) {
            return ((s6) obj).C();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m8490(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0346.m6759() < 0) {
            r7.G((Uri.Builder) obj, (String[]) obj2, (Bundle) obj3, (Set) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m8491(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۢ, reason: not valid java name and contains not printable characters */
    public static Context m8492(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((x) obj).f4834c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m8493(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8494(Object obj, Object obj2) {
        if (C0037.m733() >= 0) {
            return ((i) obj).b((SSLSocket) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8495() {
        if (C0023.m461() >= 0) {
            return "ga_app_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m8496() {
        if (C0273.m5249() < 0) {
            return "dashboard";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8497() {
        if (C0122.m2355() >= 0) {
            return zznv.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8498() {
        return 953 ^ C0008.f28;
    }

    /* JADX INFO: renamed from: ۡۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8499(Object obj) {
        if (C0489.m9505() >= 0) {
            return ((y3) obj).f9673a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤ۠ۧ, reason: contains not printable characters */
    public static void m8501(Object obj) {
        if (C0061.m1161() <= 0) {
            ((SQLiteDatabase) obj).setTransactionSuccessful();
        }
    }

    /* JADX INFO: renamed from: ۧۢۡۦ, reason: not valid java name and contains not printable characters */
    public static o m8502(Object obj, Object obj2, Object obj3, int i10) {
        if (C0060.m1148() > 0) {
            return androidx.compose.foundation.a.d((o) obj, (j0) obj2, (e) obj3, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟, reason: not valid java name and contains not printable characters */
    public static o m8503(Object obj) {
        if (C0465.m9059() <= 0) {
            return ((u) obj).f5954p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡۡ, reason: contains not printable characters */
    public static String m8500(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
