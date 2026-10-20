package l8;

import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.platform.C0038;
import c4.C0064;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.ktx.C0180;
import d1.C0214;
import d5.p1;
import d9.C0224;
import dagger.hilt.migration.C0255;
import f.C0271;
import f0.e;
import f0.y;
import f5.x;
import f6.C0278;
import g2.s;
import g5.C0292;
import h.C0298;
import h7.C0313;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicLong;
import k0.i0;
import k6.c6;
import k6.m6;
import k6.p6;
import k6.q3;
import k6.r5;
import k6.t4;
import k6.y5;
import k6.z5;
import l0.m;
import t9.C0428;
import w1.C0456;

/* JADX INFO: renamed from: l8.ۢۦۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0347 {

    /* JADX INFO: renamed from: ۥۤۡۧ, reason: contains not printable characters */
    public static int f617 = -761;

    /* JADX INFO: renamed from: ۟۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m6769(Object obj) {
        if (C0428.m8371() <= 0) {
            return ((a5.a) obj).f1218b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m6771() {
        if (C0064.m1243() > 0) {
            return "Deleted stale rows. rowsDeleted";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static AtomicLong m6772(Object obj) {
        if (C0129.m2492() > 0) {
            return ((y5) obj).f10577l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m6773() {
        if (C0038.m750() < 0) {
            return m.f11097d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m6774() {
        return (-985) ^ C0255.f334;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m6775(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m6776(Object obj) {
        if (C0016.m315() > 0) {
            return ((x) obj).f6338a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤۨ, reason: not valid java name and contains not printable characters */
    public static long m6777(Object obj) {
        if (C0292.m5605() < 0) {
            return ((c6) obj).f9938b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static p6 m6778(Object obj) {
        if (C0313.m6046() > 0) {
            return ((q3) obj).p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static long m6779(Object obj) {
        if (C0224.m4304() < 0) {
            return ((i0) obj).f9010n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6780(Object obj, Object obj2, Object obj3) {
        if (C0180.m3448() >= 0) {
            return ((t4) obj).B((String) obj2, (r5) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static Exception m6781(Object obj) {
        if (C0278.m5361() < 0) {
            return ((m6) obj).f10210c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static String m6782(String str) {
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

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static int m6783(Object obj) {
        if (C0029.m568() < 0) {
            return ((z5) obj).f10614a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۤۥ, reason: contains not printable characters */
    public static s m6784(Object obj) {
        if (C0117.m2257() >= 0) {
            return ((y) obj).f6006e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۡ, reason: contains not printable characters */
    public static e m6785() {
        if (C0271.m5170() <= 0) {
            return e.f5671c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨۢ, reason: contains not printable characters */
    public static void m6786(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, long j10) {
        if (C0456.m8885() <= 0) {
            ((y5) obj).F((String) obj2, (String) obj3, obj4, z10, j10);
        }
    }

    /* JADX INFO: renamed from: ۦۣۥۦ, reason: contains not printable characters */
    public static String m6787(Object obj) {
        if (C0298.m5722() > 0) {
            return ((p1) obj).f4720b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m6788() {
        if (C0214.m4083() <= 0) {
            return "daily_realtime_events_count";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m6770(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
