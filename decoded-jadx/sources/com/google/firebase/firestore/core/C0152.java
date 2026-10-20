package com.google.firebase.firestore.core;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.p;
import androidx.preference.C0044;
import b4.C0052;
import b7.C0053;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.provider.C0194;
import dagger.hilt.android.components.C0227;
import ea.C0267;
import f5.v;
import h4.C0305;
import j2.C0324;
import java.io.ByteArrayOutputStream;
import k0.h0;
import k0.w4;
import k6.d4;
import k6.f4;
import k6.s;
import k6.y5;
import k7.C0337;
import m0.z1;
import p9.z;
import r1.x0;
import s3.C0412;
import s8.C0417;
import t3.C0424;
import u.C0428;
import v.C0439;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.۟ۥۣ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0152 {

    /* JADX INFO: renamed from: ۤۢۧۢ, reason: not valid java name and contains not printable characters */
    public static int f177 = 354;

    /* JADX INFO: renamed from: ۟۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2912(Object obj, float f10) {
        if (C0417.m8208() >= 0) {
            return ((m2.b) obj).J(f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2913(Object obj, Object obj2) {
        if (C0305.m5904() >= 0) {
            ((TextView) obj).setTypeface((Typeface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m2914(Object obj) {
        if (C0428.m8409() <= 0) {
            return ((v) obj).f6334b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static ContentResolver m2915(Object obj) {
        if (C0424.m8322() >= 0) {
            return ((Context) obj).getContentResolver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Bundle m2916(Object obj) {
        if (C0053.m1029() <= 0) {
            return ((s) obj).f10349a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static z m2917(Object obj) {
        if (C0052.m1013() > 0) {
            return ((z4.d) obj).f17216q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static long m2918(Object obj, Object obj2, long j10) {
        if (C0324.m6278() <= 0) {
            return ((BaseBundle) obj).getLong((String) obj2, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۢ, reason: not valid java name and contains not printable characters */
    public static z1 m2919(Object obj) {
        if (C0439.m8582() < 0) {
            return v5.a.a((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۨ, reason: not valid java name and contains not printable characters */
    public static f4 m2921(Object obj) {
        if (C0130.m2511() > 0) {
            return ((d4) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2922(Object obj, Object obj2, Object obj3) {
        if (C0337.m6638() <= 0) {
            ((p) obj).setContentView((android.view.View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m2923(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢۦۨ, reason: not valid java name and contains not printable characters */
    public static float m2924(Object obj) {
        if (C0044.m860() >= 0) {
            return ((m2.e) obj).f11798a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2925(int i10) {
        if (C0125.m2408() >= 0) {
            return Integer.toHexString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static m2.b m2926(Object obj) {
        if (C0194.m3713() > 0) {
            return ((f0.s) obj).f5889o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m2927() {
        if (C0227.m4380() > 0) {
            return l0.c.f11013e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۦ۠۠, reason: contains not printable characters */
    public static x0 m2928(Object obj) {
        if (C0412.m8089() <= 0) {
            return ((w4) obj).f9625n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۟ۢ, reason: contains not printable characters */
    public static float m2929(Object obj) {
        if (C0267.m5113() < 0) {
            return ((h0) obj).f8963a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۨۢۨ, reason: contains not printable characters */
    public static int m2930(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m2931() {
        return (-870) ^ C0189.f213;
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2932(Object obj) {
        if (C0163.m3132() > 0) {
            return ((y5) obj).f10580o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2920(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
