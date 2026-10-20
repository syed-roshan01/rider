package dagger.hilt.android.migration;

import java.io.ByteArrayOutputStream;
import r5.C0401;

/* JADX INFO: renamed from: dagger.hilt.android.migration.۟ۢۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0239 {

    /* JADX INFO: renamed from: ۨۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int f318 = -775;

    /* JADX INFO: renamed from: ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4585(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4586(String str) {
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

    /* JADX INFO: renamed from: ۢۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4587() {
        return (-507) ^ C0401.f671;
    }

    /* JADX INFO: renamed from: ۤۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4588(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
