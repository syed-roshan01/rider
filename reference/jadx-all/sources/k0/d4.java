package k0;

import a.C0001;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.semantics.C0039;
import c6.C0067;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0214;
import d7.C0221;
import d9.C0227;
import dagger.hilt.android.migration.C0239;
import e1.C0259;
import k4.C0337;
import la.C0349;
import r5.C0400;
import v0.C0441;
import w4.C0461;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class d4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f490short = {2780, 2793, 2794, 2776, 2791, 2811, 2785, 2812, 2785, 2791, 2790, 2720, 2788, 2797, 2798, 2812, 2741, 1569, 1581, 1663, 1636, 1642, 1637, 1657, 1584, 938, 934, 1009, 1007, 994, 1010, 1006, 955, 2256, 2268, 2207, 2195, 2194, 2184, 2201, 2194, 2184, 2219, 2197, 2200, 2184, 2196, 2241};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8838c;

    public d4(float f10, float f11, float f12) {
        this.f8836a = f10;
        this.f8837b = f11;
        this.f8838c = f12;
        int iM764 = C0039.m764();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM764 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0259.m4931("PTBXrIHfDHbwUDRBAlw")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6420() {
        int iM315 = C0016.m315();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM315 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f490short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    boolean z10 = obj instanceof d4;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                d4 d4Var = (d4) obj;
                                boolean zM7816 = C0400.m7816(C0472.m9174(this), C0472.m9174(d4Var));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM7816) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM7817 = C0400.m7816(C0067.m1295(this), C0067.m1295(d4Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM7818 = C0400.m7816(C0129.m2500(this), C0129.m2500(d4Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return true;
                                                                case 503:
                                                                    if (!zM7818) {
                                                                        i14 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i14 = 48953;
                                                        }
                                                        break;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (!zM7817) {
                                                            i13 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i13 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return false;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int hashCode() {
        float fM2500 = 0.0f;
        String str = "۠ۡ۟";
        int iM3629 = 0;
        int i10 = 0;
        int iM3231 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746757:
                    iM3629 = C0190.m3629(fM2500, iM3231, i10);
                    str = "ۦۦۧ";
                    break;
                case 1746943:
                    str = "ۢۨۧ";
                    i10 = iM3231 ^ 856;
                    break;
                case 1747710:
                    str = "۠ۡۨ";
                    fM2500 = C0472.m9174(this);
                    break;
                case 1747719:
                    iM3629 = C0169.m3231(fM2500);
                    str = "ۦۧ";
                    break;
                case 1749672:
                    str = "ۤۧۧ";
                    i10 = iM3231 - 15;
                    break;
                case 1749857:
                    str = "ۦۣۧ";
                    iM3231 = iM3629 * i10;
                    break;
                case 1751748:
                    str = "ۥۡۡ";
                    iM3231 = i10 + iM3629;
                    break;
                case 1752517:
                    str = "ۦۧۥ";
                    i10 = iM3231 + 15;
                    break;
                case 1752639:
                    str = "ۢۢۨ";
                    iM3231 = C0169.m3231(fM2500);
                    break;
                case 1753546:
                    str = "۟ۡۧ";
                    fM2500 = C0067.m1295(this);
                    break;
                case 1753639:
                    str = "ۥۥ۟";
                    fM2500 = C0129.m2500(this);
                    break;
                case 1753668:
                    return i10;
                default:
                    str = "۟ۧۧ";
                    iM3231 = C0227.f306;
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۥ۠";
        StringBuilder sb = null;
        short[] sArrM6420 = null;
        String strM2908 = null;
        int i10 = 0;
        int i11 = 0;
        float fM1295 = 0.0f;
        float fM2500 = 0.0f;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56382:
                    C0142.m2728(sb, strM2908);
                    str = "ۢۤۥ";
                    fM2500 = C0129.m2500(this);
                    break;
                case 56475:
                    short[] sArrM6421 = m6420();
                    i11 = C0079.f113;
                    str = "ۡۤ۟";
                    sArrM6420 = sArrM6421;
                    break;
                case 1746695:
                    i11 = C0239.f318;
                    i10 = i11 ^ (-783);
                    str = "ۧ۟۠";
                    break;
                case 1746721:
                    String strM8965 = C0461.m8965(fM2500);
                    C0214.m4074(sb, strM8965);
                    str = "۟ۨۥ";
                    strM2908 = strM8965;
                    break;
                case 1746816:
                    i10 = i11 ^ (-844);
                    str = "ۢ۠";
                    strM2908 = C0349.m6825(sArrM6420, 33, i10, 2300);
                    break;
                case 1746845:
                    String strM8966 = C0461.m8965(fM1295);
                    C0214.m4074(sb, strM8966);
                    str = "۠ۧۤ";
                    strM2908 = strM8966;
                    break;
                case 1746972:
                    short[] sArrM6422 = m6420();
                    i11 = C0221.f300;
                    str = "ۣۤ";
                    sArrM6420 = sArrM6422;
                    break;
                case 1747901:
                    short[] sArrM6423 = m6420();
                    i11 = C0337.f520;
                    str = "ۣ۟ۤ";
                    sArrM6420 = sArrM6423;
                    break;
                case 1747931:
                    str = "ۥۨۢ";
                    fM2500 = fM2500 + 25.0f + fM1295;
                    break;
                case 1748764:
                    i10 = i11 ^ (-571);
                    str = "ۣۣۤ";
                    strM2908 = C0023.m452(sArrM6420, 0, i10, 2696);
                    break;
                case 1749578:
                    C0214.m4074(sb, strM2908);
                    str = "۟۟ۧ";
                    sArrM6420 = m6420();
                    break;
                case 1749702:
                    return strM2908;
                case 1749731:
                    String strM8967 = C0461.m8965(fM2500);
                    C0214.m4074(sb, strM8967);
                    str = "ۧ۟ۧ";
                    strM2908 = strM8967;
                    break;
                case 1750690:
                    sb = new StringBuilder(strM2908);
                    str = "۟۠ۢ";
                    fM2500 = C0472.m9174(this);
                    break;
                case 1751779:
                    C0142.m2728(sb, strM2908);
                    fM1295 = C0067.m1295(this);
                    str = "ۣ۠ۨ";
                    break;
                case 1752735:
                    str = "ۢ۟ۧ";
                    strM2908 = C0461.m8965(fM2500 - 25.0f);
                    break;
                case 1754376:
                    String strM32 = C0001.m32(sArrM6420, 25, i10, 902);
                    C0142.m2728(sb, strM32);
                    str = "۟ۤۢ";
                    strM2908 = strM32;
                    break;
                case 1754383:
                    C0175.m3331(sb, ')');
                    str = "ۣۢۧ";
                    strM2908 = C0441.m8605(sb);
                    break;
                default:
                    i10 = i11 ^ (-117);
                    str = "ۤۨۧ";
                    strM2908 = C0151.m2908(sArrM6420, 17, i10, 1549);
                    break;
            }
        }
    }
}
