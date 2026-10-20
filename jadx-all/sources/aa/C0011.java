package aa;

import android.os.BaseBundle;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0021;
import c6.C0067;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.C0177;
import com.google.firebase.messaging.reporting.C0188;
import d9.C0226;
import dagger.hilt.android.components.C0230;
import e1.r;
import f5.p;
import h.C0298;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import k6.a5;
import k6.a8;
import k6.k;
import k6.t4;
import k6.v;
import k6.z7;
import m0.q2;
import o2.C0369;
import p0.C0375;
import q0.C0382;

/* JADX INFO: renamed from: aa.ۣۣ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0011 {

    /* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
    public static int f31 = 356;

    /* JADX INFO: renamed from: ۣ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m208() {
        return 626 ^ C0230.f309;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static Collection m209(Object obj) {
        if (C0382.m7481() > 0) {
            return ((EnumMap) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m210(Object obj, Object obj2, Object obj3) {
        if (C0298.m5722() > 0) {
            ((BaseBundle) obj).putLongArray((String) obj2, (long[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m211(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static z7 m212(Object obj) {
        if (C0158.m3012() > 0) {
            return ((a8) obj).f9902h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m213(Object obj, Object obj2) {
        if (C0019.m375() <= 0) {
            ((a5) obj).v((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static Map m214() {
        if (C0375.m7350() <= 0) {
            return g5.b.f6617b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m215(Object obj, Object obj2) {
        if (C0144.m2767() >= 0) {
            return ((p) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String[] m216() {
        if (C0369.m7234() > 0) {
            return k.f10137h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m217(Object obj) {
        if (C0067.m1309() <= 0) {
            return ((q2) obj).A();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m218() {
        if (C0188.m3594() >= 0) {
            return "app2";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static q.f m219(Object obj) {
        if (C0169.m3245() > 0) {
            return ((t4) obj).f10381e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۥ, reason: not valid java name and contains not printable characters */
    public static long m220() {
        if (C0226.m4339() < 0) {
            return r.f5065g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m222() {
        if (C0177.m3380() > 0) {
            return "select first_open_count from app2 where app_id=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥ۠, reason: not valid java name and contains not printable characters */
    public static String m223(String str) {
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

    /* JADX INFO: renamed from: ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static v m224(Object obj) {
        if (C0021.m417() >= 0) {
            return ((k6.e) obj).f9995p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m221(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
