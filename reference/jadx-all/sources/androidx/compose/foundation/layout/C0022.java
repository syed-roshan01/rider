package androidx.compose.foundation.layout;

import a6.C0007;
import androidx.startup.C0047;
import c3.C0063;
import com.google.android.gms.common.C0087;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.measurement.C0181;
import com.google.firebase.platforminfo.C0193;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.internal.processedrootsentinel.C0252;
import dagger.hilt.migration.C0255;
import f0.C0273;
import f5.i;
import g.C0285;
import g2.b0;
import g2.v;
import g5.C0291;
import h7.C0311;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import k.f;
import k0.e;
import k0.h2;
import k0.l2;
import k6.f5;
import k6.x7;
import l.q;
import m0.n1;
import p0.C0374;
import p9.o0;
import p9.z;
import r7.C0405;
import t.u1;
import y.C0475;
import y0.o;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.۟ۥۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0022 {

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f42 = -682;

    /* JADX INFO: renamed from: ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m424(Object obj) {
        if (C0047.m904() <= 0) {
            return ((x7) obj).f10555t;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static long m425(Object obj) {
        if (C0063.m1217() >= 0) {
            return ((e) obj).f8854r;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m426(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static v m427(Object obj) {
        if (C0285.m5483() > 0) {
            return ((b0) obj).f6512a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m428(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static o0 m429(Object obj) {
        if (C0252.m4811() <= 0) {
            return ((z) obj).f12972a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m431(Object obj, int i10) {
        if (C0255.m4866() <= 0) {
            return ((ArrayList) obj).remove(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m432(Object obj, Object obj2) {
        if (C0122.m2355() > 0) {
            return ((FileChannel) obj).write((ByteBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static long m433(Object obj) {
        if (C0087.m1852() > 0) {
            return ((h2) obj).f8976o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m434(Object obj) {
        if (C0291.m5589() < 0) {
            return ((f5) obj).E;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static u m435() {
        if (C0273.m5249() <= 0) {
            return r.f16816a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۤ, reason: not valid java name and contains not printable characters */
    public static String m436() {
        if (C0311.m5997() > 0) {
            return "Failed to merge filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m437() {
        if (C0233.m4482() >= 0) {
            return "Master Filter Switch";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m438(Object obj, float f10) {
        if (C0285.m5483() > 0) {
            ((f) obj).K(f10);
        }
    }

    /* JADX INFO: renamed from: ۥۨۨ۠, reason: contains not printable characters */
    public static String m439() {
        if (C0405.m7934() >= 0) {
            return "installed_apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۡ, reason: contains not printable characters */
    public static n1 m440(Object obj) {
        if (C0374.m7322() <= 0) {
            return ((u1) obj).f14321c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۢ, reason: contains not printable characters */
    public static o m441(Object obj) {
        if (C0475.m9246() < 0) {
            return ((l2) obj).f9171a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m442(Object obj, Object obj2) {
        if (C0193.m3691() < 0) {
            return q.x((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m443(Object obj) {
        if (C0181.m3452() < 0) {
            return ((i) obj).f6273a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static int m444() {
        return 33 ^ C0007.f27;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m430(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
