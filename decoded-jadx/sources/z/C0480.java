package z;

import android.os.BaseBundle;
import android.os.C0013;
import android.support.v4.graphics.drawable.C0016;
import c0.C0057;
import com.auto.accept.data.model.TransactionData;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0213;
import d5.g1;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import g8.C0293;
import java.io.ByteArrayOutputStream;
import k0.b1;
import k0.m4;
import k6.c7;
import k6.h5;
import k6.p4;
import o2.C0368;
import o5.C0370;
import x4.C0469;

/* JADX INFO: renamed from: z.۟ۥۣۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0480 {

    /* JADX INFO: renamed from: ۟ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int f754 = -686;

    /* JADX INFO: renamed from: ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9349(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m9350(Object obj) {
        if (C0202.m3868() >= 0) {
            return ((BaseBundle) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static long m9351(Object obj) {
        if (C0230.m4440() > 0) {
            return ((m4) obj).I;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠۠, reason: not valid java name and contains not printable characters */
    public static Boolean m9352(Object obj) {
        if (C0081.m1735() >= 0) {
            return ((h5) obj).f10082b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9353() {
        if (C0140.m2699() > 0) {
            return "app_name";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m9354() {
        return (-974) ^ C0057.f77;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9355(Object obj) {
        if (C0013.m253() > 0) {
            return ((k6.d) obj).f9951a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m9356(Object obj) {
        if (C0368.m7234() > 0) {
            return ((f5.d0) obj).f6244a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static l2.j m9357() {
        if (C0198.m3800() >= 0) {
            return l2.j.f11213d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9358(Object obj) {
        if (C0469.m9143() >= 0) {
            return ((TransactionData) obj).getCouponCode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۤ, reason: not valid java name and contains not printable characters */
    public static long m9359() {
        if (C0213.m4083() < 0) {
            return zzne.zzi();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m9360(Object obj) {
        if (C0293.m5656() > 0) {
            return ((g1) obj).f4514d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m9361(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9362() {
        if (C0370.m7269() >= 0) {
            return "shizuku_engine_status";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9363(long j10, int i10, int i11) {
        if (C0138.m2662() >= 0) {
            return l.q.b(j10, i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static p4 m9364(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((c7) obj).f9942e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۧ, reason: contains not printable characters */
    public static long m9365(Object obj) {
        if (C0159.m3030() < 0) {
            return ((b1) obj).f8731d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۤۧ, reason: not valid java name and contains not printable characters */
    public static l2.g m9367(Object obj) {
        if (C0016.m315() >= 0) {
            return ((a2.p) obj).f962f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m9366(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
