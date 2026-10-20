package d9;

import a2.C0005;
import android.os.Parcel;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.layout.C0036;
import b8.C0055;
import c1.C0061;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzqk;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.messaging.ktx.C0186;
import h0.C0299;
import i.C0315;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import k0.i0;
import k0.i4;
import k0.k2;
import k0.l1;
import k0.m4;
import k2.C0333;
import k6.a5;
import k6.y5;
import m0.q2;
import m7.C0357;
import q6.C0388;
import q9.C0391;
import s7.C0414;
import u.C0429;
import u4.C0436;
import v.C0439;
import v8.C0450;
import x2.C0467;

/* JADX INFO: renamed from: d9.ۨۧۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0226 {

    /* JADX INFO: renamed from: ۟۟ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static int f306 = 839;

    /* JADX INFO: renamed from: ۟۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static u0.b m4349() {
        if (C0186.m3548() < 0) {
            return d5.s.f4760d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m4350(Object obj, Object obj2, Object obj3, int i10) {
        if (C0450.m8792() <= 0) {
            androidx.compose.foundation.a.b((y0.o) obj, (c9.c) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static c9.f m4351(Object obj) {
        if (C0324.m6278() <= 0) {
            return ((i4) obj).f9048n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static char m4352(Object obj, int i10) {
        if (C0414.m8130() < 0) {
            return ((String) obj).charAt(i10);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4353(Object obj, long j10) {
        if (C0114.m2205() <= 0) {
            ((a5) obj).m(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static long m4354(Object obj) {
        if (C0439.m8582() < 0) {
            return ((m4) obj).f9224d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠۟, reason: not valid java name and contains not printable characters */
    public static m4 m4355(Object obj) {
        if (C0315.m6111() >= 0) {
            return ((l1) obj).f9168x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4356(Object obj) {
        if (C0005.m104() > 0) {
            return ((zzew.zzc) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static long m4357(Object obj) {
        if (C0436.m8524() < 0) {
            return ((i0) obj).F;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m4358(Object obj) {
        if (C0016.m315() > 0) {
            return ((i0) obj).f9011o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m4359(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m4360(Object obj) {
        if (C0391.m7657() >= 0) {
            return ((k2) obj).f9107e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4361(Object obj, Object obj2, Object obj3, Object obj4, long j10) {
        if (C0388.m7600() < 0) {
            ((y5) obj).E((String) obj2, (String) obj3, obj4, j10);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4362(Object obj) {
        if (C0357.m7001() <= 0) {
            ((q2) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4363() {
        if (C0299.m5752() < 0) {
            return zzqk.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۧۨ, reason: not valid java name and contains not printable characters */
    public static m2.b m4364(Object obj) {
        if (C0333.m6472() < 0) {
            return ((f0.t) obj).f5917y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m4365(Object obj) {
        if (C0061.m1161() <= 0) {
            return ((f5.m) obj).f6299d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۧ, reason: contains not printable characters */
    public static TimeUnit m4366() {
        if (C0036.m698() < 0) {
            return TimeUnit.MINUTES;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m4367(Object obj) {
        if (C0032.m620() <= 0) {
            ((MainViewModel) obj).s();
        }
    }

    /* JADX INFO: renamed from: ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4368(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static b1.a m4369(Object obj) {
        if (C0131.m2522() > 0) {
            return ((b1.d) obj).f2512a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۢ, reason: not valid java name and contains not printable characters */
    public static y0.l m4370() {
        if (C0111.m2143() > 0) {
            return y0.l.f16729b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4372() {
        return 961 ^ C0055.f75;
    }

    /* JADX INFO: renamed from: ۨۧۧۤ, reason: not valid java name and contains not printable characters */
    public static float m4373() {
        if (C0467.m9101() < 0) {
            return l0.k.f11067a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4374(Object obj, int i10, int i11) {
        if (C0429.m8415() > 0) {
            y3.e.c1((Parcel) obj, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4371(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
