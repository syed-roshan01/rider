package y6;

import a.C0002;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.draw.C0029;
import c1.C0061;
import com.auto.accept.data.model.SupportedApp;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.ktx.C0179;
import d1.C0213;
import d5.m;
import dagger.hilt.android.lifecycle.C0236;
import e7.C0264;
import e8.l1;
import f0.f;
import h8.k;
import i6.C0319;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.a5;
import k0.b5;
import k0.l0;
import k0.r4;
import k0.u1;
import k6.c4;
import k6.f5;
import k6.x6;
import k6.y5;
import l8.C0345;
import la.C0348;
import m7.C0356;
import o4.C0369;
import t1.c1;
import v0.C0440;
import v0.C0443;

/* JADX INFO: renamed from: y6.۟ۢ۟ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0476 {

    /* JADX INFO: renamed from: ۣ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int f750 = 591;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9285(Object obj) {
        if (C0348.m6818() <= 0) {
            return ((f5) obj).f10047x;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m9286(Object obj) {
        if (C0213.m4083() <= 0) {
            return ((x6) obj).f10539d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static List m9287() {
        if (C0356.m6984() > 0) {
            return SupportedApp.m1420();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m9288() {
        if (C0021.m417() > 0) {
            return "Shizuku service is running. Tap below to pair & authorize.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9289(Object obj) {
        if (C0440.m8597() >= 0) {
            return ((b5) obj).A;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9290(Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if (C0345.m6759() < 0) {
            return ((u1) obj).g((c1) obj2, (List) obj3, i10, (l0) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m9291() {
        if (C0154.m2958() < 0) {
            return f.f5693a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9292() {
        if (C0443.m8654() <= 0) {
            return "service_stopped";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ۠, reason: not valid java name and contains not printable characters */
    public static a5 m9293(Object obj) {
        if (C0179.m3417() >= 0) {
            return ((r4) obj).f9435t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m9294(Object obj, Object obj2, Object obj3) {
        if (C0002.m46() < 0) {
            k.l((k) obj, (l1) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m9295(String str) {
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

    /* JADX INFO: renamed from: ۠ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static c4 m9296(Object obj) {
        if (C0319.m6181() >= 0) {
            return ((f5) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9297(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int m9298() {
        return (-172) ^ C0264.f344;
    }

    /* JADX INFO: renamed from: ۢۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m9299() {
        if (C0061.m1161() < 0) {
            return "filter_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m9300() {
        if (C0369.m7254() >= 0) {
            return "day";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static m m9302() {
        if (C0029.m568() < 0) {
            return m.f4656e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m9303(Object obj) {
        if (C0236.m4549() <= 0) {
            return ((y5) obj).f10573h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m9301(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
