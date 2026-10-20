package android.support.v4.app;

import a2.C0005;
import a2.c0;
import android.os.Parcel;
import androidx.startup.C0047;
import b4.C0052;
import c1.C0060;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.messaging.reporting.C0189;
import com.google.protobuf.h2;
import d5.x;
import d9.C0223;
import f0.o1;
import f5.g0;
import f6.C0278;
import g2.n;
import h7.C0310;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.e5;
import k0.w1;
import k6.a5;
import k6.d7;
import k6.h7;
import k6.o5;
import k6.w6;
import k6.x7;
import k6.y3;
import m0.d1;
import m0.l3;
import m1.C0350;
import q0.C0382;
import s7.C0415;
import t0.C0418;
import w4.C0459;
import y.C0475;
import z6.a;

/* JADX INFO: renamed from: android.support.v4.app.ۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0015 {

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int f35 = 755;

    /* JADX INFO: renamed from: ۟۠ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static f m287() {
        if (C0166.m3170() <= 0) {
            return a.f17302c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m288(Object obj) {
        if (C0047.m904() < 0) {
            return ((a5) obj).f9880o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m289() {
        if (C0350.m6878() <= 0) {
            return o1.f5840a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۢ, reason: not valid java name and contains not printable characters */
    public static int m290(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static c0 m291(Object obj) {
        if (C0052.m1013() >= 0) {
            return ((e5) obj).f8889j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static List m292(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0459.m8951() <= 0) {
            return ((y3) obj).m((String) obj2, (String) obj3, (x7) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m293(Object obj) {
        if (C0144.m2767() >= 0) {
            return ((n) obj).f6582a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m294() {
        return 48 ^ C0060.f80;
    }

    /* JADX INFO: renamed from: ۠ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static Parcel m295(Object obj) {
        if (C0005.m104() > 0) {
            return ((zzbu) obj).a_();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ, reason: not valid java name and contains not printable characters */
    public static c0 m296(Object obj, Object obj2) {
        if (C0223.m4304() <= 0) {
            return ((c0) obj).d((c0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۤ, reason: not valid java name and contains not printable characters */
    public static x7 m297(Object obj) {
        if (C0475.m9266() >= 0) {
            return ((w6) obj).f10467b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static com.google.protobuf.n m298(Object obj) {
        if (C0310.m5997() > 0) {
            return ((h2) obj).f4125f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m299(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢۨۢ۠, reason: not valid java name and contains not printable characters */
    public static void m300(Object obj) {
        if (C0189.m3621() >= 0) {
            ((o5) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static l3 m301(Object obj) {
        if (C0089.m1902() < 0) {
            return ((w1) obj).f9605f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m303(Object obj) {
        if (C0415.m8144() > 0) {
            ((MainViewModel) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static d7 m304(Object obj) {
        if (C0278.m5394() >= 0) {
            return ((h7) obj).f10093d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦۦ, reason: contains not printable characters */
    public static d1 m305(Object obj) {
        if (C0418.m8221() > 0) {
            return ((x) obj).f4837f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m306(Object obj) {
        if (C0382.m7487() <= 0) {
            return ((g0) obj).f6268q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m302(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
