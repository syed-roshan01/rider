package e2;

import a2.c0;
import a4.q;
import a5.a0;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.layout.C0036;
import com.google.android.gms.common.util.C0086;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.reporting.C0189;
import dagger.hilt.android.components.C0230;
import dagger.hilt.android.internal.C0236;
import e1.r;
import f1.C0274;
import f1.d;
import h4.C0305;
import ia.C0323;
import java.io.ByteArrayOutputStream;
import java.util.Queue;
import k0.c5;
import k0.g3;
import k0.i0;
import k6.t7;
import k6.u7;
import k7.C0338;
import l.t;
import l0.g;
import l6.C0345;
import m0.m;
import t.e;
import t.j0;
import t.z;
import u.C0429;
import v0.C0442;
import y.C0476;
import y3.k;

/* JADX INFO: renamed from: e2.۟۟ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0261 {

    /* JADX INFO: renamed from: ۟ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int f340 = -757;

    /* JADX INFO: renamed from: ۟۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4965(Object obj) {
        if (C0476.m9266() > 0) {
            return ((a0) obj).f1221a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static d m4966(long j10) {
        if (C0176.m3367() <= 0) {
            return r.f(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4967(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static float m4968() {
        if (C0230.m4421() <= 0) {
            return g.f11047a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static j0 m4970(Object obj, int i10, int i11) {
        if (C0236.m4538() >= 0) {
            return e.p((z) obj, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m4971(Object obj) {
        if (C0157.m2999() > 0) {
            return ((Queue) obj).peek();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4972(Object obj, int i10, Object obj2, Object obj3) {
        if (C0274.m5273() <= 0) {
            u7.A((Bundle) obj, i10, (String) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4973(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0429.m8409() <= 0) {
            return ((u7) obj).Y((String) obj2, (String[]) obj3, (String[]) obj4, (String) obj5);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4974(Object obj, Object obj2, Object obj3, int i10) {
        if (C0305.m5882() <= 0) {
            c5.a((c0) obj, (c9.e) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4975() {
        if (C0338.m6638() < 0) {
            return "service_running_setup_shizuku";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m4976(Object obj) {
        if (C0027.m541() > 0) {
            return ((g3) obj).f8950f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m4977(boolean z10) {
        if (C0127.m2448() >= 0) {
            f6.a.r(z10);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4978(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4979(Object obj) {
        if (C0323.m6244() >= 0) {
            return ((a5.c) obj).f1234e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static q m4980() {
        if (C0036.m698() < 0) {
            return k.f16917c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟, reason: not valid java name and contains not printable characters */
    public static long m4981(Object obj) {
        if (C0189.m3621() > 0) {
            return ((i0) obj).f9013q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m4982(Object obj) {
        if (C0016.m315() >= 0) {
            return ((Parcel) obj).readLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m4983(Object obj) {
        if (C0182.m3488() > 0) {
            return ((t) obj).f10928b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۥ, reason: contains not printable characters */
    public static int m4984() {
        return 243 ^ C0345.f615;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4985(Object obj, Object obj2, int i10) {
        if (C0442.m8612() >= 0) {
            ((t7) obj).writeToParcel((Parcel) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m4986(Object obj) {
        if (C0086.m1846() > 0) {
            return ((c9.a) obj).invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4987(int i10, int i11) {
        if (C0110.m2123() < 0) {
            return h6.g.T(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4969(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
