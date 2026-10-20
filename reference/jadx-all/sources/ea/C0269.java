package ea;

import a6.C0007;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.platform.C0038;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.interop.C0196;
import d.C0211;
import d8.C0222;
import dagger.hilt.internal.definecomponent.C0250;
import f0.y1;
import h3.C0302;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import k0.g3;
import k0.k4;
import k0.o0;
import k0.y2;
import k0.z2;
import k6.f6;
import k6.w5;
import k6.x6;
import org.json.JSONObject;
import q7.C0390;
import r4.C0399;
import rikka.shizuku.C0407;
import s.C0408;
import y.t0;

/* JADX INFO: renamed from: ea.ۦۦۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0269 {

    /* JADX INFO: renamed from: ۟۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int f348 = 766;

    /* JADX INFO: renamed from: ۟۠ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5115(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m5116() {
        if (C0328.m6319() <= 0) {
            return m2.n.f11820c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5117(Object obj) {
        if (C0038.m750() <= 0) {
            return ((x6) obj).f10538c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠۟, reason: not valid java name and contains not printable characters */
    public static u0.b m5118() {
        if (C0181.m3452() <= 0) {
            return o0.f9284a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5119(Object obj) {
        if (C0152.m2931() > 0) {
            return ((Class) obj).getCanonicalName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static y1.u m5120() {
        if (C0007.m154() < 0) {
            return y1.r.f16824i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m5121(Object obj) {
        if (C0250.m4779() < 0) {
            return ((f6) obj).f10051f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static double m5122(Object obj, Object obj2, double d10) {
        return C0178.m3402() >= 0 ? ((JSONObject) obj).optDouble((String) obj2, d10) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m5123() {
        return 719 ^ C0160.f184;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۨ, reason: not valid java name and contains not printable characters */
    public static void m5124(int i10, Object obj, long j10, long j11, Object obj2, Object obj3, Object obj4, Object obj5, int i11, int i12) {
        if (C0211.m4028() < 0) {
            k4.a(i10, (y0.o) obj, j10, j11, (c9.f) obj2, (c9.e) obj3, (c9.e) obj4, (m0.m) obj5, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5125(Object obj) {
        if (C0390.m7627() < 0) {
            return ((g3) obj).f8956s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m5126(int i10, Object obj) {
        if (C0408.m7989() > 0) {
            return y3.e.z0(i10, (Parcel) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡ۟۠, reason: not valid java name and contains not printable characters */
    public static y2 m5127(Object obj) {
        if (C0023.m461() > 0) {
            return ((z2) obj).f9697b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static float m5128(Object obj, Object obj2) {
        if (C0302.m5797() < 0) {
            return ((t0) obj).a((m2.l) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static String m5129() {
        if (C0108.m2101() < 0) {
            return "Failed to insert/update conditional user property (got -1)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m5130(Object obj, Object obj2, Object obj3) {
        if (C0399.m7797() <= 0) {
            return ((a5.j) obj).h((String) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5131(Object obj) {
        if (C0407.m7977() <= 0) {
            return ((w5) obj).f10463h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5132(Object obj, Object obj2) {
        if (C0196.m3762() < 0) {
            return TextUtils.join((CharSequence) obj, (Iterable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧ۟, reason: contains not printable characters */
    public static void m5133(Object obj, Object obj2, Object obj3, int i10) {
        if (C0126.m2434() >= 0) {
            ((d5.t) obj).a((y.v) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۨۤۦۡ, reason: not valid java name and contains not printable characters */
    public static String m5134(String str) {
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

    /* JADX INFO: renamed from: ۨۥۦ۠, reason: not valid java name and contains not printable characters */
    public static x.m m5135(Object obj) {
        if (C0222.m4264() >= 0) {
            return ((y1) obj).f6011c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5114(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
