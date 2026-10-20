package v8;

import a2.C0004;
import a2.c0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.view.View;
import androidx.compose.ui.draw.C0027;
import androidx.lifecycle.g1;
import b.C0049;
import c1.C0061;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.ktx.C0199;
import d5.k0;
import d5.o1;
import d7.t;
import dagger.hilt.C0256;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.definecomponent.C0250;
import h3.C0304;
import h4.C0305;
import i1.f;
import java.io.ByteArrayOutputStream;
import k0.a2;
import k0.p1;
import k0.w4;
import k0.x2;
import k0.x4;
import k6.d6;
import k6.o4;
import k6.t7;
import k6.u7;
import m0.m;
import m9.k;
import p9.z;
import q7.C0390;
import r2.C0396;
import r4.C0399;
import t2.C0423;
import t2.C0424;
import v9.C0452;
import w6.C0465;
import x9.i;
import y.C0475;
import y.b1;

/* JADX INFO: renamed from: v8.۟ۧۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0451 {

    /* JADX INFO: renamed from: ۟ۥۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int f721 = -683;

    /* JADX INFO: renamed from: ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static g1 m8769(Object obj) {
        if (C0250.m4779() < 0) {
            return i1.b.p((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m8770(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, Object obj5, int i10) {
        if (C0424.m8307() >= 0) {
            o1.g((String) obj, (String) obj2, z10, (f) obj3, (c9.a) obj4, (m) obj5, i10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m8771(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8772(Object obj) {
        if (C0049.m945() > 0) {
            return ((t7) obj).f10404b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static k m8773(Object obj) {
        if (C0475.m9246() < 0) {
            return ((x2) obj).f9646b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m8774(Object obj, int i10, Object obj2) {
        if (C0304.m5859() <= 0) {
            return ((k6.k) obj).x(i10, (Cursor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static m0.g1 m8775(Object obj, Object obj2) {
        if (C0081.m1735() > 0) {
            return t.I((z) obj, (m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m8776() {
        if (C0256.m4876() < 0) {
            return "Service Active";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Context m8777(Object obj) {
        if (C0396.m7737() > 0) {
            return ((k0) obj).f4600c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m8778(Object obj) {
        if (C0465.m9059() <= 0) {
            return ((a2) obj).f8715b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static x4 m8779(Object obj) {
        if (C0399.m7797() <= 0) {
            return ((w4) obj).f9630s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8780(Object obj) {
        if (C0452.m8793() <= 0) {
            return ((d6) obj).f9977a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static c0 m8782(Object obj) {
        if (C0423.m8294() > 0) {
            return ((p1) obj).f9339f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨ۠, reason: not valid java name and contains not printable characters */
    public static b1 m8783() {
        if (C0004.m76() <= 0) {
            return b1.f16518a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String[] m8784(Object obj) {
        if (C0305.m5882() < 0) {
            return ((i) obj).f16419d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧۡ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m8785(Object obj) {
        if (C0390.m7627() <= 0) {
            return ((PackageInfo) obj).applicationInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8786(Object obj) {
        if (C0243.m4660() <= 0) {
            return u7.S(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۦ, reason: not valid java name and contains not printable characters */
    public static int m8787(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static zzkm m8788(Object obj, Object obj2, Object obj3) {
        if (C0188.m3594() > 0) {
            return ((zzkm) obj).zza((byte[]) obj2, (zzik) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8789(Object obj) {
        if (C0082.m1758() > 0) {
            return ((o4) obj).f10253a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m8790(Object obj) {
        if (C0027.m541() > 0) {
            return ((FirebaseUser) obj).getUid();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡۤ, reason: not valid java name and contains not printable characters */
    public static double m8791(Object obj) {
        return C0061.m1161() < 0 ? Double.parseDouble((String) obj) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۨۥۦۤ, reason: not valid java name and contains not printable characters */
    public static int m8792() {
        return 629 ^ C0199.f223;
    }

    /* JADX INFO: renamed from: ۠ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static String m8781(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
