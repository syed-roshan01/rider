package z8;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.installations.ktx.C0175;
import d1.C0213;
import f0.o;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import k0.m0;
import k6.t4;
import m5.C0355;
import u0.C0430;
import u8.e;
import y0.n;
import z3.C0486;

/* JADX INFO: renamed from: z8.۟ۧۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0491 {

    /* JADX INFO: renamed from: ۦ۠ۤ۟, reason: contains not printable characters */
    public static int f765 = -833;

    /* JADX INFO: renamed from: ۟۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m9558(Object obj, long j10) {
        if (C0175.m3346() > 0) {
            return ((zzfi.zzj.zza) obj).zzd(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m9559(Object obj, Object obj2) {
        if (C0430.m8425() > 0) {
            ((OutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m9560(Object obj) {
        if (C0035.m690() < 0) {
            return ((View) obj).getLayoutParams();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static zzfc.zzd m9561(Object obj, Object obj2) {
        if (C0021.m417() >= 0) {
            return ((t4) obj).C((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static e m9562(Object obj, Object obj2, Object obj3) {
        if (C0355.m6968() > 0) {
            return ((o) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m9563(String str) {
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

    /* JADX INFO: renamed from: ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9564(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m9566() {
        return (-58) ^ C0213.f237;
    }

    /* JADX INFO: renamed from: ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static int m9567(Object obj) {
        if (C0152.m2931() >= 0) {
            return ((n) obj).f16732c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static m0 m9568() {
        if (C0486.m9464() >= 0) {
            return m0.f9197n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m9565(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
