package g9;

import a.C0000;
import a7.C0008;
import androidx.compose.ui.graphics.C0030;
import c3.C0062;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.ktx.C0156;
import d5.q;
import d7.t;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.codegen.C0242;
import e2.C0261;
import e8.c2;
import g2.a0;
import g2.s;
import java.io.ByteArrayOutputStream;
import java.nio.channels.FileChannel;
import k0.f2;
import k6.a5;
import k6.g6;
import k6.p2;
import k6.x;
import k6.x3;
import m0.m;
import t3.C0424;
import u.C0428;
import y0.o;

/* JADX INFO: renamed from: g9.۠ۨۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0294 {

    /* JADX INFO: renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int f442 = -669;

    /* JADX INFO: renamed from: ۟ۡۥۡۦ, reason: not valid java name and contains not printable characters */
    public static x.b m5658(Object obj) {
        if (C0424.m8322() >= 0) {
            return ((x.c) obj).f16265a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static c2 m5659(Object obj, Object obj2) {
        if (C0008.m169() < 0) {
            return ((c2) obj).f((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m5661(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۤۨۦ, reason: not valid java name and contains not printable characters */
    public static u0.b m5662() {
        if (C0238.m4587() <= 0) {
            return q.f4727d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m5663() {
        return (-86) ^ C0135.f161;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۨ, reason: not valid java name and contains not printable characters */
    public static void m5664(Object obj, Object obj2, Object obj3) {
        if (C0030.m575() > 0) {
            t.i0((f0.c2) obj, (a0) obj2, (s) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5665(Object obj, Object obj2, int i10) {
        if (C0118.m2274() < 0) {
            ((f2) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static FileChannel m5666(Object obj, long j10) {
        if (C0062.m1186() >= 0) {
            return ((FileChannel) obj).truncate(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5667() {
        if (C0102.m2007() > 0) {
            return "conditional_properties";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static x3 m5668() {
        if (C0428.m8409() <= 0) {
            return x.P0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۦ, reason: contains not printable characters */
    public static long m5669(Object obj) {
        if (C0000.m12() < 0) {
            return ((a5) obj).f9878m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۡ, reason: contains not printable characters */
    public static k0.a5 m5670() {
        if (C0079.m1701() > 0) {
            return k0.a5.f8721a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۧۢ, reason: contains not printable characters */
    public static String m5671(String str) {
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

    /* JADX INFO: renamed from: ۧۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5672(Object obj) {
        if (C0242.m4660() <= 0) {
            return ((zzew.zzd) obj).zzf();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢۤ, reason: not valid java name and contains not printable characters */
    public static o m5673(Object obj, float f10, float f11) {
        if (C0156.m2976() >= 0) {
            return androidx.compose.foundation.layout.c.d((o) obj, f10, f11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5674(Object obj, Object obj2) {
        if (C0242.m4660() < 0) {
            return ((zzfi.zzj.zza) obj).zze((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5675() {
        if (C0261.m4991() >= 0) {
            return ",";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static p2 m5676(Object obj) {
        if (C0091.m1940() < 0) {
            return ((g6) obj).f10070n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static String m5660(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
