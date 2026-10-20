package h;

import android.net.Uri;
import androidx.compose.ui.node.C0037;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.protobuf.l;
import d5.m1;
import dagger.hilt.C0256;
import dagger.hilt.internal.aggregatedroot.C0247;
import f5.b0;
import f5.v;
import i4.o;
import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import k0.i0;
import k0.m4;
import k0.q1;
import k0.t1;
import k6.t7;
import k6.u;
import k6.x7;
import k6.y3;
import l3.C0343;
import m0.m;
import m1.C0351;
import s7.C0415;
import s8.C0417;
import y.d;
import y.k;
import y3.e;
import y9.C0479;
import y9.C0480;

/* JADX INFO: renamed from: h.ۢۢۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0298 {

    /* JADX INFO: renamed from: ۟ۥۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int f445 = -490;

    /* JADX INFO: renamed from: ۟۠۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m5713(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((t1) obj).f9473a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static d m5714() {
        if (C0132.m2543() < 0) {
            return k.f16606b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5715(Object obj) {
        if (C0138.m2662() >= 0) {
            return ((m1) obj).f4677b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m5716(Object obj, Object obj2) {
        if (C0256.m4876() <= 0) {
            return ((b0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m5717(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5718(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m5719(Object obj, Object obj2) {
        if (C0037.m733() > 0) {
            e.L0((ByteArrayOutputStream) obj, (y3.c) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int m5720(Object obj) {
        if (C0171.m3272() < 0) {
            return ((v) obj).f6333a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5722() {
        return (-653) ^ C0351.f621;
    }

    /* JADX INFO: renamed from: ۢ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static o m5723() {
        if (C0168.m3229() >= 0) {
            return i4.a.f8017b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static m4 m5724(Object obj, Object obj2) {
        if (C0417.m8173() < 0) {
            return k0.m1.e((i0) obj, (m) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m5725(Object obj, Object obj2, Object obj3) {
        if (C0343.m6720() > 0) {
            ((y3) obj).o((t7) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static float m5726(Object obj) {
        if (C0150.m2892() <= 0) {
            return ((q1) obj).f9382q;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۣ۠, reason: contains not printable characters */
    public static String m5727() {
        if (C0415.m8130() <= 0) {
            return "Error storing app. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۢۡ, reason: contains not printable characters */
    public static u6.b m5728(Object obj, Object obj2) {
        if (C0479.m9326() < 0) {
            return ((w3.d) obj).d((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۦ۠, reason: contains not printable characters */
    public static boolean m5729(Object obj) {
        if (C0247.m4717() < 0) {
            return ((Matcher) obj).matches();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۤۧ, reason: contains not printable characters */
    public static l m5730(Object obj) {
        if (C0480.m9346() > 0) {
            return ((u) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m5721(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
