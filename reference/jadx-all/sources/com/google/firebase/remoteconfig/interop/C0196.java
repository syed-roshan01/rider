package com.google.firebase.remoteconfig.interop;

import a5.k;
import a7.a;
import android.os.Bundle;
import androidx.compose.ui.draw.C0029;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.iid.C0170;
import com.google.firebase.platforminfo.C0193;
import d1.C0213;
import d5.g2;
import d5.z1;
import d7.C0220;
import dagger.hilt.android.components.C0230;
import dagger.hilt.android.migration.C0239;
import f0.c2;
import g2.C0287;
import g2.h0;
import g5.C0292;
import i5.C0319;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.util.BitSet;
import java.util.HashSet;
import java.util.regex.Pattern;
import k0.b1;
import k0.t;
import k0.v4;
import k6.q7;
import k6.z3;
import m0.d;
import m0.q;
import q2.C0385;
import r7.C0405;
import s0.C0411;
import t.u0;
import y3.b;
import z0.C0483;
import z7.C0491;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.interop.۠ۧۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0196 {

    /* JADX INFO: renamed from: ۟ۤۦۥۤ, reason: not valid java name and contains not printable characters */
    public static int f220 = 713;

    /* JADX INFO: renamed from: ۟ۡۢۦ۠, reason: not valid java name and contains not printable characters */
    public static float m3748(Object obj) {
        if (C0405.m7934() >= 0) {
            return ((v4) obj).f9576q;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3749(Object obj) {
        if (C0292.m5605() < 0) {
            return ((z1) obj).f4874a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3750(Object obj) {
        if (C0193.m3691() < 0) {
            return ((k) obj).f1278b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static h0 m3751(Object obj) {
        if (C0230.m4421() < 0) {
            return ((c2) obj).f5640e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3752(Object obj) {
        if (C0213.m4051() > 0) {
            return ((g2) obj).f4531c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3753(Object obj, Object obj2) {
        if (C0239.m4587() < 0) {
            ((t) obj).a((u0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m3754(Object obj, Object obj2) {
        if (C0081.m1735() >= 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3755(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0220.m4237() > 0) {
            ((q7) obj).zza((String) obj2, (String) obj3, (Bundle) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m3756(Object obj) {
        if (C0117.m2257() > 0) {
            return ((BitSet) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m3757(Object obj) {
        if (C0287.m5522() >= 0) {
            return ((z3) obj).f10601m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m3758(String str) {
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

    /* JADX INFO: renamed from: ۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m3759(Object obj) {
        if (C0491.m9552() > 0) {
            return Pattern.compile((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3760(Object obj) throws IOException {
        if (C0170.m3247() < 0) {
            ((URLConnection) obj).connect();
        }
    }

    /* JADX INFO: renamed from: ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static File m3761(Object obj) {
        if (C0319.m6163() < 0) {
            return ((b) obj).f16880d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3762() {
        return (-252) ^ C0483.f756;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static long m3763(Object obj) {
        if (C0029.m568() <= 0) {
            return ((b1) obj).f8729b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static d m3764(Object obj) {
        if (C0411.m8063() > 0) {
            return ((q) obj).f11630a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۥ, reason: contains not printable characters */
    public static int m3765(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3767(Object obj, long j10) {
        if (C0385.m7527() < 0) {
            return a.l((String) obj, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3766(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
