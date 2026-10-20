package android.support.v4.app;

import a.C0000;
import a5.t;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.View;
import androidx.compose.ui.node.C0037;
import b.C0049;
import c4.C0065;
import c9.a;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.remote.C0164;
import dagger.hilt.C0255;
import ea.C0268;
import f5.w;
import h5.C0308;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.c2;
import k0.e2;
import k0.q;
import k0.r4;
import k0.v4;
import k0.x4;
import m0.r1;
import n7.C0364;
import o5.C0370;
import r5.C0400;
import r9.C0405;
import v0.C0443;
import w2.C0456;
import x.m;
import y0.o;

/* JADX INFO: renamed from: android.support.v4.app.۟۟۠ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0014 {

    /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static int f34 = 962;

    /* JADX INFO: renamed from: ۟۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m267(Object obj) {
        if (C0000.m12() < 0) {
            return ((t) obj).f1306c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠۟, reason: not valid java name and contains not printable characters */
    public static void m268(boolean z10, Object obj, Object obj2, boolean z11, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        if (C0164.m3153() > 0) {
            e2.a(z10, (a) obj, (o) obj2, z11, (c2) obj3, (m) obj4, (m0.m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m269() {
        return (-172) ^ C0120.f146;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m270(Object obj, int i10) {
        if (C0065.m1257() <= 0) {
            ((View) obj).setVisibility(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m271(Object obj) {
        if (C0268.m5123() >= 0) {
            return ((q) obj).f9365d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static d5.m m272() {
        if (C0255.m4876() < 0) {
            return d5.m.f4662r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۡ, reason: not valid java name and contains not printable characters */
    public static AssetManager m273(Object obj) {
        if (C0405.m7952() <= 0) {
            return ((Context) obj).getAssets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m274(String str) {
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

    /* JADX INFO: renamed from: ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static r1 m275(Object obj) {
        if (C0443.m8654() <= 0) {
            return ((m0.q) obj).p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m276(Object obj) {
        if (C0400.m7847() <= 0) {
            return ((m0.q) obj).P;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ, reason: not valid java name and contains not printable characters */
    public static e m277(Object obj) {
        if (C0140.m2699() >= 0) {
            return ((v4) obj).f9573n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static o m278(Object obj, float f10) {
        if (C0308.m5962() >= 0) {
            return androidx.compose.ui.draw.a.h((o) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤ, reason: contains not printable characters */
    public static Class m280(Object obj) {
        if (C0370.m7269() > 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۧ, reason: contains not printable characters */
    public static float m281(Object obj) {
        if (C0037.m733() > 0) {
            return ((x4) obj).f9658b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public static boolean m282(Object obj) {
        if (C0049.m945() >= 0) {
            return ((r4) obj).f9425c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static Object m283(Object obj, int i10, Object obj2) {
        if (C0154.m2958() < 0) {
            return ((List) obj).set(i10, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۤ, reason: contains not printable characters */
    public static int m284(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۦۦۦ, reason: contains not printable characters */
    public static List m285(Object obj) {
        if (C0364.m7147() <= 0) {
            return ((zzfc.zzd.zza) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥۥ, reason: contains not printable characters */
    public static MainViewModel m286(Object obj) {
        if (C0456.m8890() >= 0) {
            return ((w) obj).f6336b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m279(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
