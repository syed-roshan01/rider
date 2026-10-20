package z3;

import android.content.Context;
import c0.C0057;
import c4.C0064;
import c9.e;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.measurement_impl.C0185;
import d5.v0;
import d7.t;
import f0.r1;
import f4.C0277;
import g3.C0289;
import h4.C0306;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import java.io.File;
import k0.b3;
import k0.h2;
import k0.q3;
import k0.t1;
import k0.u1;
import k4.C0337;
import k6.r7;
import m0.l3;
import o0.i;
import o4.C0370;
import p8.C0381;
import p9.z;
import u4.C0437;
import v7.C0450;

/* JADX INFO: renamed from: z3.۟ۢۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0487 {

    /* JADX INFO: renamed from: ۤۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int f760 = 228;

    /* JADX INFO: renamed from: ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m9463(Object obj, Object obj2) {
        if (C0450.m8755() > 0) {
            ((i) obj).c(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m9464() {
        return (-406) ^ C0437.f707;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static long m9465() {
        if (C0137.m2646() <= 0) {
            return zzne.zzr();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static u1 m9466(Object obj) {
        if (C0148.m2838() <= 0) {
            return ((t1) obj).f9484s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۥ, reason: not valid java name and contains not printable characters */
    public static float m9467(Object obj) {
        if (C0306.m5904() >= 0) {
            return ((MainViewModel) obj).h();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9468() {
        if (C0277.m5315() < 0) {
            return "bundle_end_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static e m9469(Object obj) {
        if (C0074.m1607() <= 0) {
            return ((b3) obj).f8740c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m9470(Object obj, int i10) {
        if (C0370.m7254() > 0) {
            return t.x((int[]) obj, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static File m9471(Object obj, Object obj2) {
        if (C0057.m1090() <= 0) {
            return ((Context) obj).getDatabasePath((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static int m9472(Object obj) {
        if (C0381.m7467() >= 0) {
            return ((r1) obj).f5881p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m9473(Object obj) {
        if (C0329.m6350() > 0) {
            return ((h2) obj).f8979r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int m9474(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۨۥۨ, reason: not valid java name and contains not printable characters */
    public static String m9475(String str) {
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

    /* JADX INFO: renamed from: ۥ۟ۤۥ, reason: contains not printable characters */
    public static z m9477(Object obj) {
        if (C0185.m3538() > 0) {
            return ((MainViewModel) obj).f3088e0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۨۥ, reason: contains not printable characters */
    public static long m9478(Object obj) {
        if (C0337.m6515() < 0) {
            return ((q3) obj).f9394a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m9479(Object obj, Object obj2, Object obj3) {
        if (C0289.m5547() > 0) {
            ((r7) obj).I((zzfi.zzg.zza) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۥۣ۠, reason: not valid java name and contains not printable characters */
    public static l3 m9480(Object obj) {
        if (C0064.m1243() > 0) {
            return ((v0) obj).f4799c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۦ, reason: not valid java name and contains not printable characters */
    public static String m9476(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
