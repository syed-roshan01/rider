package k8;

import android.os.Parcelable;
import androidx.lifecycle.C0043;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.annotations.C0127;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.proto.C0162;
import f4.y;
import f5.w;
import fa.C0282;
import g.C0284;
import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.util.Date;
import k0.m4;
import k0.p;
import k6.j;
import k6.l4;
import k6.p7;
import k6.w5;
import m0.q2;
import m5.C0356;
import q0.C0383;
import rikka.shizuku.C0407;
import u7.C0438;
import u8.e;
import v0.C0441;

/* JADX INFO: renamed from: k8.ۣ۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0339 {

    /* JADX INFO: renamed from: ۟۠ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f609 = 814;

    /* JADX INFO: renamed from: ۟۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m6639(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static l4 m6640(Object obj) {
        if (C0438.m8543() >= 0) {
            return ((y) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static String m6641() {
        if (C0130.m2511() >= 0) {
            return "consent_settings";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۦ, reason: not valid java name and contains not printable characters */
    public static String m6642(Object obj, Object obj2) {
        if (C0282.m5443() <= 0) {
            return ((DateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m6643(Object obj, long j10) {
        if (C0441.m8597() >= 0) {
            return ((zzfi.zzj.zza) obj).zzj(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m6644(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static int m6645() {
        return 939 ^ C0356.f626;
    }

    /* JADX INFO: renamed from: ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static e m6646(Object obj, Object obj2, Object obj3) {
        if (C0162.m3105() >= 0) {
            return ((w) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6647(Object obj) {
        if (C0407.m7977() < 0) {
            ((p7) obj).N();
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static zzdd m6648(Object obj) {
        if (C0109.m2116() < 0) {
            return ((w5) obj).f10462g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m6649(Object obj) {
        if (C0284.m5468() >= 0) {
            return ((q2) obj).f11672h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static long m6650(Object obj) {
        if (C0127.m2448() > 0) {
            return ((m4) obj).K;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤۨۡ, reason: contains not printable characters */
    public static Parcelable.Creator m6652() {
        if (C0383.m7487() <= 0) {
            return j.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6653(Object obj) {
        if (C0043.m833() > 0) {
            return ((p) obj).f9330e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6651(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
