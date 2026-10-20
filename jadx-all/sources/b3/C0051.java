package b3;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.app.C0014;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.measurement.internal.C0105;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.firestore.SetOptions;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.interop.C0198;
import dagger.hilt.internal.definecomponent.C0250;
import j2.C0325;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.function.Predicate;
import k0.e5;
import k6.r5;
import k6.s5;
import l0.C0340;
import l0.C0341;
import l6.C0344;
import l8.C0347;
import org.json.JSONObject;
import q0.C0382;
import u4.C0436;
import w4.C0460;
import w6.C0465;
import z.C0481;

/* JADX INFO: renamed from: b3.۟ۧ۠ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0051 {

    /* JADX INFO: renamed from: ۟ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int f71 = -430;

    /* JADX INFO: renamed from: ۟۠ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m986(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0105.m2045() >= 0) {
            return ((a5.z) obj).b((String) obj2, (String) obj3, (String) obj4, (String) obj5, (u8.e) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static m0.g1 m987(Object obj) {
        if (C0465.m9059() <= 0) {
            return ((d5.h) obj).f4538e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m988(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((e8.p1) obj).f5334b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m989(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m990(Object obj, Object obj2) {
        if (C0325.m6278() < 0) {
            return ((s5) obj).f((r5) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m991() {
        if (C0072.m1556() > 0) {
            return "property_name";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۤ, reason: not valid java name and contains not printable characters */
    public static int m992() {
        return 68 ^ C0014.f34;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static int m993(int i10, Object obj, boolean z10, Object obj2) {
        if (C0122.m2355() > 0) {
            return l9.i.Q0(i10, (CharSequence) obj, z10, (char[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static SetOptions m994() {
        if (C0086.m1846() > 0) {
            return SetOptions.merge();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۤ, reason: not valid java name and contains not printable characters */
    public static String m995() {
        if (C0347.m6774() >= 0) {
            return "Monitoring ride apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢ۟, reason: not valid java name and contains not printable characters */
    public static a2.c0 m996(Object obj) {
        if (C0197.m3786() < 0) {
            return ((e5) obj).f8883d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static c1.k m997(Object obj) {
        if (C0460.m8951() < 0) {
            return ((f0.y) obj).f6003b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static IBinder m998(Object obj) {
        if (C0340.m6658() < 0) {
            return ((Parcel) obj).readStrongBinder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۟۟, reason: contains not printable characters */
    public static void m999(Object obj, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (C0341.m6681() > 0) {
            ((k.f) obj).v(f10, f11, f12, f13, f14, f15);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static p9.z m1000(Object obj) {
        if (C0198.m3800() >= 0) {
            return ((MainViewModel) obj).H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۧ, reason: contains not printable characters */
    public static long m1001(Object obj) {
        if (C0436.m8516() > 0) {
            return ((k0.i0) obj).f9008l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۦۣ۠, reason: contains not printable characters */
    public static long m1002(Object obj, Object obj2, long j10) {
        if (C0481.m9354() <= 0) {
            return ((JSONObject) obj).optLong((String) obj2, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1003() {
        if (C0344.m6738() < 0) {
            return "Given Integer is zero";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Context m1005(Object obj) {
        if (C0250.m4779() < 0) {
            return ((d5.g0) obj).f4510e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1006(Object obj, Object obj2) {
        if (C0382.m7481() >= 0) {
            return ((Collection) obj).removeIf((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1007(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1004(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
