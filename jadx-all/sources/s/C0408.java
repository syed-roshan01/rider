package s;

import android.accessibilityservice.AccessibilityService;
import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.foundation.C0026;
import androidx.profileinstaller.C0045;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.auth.ktx.C0132;
import d1.C0215;
import f6.C0279;
import h.C0297;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import k0.b5;
import k1.C0333;
import k6.a5;
import k6.p6;
import k6.x4;
import p0.C0374;
import r.C0393;
import s7.C0416;
import t3.C0425;
import w2.C0458;

/* JADX INFO: renamed from: s.ۣۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0408 {

    /* JADX INFO: renamed from: ۟ۥ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static int f678 = -494;

    /* JADX INFO: renamed from: ۟۠ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m7984(Object obj) {
        if (C0279.m5394() > 0) {
            return ((AccessibilityService) obj).getRootInActiveWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static long m7985(Object obj) {
        if (C0374.m7322() < 0) {
            return ((a5) obj).E;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m7986(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m7987() {
        if (C0045.m874() >= 0) {
            return y9.b.f17000a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7989() {
        return 25 ^ C0215.f238;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7990(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m7991(Object obj) {
        if (C0458.m8901() < 0) {
            ((d5.h0) obj).m4177invoke();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۥ, reason: not valid java name and contains not printable characters */
    public static a2.c0 m7992(Object obj) {
        if (C0297.m5709() < 0) {
            return ((b5) obj).f8767x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static g2.a0 m7993(Object obj) {
        if (C0416.m8144() > 0) {
            return ((g2.j) obj).f6569a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m7994(Object obj, Object obj2, Object obj3) {
        if (C0393.m7675() <= 0) {
            return ((a5.j) obj).d((String) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۧ, reason: not valid java name and contains not printable characters */
    public static f2.l m7995(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((b5) obj).f8756f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ, reason: not valid java name and contains not printable characters */
    public static int[] m7996() {
        if (C0425.m8322() >= 0) {
            return x4.f10534b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m7997(Object obj, Object obj2) {
        if (C0091.m1940() <= 0) {
            return ((Constructor) obj).newInstance((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۦ, reason: not valid java name and contains not printable characters */
    public static String m7998() {
        if (C0132.m2543() <= 0) {
            return "queue";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡ۟, reason: not valid java name and contains not printable characters */
    public static u8.e m7999(Object obj, Object obj2, Object obj3) {
        if (C0026.m508() >= 0) {
            return ((f5.i) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢۡ, reason: contains not printable characters */
    public static u8.e m8000(Object obj, Object obj2, Object obj3) {
        if (C0305.m5882() < 0) {
            return ((f5.o) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Activity m8001(Object obj) {
        if (C0333.m6454() <= 0) {
            return ((p6) obj).f10280g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7988(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
