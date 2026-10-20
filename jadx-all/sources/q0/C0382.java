package q0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.semantics.C0039;
import c1.C0058;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.abt.C0113;
import com.google.protobuf.n;
import d5.b0;
import d5.i0;
import dagger.hilt.C0256;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.codegen.C0243;
import e9.C0267;
import f0.t1;
import java.io.ByteArrayOutputStream;
import k0.g3;
import k6.j6;
import k6.x7;
import m0.l3;
import p4.C0377;
import p9.z;
import s8.C0418;
import u3.C0435;
import z3.C0488;

/* JADX INFO: renamed from: q0.۟ۧۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0382 {

    /* JADX INFO: renamed from: ۢۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int f652 = -20;

    /* JADX INFO: renamed from: ۟۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7469(Object obj) {
        if (C0377.m7371() >= 0) {
            return ((t1) obj).f5944d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Object[] m7470(Object obj, Object obj2) {
        if (C0113.m2182() <= 0) {
            return ((Parcel) obj).createTypedArray((Parcelable.Creator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m7471(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m7472(Object obj) {
        if (C0418.m8208() > 0) {
            return ((j6) obj).f10127b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7473(Object obj) {
        if (C0243.m4660() < 0) {
            return ((g3) obj).f8948d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7475(Object obj) {
        if (C0039.m764() > 0) {
            return ((i0) obj).f4564c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۨ, reason: not valid java name and contains not printable characters */
    public static long m7476(Object obj) {
        if (C0267.m5099() <= 0) {
            return ((k0.k) obj).f9087o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static String m7477() {
        if (C0239.m4587() < 0) {
            return "_npa";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7478(Object obj) {
        if (C0488.m9496() < 0) {
            return ((x7) obj).f10558w;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۨۦ, reason: not valid java name and contains not printable characters */
    public static l3 m7479(Object obj) {
        if (C0058.m1106() > 0) {
            return ((b0) obj).f4408d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static z m7480(Object obj) {
        if (C0256.m4876() < 0) {
            return ((MainViewModel) obj).U;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦۤ, reason: contains not printable characters */
    public static int m7481() {
        return 666 ^ C0085.f119;
    }

    /* JADX INFO: renamed from: ۦۨۧۥ, reason: contains not printable characters */
    public static String m7482(String str) {
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

    /* JADX INFO: renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7483(Object obj) {
        if (C0435.m8498() < 0) {
            return ((n) obj).s();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m7474(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
