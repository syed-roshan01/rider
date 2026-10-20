package s7;

import a4.e0;
import android.content.ContentValues;
import android.os.Bundle;
import androidx.compose.ui.input.key.C0033;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.SetOptions;
import com.google.firebase.messaging.reporting.C0187;
import d.C0211;
import d1.f;
import d5.b2;
import d5.z1;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.modules.C0235;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import dagger.hilt.internal.processedrootsentinel.C0252;
import ea.C0269;
import f0.i;
import f5.c0;
import f5.g0;
import g0.C0286;
import g8.v3;
import h.C0299;
import h1.C0301;
import h3.C0304;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k0.t1;
import k6.d4;
import k6.h6;
import k6.l4;
import k6.p4;
import k6.s;
import p9.z;
import r1.x0;
import r2.C0395;
import r8.p;
import s8.C0417;
import w5.C0463;
import w6.C0465;
import z.C0481;

/* JADX INFO: renamed from: s7.ۧۤۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0416 {

    /* JADX INFO: renamed from: ۨۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f686 = 781;

    /* JADX INFO: renamed from: ۟۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m8144() {
        return 943 ^ C0463.f733;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static z m8145(Object obj) {
        if (C0299.m5742() >= 0) {
            return ((MainViewModel) obj).Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8146(Object obj) {
        if (C0136.m2627() >= 0) {
            return ((h6) obj).f10087d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m8147(Object obj) {
        if (C0417.m8173() <= 0) {
            return p.Y0((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m8148(Object obj) {
        if (C0211.m4028() < 0) {
            return ((zzfp.zza) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8149(Object obj) {
        if (C0033.m652() < 0) {
            return ((c0) obj).f6239a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۣ, reason: not valid java name and contains not printable characters */
    public static Task m8150(Object obj, Object obj2, Object obj3) {
        if (C0481.m9354() < 0) {
            return ((DocumentReference) obj).set(obj2, (SetOptions) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۧ, reason: not valid java name and contains not printable characters */
    public static zzew.zze.zza m8151(Object obj, Object obj2) {
        if (C0301.m5773() < 0) {
            return ((zzew.zze.zza) obj).zza((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m8152() {
        if (C0252.m4811() <= 0) {
            return "grant_permissions_first";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static a2.p m8153(Object obj) {
        if (C0228.m4380() > 0) {
            return ((a2.c0) obj).f912b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static p4 m8154(Object obj) {
        if (C0269.m5123() > 0) {
            return ((l4) obj).f10183p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m8155(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m8156(Object obj, Object obj2, Object obj3) {
        if (C0078.m1692() >= 0) {
            ((ContentValues) obj).put((String) obj2, (byte[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m8157(Object obj, Object obj2) {
        if (C0130.m2511() >= 0) {
            ((com.google.crypto.tink.shaded.protobuf.p) obj).V0((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static float m8158(long j10) {
        if (C0286.m5504() >= 0) {
            return f.b(j10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۥۥۧ, reason: not valid java name and contains not printable characters */
    public static String m8159(Object obj) {
        if (C0086.m1846() >= 0) {
            return ((b2) obj).f4419d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8160(Object obj) {
        if (C0246.m4710() > 0) {
            return ((e0) obj).p();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۥ۟, reason: not valid java name and contains not printable characters */
    public static x0 m8161(Object obj) {
        if (C0107.m2075() < 0) {
            return ((t1) obj).f9477e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static boolean m8162(Object obj, int i10) {
        if (C0187.m3565() >= 0) {
            return ((d4) obj).t(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۨۡ, reason: contains not printable characters */
    public static void m8163(Object obj, boolean z10) {
        if (C0235.m4512() > 0) {
            ((v3) obj).c(z10);
        }
    }

    /* JADX INFO: renamed from: ۦۤۦ۠, reason: contains not printable characters */
    public static boolean m8164(Object obj) {
        if (C0081.m1735() > 0) {
            return ((i) obj).f5746f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۡۡ, reason: contains not printable characters */
    public static String m8165(String str) {
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

    /* JADX INFO: renamed from: ۧ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m8166(Object obj) {
        if (C0304.m5859() <= 0) {
            return ((s) obj).g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m8168(Object obj, Object obj2) {
        if (C0465.m9059() <= 0) {
            return ((z1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static String m8169(Object obj) {
        if (C0395.m7729() > 0) {
            return ((g0) obj).f6264f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m8167(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
