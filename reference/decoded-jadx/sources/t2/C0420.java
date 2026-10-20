package t2;

import a.C0001;
import a5.f0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.encoders.C0143;
import com.google.firebase.messaging.reporting.C0189;
import com.google.protobuf.C0209;
import d5.y0;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import f.C0269;
import java.io.ByteArrayOutputStream;
import k6.f5;
import k6.h5;
import k6.n5;
import k6.p4;
import k6.t4;
import k6.x7;
import m0.g1;
import p9.z;
import q2.C0384;
import r5.C0400;
import s0.C0409;
import t.x1;
import t0.C0418;
import v5.C0444;
import w0.C0454;
import x4.C0469;
import y.i1;

/* JADX INFO: renamed from: t2.۟ۢ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0420 {

    /* JADX INFO: renamed from: ۟ۢ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int f691 = 309;

    /* JADX INFO: renamed from: ۟۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m8253(Object obj, Object obj2) {
        if (C0444.m8673() >= 0) {
            ((h5) obj).f((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m8254(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static String m8255(Object obj) {
        if (C0143.m2751() > 0) {
            return ((p4) obj).f10271a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static long m8256(Object obj) {
        if (C0469.m9143() > 0) {
            return ((f5) obj).H;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static z m8257(Object obj) {
        if (C0418.m8221() >= 0) {
            return ((MainViewModel) obj).f3110q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static g1 m8258(Object obj) {
        if (C0454.m8861() <= 0) {
            return ((d5.i) obj).f4555d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Intent m8259(Object obj, Object obj2, Object obj3, int i10) {
        if (C0189.m3621() > 0) {
            return ((Context) obj).registerReceiver((BroadcastReceiver) obj2, (IntentFilter) obj3, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static x1 m8260(Object obj) {
        if (C0269.m5152() >= 0) {
            return ((t.d) obj).f14108a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨ۟, reason: not valid java name and contains not printable characters */
    public static int m8261(Object obj, Object obj2, Object obj3) {
        if (C0400.m7847() < 0) {
            return ((i1) obj).a((m2.b) obj2, (m2.l) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static q.f m8262(Object obj) {
        if (C0209.m4013() > 0) {
            return t4.v((zzfc.zzd) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m8263() {
        return 666 ^ C0384.f655;
    }

    /* JADX INFO: renamed from: ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static u8.e m8264(Object obj, Object obj2, Object obj3) {
        if (C0245.m4710() >= 0) {
            return ((f0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8266(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static AppMeasurementDynamiteService m8267(Object obj) {
        if (C0409.m8037() <= 0) {
            return ((n5) obj).f10228c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۨ, reason: contains not printable characters */
    public static c9.a m8268(Object obj) {
        if (C0001.m35() <= 0) {
            return ((y0) obj).f4863f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8265(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
