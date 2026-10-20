package r2;

import a0.C0003;
import a2.c0;
import a2.x;
import a4.q;
import a7.C0008;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.activity.C0017;
import androidx.core.content.C0041;
import b1.C0050;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.remoteconfig.C0201;
import com.google.protobuf.v;
import d5.p0;
import dagger.hilt.android.components.C0229;
import f.C0271;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import k6.h5;
import k6.j7;
import k6.t;
import k6.x7;
import l0.u;
import l8.C0347;
import m0.n1;
import m5.C0356;
import p8.C0381;
import p9.q0;
import p9.z;
import r.C0393;
import u4.C0437;
import v6.C0447;
import x5.C0471;
import x7.C0472;
import y9.C0479;
import y9.C0480;

/* JADX INFO: renamed from: r2.ۧۧۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0398 {

    /* JADX INFO: renamed from: ۥۦۦ, reason: contains not printable characters */
    public static int f668 = 728;

    /* JADX INFO: renamed from: ۟۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m7763(Object obj, Object obj2) {
        if (C0437.m8524() < 0) {
            return ((zzfi.zzj.zza) obj).zzc((Iterable<? extends Integer>) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m7764() {
        return 1003 ^ C0480.f753;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static u8.e m7765(Object obj, Object obj2, Object obj3) {
        if (C0201.m3855() < 0) {
            return ((p0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static z m7766(Object obj) {
        if (C0017.m332() <= 0) {
            return ((MainViewModel) obj).f3096j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static h2.d m7767(Object obj) {
        if (C0173.m3314() >= 0) {
            return ((x) obj).f1041k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧ۠, reason: not valid java name and contains not printable characters */
    public static k6.n m7768(Object obj) {
        if (C0381.m7467() >= 0) {
            return ((j7) obj).u();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۤ, reason: not valid java name and contains not printable characters */
    public static c0 m7769() {
        if (C0447.m8696() >= 0) {
            return u.f11182g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m7770(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static long m7771() {
        if (C0003.m70() > 0) {
            return q.h();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۡۥۤ, reason: contains not printable characters */
    public static String m7772(Object obj) {
        if (C0472.m9190() < 0) {
            return ((a5.u) obj).f1307a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۤ, reason: contains not printable characters */
    public static n1 m7773(Object obj) {
        if (C0479.m9326() <= 0) {
            return ((t.o) obj).f14264b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۥ, reason: contains not printable characters */
    public static Configuration m7774(Object obj) {
        if (C0471.m9151() > 0) {
            return ((Resources) obj).getConfiguration();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۦ, reason: contains not printable characters */
    public static String m7775(String str) {
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

    /* JADX INFO: renamed from: ۥۦۤۦ, reason: contains not printable characters */
    public static Long m7777(Object obj) {
        if (C0229.m4402() > 0) {
            return ((t) obj).f10373i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۡ, reason: contains not printable characters */
    public static q8.f m7778(Object obj, Object obj2) {
        if (C0041.m812() >= 0) {
            return z6.a.n0(obj, (Serializable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢ۟, reason: contains not printable characters */
    public static List m7779(Object obj, Object obj2, Object obj3) {
        if (C0393.m7675() <= 0) {
            return ((h5) obj).c((Bundle) obj2, (x7) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۧ, reason: contains not printable characters */
    public static Logger m7780() {
        if (C0356.m6968() > 0) {
            return v.f4248d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۦ, reason: contains not printable characters */
    public static String m7781() {
        if (C0050.m982() <= 0) {
            return "1";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m7782(Object obj) {
        if (C0271.m5170() <= 0) {
            return ((f0.c) obj).f5625c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥ۠, reason: not valid java name and contains not printable characters */
    public static q0 m7783(Object obj) {
        if (C0008.m169() <= 0) {
            return ((MainViewModel) obj).G;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m7784(Object obj) {
        if (C0347.m6774() > 0) {
            return ((ComponentName) obj).flattenToShortString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۥ, reason: contains not printable characters */
    public static String m7776(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
