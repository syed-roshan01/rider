package y;

import aa.C0012;
import android.os.Bundle;
import androidx.compose.ui.semantics.C0039;
import c3.C0062;
import c4.C0066;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.remote.C0163;
import d.C0210;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.migration.C0254;
import ea.C0267;
import h6.C0309;
import h8.C0314;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import k0.p2;
import k6.d7;
import k6.r5;
import k6.x7;
import k6.y3;
import l6.C0343;
import la.C0348;
import m0.u1;
import r9.C0405;
import t9.C0427;
import z3.C0485;
import z7.C0489;

/* JADX INFO: renamed from: y.ۤۨۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0475 {

    /* JADX INFO: renamed from: ۟ۡ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int f746 = -27;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9251() {
        if (C0117.m2257() >= 0) {
            return zznp.zzd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static e0.e m9252() {
        if (C0254.m4866() < 0) {
            return p2.f9355c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m9253(Object obj) {
        if (C0309.m5971() < 0) {
            return ((k6.e) obj).f9987a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static k6.j m9254(Object obj, Object obj2) {
        if (C0489.m9528() >= 0) {
            return ((y3) obj).d((x7) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m9256(Object obj, Object obj2) {
        if (C0485.m9449() <= 0) {
            return ((m0.q) obj).m((u1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static Task m9257(Object obj, Object obj2) {
        if (C0012.m226() >= 0) {
            return ((FirebaseUser) obj).updatePassword((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9258(Object obj) {
        if (C0210.m4028() <= 0) {
            return ((zzew.zzb) obj).zzk();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۨ, reason: not valid java name and contains not printable characters */
    public static Integer m9259(Object obj, Object obj2, int i10) {
        if (C0405.m7952() < 0) {
            return ((k0.l0) obj).a((r1.p) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m9260() {
        if (C0039.m764() >= 0) {
            return "app_id=? and name=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9261(boolean z10, int i10, int i11, Object obj) {
        if (C0267.m5113() < 0) {
            return k0.t0.i(z10, i10, i11, (r1.x0) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m9262(Object obj) {
        if (C0474.m9246() < 0) {
            ((MainViewModel) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ۟, reason: not valid java name and contains not printable characters */
    public static long m9263(Object obj) {
        if (C0163.m3132() >= 0) {
            return MainViewModel.k((String) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m9264(String str) {
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

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static d5.l m9265() {
        if (C0348.m6818() <= 0) {
            return d5.l.f4639w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m9266() {
        return 989 ^ C0062.f82;
    }

    /* JADX INFO: renamed from: ۥۧۧۧ, reason: contains not printable characters */
    public static r5 m9267() {
        if (C0314.m6079() > 0) {
            return r5.f10342c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static void m9268(Object obj, int i10) {
        if (C0328.m6350() > 0) {
            ((com.google.protobuf.v) obj).I0(i10);
        }
    }

    /* JADX INFO: renamed from: ۦۦۣۨ, reason: contains not printable characters */
    public static void m9269(Object obj, Object obj2) {
        if (C0230.m4440() > 0) {
            y3.e.b1((Bundle) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m9270(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥۡۡ, reason: not valid java name and contains not printable characters */
    public static g2.k0 m9271() {
        if (C0066.m1277() > 0) {
            return g2.r.f6592a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۤۡ, reason: not valid java name and contains not printable characters */
    public static zzcp m9272(Object obj) {
        if (C0427.m8371() < 0) {
            return ((d7) obj).f9980c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦ۟, reason: not valid java name and contains not printable characters */
    public static float m9273(float f10, float f11) {
        if (C0343.m6738() < 0) {
            return Math.max(f10, f11);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m9255(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
