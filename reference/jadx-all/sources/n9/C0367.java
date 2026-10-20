package n9;

import android.os.Build;
import android.view.View;
import b1.C0050;
import b4.C0052;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.reporting.C0190;
import dagger.hilt.android.components.C0230;
import h7.C0313;
import java.io.ByteArrayOutputStream;
import q5.C0386;
import t.c0;
import t.w;
import v0.C0441;
import v0.C0442;

/* JADX INFO: renamed from: n9.ۤۧۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0367 {

    /* JADX INFO: renamed from: ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int f637 = 368;

    /* JADX INFO: renamed from: ۟ۡۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m7181() {
        if (C0107.m2075() < 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7182(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7183(Object obj, int i10, int i11, int i12, int i13) {
        if (C0313.m6046() >= 0) {
            ((View) obj).setPadding(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7184(Object obj) {
        if (C0230.m4421() <= 0) {
            return ((zzfc.zzd.zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m7186(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static Object m7187(Object obj, Object obj2, Object obj3) {
        if (C0190.m3639() > 0) {
            return ((t.d) obj).e(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7188(int i10, int i11) {
        if (C0442.m8612() >= 0) {
            return f6.a.D(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int m7189() {
        return 719 ^ C0178.f202;
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static int m7190(Object obj) {
        if (C0441.m8597() >= 0) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۦۤ, reason: contains not printable characters */
    public static int m7191(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((a5.e) obj).f1249c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7192(Object obj) {
        if (C0386.m7546() >= 0) {
            return ((Status) obj).f3150b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static w m7193() {
        if (C0050.m982() < 0) {
            return c0.f14095a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m7185(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
