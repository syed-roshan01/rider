package androidx.core.app;

import a5.k;
import a5.z;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.Source;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.reporting.C0190;
import d5.g;
import dagger.hilt.internal.definecomponent.C0249;
import f0.w;
import f6.C0277;
import h5.C0306;
import h5.C0307;
import h7.C0312;
import i6.C0319;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import k0.a3;
import k0.c3;
import k0.u4;
import k6.n4;
import k6.p7;
import k6.q3;
import l.z2;
import l0.d;
import m5.C0355;
import o4.C0369;
import q7.C0389;
import r1.x0;
import s2.C0411;
import v5.C0444;
import y0.o;
import z2.C0484;

/* JADX INFO: renamed from: androidx.core.app.ۣۥۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0040 {

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f60 = -81;

    /* JADX INFO: renamed from: ۟۠۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m777(Object obj) {
        if (C0389.m7627() < 0) {
            return ((z2) obj).f10984c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m778(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((n4) obj).f10222b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static o m779(Object obj) {
        if (C0159.m3030() <= 0) {
            return ((g) obj).f4503p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static x0 m780(Object obj) {
        if (C0191.m3643() > 0) {
            return ((c3) obj).f8797f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m781() {
        if (C0277.m5361() < 0) {
            return d.f11040f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۧ, reason: not valid java name and contains not printable characters */
    public static z m782(Object obj) {
        if (C0249.m4779() <= 0) {
            return ((k) obj).f1283n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m783(Object obj, long j10) {
        if (C0411.m8066() <= 0) {
            return ((p7) obj).t(j10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۢ, reason: not valid java name and contains not printable characters */
    public static Task m785(Object obj, Object obj2) {
        if (C0369.m7254() > 0) {
            return ((DocumentReference) obj).get((Source) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۠, reason: not valid java name and contains not printable characters */
    public static int m786(Object obj) {
        if (C0148.m2838() < 0) {
            return ((w) obj).f5980a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡ۠۠, reason: not valid java name and contains not printable characters */
    public static float m787() {
        if (C0307.m5935() > 0) {
            return u4.f9535f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static u9.d m788(Object obj) {
        if (C0190.m3639() > 0) {
            return ((a3) obj).f8716a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m789(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m790(String str) {
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

    /* JADX INFO: renamed from: ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static void m791(Object obj) {
        if (C0306.m5925() <= 0) {
            ((q3) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۢۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m792() {
        return (-877) ^ C0324.f472;
    }

    /* JADX INFO: renamed from: ۤۡ۟۟, reason: not valid java name and contains not printable characters */
    public static long m793(Object obj) {
        if (C0355.m6968() > 0) {
            return ((zzfi.zzg) obj).zzd();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m794() {
        if (C0484.m9436() < 0) {
            return "anti_detection_desc";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static long m795(Object obj) {
        if (C0021.m417() > 0) {
            return ((zzfi.zzj) obj).zzm();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨۥۥ, reason: not valid java name and contains not printable characters */
    public static String[] m796(Object obj, int i10) {
        if (C0319.m6181() >= 0) {
            return ((Resources) obj).getStringArray(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static long m797() {
        if (C0312.m6046() >= 0) {
            return zzne.zzm();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Resources m798(Object obj) {
        if (C0035.m690() < 0) {
            return ((Context) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m784(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
