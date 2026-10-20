package d2;

import a2.C0005;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.model.C0159;
import d5.e0;
import d5.o1;
import e2.C0261;
import e9.C0266;
import f0.j1;
import g7.C0292;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.Map;
import k0.i2;
import k6.q6;
import m0.g1;
import r5.C0399;
import r9.C0405;
import s7.C0414;
import u3.C0434;

/* JADX INFO: renamed from: d2.۟ۦۡ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0215 {

    /* JADX INFO: renamed from: ۟۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int f239 = -794;

    /* JADX INFO: renamed from: ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m4099(String str) {
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

    /* JADX INFO: renamed from: ۟۠۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m4100(Object obj) {
        if (C0434.m8498() < 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4101(Object obj) {
        if (C0414.m8130() < 0) {
            return ((i9.f) obj).f8188c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4102(Object obj) {
        if (C0159.m3030() < 0) {
            return ((zzfi.zzj) obj).zzac();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4103(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4104(Object obj, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i12, int i13) {
        if (C0399.m7828() >= 0) {
            o1.c((MainViewModel) obj, z10, z11, z12, z13, i10, i11, (String) obj2, j10, (Map) obj3, (c9.a) obj4, (m0.m) obj5, i12, i13);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4106(Object obj) {
        if (C0292.m5634() < 0) {
            return ((q6) obj).f10324a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧ, reason: not valid java name and contains not printable characters */
    public static g1 m4107(Object obj) {
        if (C0005.m104() >= 0) {
            return ((e0) obj).f4469e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4108() {
        return 101 ^ C0266.f346;
    }

    /* JADX INFO: renamed from: ۨۤۧۤ, reason: not valid java name and contains not printable characters */
    public static a2.e m4109(Object obj) {
        if (C0261.m4991() >= 0) {
            return ((j1) obj).f5797a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۧۦ, reason: not valid java name and contains not printable characters */
    public static c9.f m4110(Object obj) {
        if (C0405.m7952() <= 0) {
            return ((i2) obj).f9030o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m4105(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
