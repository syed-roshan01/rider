package dagger.hilt.internal.componenttreedeps;

import android.app.Notification;
import android.app.job.JobInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.auto.accept.data.model.AppConfig;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.iid.C0171;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.components.C0244;
import e0.C0256;
import f0.c2;
import f0.v;
import f5.z;
import ga.C0295;
import i9.g;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import k0.f2;
import k0.p1;
import k2.C0333;
import k6.o4;
import k6.z3;
import l9.C0347;
import l9.i;
import m4.C0353;
import n7.C0363;
import q2.x;
import q6.C0386;
import q6.C0387;
import r7.C0404;
import v0.C0440;
import x5.C0470;

/* JADX INFO: renamed from: dagger.hilt.internal.componenttreedeps.۟ۡۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0248 {

    /* JADX INFO: renamed from: ۦ۠ۤ۟, reason: contains not printable characters */
    public static int f328 = 61;

    /* JADX INFO: renamed from: ۣ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static Notification m4749(Object obj) {
        if (C0333.m6472() < 0) {
            return ((x) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4750(Object obj) {
        if (C0470.m9151() >= 0) {
            return ((AppConfig) obj).getChangelog();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4751(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m4752() {
        if (C0363.m7127() <= 0) {
            return "ta";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4753(Object obj, Object obj2) {
        if (C0171.m3272() < 0) {
            return i.i1((CharSequence) obj, (g) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m4754() {
        if (C0244.m4685() >= 0) {
            return "select count(1) > 0 from raw_events";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static List m4756(Object obj) {
        if (C0353.m6940() < 0) {
            return ((f2) obj).f8922f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static v m4757(Object obj) {
        if (C0386.m7564() >= 0) {
            return ((c2) obj).f5655t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static JobInfo.Builder m4758(Object obj, Object obj2) {
        if (C0404.m7934() > 0) {
            return ((JobInfo.Builder) obj).setExtras((PersistableBundle) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4759(String str) {
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

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static void m4760(Object obj, int i10, boolean z10) {
        if (C0440.m8597() >= 0) {
            ((BitSet) obj).set(i10, z10);
        }
    }

    /* JADX INFO: renamed from: ۦ۟۟ۨ, reason: contains not printable characters */
    public static int m4761(Object obj) {
        if (C0231.m4453() < 0) {
            return ((p1) obj).E;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4762() {
        return (-281) ^ C0138.f164;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4763(Object obj, Object obj2) {
        if (C0387.m7585() > 0) {
            return ((Parcel) obj).createTypedArrayList((Parcelable.Creator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4764(Object obj) {
        if (C0256.m4901() < 0) {
            return ((z3) obj).f10602n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4765(Object obj) {
        if (C0347.m6808() <= 0) {
            ((o4) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۨۧۥۧ, reason: not valid java name and contains not printable characters */
    public static MainViewModel m4766(Object obj) {
        if (C0295.m5679() >= 0) {
            return ((z) obj).f6344b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4755(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
