package w9;

import a2.l;
import a2.m;
import a5.i0;
import android.content.Context;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.remoteconfig.ktx.C0199;
import f6.C0279;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import k0.k;
import k0.l0;
import k6.d4;
import k6.f4;
import k6.r7;
import n8.C0366;
import p7.n;
import r8.p;
import s0.C0411;
import v0.C0442;
import w2.C0459;

/* JADX INFO: renamed from: w9.۟۠۠ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0466 {

    /* JADX INFO: renamed from: ۨۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int f736 = 214;

    /* JADX INFO: renamed from: ۟۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static l m9062(Object obj) {
        if (C0442.m8612() > 0) {
            return ((m) obj).f947a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static n m9063(Object obj) {
        if (C0328.m6319() < 0) {
            return ((i0) obj).f1272b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۡ, reason: not valid java name and contains not printable characters */
    public static int m9064(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static zzs[] m9065() {
        if (C0279.m5394() > 0) {
            return zzs.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static long m9066(Object obj) {
        if (C0366.m7172() > 0) {
            return ((k) obj).f9084e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m9067(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        if (C0411.m8063() >= 0) {
            return p.K0((Iterable) obj, (String) obj2, (String) obj3, (String) obj4, (c9.c) obj5, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m9068() {
        return (-722) ^ C0075.f109;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9069(int i10, Object obj, Object obj2) {
        if (C0101.m1975() > 0) {
            return f6.a.k0(i10, (Context) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۢ, reason: not valid java name and contains not printable characters */
    public static String m9070(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9071(Object obj) {
        if (C0085.m1825() >= 0) {
            return ((AppConfig) obj).getEmailVerificationEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۢۡ, reason: not valid java name and contains not printable characters */
    public static l0 m9072() {
        if (C0153.m2938() < 0) {
            return l0.f9141n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۥ, reason: not valid java name and contains not printable characters */
    public static f4 m9073(Object obj) {
        if (C0199.m3818() > 0) {
            return ((d4) obj).f9971m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m9074() {
        if (C0442.m8612() >= 0) {
            return e5.a.f();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۨۤۤ, reason: contains not printable characters */
    public static String m9076() {
        if (C0459.m8930() > 0) {
            return "unsaved_changes";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String m9077(boolean z10, boolean z11, boolean z12) {
        if (C0115.m2227() <= 0) {
            return r7.z(z10, z11, z12);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static String m9075(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
