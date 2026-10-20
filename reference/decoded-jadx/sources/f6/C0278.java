package f6;

import a2.C0004;
import android.content.res.Configuration;
import android.database.Cursor;
import android.support.v4.app.C0015;
import androidx.activity.C0017;
import c4.C0064;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d5.k2;
import h1.C0300;
import j3.C0325;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import k.C0331;
import k0.e;
import k0.v3;
import k6.l4;
import k6.v;
import l2.C0341;
import l3.C0342;
import m0.l3;
import r7.C0403;
import s.C0407;
import z4.d;

/* JADX INFO: renamed from: f6.ۦۣۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0278 {

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int f423 = -118;

    /* JADX INFO: renamed from: ۟۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static d m5385(Object obj) {
        if (C0325.m6295() > 0) {
            return ((MainViewModel) obj).f3081b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m5386(Object obj, Object obj2) {
        if (C0064.m1243() > 0) {
            return ((FirebaseRemoteConfig) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static l3 m5387(Object obj) {
        if (C0341.m6699() < 0) {
            return ((k2) obj).f4616e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m5388(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m5389(Object obj) {
        if (C0407.m7989() >= 0) {
            return ((v) obj).f10431a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static String m5390(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m5392(Object obj) {
        if (C0078.m1692() >= 0) {
            return ((e) obj).f8852p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5393(Object obj, Object obj2) {
        if (C0342.m6720() >= 0) {
            ((Configuration) obj).setLocale((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۨ۟, reason: not valid java name and contains not printable characters */
    public static int m5394() {
        return (-913) ^ C0300.f448;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5395(Object obj, boolean z10) {
        if (C0017.m332() < 0) {
            ((l4) obj).r(z10);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5396() {
        if (C0015.m294() <= 0) {
            return "\u0c24\u0c46\u0c32\u0c41\u0c17\u0c41";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m5397(Object obj) {
        if (C0331.m6408() < 0) {
            return ((v3) obj).f9561f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5398() {
        if (C0004.m76() < 0) {
            return zzqe.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5399(Object obj, int i10) {
        if (C0403.m7911() <= 0) {
            return ((Cursor) obj).isNull(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m5391(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
