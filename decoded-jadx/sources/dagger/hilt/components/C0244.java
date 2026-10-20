package dagger.hilt.components;

import aa.C0011;
import android.content.Context;
import com.auto.accept.data.model.TransactionData;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.remoteconfig.ktx.C0199;
import d5.a2;
import dagger.hilt.internal.componenttreedeps.C0248;
import f0.l1;
import i1.f;
import i9.e;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k3.C0335;
import k6.q;
import k6.y5;
import m3.C0352;
import m7.C0357;
import o1.u;
import r0.r;
import r9.C0405;
import s.C0408;
import s8.C0417;
import t2.C0420;
import u.C0429;
import v5.C0445;
import x7.C0471;
import z6.a;

/* JADX INFO: renamed from: dagger.hilt.components.ۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0244 {

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int f324 = 516;

    /* JADX INFO: renamed from: ۟۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4680(Object obj, Object obj2) {
        if (m4685() >= 0) {
            ((y5) obj).z((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static f m4681() {
        if (C0429.m8415() >= 0) {
            return a.L();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4682(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int m4683(Object obj) {
        if (C0405.m7952() <= 0) {
            return ((e) obj).f8185c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4684(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢۧۦ, reason: not valid java name and contains not printable characters */
    public static int m4685() {
        return 907 ^ C0417.f688;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4686() {
        if (C0420.m8263() >= 0) {
            return "alert_on_accept";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4687() {
        if (C0408.m8009() <= 0) {
            return "Stopping uploading service(s)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static q.f m4688(Object obj) {
        if (C0011.m208() <= 0) {
            return ((q) obj).f10313c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m4689(Object obj, Object obj2, Object obj3) {
        if (C0199.m3818() >= 0) {
            return ((l1) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4691(Object obj) {
        if (C0471.m9190() < 0) {
            return ((zzfi.zzb) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4692(Object obj) {
        if (C0335.m6500() < 0) {
            return ((TransactionData) obj).getOrderId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m4693(Object obj) {
        if (C0445.m8692() < 0) {
            return ((zzfi.zzj) obj).zzap();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۥ, reason: contains not printable characters */
    public static Context m4694(Object obj) {
        if (C0357.m7001() < 0) {
            return ((a2) obj).f4402e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥۤ, reason: contains not printable characters */
    public static void m4695(Object obj) {
        if (C0248.m4762() > 0) {
            ((u) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۨۤۡۥ, reason: not valid java name and contains not printable characters */
    public static r m4696(Object obj, Object obj2, int i10, int i11) {
        if (C0352.m6904() < 0) {
            return ((r) obj).v((k.f) obj2, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4690(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
