package v;

import android.view.View;
import androidx.compose.ui.platform.C0038;
import c7.C0069;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.firebase.emulators.C0140;
import com.google.firebase.iid.C0169;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.reporting.C0189;
import f.C0270;
import f1.C0274;
import h.C0299;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import k0.r4;
import k6.p7;
import k7.C0338;
import l0.C0341;
import n.C0361;
import n7.C0364;
import p3.C0376;
import q6.C0388;

/* JADX INFO: renamed from: v.ۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0440 {

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int f710 = 964;

    /* JADX INFO: renamed from: ۟۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static zzkj m8566(Object obj) {
        if (C0189.m3621() >= 0) {
            return ((zzix.zzb) obj).zzab();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static long m8567() {
        if (C0274.m5273() < 0) {
            return l0.c.D;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8568(Object obj) {
        if (C0069.m1332() <= 0) {
            return ((k0.j) obj).f9051a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ۟, reason: not valid java name and contains not printable characters */
    public static b4.g m8569(Object obj) {
        if (C0270.m5152() > 0) {
            return y3.e.j0((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static a2.c0 m8570(Object obj) {
        if (C0169.m3245() >= 0) {
            return ((r4) obj).f9440y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m8571(Object obj) {
        if (C0341.m6681() >= 0) {
            return ((PriorityQueue) obj).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8572() {
        if (C0361.m7073() <= 0) {
            return "Too many conditional properties, ignoring";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Calendar m8573() {
        if (C0299.m5742() > 0) {
            return Calendar.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦ۠, reason: not valid java name and contains not printable characters */
    public static HashSet m8574(Object obj) {
        if (C0179.m3417() >= 0) {
            return ((p7) obj).f10302q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static void m8575(Object obj, Object obj2, int i10) {
        if (C0388.m7585() >= 0) {
            ((k0.l0) obj).b((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۡ, reason: not valid java name and contains not printable characters */
    public static m0.k1 m8576(float f10) {
        if (C0388.m7585() >= 0) {
            return m9.e0.H(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m8577(Object obj) {
        if (C0364.m7127() < 0) {
            return ((k0.o) obj).f9281a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static k0.m1 m8578(Object obj) {
        if (C0331.m6374() > 0) {
            return ((k0.k1) obj).f9093a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8579(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m8581() {
        if (C0078.m1692() >= 0) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8582() {
        return (-552) ^ C0140.f166;
    }

    /* JADX INFO: renamed from: ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m8583(String str) {
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

    /* JADX INFO: renamed from: ۦۡ۠ۤ, reason: contains not printable characters */
    public static zzew.zza.C0093zza m8584(Object obj, int i10, Object obj2) {
        if (C0038.m750() <= 0) {
            return ((zzew.zza.C0093zza) obj).zza(i10, (zzew.zze.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static zzew.zzf m8585(Object obj) {
        if (C0376.m7362() >= 0) {
            return ((zzew.zzc) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m8586(Object obj, Object obj2) {
        if (C0338.m6638() <= 0) {
            return ((TreeMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8580(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
