package v0;

import android.net.Uri;
import android.view.WindowManager;
import androidx.compose.ui.input.pointer.C0034;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.interop.C0197;
import d5.a0;
import dagger.hilt.android.internal.modules.C0235;
import f0.u;
import g5.C0291;
import i4.C0318;
import j2.C0325;
import java.io.ByteArrayOutputStream;
import k0.i0;
import k0.m2;
import k0.o0;
import k0.q3;
import k0.v1;
import k2.C0334;
import k6.b5;
import k6.z4;
import m0.l3;
import r1.i1;
import r2.C0395;
import r2.C0398;
import x5.C0471;

/* JADX INFO: renamed from: v0.۟ۦۣ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0443 {

    /* JADX INFO: renamed from: ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int f713 = -103;

    /* JADX INFO: renamed from: ۟۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8628(Object obj) {
        if (C0034.m667() > 0) {
            return ((d5.d) obj).f4442a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m8630() {
        return (-978) ^ C0179.f203;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m8631() {
        if (C0160.m3070() < 0) {
            return "last_bundle_index";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۡ, reason: not valid java name and contains not printable characters */
    public static i1 m8632(Object obj) {
        if (C0318.m6144() <= 0) {
            return ((m2) obj).f9215p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۦ, reason: not valid java name and contains not printable characters */
    public static float m8633() {
        if (C0291.m5589() <= 0) {
            return v1.f9549a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۥ, reason: not valid java name and contains not printable characters */
    public static u0.b m8634() {
        if (C0398.m7764() <= 0) {
            return o0.f9287d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۡ, reason: not valid java name and contains not printable characters */
    public static q3 m8635(Object obj) {
        if (C0471.m9151() > 0) {
            return ((i0) obj).R;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۡ, reason: not valid java name and contains not printable characters */
    public static float m8636(Object obj) {
        if (C0197.m3786() < 0) {
            return ((k0.e) obj).f8851o;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8637() {
        if (C0334.m6472() <= 0) {
            return "Database error getting next bundle app id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m8638(Object obj) {
        if (C0200.m3841() <= 0) {
            return ((WindowManager.LayoutParams) obj).x;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static y0.o m8639(Object obj) {
        if (C0184.m3517() > 0) {
            return ((u) obj).f5957s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۢۦ, reason: contains not printable characters */
    public static int m8640(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۧ۟ۡ, reason: contains not printable characters */
    public static l3 m8641(Object obj) {
        if (C0190.m3639() >= 0) {
            return ((a0) obj).f4388c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m8642(Object obj, Object obj2, Object obj3) {
        if (C0325.m6278() <= 0) {
            return ((Uri.Builder) obj).appendQueryParameter((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۨ, reason: not valid java name and contains not printable characters */
    public static z4 m8643(Object obj) {
        if (C0395.m7729() > 0) {
            return ((b5) obj).f9914b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static float m8644(long j10) {
        if (C0235.m4512() >= 0) {
            return m2.g.a(j10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m8645(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m8629(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
