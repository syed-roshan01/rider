package v9;

import a0.C0003;
import a5.c;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.support.v4.app.C0014;
import b0.a0;
import b0.h0;
import ca.C0070;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.measurement.C0181;
import dagger.hilt.internal.C0252;
import dagger.hilt.internal.componenttreedeps.C0248;
import f0.j1;
import f0.r0;
import f0.u1;
import fa.C0281;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import k0.w2;
import k6.l4;
import k6.p7;
import k6.q6;
import k6.r5;
import k6.x;
import k6.x3;
import l2.C0341;
import l3.C0342;
import m1.C0351;
import m3.C0352;
import m5.C0354;
import org.json.JSONArray;
import p9.z;
import q6.C0386;
import q8.f;
import s8.C0417;
import v7.C0449;
import x.m;
import y6.C0476;
import z1.C0483;
import z3.C0486;

/* JADX INFO: renamed from: v9.۠ۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0452 {

    /* JADX INFO: renamed from: ۨ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int f723 = -834;

    /* JADX INFO: renamed from: ۣ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m8807(Object obj) {
        if (C0252.m4832() < 0) {
            return ((l4) obj).f10174g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8808(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static m m8809(Object obj) {
        if (C0417.m8208() > 0) {
            return ((u1) obj).f5970f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m8810() {
        if (C0342.m6720() >= 0) {
            return "Failed to insert/update event aggregates (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static x3 m8811() {
        if (C0351.m6885() > 0) {
            return x.M;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static z m8813(Object obj) {
        if (C0341.m6699() <= 0) {
            return ((MainViewModel) obj).R0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static q6 m8814(Object obj) {
        if (C0386.m7564() > 0) {
            return ((p7) obj).E;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠۟, reason: not valid java name and contains not printable characters */
    public static String m8815(Object obj) {
        if (C0483.m9403() >= 0) {
            return ((c) obj).f1233d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ۠, reason: not valid java name and contains not printable characters */
    public static Charset m8816() {
        if (C0449.m8755() >= 0) {
            return l9.a.f11393a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static long m8817(Object obj) {
        if (C0091.m1940() <= 0) {
            return ((f0.a) obj).f5587a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۧۤ, reason: not valid java name and contains not printable characters */
    public static f m8818(Object obj) {
        if (C0181.m3452() <= 0) {
            return ((MainViewModel) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static a0 m8819(Object obj) {
        if (C0123.m2379() > 0) {
            return ((h0) obj).f2397e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۡۡ, reason: not valid java name and contains not printable characters */
    public static long m8820() {
        if (C0281.m5443() < 0) {
            return e5.a.a();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8821(Object obj) {
        if (C0070.m1363() >= 0) {
            return ((r0) obj).f5871d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static String m8822() {
        if (C0352.m6904() < 0) {
            return "Ola accept timers remove";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m8823(Object obj) {
        if (C0014.m269() <= 0) {
            return ((r5) obj).f10346a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m8824() {
        if (C0486.m9464() > 0) {
            return "app_version";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m8825() {
        return (-212) ^ C0003.f881;
    }

    /* JADX INFO: renamed from: ۤۥۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8826(Object obj) {
        if (C0476.m9298() < 0) {
            return ((w2) obj).f9610c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8827(Object obj) {
        if (C0090.m1920() >= 0) {
            return ((j1) obj).f5801e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static String m8828(Object obj, int i10) {
        if (C0248.m4762() > 0) {
            return ((JSONArray) obj).getString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۤۥ, reason: contains not printable characters */
    public static int m8829(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8830(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0354.m6953() < 0) {
            return ((d6.a) obj).a((Context) obj2, (Intent) obj3, (ServiceConnection) obj4, i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠۠, reason: not valid java name and contains not printable characters */
    public static String m8812(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
