package c0;

import a2.c0;
import android.util.Pair;
import androidx.compose.ui.platform.C0038;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.ktx.C0186;
import e1.l0;
import h6.C0310;
import i5.C0319;
import java.io.ByteArrayOutputStream;
import k0.b5;
import k0.d0;
import k0.e5;
import k0.y;
import k6.a5;
import k6.p;
import k6.t4;
import k6.u7;
import m4.C0354;
import m9.C0360;
import m9.e0;
import r2.C0397;
import r6.C0403;
import s7.C0415;
import t1.l1;
import u.w;
import u1.s1;
import u1.w2;
import u8.C0439;
import y.t0;
import y0.o;
import y1.r;
import y1.u;

/* JADX INFO: renamed from: c0.ۦۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0057 {

    /* JADX INFO: renamed from: ۟۟ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int f77 = 689;

    /* JADX INFO: renamed from: ۟۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m1080(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static long m1082(Object obj) {
        if (C0186.m3548() <= 0) {
            return ((b5) obj).f8758o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static Integer m1083(int i10) {
        if (C0125.m2408() > 0) {
            return Integer.valueOf(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static long m1084(Object obj) {
        if (C0319.m6163() < 0) {
            return ((a5) obj).f9872g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1085(Object obj, Object obj2, Object obj3) {
        if (C0104.m2034() < 0) {
            return ((u7) obj).k0((String) obj2, (String) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m1086(Object obj) {
        if (C0178.m3402() > 0) {
            return ((Pair) obj).second;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m1087(Object obj) {
        if (C0354.m6940() < 0) {
            return ((p) obj).f10261a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1088(String str) {
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

    /* JADX INFO: renamed from: ۡۦۢۢ, reason: not valid java name and contains not printable characters */
    public static c0 m1089(Object obj) {
        if (C0403.m7897() > 0) {
            return ((e5) obj).f8892m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1090() {
        return 687 ^ C0038.f58;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1091(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0360.m7059() <= 0) {
            s1.a((l1) obj, (w2) obj2, (c9.e) obj3, (m0.m) obj4, i10);
        }
    }

    /* JADX INFO: renamed from: ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static u m1092() {
        if (C0439.m8564() > 0) {
            return r.D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۡ, reason: contains not printable characters */
    public static q.f m1093(Object obj) {
        if (C0104.m2034() <= 0) {
            return ((t4) obj).f10384h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۧ۟, reason: contains not printable characters */
    public static zzfi.zzj.zza m1094(Object obj) {
        if (C0310.m5971() <= 0) {
            return ((zzfi.zzj.zza) obj).zzp();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۦ, reason: contains not printable characters */
    public static boolean m1095() {
        if (C0415.m8130() < 0) {
            return zznq.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1096(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i10, int i11) {
        if (C0397.m7755() > 0) {
            e0.d((c9.a) obj, (o) obj2, z10, (l0) obj3, (y) obj4, (d0) obj5, (w) obj6, (t0) obj7, (x.m) obj8, (c9.f) obj9, (m0.m) obj10, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m1081(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
