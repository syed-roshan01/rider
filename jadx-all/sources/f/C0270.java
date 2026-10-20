package f;

import a2.c0;
import android.app.Application;
import android.os.Parcel;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.node.C0037;
import androidx.startup.C0047;
import c9.c;
import c9.e;
import com.auto.accept.data.model.UserProfile;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.messaging.reporting.C0190;
import d5.C0219;
import d5.h0;
import d9.s;
import e9.C0267;
import i1.b;
import java.io.ByteArrayOutputStream;
import k0.c3;
import k0.d;
import k0.l1;
import k6.f6;
import k6.h5;
import k6.h7;
import k6.l4;
import k6.p4;
import k6.p7;
import k6.t5;
import l6.C0344;
import m0.m;
import m0.q;
import m0.q2;
import m9.e0;
import q5.C0386;
import q9.C0392;
import r5.C0401;
import s0.C0410;
import s8.C0418;
import v0.C0442;
import y0.o;

/* JADX INFO: renamed from: f.ۣ۟ۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0270 {

    /* JADX INFO: renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int f349 = -507;

    /* JADX INFO: renamed from: ۟۟ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String m5136(Object obj) {
        if (C0190.m3639() > 0) {
            return ((l1) obj).f9153b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String[] m5137() {
        if (C0035.m690() < 0) {
            return t5.f10398h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m5138(Object obj) {
        if (C0386.m7546() >= 0) {
            return ((s) obj).f4950a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5139(Object obj, Object obj2) {
        if (C0267.m5099() <= 0) {
            ((Application) obj).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m5140(Object obj) {
        if (C0079.m1701() >= 0) {
            return ((Parcel) obj).dataPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static long m5141(float f10, float f11) {
        if (C0392.m7657() >= 0) {
            return b.b(f10, f11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5142(String str) {
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

    /* JADX INFO: renamed from: ۠۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5143(Object obj) {
        if (C0219.m4224() < 0) {
            return ((c3) obj).f8798n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static f6 m5145(Object obj) {
        if (C0410.m8037() < 0) {
            return ((h7) obj).f10092c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5146(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۠۟ۨ, reason: contains not printable characters */
    public static void m5147(Object obj, Object obj2, Object obj3, Object obj4, int i10, boolean z10, int i11, int i12, Object obj5, int i13, int i14) {
        if (C0149.m2863() > 0) {
            e0.b((String) obj, (o) obj2, (c0) obj3, (c) obj4, i10, z10, i11, i12, (m) obj5, i13, i14);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۤۦ, reason: contains not printable characters */
    public static boolean m5148(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((q) obj).E();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۤ, reason: contains not printable characters */
    public static String m5149(Object obj) {
        if (C0073.m1597() > 0) {
            return ((UserProfile) obj).getEmail();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static h0 m5150() {
        if (C0401.m7847() < 0) {
            return h0.f4539b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static p7 m5151(Object obj) {
        if (C0344.m6738() < 0) {
            return ((h5) obj).f10081a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥ۠, reason: contains not printable characters */
    public static int m5152() {
        return 796 ^ C0418.f688;
    }

    /* JADX INFO: renamed from: ۨۥۧۧ, reason: not valid java name and contains not printable characters */
    public static void m5153(Object obj, int i10, int i11) {
        if (C0047.m904() < 0) {
            ((q2) obj).s(i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static p4 m5154(Object obj) {
        if (C0442.m8612() > 0) {
            return ((l4) obj).f10172e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۥ, reason: not valid java name and contains not printable characters */
    public static e m5155(Object obj) {
        if (C0037.m733() >= 0) {
            return ((d) obj).f8807a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۧ۠, reason: not valid java name and contains not printable characters */
    public static String m5144(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
