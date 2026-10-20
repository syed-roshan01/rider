package h5;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.C0034;
import androidx.profileinstaller.C0045;
import c0.C0056;
import c4.C0066;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.ktx.C0179;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import e0.e;
import f0.e2;
import f0.r1;
import fa.C0281;
import h3.C0302;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import k0.e4;
import k0.h1;
import k0.z1;
import k6.f;
import k6.x;
import k6.x3;
import l0.o;
import la.C0348;
import m1.C0350;
import m5.C0355;
import o5.C0370;
import p7.n;
import t1.i;
import t1.k;
import v0.C0441;
import v0.C0443;
import w4.C0461;
import z.C0480;

/* JADX INFO: renamed from: h5.ۢ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0307 {

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f455 = 172;

    /* JADX INFO: renamed from: ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m5927(Object obj, Object obj2, Object obj3) {
        if (C0184.m3517() >= 0) {
            return ((n) obj).b((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۡ, reason: not valid java name and contains not printable characters */
    public static e2 m5928(Object obj) {
        if (C0441.m8612() >= 0) {
            return ((r1) obj).f5879n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static i m5929() {
        if (C0370.m7269() >= 0) {
            return k.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m5930(Object obj) {
        if (C0480.m9354() <= 0) {
            return ((e2) obj).f5687a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m5931() {
        if (C0066.m1277() > 0) {
            return "play_sound_on_accept";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static double m5932(Object obj, int i10) {
        return C0156.m2976() > 0 ? ((Cursor) obj).getDouble(i10) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠۠, reason: not valid java name and contains not printable characters */
    public static e m5934() {
        if (C0034.m667() >= 0) {
            return o.f11103c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5935() {
        return 354 ^ C0348.f619;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ۠, reason: not valid java name and contains not printable characters */
    public static Set m5936(Object obj) {
        if (C0461.m8993() > 0) {
            return ((EnumMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۦ, reason: not valid java name and contains not printable characters */
    public static long m5937(Object obj) {
        if (C0350.m6878() < 0) {
            return ((z1) obj).f9691c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۡ, reason: not valid java name and contains not printable characters */
    public static List m5938(Object obj) {
        if (C0137.m2646() < 0) {
            return ((zzfc.zza) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static zzew.zzb.zza m5939() {
        if (C0186.m3548() <= 0) {
            return zzew.zzb.zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5940(Object obj) {
        if (C0302.m5836() >= 0) {
            return ((zzfc.zzc.zza) obj).zze();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5941(Object obj) {
        if (C0056.m1077() < 0) {
            return ((Uri) obj).isHierarchical();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m5942(Object obj) {
        if (C0084.m1804() > 0) {
            return ((f) obj).B();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static y0.o m5943(Object obj) {
        if (C0179.m3417() >= 0) {
            return ((e4) obj).f8875b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static int m5944(Object obj) {
        if (C0281.m5443() <= 0) {
            return ((MotionEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۠, reason: contains not printable characters */
    public static int m5945(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۤۧۥ, reason: contains not printable characters */
    public static h1 m5946() {
        if (C0045.m874() > 0) {
            return h1.f8968a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static x3 m5947() {
        if (C0355.m6968() >= 0) {
            return x.f10490j0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟۟, reason: not valid java name and contains not printable characters */
    public static void m5948(Object obj, int i10, Object obj2, int i11) {
        if (C0443.m8654() < 0) {
            y3.e.R0((Parcel) obj, i10, (Parcelable) obj2, i11);
        }
    }

    /* JADX INFO: renamed from: ۧۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5949(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5933(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
