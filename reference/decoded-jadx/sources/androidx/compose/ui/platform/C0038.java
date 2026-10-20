package androidx.compose.ui.platform;

import a2.a;
import a5.d0;
import android.content.ContentResolver;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import androidx.compose.ui.input.pointer.C0034;
import c4.C0064;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.C0191;
import com.google.firebase.platforminfo.C0193;
import com.google.protobuf.v;
import d1.f;
import d7.C0219;
import dagger.hilt.internal.C0252;
import f0.m1;
import f1.C0273;
import g2.C0286;
import g8.q2;
import h.C0296;
import h1.C0300;
import h8.n;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.List;
import k0.i0;
import k0.k0;
import k0.x1;
import k6.c8;
import k6.j;
import p5.C0377;
import p9.z;
import s2.C0411;
import t.d;
import w4.C0461;
import z0.C0482;

/* JADX INFO: renamed from: androidx.compose.ui.platform.۟ۨۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0038 {

    /* JADX INFO: renamed from: ۣۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int f58 = -217;

    /* JADX INFO: renamed from: ۟۟ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static float m738(Object obj) {
        if (C0034.m667() > 0) {
            return ((x1) obj).f9640c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m739(Object obj, long j10) {
        if (C0193.m3691() < 0) {
            return k0.a((i0) obj, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m740(long j10, long j11) {
        if (C0296.m5709() <= 0) {
            return f.a(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m741(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static d m742(Object obj) {
        if (C0252.m4832() <= 0) {
            return ((m1) obj).f5817b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int m743(Object obj) {
        if (C0064.m1243() > 0) {
            return ((d0) obj).f1246o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m744(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m745(Object obj, int i10) {
        if (C0300.m5773() < 0) {
            ((v) obj).B0(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static Bundle m746(Object obj) {
        if (C0149.m2863() > 0) {
            return ((j) obj).f10115a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static long m747(Object obj) {
        if (C0411.m8066() < 0) {
            return ((c8) obj).f9949c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static float m749(Object obj, Object obj2, float f10) {
        if (C0273.m5273() <= 0) {
            return Settings.Global.getFloat((ContentResolver) obj, (String) obj2, f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m750() {
        return (-280) ^ C0482.f756;
    }

    /* JADX INFO: renamed from: ۢۥۨۡ, reason: not valid java name and contains not printable characters */
    public static int m751(Object obj) {
        if (C0181.m3452() <= 0) {
            return ((zzfi.zzc) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۦۦ, reason: not valid java name and contains not printable characters */
    public static q2 m752(Object obj) {
        if (C0191.m3643() > 0) {
            return ((n) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۦ, reason: not valid java name and contains not printable characters */
    public static z m753(Object obj) {
        if (C0219.m4237() >= 0) {
            return ((MainViewModel) obj).f3080a0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static List m754(Object obj) {
        if (C0286.m5522() > 0) {
            return Collections.unmodifiableList((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m755(Object obj) {
        if (C0377.m7389() >= 0) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static b2.v m756(Object obj) {
        if (C0461.m8993() >= 0) {
            return ((a) obj).f889d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m748(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
