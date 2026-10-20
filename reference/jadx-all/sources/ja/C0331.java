package ja;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.layout.C0036;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.C0177;
import com.google.firebase.measurement.C0184;
import dagger.hilt.internal.aliasof.C0248;
import e1.C0258;
import e1.C0259;
import f0.c2;
import f0.p1;
import fa.C0281;
import g2.C0288;
import g5.C0291;
import ga.C0296;
import h.C0297;
import h3.C0302;
import ia.C0323;
import java.io.ByteArrayOutputStream;
import k0.d2;
import k0.o4;
import k0.r4;
import k6.d4;
import k6.f4;
import k6.m4;
import k6.t4;
import k6.x3;
import p8.C0380;
import t1.x0;
import u8.C0439;
import w6.C0465;
import x4.C0469;
import y.j1;

/* JADX INFO: renamed from: ja.ۥۣۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0331 {

    /* JADX INFO: renamed from: ۟۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int f478 = 381;

    /* JADX INFO: renamed from: ۟۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m6369(Object obj, Object obj2, Object obj3) {
        if (C0144.m2767() > 0) {
            ((t4) obj).w((String) obj2, (zzfc.zzd.zza) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static String m6371() {
        if (C0105.m2045() >= 0) {
            return "select app_id from queue order by has_realtime desc, rowid asc limit 1;";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m6372(Object obj, Object obj2, int i10) {
        if (C0034.m667() >= 0) {
            ((f0.c) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static x.o m6373(Object obj) {
        if (C0297.m5709() < 0) {
            return ((x.p) obj).f16280a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m6374() {
        return 208 ^ C0302.f449;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m6375(Object obj) {
        if (C0469.m9123() < 0) {
            return ((g9.d) obj).b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m6376(Object obj) {
        if (C0184.m3517() > 0) {
            return ((x3) obj).f10529c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m6377(Object obj) {
        if (C0439.m8564() > 0) {
            return ((d9.c) obj).f4935b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static c2 m6378(Object obj) {
        if (C0083.m1779() > 0) {
            return ((p1) obj).f5846a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static x0 m6379(Object obj) {
        if (C0323.m6244() > 0) {
            return ((androidx.compose.ui.node.a) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ۠, reason: not valid java name and contains not printable characters */
    public static long m6380() {
        if (C0168.m3229() >= 0) {
            return e5.a.f5134j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m6381(Object obj) {
        if (C0296.m5679() >= 0) {
            return l9.i.W0((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m6382(Object obj) {
        if (C0169.m3245() > 0) {
            return ((r4) obj).f9429n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m6383(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۦۢۥ, reason: not valid java name and contains not printable characters */
    public static int m6384(Object obj) {
        if (C0281.m5432() > 0) {
            return ((zzew.zza.C0093zza) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۨ۠, reason: not valid java name and contains not printable characters */
    public static f4 m6385(Object obj) {
        if (C0288.m5529() >= 0) {
            return ((d4) obj).f9967i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static long m6386() {
        if (C0465.m9059() < 0) {
            return l0.c.f11028t;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static j1 m6387(Object obj) {
        if (C0380.m7433() > 0) {
            return y.c0.c((m0.m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m6388(Object obj) {
        if (C0248.m4732() <= 0) {
            return ((o4) obj).f9323a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static u8.e m6389(Object obj, Object obj2, Object obj3) {
        if (C0259.m4939() < 0) {
            return ((f5.z) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦۨ, reason: not valid java name and contains not printable characters */
    public static int m6390(Object obj) {
        if (C0036.m698() <= 0) {
            return ((m4) obj).f10201a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6391(Object obj) {
        if (C0034.m667() > 0) {
            return ((d2) obj).f8829c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۥ۟, reason: not valid java name and contains not printable characters */
    public static int m6392(Object obj) {
        if (C0258.m4918() >= 0) {
            return ((d5.c) obj).f4425a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۨۡ, reason: contains not printable characters */
    public static String m6393(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۧۦۡ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m6394(Object obj, Object obj2) {
        if (C0177.m3380() >= 0) {
            return y3.i.a((PackageManager) obj, (Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static c9.e m6395(Object obj) {
        if (C0291.m5589() <= 0) {
            return ((k0.k) obj).f9090r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m6370(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
