package com.google.android.gms.common.util;

import a2.x;
import androidx.annotation.C0018;
import androidx.annotation.C0019;
import androidx.preference.C0044;
import androidx.startup.C0047;
import c1.C0060;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.C0191;
import com.google.firebase.platforminfo.C0193;
import dagger.hilt.C0256;
import dagger.hilt.components.C0245;
import g5.c;
import i2.d;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import k0.w3;
import k6.a5;
import k6.k;
import k6.v7;
import l0.m;
import l2.a;
import m9.C0360;
import q6.C0388;
import u3.C0435;
import v.C0440;

/* JADX INFO: renamed from: com.google.android.gms.common.util.۟ۧۤ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0085 {

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static int f119 = 153;

    /* JADX INFO: renamed from: ۟۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m1811(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1812(Object obj, long j10) {
        if (C0435.m8498() < 0) {
            ((a5) obj).a(j10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int m1813(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1815(Object obj) {
        if (C0440.m8582() <= 0) {
            return ((w3) obj).f9616e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1816(Object obj, Object obj2) {
        if (C0061.m1161() <= 0) {
            return ((k) obj).R((v7) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static a m1817(Object obj) {
        if (C0047.m904() <= 0) {
            return ((x) obj).f1039i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m1818() {
        if (C0245.m4685() >= 0) {
            return " and origin=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1819(Object obj, Object obj2) {
        if (C0019.m375() < 0) {
            return ((Map) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1820(Object obj) {
        if (C0193.m3691() <= 0) {
            return ((zzew.zze) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static d m1821(Object obj) {
        if (C0256.m4876() < 0) {
            return ((a2.a) obj).f886a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨۥ, reason: not valid java name and contains not printable characters */
    public static float m1822() {
        if (C0388.m7585() >= 0) {
            return m.f11096c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static c m1823() {
        if (C0191.m3643() >= 0) {
            return c.f6620c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static Comparator m1824(Object obj, Object obj2) {
        if (C0360.m7059() < 0) {
            return Comparator.comparing((Function) obj, (Comparator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1825() {
        return (-894) ^ C0018.f38;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m1826(Object obj) {
        if (C0044.m860() > 0) {
            return ((zzfc.zzd) obj).zzn();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۤ, reason: not valid java name and contains not printable characters */
    public static CollectionReference m1827(Object obj, Object obj2) {
        if (C0060.m1148() >= 0) {
            return ((FirebaseFirestore) obj).collection((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1814(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
