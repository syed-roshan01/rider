package o1;

import androidx.compose.foundation.C0026;
import c3.C0063;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.C0170;
import dagger.hilt.internal.aliasof.C0248;
import f1.C0274;
import g2.l0;
import h7.C0312;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import k0.l1;
import k0.m4;
import k0.x3;
import k6.m7;
import k6.o0;
import k6.s6;
import k6.u7;
import n.C0361;
import q9.C0392;
import r4.C0399;
import v0.C0441;
import v5.C0446;
import v6.C0447;
import w9.C0466;

/* JADX INFO: renamed from: o1.۟ۡۡۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0368 {

    /* JADX INFO: renamed from: ۟ۡۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f638 = -545;

    /* JADX INFO: renamed from: ۟۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m7194(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7195(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, Object obj6, boolean z10, Object obj7, Object obj8, int i11, int i12) {
        if (C0162.m3105() > 0) {
            y3.e.i((String) obj, (c9.c) obj2, (String) obj3, (c9.e) obj4, (c9.e) obj5, i10, (l0) obj6, z10, (y0.o) obj7, (m0.m) obj8, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static long m7196(Object obj) {
        if (C0392.m7657() > 0) {
            return ((m4) obj).f9235o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static long m7197(double d10) {
        if (C0447.m8696() > 0) {
            return s.M(d10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static c9.e m7198(Object obj) {
        if (C0466.m9068() <= 0) {
            return ((l1) obj).f9159o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m7199() {
        return 164 ^ C0026.f46;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟۠, reason: not valid java name and contains not printable characters */
    public static MainViewModel m7200(Object obj) {
        if (C0089.m1902() <= 0) {
            return ((f5.x) obj).f6339b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m7201(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m7202(Object obj) {
        if (C0361.m7073() <= 0) {
            ((s6) obj).B();
        }
    }

    /* JADX INFO: renamed from: ۢ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static c9.f m7204(Object obj) {
        if (C0446.m8692() < 0) {
            return ((x3) obj).f9654o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m7205(Object obj, Object obj2, Object obj3) {
        if (C0312.m6027() <= 0) {
            return ((a5.j) obj).c((String) obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static t1.i m7206() {
        if (C0248.m4732() <= 0) {
            return t1.k.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static p9.z m7207(Object obj) {
        if (C0441.m8597() >= 0) {
            return ((MainViewModel) obj).f3108p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m7208(Object obj) {
        if (C0170.m3247() < 0) {
            return ((k6.d) obj).f9953c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7209(Object obj) {
        if (C0399.m7797() < 0) {
            return ((d5.i0) obj).f4569o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡ۠, reason: contains not printable characters */
    public static void m7210(Object obj) {
        if (C0158.m3012() >= 0) {
            ((m7) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۨۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m7211(Object obj) {
        if (C0274.m5273() <= 0) {
            return ((o0) obj).f10248b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۥ۠, reason: not valid java name and contains not printable characters */
    public static MessageDigest m7212() {
        if (C0063.m1217() >= 0) {
            return u7.w0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7203(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
