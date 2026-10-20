package d3;

import a2.C0004;
import a2.c0;
import android.net.Uri;
import androidx.versionedparcelable.C0048;
import c9.c;
import c9.e;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.android.migration.C0239;
import e1.r;
import f0.h0;
import j4.o;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import k0.e5;
import k0.o1;
import k0.y;
import k6.a5;
import k6.b4;
import l0.C0341;
import m0.m3;
import m9.e0;
import r.C0393;
import u6.b;
import v0.C0441;
import v0.p;
import w3.d;
import x2.C0468;

/* JADX INFO: renamed from: d3.ۡۨۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0217 {

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int f240 = -920;

    /* JADX INFO: renamed from: ۟۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4111(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m4112(Object obj, long j10) {
        if (C0161.m3081() < 0) {
            ((a5) obj).B(j10);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4113(Object obj) {
        if (C0239.m4587() < 0) {
            return ((h0) obj).f5730a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int m4114() {
        return 186 ^ C0071.f98;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m4115(Object obj, Object obj2) {
        if (C0468.m9101() < 0) {
            return ((Uri.Builder) obj).encodedAuthority((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m4116() {
        if (C0075.m1631() <= 0) {
            return "Failed to insert event filter (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static Charset m4117(Object obj) {
        if (C0106.m2067() >= 0) {
            return Charset.forName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String m4118() {
        if (C0004.m76() < 0) {
            return "Subscription Time Remaining";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۨ, reason: not valid java name and contains not printable characters */
    public static m3 m4119() {
        if (C0083.m1779() > 0) {
            return o.f8371a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4121() {
        if (C0175.m3346() >= 0) {
            return "Ride Accepter Pro";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static e m4122(Object obj) {
        if (C0393.m7675() < 0) {
            return ((o1) obj).f9306z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۧۤ, reason: not valid java name and contains not printable characters */
    public static p m4123(Object obj, Object obj2) {
        if (C0190.m3639() > 0) {
            return e0.F((e) obj, (c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠۠, reason: not valid java name and contains not printable characters */
    public static c0 m4124(Object obj) {
        if (C0165.m3154() < 0) {
            return ((e5) obj).f8886g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4125(Object obj) {
        if (C0441.m8597() > 0) {
            return ((b4) obj).y();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۨۧ, reason: not valid java name and contains not printable characters */
    public static b m4126(Object obj) {
        if (C0048.m925() > 0) {
            return ((d) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static String m4127(String str) {
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

    /* JADX INFO: renamed from: ۦ۠ۡ۠, reason: contains not printable characters */
    public static long m4128(Object obj) {
        if (C0198.m3800() > 0) {
            return ((y) obj).f9663d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۥ, reason: contains not printable characters */
    public static long m4129(long j10, float f10) {
        if (C0341.m6681() >= 0) {
            return r.b(j10, f10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4120(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
