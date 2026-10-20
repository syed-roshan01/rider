package r2;

import a4.t;
import android.graphics.Rect;
import c1.C0060;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d5.i1;
import dagger.hilt.android.components.C0228;
import e1.l0;
import e8.c2;
import fa.C0280;
import g0.C0285;
import g9.C0294;
import h8.C0314;
import java.io.ByteArrayOutputStream;
import k0.b3;
import k0.h4;
import k0.q3;
import k0.u3;
import m0.l3;
import u3.C0434;
import u8.C0438;
import y.C0475;
import y9.C0478;

/* JADX INFO: renamed from: r2.۠ۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0394 {

    /* JADX INFO: renamed from: ۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int f665 = 79;

    /* JADX INFO: renamed from: ۟۠ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7719(Object obj) {
        if (C0294.m5663() > 0) {
            return ((t) obj).f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m7720(Object obj) {
        if (C0314.m6079() >= 0) {
            return ((b3) obj).f8739b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static c9.a m7721(Object obj) {
        if (C0150.m2892() < 0) {
            return ((k0.l) obj).f9119a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m7722(Object obj) {
        if (C0060.m1148() > 0) {
            return ((Rect) obj).right;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟۠, reason: not valid java name and contains not printable characters */
    public static String m7723(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m7724(Object obj) {
        if (C0475.m9266() >= 0) {
            return ((i1) obj).f4576b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7725(Object obj, Object obj2) {
        if (C0280.m5432() > 0) {
            return ((FirebaseRemoteConfig) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static c9.e m7726(Object obj) {
        if (C0228.m4402() >= 0) {
            return ((h4) obj).f8988n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m7727(Object obj, Object obj2) {
        if (C0285.m5504() > 0) {
            return ((DocumentSnapshot) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m7728(Object obj, Object obj2) {
        if (C0138.m2662() > 0) {
            ((x9.h) obj).e((String[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۨۨۢ, reason: not valid java name and contains not printable characters */
    public static int m7729() {
        return (-752) ^ C0478.f752;
    }

    /* JADX INFO: renamed from: ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static void m7731(Object obj, boolean z10, boolean z11, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, float f10, float f11, float f12, Object obj7, int i10, int i11) {
        if (C0438.m8564() > 0) {
            u3.b((y.t) obj, z10, z11, (q3) obj2, (l3) obj3, (c9.e) obj4, (x.l) obj5, (l0) obj6, f10, f11, f12, (m0.m) obj7, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۦۥۦۥ, reason: contains not printable characters */
    public static int m7732(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static c2 m7733() {
        if (C0434.m8498() < 0) {
            return c2.f5224m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7730(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
