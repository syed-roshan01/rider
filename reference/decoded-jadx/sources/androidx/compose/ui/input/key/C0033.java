package androidx.compose.ui.input.key;

import a2.c0;
import android.support.v4.app.C0014;
import b8.C0055;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.abt.C0112;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.C0195;
import d1.C0214;
import d5.x0;
import dagger.hilt.android.components.C0228;
import f0.r0;
import g2.l0;
import i6.C0319;
import java.io.ByteArrayOutputStream;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.o3;
import k0.p1;
import k2.C0333;
import k6.h5;
import k6.k;
import k6.p7;
import l0.u;
import n.C0360;
import o1.s;
import o2.C0368;
import o5.C0370;
import s6.e;
import u.w;
import u1.C0431;
import w5.C0462;
import y.u0;

/* JADX INFO: renamed from: androidx.compose.ui.input.key.ۣۢۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0033 {

    /* JADX INFO: renamed from: ۟ۧۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int f53 = -228;

    /* JADX INFO: renamed from: ۟ۢۦۦ۟, reason: not valid java name and contains not printable characters */
    public static List m638(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0200.m3841() < 0) {
            return ((h5) obj).r((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static int m639(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۤ, reason: not valid java name and contains not printable characters */
    public static u0 m640(float f10, int i10) {
        if (C0319.m6181() >= 0) {
            return androidx.compose.foundation.layout.a.a(f10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۤ, reason: not valid java name and contains not printable characters */
    public static int m641(Object obj) {
        if (C0055.m1056() >= 0) {
            return ((r0) obj).f5868a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۢ, reason: not valid java name and contains not printable characters */
    public static String m642(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static w m643(Object obj) {
        if (C0014.m269() < 0) {
            return ((o3) obj).f9317e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m644(Object obj) {
        if (C0152.m2931() > 0) {
            return ((FileChannel) obj).size();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m645(Object obj) {
        if (C0360.m7073() <= 0) {
            return ((x0) obj).f4840a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m646() {
        if (C0214.m4096() > 0) {
            return "shizuku_active_desc";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m648(Object obj, Object obj2) {
        if (C0079.m1701() > 0) {
            return ((e) obj).c((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m649(Object obj) {
        if (C0195.m3737() <= 0) {
            return ((zzfi.zzn) obj).zzk();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static zzik m650() {
        if (C0333.m6472() <= 0) {
            return zzik.zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۦۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m651(Object obj) {
        if (C0462.m9013() < 0) {
            return ((p7) obj).f10311z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int m652() {
        return (-445) ^ C0076.f110;
    }

    /* JADX INFO: renamed from: ۤ۟, reason: not valid java name and contains not printable characters */
    public static long m653(Object obj, Object obj2, Object obj3, long j10) {
        if (C0370.m7269() > 0) {
            return ((k) obj).w((String) obj2, (String[]) obj3, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static l0 m654(Object obj) {
        if (C0228.m4402() > 0) {
            return ((p1) obj).f9348v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m655(Object obj) {
        if (C0112.m2176() >= 0) {
            return s.n((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۥ, reason: contains not printable characters */
    public static c0 m656() {
        if (C0103.m2022() >= 0) {
            return u.f11179d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۥ, reason: contains not printable characters */
    public static Map m657(Object obj) {
        if (C0368.m7234() >= 0) {
            return ((URLConnection) obj).getHeaderFields();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧ۟, reason: not valid java name and contains not printable characters */
    public static String m658() {
        if (C0431.m8447() < 0) {
            return "shizuku_stopped_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static String m647(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
