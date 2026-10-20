package t2;

import a2.a0;
import androidx.annotation.C0019;
import androidx.compose.ui.input.key.C0033;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.installations.interop.C0174;
import d5.z1;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.internal.definecomponent.C0249;
import e1.C0257;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import k0.i0;
import k0.k0;
import l0.C0339;
import m0.g1;
import org.json.JSONArray;
import q1.C0383;
import t8.C0426;
import w2.C0457;

/* JADX INFO: renamed from: t2.۟ۦۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0422 {

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f693 = -827;

    /* JADX INFO: renamed from: ۟۠ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m8280(Object obj) {
        if (C0457.m8901() <= 0) {
            return y3.e.l((g1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Double m8281(double d10) {
        if (C0426.m8356() <= 0) {
            return Double.valueOf(d10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static i1.f m8282() {
        if (C0257.m4918() >= 0) {
            return z6.a.f17315p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m8283(Object obj, boolean z10) {
        if (C0339.m6658() < 0) {
            return ((zzfi.zzj.zza) obj).zza(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8284(Object obj, Object obj2) {
        if (C0080.m1729() < 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static long m8285(Object obj, float f10) {
        if (C0110.m2123() < 0) {
            return k0.e((i0) obj, f10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzi.zza m8286() {
        if (C0158.m3012() >= 0) {
            return zzfi.zzi.zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m8287(Object obj) {
        if (C0383.m7523() < 0) {
            return ((JSONArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m8288(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static String m8289() {
        if (C0019.m375() <= 0) {
            return zzne.zzam();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static int m8290(Object obj, float f10) {
        if (C0233.m4495() <= 0) {
            return ((a0) obj).g(f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static g1 m8291(Object obj) {
        if (C0249.m4779() <= 0) {
            return ((z1) obj).f4877d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m8292(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۣۥۥ, reason: not valid java name and contains not printable characters */
    public static int m8294() {
        return (-113) ^ C0115.f141;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static int m8295(Object obj) {
        if (C0174.m3323() <= 0) {
            return ((d5.g) obj).f4500f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static String m8296() {
        if (C0033.m652() < 0) {
            return "timed_out_event";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۣ, reason: not valid java name and contains not printable characters */
    public static String m8293(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
