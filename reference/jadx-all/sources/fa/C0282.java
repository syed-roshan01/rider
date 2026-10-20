package fa;

import a5.x;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.iid.C0171;
import dagger.hilt.android.internal.modules.C0234;
import g8.C0294;
import h0.C0300;
import java.io.ByteArrayOutputStream;
import q.r;

/* JADX INFO: renamed from: fa.ۦۣۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0282 {

    /* JADX INFO: renamed from: ۟ۢ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f426 = 809;

    /* JADX INFO: renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m5436(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5437(Object obj, Object obj2) {
        if (C0160.m3070() <= 0) {
            return ((r) obj).c(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m5438(Object obj) {
        if (C0234.m4495() <= 0) {
            f6.a.u((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۧ, reason: not valid java name and contains not printable characters */
    public static String m5439(String str) {
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

    /* JADX INFO: renamed from: ۣ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m5441() {
        if (C0171.m3272() < 0) {
            return "npa_metadata_value";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m5442(Object obj) {
        if (C0300.m5752() < 0) {
            return ((x) obj).f1320c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m5443() {
        return 400 ^ C0294.f441;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۨ, reason: not valid java name and contains not printable characters */
    public static String m5440(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
