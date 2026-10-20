package androidx.compose.ui.graphics;

import a.C0001;
import a2.c0;
import c9.c;
import c9.e;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0181;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.l;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.lifecycle.C0236;
import e9.C0266;
import f0.a1;
import f0.b1;
import f5.g0;
import g2.l0;
import h0.v0;
import j3.C0325;
import java.io.ByteArrayOutputStream;
import k0.m4;
import k0.n3;
import k0.s1;
import k0.w2;
import k0.z3;
import k6.a5;
import k6.f5;
import m0.q2;
import m1.C0351;
import q6.C0386;
import t2.C0423;
import t8.C0426;
import u0.b;
import w9.C0465;
import x.m;
import x2.C0467;
import x5.C0470;
import y0.o;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.ۦۦۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0032 {

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static int f52 = -738;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static float m619(Object obj) {
        if (C0386.m7564() >= 0) {
            return ((n3) obj).f9274f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static int m620() {
        return (-297) ^ C0351.f622;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m621(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static l m622() {
        if (C0001.m35() < 0) {
            return l.f4635s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m623(Object obj, int i10) {
        if (C0467.m9101() < 0) {
            ((q2) obj).v(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static String m624() {
        if (C0325.m6295() >= 0) {
            return "sgtm_upload_enabled";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m625(Object obj) {
        if (C0203.m3894() > 0) {
            return ((f5) obj).f();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۤۧ, reason: not valid java name and contains not printable characters */
    public static int m627(Object obj) {
        if (C0423.m8307() > 0) {
            return ((z3) obj).f9706e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m628(Object obj, Object obj2, Object obj3, boolean z10, boolean z11, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, boolean z12, Object obj12, Object obj13, Object obj14, boolean z13, int i10, int i11, Object obj15, Object obj16, Object obj17, Object obj18, int i12, int i13, int i14, int i15) {
        if (C0235.m4538() > 0) {
            s1.a((String) obj, (c) obj2, (o) obj3, z10, z11, (c0) obj4, (e) obj5, (e) obj6, (e) obj7, (e) obj8, (e) obj9, (e) obj10, (e) obj11, z12, (l0) obj12, (b1) obj13, (a1) obj14, z13, i10, i11, (m) obj15, (e1.l0) obj16, (m4) obj17, (m0.m) obj18, i12, i13, i14, i15);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static b m629() {
        if (C0074.m1607() < 0) {
            return d5.o.f4708c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨ, reason: contains not printable characters */
    public static void m630(Object obj) {
        if (C0236.m4549() <= 0) {
            ((v0) obj).o();
        }
    }

    /* JADX INFO: renamed from: ۦۢۧ۟, reason: contains not printable characters */
    public static String m631(Object obj) {
        if (C0266.m5099() < 0) {
            return ((zzfp.zzb) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۢ, reason: contains not printable characters */
    public static long m632(Object obj) {
        if (C0181.m3452() < 0) {
            return ((m4) obj).G;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m633(Object obj, long j10) {
        if (C0426.m8356() < 0) {
            ((a5) obj).H(j10);
        }
    }

    /* JADX INFO: renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static String m634(String str) {
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

    /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static long m635(Object obj) {
        if (C0465.m9068() <= 0) {
            return ((g0) obj).f6265n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m636(Object obj) {
        if (C0470.m9151() > 0) {
            return ((zzew.zzc) obj).zzh();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m637(Object obj, Object obj2) {
        if (C0180.m3448() > 0) {
            return ((w2) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m626(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
