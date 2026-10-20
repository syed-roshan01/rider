package androidx.core.content;

import android.app.ActivityManager;
import androidx.compose.ui.graphics.a;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.inject.C0172;
import com.google.firebase.remoteconfig.interop.C0197;
import d5.b1;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.internal.definecomponent.C0250;
import e1.f0;
import e1.l0;
import f0.a2;
import f0.c;
import f0.g0;
import f0.h2;
import f0.k1;
import f2.j;
import g1.g;
import g1.k;
import g2.i0;
import h.C0299;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.b2;
import k6.k7;
import k6.r7;
import l6.C0345;
import m7.C0359;
import q7.C0391;
import r2.C0396;
import r2.C0397;
import s3.C0413;
import t.o1;
import t.u1;
import t2.C0424;
import t8.C0427;
import v0.p;
import y0.o;
import z7.C0489;

/* JADX INFO: renamed from: androidx.core.content.ۣۣۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0041 {

    /* JADX INFO: renamed from: ۦۤۤۥ, reason: contains not printable characters */
    public static int f61 = -322;

    /* JADX INFO: renamed from: ۟۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m799(Object obj) {
        if (C0396.m7737() >= 0) {
            return ((c) obj).f5626d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m800(Object obj, Object obj2) {
        if (C0197.m3786() < 0) {
            return ((a5.c) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m801(Object obj) {
        if (C0250.m4779() <= 0) {
            return ((ActivityManager.RunningAppProcessInfo) obj).importance;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static p m802() {
        if (C0424.m8307() >= 0) {
            return a2.f5599g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۦ, reason: not valid java name and contains not printable characters */
    public static o m803(Object obj, float f10, float f11, float f12, float f13, Object obj2, boolean z10, int i10) {
        if (C0391.m7643() < 0) {
            return a.k((o) obj, f10, f11, f12, f13, (l0) obj2, z10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m804(Object obj) {
        if (C0299.m5742() >= 0) {
            return ((j) obj).f6112a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۢ, reason: not valid java name and contains not printable characters */
    public static Boolean m805(Object obj) {
        if (C0489.m9505() >= 0) {
            return ((k6.o) obj).f10244c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static k1 m806(Object obj) {
        if (C0172.m3296() > 0) {
            return ((g0) obj).f5707c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m807(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m808(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m809(Object obj, Object obj2, int i10, Object obj3) {
        if (C0397.m7755() >= 0) {
            ((r7) obj).N((StringBuilder) obj2, i10, (List) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۥ, reason: not valid java name and contains not printable characters */
    public static r7 m810(Object obj) {
        if (C0129.m2492() > 0) {
            return ((k7) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۢ, reason: not valid java name and contains not printable characters */
    public static o1 m811(Object obj) {
        if (C0233.m4482() > 0) {
            return ((u1) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ, reason: not valid java name and contains not printable characters */
    public static int m812() {
        return 603 ^ C0359.f629;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static f0 m813() {
        if (C0413.m8089() < 0) {
            return e1.g0.f5008a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۡ, reason: contains not printable characters */
    public static void m815(Object obj, float f10, float f11, long j10, Object obj2) {
        if (C0159.m3030() < 0) {
            b2.c((g) obj, f10, f11, j10, (k) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m816(Object obj) {
        if (C0345.m6746() > 0) {
            return ((b1) obj).f4414a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۤۧ, reason: not valid java name and contains not printable characters */
    public static i0 m817(Object obj) {
        if (C0427.m8356() < 0) {
            return ((h2) obj).f5739d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static String m814(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
