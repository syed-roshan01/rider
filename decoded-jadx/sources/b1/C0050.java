package b1;

import a2.c0;
import a5.n;
import aa.C0011;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import androidx.compose.ui.graphics.C0032;
import b8.C0055;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.measurement.C0184;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.interop.C0196;
import d5.n1;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.android.lifecycle.C0237;
import f0.C0272;
import f0.r1;
import f0.u;
import g2.a0;
import g9.C0294;
import i6.C0320;
import i7.g1;
import i7.h1;
import j4.C0326;
import java.io.ByteArrayOutputStream;
import k0.c1;
import k0.t2;
import k6.a5;
import k6.e6;
import k6.k;
import k6.x;
import k6.x3;
import k6.y5;
import l6.C0344;
import okhttp3.internal.publicsuffix.C0372;
import r1.w0;
import r1.x0;
import r4.C0398;
import t2.C0420;
import x.m;

/* JADX INFO: renamed from: b1.۟ۥۥ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0050 {

    /* JADX INFO: renamed from: ۟ۦۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int f70 = 948;

    /* JADX INFO: renamed from: ۟۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static SQLiteDatabase m964(Object obj) {
        if (C0237.m4583() > 0) {
            return ((k) obj).s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m965() {
        if (C0196.m3762() <= 0) {
            return FirebaseAnalytics.Param.VALUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m966(Object obj, Object obj2, int i10, int i11) {
        if (C0272.m5249() <= 0) {
            w0.g((w0) obj, (x0) obj2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m967() {
        if (C0201.m3855() <= 0) {
            return zzoi.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m968(Object obj, Object obj2) {
        if (C0150.m2892() <= 0) {
            return ((n) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۣ, reason: not valid java name and contains not printable characters */
    public static y5 m969(Object obj) {
        if (C0344.m6746() >= 0) {
            return ((e6) obj).f10012p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۦ, reason: not valid java name and contains not printable characters */
    public static m m970(Object obj) {
        if (C0372.m7309() <= 0) {
            return ((c1) obj).f8784e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static x3 m971() {
        if (C0420.m8263() > 0) {
            return x.N0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static g1 m972() {
        if (C0229.m4421() < 0) {
            return h1.G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۨ, reason: not valid java name and contains not printable characters */
    public static int m973(Object obj) {
        if (C0232.m4482() > 0) {
            return ((t2) obj).f9486a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۧۢ, reason: not valid java name and contains not printable characters */
    public static a0 m974(Object obj) {
        if (C0011.m208() < 0) {
            return ((r1) obj).f5875c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m975(Object obj) {
        if (C0055.m1056() >= 0) {
            return ((ServiceInfo) obj).enabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m976(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m977(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣ۟ۧ, reason: contains not printable characters */
    public static int m978(Object obj) {
        if (C0294.m5663() >= 0) {
            return ((u) obj).f5950e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۢ, reason: contains not printable characters */
    public static m0.g1 m979(Object obj) {
        if (C0398.m7797() <= 0) {
            return ((d5.i) obj).f4557f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡ۟, reason: contains not printable characters */
    public static String m981(Object obj) {
        if (C0184.m3517() >= 0) {
            return ((n1) obj).f4701c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static int m982() {
        return (-582) ^ C0087.f121;
    }

    /* JADX INFO: renamed from: ۧۨۡ۟, reason: not valid java name and contains not printable characters */
    public static String m983() {
        if (C0320.m6200() >= 0) {
            return "Fare Filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m984(Object obj, Object obj2) {
        if (C0032.m620() < 0) {
            return ((c0) obj).c((c0) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m985(Object obj, Object obj2) {
        if (C0326.m6304() < 0) {
            ((a5) obj).x((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۢۨۨ, reason: contains not printable characters */
    public static String m980(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
