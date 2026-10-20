package z1;

import a6.C0007;
import a8.C0010;
import android.net.Uri;
import androidx.compose.ui.draw.C0027;
import c9.c;
import ca.C0070;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.bundle.C0149;
import d1.C0211;
import d1.C0212;
import d5.n;
import dagger.hilt.internal.processedrootsentinel.C0251;
import f0.r;
import f2.j;
import g8.k;
import g8.v3;
import h8.C0314;
import java.io.ByteArrayOutputStream;
import k0.b5;
import k0.f4;
import k0.i;
import k0.m0;
import k0.s2;
import k0.t1;
import k0.x1;
import k0.x2;
import o5.C0370;
import p4.C0376;
import q8.h;
import r1.x0;
import t2.C0421;
import u0.b;
import v5.C0444;
import w6.C0464;
import x5.C0470;
import y.u0;

/* JADX INFO: renamed from: z1.۟ۦ۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0483 {

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int f757 = -781;

    /* JADX INFO: renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static b m9402() {
        if (C0376.m7371() >= 0) {
            return n.f4688i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m9403() {
        return 507 ^ C0070.f90;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦ۠, reason: not valid java name and contains not printable characters */
    public static v3 m9404(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((k) obj).f6894b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m9405(Object obj) {
        if (C0007.m154() < 0) {
            return ((zzfi.zzj.zza) obj).zzh();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m9407(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۡۤ۟, reason: not valid java name and contains not printable characters */
    public static x2 m9408(Object obj) {
        if (C0370.m7269() >= 0) {
            return ((s2) obj).f9448b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m9409(Object obj) {
        if (C0149.m2863() > 0) {
            return ((Uri) obj).getAuthority();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static x0 m9410(Object obj) {
        if (C0212.m4051() > 0) {
            return ((t1) obj).f9479n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m9411(String str) {
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

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m9412() {
        if (C0464.m9059() <= 0) {
            return "filters";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static c m9413(Object obj) {
        if (C0470.m9151() > 0) {
            return ((r) obj).f5863b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۨ, reason: not valid java name and contains not printable characters */
    public static long m9414(Object obj) {
        if (C0027.m541() > 0) {
            return ((x1) obj).f9639b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static f4 m9415() {
        if (C0251.m4811() <= 0) {
            return f4.f8931a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۧ, reason: contains not printable characters */
    public static Throwable m9416(Object obj) {
        if (C0314.m6079() > 0) {
            return h.a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۤ, reason: contains not printable characters */
    public static u0 m9417() {
        if (C0211.m4046() >= 0) {
            return i.f8993c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m9418(Object obj) {
        if (C0421.m8278() <= 0) {
            return ((x1) obj).f9643f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static j m9419(Object obj) {
        if (C0010.m199() >= 0) {
            return ((b5) obj).f8755e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟۟, reason: not valid java name and contains not printable characters */
    public static m0 m9420() {
        if (C0135.m2608() < 0) {
            return m0.f9196f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m9406(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
