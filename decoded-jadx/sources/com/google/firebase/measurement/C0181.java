package com.google.firebase.measurement;

import a2.x;
import a4.q;
import android.view.View;
import androidx.core.app.C0040;
import androidx.profileinstaller.C0045;
import b4.g;
import c1.C0060;
import c9.a;
import c9.f;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.common.util.C0085;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.q1;
import dagger.hilt.android.internal.migration.C0232;
import f0.a1;
import f0.h;
import f2.e;
import f4.C0275;
import g0.C0285;
import i5.C0318;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import k0.i0;
import k0.l1;
import k0.o1;
import k0.t0;
import k0.y;
import k6.c4;
import k6.p4;
import l9.i;
import m0.m;
import m0.n1;
import p0.C0374;
import t.d;
import v6.C0447;
import x4.C0468;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.measurement.۟۠۟ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0181 {

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int f205 = -905;

    /* JADX INFO: renamed from: ۟۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static long m3451(Object obj) {
        if (C0468.m9123() < 0) {
            return ((p4) obj).f10272b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3452() {
        return (-321) ^ C0328.f476;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static a1 m3453(Object obj) {
        if (C0232.m4482() > 0) {
            return ((o1) obj).f9298r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3454(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۦۤۨ, reason: not valid java name and contains not printable characters */
    public static n1 m3455(Object obj) {
        if (C0203.m3894() >= 0) {
            return ((d) obj).f14111d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static e m3456(Object obj) {
        if (C0285.m5504() >= 0) {
            return ((x) obj).f1036f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3457(Object obj, Object obj2, int i10) {
        if (C0374.m7350() < 0) {
            ((q1) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m3458(Object obj) {
        if (C0117.m2257() > 0) {
            return ((h) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3460(Object obj) {
        if (C0040.m792() > 0) {
            return ((l1) obj).f9152a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m3461() {
        if (C0275.m5308() >= 0) {
            return c4.f9929b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3462(Object obj, Object obj2) {
        if (C0108.m2101() <= 0) {
            y3.e.C0((View) obj, (g) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m3463() {
        if (C0083.m1779() >= 0) {
            return "Storing trigger URI outside of the max retention time span. appId, now, timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static ListenerRegistration m3464(Object obj, Object obj2) {
        if (C0152.m2931() > 0) {
            return ((DocumentReference) obj).addSnapshotListener((EventListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۢ, reason: not valid java name and contains not printable characters */
    public static y m3465(Object obj) {
        if (C0318.m6163() < 0) {
            return ((i0) obj).L;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3466(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z10, float f10, Object obj9, Object obj10, Object obj11, Object obj12, int i10, int i11) {
        if (C0447.m8732() <= 0) {
            t0.b((o) obj, (c9.e) obj2, (c9.e) obj3, (f) obj4, (c9.e) obj5, (c9.e) obj6, (c9.e) obj7, (c9.e) obj8, z10, f10, (c9.e) obj9, (c9.e) obj10, (y.t0) obj11, (m) obj12, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static a m3467(Object obj) {
        if (C0060.m1148() >= 0) {
            return ((d5.y) obj).f4855e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3468(Object obj, Object obj2) {
        if (C0085.m1825() > 0) {
            return q.d((q) obj, (InputStream) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۤ, reason: contains not printable characters */
    public static int m3469(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣ۠۠, reason: contains not printable characters */
    public static boolean m3470(Object obj) {
        if (C0045.m874() >= 0) {
            return i.R0((CharSequence) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3459(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
