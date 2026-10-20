package m7;

import a5.w;
import android.content.Context;
import android.widget.Toast;
import androidx.core.app.C0040;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.provider.C0194;
import com.google.protobuf.v;
import d3.C0217;
import d5.d1;
import d9.C0225;
import e8.C0266;
import f0.g1;
import f0.k1;
import f0.u;
import h.C0299;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k6.h4;
import k6.p7;
import l.q;
import m0.m;
import t2.C0421;
import w2.C0458;

/* JADX INFO: renamed from: m7.ۡۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0357 {

    /* JADX INFO: renamed from: ۣ۠۠۠, reason: not valid java name and contains not printable characters */
    public static int f627 = 733;

    /* JADX INFO: renamed from: ۟۠ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6982(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6983() {
        if (C0138.m2662() > 0) {
            return la.g.f11423h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m6984() {
        return 587 ^ C0225.f304;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m6985(Object obj, boolean z10, int i10) {
        if (C0142.m2725() >= 0) {
            return q.f((m0.q) obj, z10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static void m6986(Object obj, int i10) {
        if (C0217.m4114() < 0) {
            ((v) obj).x0(i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static i1.f m6987() {
        if (C0040.m792() >= 0) {
            return z6.a.H();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m6988(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static c9.f m6989(Object obj) {
        if (C0186.m3548() <= 0) {
            return ((u) obj).f5946a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static Toast m6990(Object obj, Object obj2, int i10) {
        if (C0179.m3417() > 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static String m6991(Object obj) {
        if (C0115.m2227() < 0) {
            return ((h4) obj).f10080a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۡ, reason: contains not printable characters */
    public static boolean m6993(Object obj) {
        if (C0194.m3713() >= 0) {
            return ((p7) obj).f10307v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static u8.e m6994(Object obj, Object obj2, Object obj3) {
        if (C0299.m5742() >= 0) {
            return ((w) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static String m6995(Object obj) {
        if (C0458.m8901() < 0) {
            return ((p7) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static k1 m6996(Object obj) {
        if (C0421.m8263() > 0) {
            return ((g1) obj).f5709b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m6997(Object obj, Object obj2, Object obj3, int i10) {
        if (C0266.m5069() < 0) {
            ((d1) obj).a((y.v) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۨ۟, reason: contains not printable characters */
    public static String m6992(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
