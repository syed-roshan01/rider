package z2;

import a.C0000;
import a6.C0007;
import a7.C0008;
import androidx.appcompat.widget.C0020;
import c4.C0065;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.abt.C0113;
import com.google.firebase.components.C0135;
import com.google.firebase.iid.C0170;
import dagger.hilt.components.C0245;
import e8.C0266;
import f0.j1;
import f0.r1;
import f4.C0277;
import i1.f;
import java.io.ByteArrayOutputStream;
import k0.f4;
import k0.k1;
import k0.m4;
import k0.r4;
import k6.b4;
import k6.i7;
import k6.x3;
import k6.y5;
import m2.l;
import p9.z;
import s7.C0416;
import u1.C0433;

/* JADX INFO: renamed from: z2.ۢۨۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0485 {

    /* JADX INFO: renamed from: ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f758 = -743;

    /* JADX INFO: renamed from: ۟۠ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static long m9422() {
        if (C0245.m4685() > 0) {
            return e5.a.f5133i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static f4 m9423() {
        if (C0020.m399() < 0) {
            return f4.f8932b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9424(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m9425(Object obj) {
        if (C0008.m169() < 0) {
            return ((x3) obj).f10527a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static m4 m9426(Object obj) {
        if (C0277.m5315() < 0) {
            return ((k1) obj).f9097e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static f m9427() {
        if (C0000.m12() < 0) {
            return f6.a.f6361j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9428(Object obj) {
        if (C0065.m1257() <= 0) {
            return ((r4) obj).f9439x;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static c9.c m9429(Object obj) {
        if (C0081.m1735() >= 0) {
            return ((r1) obj).f5880o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m9430() {
        if (C0433.m8470() > 0) {
            return zzew.zzf.zza.REGEXP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢۥ, reason: not valid java name and contains not printable characters */
    public static l m9431(Object obj) {
        if (C0065.m1257() < 0) {
            return ((j1) obj).f5807k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m9432(Object obj) {
        if (C0170.m3247() < 0) {
            ((b4) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m9433(float f10) {
        if (C0416.m8144() > 0) {
            return String.valueOf(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۡ, reason: not valid java name and contains not printable characters */
    public static String m9434(String str) {
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

    /* JADX INFO: renamed from: ۦۡۢۡ, reason: contains not printable characters */
    public static z m9435(Object obj) {
        if (C0113.m2182() <= 0) {
            return ((MainViewModel) obj).f3106o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨۥ, reason: contains not printable characters */
    public static int m9436() {
        return 437 ^ C0135.f161;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m9437(Object obj) {
        if (C0266.m5069() <= 0) {
            return ((i7) obj).f10112a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9438(Object obj) {
        if (C0007.m154() < 0) {
            ((y5) obj).O();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9421(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
