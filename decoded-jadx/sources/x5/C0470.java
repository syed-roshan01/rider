package x5;

import a2.c0;
import a2.x;
import android.content.Context;
import androidx.compose.ui.node.C0037;
import androidx.startup.C0047;
import b8.C0055;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.ktx.C0175;
import com.google.gson.internal.sql.C0208;
import com.google.protobuf.h2;
import d3.C0216;
import d5.j;
import d5.l0;
import d5.u;
import e1.k0;
import f0.r1;
import f0.w;
import f2.d;
import f5.z;
import g2.s;
import h0.v0;
import java.io.ByteArrayOutputStream;
import k0.i0;
import k6.b;
import k6.q;
import l8.C0346;
import m0.l3;
import o1.C0367;
import r5.C0400;
import r8.r;
import t9.C0427;
import v0.C0442;
import v6.C0446;
import x4.C0469;

/* JADX INFO: renamed from: x5.ۡۦۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0470 {

    /* JADX INFO: renamed from: ۟ۥ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f741 = 181;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static l3 m9149(Object obj) {
        if (C0208.m3984() <= 0) {
            return ((u) obj).f4786b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static v0 m9150(Object obj) {
        if (C0346.m6774() >= 0) {
            return ((r1) obj).f5874b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9151() {
        return 968 ^ C0427.f698;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static s m9152(Object obj) {
        if (C0055.m1056() > 0) {
            return ((w) obj).f5985f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static q m9153(Object obj) {
        if (C0047.m904() < 0) {
            return ((b) obj).f9906d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m9154(Object obj, Object obj2) {
        if (C0216.m4114() < 0) {
            return ((z) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9155(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static void m9156(Object obj) {
        if (C0400.m7847() < 0) {
            ((m0.q) obj).U();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۥ, reason: not valid java name and contains not printable characters */
    public static Context m9157(Object obj) {
        if (C0037.m733() >= 0) {
            return ((l0) obj).f4649f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m9158(Object obj) {
        if (C0175.m3346() >= 0) {
            return ((j) obj).f4583c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9160() {
        if (C0367.m7199() < 0) {
            return "Bengali";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static long m9161(Object obj) {
        if (C0167.m3200() >= 0) {
            return ((i0) obj).f9020x;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m9162() {
        if (C0446.m8696() >= 0) {
            return "app_id=? AND event_name=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static a2.a m9163(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        if (C0148.m2838() <= 0) {
            return i1.b.d((String) obj, (c0) obj2, j10, (m2.b) obj3, (d) obj4, (r) obj5, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9164(Object obj) {
        if (C0171.m3272() < 0) {
            return ((zzfi.zzc) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static String m9165(String str) {
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

    /* JADX INFO: renamed from: ۨ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static k0 m9166(Object obj) {
        if (C0088.m1874() >= 0) {
            return ((x) obj).f1044n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int m9167(Object obj) {
        if (C0469.m9143() > 0) {
            return ((h2) obj).f4127o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۥۡ, reason: not valid java name and contains not printable characters */
    public static String m9168() {
        if (C0442.m8630() <= 0) {
            return "Failed to insert complex main event (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static String m9159(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
