package dagger.hilt.android.internal.earlyentrypoint;

import a4.c0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.activity.C0017;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.internal.api.C0178;
import d4.C0217;
import d5.p1;
import f.C0269;
import f0.e1;
import f0.h0;
import f0.w0;
import f1.C0273;
import fa.C0280;
import g2.C0287;
import g2.s;
import h.C0296;
import java.io.ByteArrayOutputStream;
import k0.d;
import k0.f0;
import k0.o3;
import k0.s1;
import k4.C0336;
import k6.a5;
import k6.g4;
import k6.v;
import l0.C0340;
import n.g;
import o7.d0;
import q0.C0382;
import q6.C0386;
import t1.j;
import t1.k;
import u0.C0430;
import u8.e;
import v9.C0452;
import x.m;
import y.t0;
import y7.a;
import z8.C0492;

/* JADX INFO: renamed from: dagger.hilt.android.internal.earlyentrypoint.ۨۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0231 {

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f311 = -197;

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4441(Object obj) {
        if (C0386.m7564() > 0) {
            return ((zzfi.zzj) obj).zzal();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Cursor m4442(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (C0382.m7487() <= 0) {
            return ((SQLiteDatabase) obj).query((String) obj2, (String[]) obj3, (String) obj4, (String[]) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4444(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۥۨۧ, reason: not valid java name and contains not printable characters */
    public static Class m4445(Object obj, boolean z10, Object obj2) {
        if (C0273.m5273() <= 0) {
            return Class.forName((String) obj, z10, (ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static void m4446(int i10, int i11) {
        if (C0178.m3402() > 0) {
            d0.m0(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m4447(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, float f11, Object obj) {
        if (C0140.m2699() >= 0) {
            return s1.d(i10, i11, i12, i13, i14, i15, i16, f10, j10, f11, (t0) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static PendingIntent m4448(Object obj, int i10, Object obj2, int i11) {
        if (C0164.m3153() > 0) {
            return PendingIntent.getActivity((Context) obj, i10, (Intent) obj2, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static e m4449(Object obj, Object obj2, Object obj3) {
        if (C0287.m5529() >= 0) {
            return ((e1) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static a m4450() {
        if (C0340.m6681() >= 0) {
            return a.f16991c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static j m4451() {
        if (C0168.m3229() >= 0) {
            return k.f14458b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static String m4452(Object obj) {
        if (C0169.m3245() >= 0) {
            return ((p1) obj).f4719a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m4453() {
        return (-386) ^ C0430.f701;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static c0 m4454() {
        if (C0217.m4144() > 0) {
            return w0.f5986a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static g4 m4455(Object obj) {
        if (C0296.m5709() < 0) {
            return g4.b((v) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static c9.e m4456(Object obj) {
        if (C0452.m8825() > 0) {
            return ((o3) obj).f9322q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨ۠, reason: not valid java name and contains not printable characters */
    public static e m4457(Object obj, Object obj2, Object obj3) {
        if (C0336.m6515() <= 0) {
            return ((h0) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4458(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static g m4459(Object obj) {
        if (C0280.m5432() > 0) {
            return ((b4.e) obj).f2701a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡۢ, reason: not valid java name and contains not printable characters */
    public static long m4460(Object obj) {
        if (C0126.m2434() > 0) {
            return ((a5) obj).G;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۢۥۥ, reason: not valid java name and contains not printable characters */
    public static s m4461(Object obj) {
        if (C0017.m332() < 0) {
            return ((f0.s) obj).f5888n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥ۠, reason: contains not printable characters */
    public static long m4462(Object obj) {
        if (C0269.m5152() >= 0) {
            return ((d) obj).f8811e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧۦۦ, reason: contains not printable characters */
    public static m m4463(Object obj) {
        if (C0492.m9578() >= 0) {
            return ((f0) obj).f8909q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4443(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
