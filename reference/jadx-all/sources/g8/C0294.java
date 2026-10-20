package g8;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.draw.C0027;
import androidx.startup.C0047;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zznp;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.installations.C0177;
import com.google.firebase.measurement.C0184;
import com.google.protobuf.C0209;
import d2.C0216;
import e1.C0260;
import f.C0270;
import g.C0283;
import h3.C0304;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import l0.C0341;
import m7.C0358;
import r6.C0403;
import t7.C0426;
import v0.C0443;
import y.C0475;
import z7.C0490;

/* JADX INFO: renamed from: g8.ۣۣۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0294 {

    /* JADX INFO: renamed from: ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int f441 = -947;

    /* JADX INFO: renamed from: ۟۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5636() {
        if (C0443.m8630() < 0) {
            return zznp.zze();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m5637(Object obj, Object obj2) {
        if (C0270.m5152() >= 0) {
            return ((Uri.Builder) obj).path((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m5638(Object obj, Object obj2, Object obj3) {
        if (C0426.m8351() <= 0) {
            return ((f0.g0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5639(Object obj) {
        if (C0490.m9528() >= 0) {
            return ((k0.s4) obj).f9460c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m5640(Object obj) {
        if (C0047.m904() <= 0) {
            return ((d5.d1) obj).f4452d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m5641(Object obj) {
        if (C0177.m3380() >= 0) {
            return ((f0.j0) obj).f5794b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۤ, reason: not valid java name and contains not printable characters */
    public static a5.j m5642(Object obj) {
        if (C0283.m5446() > 0) {
            return ((a5.h) obj).f1262b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5643(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5644(Object obj, long j10) {
        if (C0358.m7001() <= 0) {
            return ((k6.k) obj).y(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static long m5645(Object obj) {
        if (C0403.m7897() >= 0) {
            return ((a2.x) obj).f1032b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static m2.b m5646(Object obj) {
        if (C0216.m4108() < 0) {
            return ((f0.j1) obj).f5803g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۤ, reason: not valid java name and contains not printable characters */
    public static int m5647(Object obj) {
        if (C0341.m6681() > 0) {
            return ((DataInputStream) obj).readInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5648(Object obj) {
        if (C0084.m1804() >= 0) {
            return ((zzew.zzc) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static float m5649() {
        if (C0184.m3517() >= 0) {
            return k0.u4.f9537h;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۦۡۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap m5650(int i10, int i11, Object obj) {
        if (C0260.m4959() <= 0) {
            return Bitmap.createBitmap(i10, i11, (Bitmap.Config) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۧ, reason: not valid java name and contains not printable characters */
    public static String m5651(String str) {
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

    /* JADX INFO: renamed from: ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5652(Object obj) {
        if (C0027.m541() >= 0) {
            return ((k6.b4) obj).f9912d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۤۢ, reason: contains not printable characters */
    public static Object m5653(Object obj, Object obj2) {
        if (C0125.m2408() > 0) {
            return ((a5.s) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۢ, reason: contains not printable characters */
    public static long m5654(Object obj) {
        if (C0209.m4013() >= 0) {
            return ((k0.q4) obj).f9412c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m5656() {
        return (-103) ^ C0475.f745;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static p9.z m5657(Object obj) {
        if (C0304.m5859() < 0) {
            return ((z4.d) obj).N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5655(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
