package androidx.versionedparcelable;

import android.content.SharedPreferences;
import android.os.Parcel;
import c1.C0060;
import c4.C0065;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.iid.C0171;
import com.google.firebase.inject.C0172;
import com.google.firebase.platforminfo.C0193;
import d5.s0;
import d5.u;
import d7.t;
import e0.a;
import e0.c;
import e0.e;
import e2.C0261;
import f4.C0277;
import f6.C0278;
import g2.a0;
import h0.v0;
import j3.C0326;
import j4.C0327;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import k0.h2;
import k0.l1;
import k0.u3;
import k0.v3;
import k6.g6;
import k6.r5;
import k6.x;
import k6.x3;
import k6.z3;
import l3.C0343;
import m0.j0;
import m4.C0354;
import m5.C0355;
import p4.C0377;
import q7.C0391;
import v0.C0443;
import y.i1;
import z8.C0492;
import z8.C0493;

/* JADX INFO: renamed from: androidx.versionedparcelable.۟ۦۦ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0048 {

    /* JADX INFO: renamed from: ۟ۢۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int f68 = -737;

    /* JADX INFO: renamed from: ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m920(Object obj, Object obj2, Object obj3) {
        if (C0377.m7371() >= 0) {
            return String.format((Locale) obj, (String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static x3 m922() {
        if (C0326.m6295() > 0) {
            return x.f10518x0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m923() {
        if (C0090.m1920() > 0) {
            return "raw_events";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static r5 m924() {
        if (C0391.m7643() < 0) {
            return r5.f10341b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m925() {
        return (-226) ^ C0443.f713;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ۠, reason: not valid java name and contains not printable characters */
    public static String m926(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m927(Object obj, Object obj2) {
        if (C0278.m5361() < 0) {
            return ((s0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static e m928(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        if (C0261.m4984() >= 0) {
            return a.a((a) obj, (c) obj2, (c) obj3, (c) obj4, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m929(Object obj) {
        if (C0343.m6720() > 0) {
            return ((z3) obj).f10598j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m930() {
        if (C0493.m9578() >= 0) {
            return "No data found";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m931(Object obj) {
        if (C0354.m6940() <= 0) {
            return ((g6) obj).f10067d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m932(Object obj) {
        if (C0492.m9566() > 0) {
            return ((u) obj).f4787c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static i1 m933(Object obj) {
        if (C0493.m9578() >= 0) {
            return ((h2) obj).f8975n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m934(Object obj, Object obj2, int i10) {
        if (C0327.m6304() < 0) {
            return ((SharedPreferences) obj).getInt((String) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۥ۟, reason: not valid java name and contains not printable characters */
    public static j0 m935(Object obj) {
        if (C0172.m3296() >= 0) {
            return t.R((c9.a) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m936(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static float m937() {
        if (C0277.m5315() < 0) {
            return u3.f9525b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m938() {
        if (C0171.m3272() <= 0) {
            return "install_shizuku_btn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m939() {
        if (C0065.m1257() < 0) {
            return "working_perfectly_for";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m940(Object obj) {
        if (C0060.m1148() >= 0) {
            return ((l1) obj).A;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m941(Object obj) {
        if (C0355.m6953() <= 0) {
            return ((v3) obj).f9560e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m942(Object obj, int i10, Object obj2) {
        if (C0278.m5361() <= 0) {
            y3.e.T0((Parcel) obj, i10, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۡۥ, reason: not valid java name and contains not printable characters */
    public static a0 m943(Object obj, long j10) {
        if (C0193.m3691() <= 0) {
            return v0.e((a2.e) obj, j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۧ, reason: not valid java name and contains not printable characters */
    public static String m921(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
