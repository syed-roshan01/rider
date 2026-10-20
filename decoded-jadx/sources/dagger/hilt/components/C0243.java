package dagger.hilt.components;

import a3.C0006;
import c9.a;
import c9.e;
import com.auto.accept.data.model.UserProfile;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.C0201;
import com.google.protobuf.v;
import d1.C0211;
import d7.t;
import f0.i;
import fa.C0280;
import ga.C0295;
import h0.v0;
import h7.C0312;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.List;
import k0.d1;
import k0.e4;
import k0.r4;
import l0.g;
import la.C0348;
import m0.m;
import o1.s;
import o2.o;
import o5.C0370;
import o7.d0;
import p8.C0379;
import s6.C0413;
import w9.C0465;
import x2.C0467;
import z7.C0490;

/* JADX INFO: renamed from: dagger.hilt.components.۟ۦۣۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0243 {

    /* JADX INFO: renamed from: ۨ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f323 = 112;

    /* JADX INFO: renamed from: ۟۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m4663(Object obj) {
        if (C0211.m4046() >= 0) {
            return ((d1) obj).f8826n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m4664() {
        if (C0490.m9552() > 0) {
            return g.f11049c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4665(Object obj) {
        if (C0201.m3855() < 0) {
            return ((e4) obj).f8879f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4666(Object obj, boolean z10, Object obj2, int i10) {
        if (C0467.m9101() <= 0) {
            t.n((v0) obj, z10, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static List m4667(Object obj) {
        if (C0379.m7433() >= 0) {
            return Collections.singletonList(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4668(Object obj, int i10, Object obj2) {
        if (C0006.m112() <= 0) {
            ((v) obj).E0(i10, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4669(Object obj) {
        if (C0348.m6818() <= 0) {
            return ((i) obj).f5748o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4670(Object obj) {
        if (C0280.m5432() > 0) {
            return ((f5.i) obj).f6276d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4672(Object obj) {
        if (C0465.m9068() <= 0) {
            return ((zzfi.zzb) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4673(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        if (C0186.m3548() <= 0) {
            s.d((a) obj, (o) obj2, (e) obj3, (m) obj4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static e m4674(Object obj) {
        if (C0413.m8107() <= 0) {
            return ((r4) obj).f9432q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static UserProfile m4675(Object obj) {
        if (C0370.m7269() >= 0) {
            return ((f5.e) obj).f6248a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static f m4676() {
        if (C0312.m6046() >= 0) {
            return d0.f12591t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static int m4677(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m4678() {
        return 895 ^ C0295.f443;
    }

    /* JADX INFO: renamed from: ۨۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4679(String str) {
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

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m4671(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
