package i4;

import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.draw.C0028;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.ktx.C0180;
import d5.a0;
import d9.C0226;
import dagger.hilt.internal.componenttreedeps.C0249;
import e0.C0257;
import e1.l0;
import e2.C0261;
import e2.C0263;
import f0.b0;
import f0.t1;
import g8.v0;
import ga.C0296;
import h5.C0309;
import i9.C0322;
import j9.C0330;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import k0.h0;
import k0.k1;
import k0.t0;
import k0.v2;
import k6.t4;
import k6.x;
import k6.x3;
import l0.C0341;
import m0.g1;
import o1.u;
import q7.C0391;
import r7.C0404;
import s2.C0412;
import u4.C0436;
import u7.C0438;

/* JADX INFO: renamed from: i4.ۨ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0318 {

    /* JADX INFO: renamed from: ۟ۧ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static int f465 = 341;

    /* JADX INFO: renamed from: ۟۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static i1.f m6134() {
        if (C0438.m8543() >= 0) {
            return z6.a.f17311l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static e8.k m6135(Object obj) {
        if (C0257.m4901() < 0) {
            return ((v0) obj).f7166f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6136(Object obj) {
        if (C0100.m1959() < 0) {
            return ((zzfi.zzj) obj).zzbj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m6137() {
        if (C0296.m5679() >= 0) {
            return "open_overlay";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6138(Object obj) {
        if (C0226.m4339() < 0) {
            return ((u) obj).f12417d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡ۟, reason: not valid java name and contains not printable characters */
    public static long m6139(Object obj) {
        if (C0322.m6226() <= 0) {
            return ((f5.o) obj).f6305b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m6140() {
        if (C0261.m4984() >= 0) {
            return "Error querying conditional property";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6141(Object obj) {
        if (C0263.m5016() <= 0) {
            return ((b0) obj).f5608a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static long m6142() {
        if (C0341.m6681() >= 0) {
            return e5.a.f5127c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static h0 m6143(float f10, Object obj, int i10) {
        if (C0249.m4762() >= 0) {
            return t0.e(f10, (m0.m) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6144() {
        return (-1003) ^ C0330.f477;
    }

    /* JADX INFO: renamed from: ۠ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static int m6145(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۢۥۧ, reason: not valid java name and contains not printable characters */
    public static q.f m6146(Object obj) {
        if (C0180.m3448() >= 0) {
            return ((t4) obj).f10383g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m6147(Object obj) {
        if (C0436.m8516() > 0) {
            return ((AccessibilityNodeInfo) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۤ, reason: not valid java name and contains not printable characters */
    public static String m6148(String str) {
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

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static long m6149(Object obj) {
        if (C0091.m1940() <= 0) {
            return ((k0.k) obj).f9086n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static u8.e m6150(Object obj, Object obj2, Object obj3) {
        if (C0131.m2522() > 0) {
            return ((v2) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static PackageManager m6151(Object obj) {
        if (C0076.m1655() > 0) {
            return ((a0) obj).f4391f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static l0 m6152(Object obj) {
        if (C0391.m7643() <= 0) {
            return ((k1) obj).f9098f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static int m6153(Object obj) {
        if (C0028.m557() >= 0) {
            return ((InputStream) obj).available();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟, reason: not valid java name and contains not printable characters */
    public static d5.l m6154() {
        if (C0404.m7911() <= 0) {
            return d5.l.C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static g1 m6155(Object obj) {
        if (C0412.m8066() <= 0) {
            return ((t1) obj).f5943c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static x3 m6157() {
        if (C0309.m5962() >= 0) {
            return x.D0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6156(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
