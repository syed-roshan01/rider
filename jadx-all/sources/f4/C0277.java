package f4;

import a.C0002;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.profileinstaller.C0046;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.tasks.C0106;
import g4.C0290;
import ga.C0296;
import i6.C0321;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Semaphore;
import k0.r0;
import k0.v3;
import k6.z4;
import n1.C0363;
import q1.C0384;
import s7.C0415;
import w2.C0457;
import x7.C0472;
import y6.C0477;
import z7.C0491;

/* JADX INFO: renamed from: f4.ۦۣ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0277 {

    /* JADX INFO: renamed from: ۦۢ۠, reason: contains not printable characters */
    public static int f392 = -122;

    /* JADX INFO: renamed from: ۟۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Context m5311(Object obj) {
        if (C0472.m9190() <= 0) {
            return ((y) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Semaphore m5312(Object obj) {
        if (C0477.m9298() < 0) {
            return ((z4) obj).f10613j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static long m5314(long j10) {
        if (C0046.m893() > 0) {
            return z6.a.n(j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5315() {
        return 61 ^ C0415.f685;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m5316(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (C0290.m5580() < 0) {
            return ((c9.h) obj).c(obj2, obj3, obj4, obj5, obj6, obj7, (Integer) obj8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static k0.y m5317(Object obj, long j10, long j11, long j12, long j13) {
        if (C0491.m9552() >= 0) {
            return ((k0.y) obj).a(j10, j11, j12, j13);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5318(int i10) {
        if (C0457.m8890() > 0) {
            return String.valueOf(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5319(Object obj) {
        if (C0321.m6200() >= 0) {
            return ((v3) obj).f9565q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5320(Object obj, Object obj2) {
        if (C0090.m1920() > 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۢ, reason: not valid java name and contains not printable characters */
    public static c9.c m5321(Object obj) {
        if (C0002.m46() <= 0) {
            return ((f0.h) obj).f5716f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static u0.b m5322() {
        if (C0384.m7523() < 0) {
            return r0.f9417a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static y.f m5323() {
        if (C0491.m9552() >= 0) {
            return y.k.f16609e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5324(Object obj, Object obj2, int i10) {
        if (C0296.m5679() >= 0) {
            return Settings.Global.getInt((ContentResolver) obj, (String) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static long m5325() {
        if (C0363.m7099() <= 0) {
            return e5.a.f5125a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۢۥ, reason: contains not printable characters */
    public static int m5326(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static boolean m5327(Object obj) {
        if (C0106.m2067() >= 0) {
            return ((f0.t) obj).f5914v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m5328(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m5313(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
