package q9;

import android.content.ContentValues;
import android.content.Context;
import android.widget.TextView;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.platform.C0038;
import androidx.profileinstaller.C0045;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.C0177;
import com.google.firebase.ktx.C0179;
import com.google.protobuf.y0;
import e2.C0260;
import f0.j1;
import g2.c0;
import g2.e0;
import java.io.ByteArrayOutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;
import k0.q1;
import k2.C0333;
import k6.f5;
import k6.n4;
import k6.p7;
import k6.w5;
import m0.C0349;
import m5.C0355;
import p9.q0;
import w4.C0460;
import w9.C0465;
import z2.C0484;

/* JADX INFO: renamed from: q9.۟ۧۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0391 {

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int f662 = 803;

    /* JADX INFO: renamed from: ۟۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m7652(String str) {
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

    /* JADX INFO: renamed from: ۟۠۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7653(Object obj) {
        if (C0179.m3417() >= 0) {
            return ((n4) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static q0 m7654(Object obj) {
        if (C0028.m557() >= 0) {
            return ((z4.d) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m7655(Object obj, Object obj2) {
        if (C0355.m6968() > 0) {
            ((e0) obj).a((c0) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static y0.o m7656(Object obj) {
        if (C0349.m6838() < 0) {
            return ((f0.h) obj).f5713c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int m7657() {
        return 184 ^ C0045.f65;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨ۟, reason: not valid java name and contains not printable characters */
    public static int m7658(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static List m7659(Object obj) {
        if (C0333.m6472() <= 0) {
            return ((j1) obj).f5805i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static float m7661(Object obj, int i10) {
        if (C0484.m9436() <= 0) {
            return ((a2.a0) obj).d(i10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static Context m7662(Object obj) {
        if (C0460.m8972() >= 0) {
            return ((w5) obj).f10456a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static void m7663(Object obj, Object obj2, Object obj3) {
        if (C0152.m2931() >= 0) {
            ((ContentValues) obj).put((String) obj2, (Long) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m7664(Object obj, int i10, int i11, int i12, int i13) {
        if (C0171.m3272() <= 0) {
            ((TextView) obj).setPadding(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: ۢۧۨۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m7665(Object obj) {
        if (C0465.m9068() < 0) {
            return ((f5) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۤ, reason: not valid java name and contains not printable characters */
    public static c9.f m7666(Object obj) {
        if (C0025.m495() > 0) {
            return ((q1) obj).f9375c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static FileChannel m7667(Object obj) {
        if (C0156.m2976() > 0) {
            return ((p7) obj).f10309x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦ۟, reason: contains not printable characters */
    public static Charset m7668() {
        if (C0260.m4984() >= 0) {
            return y0.f4276a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧ۠, reason: contains not printable characters */
    public static String m7669() {
        if (C0177.m3380() >= 0) {
            return "waiting_for_payment";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m7670(Object obj) {
        if (C0038.m750() <= 0) {
            return ((a2.p) obj).f963g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m7660(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
