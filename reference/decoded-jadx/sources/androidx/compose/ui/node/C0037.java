package androidx.compose.ui.node;

import a2.s;
import a2.x;
import android.content.pm.ApplicationInfo;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.semantics.C0039;
import c9.f;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.installations.ktx.C0175;
import com.google.protobuf.C0209;
import d5.f0;
import f0.C0271;
import f1.C0273;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import k0.d2;
import k0.l1;
import k0.x3;
import k0.y4;
import k4.C0336;
import k6.a5;
import k6.u7;
import k6.w6;
import l3.C0342;
import m0.e1;
import m0.y2;
import m1.C0350;
import m5.C0355;
import m9.l;
import n9.C0366;
import s7.C0414;
import u1.C0432;
import v8.C0450;
import y3.e;
import y6.C0477;
import z8.C0491;

/* JADX INFO: renamed from: androidx.compose.ui.node.ۦ۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0037 {

    /* JADX INFO: renamed from: ۦ۠ۡ۟, reason: contains not printable characters */
    public static int f57 = 677;

    /* JADX INFO: renamed from: ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m715(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m716(Object obj) {
        if (C0209.m4013() > 0) {
            return ((x3) obj).f9647a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static f m717(Object obj) {
        if (C0414.m8130() < 0) {
            return ((y4) obj).f9679e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m718(long j10) {
        if (C0477.m9312() < 0) {
            return m2.a.e(j10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static long m719(Object obj) {
        if (C0034.m667() > 0) {
            return ((zzfc.zzd) obj).zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ۠, reason: not valid java name and contains not printable characters */
    public static List m720(Object obj) {
        if (C0450.m8792() <= 0) {
            return ((zzfi.zze.zza) obj).zzf();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m721(Object obj) {
        if (C0432.m8470() > 0) {
            return ((u7) obj).f10429g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static c9.a m722(Object obj) {
        if (C0120.m2311() <= 0) {
            return ((d2) obj).f8828b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static Map m723(Object obj) {
        if (C0491.m9566() >= 0) {
            return ((zzad) obj).zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m724(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۡ, reason: not valid java name and contains not printable characters */
    public static Class m725(Object obj, Object obj2) {
        if (C0273.m5273() < 0) {
            return ((ClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۣ, reason: not valid java name and contains not printable characters */
    public static int m726(Object obj) {
        if (C0355.m6968() >= 0) {
            return e.p((e1) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m727(Object obj) {
        if (C0073.m1597() >= 0) {
            return ((f0) obj).f4481a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m728(Object obj, Object obj2) {
        if (C0350.m6878() <= 0) {
            ((y2) obj).setValue(obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m729(Object obj) {
        if (C0039.m764() >= 0) {
            return ((ApplicationInfo) obj).flags;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m730(Object obj) {
        if (C0100.m1959() < 0) {
            return ((a5) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static c9.e m731(Object obj) {
        if (C0366.m7189() >= 0) {
            return ((l1) obj).f9160p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۧ, reason: contains not printable characters */
    public static int m733() {
        return (-818) ^ C0336.f520;
    }

    /* JADX INFO: renamed from: ۧ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static s m734(Object obj) {
        if (C0175.m3346() >= 0) {
            return ((x) obj).f1045o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۥۡ, reason: not valid java name and contains not printable characters */
    public static int m735(Object obj) {
        if (C0271.m5222() <= 0) {
            return ((w6) obj).f10466a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m736(Object obj) {
        if (C0342.m6720() >= 0) {
            ((l) obj).t();
        }
    }

    /* JADX INFO: renamed from: ۨۧۤ۠, reason: not valid java name and contains not printable characters */
    public static zzfc.zza.zze m737(Object obj) {
        if (C0022.m444() <= 0) {
            return ((zzfc.zza.zzc) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static String m732(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
