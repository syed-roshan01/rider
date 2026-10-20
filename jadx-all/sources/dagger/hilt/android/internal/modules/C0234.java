package dagger.hilt.android.internal.modules;

import a2.a0;
import a3.C0006;
import a5.h0;
import androidx.compose.ui.input.pointer.C0034;
import b3.C0051;
import c6.C0067;
import c9.e;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import d5.c0;
import d5.m;
import d9.C0225;
import dagger.hilt.components.C0245;
import f.C0270;
import f0.p0;
import f0.t0;
import f4.y;
import fa.C0282;
import g.C0284;
import h0.b1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.m4;
import k0.r4;
import k6.c4;
import k6.i5;
import k6.v7;
import k6.x7;
import n.C0361;
import okhttp3.internal.publicsuffix.C0373;
import t1.C0420;
import u8.j;
import v5.C0446;
import w5.C0464;
import w9.C0466;
import z6.a;

/* JADX INFO: renamed from: dagger.hilt.android.internal.modules.ۨۡ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0234 {

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int f313 = 318;

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4485(Object obj) {
        if (C0200.m3841() <= 0) {
            return ((p0) obj).f5843a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m4486(Object obj, int i10) {
        if (C0466.m9068() < 0) {
            return ((ArrayList) obj).get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۧ, reason: not valid java name and contains not printable characters */
    public static t0 m4487() {
        if (C0034.m667() > 0) {
            return t0.f5936w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static b1 m4488(Object obj) {
        if (C0361.m7073() <= 0) {
            return ((m4) obj).f9231k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static c4 m4489(Object obj) {
        if (C0245.m4685() > 0) {
            return ((y) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m4490(Object obj) {
        if (C0201.m3855() < 0) {
            return ((h0) obj).f1265b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m4491(Object obj, Object obj2, Object obj3) {
        if (C0464.m9033() > 0) {
            return a.u0((j) obj, (e) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4492() {
        if (C0270.m5152() > 0) {
            return "app_version_int";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧ۟, reason: not valid java name and contains not printable characters */
    public static float m4493(Object obj) {
        if (C0051.m992() >= 0) {
            return ((a0) obj).f897e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4494(Object obj) {
        if (C0284.m5468() >= 0) {
            return ((r4) obj).f9437v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m4495() {
        return 887 ^ C0373.f643;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Task m4497(Object obj) {
        if (C0083.m1779() >= 0) {
            return ((FirebaseUser) obj).sendEmailVerification();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static FirebaseRemoteConfigSettings.Builder m4498(Object obj, long j10) {
        if (C0420.m8247() >= 0) {
            return ((FirebaseRemoteConfigSettings.Builder) obj).setMinimumFetchIntervalInSeconds(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۢ, reason: contains not printable characters */
    public static String m4499(Object obj) {
        if (C0446.m8692() < 0) {
            return ((x7) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ, reason: contains not printable characters */
    public static String m4500(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4501(Object obj) {
        if (C0166.m3170() < 0) {
            ((i5) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4502() {
        if (C0282.m5443() <= 0) {
            return "select_language_sub";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4503(Object obj) {
        if (C0067.m1309() < 0) {
            return ((c0) obj).f4427a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4504(Object obj) {
        if (C0006.m112() < 0) {
            return ((v7) obj).f10446b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4505(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static m m4506() {
        if (C0225.m4316() > 0) {
            return m.B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4496(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
