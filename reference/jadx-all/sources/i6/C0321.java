package i6;

import a2.C0005;
import c1.k;
import c5.l;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.bundle.C0149;
import d5.v1;
import d7.t;
import e1.C0258;
import f0.c2;
import f0.e0;
import f0.j1;
import f0.u;
import h7.C0312;
import h7.C0313;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import k0.k3;
import k0.r4;
import k6.s5;
import k6.v7;
import l6.C0345;
import m5.C0355;
import p0.C0375;
import q6.C0389;
import r2.C0397;
import r4.C0399;
import t3.C0425;
import w.C0454;
import w6.C0465;
import y.t0;

/* JADX INFO: renamed from: i6.ۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0321 {

    /* JADX INFO: renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int f468 = -806;

    /* JADX INFO: renamed from: ۟۠ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static k m6193(Object obj) {
        if (C0425.m8322() > 0) {
            return ((e0) obj).f5683q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m6194(Object obj) {
        if (C0375.m7350() <= 0) {
            return ((v1) obj).f4809a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۣ, reason: not valid java name and contains not printable characters */
    public static List m6195(Object obj) {
        if (C0389.m7600() < 0) {
            return t.d0(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static j1 m6196(Object obj) {
        if (C0355.m6953() <= 0) {
            return ((c2) obj).f5636a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m6197(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m6198(Object obj, Object obj2, Object obj3) {
        if (C0399.m7797() <= 0) {
            return ((u0.b) obj).invoke(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۨۡ, reason: not valid java name and contains not printable characters */
    public static t0 m6199(Object obj) {
        if (C0078.m1692() > 0) {
            return ((r4) obj).f9438w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m6200() {
        return (-379) ^ C0397.f667;
    }

    /* JADX INFO: renamed from: ۥۤۡۤ, reason: contains not printable characters */
    public static float m6201() {
        if (C0465.m9059() < 0) {
            return k3.f9111a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۤۢ, reason: contains not printable characters */
    public static String m6202(String str) {
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

    /* JADX INFO: renamed from: ۥۥۡۢ, reason: contains not printable characters */
    public static s5 m6203(Object obj, Object obj2) {
        if (C0454.m8831() < 0) {
            return ((s5) obj).e((s5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢ۟, reason: contains not printable characters */
    public static long m6204(Object obj) {
        if (C0149.m2863() >= 0) {
            return ((zzfi.zzj) obj).zzj();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static m2.b m6206(Object obj) {
        if (C0005.m104() > 0) {
            return ((u) obj).f5964z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۡ, reason: not valid java name and contains not printable characters */
    public static String m6207(Object obj) {
        if (C0312.m6027() < 0) {
            return ((v7) obj).f10447c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6208(Object obj) {
        if (C0258.m4918() > 0) {
            return ((zzfc.zzg) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m6209(Object obj) {
        if (C0345.m6746() >= 0) {
            ((HttpURLConnection) obj).disconnect();
        }
    }

    /* JADX INFO: renamed from: ۨۥۣ۠, reason: not valid java name and contains not printable characters */
    public static l m6210() {
        if (C0313.m6046() >= 0) {
            return l.f2994a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۧ, reason: contains not printable characters */
    public static String m6205(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
