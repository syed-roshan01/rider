package u2;

import a5.d0;
import androidx.core.app.C0040;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0187;
import d5.a0;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import e1.n;
import e7.C0265;
import g2.l0;
import g7.C0293;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.l1;
import k0.l2;
import k0.o3;
import l2.l;
import l2.o;
import m0.u1;
import m0.v1;
import n7.C0365;
import x.m;

/* JADX INFO: renamed from: u2.۟ۥۢۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0434 {

    /* JADX INFO: renamed from: ۟ۢۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int f704 = -527;

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static List m8472(Object obj) {
        if (C0365.m7147() <= 0) {
            return ((a0) obj).f4386a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static l0 m8473(Object obj) {
        if (C0040.m792() > 0) {
            return ((l1) obj).f9155d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static c9.e m8474(Object obj) {
        if (C0293.m5634() < 0) {
            return ((d0) obj).f1245n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static m m8475(Object obj) {
        if (C0246.m4710() >= 0) {
            return ((o3) obj).f9318f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static o m8476(float f10, Object obj) {
        if (C0265.m5062() < 0) {
            return l.e(f10, (n) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m8477(Object obj) {
        if (C0102.m2007() > 0) {
            return ((a5.k) obj).f1282f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8478() {
        if (C0130.m2511() > 0) {
            return "timestamp_millis";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static d5.l m8479() {
        if (C0176.m3367() <= 0) {
            return d5.l.B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static long m8480(Object obj) {
        if (C0126.m2434() > 0) {
            return ((l2) obj).f9177n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8481() {
        return (-13) ^ C0187.f211;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۡ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m8482(Object obj, Object obj2) {
        if (C0236.m4538() >= 0) {
            return ((zzfi.zzj.zza) obj).zzq((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static v1 m8483(Object obj, Object obj2) {
        if (C0179.m3417() > 0) {
            return ((u1) obj).b(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8484(String str) {
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

    /* JADX INFO: renamed from: ۡۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8485(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static m2.l m8487(Object obj) {
        if (C0192.m3659() >= 0) {
            return ((androidx.compose.ui.node.a) obj).f1753y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۥ, reason: contains not printable characters */
    public static String m8486(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
