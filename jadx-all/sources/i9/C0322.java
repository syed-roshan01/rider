package i9;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import androidx.annotation.C0019;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.draw.C0028;
import androidx.compose.ui.graphics.C0030;
import b8.C0055;
import com.auto.accept.data.model.UserProfile;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzs;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.measurement.C0182;
import d5.g1;
import d5.s;
import d8.C0222;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.codegen.C0243;
import e2.C0262;
import f5.r;
import g2.C0288;
import java.io.ByteArrayOutputStream;
import k0.f3;
import k0.l0;
import k0.m4;
import k0.p1;
import k6.h5;
import k6.x7;
import m0.m;
import m9.k;
import r1.l;
import s6.C0414;
import t3.C0425;
import u0.C0431;
import u2.C0434;
import y0.o;

/* JADX INFO: renamed from: i9.ۨۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0322 {

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static int f469 = -617;

    /* JADX INFO: renamed from: ۟۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m6211(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0431.m8425() > 0) {
            return ((SQLiteDatabase) obj).insertWithOnConflict((String) obj2, (String) obj3, (ContentValues) obj4, i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static UserProfile m6212(Object obj) {
        if (C0055.m1056() >= 0) {
            return ((g1) obj).f4511a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6213(Object obj) {
        if (C0288.m5529() >= 0) {
            return ((r) obj).f6322p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۥ, reason: not valid java name and contains not printable characters */
    public static long m6214(Object obj) {
        if (C0232.m4453() < 0) {
            return ((f3) obj).f8929e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static l0 m6215() {
        if (C0222.m4264() >= 0) {
            return l0.f9142o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static zzs m6217() {
        if (C0243.m4660() <= 0) {
            return zzs.ERROR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m6218() {
        if (C0028.m557() >= 0) {
            return "_cis";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static u0.b m6219() {
        if (C0414.m8107() < 0) {
            return s.f4759c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6220(Object obj) {
        if (C0262.m4991() >= 0) {
            return ((k) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static long m6221(Object obj) {
        if (C0079.m1701() >= 0) {
            return ((m4) obj).B;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m6222(Object obj, Object obj2) {
        if (C0182.m3488() > 0) {
            ((h5) obj).j((x7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6223(String str) {
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

    /* JADX INFO: renamed from: ۤۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m6224(Object obj, int i10) {
        if (C0434.m8481() >= 0) {
            ((TextView) obj).setTextColor(i10);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧۦ, reason: contains not printable characters */
    public static void m6225(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, float f10, Object obj6, Object obj7, int i10, int i11) {
        if (C0425.m8322() > 0) {
            androidx.compose.foundation.a.c((h1.c) obj, (String) obj2, (o) obj3, (y0.d) obj4, (l) obj5, f10, (e1.l) obj6, (m) obj7, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۦۧۢۥ, reason: contains not printable characters */
    public static int m6226() {
        return 303 ^ C0019.f39;
    }

    /* JADX INFO: renamed from: ۦۨۦۤ, reason: contains not printable characters */
    public static int m6227(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m6228(Object obj) {
        if (C0030.m575() >= 0) {
            return ((p1) obj).f9351y;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۥۡ, reason: not valid java name and contains not printable characters */
    public static MinimumInteractiveModifier m6229() {
        if (C0150.m2892() < 0) {
            return MinimumInteractiveModifier.f1691b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m6216(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
