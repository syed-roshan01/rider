package androidx.fragment.app;

import androidx.activity.C0017;
import androidx.compose.ui.layout.C0036;
import c4.C0065;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.data.model.UserProfile;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.firebase.appcheck.interop.C0130;
import d7.C0219;
import g.C0284;
import h1.C0300;
import i5.C0318;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import k6.i6;
import k6.n6;
import k6.y5;
import m0.q2;
import q6.C0388;
import r2.C0397;
import u.C0429;
import u1.C0431;

/* JADX INFO: renamed from: androidx.fragment.app.ۣۣۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0042 {

    /* JADX INFO: renamed from: ۥۧۤ۠, reason: contains not printable characters */
    public static int f62 = 89;

    /* JADX INFO: renamed from: ۟۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static zzfp.zza m818(Object obj) {
        if (C0065.m1257() < 0) {
            return ((zzfp.zzc) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static List m819(Object obj) {
        if (C0284.m5483() >= 0) {
            return ((SupportedApp) obj).getPackageKeywords();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m820() {
        return (-92) ^ C0017.f37;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static u8.e m821(Object obj, Object obj2, Object obj3) {
        if (C0388.m7600() < 0) {
            return ((f5.g0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۥ, reason: not valid java name and contains not printable characters */
    public static i6 m822(Object obj) {
        if (C0318.m6163() <= 0) {
            return ((y5) obj).f10568c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static String m823(Object obj) {
        if (C0130.m2511() > 0) {
            return ((a5.b0) obj).f1226b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m824() {
        if (C0036.m698() <= 0) {
            return "gbraid";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۣ, reason: not valid java name and contains not printable characters */
    public static ArrayList m825(Object obj) {
        if (C0431.m8447() <= 0) {
            return ((q2) obj).f11668d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static d5.l m826() {
        if (C0300.m5773() < 0) {
            return d5.l.f4633q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static int m827(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static f4.y m828(Object obj) {
        if (C0429.m8415() >= 0) {
            return ((n6) obj).f10235n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m830() {
        if (C0219.m4237() >= 0) {
            return "open_dev_options";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static String m831(String str) {
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

    /* JADX INFO: renamed from: ۦۦۡۥ, reason: contains not printable characters */
    public static UserProfile m832(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, boolean z11, boolean z12, Object obj5, Object obj6, long j10, boolean z13, Object obj7) {
        if (C0397.m7764() < 0) {
            return ((UserProfile) obj).copy((String) obj2, (String) obj3, (String) obj4, z10, z11, z12, (String) obj5, (String) obj6, j10, z13, (String) obj7);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String m829(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
