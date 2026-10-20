package m9;

import androidx.compose.ui.graphics.C0031;
import b8.C0055;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.cct.C0076;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.provider.C0194;
import f4.C0274;
import f4.C0276;
import g2.C0287;
import h5.C0308;
import ia.C0322;
import j5.C0327;
import java.io.ByteArrayOutputStream;
import k6.j6;
import la.C0348;
import n.C0361;
import o4.C0369;
import t2.C0422;

/* JADX INFO: renamed from: m9.۟ۤۢۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0359 {

    /* JADX INFO: renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static int f630 = 313;

    /* JADX INFO: renamed from: ۟۟ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m7043() {
        if (C0151.m2903() >= 0) {
            return "Ride History";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7044() {
        if (C0274.m5286() <= 0) {
            return "Nothing to upload or uploading impossible";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m7045(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7046() {
        if (C0076.m1655() > 0) {
            return "select consent_state, consent_source from consent_settings where app_id=? limit 1;";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7047(Object obj) {
        if (C0422.m8294() >= 0) {
            return ((v.f2) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m7048(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m7049(Object obj) {
        if (C0287.m5529() >= 0) {
            return ((j6) obj).f10130e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static m2.l m7050(Object obj) {
        if (C0055.m1056() > 0) {
            return ((r1.q) obj).getLayoutDirection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7051(Object obj) {
        if (C0348.m6818() < 0) {
            ((d5.d) obj).m4159invoke();
        }
    }

    /* JADX INFO: renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m7052() {
        if (C0031.m598() > 0) {
            return "(With Filter: Min \u20b9";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7053(float f10, float f11, Object obj, Object obj2, int i10) {
        if (C0308.m5962() >= 0) {
            k0.i.b(f10, f11, (c9.e) obj, (m0.m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m7054(Object obj) {
        if (C0369.m7254() >= 0) {
            return ((d5.p0) obj).f4718e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤۡ, reason: not valid java name and contains not printable characters */
    public static g2.b0 m7055(Object obj) {
        if (C0327.m6319() <= 0) {
            return ((f0.x) obj).f5990b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۧ, reason: contains not printable characters */
    public static i1.f m7057() {
        if (C0276.m5315() < 0) {
            return o7.d0.G();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟۠, reason: contains not printable characters */
    public static String m7058() {
        if (C0361.m7097() < 0) {
            return "last_bundled_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢ۟, reason: contains not printable characters */
    public static int m7059() {
        return (-169) ^ C0322.f470;
    }

    /* JADX INFO: renamed from: ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7060(Object obj) {
        if (C0194.m3713() > 0) {
            return ((f0.z) obj).f6012a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m7061() {
        if (C0287.m5529() > 0) {
            return "Telugu";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۧ, reason: contains not printable characters */
    public static String m7056(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
