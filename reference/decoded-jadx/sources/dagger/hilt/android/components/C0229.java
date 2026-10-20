package dagger.hilt.android.components;

import a5.d0;
import a6.C0007;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import androidx.profileinstaller.C0046;
import c4.C0065;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.measurement.C0182;
import ea.C0267;
import f0.h;
import g2.b0;
import g5.C0290;
import h.C0296;
import i7.h1;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;
import k0.c;
import k6.f5;
import k6.p2;
import m0.g1;
import m0.m;
import m5.C0355;
import u3.C0434;
import v.C0439;
import y3.e;
import z7.C0488;

/* JADX INFO: renamed from: dagger.hilt.android.components.ۡۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0229 {

    /* JADX INFO: renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f309 = -241;

    /* JADX INFO: renamed from: ۟۠۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static long m4407() {
        if (C0439.m8582() <= 0) {
            return zzne.zzg();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String m4408(Object obj) {
        if (C0488.m9505() >= 0) {
            return ((d0) obj).f1239a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4409() {
        if (C0085.m1825() >= 0) {
            return zzoo.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4410(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4411(Object obj) {
        if (C0065.m1257() < 0) {
            h1.z((h1) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m4412(Object obj) {
        if (C0046.m893() > 0) {
            f5.b((p2) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m4413(Object obj) {
        if (C0182.m3488() > 0) {
            return ((b0) obj).f6513b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4414(Object obj, int i10, int i11) {
        if (C0434.m8498() < 0) {
            e.f1((Parcel) obj, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m4415(Object obj) {
        if (C0267.m5113() < 0) {
            return ((c) obj).f8771b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static g1 m4416(Object obj) {
        if (C0355.m6968() > 0) {
            return ((d5.c) obj).f4426b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4417(Object obj, long j10, Object obj2, int i10) {
        if (C0007.m154() <= 0) {
            e.q((String) obj, j10, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۡۨۡ۟, reason: not valid java name and contains not printable characters */
    public static long m4418(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0133.m2559() >= 0) {
            return ((SQLiteDatabase) obj).insert((String) obj2, (String) obj3, (ContentValues) obj4);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4419(Object obj) {
        if (C0103.m2022() >= 0) {
            return ((h) obj).f5711a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4420(String str) {
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

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4421() {
        return 379 ^ C0290.f438;
    }

    /* JADX INFO: renamed from: ۥۤۧۡ, reason: contains not printable characters */
    public static String m4423() {
        if (C0296.m5709() <= 0) {
            return "trigger_event_name";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4422(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
