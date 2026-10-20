package dagger.hilt.android.lifecycle;

import android.app.Service;
import b8.C0055;
import c0.C0057;
import c9.e;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.reporting.C0187;
import d5.b2;
import d5.g;
import d5.k2;
import f0.C0271;
import f0.d1;
import f5.b0;
import g1.k;
import h.C0296;
import h.C0298;
import h0.h;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import k0.n4;
import k0.r4;
import k0.w1;
import k0.y1;
import k6.f4;
import k6.x;
import k6.x3;
import l0.C0340;
import m2.b;
import m7.C0356;
import n.C0361;
import org.json.JSONObject;
import u4.C0435;
import w0.C0454;
import y.C0475;
import z.C0481;

/* JADX INFO: renamed from: dagger.hilt.android.lifecycle.۟۠ۥ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0237 {

    /* JADX INFO: renamed from: ۦۣ۠, reason: contains not printable characters */
    public static int f317 = -615;

    /* JADX INFO: renamed from: ۟۠ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4561(Object obj) {
        if (C0114.m2205() < 0) {
            return ((k2) obj).f4623s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static e m4562(Object obj) {
        if (C0298.m5742() >= 0) {
            return ((g) obj).f4498d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m4563(Object obj) {
        if (C0361.m7097() <= 0) {
            return ((zzew.zzf) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4564(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0435.m8516() >= 0) {
            ((f4) obj).e((String) obj2, obj3, obj4, obj5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static long m4565(Object obj) {
        if (C0114.m2205() <= 0) {
            return ((y1) obj).f9668d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4566() {
        if (C0118.m2274() < 0) {
            return zzpg.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۦ, reason: not valid java name and contains not printable characters */
    public static x3 m4567() {
        if (C0108.m2101() <= 0) {
            return x.f10476c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4568() {
        if (C0356.m6984() >= 0) {
            return zzpg.zze();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m4569(Object obj) {
        if (C0057.m1090() < 0) {
            ((Service) obj).stopSelf();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4570(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m4571(Object obj, Object obj2) {
        if (C0340.m6681() >= 0) {
            return ((b2) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4572() {
        if (C0271.m5222() <= 0) {
            return "Installed Target Apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static k m4573(Object obj) {
        if (C0146.m2776() > 0) {
            return ((w1) obj).f9601b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥ, reason: not valid java name and contains not printable characters */
    public static float m4574(Object obj) {
        if (C0184.m3517() > 0) {
            return ((n4) obj).f9276a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4575(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨ۠۠, reason: not valid java name and contains not printable characters */
    public static JSONObject m4576(Object obj, Object obj2, Object obj3) {
        if (C0296.m5709() <= 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static float m4577(Object obj, float f10) {
        if (C0475.m9266() > 0) {
            return ((b) obj).q0(f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m4578(Object obj) {
        if (C0320.m6200() > 0) {
            return ((d1) obj).f5664a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static e m4579(Object obj) {
        if (C0055.m1056() > 0) {
            return ((r4) obj).f9433r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static u8.e m4580(Object obj, Object obj2, Object obj3) {
        if (C0115.m2227() < 0) {
            return ((b0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
    public static zzfi.zzj.zza m4581(Object obj, Object obj2) {
        if (C0454.m8861() < 0) {
            return ((zzfi.zzj.zza) obj).zzj((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m4583() {
        return (-125) ^ C0481.f755;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static a2.e m4584(Object obj) {
        if (C0187.m3565() >= 0) {
            return ((h) obj).f7398g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡ, reason: contains not printable characters */
    public static String m4582(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
