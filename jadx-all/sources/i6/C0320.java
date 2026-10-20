package i6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.input.key.C0033;
import androidx.compose.ui.platform.C0038;
import b4.C0052;
import b4.h;
import c1.C0058;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.l;
import d5.p0;
import d5.s;
import h1.C0301;
import i1.f;
import java.io.ByteArrayOutputStream;
import k6.f5;
import k6.x;
import k6.x3;
import k6.y5;
import m5.C0356;
import o7.d0;
import q9.C0392;
import x7.C0473;

/* JADX INFO: renamed from: i6.۟۟ۦۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0320 {

    /* JADX INFO: renamed from: ۠ۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int f467 = 204;

    /* JADX INFO: renamed from: ۟۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static String m6178(String str) {
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

    /* JADX INFO: renamed from: ۟۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6179(Object obj) {
        if (C0058.m1106() > 0) {
            return ((zzfi.zzj) obj).zzbb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static f m6180() {
        if (C0203.m3894() >= 0) {
            return d0.f12589r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static int m6181() {
        return (-454) ^ C0038.f58;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6182(Object obj) {
        if (C0473.m9193() <= 0) {
            return ((zzfi.zzj) obj).zzak();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static x3 m6183() {
        if (C0052.m1013() > 0) {
            return x.f10489j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧ۠, reason: not valid java name and contains not printable characters */
    public static Context m6184(Object obj) {
        if (C0301.m5773() <= 0) {
            return ((f5) obj).f10024a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m6185(Object obj, Object obj2) {
        if (C0026.m508() >= 0) {
            return ((p0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۢ, reason: not valid java name and contains not printable characters */
    public static u0.b m6186() {
        if (C0091.m1940() <= 0) {
            return s.f4762f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤۨ, reason: not valid java name and contains not printable characters */
    public static l m6187() {
        if (C0033.m652() <= 0) {
            return l.f4640x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m6188(Object obj) {
        if (C0356.m6968() >= 0) {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m6189(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static h m6190() {
        if (C0392.m7657() > 0) {
            return h.f2711c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6191(Object obj, long j10, boolean z10) {
        if (C0150.m2892() <= 0) {
            ((y5) obj).v(j10, z10);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m6192(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
