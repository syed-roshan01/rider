package h4;

import a5.h;
import android.net.Uri;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.input.key.C0033;
import c4.C0066;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0134;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.platforminfo.C0193;
import d3.C0217;
import dagger.hilt.android.components.C0228;
import e0.e;
import f0.a1;
import h.C0297;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import k0.f2;
import k0.l1;
import k0.n3;
import k6.a5;
import k6.f5;
import k6.p7;
import k6.r;
import k6.r7;
import k6.u7;
import p4.C0377;
import p9.z;
import q0.C0383;
import r1.i1;
import r1.l;
import x5.C0471;
import y0.d;
import y0.o;

/* JADX INFO: renamed from: h4.۟ۧۢۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0306 {

    /* JADX INFO: renamed from: ۟ۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int f453 = -376;

    /* JADX INFO: renamed from: ۟۠۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5883() {
        if (C0126.m2434() > 0) {
            return "Got multiple records for event aggregates, expected one. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static i1 m5884(Object obj) {
        if (C0217.m4114() < 0) {
            return ((f2) obj).f8919c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5886(Object obj) {
        if (C0471.m9151() >= 0) {
            return ((zzfi.zzg) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static long m5887() {
        if (C0100.m1959() < 0) {
            return zzne.zzt();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static o m5888(Object obj, Object obj2, Object obj3, Object obj4, float f10, Object obj5, int i10) {
        if (C0106.m2067() > 0) {
            return androidx.compose.ui.draw.a.g((o) obj, (h1.c) obj2, (d) obj3, (l) obj4, f10, (e1.l) obj5, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static c9.c m5889(Object obj) {
        if (C0377.m7371() > 0) {
            return ((a1) obj).f5597f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static void m5890(Object obj, Object obj2, Object obj3) {
        if (C0066.m1277() > 0) {
            r7.O((StringBuilder) obj, (String) obj2, (zzfi.zzl) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m5891(Object obj) {
        if (C0383.m7487() <= 0) {
            return ((Uri) obj).buildUpon();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static e m5892() {
        if (C0192.m3659() >= 0) {
            return l0.o.f11104d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۧ, reason: not valid java name and contains not printable characters */
    public static z m5893(Object obj) {
        if (C0033.m652() <= 0) {
            return ((z4.d) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m5894(Object obj, Object obj2) {
        if (C0320.m6181() >= 0) {
            return ((p7) obj).a((a5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m5895(Object obj) {
        if (C0091.m1940() < 0) {
            return ((l1) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۧۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m5896(Object obj) {
        if (C0028.m557() > 0) {
            return ((n3) obj).f9275n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5897(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۤۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzb.zza m5898(Object obj, boolean z10) {
        if (C0228.m4380() > 0) {
            return ((zzfi.zzb.zza) obj).zzb(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟, reason: contains not printable characters */
    public static String m5899(String str) {
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

    /* JADX INFO: renamed from: ۥۨۧۤ, reason: contains not printable characters */
    public static boolean m5900(Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if (C0190.m3639() > 0) {
            return ((u7) obj).V((String) obj2, (String) obj3, i10, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۧۧ, reason: contains not printable characters */
    public static o m5901(Object obj) {
        if (C0193.m3691() <= 0) {
            return androidx.compose.foundation.layout.c.b((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5902(Object obj) {
        if (C0134.m2587() <= 0) {
            return ((h) obj).f1263c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤ۟۟, reason: not valid java name and contains not printable characters */
    public static r m5903(Object obj) {
        if (C0127.m2448() > 0) {
            return ((f5) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m5904() {
        return (-816) ^ C0297.f444;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m5885(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
