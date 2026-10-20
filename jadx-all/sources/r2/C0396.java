package r2;

import android.content.ComponentName;
import android.os.C0013;
import android.view.KeyEvent;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.components.C0135;
import com.google.firebase.inject.C0172;
import i9.C0322;
import java.io.ByteArrayOutputStream;
import k0.w1;
import m0.l3;
import m0.v1;
import t2.C0422;

/* JADX INFO: renamed from: r2.۠ۨۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0396 {

    /* JADX INFO: renamed from: ۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static int f666 = 921;

    /* JADX INFO: renamed from: ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static l3 m7734(Object obj) {
        if (C0422.m8278() < 0) {
            return ((w1) obj).f9602c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m7735(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7736(Object obj, Object obj2, Object obj3, int i10) {
        if (C0135.m2608() <= 0) {
            f6.a.b((v1) obj, (c9.e) obj2, (m0.m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m7737() {
        return 804 ^ C0172.f196;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m7738(Object obj) {
        if (C0322.m6226() < 0) {
            return ((ComponentName) obj).flattenToString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static zzew.zzf.zza m7739() {
        if (C0013.m253() >= 0) {
            return zzew.zzf.zza.BEGINS_WITH;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7740(Object obj) {
        if (C0073.m1597() >= 0) {
            return ((zzfc.zzc.zza) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7742(Object obj) {
        if (C0135.m2608() < 0) {
            return ((KeyEvent) obj).isAltPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m7743(String str) {
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

    /* JADX INFO: renamed from: ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7741(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
