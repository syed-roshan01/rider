package j5;

import a2.C0005;
import a6.C0007;
import aa.f;
import android.graphics.Bitmap;
import androidx.appcompat.widget.C0020;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.C0128;
import com.google.firebase.provider.C0194;
import dagger.hilt.internal.C0253;
import f0.c2;
import f0.u1;
import f5.e0;
import h0.h;
import h7.C0312;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Map;
import k0.s4;
import k0.v4;
import k6.d4;
import k6.d5;
import k6.p7;
import k6.u7;
import k6.x;
import k6.x3;
import k6.x7;
import k6.z4;
import l0.q;
import m0.q2;
import m0.w1;
import n7.C0365;
import q0.C0383;
import q2.C0385;
import q9.C0392;
import r6.C0402;
import t2.C0424;
import v5.C0446;
import w2.C0459;
import w5.C0463;
import z.C0482;

/* JADX INFO: renamed from: j5.۟ۢۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0328 {

    /* JADX INFO: renamed from: ۟ۦۥۦۣ, reason: not valid java name and contains not printable characters */
    public static int f475 = -811;

    /* JADX INFO: renamed from: ۟۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6317(Object obj) {
        if (C0482.m9373() < 0) {
            return u7.l0((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m6319() {
        return (-925) ^ C0194.f218;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static f m6320() {
        if (C0385.m7527() < 0) {
            return f.f1351i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static float m6321() {
        if (C0312.m6027() < 0) {
            return q.f11115c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static w1 m6322(Object obj) {
        if (C0365.m7147() <= 0) {
            return ((c2) obj).f5637b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m6323(Object obj) {
        if (C0253.m4832() <= 0) {
            return ((Bitmap) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۢ, reason: not valid java name and contains not printable characters */
    public static int m6324(Object obj, Object obj2, int i10) {
        if (C0459.m8930() >= 0) {
            return ((q2) obj).y((int[]) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6325(Object obj) {
        if (C0402.m7881() < 0) {
            return ((h) obj).e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6326(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m6327(Object obj) {
        if (C0463.m9013() < 0) {
            return ((e0) obj).f6250b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۨ, reason: not valid java name and contains not printable characters */
    public static z4 m6328(Object obj) {
        if (C0005.m104() > 0) {
            return ((d5) obj).f9976d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static long m6329(Object obj) {
        if (C0446.m8692() < 0) {
            return ((u1) obj).f5967c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m6330(Object obj) {
        if (C0383.m7487() <= 0) {
            return ((x7) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m6331(Object obj) {
        if (C0007.m154() <= 0) {
            return ((s4) obj).f9462e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int m6332(Object obj) {
        if (C0392.m7657() >= 0) {
            return ((v4) obj).f9581v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۦ, reason: not valid java name and contains not printable characters */
    public static d4 m6333(Object obj) {
        if (C0128.m2475() <= 0) {
            return ((p7) obj).zzj();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static Map m6334() {
        if (C0424.m8307() > 0) {
            return Collections.emptyMap();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۢ, reason: contains not printable characters */
    public static int m6335(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۨۤۡ, reason: not valid java name and contains not printable characters */
    public static x3 m6336() {
        if (C0020.m399() < 0) {
            return x.B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6318(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
