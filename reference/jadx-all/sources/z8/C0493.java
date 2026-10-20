package z8;

import android.util.SparseArray;
import androidx.compose.ui.semantics.C0039;
import b3.C0051;
import c1.q;
import c9.e;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement_impl.C0185;
import e1.C0258;
import e9.C0267;
import h5.C0308;
import h6.C0310;
import h6.g;
import h7.C0313;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import k0.b3;
import k0.e4;
import k0.f3;
import k6.a5;
import k6.u7;
import k6.v;
import k6.x7;
import k6.y3;
import q7.C0391;
import r5.C0400;
import u4.C0437;
import u8.h;
import u8.i;
import y1.j;
import y1.u;

/* JADX INFO: renamed from: z8.ۣۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0493 {

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f766 = -816;

    /* JADX INFO: renamed from: ۟۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static e m9569(Object obj) {
        if (C0167.m3200() >= 0) {
            return ((f3) obj).f8926b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static h m9570(Object obj, Object obj2) {
        if (C0308.m5935() > 0) {
            return z6.a.D((h) obj, (i) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static float m9571(Object obj) {
        if (C0147.m2805() < 0) {
            return ((e4) obj).f8876c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m9572(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۤ۟, reason: not valid java name and contains not printable characters */
    public static int m9573(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9574(Object obj, Object obj2, Object obj3) {
        if (C0039.m764() >= 0) {
            ((j) obj).k((u) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m9576(Object obj) {
        if (C0164.m3153() >= 0) {
            return ((f5.u) obj).f6332d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ۠, reason: not valid java name and contains not printable characters */
    public static long m9577(Object obj) {
        if (C0310.m5971() <= 0) {
            return ((b3) obj).f8744n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m9578() {
        return (-762) ^ C0313.f460;
    }

    /* JADX INFO: renamed from: ۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9579() {
        if (C0185.m3538() >= 0) {
            return "tap_to_start";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9580(Object obj) {
        if (C0171.m3272() <= 0) {
            return u7.o0((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9581(Object obj) {
        if (C0258.m4918() > 0) {
            return ((zzfi.zzj) obj).zzbc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9582(Object obj) {
        if (C0437.m8524() < 0) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static f m9583() {
        if (C0267.m5099() <= 0) {
            return g.a0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static void m9584(Object obj, Object obj2) {
        if (C0400.m7828() >= 0) {
            ((a5) obj).r((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m9585(Object obj, Object obj2, Object obj3) {
        if (C0391.m7643() <= 0) {
            ((y3) obj).g((v) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۢۡ, reason: contains not printable characters */
    public static q m9586(Object obj) {
        if (C0106.m2067() > 0) {
            return ((c1.f) obj).f2883c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۨ, reason: contains not printable characters */
    public static Object m9587(Object obj, int i10) {
        if (C0051.m992() > 0) {
            return ((SparseArray) obj).valueAt(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m9575(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
