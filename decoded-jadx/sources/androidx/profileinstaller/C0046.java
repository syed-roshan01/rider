package androidx.profileinstaller;

import a.C0001;
import a0.C0003;
import a2.c0;
import androidx.compose.ui.node.C0037;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.remoteconfig.C0201;
import d5.n1;
import dagger.hilt.android.migration.C0238;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.componenttreedeps.C0248;
import f0.s1;
import f5.l;
import java.io.ByteArrayOutputStream;
import k0.k3;
import k0.t4;
import k6.v7;
import k6.z3;
import m0.g1;
import m0.s2;
import s.C0408;
import v6.C0447;

/* JADX INFO: renamed from: androidx.profileinstaller.۠ۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0046 {

    /* JADX INFO: renamed from: ۤ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int f66 = -830;

    /* JADX INFO: renamed from: ۟۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m885() {
        if (C0248.m4762() > 0) {
            return "mr";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static float m886() {
        if (C0165.m3154() < 0) {
            return k3.f9117g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static float m887(Object obj) {
        if (C0252.m4832() < 0) {
            return ((s2) obj).d();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static c0 m888(Object obj) {
        if (C0003.m70() >= 0) {
            return ((t4) obj).f9502b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static long m890(Object obj) {
        if (C0201.m3855() < 0) {
            return ((z3) obj).f10596h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m891() {
        if (C0146.m2776() > 0) {
            return "with_filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۡ, reason: not valid java name and contains not printable characters */
    public static g1 m892(Object obj) {
        if (C0153.m2938() <= 0) {
            return ((s1) obj).f5897c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static int m893() {
        return (-302) ^ C0408.f679;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m894(Object obj) {
        if (C0001.m35() < 0) {
            return ((zzfi.zzd) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m895(Object obj) {
        if (C0238.m4587() < 0) {
            return ((l) obj).f6293f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۣۤ, reason: not valid java name and contains not printable characters */
    public static long m896(Object obj) {
        if (C0447.m8732() < 0) {
            return ((v7) obj).f10448d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int m897(Object obj) {
        if (C0037.m733() > 0) {
            return ((n1) obj).f4705n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۡ۠, reason: contains not printable characters */
    public static int m898(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static String m899(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m889(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
