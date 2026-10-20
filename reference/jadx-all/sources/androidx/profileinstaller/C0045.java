package androidx.profileinstaller;

import a.C0001;
import aa.C0011;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.abt.C0113;
import com.google.firebase.firestore.ktx.C0156;
import com.google.gson.internal.bind.C0207;
import d5.f;
import d9.C0225;
import dagger.hilt.android.internal.migration.C0233;
import e5.a;
import f0.h;
import g9.C0295;
import h.C0298;
import h4.C0305;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import k0.j;
import k0.q1;
import k6.j5;
import k6.z4;
import l0.p;
import l8.C0346;
import l9.C0348;
import la.C0349;
import m0.g1;
import m0.m;
import m0.u1;
import n9.d;
import p9.q0;
import t1.g;
import u0.b;
import v9.C0453;
import w4.C0461;
import y3.e;

/* JADX INFO: renamed from: androidx.profileinstaller.۟۟۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0045 {

    /* JADX INFO: renamed from: ۟ۤۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f65 = 69;

    /* JADX INFO: renamed from: ۟۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m865(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m866(Object obj, Object obj2, int i10) {
        if (C0156.m2976() > 0) {
            ((j) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۡ۟, reason: not valid java name and contains not printable characters */
    public static List m867(Object obj, Object obj2, int i10) {
        if (C0113.m2182() < 0) {
            return ((PackageManager) obj).queryIntentActivities((Intent) obj2, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۨ, reason: not valid java name and contains not printable characters */
    public static void m868(Object obj, Object obj2, int i10) {
        if (C0233.m4482() >= 0) {
            ((h) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m869(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0346.m6759() <= 0) {
            return ((b) obj).e(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Handler m870(Object obj) {
        if (C0001.m35() <= 0) {
            return ((d) obj).f12320c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static List m871(Object obj) {
        if (C0011.m208() < 0) {
            return e.m((g1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m872(Object obj) {
        if (C0207.m3957() >= 0) {
            return ((f) obj).f4478b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m873(Object obj) {
        if (C0298.m5722() >= 0) {
            return ((q1) obj).f9388w;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦ۠, reason: not valid java name and contains not printable characters */
    public static int m874() {
        return 1009 ^ C0305.f452;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m875(Object obj) {
        if (C0295.m5663() >= 0) {
            return ((j5) obj).f10124e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m876() {
        if (C0349.m6818() <= 0) {
            return p.f11109d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static q0 m877(Object obj) {
        if (C0348.m6808() < 0) {
            return ((MainViewModel) obj).Z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static LinkedBlockingQueue m878(Object obj) {
        if (C0461.m8972() > 0) {
            return ((z4) obj).f10609f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m879(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m880(Object obj) {
        if (C0225.m4316() > 0) {
            return ((zzfc.zzd) obj).zzh();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۨ, reason: contains not printable characters */
    public static Object m881(Object obj, Object obj2) {
        if (C0453.m8825() > 0) {
            return g.p((t1.m) obj, (u1) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧ۟, reason: contains not printable characters */
    public static long m882() {
        if (C0083.m1779() > 0) {
            return a.f5139o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static androidx.compose.foundation.layout.b m884() {
        if (C0327.m6304() < 0) {
            return androidx.compose.foundation.layout.b.f1666a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۥۤ, reason: contains not printable characters */
    public static String m883(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
