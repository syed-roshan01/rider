package r9;

import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.draw.C0027;
import c1.C0058;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.provider.C0194;
import d5.b0;
import d8.C0221;
import f.C0270;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.x1;
import k6.b4;
import k6.t4;
import m0.C0349;
import m0.g1;
import m9.e0;
import p9.q0;
import q7.C0390;
import r2.C0395;
import u1.C0432;
import x0.C0466;

/* JADX INFO: renamed from: r9.۟ۢۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0405 {

    /* JADX INFO: renamed from: ۟ۥۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int f676 = 80;

    /* JADX INFO: renamed from: ۟۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static k6.m m7947(Object obj) {
        if (C0058.m1106() >= 0) {
            return ((b4) obj).f9911c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m7948() {
        if (C0100.m1959() < 0) {
            return "Error incrementing retry count. error";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۤ, reason: not valid java name and contains not printable characters */
    public static long m7949() {
        if (C0109.m2116() <= 0) {
            return e5.a.f5141q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static SupportedApp.Companion m7950() {
        if (C0150.m2892() <= 0) {
            return SupportedApp.Companion;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static g1 m7951(Object obj, Object obj2, int i10) {
        if (C0118.m2274() <= 0) {
            return e0.u((x.l) obj, (m0.m) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m7952() {
        return (-333) ^ C0152.f177;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7953(Object obj) {
        if (C0432.m8470() >= 0) {
            return ((b0) obj).f4406b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7954(Object obj, Object obj2, Object obj3) {
        if (C0027.m541() > 0) {
            m0.s.b(obj, (c9.e) obj2, (m0.m) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۧ, reason: not valid java name and contains not printable characters */
    public static int m7955(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۤ, reason: not valid java name and contains not printable characters */
    public static zzfc.zza.zzd m7956() {
        if (C0349.m6838() <= 0) {
            return zzfc.zza.zzd.GRANTED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static zzew.zzb.zza m7958(Object obj, int i10, Object obj2) {
        if (C0466.m9086() > 0) {
            return ((zzew.zzb.zza) obj).zza(i10, (zzew.zzc) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7959(Object obj, int i10) {
        if (C0194.m3713() > 0) {
            return ((c1.f) obj).b(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static long m7960(Object obj) {
        if (C0390.m7643() <= 0) {
            return ((x1) obj).f9641d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m7961(String str) {
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

    /* JADX INFO: renamed from: ۤ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m7962(Object obj) {
        if (C0072.m1556() > 0) {
            return ((f5.k) obj).f6286o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۥۦ, reason: contains not printable characters */
    public static String m7963(Object obj, Object obj2, Object obj3) {
        if (C0270.m5170() <= 0) {
            return ((t4) obj).a((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m7964(Object obj) {
        if (C0395.m7737() >= 0) {
            return ((MainViewModel) obj).j();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m7965(Object obj) {
        if (C0016.m315() >= 0) {
            return d7.t.e0((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۥ, reason: not valid java name and contains not printable characters */
    public static q0 m7966(Object obj) {
        if (C0221.m4264() > 0) {
            return ((MainViewModel) obj).f3121v0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m7957(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
