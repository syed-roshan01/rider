package androidx.compose.ui.graphics;

import a3.C0006;
import a5.i0;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.measurement.C0184;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.C0209;
import d5.m;
import d9.C0226;
import dagger.hilt.android.migration.C0240;
import dagger.hilt.internal.componenttreedeps.C0249;
import f2.e;
import f2.f;
import f2.l;
import f2.w;
import f4.C0277;
import ga.C0296;
import h0.v0;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.y;
import k0.z;
import k3.C0336;
import k6.a5;
import k6.o6;
import k6.p7;
import k6.u4;
import k6.u7;
import l.q;
import l6.C0344;
import l8.C0346;
import m0.r1;
import m1.C0352;
import o8.c;
import q6.C0388;
import r1.C0394;
import r4.C0399;
import r8.p;
import t1.C0420;
import u0.b;
import v7.C0450;
import w9.C0466;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.ۣۤۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0031 {

    /* JADX INFO: renamed from: ۧۥۡ۠, reason: not valid java name and contains not printable characters */
    public static int f51 = -154;

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m595(Object obj, Object obj2, Object obj3) {
        if (C0399.m7797() < 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m596(Object obj, int i10, Object obj2) {
        if (C0156.m2976() >= 0) {
            return q.h((String) obj, i10, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m597(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static int m598() {
        return 146 ^ C0296.f443;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static long m599() {
        if (C0240.m4596() >= 0) {
            return zzne.zzy();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦ۟, reason: not valid java name and contains not printable characters */
    public static int m600(Object obj) {
        if (C0080.m1729() < 0) {
            return ((AppConfig) obj).getPlanPrice1Week();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m601(Object obj) {
        if (C0450.m8755() > 0) {
            return ((c) obj).f12667c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m602(Object obj) {
        if (C0352.m6885() > 0) {
            return ((a5) obj).J();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۥ, reason: not valid java name and contains not printable characters */
    public static FirebaseRemoteConfig m603(Object obj) {
        if (C0184.m3517() > 0) {
            return ((i0) obj).f1271a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m604(Object obj) {
        if (C0388.m7585() > 0) {
            return ((u4) obj).f10419c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m605(Object obj) {
        if (C0006.m112() <= 0) {
            return ((Parcel) obj).dataSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static void m606(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        if (C0420.m8247() > 0) {
            ((u7) obj).L((String) obj2, (String) obj3, (Bundle) obj4, (List) obj5, z10);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m608(Object obj) {
        if (C0209.m4013() > 0) {
            return ((Uri) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m609(String str) {
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

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static w m610(Object obj, Object obj2, Object obj3, int i10, int i11) {
        if (C0277.m5315() < 0) {
            return ((f) obj).b((e) obj2, (l) obj3, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m611(Object obj) {
        if (C0090.m1920() >= 0) {
            ((v0) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۢۨۢۨ, reason: not valid java name and contains not printable characters */
    public static o6 m612(Object obj) {
        if (C0226.m4339() <= 0) {
            return ((p7) obj).f10293h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ, reason: not valid java name and contains not printable characters */
    public static m m613() {
        if (C0249.m4762() >= 0) {
            return m.f4660p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m614(Object obj) {
        if (C0336.m6500() <= 0) {
            return p.F0((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۠ۨ, reason: contains not printable characters */
    public static zzfi.zzj.zza m615(Object obj, Object obj2) {
        if (C0466.m9068() <= 0) {
            return ((zzfi.zzj.zza) obj).zzc((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۤۥ, reason: contains not printable characters */
    public static b m616() {
        if (C0394.m7716() > 0) {
            return d5.q.f4725b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static r1 m617(Object obj) {
        if (C0346.m6759() <= 0) {
            return ((m0.q) obj).C();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۧ, reason: not valid java name and contains not printable characters */
    public static y m618(Object obj) {
        if (C0344.m6738() <= 0) {
            return z.e((k0.i0) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static String m607(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
