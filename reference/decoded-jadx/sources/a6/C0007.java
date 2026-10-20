package a6;

import a2.a0;
import android.os.Build;
import androidx.core.content.C0041;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.ktx.C0199;
import d1.d;
import d5.x1;
import f5.u;
import g2.i0;
import java.io.ByteArrayOutputStream;
import k6.a5;
import m0.g1;
import m0.n1;
import m9.e0;
import r1.l0;
import r2.C0397;
import t.k0;
import t2.C0421;
import u8.e;
import v7.C0449;

/* JADX INFO: renamed from: a6.۟ۤۨۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0007 {

    /* JADX INFO: renamed from: ۟۠۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int f27 = -417;

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static d m145(Object obj, int i10, Object obj2, Object obj3, boolean z10, int i11) {
        if (C0199.m3818() > 0) {
            return e0.k((l0) obj, i10, (i0) obj2, (a0) obj3, z10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static n1 m146(Object obj) {
        if (C0397.m7764() < 0) {
            return ((k0) obj).f14220d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۧۦ, reason: not valid java name and contains not printable characters */
    public static e m147(Object obj, Object obj2, Object obj3) {
        if (C0041.m812() >= 0) {
            return ((u) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static g1 m148(Object obj) {
        if (C0180.m3448() > 0) {
            return ((x1) obj).f4848d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m149(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m150() {
        if (C0168.m3229() > 0) {
            return Build.MODEL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m151(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static com.google.crypto.tink.shaded.protobuf.k0 m152(Object obj) {
        if (C0449.m8755() > 0) {
            return ((r1) obj).f3614a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m153(Object obj, long j10) {
        if (C0075.m1631() < 0) {
            ((a5) obj).G(j10);
        }
    }

    /* JADX INFO: renamed from: ۥۣۤۥ, reason: contains not printable characters */
    public static int m154() {
        return 659 ^ C0421.f692;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static String m155(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
