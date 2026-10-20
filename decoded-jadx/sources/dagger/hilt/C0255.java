package dagger.hilt;

import a2.x;
import a5.z;
import a6.C0007;
import a7.a;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0018;
import androidx.startup.C0047;
import com.auto.accept.data.model.UserProfile;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.measurement.C0184;
import f2.j;
import g5.C0290;
import h1.C0300;
import h5.C0308;
import java.io.ByteArrayOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import k0.k3;
import k0.n3;
import k6.d4;
import k6.f4;
import k6.f7;
import k6.l4;
import k6.p4;
import m0.f1;
import o4.C0369;
import o5.C0370;
import q6.C0386;
import u.w;
import u1.C0431;
import u4.C0436;
import v6.C0447;
import y.C0475;
import y1.u;
import y1.v;

/* JADX INFO: renamed from: dagger.hilt.ۣ۟ۧۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0255 {

    /* JADX INFO: renamed from: ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int f335 = -330;

    /* JADX INFO: renamed from: ۟۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4872(Object obj, Object obj2, Object obj3) {
        if (C0475.m9266() >= 0) {
            ((u) obj).a((v) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m4873(Object obj, Object obj2) {
        if (C0370.m7269() >= 0) {
            ((HttpsURLConnection) obj).setHostnameVerifier((HostnameVerifier) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static j m4874(Object obj) {
        if (C0184.m3517() > 0) {
            return ((x) obj).f1034d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4875(String str) {
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

    /* JADX INFO: renamed from: ۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4876() {
        return 992 ^ C0018.f38;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static UserProfile m4877(Object obj) {
        if (C0369.m7254() > 0) {
            return z.e((DocumentSnapshot) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static float m4878() {
        if (C0386.m7564() >= 0) {
            return k3.f9118h;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static f4 m4879(Object obj) {
        if (C0007.m154() <= 0) {
            return ((d4) obj).f9968j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۨ, reason: contains not printable characters */
    public static String m4880(Object obj, int i10, char c10) {
        if (C0300.m5773() <= 0) {
            return a.o((StringBuilder) obj, i10, c10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨ, reason: contains not printable characters */
    public static w m4881(Object obj) {
        if (C0152.m2931() > 0) {
            return ((n3) obj).f9273e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۨ, reason: contains not printable characters */
    public static String m4882(Object obj) {
        if (C0290.m5589() <= 0) {
            return ((zzew.zzd) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۥ, reason: contains not printable characters */
    public static Parcelable.Creator m4883() {
        if (C0431.m8447() < 0) {
            return Bundle.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4885(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4886(Object obj, int i10) {
        if (C0125.m2408() > 0) {
            return ((l4) obj).p(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static p4 m4887(Object obj) {
        if (C0436.m8524() < 0) {
            return ((l4) obj).f10177j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static f1 m4888(Object obj) {
        if (C0047.m904() <= 0) {
            return ((d5.x) obj).f4836e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m4889() {
        if (C0308.m5962() >= 0) {
            return "SELECT COUNT(1) FROM queue WHERE rowid IN ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4890(Object obj) {
        if (C0447.m8732() <= 0) {
            return ((f7) obj).f10052a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4884(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
