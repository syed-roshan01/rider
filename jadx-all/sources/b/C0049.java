package b;

import android.view.View;
import android.view.Window;
import androidx.activity.m0;
import androidx.activity.s;
import androidx.activity.w;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzob;
import com.google.firebase.inject.C0172;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.reporting.C0189;
import d5.C0219;
import d5.h2;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.internal.aliasof.C0248;
import e1.l0;
import f5.z;
import g.C0285;
import h8.C0314;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import k0.j0;
import k0.p1;
import k0.p3;
import k0.x3;
import k6.d6;
import k6.n6;
import k6.x;
import k6.y5;
import l8.C0346;
import p0.C0375;
import u1.C0433;
import x.m;
import y0.o;

/* JADX INFO: renamed from: b.۠ۨۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0049 {

    /* JADX INFO: renamed from: ۟ۥۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int f69 = 303;

    /* JADX INFO: renamed from: ۟۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m945() {
        return 572 ^ C0314.f461;
    }

    /* JADX INFO: renamed from: ۟۠۟۠۠, reason: not valid java name and contains not printable characters */
    public static m m946(Object obj) {
        if (C0189.m3621() >= 0) {
            return ((x3) obj).f9653n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m947() {
        if (C0248.m4732() < 0) {
            return zzob.zzd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static m m948(Object obj) {
        if (C0232.m4453() <= 0) {
            return ((p1) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ۠, reason: not valid java name and contains not printable characters */
    public static u8.e m949(Object obj, Object obj2, Object obj3) {
        if (C0229.m4402() > 0) {
            return ((a5.c) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m950(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, boolean z11) {
        if (C0219.m4224() <= 0) {
            ((w) obj).a((m0) obj2, (m0) obj3, (Window) obj4, (View) obj5, z10, z11);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static long m951(Object obj) {
        if (C0285.m5483() >= 0) {
            return ((d6) obj).f9978b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static CopyOnWriteArraySet m952(Object obj) {
        if (C0320.m6181() >= 0) {
            return ((y5) obj).f10570e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static o m953(Object obj, Object obj2, long j10, Object obj3, float f10) {
        if (C0375.m7350() < 0) {
            return p3.b((o) obj, (l0) obj2, j10, (u.w) obj3, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۢ, reason: not valid java name and contains not printable characters */
    public static List m954() {
        if (C0433.m8470() > 0) {
            return x.f10472a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟۠, reason: not valid java name and contains not printable characters */
    public static c9.e m955(Object obj) {
        if (C0035.m690() < 0) {
            return ((k0.e) obj).f8847d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m956(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static j0 m958() {
        if (C0181.m3452() < 0) {
            return j0.f9056d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static String m959(Object obj) {
        if (C0029.m568() <= 0) {
            return ((z) obj).f6349n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m960() {
        if (C0172.m3296() > 0) {
            return s.f1423b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۣ, reason: contains not printable characters */
    public static String m961(String str) {
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

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public static void m962(Object obj, Object obj2, int i10) {
        if (C0346.m6759() <= 0) {
            ((h2) obj).a((m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Serializable m963(Object obj) {
        if (C0084.m1804() > 0) {
            return ((n6) obj).f10231c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m957(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
