package androidx.compose.ui.input.pointer;

import a4.q;
import a5.a;
import a5.g0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.C0128;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.ktx.C0157;
import d4.C0218;
import d5.v1;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.aggregatedroot.C0247;
import h8.C0314;
import i9.C0322;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.f0;
import k0.m2;
import k0.y;
import k6.c6;
import k6.f5;
import k6.g6;
import k6.y7;
import m0.m;
import o1.k;
import q8.i;
import r7.C0404;
import u2.C0434;
import u7.C0438;
import w5.C0464;
import y.i1;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.ۨۦۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0034 {

    /* JADX INFO: renamed from: ۣۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int f54 = 519;

    /* JADX INFO: renamed from: ۟۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static i1 m659(Object obj) {
        if (C0228.m4380() > 0) {
            return ((m2) obj).f9214o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m661() {
        if (C0438.m8543() >= 0) {
            return "hi";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static f5 m662(Object obj) {
        if (C0131.m2522() > 0) {
            return ((y7) obj).f10586a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m663(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int m664(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static q m665(Object obj) {
        if (C0218.m4144() > 0) {
            return ((a) obj).f1217a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m666(Object obj) {
        if (C0404.m7911() < 0) {
            return s.b((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m667() {
        return (-730) ^ C0107.f133;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m668(Object obj) {
        if (C0314.m6072() < 0) {
            return ((c6) obj).f9940d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static List m669(Object obj) {
        if (C0322.m6226() <= 0) {
            return ((k) obj).f12397a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m670(Object obj, Object obj2) {
        if (C0128.m2475() < 0) {
            return ((zzfi.zzj.zza) obj).zza((zzfi.zzb) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m671(Object obj, Object obj2, int i10) {
        if (C0464.m9033() > 0) {
            ((v1) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static y m672(Object obj) {
        if (C0151.m2903() > 0) {
            return ((f0) obj).f8905f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۦ, reason: not valid java name and contains not printable characters */
    public static i m673() {
        if (C0434.m8481() >= 0) {
            return g0.f1259a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦۣ, reason: not valid java name and contains not printable characters */
    public static PendingIntent m674(Object obj, int i10, Object obj2, int i11) {
        if (C0247.m4717() <= 0) {
            return zzcc.zza((Context) obj, i10, (Intent) obj2, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static String m675() {
        if (C0078.m1692() >= 0) {
            return "event_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m676(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((g6) obj).f10069f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m660(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
