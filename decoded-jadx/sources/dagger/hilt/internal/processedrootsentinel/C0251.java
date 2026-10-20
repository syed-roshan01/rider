package dagger.hilt.internal.processedrootsentinel;

import a5.b0;
import c1.C0059;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.iid.C0171;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0212;
import d9.C0226;
import dagger.hilt.internal.componenttreedeps.C0248;
import f0.r1;
import g2.s;
import h6.C0309;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import k0.e0;
import k0.y2;
import k6.l6;
import m0.g1;
import p9.q0;
import t.x1;
import t.y1;
import z7.C0488;

/* JADX INFO: renamed from: dagger.hilt.internal.processedrootsentinel.۟ۥ۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0251 {

    /* JADX INFO: renamed from: ۧۦۦۡ, reason: not valid java name and contains not printable characters */
    public static int f331 = 601;

    /* JADX INFO: renamed from: ۣ۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static int m4805(Object obj) {
        if (C0059.m1117() < 0) {
            return ((e0) obj).f8859a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static g1 m4806(Object obj) {
        if (C0171.m3272() <= 0) {
            return ((d5.g1) obj).f4526w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4807(Object obj) {
        if (C0226.m4372() <= 0) {
            return ((y2) obj).f9671c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static s m4808(Object obj) {
        if (C0082.m1758() >= 0) {
            return ((r1) obj).f5878f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4809(Object obj, Object obj2, Object obj3) {
        if (C0212.m4051() >= 0) {
            ((URLConnection) obj).addRequestProperty((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۢۧ, reason: not valid java name and contains not printable characters */
    public static String m4810(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4811() {
        return 841 ^ C0320.f468;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4812(Object obj) {
        if (C0488.m9505() > 0) {
            return ((CouponData) obj).getDiscountPercent();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m4813(Object obj) {
        if (C0202.m3868() >= 0) {
            return l6.p((HttpURLConnection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static double m4814(Object obj) {
        return C0085.m1825() > 0 ? ((b0) obj).f1228d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static q0 m4815(Object obj) {
        if (C0309.m5971() <= 0) {
            return ((MainViewModel) obj).f3112r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static x1 m4816() {
        if (C0248.m4762() >= 0) {
            return y1.f14355a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int m4817(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m4804(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
