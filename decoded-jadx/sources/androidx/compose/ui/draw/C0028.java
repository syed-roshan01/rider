package androidx.compose.ui.draw;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0014;
import androidx.compose.ui.input.pointer.C0034;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0046;
import c9.c;
import c9.e;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzne;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.remote.C0163;
import d5.s;
import f0.a1;
import java.io.ByteArrayOutputStream;
import k0.k1;
import k0.l;
import k0.l2;
import k0.u2;
import k6.p7;
import o1.C0367;
import o1.t;
import r5.C0400;
import t3.C0424;
import u0.b;
import v0.C0441;

/* JADX INFO: renamed from: androidx.compose.ui.draw.ۧۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0028 {

    /* JADX INFO: renamed from: ۟ۢۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f48 = 379;

    /* JADX INFO: renamed from: ۟۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m542(Object obj, int i10, long j10) {
        if (C0141.m2714() < 0) {
            ((p) obj).S0(i10, j10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۢ۟, reason: not valid java name and contains not printable characters */
    public static String m543() {
        if (C0163.m3132() > 0) {
            return "Upload has been suspended. Will update scheduling later in approximately ms";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static b m544() {
        if (C0424.m8322() >= 0) {
            return s.f4758b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۤ, reason: not valid java name and contains not printable characters */
    public static float m545(Object obj) {
        if (C0400.m7847() <= 0) {
            return ((l) obj).f9131t;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۦ, reason: not valid java name and contains not printable characters */
    public static e m546(Object obj) {
        if (C0083.m1779() > 0) {
            return ((l2) obj).f9172b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥ۠, reason: not valid java name and contains not printable characters */
    public static long m547() {
        if (C0441.m8612() >= 0) {
            return zzne.zzad();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۨ, reason: not valid java name and contains not printable characters */
    public static c m548(Object obj) {
        if (C0043.m833() >= 0) {
            return ((a1) obj).f5593b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m549(Object obj, Object obj2) {
        if (C0119.m2289() > 0) {
            return ((u2) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m550(String str) {
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

    /* JADX INFO: renamed from: ۡ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m551(Object obj) {
        if (C0046.m893() > 0) {
            return ((zzew.zza.C0093zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m552(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۢ۠۟, reason: not valid java name and contains not printable characters */
    public static Handler m553(Object obj) {
        if (C0367.m7199() < 0) {
            return Handler.createAsync((Looper) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۤ, reason: contains not printable characters */
    public static boolean m555(long j10, long j11) {
        if (C0014.m269() < 0) {
            return t.a(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static void m556(Object obj) {
        if (C0034.m667() > 0) {
            ((p7) obj).v();
        }
    }

    /* JADX INFO: renamed from: ۣۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m557() {
        return (-300) ^ C0122.f148;
    }

    /* JADX INFO: renamed from: ۨۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m558(Object obj) {
        if (C0117.m2257() >= 0) {
            return ((k1) obj).f9102q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۡۧ, reason: contains not printable characters */
    public static String m554(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
