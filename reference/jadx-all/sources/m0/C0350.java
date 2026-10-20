package m0;

import android.database.Cursor;
import android.support.v4.app.C0015;
import androidx.fragment.app.C0042;
import b7.C0054;
import c3.C0062;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0107;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.installations.local.C0176;
import com.google.protobuf.C0209;
import d3.C0217;
import dagger.hilt.android.internal.migration.C0233;
import g3.C0289;
import h.C0298;
import h3.C0302;
import i.C0317;
import java.io.ByteArrayOutputStream;
import k0.q3;
import k4.C0337;
import k6.j7;
import k6.l4;
import k6.n4;
import k6.t4;
import k6.u4;
import k6.z3;
import la.C0349;
import n7.C0365;
import q2.C0385;
import s.C0409;
import w4.C0461;
import z2.C0485;

/* JADX INFO: renamed from: m0.۟ۤۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0350 {

    /* JADX INFO: renamed from: ۢ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int f620 = 809;

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static long m6832(Object obj) {
        if (C0105.m2045() >= 0) {
            return ((q3) obj).f9409p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static int m6833(Object obj) {
        if (C0289.m5547() >= 0) {
            return ((u4) obj).f10417a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m6834(Object obj) {
        if (C0349.m6818() <= 0) {
            return ((z3) obj).f10599k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static n4 m6835(Object obj) {
        if (C0015.m294() < 0) {
            return ((l4) obj).f10178k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static a2.k m6836(Object obj) {
        if (C0461.m8972() > 0) {
            return ((f0.j1) obj).f5806j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6837() {
        if (C0042.m820() > 0) {
            return "android_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m6838() {
        return (-280) ^ C0209.f233;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m6839(Object obj) {
        if (C0317.m6120() < 0) {
            return ((d5.d1) obj).f4455n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m6840() {
        if (C0302.m5797() <= 0) {
            return "1001";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static k0.o2 m6841() {
        if (C0485.m9436() < 0) {
            return k0.o2.f9307a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static l3 m6843(Object obj) {
        if (C0107.m2075() <= 0) {
            return ((d5.w0) obj).f4829s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m6844(Object obj) {
        if (C0054.m1047() >= 0) {
            return ((k0.v0) obj).f9545c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6845(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6846(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static float m6847(Object obj, int i10) {
        if (C0298.m5722() > 0) {
            return ((a2.a0) obj).i(i10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6848(Object obj) {
        if (C0365.m7147() < 0) {
            return ((k0.l1) obj).f9165u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static y0.f m6849() {
        if (C0409.m8009() < 0) {
            return y0.a.f16714n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m6850(Object obj) {
        if (C0385.m7527() < 0) {
            return ((f5.l) obj).f6290c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m6851(Object obj) {
        if (C0233.m4482() > 0) {
            return ((k0.w0) obj).f9599b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m6852(Object obj) {
        if (C0337.m6515() < 0) {
            return ((a5.h) obj).f1261a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6853(Object obj) {
        if (C0317.m6120() <= 0) {
            ((j7) obj).s();
        }
    }

    /* JADX INFO: renamed from: ۥۥۣ۟, reason: contains not printable characters */
    public static int m6854(Object obj, Object obj2) {
        if (C0163.m3132() >= 0) {
            return ((Cursor) obj).getColumnIndex((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۡۡ, reason: contains not printable characters */
    public static Object m6855(Object obj) {
        if (C0176.m3367() < 0) {
            return ((f5.k) obj).f6284f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static t4 m6856(Object obj) {
        if (C0062.m1186() > 0) {
            return ((u4) obj).f10418b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6857(Object obj) {
        if (C0217.m4114() <= 0) {
            return ((f5.p) obj).f6308a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۢۢ, reason: not valid java name and contains not printable characters */
    public static l3 m6858(float f10, Object obj, Object obj2, int i10) {
        if (C0111.m2143() >= 0) {
            return t.i.a(f10, (t.w1) obj, (m) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m6842(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
