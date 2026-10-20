package n;

import a2.a0;
import a5.d0;
import android.content.SharedPreferences;
import c4.C0066;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.measurement_impl.C0185;
import d5.o1;
import e1.l0;
import e7.C0265;
import f0.d2;
import f5.r;
import f6.C0279;
import java.io.ByteArrayOutputStream;
import k0.f2;
import k0.i3;
import k0.p1;
import k0.x1;
import k6.g7;
import k6.l4;
import l.t;
import m0.m;
import m4.C0354;
import m5.C0355;
import q8.h;
import q9.C0392;
import r2.C0396;
import r2.C0397;
import s3.C0413;
import s7.C0416;
import u8.C0439;
import y0.o;
import z1.C0484;
import z8.C0493;

/* JADX INFO: renamed from: n.ۣۣۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0362 {

    /* JADX INFO: renamed from: ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int f632 = 33;

    /* JADX INFO: renamed from: ۟۠۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m7076(Object obj, int i10, Object obj2) {
        if (C0066.m1277() >= 0) {
            return ((zzfi.zze.zza) obj).zza(i10, (zzfi.zzg.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m7078(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m7079() {
        if (C0265.m5062() <= 0) {
            return "select count(1) > 0 from queue where has_realtime = 1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static l0 m7080(Object obj) {
        if (C0392.m7657() >= 0) {
            return ((i3) obj).f9034d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static o m7081(Object obj) {
        if (C0354.m6940() < 0) {
            return ((x1) obj).f9638a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m7082(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((l4) obj).s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static t m7083(Object obj) {
        if (C0279.m5394() > 0) {
            return ((g7) obj).f10073c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7084(Object obj, Object obj2, long j10, Object obj3, int i10) {
        if (C0185.m3538() > 0) {
            o1.b((String) obj, (String) obj2, j10, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static a0 m7085(Object obj) {
        if (C0118.m2274() <= 0) {
            return ((d2) obj).f5667a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static l0 m7086(Object obj) {
        if (C0484.m9403() > 0) {
            return ((p1) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static FirebaseUser m7087(Object obj) {
        if (C0439.m8564() >= 0) {
            return ((r) obj).f6317d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7088(Object obj) {
        if (C0416.m8144() > 0) {
            return ((f2) obj).f8921e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m7089(Object obj) {
        if (C0355.m6953() < 0) {
            return ((d0) obj).f1240b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m7090(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۥۢۥ, reason: not valid java name and contains not printable characters */
    public static e0.e m7091() {
        if (C0392.m7657() >= 0) {
            return l0.o.f11105e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۥ, reason: not valid java name and contains not printable characters */
    public static long m7092() {
        if (C0141.m2714() <= 0) {
            return zzne.zzw();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static Object m7093(Object obj) {
        if (C0413.m8089() <= 0) {
            return ((h) obj).f13229a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static int m7094(Object obj) {
        if (C0090.m1920() >= 0) {
            return ((t.t) obj).b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥ۠۠, reason: not valid java name and contains not printable characters */
    public static l2.m m7095() {
        if (C0493.m9578() >= 0) {
            return l2.m.f11216a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7096(Object obj) {
        if (C0397.m7755() >= 0) {
            return ((k6.o) obj).f10243b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m7097() {
        return (-86) ^ C0396.f666;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m7077(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
