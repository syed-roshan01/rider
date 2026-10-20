package androidx.compose.ui.layout;

import androidx.compose.foundation.text.modifiers.C0025;
import b8.C0055;
import c1.p;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.dynamicloading.C0139;
import d5.C0219;
import d5.m0;
import dagger.hilt.android.components.C0230;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.b5;
import k6.a5;
import k6.l;
import k8.C0339;
import l2.j;
import l8.C0346;
import m0.g2;
import m7.C0358;
import o4.C0370;
import o7.d0;
import p9.q0;
import p9.z;
import r6.C0403;
import t0.C0419;
import t1.o;
import t3.C0425;
import u4.C0437;
import y0.n;
import z7.C0490;

/* JADX INFO: renamed from: androidx.compose.ui.layout.ۢۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0036 {

    /* JADX INFO: renamed from: ۡۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int f56 = 42;

    /* JADX INFO: renamed from: ۟۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m696(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static z1.a m697() {
        if (C0230.m4421() <= 0) {
            return z1.a.f17192a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m698() {
        return (-82) ^ C0139.f165;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static zzfc.zzd m699() {
        if (C0370.m7254() >= 0) {
            return zzfc.zzd.zzg();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static List m700(Object obj) {
        if (C0437.m8524() < 0) {
            return ((zzfi.zzi) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m701(Object obj) {
        if (C0425.m8322() > 0) {
            return ((a5) obj).f9891z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m702(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static z m703(Object obj) {
        if (C0358.m7001() <= 0) {
            return ((MainViewModel) obj).f3100l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static n m704(Object obj) {
        if (C0419.m8221() >= 0) {
            return ((o) obj).f14521v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static long m705(Object obj) {
        if (C0490.m9528() > 0) {
            return ((l) obj).f10160a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static f m706() {
        if (C0055.m1056() > 0) {
            return d0.E();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m707(Object obj) {
        if (C0403.m7897() >= 0) {
            return ((m0) obj).f4674c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m708(Object obj, int i10) {
        if (C0370.m7254() > 0) {
            return ((zzfi.zzj.zza) obj).zzg(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static q0 m709() {
        if (C0339.m6645() < 0) {
            return g2.f11517v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۦۣ, reason: not valid java name and contains not printable characters */
    public static j m710(Object obj) {
        if (C0346.m6759() <= 0) {
            return ((b5) obj).f8759p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static String m711() {
        if (C0025.m495() > 0) {
            return "apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢ, reason: contains not printable characters */
    public static boolean m712(Object obj) {
        if (C0219.m4224() < 0) {
            return androidx.compose.ui.focus.a.y((p) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m714() {
        if (C0081.m1735() >= 0) {
            return zzne.zzao();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m713(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
