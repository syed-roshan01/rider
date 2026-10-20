package okhttp3.internal.publicsuffix;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0020;
import androidx.preference.C0044;
import b.C0049;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.messaging.reporting.C0189;
import com.google.gson.internal.bind.C0207;
import d3.C0217;
import d5.h;
import d5.s1;
import d7.C0221;
import f0.e;
import f0.f;
import f0.j0;
import fa.C0280;
import g4.C0290;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import k0.a0;
import k0.o1;
import k0.p1;
import k6.f5;
import k6.p6;
import k6.q6;
import k6.r4;
import k6.u7;
import k6.z3;
import m0.m;
import m5.C0355;
import org.json.JSONObject;
import p5.C0378;
import r7.C0405;
import v.C0440;
import v0.C0441;
import w4.C0461;
import y0.o;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.۟۠ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0373 {

    /* JADX INFO: renamed from: ۟ۥۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int f643 = -476;

    /* JADX INFO: renamed from: ۟ۡۢۥۦ, reason: not valid java name and contains not printable characters */
    public static f5 m7296(Object obj) {
        if (C0044.m860() > 0) {
            return ((r4) obj).f10340a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m7297(Object obj) {
        if (C0440.m8582() <= 0) {
            return ((e) obj).f5673a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7298(Object obj, Object obj2, int i10, boolean z10) {
        if (C0207.m3957() > 0) {
            ((u7) obj).P((Parcelable[]) obj2, i10, z10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static q6 m7299(Object obj, boolean z10) {
        if (C0405.m7934() >= 0) {
            return ((p6) obj).w(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m7301(Object obj) {
        if (C0122.m2355() > 0) {
            return ((o1) obj).f9300t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m7302(Object obj, Object obj2) {
        if (C0461.m8972() > 0) {
            return ((JSONObject) obj).getJSONObject((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m7303(Object obj, Object obj2, Object obj3) {
        if (C0441.m8597() >= 0) {
            return ((j0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m7304(Object obj) {
        if (C0020.m399() < 0) {
            return ((a0) obj).f8709a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m7305() {
        if (C0049.m945() >= 0) {
            return "shizuku_active_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m7306() {
        if (C0189.m3621() > 0) {
            return "enable_accessibility";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨۦ, reason: not valid java name and contains not printable characters */
    public static Serializable m7307(Object obj) {
        if (C0087.m1852() > 0) {
            return ((s1) obj).f4774d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7308(String str) {
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

    /* JADX INFO: renamed from: ۥۡۡۥ, reason: contains not printable characters */
    public static int m7309() {
        return 21 ^ C0280.f424;
    }

    /* JADX INFO: renamed from: ۥۦۥ۟, reason: contains not printable characters */
    public static MainViewModel m7310(Object obj) {
        if (C0329.m6350() >= 0) {
            return ((h) obj).f4535b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤۦ, reason: contains not printable characters */
    public static c9.e m7311(Object obj) {
        if (C0221.m4261() > 0) {
            return ((p1) obj).f9342p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤ۟, reason: contains not printable characters */
    public static zzfc.zza.zze m7312() {
        if (C0355.m6953() < 0) {
            return zzfc.zza.zze.AD_USER_DATA;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۥ, reason: contains not printable characters */
    public static int m7313(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۧۤ, reason: contains not printable characters */
    public static void m7314(Object obj) {
        if (C0217.m4114() < 0) {
            ((z3) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۧۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7315(long j10, Object obj, Object obj2, Object obj3, int i10) {
        if (C0290.m5580() <= 0) {
            f.a(j10, (o) obj, (c9.e) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static View m7316(Object obj, int i10) {
        if (C0378.m7389() > 0) {
            return ((ViewGroup) obj).getChildAt(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static String m7300(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
