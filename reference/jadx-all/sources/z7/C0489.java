package z7;

import a2.y;
import android.os.Bundle;
import androidx.compose.ui.semantics.C0039;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.internal.measurement.zzew;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.firestore.auth.C0146;
import com.google.gson.internal.bind.C0207;
import d4.C0218;
import d5.o1;
import d7.C0221;
import e1.C0258;
import f5.d0;
import g2.C0287;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k.f;
import k0.b5;
import k0.f1;
import k0.j0;
import k0.l0;
import k0.q2;
import k0.q4;
import k0.u1;
import k0.y4;
import k6.u7;
import l8.C0346;
import m0.m;
import m7.C0357;
import n7.C0364;
import n8.C0366;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.C0375;
import p5.C0378;
import q6.C0388;
import t1.c1;
import w2.C0458;

/* JADX INFO: renamed from: z7.۟۟ۨۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0489 {

    /* JADX INFO: renamed from: ۣ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static int f762 = -332;

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9503(int i10, Object obj, Object obj2) {
        if (C0207.m3957() >= 0) {
            o1.j(i10, (m) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static zzew.zzc m9504(Object obj) {
        if (C0346.m6759() <= 0) {
            return ((zzew.zze) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9505() {
        return 941 ^ C0218.f241;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m9506(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۦۥۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m9507(Object obj) {
        if (C0082.m1758() >= 0) {
            return ((d0) obj).f6247d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9508(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m9509() {
        if (C0327.m6304() < 0) {
            return y.f1051e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9510(Object obj) {
        if (C0375.m7350() <= 0) {
            return ((a5.d0) obj).f1243e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9511() {
        if (C0221.m4261() > 0) {
            return "auto";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static j0 m9512() {
        if (C0039.m764() >= 0) {
            return j0.f9054b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m9513(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0146.m2776() > 0) {
            ((u7) obj).D((Bundle) obj2, (String) obj3, obj4);
        }
    }

    /* JADX INFO: renamed from: ۡۥۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9514(Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if (C0388.m7585() > 0) {
            return ((u1) obj).f((c1) obj2, (List) obj3, i10, (l0) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static f1 m9515(Object obj) {
        if (C0364.m7127() <= 0) {
            return ((y4) obj).f9676b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9516(Object obj, int i10) {
        if (C0378.m7389() >= 0) {
            return ((JSONArray) obj).getJSONObject(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۡ۠, reason: not valid java name and contains not printable characters */
    public static e0.a m9517(Object obj) {
        if (C0357.m6984() > 0) {
            return ((q2) obj).f9390b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9518(Object obj) {
        if (C0258.m4918() >= 0) {
            ((f) obj).p();
        }
    }

    /* JADX INFO: renamed from: ۦ۠۟۠, reason: contains not printable characters */
    public static void m9519(Object obj, int i10, long j10) {
        if (C0287.m5522() >= 0) {
            ((p) obj).Y0(i10, j10);
        }
    }

    /* JADX INFO: renamed from: ۦۨۧۥ, reason: contains not printable characters */
    public static long m9520(Object obj) {
        if (C0366.m7172() >= 0) {
            return ((b5) obj).f8761r;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۨۧۥ, reason: not valid java name and contains not printable characters */
    public static float m9521(Object obj) {
        if (C0458.m8901() <= 0) {
            return ((q4) obj).f9411b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9522(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
