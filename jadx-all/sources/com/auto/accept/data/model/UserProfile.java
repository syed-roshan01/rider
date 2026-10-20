package com.auto.accept.data.model;

import a0.C0003;
import aa.C0012;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.graphics.C0030;
import androidx.fragment.app.C0042;
import b4.C0052;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfiginterop.C0202;
import com.google.gson.internal.sql.C0208;
import d1.C0212;
import d2.C0216;
import d9.C0224;
import d9.f;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e1.C0259;
import e2.C0261;
import e2.C0263;
import e8.C0266;
import f.C0270;
import f4.C0275;
import f4.C0277;
import g0.C0286;
import g2.C0287;
import g2.C0288;
import g5.C0291;
import g7.C0293;
import g8.C0294;
import g9.C0295;
import ga.C0296;
import h.C0298;
import h3.C0304;
import h4.C0306;
import h6.C0310;
import i.C0317;
import ia.C0323;
import j3.C0326;
import j4.C0327;
import j6.C0329;
import k2.C0334;
import l0.C0341;
import m1.C0351;
import m5.C0355;
import o4.C0370;
import o7.i2;
import p3.C0376;
import p4.C0377;
import r2.C0396;
import r2.C0397;
import r9.C0406;
import s2.C0412;
import t0.C0419;
import t2.C0421;
import t2.C0424;
import t8.C0427;
import u.C0429;
import u.C0430;
import v.C0440;
import v0.C0441;
import v0.C0443;
import v5.C0446;
import w2.C0458;
import w2.C0459;
import w5.C0463;
import x0.C0467;
import x5.C0471;
import z.C0481;
import z7.C0489;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class UserProfile {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f97short = {2281, 2278, 2282, 2274, 477, 469, 473, 465, 468, 804, 803, 822, 803, 802, 804, 2764, 2765, 2782, 2753, 2763, 2765, 2785, 2764, 1095, 1115, 1110, 1113, 1123, 1102, 1095, 1106, 1691, 1671, 1674, 1669, 1700, 1689, 1679, 1678, 1689, 1698, 1679, 1138, 1108, 1090, 1109, 1942, 1955, 1960, 1954, 1967, 1960, 1953, 2022, 1927, 1974, 1974, 1972, 1961, 1968, 1959, 1962, 1911, 1912, 1908, 1916, 3303, 3311, 3299, 3307, 3310, 616, 623, 634, 623, 622, 616, 1787, 1786, 1769, 1782, 1788, 1786, 1750, 1787, 1942, 1930, 1927, 1928, 1970, 1951, 1942, 1923, 1283, 1311, 1298, 1309, 1340, 1281, 1303, 1302, 1281, 1338, 1303, 2265, 2303, 2281, 2302, 2268, 2302, 2275, 2282, 2277, 2272, 2281, 2212, 2274, 2285, 2273, 2281, 2225, 1869, 1857, 1796, 1804, 1792, 1800, 1805, 1884, 2367, 2355, 2400, 2407, 2418, 2407, 2406, 2400, 2350, 2562, 2574, 2631, 2653, 2671, 2637, 2650, 2631, 2648, 2635, 2579, 3183, 3171, 3106, 3123, 3123, 3121, 3116, 3125, 3110, 3111, 3198, 1891, 1903, 1837, 1827, 1824, 1836, 1828, 1834, 1835, 1906, 1068, 1056, 1124, 1125, 1142, 1129, 1123, 1125, 1097, 1124, 1085, 3151, 3139, 3091, 3087, 3074, 3085, 3127, 3098, 3091, 3078, 3166, 858, 854, 774, 794, 791, 792, 819, 782, 774, 799, 772, 783, 843, 2155, 2151, 2103, 2091, 2086, 2089, 2054, 2084, 2099, 2094, 2097, 2082, 2170, 2784, 2796, 2748, 2720, 2733, 2722, 2691, 2750, 2728, 2729, 2750, 2693, 2728, 2801, 2009};
    private final boolean approved;
    private final boolean blocked;
    private final String deviceId;
    private final String email;
    private final boolean isActive;
    private final String name;
    private final boolean planActive;
    private final long planExpiry;
    private final String planOrderId;
    private final String planType;
    private final String status;

    public UserProfile() {
        this(null, null, null, false, false, false, null, null, 0L, false, null, 2047, null);
        int iM5722 = C0298.m5722();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5722 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0263.m5014("gCYmqnP6W5jZu30nvr8F")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public UserProfile(String str, String str2, String str3, boolean z10, boolean z11, boolean z12, String str4, String str5, long j10, boolean z13, String str6) {
        C0376.m7360(str, C0020.m406(m1444(), 0, C0489.f762 ^ (-336), 2183));
        C0376.m7360(str2, C0341.m6675(m1444(), 4, C0412.f682 ^ 32, 440));
        C0376.m7360(str3, C0176.m3354(m1444(), 9, C0197.f221 ^ 101, 855));
        C0376.m7360(str4, C0261.m4969(m1444(), 15, C0296.f443 ^ 83, 2728));
        C0376.m7360(str5, C0024.m469(m1444(), 23, C0073.f107 ^ (-923), 1079));
        C0376.m7360(str6, C0192.m3660(m1444(), 31, C0144.f170 ^ (-136), 1771));
        this.name = str;
        this.email = str2;
        this.status = str3;
        this.isActive = z10;
        this.approved = z11;
        this.blocked = z12;
        this.deviceId = str4;
        this.planType = str5;
        this.planExpiry = j10;
        this.planActive = z13;
        this.planOrderId = str6;
        int iM7755 = C0397.m7755();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7755 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0467.m9083("P8iA3xztcE")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserProfile(String str, String str2, String str3, boolean z10, boolean z11, boolean z12, String str4, String str5, long j10, boolean z13, String str6, int i10, f fVar) {
        String strM3395;
        String str7;
        String strM6950;
        boolean z14;
        boolean z15;
        boolean z16;
        String str8;
        String str9;
        long j11;
        String str10;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-2)) & i10) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM3395 = C0178.m3395(m1444(), 42, C0463.f733 ^ 305, 1063);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    strM3395 = str;
                    break;
                default:
                    break;
            }
        }
        int i13 = C0082.f116;
        String strM8581 = C0440.m8581();
        int i14 = 1864;
        while (true) {
            i14 ^= 1881;
            switch (i14) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i14 = ((i13 ^ 379) & i10) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    str7 = str2;
                    break;
                case 47417:
                    int i15 = 48767;
                    while (true) {
                        i15 ^= 48784;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                str7 = strM8581;
                                break;
                            case 239:
                                i15 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        int i16 = C0377.f647;
        int i17 = 48891;
        while (true) {
            i17 ^= 48908;
            switch (i17) {
                case 22:
                    break;
                case 53:
                    strM6950 = str3;
                    break;
                case 503:
                    i17 = ((i16 ^ 826) & i10) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    strM6950 = C0355.m6950(m1444(), 46, C0147.f172 ^ 959, 1990);
                    int i18 = 49666;
                    while (true) {
                        i18 ^= 49683;
                        switch (i18) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i18 = 49697;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i19 = C0259.f338;
        boolean z17 = false;
        int i20 = 49790;
        while (true) {
            i20 ^= 49807;
            switch (i20) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    z14 = z10;
                    break;
                case 84:
                    z14 = false;
                    int i21 = 49914;
                    while (true) {
                        i21 ^= 49931;
                        switch (i21) {
                            case 497:
                                i21 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i20 = ((i19 ^ 748) & i10) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i22 = C0003.f881;
        int i23 = 50689;
        while (true) {
            i23 ^= 50706;
            switch (i23) {
                case 19:
                    i23 = ((i22 ^ (-845)) & i10) != 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    z15 = z11;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    z15 = false;
                    int i24 = 50813;
                    while (true) {
                        i24 ^= 50830;
                        switch (i24) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 243:
                                i24 = 50844;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i25 = C0429.f699;
        int i26 = 51588;
        while (true) {
            i26 ^= 51605;
            switch (i26) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i26 = ((i25 ^ 231) & i10) != 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    z16 = z12;
                    break;
                case 116:
                    z16 = false;
                    int i27 = 51712;
                    while (true) {
                        i27 ^= 51729;
                        switch (i27) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 15:
                            case Code.UNAUTHENTICATED /* 16 */:
                            default:
                                continue;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i27 = 51743;
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i28 = C0079.f113;
        int i29 = 51836;
        while (true) {
            i29 ^= 51853;
            switch (i29) {
                case 241:
                    i29 = ((i28 ^ (-620)) & i10) != 0 ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    str8 = str4;
                    break;
                case 2025:
                    int i30 = 52611;
                    while (true) {
                        i30 ^= 52628;
                        switch (i30) {
                            case 23:
                                i30 = 52642;
                                continue;
                            case 54:
                                str8 = strM8581;
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
        int i31 = C0326.f473;
        int i32 = 52735;
        while (true) {
            i32 ^= 52752;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    str9 = str5;
                    break;
                case 1007:
                    if (((i31 ^ 499) & i10) != 0) {
                        i32 = 53479;
                    }
                    break;
                case 7927:
                    int i33 = 53510;
                    while (true) {
                        i33 ^= 53527;
                        switch (i33) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = 53541;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                str9 = strM8581;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i32 = 52797;
        }
        int i34 = C0084.f118;
        int i35 = 53634;
        while (true) {
            i35 ^= 53651;
            switch (i35) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i35 = ((i34 ^ 773) & i10) != 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    j11 = 0;
                    int i36 = 53758;
                    while (true) {
                        i36 ^= 53775;
                        switch (i36) {
                            case 1009:
                                i36 = 54440;
                                continue;
                            case 1703:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    j11 = j10;
                    break;
                default:
                    break;
            }
        }
        int i37 = C0234.f313;
        int i38 = 54533;
        while (true) {
            i38 ^= 54550;
            switch (i38) {
                case 19:
                    i38 = ((i37 ^ 830) & i10) != 0 ? 54626 : 54595;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 85:
                    z17 = z13;
                    break;
                case 116:
                    int i39 = 54657;
                    while (true) {
                        i39 ^= 54674;
                        switch (i39) {
                            case 19:
                                i39 = 54688;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
        int i40 = C0252.f331;
        int i41 = 55432;
        while (true) {
            i41 ^= 55449;
            switch (i41) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i41 = ((i40 ^ 1625) & i10) != 0 ? 55525 : 55494;
                    break;
                case 62:
                    break;
                case 95:
                    str10 = str6;
                    break;
                case 124:
                    int i42 = 55556;
                    while (true) {
                        i42 ^= 55573;
                        switch (i42) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i42 = 55587;
                                continue;
                            case 54:
                                str10 = strM8581;
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
        this(strM3395, str7, strM6950, z14, z15, z16, str8, str9, j11, z17, str10);
        int iM5286 = C0275.m5286();
        int i43 = 55680;
        while (true) {
            i43 ^= 55697;
            switch (i43) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM5286 >= 0) {
                        i43 = 56424;
                    }
                    break;
                case 1467:
                    break;
                case 1496:
                    return;
                case 1529:
                    System.out.println(Float.parseFloat(C0334.m6482("q52mJ5B")));
                    return;
                default:
                    continue;
            }
            i43 = 56393;
        }
    }

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, String str4, String str5, long j10, boolean z13, String str6, int i10, Object obj) {
        String strM1436;
        String strM1439;
        String strM1446;
        boolean zM1442;
        boolean zM1447;
        boolean zM1437;
        String strM1440;
        String strM1445;
        long jM1441;
        boolean zM1438;
        String strM1443;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = ((i10 ^ (-2)) & i10) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM1436 = m1436(userProfile);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    strM1436 = str;
                    break;
                default:
                    break;
            }
        }
        int i13 = C0291.f438;
        int i14 = 1864;
        while (true) {
            i14 ^= 1881;
            switch (i14) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i14 = ((i13 ^ (-352)) & i10) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    strM1439 = str2;
                    break;
                case 47417:
                    strM1439 = m1439(userProfile);
                    int i15 = 48767;
                    while (true) {
                        i15 ^= 48784;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i15 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        int i16 = C0287.f431;
        int i17 = 48891;
        while (true) {
            i17 ^= 48908;
            switch (i17) {
                case 22:
                    break;
                case 53:
                    strM1446 = str3;
                    break;
                case 503:
                    i17 = ((i16 ^ 352) & i10) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    strM1446 = m1446(userProfile);
                    int i18 = 49666;
                    while (true) {
                        i18 ^= 49683;
                        switch (i18) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i18 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
        int i19 = C0216.f239;
        int i20 = 49790;
        while (true) {
            i20 ^= 49807;
            switch (i20) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    zM1442 = z10;
                    break;
                case 84:
                    zM1442 = m1442(userProfile);
                    int i21 = 49914;
                    while (true) {
                        i21 ^= 49931;
                        switch (i21) {
                            case 497:
                                i21 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i20 = ((i19 ^ (-786)) & i10) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i22 = C0421.f691;
        int i23 = 50689;
        while (true) {
            i23 ^= 50706;
            switch (i23) {
                case 19:
                    i23 = ((i22 ^ 293) & i10) != 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    zM1447 = z11;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    zM1447 = m1447(userProfile);
                    int i24 = 50813;
                    while (true) {
                        i24 ^= 50830;
                        switch (i24) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 243:
                                i24 = 50844;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i25 = C0458.f728;
        int i26 = 51588;
        while (true) {
            i26 ^= 51605;
            switch (i26) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i26 = ((i25 ^ 353) & i10) != 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    zM1437 = z12;
                    break;
                case 116:
                    zM1437 = m1437(userProfile);
                    int i27 = 51712;
                    while (true) {
                        i27 ^= 51729;
                        switch (i27) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 15:
                            case Code.UNAUTHENTICATED /* 16 */:
                            default:
                                continue;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i27 = 51743;
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i28 = C0079.f113;
        int i29 = 51836;
        while (true) {
            i29 ^= 51853;
            switch (i29) {
                case 241:
                    i29 = ((i28 ^ (-620)) & i10) != 0 ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    strM1440 = str4;
                    break;
                case 2025:
                    strM1440 = m1440(userProfile);
                    int i30 = 52611;
                    while (true) {
                        i30 ^= 52628;
                        switch (i30) {
                            case 23:
                                i30 = 52642;
                                continue;
                            case 54:
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
        int i31 = C0306.f453;
        int i32 = 52735;
        while (true) {
            i32 ^= 52752;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    strM1445 = str5;
                    break;
                case 1007:
                    i32 = ((i31 ^ (-504)) & i10) != 0 ? 53479 : 52797;
                    break;
                case 7927:
                    strM1445 = m1445(userProfile);
                    int i33 = 53510;
                    while (true) {
                        i33 ^= 53527;
                        switch (i33) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i33 = 53541;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
        int i34 = C0329.f476;
        int i35 = 53634;
        while (true) {
            i35 ^= 53651;
            switch (i35) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i35 = ((i34 ^ 999) & i10) != 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    jM1441 = m1441(userProfile);
                    int i36 = 53758;
                    while (true) {
                        i36 ^= 53775;
                        switch (i36) {
                            case 1009:
                                i36 = 54440;
                                continue;
                            case 1703:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    jM1441 = j10;
                    break;
                default:
                    break;
            }
        }
        int i37 = C0396.f666;
        int i38 = 54533;
        while (true) {
            i38 ^= 54550;
            switch (i38) {
                case 19:
                    i38 = ((i37 ^ 409) & i10) != 0 ? 54626 : 54595;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 85:
                    zM1438 = z13;
                    break;
                case 116:
                    zM1438 = m1438(userProfile);
                    int i39 = 54657;
                    while (true) {
                        i39 ^= 54674;
                        switch (i39) {
                            case 19:
                                i39 = 54688;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
        int i40 = C0087.f121;
        int i41 = 55432;
        while (true) {
            i41 ^= 55449;
            switch (i41) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i40 ^ 1628) & i10) != 0) {
                        i41 = 55525;
                    }
                    break;
                case 62:
                    break;
                case 95:
                    strM1443 = str6;
                    break;
                case 124:
                    strM1443 = m1443(userProfile);
                    int i42 = 55556;
                    while (true) {
                        i42 ^= 55573;
                        switch (i42) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i42 = 55587;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i41 = 55494;
        }
        return C0042.m832(userProfile, strM1436, strM1439, strM1446, zM1442, zM1447, zM1437, strM1440, strM1445, jM1441, zM1438, strM1443);
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1436(Object obj) {
        int iM5315 = C0277.m5315();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5315 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).name;
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

    /* JADX INFO: renamed from: ۟ۡۤۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1437(Object obj) {
        int iM7952 = C0406.m7952();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7952 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).blocked;
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

    /* JADX INFO: renamed from: ۟ۤۢۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1438(Object obj) {
        int iM3868 = C0202.m3868();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3868 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).planActive;
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

    /* JADX INFO: renamed from: ۟ۤۨۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1439(Object obj) {
        int iM3984 = C0208.m3984();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3984 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).email;
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

    /* JADX INFO: renamed from: ۟ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1440(Object obj) {
        int iM6244 = C0323.m6244();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6244 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).deviceId;
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

    /* JADX INFO: renamed from: ۟ۦۧۢۨ, reason: not valid java name and contains not printable characters */
    public static long m1441(Object obj) {
        int iM9566 = C0492.m9566();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9566 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).planExpiry;
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

    /* JADX INFO: renamed from: ۟ۧۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1442(Object obj) {
        int iM1363 = C0070.m1363();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1363 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).isActive;
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

    /* JADX INFO: renamed from: ۤۥۢۤ, reason: not valid java name and contains not printable characters */
    public static String m1443(Object obj) {
        int iM5634 = C0293.m5634();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5634 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).planOrderId;
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

    /* JADX INFO: renamed from: ۥ۠ۢۧ, reason: contains not printable characters */
    public static short[] m1444() {
        int iM8415 = C0430.m8415();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8415 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f97short;
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

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m1445(Object obj) {
        int iM2311 = C0120.m2311();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2311 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).planType;
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

    /* JADX INFO: renamed from: ۣۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1446(Object obj) {
        int iM6120 = C0317.m6120();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6120 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).status;
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

    /* JADX INFO: renamed from: ۨ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1447(Object obj) {
        int iM2045 = C0105.m2045();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2045 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((UserProfile) obj).approved;
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

    public final String component1() {
        return m1436(this);
    }

    public final boolean component10() {
        return m1438(this);
    }

    public final String component11() {
        return m1443(this);
    }

    public final String component2() {
        return m1439(this);
    }

    public final String component3() {
        return m1446(this);
    }

    public final boolean component4() {
        return m1442(this);
    }

    public final boolean component5() {
        return m1447(this);
    }

    public final boolean component6() {
        return m1437(this);
    }

    public final String component7() {
        return m1440(this);
    }

    public final String component8() {
        return m1445(this);
    }

    public final long component9() {
        return m1441(this);
    }

    public final UserProfile copy(String str, String str2, String str3, boolean z10, boolean z11, boolean z12, String str4, String str5, long j10, boolean z13, String str6) {
        String strM8230 = null;
        UserProfile userProfile = null;
        String str7 = "ۢۡۤ";
        short[] sArrM1444 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str7)) {
                case 56326:
                    str7 = "ۣۧ";
                    i11 = C0266.f345;
                    break;
                case 56540:
                    str7 = "ۢۤۦ";
                    i10 = i11 ^ 920;
                    break;
                case 56572:
                    str7 = "ۦۣ۟";
                    sArrM1444 = m1444();
                    break;
                case 1746757:
                    str7 = "۠۠ۤ";
                    i10 = i11 ^ (-716);
                    break;
                case 1746781:
                    userProfile = new UserProfile(str, str2, str3, z10, z11, z12, str4, str5, j10, z13, str6);
                    str7 = "ۨ۠ۢ";
                    break;
                case 1746788:
                    str7 = "ۣ۠۠";
                    i11 = C0052.f72;
                    break;
                case 1746912:
                    str7 = "۟ۢۧ";
                    sArrM1444 = m1444();
                    break;
                case 1747684:
                    strM8230 = C0012.m232(sArrM1444, 62, i10, 1817);
                    str7 = "ۦ۠ۧ";
                    break;
                case 1747901:
                    strM8230 = C0304.m5839(sArrM1444, 66, i10, 3202);
                    str7 = "ۡۡۡ";
                    break;
                case 1748610:
                    C0376.m7360(str6, strM8230);
                    str7 = "۟ۢ۠";
                    break;
                case 1748673:
                    C0376.m7360(str2, strM8230);
                    str7 = "ۣۦۦ";
                    break;
                case 1748768:
                    str7 = "۟ۡۧ";
                    i11 = C0351.f621;
                    break;
                case 1749637:
                    str7 = "ۣۡۤ";
                    sArrM1444 = m1444();
                    break;
                case 1749732:
                    strM8230 = C0419.m8230(sArrM1444, 71, i10, 539);
                    str7 = "ۥۥۧ";
                    break;
                case 1750563:
                    str7 = "ۣۧۧ";
                    i10 = i11 ^ 938;
                    break;
                case 1750659:
                    str7 = "ۤ۟ۦ";
                    sArrM1444 = m1444();
                    break;
                case 1750755:
                    str7 = "۠ۦ";
                    sArrM1444 = m1444();
                    break;
                case 1751499:
                    str7 = "ۡۨ۠";
                    i11 = C0022.f42;
                    break;
                case 1751652:
                    str7 = "ۦۣۨ";
                    i10 = i11 ^ (-909);
                    break;
                case 1751779:
                    strM8230 = C0158.m3014(sArrM1444, 77, i10, 1695);
                    str7 = "ۥۢ۟";
                    break;
                case 1752457:
                    C0376.m7360(str5, strM8230);
                    str7 = "۟ۦۧ";
                    break;
                case 1752546:
                    C0376.m7360(str4, strM8230);
                    str7 = "ۨۤ";
                    break;
                case 1752647:
                    C0376.m7360(str3, strM8230);
                    str7 = "ۦۨۨ";
                    break;
                case 1753453:
                    C0376.m7360(str, strM8230);
                    str7 = "ۣۣۣ";
                    break;
                case 1753512:
                    str7 = "ۦۨۦ";
                    i11 = C0236.f315;
                    break;
                case 1753538:
                    str7 = "ۤۤۤ";
                    i11 = C0135.f161;
                    break;
                case 1753547:
                    strM8230 = C0443.m8629(sArrM1444, 85, i10, 2022);
                    str7 = "ۥۣ۟";
                    break;
                case 1753700:
                    str7 = "ۤۨۧ";
                    i10 = i11 ^ (-703);
                    break;
                case 1753702:
                    str7 = "ۦۢۤ";
                    sArrM1444 = m1444();
                    break;
                case 1754627:
                    strM8230 = C0239.m4588(sArrM1444, 93, i10, 1395);
                    str7 = "ۡ۟۠";
                    break;
                case 1755370:
                    return userProfile;
                default:
                    str7 = "۠ۧۤ";
                    i10 = i11 ^ (-685);
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
                    boolean z10 = obj instanceof UserProfile;
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
                                UserProfile userProfile = (UserProfile) obj;
                                boolean zM4399 = C0229.m4399(m1436(this), m1436(userProfile));
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
                                            boolean zM43910 = C0229.m4399(m1439(this), m1439(userProfile));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        boolean zM43911 = C0229.m4399(m1446(this), m1446(userProfile));
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM1442 = m1442(this);
                                                                    boolean zM1443 = m1442(userProfile);
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM1442 != zM1443) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                boolean zM1447 = m1447(this);
                                                                                boolean zM1448 = m1447(userProfile);
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            boolean zM1437 = m1437(this);
                                                                                            boolean zM1438 = m1437(userProfile);
                                                                                            int i17 = 49914;
                                                                                            while (true) {
                                                                                                i17 ^= 49931;
                                                                                                switch (i17) {
                                                                                                    case 497:
                                                                                                        if (zM1437 != zM1438) {
                                                                                                            i17 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        boolean zM43912 = C0229.m4399(m1440(this), m1440(userProfile));
                                                                                                        int i18 = 50689;
                                                                                                        while (true) {
                                                                                                            i18 ^= 50706;
                                                                                                            switch (i18) {
                                                                                                                case 19:
                                                                                                                    if (!zM43912) {
                                                                                                                        i18 = 50782;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                    boolean zM43913 = C0229.m4399(m1445(this), m1445(userProfile));
                                                                                                                    int i19 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i19 ^= 50830;
                                                                                                                        switch (i19) {
                                                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                long jM1441 = m1441(this);
                                                                                                                                long jM1442 = m1441(userProfile);
                                                                                                                                int i20 = 51588;
                                                                                                                                while (true) {
                                                                                                                                    i20 ^= 51605;
                                                                                                                                    switch (i20) {
                                                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            if (jM1441 != jM1442) {
                                                                                                                                                i20 = 51681;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 54:
                                                                                                                                            break;
                                                                                                                                        case 87:
                                                                                                                                            boolean zM1439 = m1438(this);
                                                                                                                                            boolean zM14310 = m1438(userProfile);
                                                                                                                                            int i21 = 51712;
                                                                                                                                            while (true) {
                                                                                                                                                i21 ^= 51729;
                                                                                                                                                switch (i21) {
                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                        break;
                                                                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                        if (zM1439 != zM14310) {
                                                                                                                                                            i21 = 51805;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 47:
                                                                                                                                                        boolean zM43914 = C0229.m4399(m1443(this), m1443(userProfile));
                                                                                                                                                        int i22 = 51836;
                                                                                                                                                        while (true) {
                                                                                                                                                            i22 ^= 51853;
                                                                                                                                                            switch (i22) {
                                                                                                                                                                case 241:
                                                                                                                                                                    if (!zM43914) {
                                                                                                                                                                        i22 = 52580;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 1963:
                                                                                                                                                                    break;
                                                                                                                                                                case 1992:
                                                                                                                                                                    return true;
                                                                                                                                                                case 2025:
                                                                                                                                                                    return false;
                                                                                                                                                                default:
                                                                                                                                                                    continue;
                                                                                                                                                            }
                                                                                                                                                            i22 = 52549;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 76:
                                                                                                                                                        return false;
                                                                                                                                                    default:
                                                                                                                                                        continue;
                                                                                                                                                }
                                                                                                                                                i21 = 51774;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 116:
                                                                                                                                            return false;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                    i20 = 51650;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                if (!zM43913) {
                                                                                                                                    i19 = 51557;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 4075:
                                                                                                                                return false;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i19 = 50875;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    return false;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i18 = 50751;
                                                                                                        }
                                                                                                        break;
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
                                                                                            if (zM1447 != zM1448) {
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
                                                                    if (!zM43911) {
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
                                                        if (!zM43910) {
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

    public final boolean getApproved() {
        return m1447(this);
    }

    public final boolean getBlocked() {
        return m1437(this);
    }

    public final String getDeviceId() {
        return m1440(this);
    }

    public final String getEmail() {
        return m1439(this);
    }

    public final String getName() {
        return m1436(this);
    }

    public final boolean getPlanActive() {
        return m1438(this);
    }

    public final long getPlanExpiry() {
        return m1441(this);
    }

    public final String getPlanOrderId() {
        return m1443(this);
    }

    public final String getPlanType() {
        return m1445(this);
    }

    public final String getStatus() {
        return m1446(this);
    }

    public int hashCode() {
        String strM1445 = null;
        long jM1441 = 0;
        String str = "ۣۢۥ";
        boolean zM1437 = false;
        int i10 = 0;
        int iM8688 = 0;
        int iM8923 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56413:
                    str = "ۡۦۤ";
                    iM8688 = C0459.m8923(strM1445, iM8923, i10);
                    break;
                case 56420:
                    str = "ۧۥۧ";
                    iM8688 = C0459.m8923(strM1445, iM8923, i10);
                    break;
                case 56451:
                    str = "۟ۦۧ";
                    iM8923 = i10 - iM8688;
                    break;
                case 56478:
                    str = "۟۟۠";
                    iM8688 = C0446.m8688(zM1437, iM8923, i10);
                    break;
                case 1746688:
                    zM1437 = m1447(this);
                    str = "ۢ۟ۥ";
                    break;
                case 1746912:
                    str = "ۡۡ۠";
                    i10 = 0 - iM8923;
                    break;
                case 1747746:
                    strM1445 = m1443(this);
                    str = "ۣۧ۠";
                    break;
                case 1747837:
                    str = "ۢۧۨ";
                    iM8923 = C0471.f741;
                    break;
                case 1748672:
                    return i10;
                case 1748802:
                    str = "ۤۧ";
                    i10 = 0 - iM8923;
                    break;
                case 1748831:
                    jM1441 = m1441(this);
                    str = "ۥ۠ۡ";
                    break;
                case 1749576:
                    str = "ۢۨۡ";
                    iM8923 = C0446.m8688(zM1437, iM8688, i10);
                    break;
                case 1749670:
                    str = "ۣۢ۟";
                    iM8923 = C0459.m8923(strM1445, iM8688, i10);
                    break;
                case 1749700:
                    strM1445 = m1436(this);
                    str = "ۣۤۡ";
                    break;
                case 1749827:
                    str = "ۦۤ۟";
                    i10 = iM8923 ^ 170;
                    break;
                case 1750624:
                    zM1437 = m1442(this);
                    str = "ۥۣ";
                    break;
                case 1750782:
                    str = "ۦ۟ۡ";
                    iM8688 = C0446.m8688(zM1437, iM8923, i10);
                    break;
                case 1751618:
                    str = "۠ۥۢ";
                    iM8688 = C0430.m8418(strM1445);
                    break;
                case 1751714:
                    zM1437 = m1438(this);
                    str = "ۧۥۥ";
                    break;
                case 1752486:
                    str = "ۤۦۤ";
                    iM8923 = C0481.m9363(jM1441, iM8688, i10);
                    break;
                case 1753416:
                    strM1445 = m1440(this);
                    str = "ۣۨۤ";
                    break;
                case 1753569:
                    str = "ۨۤۢ";
                    iM8923 = iM8688 * i10;
                    break;
                case 1754410:
                    str = "ۡۥۦ";
                    iM8923 = C0430.m8418(strM1445);
                    break;
                case 1754567:
                    str = "۠ۢۤ";
                    iM8688 = C0446.m8688(zM1437, iM8923, i10);
                    break;
                case 1754569:
                    strM1445 = m1446(this);
                    str = "ۢۢۦ";
                    break;
                case 1755367:
                    strM1445 = m1445(this);
                    str = "ۣ۠";
                    break;
                case 1755494:
                    strM1445 = m1439(this);
                    str = "ۣۧ";
                    break;
                case 1755495:
                    str = "ۨ۠۟";
                    iM8923 = C0459.m8923(strM1445, iM8688, i10);
                    break;
                default:
                    zM1437 = m1437(this);
                    str = "ۣۧۢ";
                    break;
            }
        }
    }

    public final boolean isActive() {
        return m1442(this);
    }

    public String toString() {
        String strM5144 = null;
        String strM1439 = null;
        String strM1446 = null;
        boolean zM1442 = false;
        boolean zM1447 = false;
        boolean zM1437 = false;
        String strM1440 = null;
        String strM1445 = null;
        long jM1441 = 0;
        boolean zM1438 = false;
        String strM1443 = null;
        short[] sArrM1444 = null;
        int i10 = 0;
        int i11 = 0;
        String strM5655 = null;
        String strM3711 = null;
        StringBuilder sbM8368 = null;
        String str = "ۡ۠ۢ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56293:
                    strM3711 = C0310.m5976(sArrM1444, 121, i11, 1889);
                    sArrM1444 = m1444();
                    i10 = C0327.f474;
                    str = "۠ۦۨ";
                    break;
                case 56444:
                    i11 = i10 ^ (-228);
                    strM5144 = C0146.m2792(sArrM1444, 149, i11, 3139);
                    C0142.m2728(sbM8368, strM5144);
                    str = "۟۟ۦ";
                    break;
                case 1746694:
                    C0030.m585(sbM8368, zM1447);
                    sArrM1444 = m1444();
                    i10 = C0091.f125;
                    str = "ۡۦۡ";
                    break;
                case 1747743:
                    i11 = i10 ^ (-530);
                    strM1446 = C0397.m7757(sArrM1444, 192, i11, 886);
                    C0142.m2728(sbM8368, strM1446);
                    str = "ۦۢۥ";
                    break;
                case 1747870:
                    i11 = i10 ^ 72;
                    strM1439 = C0295.m5660(sArrM1444, 170, i11, 1024);
                    C0142.m2728(sbM8368, strM1439);
                    str = "ۦۣۤ";
                    break;
                case 1747874:
                    i11 = i10 ^ (-799);
                    sbM8368 = C0427.m8368(strM5655, strM5144, strM3711, strM1439, C0424.m8301(sArrM1444, 129, i11, 2323));
                    str = "ۤۤۥ";
                    break;
                case 1748643:
                    strM5144 = m1436(this);
                    strM1439 = m1439(this);
                    strM1446 = m1446(this);
                    str = "ۧ۟۟";
                    break;
                case 1748828:
                    i11 = i10 ^ (-174);
                    strM3711 = C0172.m3283(sArrM1444, 160, i11, 1871);
                    C0142.m2728(sbM8368, strM3711);
                    str = "۠ۢ";
                    break;
                case 1748834:
                    C0142.m2728(sbM8368, strM1445);
                    sArrM1444 = m1444();
                    i10 = C0288.f432;
                    str = "۠ۢۡ";
                    break;
                case 1748861:
                    i10 = C0212.f235;
                    i11 = i10 ^ 571;
                    strM5655 = C0370.m7239(sArrM1444, 104, i11, 2188);
                    str = "ۧۧ۠";
                    break;
                case 1750781:
                    i11 = i10 ^ (-875);
                    strM5655 = C0412.m8071(sArrM1444, 205, i11, 2119);
                    C0142.m2728(sbM8368, strM5655);
                    str = "ۨ۟ۡ";
                    break;
                case 1751621:
                    zM1438 = m1438(this);
                    strM1443 = m1443(this);
                    sArrM1444 = m1444();
                    str = "ۣۡۧ";
                    break;
                case 1751623:
                    C0030.m585(sbM8368, zM1442);
                    sArrM1444 = m1444();
                    i10 = C0224.f303;
                    str = "ۤ۠";
                    break;
                case 1751653:
                    C0142.m2728(sbM8368, strM1446);
                    sArrM1444 = m1444();
                    i10 = C0481.f754;
                    str = "ۦۤۨ";
                    break;
                case 1752672:
                    C0142.m2728(sbM8368, strM1443);
                    sArrM1444 = m1444();
                    strM3711 = C0194.m3711(sArrM1444, 232, 1, 2032);
                    str = "ۨۤۨ";
                    break;
                case 1753513:
                    C0341.m6676(sbM8368, jM1441);
                    sArrM1444 = m1444();
                    i10 = C0286.f430;
                    str = "ۣۧۡ";
                    break;
                case 1753543:
                    C0142.m2728(sbM8368, strM1440);
                    sArrM1444 = m1444();
                    i10 = C0441.f711;
                    str = "ۧۨۢ";
                    break;
                case 1753578:
                    i11 = i10 ^ (-679);
                    strM5655 = C0294.m5655(sArrM1444, 138, i11, 2606);
                    C0142.m2728(sbM8368, strM5655);
                    str = "ۣۤۦ";
                    break;
                case 1754375:
                    zM1442 = m1442(this);
                    zM1447 = m1447(this);
                    zM1437 = m1437(this);
                    str = "ۨۨۨ";
                    break;
                case 1754624:
                    sArrM1444 = m1444();
                    i10 = C0012.f32;
                    i11 = i10 ^ 938;
                    str = "۟ۤ";
                    break;
                case 1754657:
                    i11 = i10 ^ (-891);
                    C0142.m2728(sbM8368, C0189.m3620(sArrM1444, 181, i11, 3171));
                    str = "ۡۦۧ";
                    break;
                case 1754660:
                    i11 = i10 ^ 928;
                    strM5144 = C0270.m5144(sArrM1444, 218, i11, 2764);
                    C0142.m2728(sbM8368, strM5144);
                    str = "ۥۦۡ";
                    break;
                case 1755338:
                    C0030.m585(sbM8368, zM1438);
                    sArrM1444 = m1444();
                    i10 = C0167.f191;
                    str = "ۧۨۥ";
                    break;
                case 1755500:
                    C0142.m2728(sbM8368, strM3711);
                    return C0441.m8605(sbM8368);
                case 1755624:
                    strM1440 = m1440(this);
                    strM1445 = m1445(this);
                    jM1441 = m1441(this);
                    str = "ۣۤۤ";
                    break;
                default:
                    C0030.m585(sbM8368, zM1437);
                    sArrM1444 = m1444();
                    i10 = C0109.f135;
                    str = "۠ۦۤ";
                    break;
            }
        }
    }
}
