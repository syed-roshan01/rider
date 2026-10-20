package d9;

import a2.c0;
import a7.C0008;
import androidx.compose.ui.draw.C0027;
import com.auto.accept.data.model.UserProfile;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.proto.C0162;
import dagger.hilt.android.lifecycle.C0238;
import f0.d2;
import f0.k1;
import f4.C0277;
import java.io.ByteArrayOutputStream;
import k0.f2;
import p5.C0378;
import q6.C0387;
import r1.j0;
import s.C0409;
import y.z0;

/* JADX INFO: renamed from: d9.ۣ۟۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0223 {

    /* JADX INFO: renamed from: ۦۧ۠ۤ, reason: contains not printable characters */
    public static int f302 = 452;

    /* JADX INFO: renamed from: ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4278(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4279() {
        return 869 ^ C0409.f679;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۧ, reason: not valid java name and contains not printable characters */
    public static float m4280() {
        if (C0150.m2892() <= 0) {
            return l0.r.f11124e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧ۟, reason: not valid java name and contains not printable characters */
    public static c0 m4281(Object obj) {
        if (C0378.m7389() > 0) {
            return ((k0.q) obj).f9364c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4282(Object obj) {
        if (C0027.m541() > 0) {
            ((k1) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۡ, reason: not valid java name and contains not printable characters */
    public static c9.f m4283(Object obj) {
        if (C0083.m1779() >= 0) {
            return ((f2) obj).f8924o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static i1.f m4284() {
        if (C0238.m4583() > 0) {
            return h6.g.f7597t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static int m4285(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static long m4286(Object obj, long j10) {
        if (C0277.m5315() < 0) {
            return ((d2) obj).a(j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۥۣۤ, reason: contains not printable characters */
    public static boolean m4287(Object obj) {
        if (C0008.m169() <= 0) {
            return ((UserProfile) obj).getBlocked();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static j0 m4288(Object obj, Object obj2, Object obj3) {
        if (C0162.m3105() > 0) {
            return z0.a((y.g) obj, (y0.f) obj2, (m0.m) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦ۠, reason: not valid java name and contains not printable characters */
    public static zzfc.zzd.zza m4289(Object obj, int i10, Object obj2) {
        if (C0387.m7564() >= 0) {
            return ((zzfc.zzd.zza) obj).zza(i10, (zzfc.zzc.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4290(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
