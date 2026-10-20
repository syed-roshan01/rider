package z;

import aa.C0011;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.C0013;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.internal.C0168;
import d4.C0218;
import dagger.hilt.android.internal.modules.C0235;
import ea.C0268;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import k0.d5;
import k0.i4;
import k0.j4;
import k0.m1;
import k0.n1;
import k0.q3;
import k3.C0335;
import k6.n6;
import k6.x6;
import s0.C0410;
import x0.C0467;
import y.i1;

/* JADX INFO: renamed from: z.ۨۤۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0482 {

    /* JADX INFO: renamed from: ۡۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int f755 = -553;

    /* JADX INFO: renamed from: ۟۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static y0.o m9368(Object obj, float f10) {
        if (C0410.m8037() < 0) {
            return androidx.compose.foundation.layout.c.f((y0.o) obj, f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m9369(Object obj, Object obj2) {
        if (C0169.m3245() >= 0) {
            return ((ContentResolver) obj).openInputStream((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static float m9370(Object obj) {
        if (C0168.m3229() > 0) {
            return ((i2.d) obj).a();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m9371(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static d9.s m9372(Object obj) {
        if (C0011.m208() < 0) {
            return ((i4) obj).f9045d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m9373() {
        return (-790) ^ C0467.f737;
    }

    /* JADX INFO: renamed from: ۡۧۦۡ, reason: not valid java name and contains not printable characters */
    public static float m9375() {
        if (C0013.m253() >= 0) {
            return m1.f9204c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m9376(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۤۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m9377(Object obj) {
        if (C0235.m4512() >= 0) {
            return ((n6) obj).f10233e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡۢ, reason: contains not printable characters */
    public static c9.e m9378(Object obj) {
        if (C0111.m2143() > 0) {
            return ((n1) obj).f9258o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static long m9379(Object obj) {
        if (C0335.m6491() > 0) {
            return ((q3) obj).f9395b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static String m9380(Object obj) {
        if (C0029.m568() <= 0) {
            return ((x6) obj).f10537b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۨۡ, reason: not valid java name and contains not printable characters */
    public static void m9381(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10, int i11) {
        if (C0024.m487() > 0) {
            k0.x.a((y0.o) obj, (c9.e) obj2, (a2.c0) obj3, z10, (c9.e) obj4, (c9.f) obj5, (i1) obj6, (d5) obj7, (m0.m) obj8, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static int m9382(Object obj, Object obj2) {
        if (C0268.m5113() <= 0) {
            return ((MainViewModel) obj).l((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۧ۠, reason: not valid java name and contains not printable characters */
    public static c9.e m9383(Object obj) {
        if (C0218.m4144() >= 0) {
            return ((j4) obj).f9077b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۣ, reason: not valid java name and contains not printable characters */
    public static String m9374(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
