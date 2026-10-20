package dagger.hilt.android.components;

import a2.c0;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.key.C0033;
import androidx.concurrent.futures.o;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.firestore.bundle.C0150;
import d5.h2;
import d8.C0221;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import f0.l1;
import h3.C0303;
import i4.C0317;
import java.io.ByteArrayOutputStream;
import k0.e5;
import k0.u4;
import k6.i6;
import k6.t5;
import k6.y5;
import m7.C0358;
import p9.q0;
import q6.C0386;
import r1.x0;
import s7.C0415;
import t2.C0422;
import u8.C0438;
import w4.C0459;
import x9.i;

/* JADX INFO: renamed from: dagger.hilt.android.components.ۣ۟۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0227 {

    /* JADX INFO: renamed from: ۟ۤۥۡ۠, reason: not valid java name and contains not printable characters */
    public static int f307 = -912;

    /* JADX INFO: renamed from: ۟۠ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4375(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0422.m8294() >= 0) {
            return ((SQLiteDatabase) obj).delete((String) obj2, (String) obj3, (String[]) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4376(Object obj) {
        if (C0016.m315() > 0) {
            return ((SharedPreferences.Editor) obj).commit();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4377(Object obj, Object obj2) {
        if (C0229.m4421() <= 0) {
            return ((o) obj).set(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4378(String str) {
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

    /* JADX INFO: renamed from: ۠ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4379(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4380() {
        return (-978) ^ C0386.f657;
    }

    /* JADX INFO: renamed from: ۢۡۥۢ, reason: not valid java name and contains not printable characters */
    public static void m4382(Object obj, Object obj2) {
        if (C0303.m5859() <= 0) {
            ((q0) obj).i(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static c0 m4383(Object obj) {
        if (C0415.m8144() >= 0) {
            return ((e5) obj).f8881b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static String[] m4384() {
        if (C0438.m8564() >= 0) {
            return t5.f10397g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4385(Object obj) {
        if (C0091.m1940() <= 0) {
            return ((i) obj).f16417b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4386(Object obj) {
        if (C0150.m2892() <= 0) {
            return u4.e((x0) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۟۟, reason: not valid java name and contains not printable characters */
    public static y5 m4387(Object obj) {
        if (C0245.m4710() > 0) {
            return ((i6) obj).f10111a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4388(Object obj) {
        if (C0221.m4264() >= 0) {
            return ((h2) obj).f4547a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧ۟۠, reason: not valid java name and contains not printable characters */
    public static y0.o m4389(Object obj, float f10, float f11, int i10) {
        if (C0358.m7035() <= 0) {
            return c.e((y0.o) obj, f10, f11, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4390() {
        if (C0033.m652() <= 0) {
            return zznp.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۠, reason: not valid java name and contains not printable characters */
    public static void m4391(Object obj) {
        if (C0459.m8951() <= 0) {
            ((Cursor) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۤۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m4392(Object obj, Object obj2) {
        if (C0317.m6144() <= 0) {
            return ((l1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4381(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
