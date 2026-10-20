package d7;

import a2.c0;
import androidx.annotation.C0019;
import androidx.compose.ui.layout.C0035;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzoi;
import f6.C0277;
import java.io.ByteArrayOutputStream;
import java.util.TreeMap;
import t.o1;
import w5.C0463;

/* JADX INFO: renamed from: d7.۟ۢۧۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0219 {

    /* JADX INFO: renamed from: ۣ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int f299 = 258;

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4232(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4234() {
        if (C0035.m690() <= 0) {
            return zzoi.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۢ, reason: not valid java name and contains not printable characters */
    public static TreeMap m4235(Object obj) {
        if (C0463.m9033() > 0) {
            return ((y3.c) obj).f16893i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۤ, reason: not valid java name and contains not printable characters */
    public static c0 m4236(int i10, int i11, long j10, long j11, long j12, long j13, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0075.m1631() <= 0) {
            return c0.a(i10, i11, j10, j11, j12, j13, (a2.t) obj, (c0) obj2, (f2.m) obj3, (f2.l) obj4, (l2.g) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m4237() {
        return (-846) ^ C0019.f39;
    }

    /* JADX INFO: renamed from: ۦۡۨۤ, reason: contains not printable characters */
    public static String m4238(String str) {
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

    /* JADX INFO: renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4239(Object obj, Object obj2, Object obj3) {
        if (C0277.m5361() <= 0) {
            return ((o1) obj).b(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4233(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
