package androidx.compose.foundation.text.modifiers;

import android.graphics.PorterDuff;
import android.net.NetworkCapabilities;
import c5.c;
import c9.a;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.remoteconfiginterop.C0202;
import d5.x1;
import e2.C0262;
import f0.u;
import java.io.ByteArrayOutputStream;
import k0.e2;
import k0.g;
import k0.w;
import k6.h5;
import k6.m5;
import n.C0361;
import p3.C0375;
import p8.C0379;
import q5.C0385;
import q6.C0388;
import q7.C0389;
import u0.b;

/* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0025 {

    /* JADX INFO: renamed from: ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int f45 = 106;

    /* JADX INFO: renamed from: ۟۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static a m493(Object obj) {
        if (C0202.m3868() > 0) {
            return ((x1) obj).f4846b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static long m494(Object obj) {
        if (C0151.m2903() >= 0) {
            return ((w) obj).f9585d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m495() {
        return (-419) ^ C0375.f646;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static h5 m497(Object obj) {
        if (C0262.m5016() < 0) {
            return ((m5) obj).f10205b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m498(int i10) {
        if (C0104.m2034() < 0) {
            return androidx.compose.ui.graphics.a.u(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m499() {
        if (C0149.m2863() >= 0) {
            return e2.f8865b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m500(Object obj) {
        if (C0385.m7546() > 0) {
            return ((u) obj).f5949d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m501(Object obj, int i10) {
        if (C0379.m7433() >= 0) {
            return ((NetworkCapabilities) obj).hasCapability(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float m502(Object obj) {
        if (C0159.m3030() < 0) {
            return ((g) obj).f8934a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m503(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۣۥ, reason: contains not printable characters */
    public static b m504() {
        if (C0361.m7097() < 0) {
            return c.f2973e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static String m505(String str) {
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
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦۤۦۤ, reason: contains not printable characters */
    public static void m506() {
        if (C0389.m7627() < 0) {
            zzgn.zzc();
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m507() {
        if (C0388.m7600() <= 0) {
            return "Got multiple records for app, expected one. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m496(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
