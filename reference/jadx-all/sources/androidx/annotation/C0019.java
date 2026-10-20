package androidx.annotation;

import a5.v;
import a5.z;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Parcel;
import androidx.compose.ui.graphics.a;
import c1.C0060;
import c9.e;
import c9.f;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.util.C0166;
import d5.i;
import d5.u;
import d9.C0227;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.android.lifecycle.C0238;
import e1.C0259;
import g9.C0295;
import ia.C0323;
import java.io.ByteArrayOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import k0.r4;
import k0.w1;
import k0.w4;
import k0.z0;
import k6.o;
import m0.g1;
import m0.l3;
import p9.q0;
import r2.C0398;
import r9.C0406;
import s0.C0411;
import u0.C0431;
import u9.d;
import v.C0440;
import v0.C0443;
import w0.c;
import y.C0475;
import z2.C0485;
import z8.C0493;

/* JADX INFO: renamed from: androidx.annotation.۟ۦۤ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0019 {

    /* JADX INFO: renamed from: ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int f39 = -76;

    /* JADX INFO: renamed from: ۟۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static c m370(Object obj, Object obj2, Object obj3) {
        if (C0398.m7764() < 0) {
            return ((c) obj).A((c9.c) obj2, (c9.c) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m371(Object obj) {
        if (C0238.m4583() >= 0) {
            return ((zzfi.zzg.zza) obj).zzd();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static g1 m372(Object obj) {
        if (C0431.m8425() >= 0) {
            return ((i) obj).f4554c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static String m373() {
        if (C0147.m2805() < 0) {
            return "daily_events_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static z m374(Object obj) {
        if (C0108.m2101() < 0) {
            return ((v) obj).f1314b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m375() {
        return 240 ^ C0295.f442;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static Long m376(Object obj, Object obj2) {
        if (C0133.m2559() > 0) {
            return ((DocumentSnapshot) obj).getLong((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m377(Object obj) {
        if (C0153.m2938() < 0) {
            return ((MainViewModel) obj).K0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m378(Object obj, Object obj2, boolean z10) {
        if (C0077.m1663() < 0) {
            ((BaseBundle) obj).putBoolean((String) obj2, z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static l3 m379(Object obj) {
        if (C0259.m4939() < 0) {
            return ((w1) obj).f9604e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m380(float f10) {
        if (C0411.m8063() >= 0) {
            return d9.i.n(f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡ۟۠, reason: not valid java name and contains not printable characters */
    public static f m381(Object obj) {
        if (C0060.m1148() >= 0) {
            return ((z0) obj).f9688b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m382() {
        if (C0440.m8582() < 0) {
            return "triggered_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static Intent m383(Object obj, int i10) {
        if (C0485.m9436() < 0) {
            return ((Intent) obj).setFlags(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static void m384(Object obj, Object obj2) {
        if (C0475.m9246() <= 0) {
            ((Parcel) obj).writeTypedList((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m385(Object obj) {
        if (C0323.m6244() > 0) {
            return ((w4) obj).f9631t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static l3 m386(Object obj) {
        if (C0232.m4453() < 0) {
            return ((u) obj).f4789e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۧ, reason: not valid java name and contains not printable characters */
    public static EnumMap m387(Object obj) {
        if (C0443.m8630() < 0) {
            return ((o) obj).f10246e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢ۠, reason: contains not printable characters */
    public static int m388(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۠ۧۦ, reason: contains not printable characters */
    public static long m389(long j10) {
        if (C0227.m4372() < 0) {
            return a.c(j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۢ, reason: contains not printable characters */
    public static String m391(Object obj) {
        if (C0077.m1663() < 0) {
            return z6.a.a0((Reader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۢۢ, reason: not valid java name and contains not printable characters */
    public static List m392(Object obj) {
        if (C0406.m7952() <= 0) {
            return ((zzfi.zzj) obj).zzaq();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static e m393(Object obj) {
        if (C0237.m4549() < 0) {
            return ((r4) obj).f9431p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static q0 m394(Object obj) {
        if (C0493.m9578() >= 0) {
            return ((MainViewModel) obj).J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥۨ, reason: not valid java name and contains not printable characters */
    public static String m395(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m396(Object obj, Object obj2) {
        if (C0166.m3170() <= 0) {
            ((d) obj).d(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۦ۟, reason: contains not printable characters */
    public static String m390(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
