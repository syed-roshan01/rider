package h7;

import android.os.Parcel;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0023;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.reporting.C0188;
import d1.C0212;
import d1.C0213;
import d5.w;
import f2.e;
import f4.C0275;
import fa.C0280;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.b5;
import k0.c4;
import k0.j0;
import k0.s2;
import k6.s6;
import k6.t4;
import k6.x;
import k6.x3;
import l0.c;
import m0.g1;
import m1.C0351;
import n7.C0364;
import p0.C0374;
import s8.C0418;
import t2.C0421;
import t7.C0426;
import w4.C0461;
import z7.b;

/* JADX INFO: renamed from: h7.۟۟ۧۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0311 {

    /* JADX INFO: renamed from: ۟ۤۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int f458 = -189;

    /* JADX INFO: renamed from: ۟۟ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static float m5995() {
        if (C0023.m461() > 0) {
            return c4.f8803d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static j0 m5996() {
        if (C0188.m3594() > 0) {
            return j0.f9057e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5997() {
        return (-642) ^ C0351.f621;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static g1 m5998(Object obj) {
        if (C0280.m5406() < 0) {
            return ((w) obj).f4817f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m5999(Object obj) {
        if (C0421.m8263() > 0) {
            return ((zzew.zzb.zza) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6000(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0418.m8208() > 0) {
            return ((t4) obj).y((String) obj2, (byte[]) obj3, (String) obj4, (String) obj5);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m6001(Object obj) {
        if (C0374.m7322() < 0) {
            return ((Parcel) obj).createStringArrayList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6002(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m6003(Object obj) {
        if (C0461.m8972() >= 0) {
            return ((s2) obj).f9447a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۡ, reason: not valid java name and contains not printable characters */
    public static x3 m6004() {
        if (C0169.m3245() >= 0) {
            return x.f10474b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static e m6005(Object obj) {
        if (C0017.m332() < 0) {
            return ((b5) obj).f8757n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۧ۠, reason: not valid java name and contains not printable characters */
    public static long m6006() {
        if (C0213.m4051() > 0) {
            return c.f11027s;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int m6007(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۦ۟ۤ, reason: contains not printable characters */
    public static String m6008(int i10) {
        if (C0364.m7127() < 0) {
            return z6.a.p0(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static boolean m6009(Object obj, int i10, int i11) {
        if (C0426.m8351() <= 0) {
            return ((b) obj).a(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۨ, reason: contains not printable characters */
    public static String m6010() {
        if (C0085.m1825() > 0) {
            return "skip_rides_distance";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6011(Object obj) {
        if (C0275.m5286() <= 0) {
            ((s6) obj).F();
        }
    }

    /* JADX INFO: renamed from: ۧۢۧۨ, reason: not valid java name and contains not printable characters */
    public static float m6012() {
        if (C0212.m4046() > 0) {
            return k0.x.f9633a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6013(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
