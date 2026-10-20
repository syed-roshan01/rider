package z7;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.layout.C0036;
import c7.C0068;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.measurement_impl.C0185;
import d1.C0211;
import d5.q;
import e2.C0260;
import ea.C0267;
import g2.C0287;
import g8.t3;
import h0.C0299;
import i5.C0318;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import k0.k;
import k0.l;
import k0.l3;
import k0.q1;
import k0.r;
import p9.z;
import v9.C0451;
import y.t0;

/* JADX INFO: renamed from: z7.۟ۢۧۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0489 {

    /* JADX INFO: renamed from: ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int f763 = -531;

    /* JADX INFO: renamed from: ۟۠ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static l3 m9523() {
        if (C0119.m2289() > 0) {
            return l3.f9184b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m9524(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static c9.e m9525(Object obj) {
        if (C0036.m698() <= 0) {
            return ((l) obj).f9120b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۢ, reason: not valid java name and contains not printable characters */
    public static String m9526() {
        if (C0287.m5529() >= 0) {
            return "attribution_eligibility_status";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9528() {
        return (-594) ^ C0113.f139;
    }

    /* JADX INFO: renamed from: ۡۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m9529(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m9530(Object obj) {
        if (C0299.m5752() < 0) {
            return ((zzfc.zzd) obj).zzj();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨۡ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m9531(Object obj, int i10) {
        if (C0260.m4984() >= 0) {
            return ((zzfi.zzj.zza) obj).zzi(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m9532(Object obj) {
        if (C0087.m1852() > 0) {
            ((t3) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۡ, reason: not valid java name and contains not printable characters */
    public static c9.e m9533(Object obj) {
        if (C0318.m6163() <= 0) {
            return ((k) obj).f9081b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static Intent m9534(Object obj, Object obj2) {
        if (C0068.m1322() > 0) {
            return ((Intent) obj).setComponent((ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static z m9535(Object obj) {
        if (C0032.m620() < 0) {
            return ((MainViewModel) obj).f3102m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static int m9536(Object obj) {
        if (C0107.m2075() < 0) {
            return ((r) obj).f9415a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۡۦ, reason: contains not printable characters */
    public static int m9537(Object obj) {
        if (C0211.m4046() > 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۤۢ, reason: contains not printable characters */
    public static u0.b m9538() {
        if (C0185.m3538() > 0) {
            return q.f4734k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9539(Object obj) {
        if (C0451.m8793() < 0) {
            return ((ApplicationInfo) obj).targetSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static t0 m9540(Object obj) {
        if (C0267.m5113() < 0) {
            return ((q1) obj).f9386u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m9527(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
