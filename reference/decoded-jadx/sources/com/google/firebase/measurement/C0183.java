package com.google.firebase.measurement;

import a0.C0003;
import a2.c0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c0.C0056;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.iid.C0170;
import com.google.gson.internal.bind.C0207;
import d5.r;
import d5.w;
import d5.w0;
import e1.C0258;
import f0.c2;
import f0.v;
import f2.k;
import f5.o;
import java.io.ByteArrayOutputStream;
import k6.t4;
import k6.x;
import k6.x3;
import m0.C0349;
import m0.d1;
import m0.l3;
import m1.C0350;
import m7.C0357;
import p0.C0374;
import p9.z;
import q.f;
import r7.C0404;
import s7.C0415;
import u0.b;
import u7.C0437;
import w5.C0463;
import w9.C0465;
import y3.e;
import y6.C0477;

/* JADX INFO: renamed from: com.google.firebase.measurement.ۧۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0183 {

    /* JADX INFO: renamed from: ۟ۧۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int f207 = -888;

    /* JADX INFO: renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static v m3493(Object obj) {
        if (C0207.m3957() > 0) {
            return ((c2) obj).f5656u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۤ, reason: not valid java name and contains not printable characters */
    public static zzew.zzd.zzb m3494(Object obj) {
        if (C0003.m70() >= 0) {
            return ((zzew.zzd) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m3495(Object obj, Object obj2) {
        if (C0357.m7001() <= 0) {
            return ((f) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۥ, reason: not valid java name and contains not printable characters */
    public static c0 m3497() {
        if (C0104.m2034() <= 0) {
            return l0.v.f11191a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۡ, reason: not valid java name and contains not printable characters */
    public static x3 m3498() {
        if (C0207.m3957() >= 0) {
            return x.O0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3499(Object obj) {
        if (C0477.m9312() <= 0) {
            return ((k) obj).f6113a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3500(Object obj) {
        if (C0258.m4939() < 0) {
            return ((zzfp.zza) obj).zza();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Cursor m3501(Object obj, Object obj2, Object obj3) {
        if (C0465.m9068() < 0) {
            return ((SQLiteDatabase) obj).rawQuery((String) obj2, (String[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3502() {
        if (C0374.m7350() < 0) {
            return e.f16895b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠۟, reason: not valid java name and contains not printable characters */
    public static f m3503(Object obj) {
        if (C0415.m8144() >= 0) {
            return ((t4) obj).f10388l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۢ, reason: not valid java name and contains not printable characters */
    public static int m3504(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۨۦۦ, reason: not valid java name and contains not printable characters */
    public static z m3505(Object obj) {
        if (C0349.m6838() <= 0) {
            return ((MainViewModel) obj).J0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۟ۦ, reason: contains not printable characters */
    public static String m3506(String str) {
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

    /* JADX INFO: renamed from: ۦ۠۠ۢ, reason: contains not printable characters */
    public static l3 m3507(Object obj) {
        if (C0056.m1077() < 0) {
            return ((w0) obj).f4823f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static b m3508() {
        if (C0437.m8543() >= 0) {
            return r.f4748f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static d1 m3509(Object obj) {
        if (C0170.m3247() <= 0) {
            return ((w) obj).f4816e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3510() {
        return (-122) ^ C0350.f621;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static MainViewModel m3511(Object obj) {
        if (C0463.m9033() >= 0) {
            return ((o) obj).f6307d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۦۤ, reason: not valid java name and contains not printable characters */
    public static int m3512(Object obj) {
        if (C0404.m7934() > 0) {
            return ((AppConfig) obj).getPlanPrice1Day();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3496(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
