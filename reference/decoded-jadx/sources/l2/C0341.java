package l2;

import a3.C0006;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.os.Handler;
import b1.C0050;
import b4.C0052;
import b7.C0054;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.internal.api.C0178;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.C0209;
import d1.C0212;
import g2.b0;
import h3.C0302;
import java.io.ByteArrayOutputStream;
import java.util.EnumMap;
import java.util.Set;
import k0.b5;
import k0.p4;
import k0.w;
import k0.x3;
import k6.c7;
import k6.t;
import k6.y5;
import k6.z5;
import n7.C0364;
import o1.s;
import v0.C0441;
import v6.C0447;
import w4.C0461;
import z.C0481;

/* JADX INFO: renamed from: l2.ۦۣ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0341 {

    /* JADX INFO: renamed from: ۟۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f612 = -755;

    /* JADX INFO: renamed from: ۟۠۠۠۟, reason: not valid java name and contains not printable characters */
    public static c9.e m6687(Object obj) {
        if (C0108.m2101() < 0) {
            return ((p4) obj).f9361c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static b0 m6688(Object obj) {
        if (C0178.m3402() >= 0) {
            return ((f0.o) obj).f5832d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6690() {
        if (C0302.m5836() > 0) {
            return "Failed to retrieve default event parameters. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m6691(Object obj) {
        if (C0212.m4051() >= 0) {
            return ((b5) obj).f8762s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Set m6692(Object obj) {
        if (C0208.m3984() < 0) {
            return ((EnumMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static long m6693(Object obj) {
        if (C0481.m9373() <= 0) {
            return ((t) obj).f10368d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6694() {
        if (C0054.m1047() >= 0) {
            return "select max(timestamp) from raw_events";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int m6695(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۥۤ, reason: not valid java name and contains not printable characters */
    public static String m6696() {
        if (C0461.m8993() >= 0) {
            return "Saving bundle, size";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6697(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0050.m982() <= 0) {
            return ((AccessibilityService) obj).dispatchGesture((GestureDescription) obj2, (AccessibilityService.GestureResultCallback) obj3, (Handler) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static c9.a m6698(Object obj) {
        if (C0209.m4013() > 0) {
            return ((x3) obj).f9648b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m6699() {
        return 332 ^ C0078.f112;
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static long m6700(Object obj) {
        if (C0447.m8732() < 0) {
            return ((k6.b) obj).f9905c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۤۧ۟, reason: contains not printable characters */
    public static k6.p4 m6701(Object obj) {
        if (C0364.m7147() < 0) {
            return ((c7) obj).f9943f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۡ, reason: contains not printable characters */
    public static int m6702(Object obj) {
        if (C0159.m3030() <= 0) {
            return ((zzfi.zzj) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۡۡ, reason: contains not printable characters */
    public static String m6703(String str) {
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

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static c9.e m6704(Object obj) {
        if (C0441.m8612() > 0) {
            return ((w) obj).f9587f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m6705(long j10, int i10, int i11) {
        if (C0052.m1013() > 0) {
            return s.a0(j10, i10, i11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۢۡ, reason: not valid java name and contains not printable characters */
    public static y5 m6706(Object obj) {
        if (C0006.m112() < 0) {
            return ((z5) obj).f10616c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String m6689(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
