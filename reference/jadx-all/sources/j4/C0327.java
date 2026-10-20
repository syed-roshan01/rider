package j4;

import androidx.compose.foundation.text.modifiers.C0025;
import androidx.profileinstaller.C0046;
import c4.C0066;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.messaging.ktx.C0186;
import d2.C0216;
import d5.k0;
import f.C0270;
import g5.C0292;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import k0.w;
import k6.x7;
import m0.C0350;
import m0.g1;
import o4.C0370;
import v0.C0443;
import y.C0476;

/* JADX INFO: renamed from: j4.ۣۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0327 {

    /* JADX INFO: renamed from: ۦۡۦۡ, reason: contains not printable characters */
    public static int f474 = -792;

    /* JADX INFO: renamed from: ۟۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m6301(Object obj, Object obj2) {
        if (C0025.m495() >= 0) {
            return ((zzfi.zzj.zza) obj).zzp((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static long m6302(Object obj) {
        if (C0443.m8630() < 0) {
            return ((x7) obj).G;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟۟, reason: not valid java name and contains not printable characters */
    public static g1 m6303(Object obj) {
        if (C0370.m7254() >= 0) {
            return ((k0) obj).f4603f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۢ, reason: not valid java name and contains not printable characters */
    public static int m6304() {
        return 610 ^ C0186.f210;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6305(Object obj) {
        if (C0119.m2289() >= 0) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m6306(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6308() {
        if (C0216.m4108() < 0) {
            return zzoz.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m6309(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6310(Object obj) {
        if (C0476.m9266() > 0) {
            return ((w) obj).f9597w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6311() {
        if (C0292.m5605() <= 0) {
            return zzpg.zzd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6312(Object obj) {
        if (C0270.m5152() >= 0) {
            return ((f0.i) obj).f5750q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۨ۠, reason: contains not printable characters */
    public static i1.f m6313() {
        if (C0046.m893() >= 0) {
            return f6.a.K();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۧ, reason: contains not printable characters */
    public static int m6314(Object obj) {
        if (C0270.m5152() >= 0) {
            return ((l2.k) obj).f11215a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6315(Object obj) {
        if (C0066.m1277() > 0) {
            return ((MainViewModel) obj).I;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6316() {
        if (C0350.m6838() <= 0) {
            return la.g.f();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m6307(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
