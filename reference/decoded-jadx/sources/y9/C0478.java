package y9;

import a.C0000;
import a.C0001;
import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.C0018;
import b8.C0055;
import c1.C0060;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.installations.interop.C0173;
import com.google.gson.internal.sql.C0208;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.internal.C0253;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import g.C0284;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.o1;
import k6.b5;
import k6.k;
import k6.l4;
import k6.p4;
import k6.z4;
import m0.m;
import m0.m3;
import m0.q;
import s8.C0416;
import t.e;
import t.e0;
import t.q1;
import t.u1;
import t.x1;
import u1.s1;
import v5.C0445;

/* JADX INFO: renamed from: y9.ۧۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0478 {

    /* JADX INFO: renamed from: ۟ۧۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f752 = -828;

    /* JADX INFO: renamed from: ۟۠۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static b5 m9319(Object obj) {
        if (C0001.m35() < 0) {
            return ((z4) obj).f10610g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9320(Object obj, Object obj2, int i10, Object obj3) {
        if (C0208.m3984() < 0) {
            return ((k) obj).O((String) obj2, i10, (zzew.zze) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9321(Object obj, int i10, Object obj2) {
        if (C0253.m4844() >= 0) {
            ((SparseArray) obj).put(i10, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m9322(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m9323() {
        if (C0060.m1148() >= 0) {
            return "previous_install_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۤ, reason: not valid java name and contains not printable characters */
    public static q1 m9324(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0416.m8173() <= 0) {
            return e.m((u1) obj, obj2, obj3, (e0) obj4, (x1) obj5, (m) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m9325(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m9326() {
        return (-311) ^ C0284.f429;
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static m3 m9327() {
        if (C0076.m1655() >= 0) {
            return s1.f15275e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9328(Object obj, Object obj2) {
        if (C0055.m1056() > 0) {
            ((q) obj).l0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static p4 m9329(Object obj) {
        if (C0230.m4440() > 0) {
            return ((l4) obj).f10187t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m9330() {
        if (C0018.m354() >= 0) {
            return "Error storing raw event metadata. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۨ, reason: contains not printable characters */
    public static String m9332(Object obj) {
        if (C0000.m12() <= 0) {
            return ((Thread) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static List m9333(Object obj) {
        if (C0445.m8692() <= 0) {
            return ((zzew.zza) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static j.a m9334(Object obj) {
        if (C0173.m3314() >= 0) {
            return f6.b.a((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m9335(Object obj) {
        if (C0245.m4710() > 0) {
            return ((o1) obj).f9292e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢۨ, reason: contains not printable characters */
    public static String m9331(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
