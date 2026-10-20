package androidx.compose.ui.draw;

import a2.p;
import android.content.Context;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0022;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.p0;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zznk;
import com.google.gson.internal.bind.C0207;
import dagger.hilt.android.components.C0228;
import e1.l0;
import f0.d2;
import f0.x;
import f4.y;
import g2.C0287;
import g5.C0290;
import g9.C0294;
import h0.v0;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import k0.n;
import k6.d4;
import m0.g1;
import m0.m;
import n.C0361;
import n8.C0365;
import p9.z;
import u3.C0434;
import y0.o;
import z.C0481;

/* JADX INFO: renamed from: androidx.compose.ui.draw.ۧۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0029 {

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f49 = -481;

    /* JADX INFO: renamed from: ۟۟۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m559(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m560(Object obj, long j10, boolean z10) {
        if (C0434.m8498() < 0) {
            return ((d2) obj).b(j10, z10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m561(Object obj) {
        if (C0026.m508() >= 0) {
            return ((p) obj).f957a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m562() {
        if (C0287.m5529() > 0) {
            return zznk.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m563() {
        if (C0294.m5663() > 0) {
            return "Install Shizuku App (Play Store)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m564(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static z m566(Object obj) {
        if (C0022.m444() <= 0) {
            return ((MainViewModel) obj).f3098k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m567(Object obj, int i10, Object obj2) {
        if (C0228.m4402() > 0) {
            return a7.a.q((String) obj, i10, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m568() {
        return 771 ^ C0365.f636;
    }

    /* JADX INFO: renamed from: ۢۧۢۡ, reason: not valid java name and contains not printable characters */
    public static v0 m569(Object obj) {
        if (C0207.m3957() >= 0) {
            return ((x) obj).f5996o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static g1 m570(Object obj) {
        if (C0361.m7097() < 0) {
            return ((d5.g1) obj).f4527x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static void m571(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, long j10, long j11, long j12, long j13, float f10, Object obj9, Object obj10, int i10, int i11, int i12) {
        if (C0305.m5904() > 0) {
            n.a((c9.a) obj, (e) obj2, (o) obj3, (e) obj4, (e) obj5, (e) obj6, (e) obj7, (l0) obj8, j10, j11, j12, j13, f10, (o2.o) obj9, (m) obj10, i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static d4 m572(Object obj) {
        if (C0481.m9373() < 0) {
            return ((y) obj).zzj();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡ, reason: contains not printable characters */
    public static String m573(Object obj) {
        if (C0022.m444() < 0) {
            return ((zzfc.zzb) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡۧ, reason: not valid java name and contains not printable characters */
    public static p0 m574(Object obj) {
        if (C0290.m5589() < 0) {
            return l.a((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static String m565(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
