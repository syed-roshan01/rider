package dagger.hilt.codegen;

import android.support.v4.app.C0015;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0022;
import c1.C0060;
import c7.C0068;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import d5.c1;
import d5.n0;
import d7.a;
import dagger.hilt.android.internal.modules.C0234;
import e1.C0259;
import e8.C0265;
import f5.y;
import h3.C0302;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k0.q;
import k0.t3;
import k6.f5;
import k6.l4;
import k6.p2;
import k6.s5;
import p9.q0;
import q.r;
import r2.C0395;
import u0.C0430;
import w2.C0456;
import w6.C0464;
import y.i1;
import y3.c;
import y3.e;
import z8.C0491;

/* JADX INFO: renamed from: dagger.hilt.codegen.۟۟ۡ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0241 {

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static int f321 = -806;

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static c[] m4618(Object obj, Object obj2, int i10) {
        if (C0120.m2311() < 0) {
            return e.A0((ByteArrayInputStream) obj, (String) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static l4 m4620(Object obj) {
        if (C0430.m8425() >= 0) {
            return ((f5) obj).f10031h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static i1 m4621(Object obj) {
        if (C0123.m2379() > 0) {
            return ((q) obj).f9368n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4622() {
        if (C0265.m5069() <= 0) {
            return zzne.zzau();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4623(Object obj) {
        if (C0464.m9059() < 0) {
            return ((y) obj).f6340a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m4624() {
        if (C0068.m1322() >= 0) {
            return "SAVE LANGUAGE";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4625(Object obj) {
        if (C0026.m508() >= 0) {
            return ((c1) obj).f4436a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4626(Object obj) {
        if (C0060.m1148() >= 0) {
            return ((n0) obj).f4694d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4627(Object obj) {
        if (C0073.m1597() > 0) {
            return ((s5) obj).f10356b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static q0 m4628(Object obj) {
        if (C0456.m8890() > 0) {
            return ((MainViewModel) obj).V;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m4629() {
        return (-812) ^ C0395.f666;
    }

    /* JADX INFO: renamed from: ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static void m4630(Object obj) {
        if (C0491.m9566() >= 0) {
            ((p2) obj).t();
        }
    }

    /* JADX INFO: renamed from: ۢۦۣۥ, reason: not valid java name and contains not printable characters */
    public static String m4631(String str) {
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

    /* JADX INFO: renamed from: ۣۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4632(Object obj, Object obj2) {
        if (C0302.m5836() > 0) {
            return ((r) obj).d(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4633(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۠۟ۡ, reason: contains not printable characters */
    public static Object m4634(Object obj, Object obj2) {
        if (C0022.m444() < 0) {
            return a.q((c9.e) obj, (u8.e) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static c9.e m4635(Object obj) {
        if (C0259.m4959() < 0) {
            return ((t3) obj).f9493f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۤ, reason: contains not printable characters */
    public static Task m4636(Object obj, Object obj2) {
        if (C0015.m294() <= 0) {
            return ((FirebaseUser) obj).reauthenticate((AuthCredential) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ, reason: contains not printable characters */
    public static int m4637(Object obj) {
        if (C0234.m4512() >= 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4619(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
