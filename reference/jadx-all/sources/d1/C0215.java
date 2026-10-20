package d1;

import android.graphics.Rect;
import android.os.Handler;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.graphics.C0030;
import com.google.android.gms.common.C0087;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.installations.interop.C0173;
import d5.l;
import dagger.hilt.components.C0244;
import ea.C0268;
import f0.C0273;
import java.io.ByteArrayOutputStream;
import k0.f4;
import k0.j2;
import k0.y4;
import k6.c7;
import k6.h6;
import k6.y5;
import k6.z3;
import m0.m;
import t1.C0420;
import t7.C0426;

/* JADX INFO: renamed from: d1.ۣۧۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0215 {

    /* JADX INFO: renamed from: ۧ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static int f238 = 204;

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4084(Object obj) {
        if (C0022.m444() < 0) {
            return ((z3) obj).f10604p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4085() {
        if (C0164.m3153() > 0) {
            return "No network";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4086(Object obj, long j10) {
        if (C0268.m5113() < 0) {
            ((p) obj).T0(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m4087(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static l m4088() {
        if (C0030.m575() >= 0) {
            return l.f4629f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m4089(Object obj) {
        if (C0426.m8351() < 0) {
            return ((Rect) obj).width();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4090(Object obj, Object obj2, int i10) {
        if (C0115.m2227() < 0) {
            ((j2) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4091(Object obj, Object obj2) {
        if (C0420.m8247() > 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4092(Object obj, Object obj2, boolean z10) {
        if (C0159.m3030() <= 0) {
            return ((c7) obj).s((String) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static f4 m4093(Object obj) {
        if (C0244.m4678() > 0) {
            return ((y4) obj).f9675a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m4095() {
        if (C0173.m3314() > 0) {
            return "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4096() {
        return 14 ^ C0273.f388;
    }

    /* JADX INFO: renamed from: ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4097(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۨۢۦ, reason: not valid java name and contains not printable characters */
    public static y5 m4098(Object obj) {
        if (C0087.m1852() >= 0) {
            return ((h6) obj).f10089f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4094(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
