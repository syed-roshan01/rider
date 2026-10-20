package s0;

import a2.C0004;
import a2.c0;
import android.content.Context;
import androidx.compose.ui.layout.C0036;
import androidx.fragment.app.C0042;
import androidx.lifecycle.C0043;
import c9.e;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.emulators.C0141;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.ktx.C0199;
import d5.k1;
import f4.C0275;
import g2.C0287;
import h.C0298;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;
import k0.d0;
import k0.i;
import k0.p1;
import k6.a7;
import k6.e5;
import k6.f;
import k6.k;
import k6.r7;
import k6.y5;
import k6.z6;
import l0.j;
import l0.u;
import l2.o;
import l6.C0343;
import r1.k0;
import r1.l0;
import v6.C0447;
import x5.C0470;
import x7.C0471;
import y.j0;
import y.u0;
import z3.C0486;

/* JADX INFO: renamed from: s0.ۧۧۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0410 {

    /* JADX INFO: renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int f681 = 949;

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static float m8044(Object obj) {
        if (C0470.m9151() > 0) {
            return ((d0) obj).f8817c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8045(Object obj) {
        if (C0305.m5904() >= 0) {
            return ((r7) obj).W();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8047(Object obj) {
        if (C0298.m5742() >= 0) {
            return ((zzfi.zzj) obj).zzbd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static k0 m8048(Object obj, int i10, int i11, Object obj2, Object obj3) {
        if (C0141.m2714() <= 0) {
            return ((l0) obj).N(i10, i11, (Map) obj2, (c9.c) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static y5 m8049(Object obj) {
        if (C0199.m3818() > 0) {
            return ((e5) obj).f10003b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ۟, reason: not valid java name and contains not printable characters */
    public static e m8050(Object obj) {
        if (C0447.m8732() <= 0) {
            return ((p1) obj).f9341o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Context m8051(Object obj) {
        if (C0275.m5308() >= 0) {
            return ((k1) obj).f4611d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static float m8052(Object obj) {
        if (C0042.m820() >= 0) {
            return ((o) obj).c();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧ۠, reason: not valid java name and contains not printable characters */
    public static float m8053(Object obj) {
        if (C0343.m6738() <= 0) {
            return ((j0) obj).c();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8054(Object obj, Object obj2) {
        if (C0287.m5529() >= 0) {
            return ((f) obj).p((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m8055(Object obj, Object obj2) {
        if (C0471.m9190() < 0) {
            return ((k) obj).u((zzfi.zzj) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static c0 m8056() {
        if (C0036.m698() <= 0) {
            return u.f11190o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m8057(String str) {
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

    /* JADX INFO: renamed from: ۣۥۣۦ, reason: not valid java name and contains not printable characters */
    public static z6 m8058(Object obj) {
        if (C0486.m9464() >= 0) {
            return ((a7) obj).f9894b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m8059(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۤ۟۠, reason: not valid java name and contains not printable characters */
    public static y0.o m8060(Object obj, Object obj2) {
        if (C0004.m76() <= 0) {
            return androidx.compose.foundation.relocation.a.a((y0.o) obj, (c0.f) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static float m8061() {
        if (C0043.m833() > 0) {
            return j.f11066a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۦ۠, reason: contains not printable characters */
    public static long m8062(Object obj) {
        if (C0200.m3841() <= 0) {
            return ((zzdd) obj).zzb;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۦۤ۠, reason: contains not printable characters */
    public static int m8063() {
        return (-256) ^ C0115.f141;
    }

    /* JADX INFO: renamed from: ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static u0 m8064() {
        if (C0118.m2274() <= 0) {
            return i.f8996f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m8046(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
