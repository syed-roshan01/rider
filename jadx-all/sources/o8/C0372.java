package o8;

import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0019;
import androidx.compose.ui.draw.C0028;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzon;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ktx.C0186;
import com.google.gson.internal.bind.C0206;
import d5.a1;
import d9.C0224;
import dagger.hilt.codegen.C0243;
import dagger.hilt.internal.aggregatedroot.C0247;
import f.C0270;
import f.C0271;
import f0.d0;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import k0.b5;
import k0.l0;
import k6.a5;
import k6.d4;
import k6.f4;
import k6.k7;
import k6.p7;
import k6.r7;
import r2.C0395;
import r7.C0405;
import s3.C0413;
import t1.C0420;
import u1.C0432;
import v6.C0447;

/* JADX INFO: renamed from: o8.۟ۢۧۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0372 {

    /* JADX INFO: renamed from: ۤۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int f642 = -934;

    /* JADX INFO: renamed from: ۟۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static long m7277() {
        if (C0206.m3931() >= 0) {
            return e5.a.d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m7278(Object obj, Object obj2) {
        if (C0270.m5152() > 0) {
            return ((a1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7279(Object obj) {
        if (C0413.m8089() < 0) {
            ((d0) obj).m5184invoke();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m7280() {
        if (C0224.m4304() < 0) {
            return "payment_success";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static long m7281() {
        if (C0395.m7729() > 0) {
            return l0.c.B;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m7282(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m7283() {
        return (-580) ^ C0247.f326;
    }

    /* JADX INFO: renamed from: ۣۢۡۧ, reason: not valid java name and contains not printable characters */
    public static String m7284(Object obj) {
        if (C0019.m375() < 0) {
            return ((zzdd) obj).zzh;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static f4 m7285(Object obj) {
        if (C0243.m4660() <= 0) {
            return ((d4) obj).v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۠۟, reason: not valid java name and contains not printable characters */
    public static String m7286(String str) {
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

    /* JADX INFO: renamed from: ۤۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7288(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0192.m3659() >= 0) {
            r7.F((Uri.Builder) obj, (String) obj2, (String) obj3, (Set) obj4);
        }
    }

    /* JADX INFO: renamed from: ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static p7 m7289(Object obj) {
        if (C0432.m8447() <= 0) {
            return ((k7) obj).f10159b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۤ, reason: contains not printable characters */
    public static l0 m7290() {
        if (C0028.m557() >= 0) {
            return l0.f9144q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static boolean m7291() {
        if (C0405.m7934() > 0) {
            return zzon.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۢۢ, reason: contains not printable characters */
    public static byte[] m7292(Object obj, int i10) {
        if (C0271.m5170() <= 0) {
            return ((Cursor) obj).getBlob(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static Character m7293(char c10) {
        if (C0186.m3548() <= 0) {
            return Character.valueOf(c10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static long m7294(Object obj) {
        if (C0420.m8247() > 0) {
            return ((a5) obj).f9874i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static long m7295(Object obj) {
        if (C0447.m8696() > 0) {
            return ((b5) obj).f8754d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7287(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
