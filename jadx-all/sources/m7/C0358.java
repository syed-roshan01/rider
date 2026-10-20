package m7;

import android.graphics.Path;
import android.view.View;
import androidx.annotation.C0018;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.platform.C0038;
import androidx.versionedparcelable.C0048;
import c0.C0056;
import com.auto.accept.data.model.C0071;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.messaging.RemoteMessage;
import d5.a1;
import d5.p0;
import d9.C0227;
import e1.C0259;
import e1.i;
import f.C0270;
import f5.b0;
import f5.e0;
import f5.t;
import h5.C0308;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import k0.u;
import k0.u2;
import k0.x1;
import k0.z1;
import k6.j4;
import k6.z3;
import l6.C0345;
import la.C0349;
import m0.C0350;
import r1.x0;
import t3.C0425;
import z1.C0484;

/* JADX INFO: renamed from: m7.ۥۨۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0358 {

    /* JADX INFO: renamed from: ۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int f628 = 780;

    /* JADX INFO: renamed from: ۟۠۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6998(Object obj, Object obj2) {
        if (C0018.m354() >= 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m6999(Object obj) {
        if (C0349.m6818() <= 0) {
            return ((x1) obj).f9642e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static p9.c m7000(Object obj) {
        if (C0345.m6746() >= 0) {
            return h6.g.b((c9.e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m7001() {
        return (-263) ^ C0350.f620;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m7002(Object obj, Object obj2) {
        if (C0027.m541() >= 0) {
            return ((t) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m7003(Object obj) {
        if (C0425.m8322() >= 0) {
            return ((RemoteMessage.Notification) obj).getBody();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7005(Object obj) {
        if (C0048.m925() > 0) {
            return ((e0) obj).f6251c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m7006(Object obj) {
        if (C0130.m2511() >= 0) {
            return ((p0) obj).f4715b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static c9.a m7007(Object obj) {
        if (C0152.m2931() > 0) {
            return ((z1) obj).f9689a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7008() {
        if (C0056.m1077() <= 0) {
            return zzpy.zzc();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m7009(Object obj) {
        if (C0121.m2336() <= 0) {
            return ((a1) obj).f4393a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m7010(Object obj) {
        if (C0038.m750() <= 0) {
            return ((z3) obj).f10595g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m7011(Object obj) {
        if (C0259.m4939() < 0) {
            return ((k0.e) obj).f8856t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m7012(Object obj) {
        if (C0079.m1701() >= 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m7013(Object obj) {
        if (C0484.m9403() >= 0) {
            return ((b0) obj).f6232a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m7014(Object obj) {
        if (C0227.m4372() <= 0) {
            return j4.s((HttpURLConnection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m7015(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static x0 m7016(Object obj) {
        if (C0076.m1655() >= 0) {
            return ((u) obj).f9511f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m7017(Object obj) {
        if (C0270.m5152() >= 0) {
            return ((u2) obj).f9521a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m7018(Object obj, Object obj2) {
        if (C0308.m5935() > 0) {
            ((View) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Path m7019(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((i) obj).f5014a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int m7020(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۥۨ۠, reason: not valid java name and contains not printable characters */
    public static String m7004(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
