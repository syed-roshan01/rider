package j9;

import android.content.Context;
import androidx.activity.C0017;
import b7.C0054;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.installations.ktx.C0175;
import d5.g;
import d5.g1;
import d5.o1;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.internal.componenttreedeps.C0248;
import e2.C0263;
import f0.j;
import g2.l0;
import java.io.ByteArrayOutputStream;
import k0.i0;
import k6.s6;
import k6.t;
import k6.t6;
import m0.m;
import q2.C0384;
import s0.C0410;
import w6.C0464;
import x4.C0469;
import x5.C0470;

/* JADX INFO: renamed from: j9.۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0329 {

    /* JADX INFO: renamed from: ۟ۢۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int f477 = 839;

    /* JADX INFO: renamed from: ۟۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Context m6352(Object obj) {
        if (C0229.m4421() < 0) {
            return ((g1) obj).f4519p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۡ, reason: not valid java name and contains not printable characters */
    public static long m6353(Object obj) {
        if (C0175.m3346() >= 0) {
            return ((y3.c) obj).f16887c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۤ, reason: not valid java name and contains not printable characters */
    public static l0 m6354(Object obj) {
        if (C0464.m9059() <= 0) {
            return ((g) obj).f4501n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m6356(Object obj, long j10) {
        if (C0470.m9151() > 0) {
            return ((m2.b) obj).E(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m6357(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۤ, reason: not valid java name and contains not printable characters */
    public static String m6358() {
        if (C0125.m2408() >= 0) {
            return "master_filter_toggle";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static long m6359(Object obj) {
        if (C0469.m9143() >= 0) {
            return ((i0) obj).f9017u;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m6360(Object obj, Object obj2, int i10) {
        if (C0228.m4402() >= 0) {
            o1.k((MainViewModel) obj, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m6361(Object obj) {
        if (C0410.m8063() > 0) {
            return ((t) obj).f10367c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m6362(String str) {
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

    /* JADX INFO: renamed from: ۡۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static j m6363() {
        if (C0384.m7527() <= 0) {
            return j.f5780c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m6364() {
        if (C0017.m332() <= 0) {
            return "Conditional property added";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m6365(Object obj) {
        if (C0106.m2067() >= 0) {
            d7.t.v0(obj);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m6366() {
        if (C0263.m5033() < 0) {
            return "session_scoped";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static int m6367() {
        return 421 ^ C0054.f74;
    }

    /* JADX INFO: renamed from: ۧۢۨۨ, reason: not valid java name and contains not printable characters */
    public static t6 m6368(Object obj) {
        if (C0248.m4762() > 0) {
            return ((s6) obj).f10363i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6355(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
