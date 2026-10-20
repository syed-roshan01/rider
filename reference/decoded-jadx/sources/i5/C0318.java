package i5;

import a2.y;
import a5.i0;
import a6.C0007;
import android.app.Activity;
import android.os.Parcel;
import android.util.SparseArray;
import androidx.startup.C0047;
import com.auto.accept.data.model.AppConfig;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.abt.C0113;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.messaging.reporting.C0190;
import d5.k;
import d5.l;
import e1.C0259;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.b2;
import k0.l2;
import k6.p6;
import k6.q6;
import l3.C0342;
import m0.C0349;
import m0.m;
import p9.q0;
import t2.C0420;
import t9.C0427;
import u0.C0430;
import v6.C0447;
import v9.C0451;
import y.i1;
import y0.o;
import y9.C0479;

/* JADX INFO: renamed from: i5.ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0318 {

    /* JADX INFO: renamed from: ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int f466 = 175;

    /* JADX INFO: renamed from: ۟۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static zzew.zzc.zza m6158(Object obj, Object obj2) {
        if (C0447.m8732() < 0) {
            return ((zzew.zzc.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m6159(Object obj) {
        if (C0427.m8371() <= 0) {
            return ((SparseArray) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m6160(int i10, Object obj) {
        if (C0113.m2182() < 0) {
            y3.e.d1(i10, (Parcel) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m6161(Object obj) {
        if (C0349.m6838() < 0) {
            return ((AppConfig) obj).getMerchantId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static l m6162() {
        if (C0342.m6720() > 0) {
            return l.J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6163() {
        return (-897) ^ C0420.f691;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m6164(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6165(Object obj, int i10, Object obj2) {
        if (C0430.m8425() >= 0) {
            ((zzbu) obj).zzb(i10, (Parcel) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۧۡ, reason: not valid java name and contains not printable characters */
    public static void m6166(Object obj, long j10, float f10, long j11, int i10, Object obj2, int i11, int i12) {
        if (C0047.m904() < 0) {
            b2.a((o) obj, j10, f10, j11, i10, (m) obj2, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m6167() {
        if (C0430.m8425() >= 0) {
            return "Updating a conditional user property with different origin. name, origin, origin (from DB)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m6168(Object obj) {
        if (C0007.m154() <= 0) {
            return ((k) obj).f4594a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۥۧ, reason: not valid java name and contains not printable characters */
    public static List m6169() {
        if (C0451.m8793() < 0) {
            return g5.b.f6616a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۦ, reason: not valid java name and contains not printable characters */
    public static long m6170(long j10, long j11, float f10) {
        if (C0479.m9346() >= 0) {
            return y.c(j10, j11, f10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m6171(Object obj, Object obj2, Object obj3, boolean z10) {
        if (C0190.m3639() >= 0) {
            ((p6) obj).y((Activity) obj2, (q6) obj3, z10);
        }
    }

    /* JADX INFO: renamed from: ۥ۠۟ۧ, reason: contains not printable characters */
    public static q0 m6172(Object obj) {
        if (C0138.m2662() > 0) {
            return ((i0) obj).f1274d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۡ, reason: contains not printable characters */
    public static i1 m6173(Object obj) {
        if (C0078.m1692() >= 0) {
            return ((l2) obj).f9179p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m6174(Object obj) {
        if (C0151.m2903() > 0) {
            return ((ByteArrayOutputStream) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m6175(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۤۦۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m6176(Object obj) {
        if (C0259.m4959() <= 0) {
            return ((y3.b) obj).f16884h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m6177(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
