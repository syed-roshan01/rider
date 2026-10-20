package c1;

import android.os.Bundle;
import android.os.Parcel;
import b4.C0052;
import c4.C0064;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.annotations.concurrent.C0125;
import dagger.hilt.android.components.C0229;
import dagger.hilt.internal.C0253;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.util.List;
import k0.i0;
import k0.m4;
import k0.p1;
import k0.v2;
import k6.p7;
import k6.s6;
import k6.v;
import k6.x7;
import l6.C0344;
import la.C0348;
import m0.q2;
import s.C0408;
import u1.C0431;
import u7.C0437;
import v8.C0450;
import v9.C0452;
import w2.C0456;
import z3.C0486;
import z7.C0488;
import z8.C0491;

/* JADX INFO: renamed from: c1.ۢۥۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0061 {

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int f81 = 820;

    /* JADX INFO: renamed from: ۟۠۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1157() {
        if (C0456.m8890() >= 0) {
            return "select count(1) > 0 from raw_events where realtime = 1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m1158(Object obj, Object obj2, Object obj3) {
        if (C0064.m1243() > 0) {
            ((p7) obj).D((v) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static x7 m1159(Object obj, boolean z10) {
        if (C0125.m2408() > 0) {
            return ((s6) obj).H(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1160(Object obj) {
        if (C0253.m4844() >= 0) {
            return ((q2) obj).f11676l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1161() {
        return 415 ^ C0488.f762;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m1162(Object obj) {
        if (C0344.m6746() > 0) {
            return ((p1) obj).f9343q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static long m1163(Object obj) {
        if (C0452.m8825() > 0) {
            return ((k0.d) obj).f8810d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static u0.b m1164() {
        if (C0348.m6818() < 0) {
            return d5.n.f4681b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m1165(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0437.m8543() >= 0) {
            return MainViewModel.c((MainViewModel) obj, (String) obj2, (String) obj3, (u8.e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1166(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m1167(Object obj) {
        if (C0431.m8447() < 0) {
            return ((x9.i) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static MainViewModel m1169(Object obj) {
        if (C0229.m4421() <= 0) {
            return ((f5.r) obj).f6320n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m1170(Object obj, int i10, Object obj2) {
        if (C0450.m8792() <= 0) {
            y3.e.K0((Parcel) obj, i10, (Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1171(String str) {
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

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1172(Object obj) {
        if (C0486.m9464() > 0) {
            return ((v2) obj).f9553c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m1173(Object obj, boolean z10) {
        if (C0408.m8009() < 0) {
            ((URLConnection) obj).setDefaultUseCaches(z10);
        }
    }

    /* JADX INFO: renamed from: ۦ۟۟ۧ, reason: contains not printable characters */
    public static boolean m1174(Object obj) {
        if (C0491.m9566() > 0) {
            return ((zzew.zzf) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۨ, reason: contains not printable characters */
    public static m4 m1175(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((i0) obj).S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1168(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
