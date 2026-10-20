package p4;

import aa.C0012;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0018;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.abt.C0112;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.C0143;
import d1.C0213;
import e0.C0257;
import f.C0270;
import f4.y;
import f5.j;
import h4.C0305;
import i1.f;
import java.io.ByteArrayOutputStream;
import k0.z3;
import k6.m;
import n7.C0364;
import p0.C0375;
import p8.C0380;
import r1.x0;
import u1.C0433;

/* JADX INFO: renamed from: p4.ۣ۟۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0377 {

    /* JADX INFO: renamed from: ۟ۢ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int f647 = 830;

    /* JADX INFO: renamed from: ۟۠ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static int m7371() {
        return 1013 ^ C0305.f452;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7372(Object obj, int i10, int i11) {
        if (C0433.m8470() > 0) {
            return ((String) obj).codePointCount(i10, i11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7373() {
        if (C0018.m354() > 0) {
            return zznv.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۧ, reason: not valid java name and contains not printable characters */
    public static float m7374(Object obj, int i10) {
        if (C0375.m7350() <= 0) {
            return ((m2.b) obj).o0(i10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static long m7375(Object obj) {
        if (C0136.m2627() > 0) {
            return ((zzfi.zzj) obj).zzi();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۢ, reason: not valid java name and contains not printable characters */
    public static Typeface m7376() {
        if (C0143.m2751() > 0) {
            return Typeface.DEFAULT_BOLD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m7377(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static String m7378(Object obj) {
        if (C0108.m2101() < 0) {
            return ((zzfi.zzj) obj).zzz();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static f m7379() {
        if (C0380.m7433() > 0) {
            return f6.a.U();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m7380(Object obj) {
        if (C0112.m2176() > 0) {
            return ((AccessibilityNodeInfo) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m7381(String str) {
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

    /* JADX INFO: renamed from: ۤۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static x0 m7382(Object obj) {
        if (C0257.m4901() <= 0) {
            return ((z3) obj).f9703b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤ۟, reason: contains not printable characters */
    public static j4.a m7383() {
        if (C0270.m5152() >= 0) {
            return j4.a.f8339a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۧ, reason: contains not printable characters */
    public static y m7384(Object obj) {
        if (C0012.m226() > 0) {
            return ((m) obj).f10196b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static Object m7385(Object obj, Object obj2) {
        if (C0364.m7127() <= 0) {
            return ((j) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۤ, reason: contains not printable characters */
    public static f m7386() {
        if (C0213.m4051() > 0) {
            return z6.a.f17305f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7388(Object obj, Object obj2) {
        if (C0257.m4901() <= 0) {
            ((SQLiteDatabase) obj).execSQL((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static String m7387(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
