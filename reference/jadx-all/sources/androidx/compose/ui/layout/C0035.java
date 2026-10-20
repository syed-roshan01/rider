package androidx.compose.ui.layout;

import b1.d;
import b1.g;
import c0.C0056;
import c1.C0061;
import c9.c;
import c9.e;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.remoteconfiginterop.C0202;
import d5.i;
import d5.l;
import f1.C0274;
import g5.C0291;
import java.io.ByteArrayOutputStream;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import k0.a4;
import k0.q;
import k6.o7;
import k6.x;
import k6.x3;
import k6.y5;
import m0.g1;
import m9.C0360;
import o1.s;
import org.json.JSONObject;
import r4.C0399;
import s.C0408;
import t1.C0420;
import w.C0454;
import y0.o;
import z7.C0491;

/* JADX INFO: renamed from: androidx.compose.ui.layout.۟ۢ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0035 {

    /* JADX INFO: renamed from: ۟۠۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f55 = -708;

    /* JADX INFO: renamed from: ۟ۡۡۥۣ, reason: not valid java name and contains not printable characters */
    public static String m677(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m678(Object obj, Object obj2, Object obj3) {
        if (C0360.m7059() <= 0) {
            return ((TreeMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m679(Object obj, int i10) {
        if (C0178.m3402() > 0) {
            s.p0((ByteArrayOutputStream) obj, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static e m680(Object obj) {
        if (C0420.m8247() >= 0) {
            return ((q) obj).f9363b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m681(Object obj) {
        if (C0454.m8831() <= 0) {
            return ((a4) obj).f8718a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۦ۟, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m682(Object obj) {
        if (C0174.m3323() <= 0) {
            return ((zzfi.zzj.zza) obj).zzi();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m683(Object obj) {
        if (C0491.m9552() >= 0) {
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static g m684(Object obj, Object obj2) {
        if (C0124.m2386() >= 0) {
            return ((d) obj).a((c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static x3 m685() {
        if (C0274.m5273() < 0) {
            return x.f10521z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m687(Object obj) {
        if (C0061.m1161() < 0) {
            return ((y5) obj).f10572g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۢ, reason: not valid java name and contains not printable characters */
    public static l m688() {
        if (C0056.m1077() < 0) {
            return l.H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦ۠, reason: contains not printable characters */
    public static long m689(Object obj) {
        if (C0491.m9552() > 0) {
            return ((o7) obj).f10260b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m690() {
        return 962 ^ C0408.f678;
    }

    /* JADX INFO: renamed from: ۣۧۦ۠, reason: not valid java name and contains not printable characters */
    public static JSONObject m691(Object obj, Object obj2, boolean z10) {
        if (C0202.m3868() >= 0) {
            return ((JSONObject) obj).put((String) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m692(Object obj, int i10) {
        if (C0136.m2627() > 0) {
            ((p) obj).X0(i10);
        }
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static int m693(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static g1 m694(Object obj) {
        if (C0399.m7797() < 0) {
            return ((i) obj).f4558n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧ۠, reason: not valid java name and contains not printable characters */
    public static o m695(Object obj, float f10, float f11) {
        if (C0291.m5589() < 0) {
            return androidx.compose.foundation.layout.c.g((o) obj, f10, f11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۣ, reason: not valid java name and contains not printable characters */
    public static String m686(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
