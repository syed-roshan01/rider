package a5;

import a.C0000;
import androidx.compose.foundation.C0026;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.semantics.C0039;
import androidx.fragment.app.C0042;
import b.C0049;
import b1.C0050;
import c3.C0062;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.C0209;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.processedrootsentinel.C0252;
import f4.C0275;
import h5.C0308;
import h8.C0314;
import i.C0316;
import m5.C0355;
import o1.C0368;
import o5.C0371;
import o7.i2;
import p3.C0376;
import r.C0393;
import t0.C0419;
import t1.C0420;
import t2.C0422;
import t8.C0427;
import u.C0430;
import v.C0440;
import v0.C0441;
import v9.C0453;
import w.C0454;
import w2.C0458;
import w2.C0459;
import y9.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f9short = {1406, 1379, 1397, 1396, 1379, 1368, 1397, 2162, 2165, 2144, 2165, 2164, 2162, 2907, 2892, 2892, 2897, 2892, 2931, 2907, 2893, 2893, 2911, 2905, 2907, 2541, 2526, 2505, 2514, 2525, 2514, 2520, 2522, 2511, 2514, 2516, 2517, 2537, 2526, 2504, 2510, 2519, 2511, 2451, 2504, 2510, 2520, 2520, 2526, 2504, 2504, 2438, 729, 725, 666, 647, 657, 656, 647, 700, 657, 712, 777, 773, 854, 849, 836, 849, 848, 854, 792, 3031, 3035, 2970, 2966, 2964, 2958, 2965, 2959, 3014, 1935, 1923, 1990, 2001, 2001, 1996, 2001, 2030, 1990, 2000, 2000, 1986, 1988, 1990, 1950, 845};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f1228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1229e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b0(String str, String str2, int i10) {
        String str3;
        String str4;
        String str5;
        int i11 = C0104.f130;
        String strM8581 = C0440.m8581();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = ((i11 ^ 785) & i10) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    str3 = strM8581;
                    break;
                case 239:
                    str3 = str;
                    break;
                default:
                    break;
            }
        }
        int i13 = C0231.f310;
        int i14 = 1740;
        while (true) {
            i14 ^= 1757;
            switch (i14) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i14 = ((i13 ^ (-777)) & i10) != 0 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    str4 = null;
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    int i15 = 1864;
                    while (true) {
                        i15 ^= 1881;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 48674;
                                continue;
                            case 47483:
                                str4 = strM8581;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i16 = C0237.f316;
        int i17 = 48767;
        while (true) {
            i17 ^= 48784;
            switch (i17) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    str5 = str2;
                    break;
                case 76:
                    int i18 = 48891;
                    while (true) {
                        i18 ^= 48908;
                        switch (i18) {
                            case 22:
                                str5 = strM8581;
                                break;
                            case 503:
                                i18 = 48922;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i17 = ((i16 ^ (-790)) & i10) != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        this(false, str3, str4, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, str5);
        int iM12 = C0000.m12();
        int i19 = 49666;
        while (true) {
            i19 ^= 49683;
            switch (i19) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM12 >= 0) {
                        i19 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    System.out.println(Long.decode(C0393.m7695("uk")));
                    return;
                case 83:
                    return;
                default:
                    continue;
            }
            i19 = 49728;
        }
    }

    public b0(boolean z10, String str, String str2, double d10, String str3) {
        C0376.m7360(str, C0419.m8230(m125(), 0, C0316.f463 ^ 517, 1297));
        C0376.m7360(str2, C0049.m957(m125(), 7, C0308.f455 ^ 170, 2049));
        C0376.m7360(str3, C0034.m660(m125(), 13, C0123.f149 ^ (-401), 2878));
        this.f1225a = z10;
        this.f1226b = str;
        this.f1227c = str2;
        this.f1228d = d10;
        this.f1229e = str3;
        int iM982 = C0050.m982();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM982 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0480.m9340("3M70SC8gsnqZwxhQEBhyG")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m125() {
        int iM8825 = C0453.m8825();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8825 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f9short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    boolean z10 = obj instanceof b0;
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!z10) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                b0 b0Var = (b0) obj;
                                boolean zM6067 = C0314.m6067(b0Var);
                                boolean zM6068 = C0314.m6067(this);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM6068 != zM6067) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zM4399 = C0229.m4399(C0042.m823(this), C0042.m823(b0Var));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43910 = C0229.m4399(C0128.m2480(this), C0128.m2480(b0Var));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    int iM2226 = C0115.m2226(C0252.m4814(this), C0252.m4814(b0Var));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (iM2226 != 0) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                boolean zM43911 = C0229.m4399(C0275.m5281(this), C0275.m5281(b0Var));
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            return true;
                                                                                        case 84:
                                                                                            return false;
                                                                                        case 241:
                                                                                            if (!zM43911) {
                                                                                                i16 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i16 = 49852;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i15 = 49728;
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (!zM43910) {
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
                                                        if (!zM4399) {
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
        String strM2480 = null;
        double dM4814 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String str = "ۦۢۡ";
        boolean zM6067 = false;
        int i10 = 0;
        int i11 = 0;
        int iM8923 = 0;
        int iM8418 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56386:
                    str = "ۤۥۣ";
                    i11 = 0 - iM8418;
                    break;
                case 1746786:
                    str = "ۣۦۣ";
                    iM8418 = i11 - iM8923;
                    break;
                case 1746969:
                    str = "۠۟ۧ";
                    iM8923 = iM8418 * i10;
                    break;
                case 1747656:
                    strM2480 = C0042.m823(this);
                    str = "ۢۦۢ";
                    break;
                case 1747717:
                    str = "ۧۥۧ";
                    iM8923 = C0459.m8923(strM2480, iM8418, i10);
                    break;
                case 1749790:
                    str = "ۡۧۡ";
                    iM8418 = C0459.m8923(strM2480, iM8923, i10);
                    break;
                case 1750568:
                    str = "۟ۢۥ";
                    i11 = 0 - iM8418;
                    break;
                case 1750694:
                    return i10;
                case 1750752:
                    str = "ۨۨۨ";
                    i11 = 0 - iM8418;
                    break;
                case 1751497:
                    str = "۟ۨۢ";
                    i10 = iM8923 ^ 193;
                    break;
                case 1751682:
                    str = "ۣۤۧ";
                    i10 = iM8923 - i11;
                    break;
                case 1751686:
                    str = "ۣۧۦ";
                    iM8418 = C0062.m1192(zM6067);
                    break;
                case 1753509:
                    zM6067 = C0314.m6067(this);
                    str = "ۤۥۧ";
                    break;
                case 1753514:
                    str = "ۣ۠ۥ";
                    iM8418 = C0071.m1466(dM4814);
                    break;
                case 1754506:
                    str = "ۤ۟ۤ";
                    iM8923 = C0209.f233;
                    break;
                case 1754569:
                    dM4814 = C0252.m4814(this);
                    str = "ۦۢۦ";
                    break;
                case 1755375:
                    strM2480 = C0275.m5281(this);
                    str = "ۨۢ۠";
                    break;
                case 1755430:
                    str = "ۢۤ";
                    iM8418 = C0430.m8418(strM2480);
                    break;
                case 1755624:
                    str = "ۨ۠ۧ";
                    iM8923 = i11 * i10;
                    break;
                default:
                    strM2480 = C0128.m2480(this);
                    str = "۠ۡۦ";
                    break;
            }
        }
    }

    public final String toString() {
        String str = "ۨۨ۠";
        StringBuilder sb = null;
        short[] sArrM125 = null;
        String strM7267 = null;
        boolean zM6067 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    C0142.m2728(sb, strM7267);
                    str = "ۣۤۦ";
                    sArrM125 = m125();
                    break;
                case 56356:
                    return C0441.m8605(sb);
                case 56568:
                    int i12 = i11 ^ 868;
                    str = "ۥۧ۠";
                    strM7267 = C0420.m8250(sArrM125, 25, i12, 2491);
                    i10 = i12;
                    break;
                case 1746788:
                    String strM823 = C0042.m823(this);
                    C0142.m2728(sb, strM823);
                    str = "ۦ۟ۨ";
                    strM7267 = strM823;
                    break;
                case 1746909:
                    i11 = C0039.f59;
                    str = "ۤۥۢ";
                    i10 = i11 ^ 828;
                    break;
                case 1751531:
                    int i13 = i11 ^ (-745);
                    str = "ۨ۟ۨ";
                    strM7267 = C0021.m421(sArrM125, 62, i13, 805);
                    i10 = i13;
                    break;
                case 1751623:
                    i11 = C0422.f692;
                    str = "ۨۡۥ";
                    i10 = i11 ^ (-280);
                    break;
                case 1751681:
                    String strM8363 = C0427.m8363(sArrM125, 52, i10, 757);
                    C0142.m2728(sb, strM8363);
                    str = "۟ۢۧ";
                    strM7267 = strM8363;
                    break;
                case 1752524:
                    str = "ۧۨۤ";
                    sArrM125 = m125();
                    i11 = C0368.f638;
                    break;
                case 1752702:
                    sb = new StringBuilder(strM7267);
                    zM6067 = C0314.m6067(this);
                    str = "ۧۤۡ";
                    break;
                case 1753423:
                    str = "ۤ۠ۧ";
                    sArrM125 = m125();
                    i11 = C0032.f52;
                    break;
                case 1753450:
                    C0142.m2728(sb, strM7267);
                    str = "ۡۨۡ";
                    sArrM125 = m125();
                    break;
                case 1753514:
                    C0458.m8912(sb, C0252.m4814(this));
                    str = "ۥۡۨ";
                    break;
                case 1753516:
                    C0142.m2728(sb, strM7267);
                    str = "ۦ۠ۤ";
                    strM7267 = C0275.m5281(this);
                    break;
                case 1754532:
                    C0030.m585(sb, zM6067);
                    str = "۟ۦۤ";
                    sArrM125 = m125();
                    break;
                case 1754659:
                    int i14 = i11 ^ (-560);
                    str = "ۦۢۨ";
                    strM7267 = C0371.m7267(sArrM125, 80, i14, 1955);
                    i10 = i14;
                    break;
                case 1755345:
                    C0142.m2728(sb, strM7267);
                    str = "ۡ۟";
                    strM7267 = C0128.m2480(this);
                    break;
                case 1755404:
                    String strM510 = C0026.m510(sArrM125, 71, i10, 3067);
                    C0142.m2728(sb, strM510);
                    str = "ۦۢۦ";
                    strM7267 = strM510;
                    break;
                case 1755616:
                    str = "ۨ۠";
                    sArrM125 = m125();
                    i11 = C0454.f724;
                    break;
                default:
                    String strM6950 = C0355.m6950(sArrM125, 95, 1, 868);
                    C0142.m2728(sb, strM6950);
                    str = "ۡۥ";
                    strM7267 = strM6950;
                    break;
            }
        }
    }
}
