package aa;

import a.C0001;
import androidx.core.app.C0040;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.model.C0159;
import com.google.gson.internal.bind.C0207;
import d5.c0;
import d5.m;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.migration.C0240;
import f6.C0279;
import fa.C0280;
import g3.C0289;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.l2;
import k0.n1;
import k0.r;
import k3.C0335;
import k6.a5;
import k6.h5;
import k6.j6;
import k6.j7;
import k6.p2;
import k6.v6;
import n1.C0363;
import okhttp3.internal.publicsuffix.C0373;
import q6.C0387;
import q8.l;
import r8.p;
import u1.C0433;
import v6.C0447;

/* JADX INFO: renamed from: aa.۟ۦۣۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0012 {

    /* JADX INFO: renamed from: ۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static int f32 = 930;

    /* JADX INFO: renamed from: ۟۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m225(Object obj) {
        if (C0279.m5394() >= 0) {
            return ((v6) obj).f10441b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m226() {
        return (-916) ^ C0091.f125;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static List m227(Object obj) {
        if (C0280.m5406() <= 0) {
            return p.W0((Iterable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static c9.f m228(Object obj) {
        if (C0447.m8696() > 0) {
            return ((r) obj).f9416b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static p2 m229(Object obj) {
        if (C0040.m792() >= 0) {
            return ((j6) obj).f10131f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static List m230(Object obj, Object obj2, Object obj3, Object obj4, boolean z10) {
        if (C0207.m3957() > 0) {
            return ((h5) obj).i((String) obj2, (String) obj3, (String) obj4, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m231(String str) {
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

    /* JADX INFO: renamed from: ۟ۧ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static Integer m233(Object obj) {
        if (C0289.m5547() >= 0) {
            return ((j7) obj).f10134f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m234(Object obj) {
        if (C0001.m35() <= 0) {
            return ((c0) obj).f4432f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static long m235(Object obj) {
        if (C0387.m7564() >= 0) {
            return ((d1.c) obj).f4330a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۤۦۤ, reason: not valid java name and contains not printable characters */
    public static m m236() {
        if (C0159.m3030() < 0) {
            return m.C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static c9.e m237(Object obj) {
        if (C0140.m2699() > 0) {
            return ((n1) obj).f9260q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static l m238() {
        if (C0335.m6491() >= 0) {
            return l.f13235a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m239() {
        if (C0240.m4596() >= 0) {
            return "Failed to insert property filter (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۨ, reason: contains not printable characters */
    public static j8.a m240() {
        if (C0229.m4402() > 0) {
            return j8.a.PROTOCOL_ERROR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m241() {
        if (C0373.m7309() < 0) {
            return "Failed to insert/update app (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m242(Object obj) {
        if (C0433.m8470() >= 0) {
            return ((a5) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m243(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥۧۦ, reason: not valid java name and contains not printable characters */
    public static int m244(Object obj) {
        if (C0363.m7099() < 0) {
            return ((l2) obj).f9181r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m232(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
