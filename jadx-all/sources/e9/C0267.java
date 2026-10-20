package e9;

import a5.i0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import com.auto.accept.data.model.C0071;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0077;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.iid.C0170;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.q;
import f0.c2;
import f0.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import k0.a4;
import k6.p7;
import k9.i;
import m9.C0360;
import q1.C0384;
import q6.C0389;
import r2.C0395;
import u.C0430;
import v0.C0441;
import w2.C0458;
import y3.j;

/* JADX INFO: renamed from: e9.ۧۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0267 {

    /* JADX INFO: renamed from: ۟۟ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static int f346 = -772;

    /* JADX INFO: renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static i0 m5081(Object obj) {
        if (C0458.m8901() < 0) {
            return ((MainViewModel) obj).f3087e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۦ, reason: not valid java name and contains not printable characters */
    public static j m5082(Object obj) {
        if (C0077.m1663() <= 0) {
            return j.a((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5083(Object obj) {
        if (C0360.m7059() < 0) {
            return ((zzfi.zzd) obj).zze();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5084(int i10) {
        if (C0071.m1458() >= 0) {
            return ByteBuffer.allocate(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5085(String str) {
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

    /* JADX INFO: renamed from: ۠ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static c9.a m5086(Object obj) {
        if (C0384.m7523() <= 0) {
            return ((d5.i0) obj).f4572r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m5087(Object obj) {
        if (C0078.m1692() > 0) {
            return ((i) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5088() {
        if (C0072.m1556() >= 0) {
            return "current_session_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static c2 m5089(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((s) obj).f5883b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۦ, reason: not valid java name and contains not printable characters */
    public static List m5090(Object obj) {
        if (C0441.m8597() >= 0) {
            return ((zzfi.zzj.zza) obj).zzw();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m5091(Object obj) {
        if (C0203.m3894() >= 0) {
            return ((a4) obj).f8720c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۧۨ, reason: contains not printable characters */
    public static long m5092(Object obj) {
        if (C0389.m7600() < 0) {
            return ((p7) obj).Q();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۢۢ, reason: contains not printable characters */
    public static int m5093(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣۢۡ, reason: contains not printable characters */
    public static u0.b m5094() {
        if (C0389.m7600() < 0) {
            return q.f4726c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m5095(Object obj, Object obj2) {
        if (C0430.m8415() >= 0) {
            ((NotificationManager) obj).createNotificationChannel((NotificationChannel) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static d1.d m5097(Object obj, Object obj2, boolean z10) {
        if (C0395.m7729() > 0) {
            return ((r1.s) obj).b((r1.s) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m5098() {
        if (C0170.m3247() < 0) {
            return "(2)Error querying user properties";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m5099() {
        return 70 ^ C0107.f133;
    }

    /* JADX INFO: renamed from: ۧۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m5096(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
