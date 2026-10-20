package w4;

import c3.C0062;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.reporting.C0187;
import d2.C0215;
import d5.b2;
import dagger.hilt.internal.processedrootsentinel.C0251;
import e1.C0257;
import f0.o1;
import f0.s1;
import g3.C0288;
import g9.C0294;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.TreeSet;
import k0.c0;
import k0.i0;
import k0.t;
import k0.x;
import k0.y;
import k6.a5;
import k6.d4;
import k6.f4;
import k6.p7;
import k6.r;
import k6.r4;
import k6.s5;
import k6.y5;
import m0.g1;
import m1.C0351;
import n9.C0366;
import org.json.JSONObject;
import r2.C0397;
import r7.C0403;
import s0.C0409;
import s8.C0416;
import w1.C0455;
import y0.o;

/* JADX INFO: renamed from: w4.۟ۤ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0459 {

    /* JADX INFO: renamed from: ۨۧۦ۠, reason: not valid java name and contains not printable characters */
    public static int f730 = 760;

    /* JADX INFO: renamed from: ۟۟۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static r4 m8938(Object obj) {
        if (C0257.m4918() > 0) {
            return ((p7) obj).f10296k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8939() {
        if (C0416.m8173() < 0) {
            return "trigger_uri";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m8940() {
        if (C0080.m1729() < 0) {
            return "Filter Saved \u2713";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m8941() {
        if (C0409.m8037() < 0) {
            return "Skip rides outside your km range";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static g1 m8942(Object obj) {
        if (C0215.m4108() <= 0) {
            return ((b2) obj).f4421f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static long m8943(Object obj) {
        if (C0062.m1186() > 0) {
            return ((r) obj).f10335g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static u8.e m8944(Object obj, Object obj2, Object obj3) {
        if (C0397.m7764() < 0) {
            return ((c0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠۠, reason: not valid java name and contains not printable characters */
    public static y m8945(Object obj) {
        if (C0294.m5663() > 0) {
            return ((i0) obj).M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8946() {
        if (C0461.m8993() > 0) {
            return "Minimum Fare Filter (\u20b9)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8947(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8948(Object obj, Object obj2) {
        if (C0288.m5547() >= 0) {
            return ((TreeSet) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8949(Object obj) {
        if (C0127.m2448() >= 0) {
            return ((zzfc.zzc.zza) obj).zzd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۦ, reason: not valid java name and contains not printable characters */
    public static f4 m8950(Object obj) {
        if (C0403.m7911() <= 0) {
            return ((d4) obj).f9970l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8951() {
        return (-931) ^ C0152.f177;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m8952(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static void m8953(Object obj, Object obj2, Object obj3, int i10) {
        if (C0257.m4918() > 0) {
            y3.e.e((MainViewModel) obj, (c9.a) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8954(Object obj, Object obj2, int i10) {
        if (C0455.m8885() <= 0) {
            return ((JSONObject) obj).put((String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8955(Object obj) {
        if (C0351.m6885() >= 0) {
            return ((a5) obj).f9885t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8956(Object obj) {
        if (C0178.m3402() > 0) {
            return ((s1) obj).f5896b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static long m8957(Object obj, Object obj2, Object obj3) {
        if (C0187.m3565() >= 0) {
            return o1.b((a2.c0) obj, (m2.b) obj2, (f2.d) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static t m8958() {
        if (C0366.m7189() > 0) {
            return t.f9467f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static s5 m8959(Object obj) {
        if (C0251.m4811() < 0) {
            return ((y5) obj).f10576k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m8960(Object obj, float f10, long j10, long j11, long j12, Object obj2, Object obj3, float f11, Object obj4, Object obj5, int i10, boolean z10, Object obj6, Object obj7, Object obj8, int i11, int i12) {
        if (C0111.m2143() > 0) {
            x.c((o) obj, f10, j10, j11, j12, (c9.e) obj2, (a2.c0) obj3, f11, (y.i) obj4, (y.g) obj5, i10, z10, (c9.e) obj6, (c9.e) obj7, (m0.m) obj8, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static String m8961(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
