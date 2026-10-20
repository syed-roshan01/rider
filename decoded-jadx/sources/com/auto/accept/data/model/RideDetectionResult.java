package com.auto.accept.data.model;

import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.graphics.C0031;
import b1.C0050;
import c1.C0060;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d9.C0224;
import d9.C0226;
import d9.f;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.componenttreedeps.C0248;
import e1.C0257;
import e7.C0264;
import f0.C0271;
import f0.C0272;
import h5.C0306;
import i6.C0319;
import j6.C0328;
import l0.C0340;
import l6.C0344;
import la.C0348;
import m0.C0349;
import n.C0361;
import o7.i2;
import p3.C0375;
import p8.C0379;
import q0.C0382;
import q5.C0385;
import r6.C0401;
import r6.C0402;
import t1.C0419;
import u.C0429;
import v0.C0440;
import v5.C0445;
import w2.C0458;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class RideDetectionResult {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f94short = {2183, 2198, 2196, 2204, 2198, 2192, 2194, 2233, 2198, 2202, 2194, 2856, 2863, 2876, 2859, 2842, 2859, 2870, 2874, 2034, 2028, 2027, 2017, 2026, 2034, 2001, 2044, 2037, 2016, 1832, 1849, 1851, 1843, 1849, 1855, 1853, 1814, 1849, 1845, 1853, 1343, 1336, 1323, 1340, 1293, 1340, 1313, 1325, 2406, 2424, 2431, 2421, 2430, 2406, 2373, 2408, 2401, 2420, 2923, 2896, 2909, 2908, 2941, 2908, 2893, 2908, 2906, 2893, 2896, 2902, 2903, 2923, 2908, 2890, 2892, 2901, 2893, 2833, 2889, 2904, 2906, 2898, 2904, 2910, 2908, 2935, 2904, 2900, 2908, 2820, 2723, 2735, 2793, 2798, 2813, 2794, 2766, 2786, 2784, 2810, 2785, 2811, 2738, 761, 757, 691, 692, 679, 688, 641, 688, 685, 673, 744, 830, 818, 883, 881, 881, 887, 866, 870, 848, 871, 870, 870, 893, 892, 852, 893, 871, 892, 886, 815, 1503, 1491, 1412, 1434, 1437, 1431, 1436, 1412, 1447, 1418, 1411, 1430, 1486, 2430, 2418, 2342, 2363, 2367, 2359, 2337, 2342, 2355, 2367, 2338, 2415, 1638};
    private final boolean acceptButtonFound;
    private final int fareAmount;
    private final String fareText;
    private final String packageName;
    private final long timestamp;
    private final String windowType;

    public RideDetectionResult(String str, int i10, String str2, boolean z10, String str3, long j10) {
        C0375.m7360(str, C0126.m2437(m1418(), 0, C0264.f344 ^ 564, 2295));
        C0375.m7360(str2, C0075.m1636(m1418(), 11, C0176.f200 ^ (-809), 2894));
        C0375.m7360(str3, C0328.m6342(m1418(), 19, C0025.f45 ^ 96, 1925));
        this.packageName = str;
        this.fareAmount = i10;
        this.fareText = str2;
        this.acceptButtonFound = z10;
        this.windowType = str3;
        this.timestamp = j10;
        int iM3153 = C0164.m3153();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3153 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0181.m3454("4s56304gmQesOPY9VgJLSItOy")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RideDetectionResult(String str, int i10, String str2, boolean z10, String str3, long j10, int i11, f fVar) {
        long jM7869;
        int i12 = C0226.f306;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = ((i12 ^ 871) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    jM7869 = C0401.m7869();
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    jM7869 = j10;
                    break;
                default:
                    break;
            }
        }
        this(str, i10, str2, z10, str3, jM7869);
        int iM4762 = C0248.m4762();
        int i15 = 1864;
        while (true) {
            i15 ^= 1881;
            switch (i15) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM4762 <= 0) {
                        i15 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Integer.parseInt(C0361.m7078("1ZRdUc2uwtN5sggm8jJXTu73QXF")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i15 = 48705;
        }
    }

    public static /* synthetic */ RideDetectionResult copy$default(RideDetectionResult rideDetectionResult, String str, int i10, String str2, boolean z10, String str3, long j10, int i11, Object obj) {
        String strM1414;
        int iM1416;
        String strM1415;
        boolean zM1417;
        String strM1419;
        long jM1413;
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i12 = ((i11 ^ (-2)) & i11) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM1414 = m1414(rideDetectionResult);
                    break;
                case 239:
                    strM1414 = str;
                    break;
                default:
                    break;
            }
        }
        int i13 = C0160.f184;
        int i14 = 1740;
        while (true) {
            i14 ^= 1757;
            switch (i14) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i14 = ((i13 ^ 745) & i11) != 0 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    iM1416 = i10;
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    iM1416 = m1416(rideDetectionResult);
                    break;
                default:
                    break;
            }
        }
        int i15 = C0122.f148;
        int i16 = 1864;
        while (true) {
            i16 ^= 1881;
            switch (i16) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i15 ^ (-52)) & i11) != 0) {
                        i16 = 48736;
                    }
                    break;
                case 47384:
                    strM1415 = str2;
                    break;
                case 47417:
                    strM1415 = m1415(rideDetectionResult);
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i16 = 48705;
        }
        int i17 = C0224.f304;
        int i18 = 48767;
        while (true) {
            i18 ^= 48784;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    zM1417 = z10;
                    break;
                case 76:
                    zM1417 = m1417(rideDetectionResult);
                    break;
                case 239:
                    i18 = ((i17 ^ 858) & i11) != 0 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i19 = C0173.f197;
        int i20 = 48891;
        while (true) {
            i20 ^= 48908;
            switch (i20) {
                case 22:
                    break;
                case 53:
                    strM1419 = str3;
                    break;
                case 503:
                    i20 = ((i19 ^ (-832)) & i11) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    strM1419 = m1419(rideDetectionResult);
                    break;
                default:
                    break;
            }
        }
        int i21 = C0306.f454;
        int i22 = 49666;
        while (true) {
            i22 ^= 49683;
            switch (i22) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i21 ^ (-350)) & i11) != 0) {
                        i22 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    jM1413 = m1413(rideDetectionResult);
                    break;
                case 83:
                    jM1413 = j10;
                    break;
                default:
                    continue;
            }
            i22 = 49728;
        }
        return C0257.m4910(rideDetectionResult, strM1414, iM1416, strM1415, zM1417, strM1419, jM1413);
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۡ, reason: not valid java name and contains not printable characters */
    public static long m1413(Object obj) {
        int iM2767 = C0144.m2767();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2767 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((RideDetectionResult) obj).timestamp;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1414(Object obj) {
        int iM2559 = C0133.m2559();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2559 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((RideDetectionResult) obj).packageName;
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

    /* JADX INFO: renamed from: ۟ۧۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m1415(Object obj) {
        int iM6838 = C0349.m6838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6838 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((RideDetectionResult) obj).fareText;
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

    /* JADX INFO: renamed from: ۤۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1416(Object obj) {
        int iM7433 = C0379.m7433();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7433 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((RideDetectionResult) obj).fareAmount;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۦۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1417(Object obj) {
        int iM2205 = C0114.m2205();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2205 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((RideDetectionResult) obj).acceptButtonFound;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۢۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m1418() {
        int iM3012 = C0158.m3012();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3012 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f94short;
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

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1419(Object obj) {
        int iM8247 = C0419.m8247();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8247 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((RideDetectionResult) obj).windowType;
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

    public final String component1() {
        return m1414(this);
    }

    public final int component2() {
        return m1416(this);
    }

    public final String component3() {
        return m1415(this);
    }

    public final boolean component4() {
        return m1417(this);
    }

    public final String component5() {
        return m1419(this);
    }

    public final long component6() {
        return m1413(this);
    }

    public final RideDetectionResult copy(String str, int i10, String str2, boolean z10, String str3, long j10) {
        RideDetectionResult rideDetectionResult = null;
        String str4 = "\u06e4\u06e5\u06e7";
        short[] sArrM1418 = null;
        String strM6192 = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str4)) {
                case 1746815:
                    strM6192 = C0090.m1922(sArrM1418, 40, i11, 1369);
                    str4 = "\u06e4\u06e5\u06e2";
                    break;
                case 1746847:
                    str4 = "\u06df\u06e3\u06e3";
                    i11 = i12 ^ (-659);
                    break;
                case 1746882:
                    strM6192 = C0319.m6192(sArrM1418, 29, i11, 1880);
                    str4 = "\u06e7\u06e3\u06e3";
                    break;
                case 1747711:
                    strM6192 = C0139.m2692(sArrM1418, 48, i11, 2321);
                    str4 = "\u06e0\u06e6\u06e1";
                    break;
                case 1747772:
                    sArrM1418 = m1418();
                    str4 = "\u06e1\u06e5\u06e8";
                    break;
                case 1748804:
                    str4 = "\u06df\u06e4\u06e4";
                    i12 = C0020.f40;
                    break;
                case 1751681:
                    C0375.m7360(str2, strM6192);
                    str4 = "\u06e6\u06e4\u06e6";
                    break;
                case 1751686:
                    sArrM1418 = m1418();
                    str4 = "\u06e6\u06e1\u06e4";
                    break;
                case 1751709:
                    rideDetectionResult = new RideDetectionResult(str, i10, str2, z10, str3, j10);
                    str4 = "\u06e4\u06e7\u06e3";
                    break;
                case 1751744:
                    return rideDetectionResult;
                case 1752732:
                    str4 = "\u06e7\u06e7\u06e7";
                    i12 = C0091.f125;
                    break;
                case 1753481:
                    str4 = "\u06e7\u06df\u06e1";
                    i12 = C0031.f51;
                    break;
                case 1753576:
                    sArrM1418 = m1418();
                    str4 = "\u06e5\u06e8\u06df";
                    break;
                case 1754377:
                    str4 = "\u06df\u06e5\u06e8";
                    i11 = i12 ^ (-147);
                    break;
                case 1754503:
                    C0375.m7360(str, strM6192);
                    str4 = "\u06e0\u06e3\u06df";
                    break;
                case 1754631:
                    str4 = "\u06e0\u06e1\u06e0";
                    i11 = i12 ^ (-174);
                    break;
                default:
                    C0375.m7360(str3, strM6192);
                    str4 = "\u06e4\u06e6\u06df";
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
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
                    boolean z10 = obj instanceof RideDetectionResult;
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
                                RideDetectionResult rideDetectionResult = (RideDetectionResult) obj;
                                boolean zM4399 = C0228.m4399(m1414(this), m1414(rideDetectionResult));
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!zM4399) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            int iM1416 = m1416(this);
                                            int iM1417 = m1416(rideDetectionResult);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43910 = C0228.m4399(m1415(this), m1415(rideDetectionResult));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM1417 = m1417(this);
                                                                    boolean zM1418 = m1417(rideDetectionResult);
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM1417 != zM1418) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                boolean zM43911 = C0228.m4399(m1419(this), m1419(rideDetectionResult));
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            long jM1413 = m1413(this);
                                                                                            long jM1414 = m1413(rideDetectionResult);
                                                                                            int i17 = 49914;
                                                                                            while (true) {
                                                                                                i17 ^= 49931;
                                                                                                switch (i17) {
                                                                                                    case 497:
                                                                                                        if (jM1413 != jM1414) {
                                                                                                            i17 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        return true;
                                                                                                    case 1769:
                                                                                                        return false;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i17 = 50627;
                                                                                            }
                                                                                            break;
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
                                                        if (iM1416 != iM1417) {
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

    public final boolean getAcceptButtonFound() {
        return m1417(this);
    }

    public final int getFareAmount() {
        return m1416(this);
    }

    public final String getFareText() {
        return m1415(this);
    }

    public final String getPackageName() {
        return m1414(this);
    }

    public final long getTimestamp() {
        return m1413(this);
    }

    public final String getWindowType() {
        return m1419(this);
    }

    public int hashCode() {
        String strM1414 = null;
        long jM1413 = 0;
        String str = "\u06df\u06e5\u06e4";
        boolean zM1417 = false;
        int iM8923 = 0;
        int i10 = 0;
        int iM8688 = 0;
        int iM1146 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56475:
                    str = "\u06e0\u06e7\u06e4";
                    i10 = iM8688 + iM8923;
                    break;
                case 56508:
                    str = "\u06e2\u06e7\u06e1";
                    iM8688 = iM1146 * i10;
                    break;
                case 1746817:
                    str = "\u06e7\u06e7\u06e3";
                    iM8923 = C0385.m7548(iM1146, iM8688, i10);
                    break;
                case 1747901:
                    str = "\u06e8\u06e1\u06e8";
                    iM1146 = i10 + 29;
                    break;
                case 1748772:
                    str = "\u06e4\u06e8\u06e4";
                    iM1146 = C0060.m1146(jM1413);
                    break;
                case 1749820:
                    str = "\u06df\u06e3\u06e5";
                    iM1146 = m1416(this);
                    break;
                case 1750531:
                    str = "\u06e5\u06e4\u06e1";
                    iM1146 = C0429.m8418(strM1414);
                    break;
                case 1750534:
                    strM1414 = m1419(this);
                    str = "\u06e8\u06e1\u06df";
                    break;
                case 1751560:
                    jM1413 = m1413(this);
                    str = "\u06e1\u06e4\u06e7";
                    break;
                case 1751776:
                    str = "\u06e5\u06e0";
                    iM8688 = iM1146 - 29;
                    break;
                case 1752610:
                    str = "\u06e8\u06df\u06e4";
                    iM8688 = C0344.f615;
                    break;
                case 1754599:
                    str = "\u06e8\u06e0\u06e6";
                    iM1146 = C0458.m8923(strM1414, iM8923, i10);
                    break;
                case 1754627:
                    strM1414 = m1415(this);
                    str = "\u06e7\u06e6\u06e6";
                    break;
                case 1754628:
                    str = "\u06e3\u06df\u06e2";
                    iM8688 = C0445.m8688(zM1417, iM1146, i10);
                    break;
                case 1755341:
                    str = "\u06e6\u06e2";
                    i10 = iM8688 ^ 727;
                    break;
                case 1755374:
                    zM1417 = m1417(this);
                    str = "\u06e7\u06e7\u06e4";
                    break;
                case 1755398:
                    str = "\u06e4\u06e1\u06e5";
                    iM8923 = C0458.m8923(strM1414, iM8688, i10);
                    break;
                case 1755407:
                    return iM1146;
                default:
                    strM1414 = m1414(this);
                    str = "\u06e3\u06df\u06df";
                    break;
            }
        }
    }

    public String toString() {
        long jM1413 = 0;
        String str = "\u06e7\u06e8\u06e5";
        StringBuilder sb = null;
        String str2 = null;
        String strM3620 = null;
        String strM1414 = null;
        String strM2407 = null;
        short[] sArrM1418 = null;
        boolean zM1417 = false;
        int iM1416 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56418:
                    C0142.m2728(sb, strM1414);
                    C0142.m2728(sb, strM3620);
                    str = "\u06e8\u06e7\u06e3";
                    break;
                case 56481:
                    int i12 = i10 ^ (-906);
                    str = "\u06e2\u06e8\u06e0";
                    strM1414 = C0050.m980(sArrM1418, 134, i12, 1523);
                    iM1416 = i12;
                    break;
                case 56513:
                    int i13 = i11 ^ (-526);
                    str = "\u06df\u06df\u06e4";
                    strM2407 = C0348.m6825(sArrM1418, 58, i13, 2873);
                    i10 = i13;
                    break;
                case 56514:
                    C0142.m2728(sb, strM2407);
                    C0030.m585(sb, zM1417);
                    str = "\u06e3\u06e8\u06e2";
                    break;
                case 1746692:
                    sb = new StringBuilder(strM2407);
                    C0142.m2728(sb, strM1414);
                    str = "\u06e8\u06e0\u06e0";
                    break;
                case 1746910:
                    return strM1414;
                case 1748679:
                    str = "\u06e6\u06e7";
                    sArrM1418 = m1418();
                    i11 = C0472.f743;
                    break;
                case 1749792:
                    sArrM1418 = m1418();
                    str = "\u06e6\u06e0\u06e8";
                    strM2407 = C0125.m2407(sArrM1418, 159, 1, 1615);
                    break;
                case 1750569:
                    C0142.m2728(sb, strM3620);
                    C0340.m6676(sb, jM1413);
                    str = "\u06e2\u06e6\u06e4";
                    break;
                case 1750690:
                    str = "\u06e6\u06e7\u06e1";
                    sArrM1418 = m1418();
                    i11 = C0136.f162;
                    break;
                case 1750691:
                    int i14 = iM1416 ^ (-828);
                    str = "\u06e6\u06e8";
                    strM2407 = C0385.m7543(sArrM1418, 114, i14, 786);
                    i11 = i14;
                    break;
                case 1750813:
                    str = "\u06e5\u06e6";
                    sArrM1418 = m1418();
                    i10 = C0135.f161;
                    break;
                case 1751557:
                    String strM1415 = m1415(this);
                    zM1417 = m1417(this);
                    str = "\u06e5\u06e1\u06e3";
                    strM3620 = strM1415;
                    break;
                case 1752519:
                    String strM1419 = m1419(this);
                    jM1413 = m1413(this);
                    str = "\u06e1\u06e1\u06e7";
                    str2 = strM1419;
                    break;
                case 1753454:
                    C0142.m2728(sb, strM2407);
                    str = "\u06df\u06e6\u06e5";
                    strM1414 = C0440.m8605(sb);
                    break;
                case 1753544:
                    C0142.m2728(sb, strM2407);
                    C0197.m3772(sb, iM1416);
                    str = "\u06e6\u06e7\u06e3";
                    break;
                case 1753664:
                    int i15 = i11 ^ (-347);
                    str = "\u06e3\u06e0\u06e6";
                    strM3620 = C0189.m3620(sArrM1418, 147, i15, 2386);
                    i10 = i15;
                    break;
                case 1753666:
                    str = "\u06e7\u06e1\u06e3";
                    sArrM1418 = m1418();
                    i11 = C0272.f388;
                    break;
                case 1754441:
                    int i16 = i11 ^ 327;
                    str = "\u06e3\u06e5";
                    strM1414 = C0382.m7492(sArrM1418, 103, i16, 725);
                    i10 = i16;
                    break;
                case 1754660:
                    str = "\u06e4\u06e1\u06e2";
                    strM1414 = m1414(this);
                    iM1416 = m1416(this);
                    break;
                case 1755368:
                    str = "\u06e8\u06e6\u06e6";
                    sArrM1418 = m1418();
                    i11 = C0402.f673;
                    break;
                case 1755560:
                    int i17 = i11 ^ 773;
                    str = "\u06e6\u06e3\u06e5";
                    strM2407 = C0271.m5220(sArrM1418, 90, i17, 2703);
                    i10 = i17;
                    break;
                case 1755588:
                    str = "\u06e3\u06e4\u06e4";
                    sArrM1418 = m1418();
                    iM1416 = C0173.f197;
                    break;
                default:
                    C0142.m2728(sb, strM1414);
                    C0142.m2728(sb, str2);
                    str = "\u06e3\u06e4\u06e3";
                    break;
            }
        }
    }
}
