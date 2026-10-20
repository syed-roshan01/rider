package g;

import a7.C0008;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.C0030;
import c9.c;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0127;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ktx.C0186;
import d5.i2;
import d9.C0223;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0242;
import f0.h0;
import f0.t;
import f0.t0;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import k0.c0;
import k0.h2;
import k0.i0;
import k0.m0;
import k6.x;
import k6.x3;
import l8.C0347;
import y9.b;

/* JADX INFO: renamed from: g.۟ۧ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0285 {

    /* JADX INFO: renamed from: ۦۥۡۦ, reason: contains not printable characters */
    public static int f429 = 984;

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static m0 m5477() {
        if (C0234.m4495() < 0) {
            return m0.f9192b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m5478(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۧ, reason: not valid java name and contains not printable characters */
    public static c m5479(Object obj) {
        if (C0079.m1701() > 0) {
            return ((t) obj).f5915w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5480() {
        if (C0117.m2257() >= 0) {
            return "Value of the primary key is not set.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String[] m5481(Object obj, Object obj2, Object obj3) {
        if (C0223.m4279() < 0) {
            return b.n((String[]) obj, (String[]) obj2, (Comparator) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5482(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int m5483() {
        return (-150) ^ C0183.f207;
    }

    /* JADX INFO: renamed from: ۣۡ۟۟, reason: not valid java name and contains not printable characters */
    public static MainViewModel m5484(Object obj) {
        if (C0008.m169() <= 0) {
            return ((i2) obj).f4579b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static x3 m5485() {
        if (C0283.m5446() >= 0) {
            return x.f10501p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ۠, reason: not valid java name and contains not printable characters */
    public static long m5486(Object obj) {
        if (C0030.m575() > 0) {
            return ((i0) obj).f8997a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۥۣۣ, reason: contains not printable characters */
    public static Object m5487(Object obj, Object obj2) {
        if (C0347.m6774() >= 0) {
            return ((c0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m5488(Object obj) {
        if (C0127.m2448() > 0) {
            return ((h2) obj).f8974f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m5489(Object obj, Object obj2) {
        if (C0186.m3548() < 0) {
            return ((h0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static t0 m5490(Object obj, Object obj2) {
        if (C0242.m4629() < 0) {
            return ((a4.c0) obj).c((KeyEvent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m5476(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
