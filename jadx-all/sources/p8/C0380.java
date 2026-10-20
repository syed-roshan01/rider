package p8;

import a2.e;
import a5.r;
import a5.z;
import android.app.Activity;
import android.content.Intent;
import android.os.IInterface;
import androidx.annotation.C0018;
import androidx.compose.foundation.C0026;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.node.C0037;
import c5.c;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.components.C0134;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.iid.C0171;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0187;
import d5.b1;
import d5.g1;
import d5.t1;
import f0.b0;
import f0.c2;
import f0.d0;
import f0.u;
import g2.a0;
import h8.n;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import k0.e3;
import k0.l0;
import k0.n2;
import k0.n4;
import k0.o2;
import k0.v2;
import k0.w4;
import k6.d7;
import k6.f;
import k6.h7;
import k6.p7;
import k6.x;
import k6.x3;
import m0.m;
import m3.C0353;
import m5.C0355;
import p9.q0;
import q0.C0383;
import r7.C0404;
import s7.C0416;
import s8.C0417;
import t1.k;
import t1.l;
import t2.C0423;
import t2.C0424;
import u0.b;
import u1.C0432;
import u8.C0439;
import v0.C0441;
import z.C0481;

/* JADX INFO: renamed from: p8.۟۟ۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0380 {

    /* JADX INFO: renamed from: ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static int f650 = 318;

    /* JADX INFO: renamed from: ۟۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static b m7425() {
        if (C0037.m733() >= 0) {
            return c.f2974f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static long m7426(Object obj, Object obj2, Object obj3) {
        if (C0439.m8564() >= 0) {
            return ((f) obj).r((String) obj2, (x3) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7427(Object obj) {
        if (C0404.m7911() < 0) {
            return ((t1) obj).f4784d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static k m7428() {
        if (C0079.m1701() > 0) {
            return l.f14477k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static l0 m7429() {
        if (C0424.m8307() >= 0) {
            return l0.f9148u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static q0 m7430(Object obj) {
        if (C0134.m2587() < 0) {
            return ((MainViewModel) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7431(Object obj, Object obj2, int i10) {
        if (C0432.m8447() <= 0) {
            ((b1) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7432(Object obj) {
        if (C0031.m598() > 0) {
            return ((b0) obj).f5609b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int m7433() {
        return 235 ^ C0416.f686;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static IInterface m7434(Object obj) {
        if (C0132.m2543() <= 0) {
            return ((com.google.android.gms.common.internal.f) obj).getService();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m7436(Object obj, Object obj2) {
        if (C0439.m8564() >= 0) {
            return ((v2) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m7437(String str) {
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

    /* JADX INFO: renamed from: ۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m7438(Object obj) {
        if (C0171.m3272() < 0) {
            return ((g1) obj).f4524u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m7439(Object obj) {
        if (C0326.m6295() > 0) {
            return ((p7) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static r1.l0 m7440(Object obj) {
        if (C0118.m2274() <= 0) {
            return ((w4) obj).f9632u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m7441(Object obj) {
        if (C0026.m508() > 0) {
            return ((d0) obj).f5663d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static h7 m7442(Object obj) {
        if (C0383.m7487() < 0) {
            return ((d7) obj).f9983f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m7443() {
        if (C0156.m2976() > 0) {
            return n2.f9268c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۤۢۡ, reason: not valid java name and contains not printable characters */
    public static a0 m7444(Object obj) {
        if (C0423.m8294() > 0) {
            return ((u) obj).f5952n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static o2 m7445() {
        if (C0192.m3659() > 0) {
            return o2.f9309c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static z m7446(Object obj) {
        if (C0441.m8597() > 0) {
            return ((r) obj).f1299b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static long m7447(Object obj) {
        if (C0355.m6953() < 0) {
            return ((n4) obj).f9280e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۤ, reason: contains not printable characters */
    public static boolean m7448(Object obj) {
        if (C0417.m8173() < 0) {
            return ((ArrayDeque) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۦ۠, reason: contains not printable characters */
    public static Intent m7449(Object obj) {
        if (C0439.m8564() >= 0) {
            return ((Activity) obj).getIntent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ, reason: contains not printable characters */
    public static boolean m7450(Object obj) {
        if (C0187.m3565() >= 0) {
            return ((zzfi.zzb) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static e m7451(Object obj) {
        if (C0035.m690() <= 0) {
            return ((c2) obj).f5645j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m7452(Object obj) {
        if (C0481.m9354() < 0) {
            return ((e3) obj).f8868b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۢ, reason: not valid java name and contains not printable characters */
    public static int m7453(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۦۣ۟, reason: not valid java name and contains not printable characters */
    public static x3 m7454() {
        if (C0018.m354() > 0) {
            return x.f10517x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦۧ, reason: not valid java name and contains not printable characters */
    public static void m7455(Object obj, int i10, Object obj2, Object obj3) {
        if (C0353.m6904() < 0) {
            ((n) obj).s(i10, (j8.a) obj2, (e8.c2) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7435(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
