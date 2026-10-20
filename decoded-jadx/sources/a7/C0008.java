package a7;

import android.database.Cursor;
import android.os.BaseBundle;
import androidx.compose.foundation.relocation.C0024;
import b7.C0054;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.internal.C0084;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.emulators.C0140;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.messaging.ktx.C0186;
import d1.C0212;
import d5.e2;
import d5.i2;
import f0.v1;
import h.C0297;
import h7.C0310;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.k3;
import k0.l;
import k0.q3;
import k0.t0;
import k0.u4;
import k6.x7;
import m0.m;
import m0.s;
import o8.C0371;
import p9.q0;
import r1.p;
import s0.C0410;
import s8.C0417;
import u.C0428;
import u9.d;
import w4.C0460;
import y0.o;

/* JADX INFO: renamed from: a7.۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0008 {

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f28 = -8;

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static q0 m156(Object obj) {
        if (C0297.m5722() >= 0) {
            return ((MainViewModel) obj).f3107o0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۧ, reason: not valid java name and contains not printable characters */
    public static q3 m157(long j10, long j11, long j12, Object obj, int i10) {
        if (C0212.m4051() > 0) {
            return t0.f(j10, j11, j12, (m) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m158(Object obj, Object obj2, Object obj3) {
        if (C0024.m487() > 0) {
            ((BaseBundle) obj).putIntArray((String) obj2, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m159(int i10) {
        if (C0140.m2699() >= 0) {
            return s.m(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static e m160(Object obj) {
        if (C0460.m8972() >= 0) {
            return ((l) obj).f9124f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m161(Object obj, int i10) {
        if (C0054.m1047() > 0) {
            return ((p) obj).X(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢ۟, reason: not valid java name and contains not printable characters */
    public static String m162(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۨۨۦ, reason: not valid java name and contains not printable characters */
    public static float m163() {
        if (C0310.m5997() > 0) {
            return k3.f9112b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m164(Object obj, int i10) {
        if (C0371.m7283() >= 0) {
            return ((Cursor) obj).getType(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m165(Object obj) {
        if (C0186.m3548() < 0) {
            return ((x7) obj).f10546d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦۣ, reason: not valid java name and contains not printable characters */
    public static long m166(Object obj) {
        if (C0417.m8208() > 0) {
            return ((e2) obj).f4475b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m167(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m168(Object obj) {
        if (C0410.m8063() >= 0) {
            return ((v1) obj).f5974a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m169() {
        return 364 ^ C0297.f445;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static int m170(Object obj) {
        if (C0084.m1804() > 0) {
            return ((i2) obj).f4578a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static int m171(Object obj) {
        if (C0174.m3323() < 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static o m173() {
        if (C0121.m2336() < 0) {
            return u4.f9538i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static d m174() {
        if (C0428.m8409() <= 0) {
            return u9.e.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static String m172(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
