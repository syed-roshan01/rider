package q7;

import a2.C0004;
import android.database.Cursor;
import androidx.compose.foundation.relocation.C0024;
import b.C0049;
import b7.C0054;
import c1.C0059;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.database.collection.C0138;
import dagger.hilt.internal.C0254;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import f5.r;
import g8.g1;
import i1.e;
import i1.f;
import j2.C0324;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k6.v;
import k6.x;
import k6.x3;
import m0.m3;
import q6.l;
import s8.C0418;
import u.C0429;
import u1.y0;
import y0.o;
import y1.i;
import y1.u;

/* JADX INFO: renamed from: q7.۟ۢۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0391 {

    /* JADX INFO: renamed from: ۟ۦۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int f661 = -315;

    /* JADX INFO: renamed from: ۟۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static int m7634(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m7635(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static m3 m7636() {
        if (C0112.m2176() >= 0) {
            return y0.f15377b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static l m7637(Object obj) {
        if (C0138.m2662() > 0) {
            return ((g1) obj).f6805k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static f m7638(Object obj) {
        if (C0246.m4710() > 0) {
            return ((e) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m7639(Object obj, int i10) {
        if (C0254.m4844() >= 0) {
            return ((Cursor) obj).getInt(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static List m7640(Object obj) {
        if (C0024.m487() > 0) {
            return ((k0.f) obj).f8895a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m7641(Object obj, Object obj2) {
        if (C0081.m1735() >= 0) {
            return ((r) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7642(Object obj) {
        if (C0324.m6259() <= 0) {
            return ((zzew.zzd) obj).zzk();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m7643() {
        return (-822) ^ C0418.f688;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m7644(Object obj) {
        if (C0004.m76() <= 0) {
            return ((a5.e) obj).f1247a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟۟, reason: not valid java name and contains not printable characters */
    public static u m7645() {
        if (C0049.m945() > 0) {
            return i.f16767g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static o m7646(Object obj, float f10, float f11) {
        if (C0429.m8409() < 0) {
            return androidx.compose.foundation.layout.c.a((o) obj, f10, f11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static v m7647(Object obj) {
        if (C0054.m1047() >= 0) {
            return ((k6.e) obj).f9993n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۡ, reason: not valid java name and contains not printable characters */
    public static x3 m7648() {
        if (C0331.m6374() > 0) {
            return x.f10507s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public static zzfi.zzj.zza m7650(Object obj, boolean z10) {
        if (C0119.m2289() > 0) {
            return ((zzfi.zzj.zza) obj).zzd(z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static String m7651() {
        if (C0059.m1117() <= 0) {
            return "open_shizuku_btn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ, reason: not valid java name and contains not printable characters */
    public static String m7649(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
