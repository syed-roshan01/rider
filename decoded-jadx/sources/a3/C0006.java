package a3;

import a2.C0005;
import a5.z;
import android.os.Bundle;
import androidx.activity.l0;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.remoteconfig.C0201;
import d1.C0214;
import d5.s;
import e1.C0257;
import f0.o0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import k0.l4;
import k0.m2;
import l0.p;
import p0.C0373;
import q0.C0382;
import rikka.shizuku.C0406;
import u8.e;
import v0.C0443;

/* JADX INFO: renamed from: a3.۟ۢۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0006 {

    /* JADX INFO: renamed from: ۢۤۧ, reason: collision with root package name */
    public static int f1064 = 238;

    /* JADX INFO: renamed from: ۟۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static l0 m110() {
        if (C0005.m104() >= 0) {
            return l0.f1406b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m111(Object obj, Object obj2, Object obj3) {
        if (C0443.m8654() < 0) {
            return ((z) obj).c((String) obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int m112() {
        return (-286) ^ C0214.f238;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static o0 m113() {
        if (C0406.m7977() < 0) {
            return o0.f5836a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m115(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m116() {
        if (C0201.m3855() <= 0) {
            return p.f11107b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static Integer m117(Object obj) {
        if (C0257.m4918() >= 0) {
            return ((m2) obj).f9220u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static l4 m118() {
        if (C0382.m7487() < 0) {
            return l4.f9187b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static u0.b m119() {
        if (C0153.m2938() <= 0) {
            return s.f4766j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۨۨ, reason: not valid java name and contains not printable characters */
    public static void m120(Object obj, Object obj2, Object obj3) {
        if (C0121.m2336() < 0) {
            ((Bundle) obj).putBundle((String) obj2, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int[] m121(Object obj, int i10) {
        if (C0373.m7322() <= 0) {
            return y3.e.q0((ByteArrayInputStream) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥ۠, reason: contains not printable characters */
    public static String m122(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m114(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
