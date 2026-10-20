package r7;

import a8.C0009;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.os.Handler;
import androidx.compose.ui.input.pointer.C0034;
import b1.C0050;
import com.auto.accept.data.model.AppConfig;
import com.google.firebase.abt.C0113;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0188;
import e1.l0;
import e2.C0261;
import f0.C0273;
import h1.C0301;
import h6.C0310;
import i5.C0319;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;
import k0.d0;
import k0.t4;
import k6.a8;
import k6.c6;
import k6.m5;
import m0.h3;
import m9.e0;
import q0.C0382;
import r1.C0394;
import y.t0;

/* JADX INFO: renamed from: r7.۟۟ۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0404 {

    /* JADX INFO: renamed from: ۟ۢۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int f674 = -892;

    /* JADX INFO: renamed from: ۟۠۠۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m7903(Object obj) {
        if (C0050.m982() <= 0) {
            return ((f0.u) obj).f5960v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m7904(Object obj) {
        if (C0310.m5971() < 0) {
            return ((ByteBuffer) obj).getInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۨ, reason: not valid java name and contains not printable characters */
    public static u0.b m7905() {
        if (C0273.m5249() < 0) {
            return c5.c.f2970b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static l2.j m7906(Object obj) {
        if (C0319.m6163() < 0) {
            return ((a2.x) obj).f1043m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static float m7907(Object obj) {
        if (C0034.m667() > 0) {
            return ((d1.d) obj).f4335d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7908(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static k6.e m7909(Object obj, Object obj2, Object obj3) {
        if (C0009.m177() > 0) {
            return ((k6.k) obj).X((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m7910(Object obj) {
        if (C0394.m7716() > 0) {
            return ((AppConfig) obj).getPlanPrice1Month();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7911() {
        return 618 ^ C0382.f652;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۥ, reason: not valid java name and contains not printable characters */
    public static i1.f m7912() {
        if (C0133.m2559() >= 0) {
            return f6.a.O();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static c9.e m7913(Object obj) {
        if (C0192.m3659() > 0) {
            return ((t4) obj).f9503c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m7914(Object obj) {
        if (C0329.m6350() > 0) {
            return ((c6) obj).f9939c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۤ, reason: not valid java name and contains not printable characters */
    public static a6.a m7916(Object obj) {
        if (C0261.m4984() > 0) {
            return ((m5) obj).f10206c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static h3 m7917() {
        if (C0113.m2182() < 0) {
            return w0.p.f16108a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static l0 m7918(Object obj) {
        if (C0180.m3448() > 0) {
            return ((k0.l) obj).f9126o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨۡ, reason: contains not printable characters */
    public static AccountManagerFuture m7919(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0188.m3594() > 0) {
            return ((AccountManager) obj).getAccountsByTypeAndFeatures((String) obj2, (String[]) obj3, (AccountManagerCallback) obj4, (Handler) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۥۨ, reason: not valid java name and contains not printable characters */
    public static y1.u m7920() {
        if (C0191.m3643() >= 0) {
            return y1.i.f16779s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static e1.z m7921(Object obj) {
        if (C0158.m3012() >= 0) {
            return a4.q.n((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7922(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i10, int i11) {
        if (C0301.m5773() < 0) {
            e0.g((c9.a) obj, (y0.o) obj2, z10, (l0) obj3, (k0.y) obj4, (d0) obj5, (u.w) obj6, (t0) obj7, (x.m) obj8, (c9.f) obj9, (m0.m) obj10, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۧۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m7923(String str) {
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

    /* JADX INFO: renamed from: ۨۦۣۢ, reason: not valid java name and contains not printable characters */
    public static BitSet m7924(Object obj) {
        if (C0140.m2699() >= 0) {
            return ((a8) obj).f9899e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7915(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
