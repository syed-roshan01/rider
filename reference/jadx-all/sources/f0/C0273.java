package f0;

import android.os.Parcel;
import androidx.compose.ui.draw.C0029;
import androidx.fragment.app.C0042;
import c4.C0065;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.service.C0072;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.auth.C0146;
import d1.C0213;
import d4.C0218;
import dagger.hilt.internal.definecomponent.C0250;
import dagger.hilt.migration.C0255;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;
import k0.a3;
import k0.h3;
import k6.x3;
import la.C0349;
import m7.C0359;
import n7.C0365;
import r5.C0400;
import r7.C0404;
import y9.C0479;

/* JADX INFO: renamed from: f0.ۣۤ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0273 {

    /* JADX INFO: renamed from: ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int f388 = 332;

    /* JADX INFO: renamed from: ۟ۡۦۡۦ, reason: not valid java name and contains not printable characters */
    public static CouponData m5238(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((f5.l) obj).f6294n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static d5.l m5239() {
        if (C0365.m7147() <= 0) {
            return d5.l.f4631o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5241(Object obj, long j10) {
        if (C0213.m4051() >= 0) {
            return ((zzfi.zzj.zza) obj).zzl(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m5242(Object obj) {
        if (C0072.m1556() >= 0) {
            return ((Parcel) obj).readInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static i1.f m5243() {
        if (C0124.m2386() >= 0) {
            return f6.a.f6368q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5244(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5245(Object obj, Object obj2) {
        if (C0349.m6818() < 0) {
            return URLEncoder.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m5246(Object obj, Object obj2) {
        if (C0400.m7828() > 0) {
            return ((a5.y) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5247(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m5248(Object obj) {
        if (C0042.m820() >= 0) {
            return ((zzew.zzb) obj).zzf();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m5249() {
        return (-842) ^ C0359.f629;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static x3 m5250() {
        if (C0255.m4866() <= 0) {
            return k6.x.f10480e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static long m5251(double d10) {
        if (C0324.m6259() <= 0) {
            return Double.doubleToRawLongBits(d10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5252(Object obj) {
        if (C0404.m7911() < 0) {
            return ((y3.a) obj).f16873a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5253(Object obj) {
        if (C0029.m568() < 0) {
            return ((h3) obj).f8980a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5254(Object obj) {
        if (C0065.m1257() <= 0) {
            return ((r1) obj).f5876d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۦۡ, reason: contains not printable characters */
    public static a3 m5255(Object obj) {
        if (C0479.m9326() < 0) {
            return ((d5.p0) obj).f4717d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m5256(Object obj) {
        if (C0218.m4144() >= 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5257(Object obj, Object obj2) {
        if (C0250.m4779() <= 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m5240(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
