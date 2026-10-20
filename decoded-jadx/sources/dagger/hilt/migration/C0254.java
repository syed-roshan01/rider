package dagger.hilt.migration;

import a5.f0;
import android.app.job.JobInfo;
import androidx.compose.ui.graphics.C0031;
import b7.C0054;
import c9.c;
import c9.e;
import c9.f;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.measurement.C0181;
import d.C0210;
import d5.b0;
import d5.r;
import dagger.hilt.android.components.C0229;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.generatesrootinput.C0250;
import h.C0298;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import k0.f1;
import k0.h4;
import k0.s1;
import k6.p7;
import k6.u7;
import k6.y4;
import l0.q;
import l6.C0344;
import m0.m;
import o1.s;
import q0.C0381;
import u0.b;
import v6.C0446;
import w1.C0455;
import x2.C0467;
import y.t0;
import y0.o;
import y9.C0479;

/* JADX INFO: renamed from: dagger.hilt.migration.۟ۦۨۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0254 {

    /* JADX INFO: renamed from: ۟۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f334 = -972;

    /* JADX INFO: renamed from: ۟۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4853(Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5) {
        if (C0381.m7481() > 0) {
            ((p7) obj).i((String) obj2, i10, (Throwable) obj3, (byte[]) obj4, (Map) obj5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4854(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4855() {
        if (C0298.m5742() >= 0) {
            return "*";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4856() {
        if (C0242.m4660() < 0) {
            return "Payment Verification Under Process...";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static List m4857(Object obj) {
        if (C0446.m8696() >= 0) {
            return ((b0) obj).f4409e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static b m4858() {
        if (C0229.m4421() <= 0) {
            return r.f4746d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static void m4859(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z10, float f10, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, int i10, int i11) {
        if (C0157.m2999() > 0) {
            s1.b((o) obj, (e) obj2, (f) obj3, (e) obj4, (e) obj5, (e) obj6, (e) obj7, (e) obj8, z10, f10, (c) obj9, (e) obj10, (e) obj11, (t0) obj12, (m) obj13, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4860(Object obj) {
        if (C0054.m1047() > 0) {
            return ((y4) obj).f10566a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static long m4861(Object obj) {
        if (C0181.m3452() < 0) {
            return u7.t((byte[]) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠۟, reason: not valid java name and contains not printable characters */
    public static float m4862() {
        if (C0455.m8885() < 0) {
            return q.f11114b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۨۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m4863(Object obj, Object obj2) {
        if (C0210.m4028() < 0) {
            return ((f0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4864(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m4865(Object obj, long j10, int i10) {
        if (C0467.m9101() < 0) {
            s.o0((ByteArrayOutputStream) obj, j10, i10);
        }
    }

    /* JADX INFO: renamed from: ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4866() {
        return (-438) ^ C0344.f615;
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static JobInfo m4867(Object obj) {
        if (C0127.m2448() > 0) {
            return ((JobInfo.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠۠, reason: contains not printable characters */
    public static b m4868() {
        if (C0250.m4793() > 0) {
            return r.f4743a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨ۠, reason: contains not printable characters */
    public static f1[] m4869() {
        if (C0479.m9346() > 0) {
            return f1.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4871(Object obj) {
        if (C0031.m598() > 0) {
            return ((h4) obj).f8989o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۧ, reason: contains not printable characters */
    public static String m4870(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
