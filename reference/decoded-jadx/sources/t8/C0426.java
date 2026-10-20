package t8;

import a.C0001;
import a2.a0;
import a2.c0;
import a5.f;
import a5.j;
import android.app.job.JobScheduler;
import b.C0049;
import c9.c;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import dagger.hilt.migration.C0254;
import f0.a2;
import i9.g;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.c3;
import k0.e5;
import k0.o4;
import k3.C0334;
import k6.p4;
import l8.C0346;
import p7.C0378;
import r1.C0393;
import r8.n;
import s7.C0415;
import u.k1;
import v5.C0444;
import v8.C0450;

/* JADX INFO: renamed from: t8.ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0426 {

    /* JADX INFO: renamed from: ۟۠ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int f697 = 377;

    /* JADX INFO: renamed from: ۟۠ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static g m8352(int i10, int i11) {
        if (C0177.m3380() > 0) {
            return z6.a.s0(i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m8353(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static c0 m8354(Object obj) {
        if (C0346.m6774() >= 0) {
            return ((e5) obj).f8890k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m8355(Object obj) {
        if (C0001.m35() <= 0) {
            return ((f5.c0) obj).f6241c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8356() {
        return (-704) ^ C0393.f664;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static float m8357(Object obj, int i10) {
        if (C0450.m8792() <= 0) {
            return ((a0) obj).h(i10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨ۟, reason: not valid java name and contains not printable characters */
    public static int m8358(Object obj) {
        if (C0118.m2274() < 0) {
            return ((c3) obj).f8795d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۥ, reason: not valid java name and contains not printable characters */
    public static j m8359(Object obj) {
        if (C0171.m3272() <= 0) {
            return ((f) obj).f1251b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8360(Object obj, Object obj2) {
        if (C0334.m6491() > 0) {
            n.C0((ArrayList) obj, (c) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static long m8361() {
        if (C0161.m3081() < 0) {
            return d1.f.f4344b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m8362(Object obj, long j10) {
        if (C0254.m4866() < 0) {
            ((p4) obj).b(j10);
        }
    }

    /* JADX INFO: renamed from: ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static void m8364(Object obj, int i10) {
        if (C0444.m8673() > 0) {
            ((JobScheduler) obj).cancel(i10);
        }
    }

    /* JADX INFO: renamed from: ۤۡۨۧ, reason: not valid java name and contains not printable characters */
    public static long m8365(Object obj) {
        if (C0049.m945() > 0) {
            return ((o4) obj).f9324b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۟, reason: contains not printable characters */
    public static String m8366(String str) {
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

    /* JADX INFO: renamed from: ۦۤۥۨ, reason: contains not printable characters */
    public static String m8367() {
        if (C0113.m2182() < 0) {
            return "Quick Setup";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static StringBuilder m8368(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0415.m8144() >= 0) {
            return k1.c((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۨ, reason: not valid java name and contains not printable characters */
    public static m0.k1 m8369(Object obj) {
        if (C0378.m7420() > 0) {
            return ((a2) obj).f5600a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m8363(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
