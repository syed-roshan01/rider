package t1;

import android.content.Context;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.components.C0134;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.interop.C0197;
import d5.C0218;
import d9.C0226;
import dagger.hilt.android.internal.modules.C0233;
import h.C0298;
import h5.C0308;
import i.C0315;
import java.io.ByteArrayOutputStream;
import k0.j2;
import k0.z1;
import k6.f4;
import m0.l3;
import w4.C0460;
import w4.C0461;
import z.C0480;

/* JADX INFO: renamed from: t1.ۧۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0419 {

    /* JADX INFO: renamed from: ۟ۢۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int f690 = 90;

    /* JADX INFO: renamed from: ۟۟ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8234(Object obj) {
        if (C0233.m4495() < 0) {
            return ((zzfi.zzj) obj).zzbl();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static String m8235(String str) {
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

    /* JADX INFO: renamed from: ۟۠۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m8236(Object obj) {
        if (C0308.m5962() >= 0) {
            return ((zzfc.zza.zzf) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static e0.e m8237(float f10) {
        if (C0193.m3691() <= 0) {
            return e0.f.a(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8238(Object obj) {
        if (C0315.m6111() > 0) {
            return ((d5.g) obj).f4505r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8239(Object obj) {
        if (C0109.m2116() <= 0) {
            return ((d5.i0) obj).f4566e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m8240(Object obj) {
        if (C0218.m4224() < 0) {
            return ((y3.a) obj).f16876d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m8241(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۤ, reason: not valid java name and contains not printable characters */
    public static l3 m8242(Object obj) {
        if (C0460.m8972() >= 0) {
            return ((d5.w0) obj).f4824n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int m8243(Object obj) {
        if (C0226.m4372() < 0) {
            return ((j2) obj).f9073p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m8244(Object obj, boolean z10) {
        if (C0197.m3786() <= 0) {
            y3.k.c((Context) obj, z10);
        }
    }

    /* JADX INFO: renamed from: ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8245(Object obj, Object obj2, Object obj3) {
        if (C0131.m2522() >= 0) {
            ((f4) obj).c((String) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m8246(Object obj, Object obj2) {
        if (C0134.m2587() < 0) {
            return ((f5.o) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8247() {
        return 557 ^ C0461.f732;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8248(Object obj) {
        if (C0480.m9354() <= 0) {
            return ((f0.h) obj).f5719p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8249() {
        if (C0298.m5742() > 0) {
            return "1000";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m8251(Object obj) {
        if (C0024.m487() >= 0) {
            return ((k0.v0) obj).f9543a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static long m8252(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((z1) obj).f9692d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۢۥ, reason: not valid java name and contains not printable characters */
    public static String m8250(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
