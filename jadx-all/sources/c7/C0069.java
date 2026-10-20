package c7;

import a2.z;
import android.content.Context;
import androidx.annotation.C0018;
import androidx.versionedparcelable.C0048;
import b3.s;
import c4.C0064;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.iid.C0171;
import d9.C0223;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0243;
import f5.u;
import java.io.ByteArrayOutputStream;
import k0.c1;
import k0.m2;
import k0.o1;
import k0.x4;
import k3.C0335;
import k6.d4;
import k6.f;
import k6.f4;
import k6.g;
import k6.t;
import l2.q;
import m7.C0357;
import p0.C0374;
import y.t0;
import y0.o;
import y3.e;
import y9.C0479;
import z3.C0486;

/* JADX INFO: renamed from: c7.ۨۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0069 {

    /* JADX INFO: renamed from: ۥ۟ۧۢ, reason: contains not printable characters */
    public static int f89 = -810;

    /* JADX INFO: renamed from: ۟۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1332() {
        return (-847) ^ C0234.f313;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static s m1333(Object obj) {
        if (C0151.m2903() > 0) {
            return ((m2) obj).f9211e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static long m1334(Object obj) {
        if (C0048.m925() > 0) {
            return ((q) obj).f11224b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۨ, reason: not valid java name and contains not printable characters */
    public static d9.b m1335() {
        if (C0486.m9449() <= 0) {
            return d9.b.f4933a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static g m1336(Object obj) {
        if (C0357.m6984() > 0) {
            return ((f) obj).f10014c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static void m1337(Object obj, Object obj2, Object obj3, boolean z10) {
        if (C0064.m1243() >= 0) {
            e.S0((Context) obj, (m.a) obj2, (y3.d) obj3, z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1338(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m1339(Object obj) {
        if (C0231.m4440() >= 0) {
            return ((z) obj).f1055d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m1340(Object obj, Object obj2) {
        if (C0374.m7322() <= 0) {
            return ((u) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥ۟, reason: not valid java name and contains not printable characters */
    public static MainViewModel m1341(Object obj) {
        if (C0233.m4482() > 0) {
            return ((d5.e) obj).f4462f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1342(Object obj) {
        if (C0479.m9326() <= 0) {
            return ((AppConfig) obj).getBetaKillSwitch();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۢۥ, reason: not valid java name and contains not printable characters */
    public static o m1343(Object obj) {
        if (C0171.m3272() <= 0) {
            return ((c1) obj).f8781b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1344(Object obj) {
        if (C0018.m354() > 0) {
            return ((o1) obj).f9294n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static f4 m1345(Object obj) {
        if (C0137.m2646() < 0) {
            return ((d4) obj).f9966h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۧ, reason: not valid java name and contains not printable characters */
    public static t0 m1346(Object obj) {
        if (C0486.m9449() < 0) {
            return ((x4) obj).f9659c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۡ, reason: contains not printable characters */
    public static String m1347(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۥۤۨ, reason: contains not printable characters */
    public static f0.e m1348() {
        if (C0335.m6491() >= 0) {
            return f0.e.f5670b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1350(int i10) {
        if (C0124.m2386() >= 0) {
            return Character.isISOControl(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1351(Object obj, int i10, int i11) {
        if (C0223.m4279() < 0) {
            ((p) obj).Q0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۨۢۦۤ, reason: not valid java name and contains not printable characters */
    public static long m1352(Object obj) {
        if (C0243.m4660() < 0) {
            return ((t) obj).f10369e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1349(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
