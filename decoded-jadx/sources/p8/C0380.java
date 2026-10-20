package p8;

import a.C0000;
import a5.j;
import android.os.Parcelable;
import androidx.activity.C0017;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.installations.ktx.C0175;
import d5.c0;
import dagger.hilt.android.lifecycle.C0236;
import e2.C0262;
import f.C0270;
import h6.g;
import i1.f;
import j2.C0323;
import java.io.ByteArrayOutputStream;
import k6.k;
import k6.u7;
import k6.x;
import k6.x3;
import p0.C0374;
import p9.q0;

/* JADX INFO: renamed from: p8.ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0380 {

    /* JADX INFO: renamed from: ۡ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int f651 = -708;

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static x3 m7457() {
        if (C0175.m3346() >= 0) {
            return x.f10512u0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static j m7458(Object obj) {
        if (C0000.m12() < 0) {
            return ((MainViewModel) obj).f3083c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m7459(Object obj) {
        if (C0323.m6259() <= 0) {
            return u7.Z((Parcelable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m7460(Object obj, Object obj2) {
        if (C0081.m1735() > 0) {
            return ((zzfi.zzj.zza) obj).zzk((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m7461(String str) {
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

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7462(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0017.m332() <= 0) {
            return ((k) obj).z((String) obj2, (String[]) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧۢ, reason: not valid java name and contains not printable characters */
    public static long m7463(Object obj) {
        if (C0374.m7350() <= 0) {
            return ((c0) obj).f4435p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static int m7464(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۠ۥۢ, reason: contains not printable characters */
    public static String m7465(Object obj) {
        if (C0270.m5170() < 0) {
            return ((zzfi.zzj) obj).zzae();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡ۠, reason: contains not printable characters */
    public static f m7466() {
        if (C0236.m4549() < 0) {
            return g.m0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۧ, reason: contains not printable characters */
    public static int m7467() {
        return 485 ^ C0262.f342;
    }

    /* JADX INFO: renamed from: ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static q0 m7468(Object obj) {
        if (C0374.m7350() <= 0) {
            return ((MainViewModel) obj).L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m7456(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
