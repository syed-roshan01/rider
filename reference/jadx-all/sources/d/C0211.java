package d;

import a0.C0003;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.compose.foundation.layout.C0022;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.ktx.C0179;
import i3.a0;
import java.io.ByteArrayOutputStream;
import k0.l;
import k3.C0336;
import k6.l4;
import m7.C0357;
import o7.d0;
import p9.z;
import s7.C0415;
import z3.C0486;

/* JADX INFO: renamed from: d.۟ۤ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0211 {

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static int f234 = 361;

    /* JADX INFO: renamed from: ۣ۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4020(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۢ۟۟, reason: not valid java name and contains not printable characters */
    public static NetworkInfo m4021(Object obj) {
        if (C0160.m3070() < 0) {
            return ((ConnectivityManager) obj).getActiveNetworkInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۧ, reason: not valid java name and contains not printable characters */
    public static i1.f m4022() {
        if (C0179.m3417() >= 0) {
            return d0.f12592u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m4023() {
        if (C0022.m444() <= 0) {
            return "set_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static long m4024(Object obj) {
        if (C0357.m6984() > 0) {
            return ((l) obj).f9128q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦ۠۠, reason: not valid java name and contains not printable characters */
    public static a0 m4025(Object obj) {
        if (C0336.m6500() <= 0) {
            return ((l4) obj).f10180m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۣ, reason: contains not printable characters */
    public static boolean m4026(Object obj) {
        if (C0003.m70() >= 0) {
            return ((y3.b) obj).f16882f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۥۣ, reason: contains not printable characters */
    public static int m4028() {
        return (-284) ^ C0486.f759;
    }

    /* JADX INFO: renamed from: ۦۢۨۢ, reason: contains not printable characters */
    public static z m4029(Object obj) {
        if (C0415.m8130() <= 0) {
            return ((MainViewModel) obj).f3084c0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m4030(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦ۠ۥۧ, reason: contains not printable characters */
    public static String m4027(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
