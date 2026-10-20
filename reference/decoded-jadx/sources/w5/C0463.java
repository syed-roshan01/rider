package w5;

import a.C0001;
import a2.h;
import a8.C0010;
import android.content.ContentValues;
import android.net.Uri;
import android.view.Choreographer;
import b.C0049;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.data.model.SupportedApp;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.iid.C0169;
import com.google.firebase.messaging.C0191;
import com.google.firebase.platforminfo.C0193;
import d5.c0;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.aliasof.C0247;
import e1.C0259;
import f0.x;
import f6.C0278;
import h.C0296;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.e1;
import k0.q3;
import k0.t;
import k6.m4;
import k6.p5;
import k6.p7;
import k6.q6;
import m0.l3;
import o7.d0;
import q.z;
import q6.C0388;
import rikka.shizuku.C0406;
import s7.C0414;
import u.C0428;
import y0.o;
import z7.C0489;
import z7.C0490;

/* JADX INFO: renamed from: w5.ۣۨۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0463 {

    /* JADX INFO: renamed from: ۟۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static int f734 = 291;

    /* JADX INFO: renamed from: ۟۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9017(Object obj) {
        if (C0161.m3081() < 0) {
            return ((SupportedApp) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static f m9018() {
        if (C0428.m8409() < 0) {
            return d0.f12588q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m9019(Object obj) {
        if (C0079.m1701() > 0) {
            return ((m4) obj).f10203c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m9020(Object obj) {
        if (C0296.m5709() <= 0) {
            return ((zzfi.zzc) obj).zzi();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۠, reason: not valid java name and contains not printable characters */
    public static o m9021() {
        if (C0010.m199() >= 0) {
            return e1.f8863a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۡ, reason: not valid java name and contains not printable characters */
    public static e6.b m9023(Object obj) {
        if (C0414.m8130() <= 0) {
            return ((p5) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static String m9024(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static e6.b m9025(Object obj) {
        if (C0193.m3691() <= 0) {
            return ((p7) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۦ, reason: not valid java name and contains not printable characters */
    public static Choreographer m9026() {
        if (C0137.m2646() <= 0) {
            return Choreographer.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static CouponData m9027(Object obj, Object obj2, int i10, int i11, int i12, int i13, Object obj3, long j10, boolean z10, boolean z11, long j11) {
        if (C0388.m7600() <= 0) {
            return ((CouponData) obj).copy((String) obj2, i10, i11, i12, i13, (List) obj3, j10, z10, z11, j11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m9028(Object obj, Object obj2) {
        if (C0489.m9528() > 0) {
            return ((Uri.Builder) obj).scheme((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۦ, reason: not valid java name and contains not printable characters */
    public static List m9029(Object obj) {
        if (C0083.m1779() >= 0) {
            return ((zzfi.zzl) obj).zzj();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9030(int i10) {
        if (C0160.m3070() < 0) {
            return a7.a.G(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int m9031(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۥۥۤ, reason: not valid java name and contains not printable characters */
    public static long m9032(Object obj) {
        if (C0278.m5394() > 0) {
            return ((k0.m4) obj).f9225e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9033() {
        return (-699) ^ C0259.f339;
    }

    /* JADX INFO: renamed from: ۤۢۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9034(Object obj) {
        if (C0247.m4732() < 0) {
            return ((z) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static long m9035(Object obj) {
        if (C0229.m4421() <= 0) {
            return ((q6) obj).f10326c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۦۡ, reason: contains not printable characters */
    public static zzfi.zzj.zza m9036(Object obj) {
        if (C0278.m5394() > 0) {
            return ((zzfi.zzj.zza) obj).zzl();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static long m9037(Object obj) {
        if (C0191.m3643() >= 0) {
            return ((k0.m4) obj).f9222b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦۥۥ, reason: contains not printable characters */
    public static int m9038(Object obj) {
        if (C0490.m9552() >= 0) {
            return ((h) obj).f931a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۥ, reason: contains not printable characters */
    public static long m9039(Object obj) {
        if (C0169.m3245() >= 0) {
            return ((q3) obj).f9398e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static c0.f m9040(Object obj) {
        if (C0049.m945() >= 0) {
            return ((x) obj).f5998q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m9041(Object obj, Object obj2) {
        if (C0237.m4583() >= 0) {
            return ((ContentValues) obj).containsKey((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m9042(Object obj) {
        if (C0406.m7977() < 0) {
            return ((k0.m4) obj).C;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static l3 m9043(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((c0) obj).f4434o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m9044(Object obj, Object obj2) {
        if (C0001.m35() <= 0) {
            return ((t) obj).invoke(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m9022(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
