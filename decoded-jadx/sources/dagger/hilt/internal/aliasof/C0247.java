package dagger.hilt.internal.aliasof;

import a2.c0;
import a5.k;
import androidx.appcompat.widget.C0020;
import androidx.fragment.app.C0042;
import androidx.profileinstaller.C0045;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.tracing.C0204;
import d.C0210;
import d5.h;
import dagger.hilt.codegen.C0242;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.f3;
import k0.o1;
import k6.x;
import k6.x3;
import m0.g1;
import p8.C0380;
import q.n;
import q1.C0383;
import r1.C0393;
import s2.C0411;
import u.C0428;
import z5.j;

/* JADX INFO: renamed from: dagger.hilt.internal.aliasof.۟ۢۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0247 {

    /* JADX INFO: renamed from: ۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int f327 = -481;

    /* JADX INFO: renamed from: ۟۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static g1 m4731(Object obj) {
        if (C0087.m1852() > 0) {
            return ((h) obj).f4536c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int m4732() {
        return (-508) ^ C0204.f228;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m4733(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۣۥۢ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m4734() {
        if (C0160.m3070() <= 0) {
            return j.f17255a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۥ, reason: not valid java name and contains not printable characters */
    public static long m4735(Object obj) {
        if (C0411.m8066() <= 0) {
            return ((k) obj).f1281e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4736(Object obj, Object obj2) {
        if (C0210.m4028() < 0) {
            return ((String) obj).matches((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static c0 m4737(Object obj) {
        if (C0428.m8409() <= 0) {
            return ((o1) obj).f9296p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static long m4738(Object obj) {
        if (C0380.m7467() >= 0) {
            return ((f3) obj).f8928d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4740(Object obj, Object obj2) {
        if (C0242.m4660() < 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4741(Object obj) {
        if (C0045.m874() >= 0) {
            return ((zzfi.zzj) obj).zzay();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m4742(Object obj, Object obj2, Object obj3) {
        if (C0156.m2976() > 0) {
            return ((n) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4743(int i10) {
        if (C0383.m7523() < 0) {
            return Character.isLetterOrDigit(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m4744(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۨۤ۠, reason: not valid java name and contains not printable characters */
    public static x3 m4745() {
        if (C0109.m2116() <= 0) {
            return x.f10522z0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۢ, reason: contains not printable characters */
    public static boolean m4746(Object obj) {
        if (C0393.m7716() >= 0) {
            return ((zzfi.zzj) obj).zzbp();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۢۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzn.zza m4747(Object obj, long j10) {
        if (C0020.m399() < 0) {
            return ((zzfi.zzn.zza) obj).zzb(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4748(Object obj, Object obj2) {
        if (C0042.m820() >= 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4739(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
