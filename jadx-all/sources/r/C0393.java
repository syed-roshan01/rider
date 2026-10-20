package r;

import a2.z;
import android.app.Notification;
import android.app.Service;
import android.os.Parcel;
import androidx.core.app.C0040;
import androidx.profileinstaller.C0045;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.emulators.C0140;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.interop.C0173;
import d3.C0217;
import d5.j1;
import d9.C0225;
import dagger.hilt.C0256;
import dagger.hilt.android.lifecycle.C0238;
import e8.C0266;
import e8.p1;
import f0.i;
import f0.s1;
import h7.C0311;
import h8.l;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import k0.s3;
import k0.x2;
import k0.y2;
import k6.l7;
import k6.p6;
import k6.p7;
import k6.q;
import m0.g1;
import m1.C0351;
import q.f;
import q6.C0388;
import u8.C0439;
import v9.C0452;
import x4.C0470;
import y0.g;
import y9.C0480;
import z7.C0489;

/* JADX INFO: renamed from: r.۠ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0393 {

    /* JADX INFO: renamed from: ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static int f663 = 577;

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m7671() {
        if (C0079.m1701() > 0) {
            return "Error storing bundle. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7672(Object obj, Object obj2) {
        if (C0123.m2379() > 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static g1 m7673(Object obj) {
        if (C0045.m874() >= 0) {
            return ((j1) obj).f4590c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۨ, reason: not valid java name and contains not printable characters */
    public static y2 m7674(Object obj) {
        if (C0040.m792() > 0) {
            return ((x2) obj).f9645a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m7675() {
        return 395 ^ C0480.f753;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static int m7677(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static BitSet m7678(Object obj) {
        if (C0217.m4114() <= 0) {
            return BitSet.valueOf((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static l7 m7679(Object obj) {
        if (C0489.m9505() >= 0) {
            return ((p7) obj).f10295j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۥ, reason: not valid java name and contains not printable characters */
    public static g m7680() {
        if (C0470.m9143() >= 0) {
            return y0.a.f16712e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7681(Object obj) {
        if (C0388.m7585() > 0) {
            return ((Parcel) obj).readString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟۠, reason: not valid java name and contains not printable characters */
    public static Object m7682(Object obj, Object obj2) {
        if (C0266.m5069() < 0) {
            return ((s1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7683(Object obj) {
        if (C0351.m6878() <= 0) {
            return ((s3) obj).f9453e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static f m7684(Object obj) {
        if (C0238.m4583() >= 0) {
            return ((q) obj).f10312b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7685(Object obj, Object obj2) {
        if (C0439.m8564() >= 0) {
            return f6.a.q0((String) obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m7686() {
        if (C0225.m4316() >= 0) {
            return "driving_language_notice";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m7687(Object obj) {
        if (C0256.m4876() < 0) {
            return ((p6) obj).f10285l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static y0.f m7688() {
        if (C0452.m8793() <= 0) {
            return y0.a.f16713f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m7689(Object obj) {
        if (C0238.m4583() > 0) {
            return ((i) obj).f5741a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۧ, reason: contains not printable characters */
    public static p1 m7690(Object obj) {
        if (C0173.m3314() >= 0) {
            return ((l) obj).f7664j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۧ, reason: contains not printable characters */
    public static void m7691(Object obj, int i10, Object obj2) {
        if (C0140.m2699() >= 0) {
            ((Service) obj).startForeground(i10, (Notification) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠, reason: contains not printable characters */
    public static int m7692(Object obj) {
        if (C0074.m1607() < 0) {
            return ((a5.g) obj).f1258c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۤۨ, reason: contains not printable characters */
    public static m2.b m7693(Object obj) {
        if (C0311.m5997() > 0) {
            return ((z) obj).f1058g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۤ, reason: not valid java name and contains not printable characters */
    public static i1.f m7694() {
        if (C0171.m3272() <= 0) {
            return z6.a.f17312m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m7695(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m7676(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
