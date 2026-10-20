package i;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.profileinstaller.C0046;
import com.auto.accept.data.model.UserProfile;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfiginterop.C0203;
import d9.C0223;
import dagger.hilt.android.components.C0229;
import e1.C0259;
import f5.p;
import f6.C0278;
import g7.C0292;
import h4.C0304;
import i3.a0;
import i4.o;
import j0.b0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import k0.g4;
import k0.q1;
import k0.w;
import k6.l4;
import k6.v6;
import l2.C0341;
import la.g;
import o7.d0;
import u.C0429;
import u1.C0432;
import u4.C0435;
import u8.e;
import w4.C0460;

/* JADX INFO: renamed from: i.ۢۥۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0315 {

    /* JADX INFO: renamed from: ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int f463 = 514;

    /* JADX INFO: renamed from: ۟۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static e m6098(Object obj, Object obj2, Object obj3) {
        if (C0046.m893() >= 0) {
            return ((p) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m6099(Object obj) {
        if (C0432.m8470() > 0) {
            return ((UserProfile) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m6100(Object obj, Object obj2) {
        if (C0341.m6699() < 0) {
            ((a0) obj).i((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m6101(Object obj, int i10) {
        if (C0278.m5394() > 0) {
            return ((List) obj).get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static b0 m6102(Object obj) {
        if (C0304.m5882() <= 0) {
            return ((l4) obj).f10189v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6104() {
        if (C0191.m3643() >= 0) {
            return g.f11424i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۡ, reason: not valid java name and contains not printable characters */
    public static o m6105(Object obj) {
        if (C0105.m2045() > 0) {
            return d0.s((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m6106() {
        if (C0229.m4421() < 0) {
            return "open_accessibility";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Intent m6107(Object obj, Object obj2) {
        if (C0203.m3894() > 0) {
            return ((Intent) obj).setPackage((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m6108() {
        if (C0460.m8972() >= 0) {
            return "Settings";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m6109(Object obj) {
        if (C0189.m3621() >= 0) {
            return ((v6) obj).f10442c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int m6110(Object obj) {
        if (C0292.m5634() <= 0) {
            return ((w) obj).f9596v;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m6111() {
        return (-999) ^ C0132.f158;
    }

    /* JADX INFO: renamed from: ۢۢۨۦ, reason: not valid java name and contains not printable characters */
    public static int m6112(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m6113() {
        if (C0091.m1940() < 0) {
            return "target_os_version";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m6114(String str) {
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

    /* JADX INFO: renamed from: ۦ۟ۡۢ, reason: contains not printable characters */
    public static k6.o m6115() {
        if (C0435.m8516() >= 0) {
            return k6.o.f10241f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤ۟, reason: contains not printable characters */
    public static c9.e m6116(Object obj) {
        if (C0429.m8415() > 0) {
            return ((q1) obj).f9384s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥ۟, reason: contains not printable characters */
    public static FirebaseFirestore m6117() {
        if (C0259.m4959() < 0) {
            return FirebaseFirestore.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int m6118(Object obj) {
        if (C0223.m4304() < 0) {
            return ((zzew.zze) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m6119(Object obj) {
        if (C0108.m2101() < 0) {
            return ((g4) obj).f8958b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m6103(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
