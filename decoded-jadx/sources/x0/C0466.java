package x0;

import android.support.v4.app.C0015;
import androidx.compose.foundation.relocation.C0024;
import com.auto.accept.data.model.C0071;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.installations.local.C0176;
import com.google.protobuf.C0209;
import d1.C0213;
import d9.C0222;
import dagger.hilt.C0255;
import e7.C0264;
import f0.t0;
import f1.C0273;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.v;
import k6.b8;
import k6.k;
import k6.p7;
import p3.C0375;
import p9.z;
import q2.x;
import rikka.shizuku.C0406;
import t9.C0427;
import y.g;
import y3.e;

/* JADX INFO: renamed from: x0.ۣ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0466 {

    /* JADX INFO: renamed from: ۟۠ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f737 = 340;

    /* JADX INFO: renamed from: ۟۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static SupportedApp m9078(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        if (C0222.m4279() < 0) {
            return ((SupportedApp) obj).copy((String) obj2, (List) obj3, (List) obj4, z10, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static g m9079(Object obj) {
        if (C0209.m4013() > 0) {
            return ((v) obj).f9540b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m9080() {
        if (C0015.m294() < 0) {
            return e.f16896c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static z m9081(Object obj) {
        if (C0255.m4876() < 0) {
            return ((MainViewModel) obj).f3126y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m9082(Object obj) {
        if (C0176.m3367() < 0) {
            return ((Throwable) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m9083(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m9084(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m9085() {
        if (C0264.m5062() <= 0) {
            return "Punjabi";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m9086() {
        return (-821) ^ C0071.f98;
    }

    /* JADX INFO: renamed from: ۟ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static k m9087(Object obj) {
        if (C0375.m7362() > 0) {
            return ((p7) obj).J();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9088(Object obj) {
        if (C0024.m487() > 0) {
            return x.b((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥ۠, reason: not valid java name and contains not printable characters */
    public static zzfi.zzj.zza m9089(Object obj, Object obj2) {
        if (C0406.m7977() < 0) {
            return ((zzfi.zzj.zza) obj).zza((zzfi.zzn) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m9090() {
        if (C0427.m8371() < 0) {
            return b8.f9922b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۥۧ, reason: not valid java name and contains not printable characters */
    public static t0 m9091() {
        if (C0273.m5273() <= 0) {
            return t0.X;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9092(Object obj, Object obj2, int i10, int i11) {
        if (C0213.m4083() < 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2, i10, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m9093(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
