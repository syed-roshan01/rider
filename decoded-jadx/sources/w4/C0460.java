package w4;

import android.view.KeyEvent;
import c4.C0066;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.firestore.auth.C0146;
import d9.C0225;
import dagger.hilt.android.components.C0229;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.generatesrootinput.C0250;
import f0.k1;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Set;
import k0.n3;
import k0.o1;
import k0.v3;
import k4.C0336;
import k6.c5;
import m4.C0353;
import p8.C0379;
import w2.C0456;
import y.C0474;

/* JADX INFO: renamed from: w4.ۥۤ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0460 {

    /* JADX INFO: renamed from: ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f731 = 965;

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8962(Object obj) {
        if (C0250.m4793() >= 0) {
            return ((zzew.zzf) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m8964(Object obj, long j10) {
        if (C0225.m4339() <= 0) {
            ((k1) obj).h(j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static String m8965(float f10) {
        if (C0066.m1277() >= 0) {
            return m2.e.b(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۧ, reason: not valid java name and contains not printable characters */
    public static long m8966(Object obj) {
        if (C0336.m6515() <= 0) {
            return ((v3) obj).f9563o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m8967() {
        if (C0229.m4421() <= 0) {
            return "enable_dev_options";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8968(Object obj) {
        if (C0456.m8890() >= 0) {
            return ((KeyEvent) obj).isShiftPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m8969(Object obj) {
        if (C0146.m2776() >= 0) {
            return ((c5) obj).f9933a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m8970(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static long m8971(Object obj) {
        if (C0379.m7433() >= 0) {
            return ((zzfi.zzj) obj).zzq();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m8972() {
        return (-519) ^ C0474.f745;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static long m8973(Object obj) {
        if (C0111.m2143() > 0) {
            return ((n3) obj).f9271c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8974(int i10) {
        if (C0353.m6940() < 0) {
            return Character.isLetter(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Set m8975(Object obj) {
        if (C0246.m4717() < 0) {
            return Collections.unmodifiableSet((Set) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static String m8976(String str) {
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

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static c9.e m8977(Object obj) {
        if (C0084.m1804() >= 0) {
            return ((o1) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m8963(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
