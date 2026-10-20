package v6;

import a8.C0010;
import c4.C0064;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.protobuf.v;
import dagger.hilt.internal.componenttreedeps.C0249;
import e2.C0262;
import f.C0271;
import f0.w1;
import f5.g0;
import g3.C0289;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import k0.d1;
import k0.v4;
import k6.p7;
import k6.w4;
import k6.x7;
import q6.C0389;
import r9.C0406;
import w0.C0455;
import z7.C0491;

/* JADX INFO: renamed from: v6.۟ۦۣۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0447 {

    /* JADX INFO: renamed from: ۤ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int f717 = -46;

    /* JADX INFO: renamed from: ۟۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8696() {
        return 899 ^ C0491.f764;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢۡ, reason: not valid java name and contains not printable characters */
    public static String m8697(Object obj) {
        if (C0138.m2662() > 0) {
            return ((g0) obj).f6269r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static z4.g m8699(Object obj) {
        if (C0406.m7952() <= 0) {
            return ((MainViewModel) obj).D0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m8700(Object obj) {
        if (C0262.m4991() >= 0) {
            return ((AppConfig) obj).getToastEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m8701(Object obj, Object obj2, int i10) {
        if (C0271.m5170() < 0) {
            ((d1) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8702(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String[] m8703() {
        if (C0202.m3868() >= 0) {
            return k6.k.f10141l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8704(Object obj, int i10, Object obj2) {
        if (C0389.m7600() <= 0) {
            ((v) obj).u0(i10, (com.google.protobuf.n) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m8705(Object obj, Object obj2, Object obj3) {
        if (C0249.m4762() > 0) {
            ((p7) obj).z((k6.v) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static float m8706() {
        if (C0320.m6181() >= 0) {
            return l0.n.f11099a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static c9.f m8707(Object obj) {
        if (C0289.m5547() > 0) {
            return ((v4) obj).f9570d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8708(Object obj) {
        if (C0010.m199() >= 0) {
            return ((w1) obj).f5987a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m8709(Object obj, int i10, Object obj2) {
        if (C0196.m3762() < 0) {
            ((w4) obj).F(i10, obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m8710(String str) {
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

    /* JADX INFO: renamed from: ۥۦۥۨ, reason: contains not printable characters */
    public static String m8711() {
        if (C0455.m8861() < 0) {
            return "Error storing into table. key";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۥ, reason: contains not printable characters */
    public static y0.o m8712(Object obj, Object obj2) {
        if (C0064.m1243() > 0) {
            return androidx.compose.foundation.a.k((y0.o) obj, (c9.a) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m8698(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
