package w5;

import a2.c0;
import a5.n;
import a7.C0008;
import android.os.IBinder;
import c4.c;
import c4.d;
import com.auto.accept.service.C0072;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.C0105;
import com.google.gson.internal.bind.C0206;
import d1.C0211;
import d1.C0213;
import d5.s0;
import f0.c2;
import f4.C0275;
import h.C0298;
import i7.t1;
import java.io.ByteArrayOutputStream;
import k0.d1;
import k0.p1;
import k0.v3;
import k2.C0333;
import k6.r6;
import l0.u;
import l2.C0341;
import l6.C0343;
import m0.m;
import m0.n1;
import o8.C0371;
import r4.C0398;
import s3.C0412;
import t.e;
import t.u1;
import t2.C0422;
import t9.C0427;
import u8.j;
import w2.C0457;
import x7.C0472;
import y.j0;

/* JADX INFO: renamed from: w5.ۢۤۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0462 {

    /* JADX INFO: renamed from: ۟ۥۤۧ۠, reason: not valid java name and contains not printable characters */
    public static int f733 = 309;

    /* JADX INFO: renamed from: ۟ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static t1 m8995() {
        if (C0072.m1556() > 0) {
            return t1.UNKNOWN_PREFIX;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۡ, reason: not valid java name and contains not printable characters */
    public static c0 m8996() {
        if (C0427.m8371() < 0) {
            return u.f11185j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static u1 m8997(Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0412.m8089() < 0) {
            return e.u(obj, (String) obj2, (m) obj3, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static d m8999(Object obj) {
        if (C0343.m6738() < 0) {
            return ((c) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m9000(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static float m9001(Object obj) {
        if (C0105.m2045() > 0) {
            return ((j0) obj).d();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static n1 m9002(Object obj) {
        if (C0422.m8294() > 0) {
            return ((c2) obj).f5652q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m9003(Object obj) {
        if (C0211.m4046() > 0) {
            return ((p1) obj).F;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m9004(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۨۥ۟, reason: not valid java name and contains not printable characters */
    public static c9.a m9005(Object obj) {
        if (C0333.m6472() < 0) {
            return ((v3) obj).f9557b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int m9006(Object obj) {
        if (C0298.m5742() >= 0) {
            return ((zzfi.zze) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤ۠, reason: not valid java name and contains not printable characters */
    public static c9.c m9007(Object obj) {
        if (C0343.m6738() < 0) {
            return ((k0.u1) obj).f9517a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static u8.e m9008(Object obj, Object obj2, Object obj3) {
        if (C0341.m6699() < 0) {
            return ((n) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9009(Object obj) {
        if (C0213.m4083() <= 0) {
            return ((s0) obj).f4768a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn.zza m9010(Object obj, Object obj2) {
        if (C0371.m7283() > 0) {
            return ((zzfi.zzn.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static int m9011(Object obj) {
        if (C0398.m7797() <= 0) {
            return ((r6) obj).f10347a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9012() {
        if (C0457.m8901() < 0) {
            return "\u0939\u093f\u0902\u0926\u0940";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9013() {
        return 752 ^ C0008.f28;
    }

    /* JADX INFO: renamed from: ۤۥۦۢ, reason: not valid java name and contains not printable characters */
    public static String m9014(Object obj) {
        if (C0275.m5308() > 0) {
            return ((IBinder) obj).getInterfaceDescriptor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥ۟, reason: contains not printable characters */
    public static j m9015(Object obj, Object obj2) {
        if (C0206.m3931() > 0) {
            return ((j) obj).O((j) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨۡ, reason: not valid java name and contains not printable characters */
    public static int m9016(Object obj) {
        if (C0472.m9193() < 0) {
            return ((d1) obj).f8824e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m8998(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
