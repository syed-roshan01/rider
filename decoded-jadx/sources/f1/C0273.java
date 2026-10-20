package f1;

import a2.a0;
import android.app.job.JobInfo;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.graphics.C0030;
import androidx.lifecycle.w;
import c1.C0058;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.installations.ktx.C0175;
import d5.s0;
import d9.v;
import dagger.hilt.internal.C0252;
import e9.C0266;
import f0.s1;
import h0.C0299;
import h4.C0305;
import i5.C0318;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import k6.l7;
import k7.C0337;
import u.C0428;
import u4.C0435;
import w0.C0454;
import w2.C0458;

/* JADX INFO: renamed from: f1.ۥۦ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0273 {

    /* JADX INFO: renamed from: ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f389 = 420;

    /* JADX INFO: renamed from: ۟۠۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m5258(Object obj) {
        if (C0428.m8409() <= 0) {
            return ((s1) obj).f5898d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5260(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static JobInfo.Builder m5261(Object obj, long j10) {
        if (C0458.m8930() > 0) {
            return ((JobInfo.Builder) obj).setMinimumLatency(j10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m5262(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۟۠۟, reason: not valid java name and contains not printable characters */
    public static float m5263(Object obj) {
        if (C0299.m5752() <= 0) {
            return ((a0) obj).f896d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m5264() {
        if (C0058.m1106() >= 0) {
            return l0.c.f11032x;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۡ, reason: not valid java name and contains not printable characters */
    public static d9.e m5265(Object obj) {
        if (C0175.m3346() > 0) {
            return v.a((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5266(Object obj) {
        if (C0318.m6163() <= 0) {
            return ((z4.f) obj).f17233c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۨ, reason: not valid java name and contains not printable characters */
    public static l.t m5267(Object obj, Object obj2) {
        if (C0454.m8861() < 0) {
            return ((l7) obj).p((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5268(Object obj, Object obj2, Object obj3) {
        if (C0161.m3081() <= 0) {
            return ((t1.p) obj).compare(obj2, obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static Bundle m5269(Object obj) {
        if (C0123.m2379() > 0) {
            return ((Intent) obj).getExtras();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m5270(Object obj) {
        if (C0337.m6638() < 0) {
            return ((ArrayList) obj).toArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۦ, reason: not valid java name and contains not printable characters */
    public static int m5271(Object obj, int i10) {
        if (C0435.m8516() >= 0) {
            return Arrays.binarySearch((int[]) obj, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m5272(Object obj) {
        if (C0152.m2931() >= 0) {
            return ((HashMap) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m5273() {
        return 67 ^ C0026.f46;
    }

    /* JADX INFO: renamed from: ۤۥۧۦ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m5274(Object obj) {
        if (C0030.m575() > 0) {
            return ((AccessibilityRecord) obj).getSource();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۧ, reason: contains not printable characters */
    public static Object m5275(Object obj, Object obj2) {
        if (C0266.m5099() < 0) {
            return ((f0.j) obj).invoke(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠۟, reason: contains not printable characters */
    public static void m5276(Object obj, Object obj2) {
        if (C0024.m487() >= 0) {
            o1.s.i0((View) obj, (w) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5277(Object obj) {
        if (C0252.m4832() <= 0) {
            return ((ServiceInfo) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5278(Object obj) {
        if (C0127.m2448() >= 0) {
            return ((Rect) obj).bottom;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۨۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m5279(Object obj, Object obj2, Object obj3) {
        if (C0305.m5904() >= 0) {
            return ((s0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5259(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
