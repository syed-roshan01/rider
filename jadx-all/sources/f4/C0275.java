package f4;

import b1.C0050;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.gson.internal.sql.C0208;
import d3.C0217;
import d7.C0221;
import f0.a2;
import f0.w1;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import k0.c1;
import q0.C0383;
import q1.C0384;

/* JADX INFO: renamed from: f4.ۡۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0275 {

    /* JADX INFO: renamed from: ۟ۡۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int f390 = 902;

    /* JADX INFO: renamed from: ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static o9.r m5280(Object obj) {
        if (C0208.m3984() < 0) {
            return ((a5.r) obj).f1298a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5281(Object obj) {
        if (C0384.m7523() <= 0) {
            return ((a5.b0) obj).f1229e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥ۟, reason: not valid java name and contains not printable characters */
    public static a2 m5282(Object obj) {
        if (C0050.m982() < 0) {
            return ((w1) obj).f5988b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static x9.v m5283() {
        if (C0331.m6374() > 0) {
            return r1.k.f13391a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5284(Object obj, Object obj2, boolean z10) {
        if (C0080.m1729() <= 0) {
            return l9.i.H0((String) obj, (String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static DocumentReference m5285(Object obj, Object obj2) {
        if (C0221.m4261() >= 0) {
            return ((CollectionReference) obj).document((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m5286() {
        return (-49) ^ C0137.f163;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5287(String str) {
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

    /* JADX INFO: renamed from: ۢ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m5288(Object obj) {
        if (C0167.m3200() > 0) {
            return ((c1) obj).f8787o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۥۦ, reason: not valid java name and contains not printable characters */
    public static int m5290(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static zzkm m5291(Object obj, Object obj2) {
        if (C0383.m7487() < 0) {
            return ((zzkm) obj).zza((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m5292(Object obj) {
        if (C0217.m4114() <= 0) {
            return ((Locale) obj).getCountry();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5289(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
