package e2;

import a2.p;
import a2.z;
import android.content.Context;
import androidx.activity.C0017;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.iid.C0170;
import d.C0211;
import d5.g2;
import e1.C0260;
import ea.C0269;
import f0.z0;
import g7.C0293;
import java.io.ByteArrayOutputStream;
import java.io.File;
import k3.C0335;
import k6.x3;
import m0.m;
import m0.q;
import s2.C0412;
import u1.t2;
import u8.C0439;
import x7.C0473;
import y3.e;

/* JADX INFO: renamed from: e2.۟ۤۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0262 {

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int f341 = -870;

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static long m4988(Object obj) {
        if (C0269.m5123() >= 0) {
            return ((p) obj).f959c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4989(Object obj) {
        if (C0105.m2045() >= 0) {
            return ((g2) obj).f4533e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4990(Object obj, int i10) {
        if (C0293.m5634() <= 0) {
            ((q) obj).Z(i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4991() {
        return (-29) ^ C0473.f743;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4992(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۨۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4993() {
        if (C0412.m8066() <= 0) {
            return "filter_by_location";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4994(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Object m4995(Object obj, Object obj2) {
        if (C0261.m4984() > 0) {
            return ((x3) obj).a(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۦ, reason: not valid java name and contains not printable characters */
    public static t2 m4996(Object obj) {
        if (C0335.m6491() >= 0) {
            return ((z0) obj).f6014a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4997() {
        if (C0017.m332() <= 0) {
            return "Error storing user property. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4998() {
        if (C0170.m3247() < 0) {
            return "min_fare";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۦ, reason: contains not printable characters */
    public static File m4999(Object obj) {
        if (C0211.m4028() <= 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۨۧ, reason: contains not printable characters */
    public static void m5000(int i10, Object obj, Object obj2, int i11) {
        if (C0260.m4959() < 0) {
            e.w(i10, (c9.a) obj, (m) obj2, i11);
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۢ, reason: contains not printable characters */
    public static int m5002(Object obj) {
        if (C0439.m8564() >= 0) {
            return ((z) obj).f1057f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۥۧ, reason: contains not printable characters */
    public static String m5001(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
