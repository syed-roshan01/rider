package dagger.hilt.internal;

import android.graphics.Path;
import android.util.Log;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.components.C0135;
import com.google.firebase.iid.C0169;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.remoteconfig.C0201;
import d1.C0212;
import f0.C0271;
import f0.c2;
import f2.l;
import f6.C0277;
import g9.C0294;
import i9.e;
import i9.f;
import java.io.ByteArrayOutputStream;
import k0.d1;
import k0.i3;
import k0.n2;
import k0.q3;
import k0.x2;
import k7.C0337;
import m0.n1;
import t2.C0423;
import u1.t2;
import w4.C0459;
import y0.o;
import z3.C0487;

/* JADX INFO: renamed from: dagger.hilt.internal.۟ۤۧۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0252 {

    /* JADX INFO: renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int f332 = 685;

    /* JADX INFO: renamed from: ۣ۟۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static l m4818() {
        if (C0459.m8951() <= 0) {
            return l.f6115c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4819(Object obj) {
        if (C0487.m9496() <= 0) {
            return ((zzfc.zzd) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static o m4820(Object obj) {
        if (C0201.m3855() <= 0) {
            return ((d1) obj).f8822c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4821() {
        if (C0169.m3245() > 0) {
            return "Ola & Uber auto-accept engine ready at maximum speed.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m4822(Object obj) {
        if (C0212.m4051() >= 0) {
            return ((q3) obj).f9405l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4823(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4824(Object obj, float f10, float f11) {
        if (C0178.m3402() >= 0) {
            ((Path) obj).offset(f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m4825(int i10, Object obj, Object obj2) {
        if (C0271.m5222() < 0) {
            return Log.println(i10, (String) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡ۟, reason: not valid java name and contains not printable characters */
    public static int m4826(Object obj) {
        if (C0337.m6638() <= 0) {
            return ((i3) obj).f9041r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static x2 m4827(Object obj) {
        if (C0423.m8307() >= 0) {
            return ((i3) obj).f9031a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static n1 m4828() {
        if (C0294.m5663() >= 0) {
            return n2.f9266a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4829(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static f m4830(Object obj) {
        if (C0135.m2608() <= 0) {
            return ((e) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static t2 m4831(Object obj) {
        if (C0277.m5361() <= 0) {
            return ((c2) obj).f5638c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4832() {
        return (-235) ^ C0061.f81;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4833(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
