package n8;

import a2.a0;
import a5.i0;
import a6.C0007;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.draw.C0028;
import b4.C0052;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.stats.C0101;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.k0;
import d9.C0226;
import dagger.hilt.internal.definecomponent.C0249;
import e8.C0265;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.j0;
import k0.p1;
import k6.u7;
import k6.w4;
import m0.g1;
import n.C0360;
import p9.q0;
import p9.z;
import u1.C0432;
import v6.C0446;
import z2.C0484;
import z3.C0486;

/* JADX INFO: renamed from: n8.ۢۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0365 {

    /* JADX INFO: renamed from: ۠۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int f636 = -188;

    /* JADX INFO: renamed from: ۟۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static g1 m7159(Object obj) {
        if (C0203.m3894() > 0) {
            return ((k0) obj).f4605o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7160(Object obj, Object obj2, Object obj3) {
        if (C0249.m4779() < 0) {
            ((j1) obj).i(obj2, (w4) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static u0.b m7161() {
        if (C0028.m557() > 0) {
            return d5.q.f4735l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static w3.d m7162(Object obj) {
        if (C0146.m2776() > 0) {
            return ((u7) obj).u0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static int m7164(Object obj, long j10) {
        if (C0144.m2767() >= 0) {
            return ((a0) obj).l(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7165(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static List m7166(Object obj, Object obj2, int i10) {
        if (C0100.m1959() <= 0) {
            return ((PackageManager) obj).queryIntentServices((Intent) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static z m7167(Object obj) {
        if (C0026.m508() > 0) {
            return ((i0) obj).f1275e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static long m7168(long j10, long j11, float f10) {
        if (C0157.m2999() > 0) {
            return androidx.compose.ui.graphics.a.l(j10, j11, f10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m7169() {
        if (C0360.m7073() < 0) {
            return y3.e.f16905l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m7170(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((f5.k) obj).f6283e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠۟, reason: not valid java name and contains not printable characters */
    public static q0 m7171(Object obj) {
        if (C0226.m4372() <= 0) {
            return ((MainViewModel) obj).X;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m7172() {
        return (-910) ^ C0484.f758;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m7173(Object obj) {
        if (C0150.m2892() < 0) {
            ((MainViewModel) obj).o();
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static j0 m7174() {
        if (C0446.m8696() >= 0) {
            return j0.f9059n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static c9.c m7175(Object obj) {
        if (C0007.m154() < 0) {
            return ((p1) obj).f9335b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m7176(Object obj, Object obj2, Object obj3) {
        if (C0486.m9464() >= 0) {
            return y3.e.i0((String) obj, (String) obj2, (byte[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m7177(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۦ۠ۡ, reason: contains not printable characters */
    public static String m7178() {
        if (C0265.m5069() < 0) {
            return "\u0a2a\u0a70\u0a1c\u0a3e\u0a2c\u0a40";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۦۥ, reason: contains not printable characters */
    public static Object m7179(Object obj) {
        if (C0101.m1975() > 0) {
            return ((k0.c) obj).f8772c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7180(Object obj) {
        if (C0432.m8470() > 0) {
            return u7.q0((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۨ, reason: not valid java name and contains not printable characters */
    public static String m7163(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
