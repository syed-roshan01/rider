package androidx.startup;

import android.os.Parcel;
import android.os.Parcelable;
import b3.C0051;
import c1.C0059;
import c6.C0067;
import c7.C0068;
import c7.C0069;
import c9.e;
import c9.f;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.tracing.C0204;
import d1.C0211;
import d5.q;
import d5.r0;
import d5.w0;
import f0.u1;
import f0.y;
import g2.o;
import g5.C0290;
import h.C0298;
import h0.v0;
import h3.C0303;
import j3.C0325;
import java.io.ByteArrayOutputStream;
import k0.a3;
import k0.c0;
import k0.l2;
import k0.m4;
import k0.n1;
import k0.n2;
import k6.n;
import k6.p5;
import k6.s6;
import k6.u7;
import l0.c;
import m0.g1;
import m0.l3;
import m0.m;
import m4.C0353;
import q6.C0386;
import u0.b;
import x.k;
import y.i1;

/* JADX INFO: renamed from: androidx.startup.ۨۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0047 {

    /* JADX INFO: renamed from: ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int f67 = 975;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static e m900(Object obj) {
        if (C0166.m3170() < 0) {
            return ((l2) obj).f9173c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static v0 m901(Object obj) {
        if (C0069.m1332() <= 0) {
            return ((y) obj).f6005d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢ۠, reason: not valid java name and contains not printable characters */
    public static a3 m902(Object obj) {
        if (C0298.m5742() > 0) {
            return ((r0) obj).f4751b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String[] m903() {
        if (C0109.m2116() <= 0) {
            return u7.f10424j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static int m904() {
        return 355 ^ C0303.f451;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m905(Object obj) {
        if (C0127.m2448() >= 0) {
            return ((s6) obj).f10359e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m906(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۤ, reason: not valid java name and contains not printable characters */
    public static b m907() {
        if (C0051.m992() > 0) {
            return q.f4728e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static p5 m908(Object obj) {
        if (C0067.m1309() < 0) {
            return ((n) obj).f10214a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static l3 m909(Object obj) {
        if (C0068.m1322() >= 0) {
            return ((w0) obj).f4825o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static long m910() {
        if (C0073.m1597() > 0) {
            return c.f11023o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static m4 m911(Object obj) {
        if (C0059.m1117() < 0) {
            return ((n1) obj).f9264u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static o m912(Object obj) {
        if (C0353.m6940() <= 0) {
            return ((f0.o) obj).f5834f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m913(String str) {
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

    /* JADX INFO: renamed from: ۣۤۧ, reason: not valid java name and contains not printable characters */
    public static g1 m915(Object obj) {
        if (C0211.m4046() > 0) {
            return ((u1) obj).f5969e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static Parcelable m916(Object obj, Object obj2) {
        if (C0290.m5589() < 0) {
            return zzbw.zza((Parcel) obj, (Parcelable.Creator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m917() {
        if (C0386.m7564() >= 0) {
            return "daily_error_events_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m918(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        if (C0325.m6295() >= 0) {
            n2.d(i10, (e) obj, (f) obj2, (e) obj3, (e) obj4, (i1) obj5, (e) obj6, (m) obj7, i11);
        }
    }

    /* JADX INFO: renamed from: ۨۡۥۤ, reason: not valid java name and contains not printable characters */
    public static k m919(Object obj) {
        if (C0204.m3905() <= 0) {
            return ((c0) obj).f8779f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ, reason: not valid java name and contains not printable characters */
    public static String m914(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
