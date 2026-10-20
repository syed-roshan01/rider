package z0;

import a2.C0005;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import b1.C0050;
import c1.C0061;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.emulators.C0140;
import com.google.firebase.iid.C0169;
import com.google.firebase.measurement.C0183;
import com.google.gson.internal.bind.C0207;
import d5.j2;
import dagger.hilt.android.migration.C0239;
import e7.C0264;
import f0.d2;
import f5.b0;
import g2.n;
import java.io.ByteArrayOutputStream;
import java.util.regex.Pattern;
import k0.p2;
import m0.C0349;
import m0.g1;
import m5.C0355;
import org.json.JSONArray;
import org.json.JSONObject;
import r1.s;
import t8.C0426;
import x4.C0469;

/* JADX INFO: renamed from: z0.ۣ۟۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0482 {

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f756 = 943;

    /* JADX INFO: renamed from: ۟۠ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m9385(int i10, int i11) {
        if (C0050.m982() < 0) {
            return n.a(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m9386(Object obj) {
        if (C0140.m2699() > 0) {
            return ((DisplayMetrics) obj).heightPixels;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥ۟, reason: not valid java name and contains not printable characters */
    public static e0.e m9387() {
        if (C0426.m8356() < 0) {
            return p2.f9356d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static JSONArray m9388(Object obj, Object obj2) {
        if (C0061.m1161() <= 0) {
            return ((JSONObject) obj).optJSONArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int m9389() {
        return (-485) ^ C0183.f207;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m9390(Object obj, Object obj2, boolean z10) {
        if (C0169.m3245() > 0) {
            return ((SharedPreferences.Editor) obj).putBoolean((String) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۦ, reason: not valid java name and contains not printable characters */
    public static String m9391(String str) {
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

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m9392(Object obj) {
        if (C0355.m6968() > 0) {
            return ((j2) obj).f4593b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m9393(Object obj) {
        if (C0120.m2311() <= 0) {
            return ((a5.f) obj).f1252c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9394(Object obj) {
        if (C0239.m4596() > 0) {
            return ((zzfi.zzj) obj).zzas();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static float m9395(Object obj, Object obj2, float f10) {
        if (C0264.m5062() < 0) {
            return ((SharedPreferences) obj).getFloat((String) obj2, f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m9396(Object obj, int i10) {
        if (C0005.m104() >= 0) {
            return Pattern.compile((String) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9397(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static String m9398() {
        if (C0469.m9143() >= 0) {
            return " and name glob ?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤۡ, reason: contains not printable characters */
    public static g1 m9399(Object obj) {
        if (C0349.m6838() <= 0) {
            return ((d5.g1) obj).f4518o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۟۟, reason: not valid java name and contains not printable characters */
    public static s m9400(Object obj) {
        if (C0207.m3957() >= 0) {
            return ((d2) obj).f5669c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m9401(Object obj) {
        if (C0108.m2101() < 0) {
            return ((b0) obj).f6236e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m9384(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
