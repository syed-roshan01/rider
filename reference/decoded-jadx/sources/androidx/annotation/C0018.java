package androidx.annotation;

import a.C0002;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzs;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfiginterop.C0203;
import f0.b1;
import f4.C0274;
import h0.C0299;
import h8.C0313;
import java.io.ByteArrayOutputStream;
import k0.c2;
import k0.d5;
import k0.n4;
import k0.u4;
import k6.k;
import p9.z;
import q0.C0382;
import u1.C0432;
import w0.p;

/* JADX INFO: renamed from: androidx.annotation.۟ۥۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0018 {

    /* JADX INFO: renamed from: ۟ۧۦۣۦ, reason: not valid java name and contains not printable characters */
    public static int f38 = -578;

    /* JADX INFO: renamed from: ۟۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m354() {
        return 537 ^ C0382.f653;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m355(Object obj) {
        if (C0160.m3070() < 0) {
            return ((n4) obj).f9279d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۡ, reason: not valid java name and contains not printable characters */
    public static z m356(Object obj) {
        if (C0313.m6072() < 0) {
            return ((MainViewModel) obj).f3118u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static long m357(Object obj) {
        if (C0141.m2714() < 0) {
            return ((c2) obj).f8791d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۦ, reason: not valid java name and contains not printable characters */
    public static String m358(Object obj) {
        if (C0123.m2379() > 0) {
            return ((zzfi.zzj) obj).zzai();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m359() {
        if (C0203.m3894() >= 0) {
            return "Prevents ride apps from detecting Developer Options or blocking auto-accept.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static long m361() {
        if (C0274.m5286() <= 0) {
            return u4.f9530a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static long m362(Object obj) {
        if (C0002.m46() <= 0) {
            return ((d5) obj).f8840b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static b1 m363() {
        if (C0043.m833() >= 0) {
            return b1.f5612e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m364(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۟۟ۧ, reason: contains not printable characters */
    public static String m365(String str) {
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

    /* JADX INFO: renamed from: ۦۥۨ۟, reason: contains not printable characters */
    public static long m366() {
        if (C0120.m2311() < 0) {
            return zzne.zzai();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m367() {
        if (C0194.m3713() >= 0) {
            return p.f16109b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢۦ, reason: not valid java name and contains not printable characters */
    public static zzs m368() {
        if (C0299.m5752() < 0) {
            return zzs.DEBUG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۦ, reason: not valid java name and contains not printable characters */
    public static String[] m369() {
        if (C0432.m8470() > 0) {
            return k.f10143n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m360(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
