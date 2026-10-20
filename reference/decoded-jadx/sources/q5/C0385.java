package q5;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.C0022;
import androidx.core.app.C0040;
import androidx.profileinstaller.C0045;
import b8.C0055;
import c1.C0061;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.components.C0134;
import d2.C0215;
import dagger.hilt.android.internal.modules.C0234;
import e9.C0266;
import f0.C0272;
import f0.e0;
import f0.h2;
import f5.r;
import g2.s;
import h3.C0301;
import java.io.ByteArrayOutputStream;
import k0.m4;
import k0.o0;
import k6.a5;
import k6.g4;
import k6.v;
import k6.x;
import k6.x3;
import l.q;
import p3.C0375;
import v8.C0450;
import y.C0475;

/* JADX INFO: renamed from: q5.۟ۥۣۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0385 {

    /* JADX INFO: renamed from: ۦۣۤ, reason: contains not printable characters */
    public static int f656 = -15;

    /* JADX INFO: renamed from: ۟۠۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static f0.j m7544() {
        if (C0045.m874() >= 0) {
            return f0.j.f5781d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7545(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m7546() {
        return (-295) ^ C0040.f60;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7547(Object obj) {
        if (C0087.m1852() > 0) {
            return ((r) obj).f6316c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7548(int i10, int i11, int i12) {
        if (C0375.m7362() > 0) {
            return a7.a.u(i10, i11, i12);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static v m7549(Object obj) {
        if (C0022.m444() <= 0) {
            return ((g4) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۧ, reason: not valid java name and contains not printable characters */
    public static c9.a m7550(Object obj) {
        if (C0234.m4512() > 0) {
            return ((h2) obj).f5740e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۥ, reason: not valid java name and contains not printable characters */
    public static long m7551(Object obj) {
        if (C0266.m5099() < 0) {
            return ((a5) obj).C;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static void m7552(int i10, Object obj, Object obj2, boolean z10, boolean z11) {
        if (C0272.m5249() <= 0) {
            q.q(i10, (c9.e) obj, (m0.q) obj2, z10, z11);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static u0.b m7553() {
        if (C0061.m1161() <= 0) {
            return o0.f9286c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7554(Object obj) {
        if (C0134.m2587() < 0) {
            ((ByteArrayOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static s m7555(Object obj) {
        if (C0215.m4108() <= 0) {
            return ((e0) obj).f5681o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static x3 m7556() {
        if (C0475.m9266() > 0) {
            return x.f10478d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m7557() {
        if (C0301.m5797() <= 0) {
            return zzfi.zzb.zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۢ, reason: not valid java name and contains not printable characters */
    public static void m7558(Object obj, Object obj2) {
        if (C0119.m2289() >= 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m7559(Object obj, Object obj2) {
        if (C0055.m1056() > 0) {
            return ((k6.f) obj).n((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static long m7560(Object obj) {
        if (C0450.m8792() <= 0) {
            return ((m4) obj).O;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧۡۡ, reason: contains not printable characters */
    public static int m7561(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m7543(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
