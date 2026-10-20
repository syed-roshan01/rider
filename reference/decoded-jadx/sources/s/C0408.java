package s;

import android.content.IntentFilter;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.relocation.C0024;
import c1.C0061;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.remote.C0164;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e1.C0257;
import e9.C0266;
import f6.C0277;
import g.C0284;
import g5.C0291;
import i6.C0319;
import java.io.ByteArrayOutputStream;
import k0.c4;
import k0.h2;
import k0.q2;
import k6.a5;
import k6.w4;
import p8.C0380;
import r1.C0393;
import w4.C0459;

/* JADX INFO: renamed from: s.ۧۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0408 {

    /* JADX INFO: renamed from: ۟۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int f679 = -743;

    /* JADX INFO: renamed from: ۟۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m8002(Object obj, float f10, Object obj2, int i10) {
        if (C0016.m315() >= 0) {
            return l.q.d((y0.l) obj, f10, (m0.q) obj2, i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static float m8003() {
        if (C0291.m5605() < 0) {
            return c4.f8804e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8004(Object obj) {
        if (C0147.m2805() <= 0) {
            return ((w4) obj).i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m8005(Object obj) {
        if (C0393.m7716() >= 0) {
            return ((SupportedApp) obj).getIconRes();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8006() {
        if (C0277.m5361() < 0) {
            return l0.m.f11095b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m8007() {
        if (C0235.m4538() > 0) {
            return "distance_filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m8008() {
        if (C0237.m4583() >= 0) {
            return l0.r.f11125f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨ۠, reason: not valid java name and contains not printable characters */
    public static int m8009() {
        return 844 ^ C0380.f651;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m8011(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i10, int i11) {
        if (C0319.m6181() > 0) {
            m9.e0.j((c9.a) obj, (y0.o) obj2, z10, (e1.l0) obj3, (k0.y) obj4, (k0.d0) obj5, (u.w) obj6, (y.t0) obj7, (x.m) obj8, (c9.f) obj9, (m0.m) obj10, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۥ, reason: not valid java name and contains not printable characters */
    public static long m8012(Object obj) {
        if (C0245.m4710() > 0) {
            return ((a5) obj).f9873h;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۤ, reason: not valid java name and contains not printable characters */
    public static Class m8013(Object obj) {
        if (C0284.m5483() >= 0) {
            return Class.forName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m8014(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static p9.z m8015(Object obj) {
        if (C0266.m5099() < 0) {
            return ((MainViewModel) obj).f3104n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static e0.a m8016(Object obj) {
        if (C0024.m487() >= 0) {
            return ((q2) obj).f9391c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
    public static c9.e m8017(Object obj) {
        if (C0061.m1161() <= 0) {
            return ((h2) obj).f8972d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m8018(String str) {
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

    /* JADX INFO: renamed from: ۦۣۧ, reason: contains not printable characters */
    public static float m8019(Object obj) {
        if (C0459.m8951() < 0) {
            return ((l2.a) obj).f11194a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۢۢۨ, reason: not valid java name and contains not printable characters */
    public static long m8020(Object obj) {
        if (C0164.m3153() > 0) {
            return ((d5.i0) obj).f4570p;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧۦۡ, reason: not valid java name and contains not printable characters */
    public static void m8021(Object obj, Object obj2) {
        if (C0257.m4918() > 0) {
            ((IntentFilter) obj).addAction((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8010(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
