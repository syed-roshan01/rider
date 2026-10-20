package i;

import aa.C0012;
import android.os.Looper;
import androidx.compose.ui.platform.C0038;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.heartbeatinfo.C0167;
import e0.C0256;
import g5.b;
import h8.C0314;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.i0;
import k6.a7;
import l.z2;
import l8.C0345;
import m0.x1;
import m0.y1;
import m5.C0355;

/* JADX INFO: renamed from: i.ۣۢۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0316 {

    /* JADX INFO: renamed from: ۟ۥۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f464 = 175;

    /* JADX INFO: renamed from: ۟۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m6120() {
        return 623 ^ C0355.f626;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static long m6121(Object obj) {
        if (C0320.m6200() >= 0) {
            return ((i0) obj).A;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m6122(Object obj, Object obj2) {
        if (C0167.m3200() >= 0) {
            return b.b((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m6123(String str) {
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

    /* JADX INFO: renamed from: ۟ۥ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m6124(Object obj, Object obj2, Object obj3) {
        if (C0314.m6079() >= 0) {
            return ((y1) obj).c((x1) obj2, obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static zzew.zzd.zzb m6125() {
        if (C0038.m750() < 0) {
            return zzew.zzd.zzb.BETWEEN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6126(Object obj) {
        if (C0345.m6759() < 0) {
            return ((a7) obj).f9893a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۤ, reason: not valid java name and contains not printable characters */
    public static int m6127(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۤۢ, reason: not valid java name and contains not printable characters */
    public static zzfi.zze.zza m6128(Object obj, Object obj2) {
        if (C0012.m226() >= 0) {
            return ((zzfi.zze.zza) obj).zza((zzfi.zzg) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static List m6129(Object obj) {
        if (C0152.m2931() > 0) {
            return ((zzew.zzf) obj).zzf();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۨ, reason: contains not printable characters */
    public static Object m6130(Object obj) {
        if (C0142.m2725() > 0) {
            return ((z2) obj).f10985d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ۟, reason: not valid java name and contains not printable characters */
    public static Looper m6132() {
        if (C0256.m4901() < 0) {
            return Looper.myLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6131(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
