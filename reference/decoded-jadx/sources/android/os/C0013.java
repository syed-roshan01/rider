package android.os;

import a2.x;
import a5.a0;
import androidx.compose.foundation.layout.a;
import b4.C0052;
import c3.C0063;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.tracing.C0204;
import d5.b2;
import d5.m;
import d9.C0222;
import e2.C0263;
import f4.C0274;
import fa.C0280;
import g.C0282;
import g1.h;
import g8.C0293;
import h0.C0299;
import h7.C0312;
import i5.C0318;
import java.io.ByteArrayOutputStream;
import k0.i3;
import k0.s3;
import k0.u;
import k0.w2;
import k3.C0335;
import k6.n4;
import k6.p7;
import m0.l3;
import m1.C0351;
import p4.C0376;
import p9.z;
import q9.C0391;
import u4.C0436;
import y.g;
import y0.o;
import z3.C0486;

/* JADX INFO: renamed from: android.os.ۣۣ۟ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0013 {

    /* JADX INFO: renamed from: ۨ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int f33 = 793;

    /* JADX INFO: renamed from: ۟۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static o m245(Object obj, float f10, float f11, int i10) {
        if (C0282.m5446() > 0) {
            return a.n((o) obj, f10, f11, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static int m246(Object obj) {
        if (C0318.m6163() <= 0) {
            return ((w2) obj).f9608a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static g m247(Object obj) {
        if (C0312.m6046() >= 0) {
            return ((u) obj).f9509d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static long m248(Object obj) {
        if (C0335.m6500() < 0) {
            return ((i3) obj).f9038o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m249(Object obj) {
        if (C0486.m9464() >= 0) {
            return ((k7.a) obj).f10625a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static h m250(Object obj) {
        if (C0351.m6885() > 0) {
            return ((x) obj).f1046p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m251(Object obj) {
        if (C0280.m5432() >= 0) {
            return ((p7) obj).f10303r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m252(Object obj) {
        if (C0274.m5286() <= 0) {
            return ((n4) obj).f10221a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m253() {
        return 497 ^ C0299.f447;
    }

    /* JADX INFO: renamed from: ۠ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m254(String str) {
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

    /* JADX INFO: renamed from: ۠ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m255(Object obj) {
        if (C0293.m5656() >= 0) {
            return ((a0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۤ, reason: not valid java name and contains not printable characters */
    public static e m256(Object obj) {
        if (C0263.m5033() < 0) {
            return ((s3) obj).f9452d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m258() {
        if (C0436.m8524() <= 0) {
            return "Filter by Distance";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static k6.o m259(Object obj) {
        if (C0063.m1217() >= 0) {
            return k6.o.b((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۡ۠, reason: not valid java name and contains not printable characters */
    public static z m260(Object obj) {
        if (C0204.m3905() < 0) {
            return ((MainViewModel) obj).f3122w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m261(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۢۡۨ, reason: contains not printable characters */
    public static String m262() {
        if (C0391.m7657() >= 0) {
            return "Unlimited Auto Accept";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۤ, reason: contains not printable characters */
    public static m m263() {
        if (C0222.m4279() <= 0) {
            return m.f4669y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static l3 m264(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((b2) obj).f4422n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۥۥ, reason: contains not printable characters */
    public static boolean m265(Object obj) {
        if (C0139.m2684() < 0) {
            return ((zzfi.zzb) obj).zzh();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۡۤ, reason: not valid java name and contains not printable characters */
    public static String m266(Object obj) {
        if (C0376.m7371() > 0) {
            return ((k6.e) obj).f9988b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m257(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
