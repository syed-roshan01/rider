package q6;

import a2.c0;
import android.app.Application;
import b4.C0052;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.C0169;
import d5.e0;
import d9.C0224;
import dagger.hilt.android.internal.modules.C0234;
import f0.c2;
import h5.C0308;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.function.Predicate;
import k0.e3;
import k6.c4;
import k6.g4;
import k6.r7;
import k6.t5;
import l0.C0341;
import m0.g1;
import m0.n1;
import m5.C0355;
import q7.C0390;
import r2.C0395;
import r5.C0401;
import y.C0476;

/* JADX INFO: renamed from: q6.۟ۥۦۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0388 {

    /* JADX INFO: renamed from: ۟ۦۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int f658 = -896;

    /* JADX INFO: renamed from: ۟ۢۥۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7581(Object obj, Object obj2) {
        if (C0224.m4304() <= 0) {
            return ((ArrayList) obj).removeIf((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static g1 m7582(Object obj) {
        if (C0390.m7627() < 0) {
            return ((e0) obj).f4468d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static long m7583() {
        if (C0341.m6681() > 0) {
            return zzne.zzaa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7584(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static int m7585() {
        return 885 ^ C0169.f193;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m7586(Object obj, Object obj2) {
        if (C0121.m2336() <= 0) {
            return ((c4) obj).g((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7587(Object obj) {
        if (C0142.m2725() > 0) {
            return ((g4) obj).f10059a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static c0 m7588(Object obj) {
        if (C0401.m7847() < 0) {
            return ((e3) obj).f8870d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m7589(Object obj) {
        if (C0162.m3105() > 0) {
            return ((zzfi.zzj.zza) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۨ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg m7590(Object obj, Object obj2) {
        if (C0234.m4495() <= 0) {
            return r7.w((zzfi.zze) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۦ, reason: not valid java name and contains not printable characters */
    public static Application m7591(Object obj) {
        if (C0476.m9266() >= 0) {
            return ((f5.n) obj).f6303b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۦ, reason: not valid java name and contains not printable characters */
    public static a5.j m7592(Object obj) {
        if (C0355.m6953() < 0) {
            return ((a5.d) obj).f1237b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7593(Object obj) {
        if (C0156.m2976() > 0) {
            return ((zzew.zzd) obj).zzh();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m7594(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۟ۦۢ, reason: contains not printable characters */
    public static n1 m7595(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((c2) obj).f5642g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static d5.l m7596() {
        if (C0395.m7729() >= 0) {
            return d5.l.f4638v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m7597() {
        if (C0308.m5935() > 0) {
            return "⚠ Unsaved changes";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String[] m7598() {
        if (C0144.m2767() >= 0) {
            return t5.f10400j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static String m7580(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
