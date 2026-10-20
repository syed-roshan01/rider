package com.google.firebase.firestore.remote;

import android.app.job.JobInfo;
import b5.l;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.measurement.internal.C0104;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.provider.C0194;
import d5.d1;
import d5.n;
import dagger.hilt.android.components.C0227;
import f0.c2;
import f0.z0;
import f4.y;
import ia.C0322;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.h4;
import k0.l1;
import k0.m1;
import k0.m4;
import k0.z3;
import k6.x6;
import la.C0348;
import m0.m;
import p9.z;
import q6.C0386;
import v6.C0447;
import w0.p;
import x5.C0470;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.ۣۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0163 {

    /* JADX INFO: renamed from: ۟۟ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static int f187 = -700;

    /* JADX INFO: renamed from: ۟۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static u0.b m3114() {
        if (C0189.m3621() >= 0) {
            return n.f4690k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static JobInfo.Builder m3115(Object obj, long j10) {
        if (C0470.m9151() >= 0) {
            return ((JobInfo.Builder) obj).setOverrideDeadline(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static z0 m3116(Object obj) {
        if (C0175.m3346() >= 0) {
            return ((c2) obj).f5653r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m3117(Object obj) {
        if (C0386.m7564() >= 0) {
            return ((d1) obj).f4453e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static List m3118() {
        if (C0322.m6244() >= 0) {
            return p.f16114g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3119(Object obj) {
        if (C0104.m2034() < 0) {
            return ((zzfc.zzc.zza) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m3120(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m3121(Object obj) {
        if (C0110.m2123() < 0) {
            return ((y) obj).f6226a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m3122(Object obj) {
        if (C0078.m1692() >= 0) {
            return ((r1.p) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۢ, reason: not valid java name and contains not printable characters */
    public static l m3123() {
        if (C0137.m2646() < 0) {
            return l.f2730c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨ۠, reason: not valid java name and contains not printable characters */
    public static Integer m3124(Object obj) {
        if (C0348.m6818() <= 0) {
            return ((z3) obj).f9707f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m3125(Object obj) {
        if (C0080.m1729() < 0) {
            return ((l1) obj).f9169y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m3126(Object obj, Object obj2) {
        if (C0119.m2289() > 0) {
            return r9.a.a((Task) obj, (u8.e) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3127(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((x6) obj).f10541f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3128(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static z m3129(Object obj) {
        if (C0194.m3713() > 0) {
            return ((MainViewModel) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۧ۟, reason: not valid java name and contains not printable characters */
    public static o m3130(Object obj) {
        if (C0161.m3081() <= 0) {
            return ((h4) obj).f8983b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۨ, reason: not valid java name and contains not printable characters */
    public static m4 m3131(Object obj, int i10) {
        if (C0447.m8732() < 0) {
            return m1.c((m) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3132() {
        return (-153) ^ C0227.f307;
    }

    /* JADX INFO: renamed from: ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3133(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
