package x2;

import a2.b0;
import a2.c0;
import a7.C0008;
import android.content.ContentValues;
import androidx.compose.ui.layout.C0036;
import b.C0049;
import ca.C0070;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.emulators.C0141;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.C0201;
import d9.C0226;
import dagger.hilt.internal.C0254;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import k0.d5;
import k0.e5;
import k0.l1;
import k0.t0;
import k1.C0333;
import k6.a5;
import k6.x;
import k6.x3;
import l2.C0342;
import t2.C0423;
import x8.C0474;

/* JADX INFO: renamed from: x2.۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0468 {

    /* JADX INFO: renamed from: ۟ۧۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int f738 = -416;

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static d5 m9094(long j10, Object obj) {
        if (C0070.m1363() > 0) {
            return t0.j(j10, (m0.m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۤ, reason: not valid java name and contains not printable characters */
    public static x3 m9095() {
        if (C0254.m4844() >= 0) {
            return x.f10519y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Object m9096(Object obj, Object obj2) {
        if (C0049.m945() >= 0) {
            return ((ConcurrentHashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9097(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static void m9098(Object obj, Object obj2, Object obj3) {
        if (C0201.m3855() <= 0) {
            ((ContentValues) obj).put((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m9099(long j10) {
        if (C0333.m6454() < 0) {
            return b0.d(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m9101() {
        return 675 ^ C0008.f28;
    }

    /* JADX INFO: renamed from: ۢۧۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9102(Object obj, Object obj2) {
        if (C0107.m2075() < 0) {
            ((a5) obj).n((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static String m9103() {
        if (C0141.m2714() <= 0) {
            return "Error opening database";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static String m9104(Object obj) {
        if (C0342.m6699() <= 0) {
            return ((f5.r) obj).f6321o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static void m9105(Object obj, Object obj2) {
        if (C0226.m4339() <= 0) {
            MainViewModel.d((MainViewModel) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۤۤ, reason: contains not printable characters */
    public static c0 m9106(Object obj) {
        if (C0474.m9210() < 0) {
            return ((e5) obj).f8885f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۠۠, reason: contains not printable characters */
    public static String m9107(String str) {
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

    /* JADX INFO: renamed from: ۨ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static y.t0 m9108(Object obj) {
        if (C0187.m3565() > 0) {
            return ((l1) obj).f9167w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static u8.e m9109(Object obj, Object obj2, Object obj3) {
        if (C0423.m8294() > 0) {
            return ((a5.a) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m9110() {
        if (C0036.m698() < 0) {
            return "health_monitor_sample";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m9100(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
