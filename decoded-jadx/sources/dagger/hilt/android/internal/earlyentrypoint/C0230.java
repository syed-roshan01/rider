package dagger.hilt.android.internal.earlyentrypoint;

import android.os.Bundle;
import android.os.Parcel;
import b7.C0054;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.C0087;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.messaging.reporting.C0189;
import d5.m;
import d5.n1;
import f0.C0271;
import f0.j0;
import h6.C0309;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import k0.a;
import k0.m0;
import k0.x0;
import k6.b7;
import l0.d;
import p8.C0380;
import t.w1;
import u.C0429;
import v6.C0447;
import y9.C0479;

/* JADX INFO: renamed from: dagger.hilt.android.internal.earlyentrypoint.۟ۢ۟ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0230 {

    /* JADX INFO: renamed from: ۟ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int f310 = -781;

    /* JADX INFO: renamed from: ۟۟ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static m0 m4424() {
        if (C0447.m8732() < 0) {
            return m0.f9194d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4425(Object obj) {
        if (C0479.m9346() > 0) {
            return ((b7) obj).f9919b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۧ, reason: not valid java name and contains not printable characters */
    public static long m4426(Object obj) {
        if (C0185.m3538() > 0) {
            return ((Random) obj).nextLong();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static f m4427(Object obj) {
        if (C0188.m3594() > 0) {
            return ((n1) obj).f4699a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4428() {
        if (C0380.m7467() >= 0) {
            return "Got multiple records for conditional property, expected one";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4429(Object obj) {
        if (C0271.m5222() <= 0) {
            return ((UserProfile) obj).getStatus();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4430() {
        if (C0121.m2336() <= 0) {
            return d.f11038d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static m m4431() {
        if (C0189.m3621() >= 0) {
            return m.f4659o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4432(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4433(String str) {
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

    /* JADX INFO: renamed from: ۥ۠ۥۤ, reason: contains not printable characters */
    public static float m4434() {
        if (C0429.m8415() > 0) {
            return a.f8708a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static Bundle m4435(Object obj) {
        if (C0186.m3548() < 0) {
            return ((Parcel) obj).readBundle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۧ, reason: contains not printable characters */
    public static MainViewModel m4436(Object obj) {
        if (C0054.m1047() > 0) {
            return ((f5.m) obj).f6300e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m4438(Object obj, Object obj2) {
        if (C0076.m1655() > 0) {
            return ((j0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥۨ, reason: not valid java name and contains not printable characters */
    public static w1 m4439() {
        if (C0309.m5971() < 0) {
            return x0.f9635a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4440() {
        return 7 ^ C0087.f121;
    }

    /* JADX INFO: renamed from: ۦۧۥۨ, reason: contains not printable characters */
    public static String m4437(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
