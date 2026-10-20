package dagger.hilt.codegen;

import a.C0000;
import android.accounts.AccountManager;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0042;
import b7.C0054;
import c9.e;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import d5.x;
import dagger.hilt.android.migration.C0239;
import e2.C0261;
import f0.C0272;
import f0.t0;
import h0.C0299;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import k0.a3;
import k0.q;
import k6.i7;
import k6.l5;
import k6.s;
import k6.s6;
import k6.z6;
import k8.C0338;
import l0.r;
import l6.C0344;
import l9.i;
import m0.g1;
import m0.n1;
import m7.C0357;
import p3.C0375;
import q.f;
import t2.C0423;
import y9.C0479;
import z3.C0487;

/* JADX INFO: renamed from: dagger.hilt.codegen.۟ۡۦ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0242 {

    /* JADX INFO: renamed from: ۣۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int f322 = 396;

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m4638() {
        if (C0182.m3488() >= 0) {
            return r.f11120a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4639(Object obj) {
        if (C0423.m8307() > 0) {
            return ((zzfi.zzj) obj).zzbo();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static long m4640() {
        if (C0479.m9346() > 0) {
            return zzne.zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static e m4641(Object obj) {
        if (C0320.m6200() >= 0) {
            return ((q) obj).f9366e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۡ, reason: not valid java name and contains not printable characters */
    public static z6 m4642(Object obj) {
        if (C0299.m5752() <= 0) {
            return ((s6) obj).f10357c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4643(int i10, Object obj) {
        if (C0375.m7362() > 0) {
            return i.b1(i10, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4644() {
        if (C0054.m1047() >= 0) {
            return "Failed to insert trigger URI (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۡ, reason: not valid java name and contains not printable characters */
    public static g1 m4645(Object obj) {
        if (C0192.m3659() > 0) {
            return ((x) obj).f4839o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4646(Object obj, Object obj2) {
        if (C0357.m7001() < 0) {
            return y3.e.k0((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m4647(Object obj) {
        if (C0042.m820() >= 0) {
            return ((l5) obj).f10193b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4648(Object obj) {
        if (C0000.m12() <= 0) {
            return ((i7) obj).f10114c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4649(Object obj, Object obj2) {
        if (C0143.m2751() > 0) {
            zzbw.zza((Parcel) obj, (Parcelable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static t0 m4650() {
        if (C0272.m5249() < 0) {
            return t0.f5931r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4651() {
        if (C0344.m6746() >= 0) {
            return Binder.getCallingUid();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4652() {
        if (C0487.m9496() < 0) {
            return "Saving trigger URI";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4653(String str) {
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

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4655(Object obj, Object obj2) {
        if (C0239.m4596() > 0) {
            return ((f) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟۠, reason: not valid java name and contains not printable characters */
    public static l2.q m4656() {
        if (C0079.m1701() >= 0) {
            return l2.q.f11222c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static AccountManager m4657(Object obj) {
        if (C0191.m3643() >= 0) {
            return ((k6.r) obj).f10333e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static int m4658(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۨۢ, reason: contains not printable characters */
    public static n1 m4659(Object obj) {
        if (C0154.m2958() < 0) {
            return ((a3) obj).f8717b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m4660() {
        return (-125) ^ C0090.f124;
    }

    /* JADX INFO: renamed from: ۣۣۨۧ, reason: not valid java name and contains not printable characters */
    public static long m4661(long j10, long j11) {
        if (C0261.m4991() > 0) {
            return Math.max(j10, j11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Double m4662(Object obj) {
        if (C0338.m6645() < 0) {
            return ((s) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4654(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
