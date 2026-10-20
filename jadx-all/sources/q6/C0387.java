package q6;

import a4.c0;
import androidx.preference.C0044;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.remoteconfig.internal.C0195;
import d5.k2;
import d5.s;
import d5.y;
import d7.t;
import dagger.hilt.internal.componenttreedeps.C0249;
import f0.l1;
import f0.p0;
import g4.C0290;
import ia.C0323;
import java.io.ByteArrayOutputStream;
import k0.d0;
import k0.f0;
import k0.l0;
import k6.a5;
import k6.x;
import k6.x3;
import l8.C0347;
import m0.l3;
import r2.C0395;
import s.C0409;
import t2.C0423;
import v0.C0444;
import z.C0481;

/* JADX INFO: renamed from: q6.ۣ۟ۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0387 {

    /* JADX INFO: renamed from: ۡ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static int f657 = -671;

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m7562(Object obj, Object obj2) {
        if (C0347.m6774() > 0) {
            return ((f5.i) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static l3 m7563(Object obj) {
        if (C0423.m8294() > 0) {
            return ((k2) obj).f4618n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m7564() {
        return 931 ^ C0323.f470;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static c0 m7565(Object obj) {
        if (C0395.m7729() > 0) {
            return t.t0((c9.a) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static zzfc.zza.zze m7566(Object obj) {
        if (C0123.m2379() >= 0) {
            return ((zzfc.zza.zzc) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7567(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۧ۟, reason: not valid java name and contains not printable characters */
    public static d0 m7568(Object obj) {
        if (C0290.m5580() <= 0) {
            return ((f0) obj).f8906n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m7569(Object obj) {
        if (C0409.m8009() < 0) {
            return ((p0) obj).f5844b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static x3 m7570() {
        if (C0444.m8654() < 0) {
            return x.f10482f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m7571(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static t.d m7572(Object obj) {
        if (C0195.m3737() <= 0) {
            return ((l1) obj).f5813b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m7573(Object obj, Object obj2, int i10, int i11, Object obj3) {
        if (C0157.m2999() > 0) {
            ((m0.q) obj).V(obj2, i10, i11, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static u0.b m7574() {
        if (C0081.m1735() > 0) {
            return s.f4764h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢۨ, reason: contains not printable characters */
    public static long m7575(Object obj) {
        if (C0121.m2336() < 0) {
            return ((a5) obj).C();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7576(Object obj) {
        if (C0044.m860() > 0) {
            return ((zzew.zzc) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۡ۟, reason: not valid java name and contains not printable characters */
    public static l0 m7578() {
        if (C0481.m9354() <= 0) {
            return l0.f9150w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7579(Object obj) {
        if (C0249.m4762() >= 0) {
            return ((y) obj).f4854d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m7577(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
