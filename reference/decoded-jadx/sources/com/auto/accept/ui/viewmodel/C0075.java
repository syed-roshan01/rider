package com.auto.accept.ui.viewmodel;

import a2.C0004;
import android.os.Parcel;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.a;
import androidx.lifecycle.C0043;
import b8.C0055;
import b9.b;
import c9.e;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import d.C0210;
import f0.C0271;
import f0.j0;
import f0.k1;
import h3.C0302;
import java.io.ByteArrayOutputStream;
import k0.k0;
import k0.p1;
import k6.e6;
import k6.k5;
import k6.x;
import k6.x3;
import m0.m3;
import n9.C0366;
import q6.C0386;
import r1.s;
import t8.C0426;
import x0.C0466;
import z7.C0489;

/* JADX INFO: renamed from: com.auto.accept.ui.viewmodel.ۣۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0075 {

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f109 = 257;

    /* JADX INFO: renamed from: ۟۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1627(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1628(Object obj) {
        if (C0302.m5836() > 0) {
            return a.b((KeyEvent) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m1629(int i10, int i11, int i12, Object obj, Object obj2) {
        if (C0210.m4028() <= 0) {
            b.G(i10, i11, i12, (int[]) obj, (int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1630(Object obj) {
        if (C0147.m2805() <= 0) {
            return ((s) obj).L();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦ۟, reason: not valid java name and contains not printable characters */
    public static int m1631() {
        return 52 ^ C0004.f1062;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static x3 m1632() {
        if (C0466.m9086() > 0) {
            return x.f10510t0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۡ, reason: not valid java name and contains not printable characters */
    public static m3 m1633() {
        if (C0090.m1920() > 0) {
            return k0.f9092b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m1634(Object obj, int i10) {
        if (C0489.m9528() > 0) {
            ((Parcel) obj).setDataPosition(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static k1 m1635(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((j0) obj).f5795c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m1637(Object obj) {
        if (C0043.m833() > 0) {
            return ((a5.s) obj).f1301b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨۢ, reason: not valid java name and contains not printable characters */
    public static e m1638(Object obj) {
        if (C0055.m1056() >= 0) {
            return ((p1) obj).f9345s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m1639(Object obj) {
        if (C0386.m7564() >= 0) {
            return ((e6) obj).f10005b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۢ, reason: not valid java name and contains not printable characters */
    public static x3 m1640() {
        if (C0366.m7189() >= 0) {
            return x.f10503q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1641(Object obj) {
        if (C0271.m5222() <= 0) {
            return ((k5) obj).f10156c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1642() {
        if (C0426.m8356() < 0) {
            return "firebase_instance_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1643() {
        if (C0114.m2205() <= 0) {
            return "Kannada";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1644(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1636(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
