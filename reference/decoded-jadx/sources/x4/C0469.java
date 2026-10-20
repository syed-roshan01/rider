package x4;

import android.database.sqlite.SQLiteDatabase;
import androidx.compose.foundation.layout.C0022;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firebase_analytics.C0144;
import d5.n0;
import d5.r1;
import dagger.hilt.android.components.C0228;
import dagger.hilt.components.C0244;
import e9.C0266;
import f0.d;
import h5.C0308;
import i.C0315;
import j4.l;
import java.io.ByteArrayOutputStream;
import k2.C0333;
import k6.b4;
import k6.u6;
import k6.u7;
import k6.x7;
import l6.C0344;
import m0.m;
import p3.C0375;
import p9.o0;
import q8.i;
import u.C0429;
import v6.C0446;
import y.f;
import y.k;
import y3.e;
import z8.C0492;

/* JADX INFO: renamed from: x4.ۣۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0469 {

    /* JADX INFO: renamed from: ۟ۤۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int f740 = 203;

    /* JADX INFO: renamed from: ۟۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m9132(Object obj) {
        if (C0022.m444() <= 0) {
            return ((i) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static int m9133(int i10, int i11, int i12) {
        if (C0266.m5099() < 0) {
            return e.n0(i10, i11, i12);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static l m9134(Object obj, Object obj2) {
        if (C0333.m6472() <= 0) {
            return e.B0((String) obj, (m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9135(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9136(Object obj) {
        if (C0315.m6111() >= 0) {
            return ((u7) obj).n0();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m9137(Object obj) {
        if (C0123.m2379() > 0) {
            return ((n0) obj).f4693c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static long m9138(Object obj) {
        if (C0344.m6746() > 0) {
            return ((d) obj).f5659b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9140(Object obj) {
        if (C0429.m8415() > 0) {
            return ((r1) obj).f4754c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9141(String str) {
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

    /* JADX INFO: renamed from: ۠ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9142(Object obj) {
        if (C0144.m2767() >= 0) {
            return ((zzfi.zzj) obj).zzaw();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m9143() {
        return (-788) ^ C0228.f308;
    }

    /* JADX INFO: renamed from: ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static x7 m9144(Object obj) {
        if (C0244.m4685() >= 0) {
            return ((u6) obj).f10421b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠۟, reason: not valid java name and contains not printable characters */
    public static Object m9145(Object obj) {
        if (C0446.m8696() >= 0) {
            return ((o0) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9146(Object obj, int i10, Object obj2, int i11, int i12, boolean z10) {
        if (C0308.m5962() >= 0) {
            return l9.i.Z0((CharSequence) obj, i10, (CharSequence) obj2, i11, i12, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۡ, reason: contains not printable characters */
    public static SQLiteDatabase m9147(Object obj) {
        if (C0375.m7362() >= 0) {
            return ((b4) obj).z();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۢ, reason: contains not printable characters */
    public static f m9148() {
        if (C0492.m9578() >= 0) {
            return k.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m9139(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
