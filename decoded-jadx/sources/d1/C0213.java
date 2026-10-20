package d1;

import a2.C0005;
import a2.b0;
import a5.g0;
import android.os.Parcelable;
import c0.C0056;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.ktx.C0180;
import d5.e1;
import d5.l0;
import g.C0282;
import h.C0298;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import k0.l1;
import k0.q4;
import k6.i7;
import k6.n7;
import m0.l3;
import m0.m;
import q7.C0389;
import r5.C0400;
import w4.C0459;

/* JADX INFO: renamed from: d1.ۣۣ۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0213 {

    /* JADX INFO: renamed from: ۟ۦۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f237 = -15;

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m4069() {
        if (C0073.m1597() >= 0) {
            return i7.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4070(Object obj) {
        if (C0389.m7627() <= 0) {
            return g0.a((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4071(Object obj, Object obj2, int i10) {
        if (C0122.m2355() > 0) {
            ((l1) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m4072(Object obj, Object obj2) {
        if (C0282.m5446() >= 0) {
            return ((e1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4073(Object obj) {
        if (C0400.m7847() <= 0) {
            return ((n7) obj).f10237b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4074(Object obj, Object obj2) {
        if (C0056.m1077() < 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦ۟, reason: not valid java name and contains not printable characters */
    public static int m4075(long j10) {
        if (C0298.m5742() > 0) {
            return b0.e(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4076(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4077() {
        if (C0459.m8951() <= 0) {
            return zzoh.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m4079(Object obj) {
        if (C0075.m1631() <= 0) {
            return ((q4) obj).f9410a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static l3 m4080(Object obj) {
        if (C0159.m3030() < 0) {
            return ((l0) obj).f4644a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦۨ, reason: contains not printable characters */
    public static void m4081(Object obj, int i10, Object obj2) {
        if (C0005.m104() >= 0) {
            ((y3.b) obj).b(i10, (Serializable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۤۨ, reason: contains not printable characters */
    public static String m4082(String str) {
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

    /* JADX INFO: renamed from: ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4083() {
        return 842 ^ C0180.f204;
    }

    /* JADX INFO: renamed from: ۢۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4078(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
