package com.google.protobuf;

import a.C0002;
import android.accounts.AccountManagerFuture;
import android.os.PowerManager;
import androidx.compose.foundation.text.modifiers.C0025;
import b8.C0055;
import com.auto.accept.data.model.TransactionData;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.firestore.model.C0160;
import e1.C0260;
import g2.C0288;
import java.io.ByteArrayOutputStream;
import java.util.BitSet;
import k6.f6;
import k6.y5;
import l6.C0345;
import m0.C0350;
import m0.l3;
import q6.C0387;
import t0.C0419;

/* JADX INFO: renamed from: com.google.protobuf.ۧ۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0209 {

    /* JADX INFO: renamed from: ۠ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f233 = 222;

    /* JADX INFO: renamed from: ۟۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m4006(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4007(Object obj, int i10) {
        if (C0025.m495() >= 0) {
            return ((BitSet) obj).get(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static l3 m4008(Object obj) {
        if (C0419.m8221() >= 0) {
            return ((d5.w0) obj).f4828r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4009() {
        if (C0075.m1631() < 0) {
            return "Open Shizuku App (Start Service)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m4010(Object obj) {
        if (C0350.m6838() <= 0) {
            return ((AccountManagerFuture) obj).getResult();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static PowerManager.WakeLock m4011(Object obj, int i10, Object obj2) {
        if (C0288.m5529() >= 0) {
            return ((PowerManager) obj).newWakeLock(i10, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static long m4012(Object obj) {
        if (C0002.m46() < 0) {
            return ((zzfi.zzn) obj).zzd();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4013() {
        return (-312) ^ C0387.f657;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m4015(Object obj) {
        if (C0160.m3070() <= 0) {
            return ((y3.j) obj).f16911a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۢۧ, reason: contains not printable characters */
    public static String m4016(Object obj) {
        if (C0345.m6746() >= 0) {
            return ((TransactionData) obj).getStatus();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m4017() {
        if (C0260.m4959() <= 0) {
            return "trigger_uris";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static String m4018(String str) {
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

    /* JADX INFO: renamed from: ۨۦۥۢ, reason: not valid java name and contains not printable characters */
    public static f6 m4019(Object obj) {
        if (C0055.m1056() > 0) {
            return ((y5) obj).f10581p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m4014(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
