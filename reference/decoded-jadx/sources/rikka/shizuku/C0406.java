package rikka.shizuku;

import a5.c;
import a5.k;
import a5.z;
import android.support.v4.graphics.drawable.C0016;
import c3.C0062;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.annotations.C0128;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.ktx.C0199;
import d5.o1;
import d5.z0;
import dagger.hilt.android.internal.modules.C0233;
import f0.C0271;
import h7.C0310;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k0.m;
import k0.v0;
import k6.e6;
import m0.l3;
import m7.C0357;
import p0.C0374;
import q6.C0387;
import r8.p;
import u8.e;
import z3.C0485;

/* JADX INFO: renamed from: rikka.shizuku.۟ۤۦ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0406 {

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int f677 = 843;

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m7967(Object obj) {
        if (C0374.m7350() <= 0) {
            return ((e6) obj).f10010n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m7968(Object obj) {
        if (C0233.m4495() < 0) {
            return p.L0((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m7969(Object obj, Object obj2, boolean z10, Object obj3) {
        if (C0104.m2034() < 0) {
            return ((z) obj).d((String) obj2, z10, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7970() {
        if (C0062.m1186() >= 0) {
            return zzou.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m7971(Object obj) {
        if (C0016.m315() > 0) {
            return ((z0) obj).f4873a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static String m7972() {
        if (C0357.m7001() < 0) {
            return "triggered_event";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7973(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0180.m3448() > 0) {
            ((Logger) obj).log((Level) obj2, (String) obj3, (Throwable) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m7974(Object obj) {
        if (C0310.m5997() > 0) {
            return ((k) obj).f1280d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۡ, reason: not valid java name and contains not printable characters */
    public static long m7975(Object obj) {
        if (C0168.m3229() > 0) {
            return ((v0) obj).f9546d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m7976(Object obj) {
        if (C0199.m3818() > 0) {
            return ((c) obj).f1232c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۥۣ, reason: not valid java name and contains not printable characters */
    public static int m7977() {
        return 542 ^ C0387.f658;
    }

    /* JADX INFO: renamed from: ۤۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7978(Object obj) {
        if (C0271.m5222() <= 0) {
            return ((m) obj).f9190a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m7979(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static String m7980(String str) {
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

    /* JADX INFO: renamed from: ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7981(Object obj) {
        if (C0485.m9449() < 0) {
            return o1.n((l3) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠۠, reason: not valid java name and contains not printable characters */
    public static long m7982(Object obj) {
        if (C0128.m2475() <= 0) {
            return ((k0.e) obj).f8853q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۧۦ, reason: not valid java name and contains not printable characters */
    public static String m7983(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
