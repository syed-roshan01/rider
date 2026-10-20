package t2;

import a2.C0004;
import a6.C0007;
import android.content.Context;
import androidx.activity.C0017;
import c4.C0066;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.ktx.C0180;
import d7.C0219;
import e2.C0260;
import f4.C0276;
import g2.l0;
import i6.C0319;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import k0.c5;
import k0.g2;
import k0.m1;
import k0.m2;
import k0.m4;
import k0.r4;
import k0.y4;
import k6.d5;
import k6.q;
import k6.z4;
import m0.g1;
import m0.p0;
import n8.C0365;
import s0.C0409;
import v0.C0441;
import v0.C0443;
import w0.C0454;
import w5.C0463;
import y.t0;
import y6.C0476;

/* JADX INFO: renamed from: t2.۟ۧۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0423 {

    /* JADX INFO: renamed from: ۨ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int f694 = 806;

    /* JADX INFO: renamed from: ۟۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8297(Object obj) {
        if (C0066.m1277() > 0) {
            return ((m2) obj).f9217r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8298(Object obj) {
        if (C0276.m5315() < 0) {
            return ((zzew.zzb) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m8299(Object obj, Object obj2, Object obj3) {
        if (C0004.m76() < 0) {
            ((URLConnection) obj).setRequestProperty((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8300(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m8302(Object obj) {
        if (C0260.m4984() >= 0) {
            return ((y3.l) obj).f16919b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static x.l m8303(Object obj) {
        if (C0219.m4237() >= 0) {
            return ((r4) obj).f9427e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static long m8304(Object obj) {
        if (C0443.m8654() <= 0) {
            return ((y4) obj).f9677c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8305(Object obj, long j10) {
        if (C0454.m8861() < 0) {
            ((q) obj).s(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static void m8306(Object obj, boolean z10) {
        if (C0365.m7172() > 0) {
            ((URLConnection) obj).setDoInput(z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m8307() {
        return 855 ^ C0137.f163;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m8308(Object obj, Object obj2) {
        if (C0007.m154() < 0) {
            return ((zzfi.zzj.zza) obj).zzo((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8309(Object obj, Object obj2, int i10) {
        if (C0319.m6181() > 0) {
            ((g2) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۤ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8310(Object obj, Object obj2, Object obj3, boolean z10, boolean z11, Object obj4, Object obj5, boolean z12, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, int i10, int i11, int i12) {
        if (C0463.m9033() > 0) {
            ((m1) obj).b((String) obj2, (c9.e) obj3, z10, z11, (l0) obj4, (x.l) obj5, z12, (c9.e) obj6, (c9.e) obj7, (c9.e) obj8, (c9.e) obj9, (c9.e) obj10, (c9.e) obj11, (c9.e) obj12, (m4) obj13, (t0) obj14, (c9.e) obj15, (m0.m) obj16, i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8311(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static p0 m8312() {
        if (C0180.m3448() > 0) {
            return c5.f8806a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۡ, reason: contains not printable characters */
    public static g1 m8313(Object obj) {
        if (C0476.m9298() <= 0) {
            return ((d5.g1) obj).f4522s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m8314(Object obj, Object obj2) {
        if (C0017.m332() < 0) {
            ((z4) obj).r((d5) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۨۡ, reason: not valid java name and contains not printable characters */
    public static d5.m m8315() {
        if (C0409.m8037() < 0) {
            return d5.m.f4666v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟۠, reason: not valid java name and contains not printable characters */
    public static Context m8316(Object obj) {
        if (C0441.m8612() >= 0) {
            return ((j.a) obj).f8194a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8301(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
