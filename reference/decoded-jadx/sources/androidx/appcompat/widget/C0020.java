package androidx.appcompat.widget;

import a2.e;
import a5.j;
import android.graphics.Rect;
import b0.o0;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.measurement_impl.C0185;
import d5.k0;
import d5.s1;
import d9.C0225;
import dagger.hilt.C0255;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import f0.b1;
import f0.p0;
import f0.x0;
import f0.y0;
import g2.a0;
import java.io.ByteArrayOutputStream;
import k.C0331;
import k6.k;
import k8.C0338;
import m0.g1;
import o8.C0371;
import r5.C0400;
import v5.C0444;
import v9.C0452;
import z.C0481;
import z7.C0489;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۣۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0020 {

    /* JADX INFO: renamed from: ۣ۟ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f40 = -667;

    /* JADX INFO: renamed from: ۟۠ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int m397(Object obj) {
        if (C0338.m6645() < 0) {
            return ((Rect) obj).top;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static g1 m398(Object obj) {
        if (C0331.m6408() < 0) {
            return ((k0) obj).f4601d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int m399() {
        return (-229) ^ C0168.f192;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static String m400(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧۦۣ, reason: not valid java name and contains not printable characters */
    public static String m401() {
        if (C0400.m7847() < 0) {
            return "Database returned empty set";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۢ, reason: not valid java name and contains not printable characters */
    public static FirebaseAuth m402(Object obj) {
        if (C0086.m1846() > 0) {
            return ((j) obj).f1276a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m403(Object obj) {
        if (C0444.m8673() >= 0) {
            return ((b1) obj).f5616d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m404(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m405(Object obj, Object obj2, Object obj3) {
        if (C0255.m4876() < 0) {
            ((k) obj).d0((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m407(Object obj) {
        if (C0185.m3538() > 0) {
            return ((p0) obj).f5845c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m408(Object obj) {
        if (C0371.m7283() > 0) {
            return ((s1) obj).f4775e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static String m409(Object obj) {
        if (C0481.m9373() < 0) {
            return ((zzfi.zzg) obj).zzh();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤۥ, reason: contains not printable characters */
    public static x0 m410() {
        if (C0452.m8825() >= 0) {
            return y0.f6007a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۦ, reason: contains not printable characters */
    public static float m411() {
        if (C0489.m9528() > 0) {
            return o0.f2450a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۤۧۤ, reason: not valid java name and contains not printable characters */
    public static a0 m412(Object obj, Object obj2, long j10, int i10) {
        if (C0245.m4710() > 0) {
            return a0.a((a0) obj, (e) obj2, j10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m413(Object obj) {
        if (C0225.m4339() < 0) {
            ((MainViewModel) obj).p();
        }
    }

    /* JADX INFO: renamed from: ۣۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m406(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
