package a;

import a2.c0;
import a3.C0006;
import android.content.res.AssetFileDescriptor;
import androidx.activity.s;
import androidx.compose.foundation.relocation.C0024;
import androidx.startup.C0047;
import b7.C0053;
import com.auto.accept.ui.viewmodel.C0073;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.firebase.components.C0134;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.ktx.C0186;
import d5.C0218;
import d5.i0;
import dagger.hilt.codegen.C0241;
import ea.C0268;
import ga.C0295;
import h.C0298;
import h7.C0310;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import k0.c2;
import k0.x0;
import k6.u7;
import k6.z4;
import l.t;
import l0.u;
import l8.C0345;
import m2.l;
import t.w1;
import t2.C0421;

/* JADX INFO: renamed from: a.ۥۦۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0001 {

    /* JADX INFO: renamed from: ۟۠ۤۡۥ, reason: collision with root package name */
    public static int f769 = -978;

    /* JADX INFO: renamed from: ۟۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static long m25(Object obj) {
        if (C0186.m3548() <= 0) {
            return ((c2) obj).f8789b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static PriorityBlockingQueue m26(Object obj) {
        if (C0345.m6759() < 0) {
            return ((z4) obj).f10608e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int m27(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m28(Object obj) {
        if (C0134.m2587() <= 0) {
            return ((RemoteMessage.Notification) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ۟, reason: not valid java name and contains not printable characters */
    public static AtomicLong m29(Object obj) {
        if (C0298.m5742() >= 0) {
            return ((u7) obj).f10426d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m30(Object obj) {
        if (C0421.m8278() <= 0) {
            return ((t) obj).f10929c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m31(Object obj) {
        if (C0024.m487() >= 0) {
            return ((i0) obj).f4568n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static w1 m33() {
        if (C0310.m5997() >= 0) {
            return x0.f9636b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m34(Object obj, int i10) {
        if (C0053.m1029() <= 0) {
            return ((k0) obj).c(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m35() {
        return 249 ^ C0073.f107;
    }

    /* JADX INFO: renamed from: ۡۧۥۤ, reason: not valid java name and contains not printable characters */
    public static int m36() {
        if (C0241.m4629() < 0) {
            return s.f1422a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static l[] m37() {
        if (C0218.m4224() < 0) {
            return l.values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m38(String str) {
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

    /* JADX INFO: renamed from: ۥۣۢۤ, reason: contains not printable characters */
    public static MainViewModel m39(Object obj) {
        if (C0047.m904() < 0) {
            return ((i0) obj).f4562a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۢۧ, reason: contains not printable characters */
    public static c0 m40() {
        if (C0006.m112() <= 0) {
            return u.f11189n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟۟, reason: contains not printable characters */
    public static long m41() {
        if (C0268.m5123() > 0) {
            return e5.a.f5137m;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣۨ, reason: not valid java name and contains not printable characters */
    public static FileInputStream m42(Object obj) {
        if (C0295.m5679() > 0) {
            return ((AssetFileDescriptor) obj).createInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m32(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
