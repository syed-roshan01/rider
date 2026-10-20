package r4;

import a.C0001;
import a8.C0010;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.C0016;
import android.widget.TextView;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.semantics.C0039;
import androidx.lifecycle.C0043;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.firebase.C0205;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.model.C0159;
import com.google.firebase.messaging.C0192;
import com.google.protobuf.h2;
import com.google.protobuf.n;
import d5.b0;
import d5.w0;
import dagger.hilt.android.internal.migration.C0233;
import f.C0271;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import k0.i4;
import k0.p1;
import k0.r;
import k0.t3;
import k0.y4;
import k6.f5;
import k6.s6;
import k6.z3;
import l8.C0346;
import m0.l3;
import m0.m;
import m7.C0357;
import p9.z;
import q6.C0388;
import s7.C0415;
import s8.C0418;
import x2.C0468;
import x7.C0473;
import z3.C0488;

/* JADX INFO: renamed from: r4.۟ۦۦ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0399 {

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f669 = 662;

    /* JADX INFO: renamed from: ۟۠ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m7785(Object obj, Object obj2) {
        if (C0488.m9496() < 0) {
            return ((Parcelable.Creator) obj).createFromParcel((Parcel) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7786(Object obj) {
        if (C0159.m3030() < 0) {
            return ((zzfi.zzj) obj).zzbr();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m7787(Object obj, Object obj2) {
        if (C0233.m4482() > 0) {
            return ((BigDecimal) obj).multiply((BigDecimal) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static float m7788() {
        if (C0415.m8130() < 0) {
            return l0.i.f11064a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m7789(Object obj, Object obj2, int i10) {
        if (C0074.m1607() < 0) {
            ((r) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7790(String str) {
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

    /* JADX INFO: renamed from: ۟ۦ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static c9.e m7791(Object obj) {
        if (C0142.m2725() >= 0) {
            return ((i4) obj).f9044c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static String m7792(Object obj) {
        if (C0205.m3914() > 0) {
            return ((p1) obj).f9334a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7793(Object obj) {
        if (C0473.m9193() < 0) {
            ((s6) obj).A();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7794(Object obj) {
        if (C0346.m6759() <= 0) {
            return ((zzfi.zzb) obj).zzd();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7795(Object obj) {
        if (C0027.m541() > 0) {
            return ((t3) obj).f9489b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static Charset m7796() {
        if (C0388.m7585() >= 0) {
            return f0.f3534a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7797() {
        return 441 ^ C0468.f738;
    }

    /* JADX INFO: renamed from: ۠ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m7798() {
        if (C0010.m199() >= 0) {
            return "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static z m7800(Object obj) {
        if (C0271.m5170() < 0) {
            return ((MainViewModel) obj).f3109p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m7801(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7802(Object obj, int i10) {
        if (C0357.m6984() >= 0) {
            ((TextView) obj).setGravity(i10);
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static l3 m7803(Object obj) {
        if (C0111.m2143() >= 0) {
            return ((w0) obj).f4826p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟۟, reason: contains not printable characters */
    public static z3 m7804(Object obj) {
        if (C0192.m3659() > 0) {
            return ((f5) obj).f10046w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۤۢ, reason: contains not printable characters */
    public static int m7805(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0001.m35() < 0) {
            return ((SQLiteDatabase) obj).update((String) obj2, (ContentValues) obj3, (String) obj4, (String[]) obj5);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۢ, reason: contains not printable characters */
    public static n m7806(Object obj) {
        if (C0016.m315() > 0) {
            return ((h2) obj).f4124e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۢ, reason: contains not printable characters */
    public static Set m7807(Object obj) {
        if (C0039.m764() > 0) {
            return ((TreeMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7808() {
        if (C0010.m199() >= 0) {
            return zzqe.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m7809(Object obj) {
        if (C0043.m833() >= 0) {
            return ((y4) obj).f9680f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7810(Object obj, Object obj2) {
        if (C0418.m8208() >= 0) {
            ((EnumMap) obj).putAll((Map) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static c9.a m7811(Object obj) {
        if (C0039.m764() > 0) {
            return ((b0) obj).f4412o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۦ, reason: not valid java name and contains not printable characters */
    public static String m7799(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
