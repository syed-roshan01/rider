package androidx.preference;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.os.Parcel;
import android.text.Layout;
import androidx.compose.ui.semantics.C0039;
import c1.C0058;
import c9.e;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.common.util.C0086;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.firestore.model.C0159;
import d7.t;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import f0.b;
import g1.k;
import h6.C0310;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.l0;
import k0.m4;
import k0.n1;
import k0.q3;
import k0.r4;
import k0.x4;
import k6.f5;
import k6.r;
import m0.g1;
import m0.m;
import o8.a;
import q9.C0392;
import r7.C0405;
import t1.c1;
import t2.C0421;
import w1.C0456;
import z.C0481;

/* JADX INFO: renamed from: androidx.preference.۟ۤۥۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0044 {

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int f64 = 62;

    /* JADX INFO: renamed from: ۟۟ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m848(Object obj) {
        if (C0421.m8263() > 0) {
            return ((b) obj).f5605a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m849(Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if (C0392.m7657() >= 0) {
            return ((x4) obj).f((c1) obj2, (List) obj3, i10, (l0) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m850(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static e m851(Object obj) {
        if (C0111.m2143() >= 0) {
            return ((n1) obj).f9262s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static a m852() {
        if (C0039.m764() >= 0) {
            return o8.b.f12664a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m853(Object obj, long j10) {
        if (C0310.m5971() <= 0) {
            ((Parcel) obj).writeLong(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۢ, reason: not valid java name and contains not printable characters */
    public static e m854(Object obj) {
        if (C0073.m1597() >= 0) {
            return ((r4) obj).f9423a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m856(Object obj, int i10, int i11, Object obj2) {
        if (C0405.m7934() > 0) {
            ((Layout) obj).getSelectionPath(i10, i11, (Path) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static r m857(Object obj) {
        if (C0481.m9354() <= 0) {
            return ((f5) obj).f10045v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m858(Object obj, Object obj2, Object obj3) {
        if (C0159.m3030() < 0) {
            ((SQLiteDatabase) obj).execSQL((String) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m859(Object obj) {
        if (C0086.m1846() > 0) {
            return ((k) obj).f6505c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m860() {
        return 659 ^ C0320.f467;
    }

    /* JADX INFO: renamed from: ۥۨۢۨ, reason: contains not printable characters */
    public static long m861(Object obj) {
        if (C0232.m4453() < 0) {
            return ((q3) obj).f9406m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static g1 m862(Object obj, Object obj2) {
        if (C0456.m8885() < 0) {
            return t.m0(obj, (m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥۨ, reason: contains not printable characters */
    public static long m863(Object obj) {
        if (C0058.m1106() >= 0) {
            return ((m4) obj).D;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨۦۣ, reason: not valid java name and contains not printable characters */
    public static String m864(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥۦۧ, reason: not valid java name and contains not printable characters */
    public static String m855(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
