package g3;

import androidx.compose.foundation.text.modifiers.C0025;
import c1.q;
import c6.C0067;
import c9.e;
import com.auto.accept.data.model.TransactionData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.iid.C0169;
import d1.C0213;
import d5.m;
import d5.r1;
import e1.C0257;
import h.C0298;
import h1.C0300;
import i4.C0317;
import i9.C0321;
import java.io.ByteArrayOutputStream;
import k0.b4;
import k6.a5;
import m0.g1;
import org.json.JSONObject;
import p9.q0;
import q.z;
import s.C0407;
import u7.C0437;

/* JADX INFO: renamed from: g3.۟ۥۣۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0288 {

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int f433 = 759;

    /* JADX INFO: renamed from: ۟۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static e m5545(Object obj) {
        if (C0321.m6226() < 0) {
            return ((b4) obj).f8749d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5546(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m5547() {
        return 531 ^ C0169.f193;
    }

    /* JADX INFO: renamed from: ۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m5548(Object obj, Object obj2, Object obj3) {
        if (C0257.m4918() >= 0) {
            return ((z) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5549(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5550(Object obj) {
        if (C0298.m5742() > 0) {
            q.b((q) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5551(Object obj, Object obj2) {
        if (C0067.m1309() <= 0) {
            return ((m0.q) obj).i(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5552(Object obj) {
        if (C0300.m5773() <= 0) {
            return ((TransactionData) obj).getAmount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static long m5553(Object obj) {
        if (C0407.m7989() >= 0) {
            return ((a5) obj).F;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۣ, reason: not valid java name and contains not printable characters */
    public static String m5554(Object obj) {
        if (C0213.m4083() < 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤ۠, reason: not valid java name and contains not printable characters */
    public static g1 m5555(Object obj) {
        if (C0025.m495() >= 0) {
            return ((d5.e) obj).f4460d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static m m5557() {
        if (C0111.m2143() > 0) {
            return m.f4663s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨۧ, reason: contains not printable characters */
    public static c9.a m5558(Object obj) {
        if (C0437.m8543() > 0) {
            return ((r1) obj).f4755d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static q0 m5559(Object obj) {
        if (C0317.m6144() <= 0) {
            return ((MainViewModel) obj).f3116t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۡ, reason: contains not printable characters */
    public static String m5556(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
