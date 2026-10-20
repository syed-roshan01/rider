package s2;

import a0.C0003;
import a5.l;
import android.os.Parcel;
import android.view.MotionEvent;
import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.graphics.C0030;
import b0.h0;
import b7.C0053;
import c9.f;
import com.auto.accept.data.model.C0071;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.remoteconfig.interop.C0196;
import d5.o1;
import d8.C0221;
import dagger.hilt.android.internal.migration.C0232;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e1.l0;
import e2.C0261;
import f0.c2;
import f0.l1;
import f0.r;
import f0.u;
import h0.v0;
import h3.C0302;
import j6.C0328;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import java.util.List;
import k0.g3;
import k0.w3;
import k6.c4;
import k6.k;
import m0.C0349;
import m0.m;
import m0.q;
import p9.z;
import t.e;
import u2.C0433;

/* JADX INFO: renamed from: s2.۟ۧ۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0411 {

    /* JADX INFO: renamed from: ۟ۤۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f682 = 37;

    /* JADX INFO: renamed from: ۣ۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static l0 m8065(Object obj) {
        if (C0196.m3762() < 0) {
            return ((g3) obj).f8949e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m8066() {
        return (-988) ^ C0030.f50;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m8067(Object obj, int i10, Object obj2) {
        if (C0349.m6838() <= 0) {
            return ((h0) obj).f(i10, 0.0f, e.r(0.0f, null, 7), (u8.e) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8068() {
        if (C0167.m3200() >= 0) {
            return "lifetime_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static v0 m8069(Object obj) {
        if (C0221.m4264() > 0) {
            return ((u) obj).f5959u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static float m8070(Object obj) {
        if (C0349.m6838() < 0) {
            return ((MotionEvent) obj).getRawX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m8072(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8073(Object obj) {
        if (C0302.m5836() >= 0) {
            return zzbw.zzc((Parcel) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static f m8074(Object obj) {
        if (C0115.m2227() <= 0) {
            return ((w3) obj).f9618n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۤ, reason: not valid java name and contains not printable characters */
    public static c2 m8075(Object obj) {
        if (C0433.m8481() > 0) {
            return ((r) obj).f5862a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8076(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۦۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8077(Object obj) {
        if (C0022.m444() < 0) {
            return ((l1) obj).f5812a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m8078(Object obj) {
        if (C0245.m4710() > 0) {
            return ((q) obj).P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static z m8079(Object obj) {
        if (C0053.m1029() <= 0) {
            return ((MainViewModel) obj).Y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m8080(Object obj) {
        if (C0071.m1458() >= 0) {
            return ((l) obj).f1285a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m8081() {
        if (C0328.m6350() >= 0) {
            return "Error inserting column. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۨ, reason: not valid java name and contains not printable characters */
    public static void m8082(Object obj, Object obj2) {
        if (C0003.m70() >= 0) {
            ((SecureRandom) obj).nextBytes((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static String m8083(Object obj, Object obj2) {
        if (C0261.m4991() > 0) {
            return ((c4) obj).f((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۨ, reason: contains not printable characters */
    public static void m8084(Object obj, Object obj2) {
        if (C0232.m4482() >= 0) {
            ((k) obj).K((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۤۥ, reason: contains not printable characters */
    public static d5.l m8085() {
        if (C0019.m375() < 0) {
            return d5.l.A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static void m8086(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        if (C0078.m1692() > 0) {
            o1.i((MainViewModel) obj, (UserProfile) obj2, (c9.a) obj3, (c9.a) obj4, (m) obj5, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static String m8071(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
