package h;

import android.support.v4.app.C0015;
import androidx.compose.foundation.C0026;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.remote.C0165;
import dagger.hilt.android.migration.C0240;
import f0.c2;
import f0.h;
import f0.t;
import f4.C0276;
import f6.C0278;
import i.C0317;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import k0.h0;
import k0.i0;
import k6.x;
import k6.x3;
import l9.i;
import m0.m;
import n9.C0367;
import q1.C0384;
import u0.C0431;
import u1.C0432;
import w0.C0455;
import y0.o;
import y3.e;

/* JADX INFO: renamed from: h.ۥۦۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0299 {

    /* JADX INFO: renamed from: ۤۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int f446 = -139;

    /* JADX INFO: renamed from: ۟۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static x3 m5731() {
        if (C0015.m294() < 0) {
            return x.G0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m5732(Object obj) {
        if (C0086.m1846() > 0) {
            return ((h) obj).f5728y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static o m5733(Object obj, Object obj2) {
        if (C0074.m1607() <= 0) {
            return androidx.compose.ui.draw.a.d((o) obj, (c9.c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5734(Object obj, Object obj2, int i10, boolean z10, int i11) {
        if (C0165.m3154() <= 0) {
            return i.P0((CharSequence) obj, (String) obj2, i10, z10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static float m5735(Object obj) {
        if (C0240.m4596() >= 0) {
            return ((h0) obj).f8967e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5736(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۦۤ, reason: not valid java name and contains not printable characters */
    public static long m5737(Object obj) {
        if (C0278.m5361() < 0) {
            return ((i0) obj).f9019w;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m5738() {
        if (C0455.m8861() < 0) {
            return "Safelisted events should not be an empty list. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static x3 m5739() {
        if (C0026.m508() >= 0) {
            return x.R;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m5740(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static long m5741(Object obj) {
        if (C0135.m2608() <= 0) {
            return ((zzfi.zzj) obj).zzs();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static int m5742() {
        return 866 ^ C0367.f637;
    }

    /* JADX INFO: renamed from: ۥۣۣۤ, reason: contains not printable characters */
    public static int m5743(long j10) {
        if (C0043.m833() > 0) {
            return androidx.compose.ui.graphics.a.s(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۡۢ, reason: contains not printable characters */
    public static int m5744(Object obj) {
        if (C0317.m6120() <= 0) {
            return ((h8.i) obj).f7654g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۧۧ, reason: contains not printable characters */
    public static void m5746(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0431.m8425() >= 0) {
            e.A((String) obj, (String) obj2, (c9.a) obj3, (m) obj4, i10);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m5747() {
        if (C0432.m8447() <= 0) {
            return zzew.zzf.zza.EXACT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m5748(Object obj) {
        if (C0276.m5308() > 0) {
            return ((zzfi.zzj.zza) obj).zzt();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۥ, reason: not valid java name and contains not printable characters */
    public static c2 m5749(Object obj) {
        if (C0384.m7523() <= 0) {
            return ((t) obj).f5900a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢۥ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m5750(Object obj) {
        if (C0327.m6304() <= 0) {
            return ((zzfi.zzj.zza) obj).zzo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static String m5745(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
