package l9;

import android.database.sqlite.SQLiteDatabase;
import android.os.C0013;
import android.os.Parcel;
import androidx.compose.foundation.relocation.C0024;
import b.C0049;
import c7.C0069;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.ktx.C0157;
import com.google.protobuf.v;
import d5.a1;
import d5.k0;
import d5.m;
import e2.C0264;
import h7.C0312;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import k0.y2;
import k3.C0335;
import k6.d7;
import k6.k;
import k6.q6;
import m0.g1;
import m7.C0357;
import n8.C0366;
import o1.h0;
import o1.l;
import p8.C0380;
import p8.C0381;
import q0.C0383;
import q7.C0390;
import t3.C0425;
import u1.C0432;

/* JADX INFO: renamed from: l9.۟ۦۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0348 {

    /* JADX INFO: renamed from: ۧۢ۠۟, reason: not valid java name and contains not printable characters */
    public static int f618 = 384;

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6789(Object obj, Object obj2) {
        if (C0024.m487() >= 0) {
            return ((com.google.crypto.tink.shaded.protobuf.b) obj).a((j1) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6791(Object obj) {
        if (C0013.m253() > 0) {
            return ((zzew.zzb) obj).zzl();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static Set m6792(Object obj) {
        if (C0069.m1332() <= 0) {
            return ((Map) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Level m6793() {
        if (C0335.m6491() >= 0) {
            return Level.INFO;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static void m6794(Object obj) {
        if (C0131.m2522() >= 0) {
            ((SQLiteDatabase) obj).beginTransaction();
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6795(Object obj, Object obj2) {
        if (C0380.m7433() >= 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6796(Object obj) {
        if (C0425.m8322() >= 0) {
            return ((d7) obj).f9981d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6797(Object obj) {
        if (C0073.m1597() > 0) {
            return ((y2) obj).f9669a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6798(Object obj) {
        if (C0312.m6027() < 0) {
            return ((Parcel) obj).marshall();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6799() {
        if (C0383.m7487() < 0) {
            return zzqd.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m6800(int i10) {
        if (C0142.m2725() >= 0) {
            return v.c0(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m6801(Object obj) {
        if (C0390.m7627() <= 0) {
            return ((m) obj).f4671a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۡ, reason: not valid java name and contains not printable characters */
    public static int m6802(Object obj) {
        if (C0086.m1846() >= 0) {
            return ((a1) obj).f4394b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static i1.f m6803() {
        if (C0264.m5033() <= 0) {
            return h6.g.Z();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static UserProfile m6804(Object obj) {
        if (C0049.m945() > 0) {
            return ((f5.g) obj).f6258a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static long m6805(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((q6) obj).f10329f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public static g1 m6806(Object obj) {
        if (C0381.m7467() > 0) {
            return ((k0) obj).f4604n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m6807(Object obj) {
        if (C0366.m7172() >= 0) {
            ((k) obj).g0();
        }
    }

    /* JADX INFO: renamed from: ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int m6808() {
        return 1021 ^ C0366.f636;
    }

    /* JADX INFO: renamed from: ۤۦۣۧ, reason: not valid java name and contains not printable characters */
    public static Object m6809(Object obj, Object obj2, Object obj3) {
        if (C0432.m8447() <= 0) {
            return ((h0) obj).a((l) obj2, (w8.a) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦ۟, reason: contains not printable characters */
    public static zzfi.zzg.zza m6810(Object obj, Object obj2) {
        if (C0357.m6984() >= 0) {
            return ((zzfi.zzg.zza) obj).zza((zzfi.zzg.zza) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟ۨ, reason: contains not printable characters */
    public static int m6811(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static String m6812(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m6790(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
