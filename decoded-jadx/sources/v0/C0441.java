package v0;

import a2.C0005;
import a5.v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import androidx.compose.ui.input.key.C0033;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.model.C0160;
import com.google.gson.internal.bind.C0206;
import d5.k2;
import dagger.hilt.android.internal.migration.C0232;
import e2.C0260;
import f0.e0;
import h.C0296;
import h5.C0308;
import j3.C0325;
import j4.C0326;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import k6.a5;
import k6.c4;
import m0.C0349;
import m0.l3;
import n8.C0365;
import p9.q0;
import r9.C0405;
import v5.C0444;
import x7.C0471;
import y1.r;
import y1.u;
import z7.C0488;

/* JADX INFO: renamed from: v0.۟ۤۧ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0441 {

    /* JADX INFO: renamed from: ۟ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int f712 = -253;

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static long m8606(Object obj) {
        if (C0147.m2805() <= 0) {
            return ((a5) obj).f9879n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8607(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m8608(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((g5.a) obj).f6615c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8609(Object obj) {
        if (C0260.m4984() > 0) {
            return ((e0) obj).f5676c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static d5.l m8610() {
        if (C0232.m4482() >= 0) {
            return d5.l.f4625b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8611(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m8612() {
        return 820 ^ C0471.f742;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۥ, reason: not valid java name and contains not printable characters */
    public static u m8613() {
        if (C0206.m3931() > 0) {
            return r.f16841z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static FirebaseAuth m8614() {
        if (C0103.m2022() > 0) {
            return FirebaseAuth.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۧ, reason: not valid java name and contains not printable characters */
    public static q0 m8615(Object obj) {
        if (C0405.m7952() < 0) {
            return ((MainViewModel) obj).N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8616(Object obj, Object obj2) {
        if (C0308.m5962() > 0) {
            return ((c4) obj).e((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static y0.o m8617(Object obj, Object obj2) {
        if (C0033.m652() < 0) {
            return androidx.compose.foundation.layout.c.n((y0.o) obj, (y0.g) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static l3 m8619(Object obj) {
        if (C0326.m6304() < 0) {
            return ((k2) obj).f4615d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m8620(Object obj, Object obj2) {
        if (C0160.m3070() <= 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m8621(Object obj) {
        if (C0349.m6838() < 0) {
            return ((v) obj).f1313a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۣ, reason: not valid java name and contains not printable characters */
    public static k.f m8622(int i10, float f10, float f11) {
        if (C0296.m5709() < 0) {
            return t.k.c(i10, f10, f11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static void m8623(Object obj, Object obj2, Object obj3) {
        if (C0365.m7172() > 0) {
            ((ViewManager) obj).updateViewLayout((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۨۥۤ, reason: not valid java name and contains not printable characters */
    public static String m8624(Object obj) {
        if (C0488.m9505() > 0) {
            return ((zzfi.zzj) obj).zzy();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8625() {
        if (C0120.m2311() <= 0) {
            return "name";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠۟, reason: not valid java name and contains not printable characters */
    public static void m8626(Object obj) {
        if (C0005.m104() >= 0) {
            ((c4.c) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۣۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m8627(Object obj) throws IOException {
        if (C0325.m6295() >= 0) {
            ((OutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۠ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static String m8618(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
