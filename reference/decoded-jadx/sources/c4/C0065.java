package c4;

import android.database.Cursor;
import android.os.Handler;
import androidx.compose.ui.platform.C0038;
import androidx.profileinstaller.C0045;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.remoteconfig.interop.C0196;
import d1.C0213;
import d5.m;
import d5.x;
import d5.y;
import e7.C0264;
import f0.C0272;
import f0.i0;
import j6.C0328;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.j0;
import k0.m4;
import k0.q1;
import k6.o0;
import k6.t;
import m0.g1;
import r6.C0401;
import t3.C0424;
import v0.C0442;
import v0.C0443;
import z2.C0484;

/* JADX INFO: renamed from: c4.۟ۦۧۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0065 {

    /* JADX INFO: renamed from: ۟ۥۢۦۨ, reason: not valid java name and contains not printable characters */
    public static int f85 = 668;

    /* JADX INFO: renamed from: ۟۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static long m1247(Object obj) {
        if (C0329.m6367() >= 0) {
            return ((m4) obj).E;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static c9.e m1248(Object obj) {
        if (C0443.m8654() < 0) {
            return ((q1) obj).f9380o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static k7.a m1249(Object obj) {
        if (C0196.m3762() <= 0) {
            return k7.a.a((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1250(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1251(Object obj) {
        if (C0147.m2805() < 0) {
            return ((o0) obj).f10247a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۦ, reason: not valid java name and contains not printable characters */
    public static m m1252() {
        if (C0045.m874() > 0) {
            return m.f4668x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۡ, reason: not valid java name and contains not printable characters */
    public static long m1253(Object obj) {
        if (C0264.m5062() < 0) {
            return ((m4) obj).f9238r;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m1254() {
        if (C0038.m750() < 0) {
            return "time_remaining";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m1255(Object obj, Object obj2) {
        if (C0442.m8630() < 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m1256(Object obj) {
        if (C0213.m4083() <= 0) {
            return ((t) obj).f10366b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1257() {
        return (-271) ^ C0272.f388;
    }

    /* JADX INFO: renamed from: ۡۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m1258(Object obj) {
        if (C0168.m3229() > 0) {
            return ((j0) obj).f9063a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static g1 m1260(Object obj) {
        if (C0126.m2434() > 0) {
            return ((x) obj).f4838n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۠۠, reason: contains not printable characters */
    public static u8.e m1261(Object obj, Object obj2, Object obj3) {
        if (C0484.m9436() <= 0) {
            return ((i0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۤ, reason: contains not printable characters */
    public static String m1262(Object obj, int i10) {
        if (C0328.m6350() >= 0) {
            return ((Cursor) obj).getString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥۡ, reason: contains not printable characters */
    public static void m1263(Object obj, Object obj2) {
        if (C0424.m8322() >= 0) {
            ((Handler) obj).removeCallbacks((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1264(Object obj) {
        if (C0401.m7881() <= 0) {
            return ((y) obj).f4853c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۥ, reason: not valid java name and contains not printable characters */
    public static int m1265(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1259(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
