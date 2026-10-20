package u4;

import a2.i;
import a2.k;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.input.key.C0033;
import b7.C0054;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.firestore.model.C0160;
import d5.g;
import f0.C0273;
import f0.i1;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import k0.h3;
import k0.x2;
import k6.l4;
import o4.C0370;
import s3.C0413;
import t2.C0424;
import v5.C0446;

/* JADX INFO: renamed from: u4.ۧۦۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0437 {

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int f707 = -281;

    /* JADX INFO: renamed from: ۟۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static k m8521(Object obj) {
        if (C0160.m3070() <= 0) {
            return ((i) obj).f932a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m8523(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static int m8524() {
        return (-793) ^ C0025.f45;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۢ, reason: not valid java name and contains not printable characters */
    public static x2 m8525(Object obj) {
        if (C0329.m6350() > 0) {
            return ((h3) obj).f8981b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m8526(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static zzfc.zzd.zza m8527(Object obj) {
        if (C0054.m1047() > 0) {
            return ((zzfc.zzd.zza) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8528(Object obj, int i10) {
        if (C0273.m5249() < 0) {
            return ((AccessibilityNodeInfo) obj).performAction(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8529(Object obj) {
        if (C0413.m8089() < 0) {
            return ((l4) obj).f10175h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۥۤ, reason: not valid java name and contains not printable characters */
    public static long m8530() {
        if (C0370.m7254() > 0) {
            return i1.f5763i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8531(Object obj) {
        if (C0446.m8692() <= 0) {
            return ((g) obj).f4502o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8532(Object obj, int i10, Object obj2, Object obj3, boolean z10) {
        if (C0424.m8307() >= 0) {
            ((MainViewModel) obj).v(i10, (String) obj2, (String) obj3, z10);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m8533() {
        if (C0033.m652() < 0) {
            return "event_name";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m8522(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
