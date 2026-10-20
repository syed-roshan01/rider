package d9;

import a2.c0;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.draw.C0027;
import androidx.startup.C0047;
import b3.C0051;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.platforminfo.C0193;
import d5.v0;
import e1.C0260;
import e8.C0266;
import f1.C0274;
import h.C0297;
import j3.C0326;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.c2;
import k0.l0;
import k1.C0333;
import k6.b4;
import k6.f5;
import k6.x;
import k6.x3;
import m0.g1;
import m0.l3;
import org.json.JSONObject;
import p9.z;
import s7.C0416;
import v7.C0450;
import y.C0475;
import y9.C0479;

/* JADX INFO: renamed from: d9.ۥۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0225 {

    /* JADX INFO: renamed from: ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int f304 = 850;

    /* JADX INFO: renamed from: ۟ۡۥۡۢ, reason: not valid java name and contains not printable characters */
    public static l0 m4309() {
        if (C0297.m5709() < 0) {
            return l0.f9146s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۧ, reason: not valid java name and contains not printable characters */
    public static int m4310(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static f0.j m4311() {
        if (C0450.m8755() >= 0) {
            return f0.j.f5790t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static z m4312(Object obj) {
        if (C0193.m3691() <= 0) {
            return ((MainViewModel) obj).W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۦ, reason: not valid java name and contains not printable characters */
    public static List m4313(int i10, Object obj, Object obj2, boolean z10) {
        if (C0260.m4959() < 0) {
            return l9.i.e1(i10, (CharSequence) obj, (String) obj2, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static b4 m4314(Object obj) {
        if (C0266.m5069() < 0) {
            return ((f5) obj).f10043t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m4315(Object obj, Object obj2) {
        if (C0274.m5273() < 0) {
            ((g1) obj).setValue(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int m4316() {
        return (-477) ^ C0475.f745;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4317() {
        if (C0051.m992() > 0) {
            return "raw_events_metadata";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static c0 m4318() {
        if (C0416.m8144() >= 0) {
            return l0.u.f11188m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m4319(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static x3 m4320() {
        if (C0027.m541() > 0) {
            return x.C0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static c0 m4321(Object obj) {
        if (C0047.m904() < 0) {
            return ((f0.t) obj).f5901b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4322(Object obj) {
        if (C0479.m9326() < 0) {
            return ((zzew.zzd) obj).zzg();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۤۤ, reason: not valid java name and contains not printable characters */
    public static long m4323(Object obj) {
        if (C0333.m6454() < 0) {
            return ((c2) obj).f8790c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۤۢ۟, reason: contains not printable characters */
    public static l3 m4324(Object obj) {
        if (C0185.m3538() >= 0) {
            return ((v0) obj).f4802f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۡ, reason: contains not printable characters */
    public static void m4325(Object obj, boolean z10) {
        if (C0475.m9246() <= 0) {
            ((e8.k) obj).setMessageCompression(z10);
        }
    }

    /* JADX INFO: renamed from: ۥۧۤۡ, reason: contains not printable characters */
    public static boolean m4326(Object obj, boolean z10) {
        if (C0326.m6295() > 0) {
            return ((m0.q) obj).h(z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4327(Object obj, Object obj2, Object obj3) {
        if (C0016.m315() >= 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4328(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
