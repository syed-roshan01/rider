package com.google.firebase.ktx;

import a.C0001;
import a5.d0;
import android.net.Uri;
import androidx.annotation.C0019;
import androidx.compose.foundation.C0026;
import androidx.startup.C0047;
import b7.C0054;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.measurement.C0181;
import d5.x;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.migration.C0239;
import f0.e0;
import f0.t1;
import fa.C0281;
import h.C0298;
import h0.v0;
import h3.C0302;
import i6.C0320;
import java.io.ByteArrayOutputStream;
import k.C0331;
import k0.m4;
import k0.o4;
import k0.r4;
import k0.t;
import k6.b6;
import k6.d8;
import k6.s5;
import k6.x7;
import l6.C0343;
import m0.m;
import m9.m0;
import p8.C0380;
import r2.C0396;
import t9.c;
import u8.e;

/* JADX INFO: renamed from: com.google.firebase.ktx.ۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0179 {

    /* JADX INFO: renamed from: ۦۤۡۨ, reason: contains not printable characters */
    public static int f203 = 575;

    /* JADX INFO: renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static e m3404(Object obj, Object obj2, Object obj3) {
        if (C0019.m375() < 0) {
            return ((x) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static m4 m3405(Object obj) {
        if (C0071.m1458() > 0) {
            return ((r4) obj).f9424b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static zzew.zzb m3406(Object obj) {
        if (C0181.m3452() <= 0) {
            return ((d8) obj).f9985g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3407(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m3408() {
        if (C0231.m4453() < 0) {
            return "Failed to update column (got 0). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static v0 m3409(Object obj) {
        if (C0320.m6200() > 0) {
            return ((e0) obj).f5682p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Uri m3410(Object obj) {
        if (C0343.m6738() < 0) {
            return zzgk.zza((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static c m3411() {
        if (C0380.m7467() > 0) {
            return m0.f11970b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m3412(Object obj, Object obj2) {
        if (C0302.m5836() >= 0) {
            return ((t1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3413(Object obj) {
        if (C0130.m2511() > 0) {
            return ((b6) obj).f9915a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3414() {
        if (C0047.m904() < 0) {
            return "app_instance_id";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static s5 m3415() {
        if (C0054.m1047() >= 0) {
            return s5.f10354c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3416(Object obj, Object obj2, int i10) {
        if (C0281.m5443() <= 0) {
            ((o4) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۡۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3417() {
        return (-650) ^ C0396.f667;
    }

    /* JADX INFO: renamed from: ۢۡۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m3418(Object obj, Object obj2) {
        if (C0298.m5742() >= 0) {
            return ((d0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3419(String str) {
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

    /* JADX INFO: renamed from: ۧۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3421() {
        if (C0026.m508() >= 0) {
            return "events";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3422(Object obj) {
        if (C0239.m4596() > 0) {
            return ((x7) obj).f10556u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m3423(Object obj) {
        if (C0001.m35() < 0) {
            return ((f5.e0) obj).f6249a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۧ۟, reason: not valid java name and contains not printable characters */
    public static t m3424() {
        if (C0331.m6408() < 0) {
            return t.f9466e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3420(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
