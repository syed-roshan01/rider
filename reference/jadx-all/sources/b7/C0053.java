package b7;

import a2.a0;
import androidx.compose.foundation.layout.C0022;
import c9.e;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.C0205;
import com.google.firebase.remoteconfiginterop.C0203;
import d9.C0225;
import e1.C0259;
import f1.C0274;
import f5.r;
import h8.C0315;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;
import java.util.Set;
import k0.d;
import k6.w4;
import k6.x;
import k6.x3;
import n.C0362;
import o8.C0372;
import t.w1;
import v5.C0445;

/* JADX INFO: renamed from: b7.۟۟ۤۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0053 {

    /* JADX INFO: renamed from: ۟ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int f73 = -150;

    /* JADX INFO: renamed from: ۟ۡ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static x3 m1024() {
        if (C0445.m8673() > 0) {
            return x.f10494l0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static e m1025(Object obj) {
        if (C0315.m6079() >= 0) {
            return ((d) obj).f8809c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1026(Object obj) {
        if (C0205.m3914() >= 0) {
            return ((File) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static long m1027() {
        if (C0107.m2075() < 0) {
            return zzne.zzf();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static d1.d m1028(Object obj, int i10) {
        if (C0102.m2007() > 0) {
            return ((a0) obj).b(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۦ, reason: not valid java name and contains not printable characters */
    public static int m1029() {
        return (-421) ^ C0362.f632;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m1030(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m1031(Object obj) {
        if (C0274.m5273() < 0) {
            return ((f5.b) obj).f6231a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m1032(Object obj) {
        if (C0225.m4316() >= 0) {
            return ((r) obj).f6319f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static w1 m1033(int i10, int i11, Object obj, int i12) {
        if (C0074.m1607() < 0) {
            return t.e.s(i10, i11, (t.a0) obj, i12);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1034(Object obj) {
        if (C0372.m7283() >= 0) {
            return ((zzew.zzc) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1035(String str) {
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

    /* JADX INFO: renamed from: ۥۤۡۧ, reason: contains not printable characters */
    public static void m1036(Object obj, long j10, boolean z10) {
        if (C0022.m444() <= 0) {
            ((w4) obj).Y(j10, z10);
        }
    }

    /* JADX INFO: renamed from: ۥۥۢۨ, reason: contains not printable characters */
    public static String m1037() {
        if (C0203.m3894() >= 0) {
            return "select consent_state from consent_settings where app_id=? limit 1;";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static Set m1038(Object obj) {
        if (C0259.m4939() < 0) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1023(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
