package com.auto.accept.data.model;

import a3.C0006;
import androidx.compose.ui.graphics.C0030;
import androidx.fragment.app.C0042;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0046;
import b7.C0053;
import c1.C0059;
import c1.C0060;
import ca.C0070;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0169;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0214;
import d2.C0216;
import d3.C0217;
import d7.C0221;
import d9.f;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.components.C0244;
import e0.C0257;
import g2.C0287;
import h.C0297;
import i6.C0321;
import ia.C0323;
import j6.C0329;
import java.util.List;
import l0.C0341;
import l6.C0345;
import m1.C0352;
import m5.C0355;
import m9.C0360;
import n.C0361;
import n.C0362;
import n7.C0364;
import n7.C0365;
import o7.i2;
import p3.C0376;
import q5.C0386;
import q7.C0391;
import r5.C0400;
import r6.C0402;
import s2.C0412;
import t2.C0424;
import u.C0429;
import u.C0430;
import u0.C0431;
import u7.C0438;
import v.C0440;
import v0.C0441;
import v5.C0446;
import v8.C0451;
import v9.C0453;
import w.C0454;
import w5.C0464;
import w9.C0466;
import x2.C0468;
import y9.C0479;
import z.C0481;
import z2.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class CouponData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f93short = {1354, 1350, 1357, 1356, 2583, 2566, 2566, 2586, 2591, 2581, 2583, 2580, 2586, 2579, 2598, 2586, 2583, 2584, 2565, 473, 468, 468, 2119, 2123, 2112, 2113, 628, 613, 613, 633, 636, 630, 628, 631, 633, 624, 581, 633, 628, 635, 614, 1657, 1621, 1615, 1610, 1621, 1620, 1662, 1627, 1614, 1627, 1554, 1625, 1621, 1630, 1631, 1543, 2928, 2940, 2872, 2869, 2863, 2879, 2867, 2857, 2866, 2856, 2828, 2873, 2862, 2879, 2873, 2866, 2856, 2913, 2567, 2571, 2639, 2626, 2648, 2632, 2628, 2654, 2629, 2655, 2669, 2626, 2643, 2638, 2639, 2582, 783, 771, 846, 834, 859, 886, 848, 838, 848, 798, 2326, 2330, 2393, 2383, 2376, 2376, 2399, 2388, 2382, 2415, 2377, 2399, 2377, 2311, 3027, 3039, 2974, 2959, 2959, 2963, 2966, 2972, 2974, 2973, 2963, 2970, 2991, 2963, 2974, 2961, 2956, 3010, 1517, 1505, 1444, 1465, 1457, 1448, 1459, 1444, 1458, 1408, 1461, 1532, 1394, 1406, 1335, 1325, 1311, 1341, 1322, 1335, 1320, 1339, 1379, 2712, 2708, 2781, 2759, 2802, 2781, 2758, 2759, 2752, 2784, 2781, 2777, 2769, 2811, 2778, 2776, 2765, 2697, 2261, 2265, 2202, 2187, 2204, 2200, 2189, 2204, 2205, 2232, 2189, 2244, 2286};
    private final List<String> applicablePlans;
    private final String code;
    private final long createdAt;
    private final int currentUses;
    private final int discountFixed;
    private final int discountPercent;
    private final long expiresAt;
    private final boolean isActive;
    private final boolean isFirstTimeOnly;
    private final int maxUses;

    public CouponData() {
        this(null, 0, 0, 0, 0, null, 0L, false, false, 0L, C0297.f444 ^ (-31), null);
        int iM2559 = C0133.m2559();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2559 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0070.m1362("mYQnoZj4XJamFLMNhCgapRyzPA")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public CouponData(String str, int i10, int i11, int i12, int i13, List<String> list, long j10, boolean z10, boolean z11, long j11) {
        C0376.m7360(str, C0451.m8781(m1406(), 0, C0424.f694 ^ 802, 1321));
        C0376.m7360(list, C0323.m6240(m1406(), 4, C0429.f699 ^ 200, 2678));
        this.code = str;
        this.discountPercent = i10;
        this.discountFixed = i11;
        this.maxUses = i12;
        this.currentUses = i13;
        this.applicablePlans = list;
        this.expiresAt = j10;
        this.isActive = z10;
        this.isFirstTimeOnly = z11;
        this.createdAt = j11;
        int iM4495 = C0234.m4495();
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4495 >= 0) {
                        i14 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0133.m2566("wc1YpWuqZs9A89upXq5uGM9o")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i14 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CouponData(String str, int i10, int i11, int i12, int i13, List list, long j10, boolean z10, boolean z11, long j11, int i14, f fVar) {
        String strM8581;
        int i15;
        int i16;
        int i17;
        int i18;
        List listM6195;
        long j12;
        boolean z12;
        int i19 = 1616;
        while (true) {
            i19 ^= 1633;
            switch (i19) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i19 = ((i14 ^ (-2)) & i14) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM8581 = C0440.m8581();
                    int i20 = 1740;
                    while (true) {
                        i20 ^= 1757;
                        switch (i20) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    strM8581 = str;
                    break;
                default:
                    break;
            }
        }
        int i21 = C0137.f163;
        boolean z13 = false;
        int i22 = 1864;
        while (true) {
            i22 ^= 1881;
            switch (i22) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i22 = ((i21 ^ 96) & i14) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    i15 = i10;
                    break;
                case 47417:
                    i15 = 0;
                    int i23 = 48767;
                    while (true) {
                        i23 ^= 48784;
                        switch (i23) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i23 = 48798;
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
        int i24 = C0453.f723;
        int i25 = 48891;
        while (true) {
            i25 ^= 48908;
            switch (i25) {
                case 22:
                    break;
                case 53:
                    i16 = i11;
                    break;
                case 503:
                    i25 = ((i24 ^ (-838)) & i14) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    i16 = 0;
                    int i26 = 49666;
                    while (true) {
                        i26 ^= 49683;
                        switch (i26) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i26 = 49697;
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
        int i27 = C0236.f315;
        int i28 = 49790;
        while (true) {
            i28 ^= 49807;
            switch (i28) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    i17 = i12;
                    break;
                case 84:
                    i17 = 0;
                    int i29 = 49914;
                    while (true) {
                        i29 ^= 49931;
                        switch (i29) {
                            case 497:
                                i29 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i28 = ((i27 ^ (-703)) & i14) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i30 = C0196.f220;
        int i31 = 50689;
        while (true) {
            i31 ^= 50706;
            switch (i31) {
                case 19:
                    i31 = ((i30 ^ 729) & i14) != 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    i18 = i13;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    i18 = 0;
                    int i32 = 50813;
                    while (true) {
                        i32 ^= 50830;
                        switch (i32) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 243:
                                i32 = 50844;
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
        int i33 = C0216.f239;
        int i34 = 51588;
        while (true) {
            i34 ^= 51605;
            switch (i34) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (((i33 ^ (-826)) & i14) != 0) {
                        i34 = 51681;
                    }
                    break;
                case 54:
                    break;
                case 87:
                    listM6195 = list;
                    break;
                case 116:
                    listM6195 = C0321.m6195(C0364.m7119(m1406(), 19, C0402.f672 ^ (-528), 408));
                    int i35 = 51712;
                    while (true) {
                        i35 ^= 51729;
                        switch (i35) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i35 = 51743;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i34 = 51650;
        }
        int i36 = C0454.f724;
        long j13 = 0;
        int i37 = 51836;
        while (true) {
            i37 ^= 51853;
            switch (i37) {
                case 241:
                    i37 = ((i36 ^ 831) & i14) != 0 ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    j12 = j10;
                    break;
                case 2025:
                    j12 = 0;
                    int i38 = 52611;
                    while (true) {
                        i38 ^= 52628;
                        switch (i38) {
                            case 23:
                                i38 = 52642;
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
        int i39 = C0361.f631;
        int i40 = 52735;
        while (true) {
            i40 ^= 52752;
            switch (i40) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    z12 = z10;
                    break;
                case 1007:
                    i40 = ((i39 ^ 610) & i14) != 0 ? 53479 : 52797;
                    break;
                case 7927:
                    z12 = true;
                    int i41 = 53510;
                    while (true) {
                        i41 ^= 53527;
                        switch (i41) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i41 = 53541;
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
        int i42 = C0412.f682;
        int i43 = 53634;
        while (true) {
            i43 ^= 53651;
            switch (i43) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i43 = ((i42 ^ 293) & i14) != 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i44 = 53758;
                    while (true) {
                        i44 ^= 53775;
                        switch (i44) {
                            case 1009:
                                i44 = 54440;
                                continue;
                            case 1703:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    z13 = z11;
                    break;
                default:
                    break;
            }
        }
        int i45 = C0345.f615;
        int i46 = 54533;
        while (true) {
            i46 ^= 54550;
            switch (i46) {
                case 19:
                    i46 = ((i45 ^ 200) & i14) != 0 ? 54626 : 54595;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 85:
                    j13 = j11;
                    break;
                case 116:
                    int i47 = 54657;
                    while (true) {
                        i47 ^= 54674;
                        switch (i47) {
                            case 19:
                                i47 = 54688;
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
        this(strM8581, i15, i16, i17, i18, listM6195, j12, z12, z13, j13);
        int iM2355 = C0122.m2355();
        int i48 = 55432;
        while (true) {
            i48 ^= 55449;
            switch (i48) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM2355 <= 0) {
                        i48 = 55525;
                    }
                    break;
                case 62:
                    break;
                case 95:
                    return;
                case 124:
                    System.out.println(Integer.decode(C0169.m3234("38d5GWH0xglY2qUZU2Zd8JK")));
                    return;
                default:
                    continue;
            }
            i48 = 55494;
        }
    }

    public static /* synthetic */ CouponData copy$default(CouponData couponData, String str, int i10, int i11, int i12, int i13, List list, long j10, boolean z10, boolean z11, long j11, int i14, Object obj) {
        String strM1403;
        int iM1411;
        int iM1410;
        int iM1408;
        int iM1404;
        List listM1412;
        long jM1407;
        boolean zM1402;
        boolean zM1405;
        long jM1409;
        int i15 = 1616;
        while (true) {
            i15 ^= 1633;
            switch (i15) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i15 = ((i14 ^ (-2)) & i14) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM1403 = m1403(couponData);
                    int i16 = 1740;
                    while (true) {
                        i16 ^= 1757;
                        switch (i16) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i16 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    strM1403 = str;
                    break;
                default:
                    break;
            }
        }
        int i17 = C0360.f630;
        int i18 = 1864;
        while (true) {
            i18 ^= 1881;
            switch (i18) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i18 = ((i17 ^ 315) & i14) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    iM1411 = i10;
                    break;
                case 47417:
                    iM1411 = m1411(couponData);
                    int i19 = 48767;
                    while (true) {
                        i19 ^= 48784;
                        switch (i19) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i19 = 48798;
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
        int i20 = C0352.f622;
        int i21 = 48891;
        while (true) {
            i21 ^= 48908;
            switch (i21) {
                case 22:
                    break;
                case 53:
                    iM1410 = i11;
                    break;
                case 503:
                    i21 = ((i20 ^ 530) & i14) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    iM1410 = m1410(couponData);
                    int i22 = 49666;
                    while (true) {
                        i22 ^= 49683;
                        switch (i22) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i22 = 49697;
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
        int i23 = C0046.f66;
        int i24 = 49790;
        while (true) {
            i24 ^= 49807;
            switch (i24) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    iM1408 = i12;
                    break;
                case 84:
                    iM1408 = m1408(couponData);
                    int i25 = 49914;
                    while (true) {
                        i25 ^= 49931;
                        switch (i25) {
                            case 497:
                                i25 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i24 = ((i23 ^ (-822)) & i14) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i26 = C0365.f635;
        int i27 = 50689;
        while (true) {
            i27 ^= 50706;
            switch (i27) {
                case 19:
                    i27 = ((i26 ^ (-758)) & i14) != 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    iM1404 = i13;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    iM1404 = m1404(couponData);
                    int i28 = 50813;
                    while (true) {
                        i28 ^= 50830;
                        switch (i28) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 243:
                                i28 = 50844;
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
        int i29 = C0362.f632;
        int i30 = 51588;
        while (true) {
            i30 ^= 51605;
            switch (i30) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i30 = ((i29 ^ 1) & i14) != 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    listM1412 = list;
                    break;
                case 116:
                    listM1412 = m1412(couponData);
                    int i31 = 51712;
                    while (true) {
                        i31 ^= 51729;
                        switch (i31) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 15:
                            case Code.UNAUTHENTICATED /* 16 */:
                            default:
                                continue;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i31 = 51743;
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i32 = C0129.f155;
        int i33 = 51836;
        while (true) {
            i33 ^= 51853;
            switch (i33) {
                case 241:
                    i33 = ((i32 ^ 688) & i14) != 0 ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    jM1407 = j10;
                    break;
                case 2025:
                    jM1407 = m1407(couponData);
                    int i34 = 52611;
                    while (true) {
                        i34 ^= 52628;
                        switch (i34) {
                            case 23:
                                i34 = 52642;
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
        int i35 = C0119.f145;
        int i36 = 52735;
        while (true) {
            i36 ^= 52752;
            switch (i36) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    zM1402 = z10;
                    break;
                case 1007:
                    i36 = ((i35 ^ 769) & i14) != 0 ? 53479 : 52797;
                    break;
                case 7927:
                    zM1402 = m1402(couponData);
                    int i37 = 53510;
                    while (true) {
                        i37 ^= 53527;
                        switch (i37) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i37 = 53541;
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
        int i38 = C0234.f313;
        int i39 = 53634;
        while (true) {
            i39 ^= 53651;
            switch (i39) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i39 = ((i38 ^ 62) & i14) != 0 ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    zM1405 = m1405(couponData);
                    int i40 = 53758;
                    while (true) {
                        i40 ^= 53775;
                        switch (i40) {
                            case 1009:
                                i40 = 54440;
                                continue;
                            case 1703:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    zM1405 = z11;
                    break;
                default:
                    break;
            }
        }
        int i41 = C0287.f431;
        int i42 = 54533;
        while (true) {
            i42 ^= 54550;
            switch (i42) {
                case 19:
                    if (((i41 ^ 868) & i14) != 0) {
                        i42 = 54626;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 85:
                    jM1409 = j11;
                    break;
                case 116:
                    jM1409 = m1409(couponData);
                    int i43 = 54657;
                    while (true) {
                        i43 ^= 54674;
                        switch (i43) {
                            case 19:
                                i43 = 54688;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i42 = 54595;
        }
        return C0464.m9027(couponData, strM1403, iM1411, iM1410, iM1408, iM1404, listM1412, jM1407, zM1402, zM1405, jM1409);
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1402(Object obj) {
        int iM3565 = C0187.m3565();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3565 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).isActive;
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

    /* JADX INFO: renamed from: ۟ۡۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1403(Object obj) {
        int iM3247 = C0170.m3247();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3247 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).code;
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

    /* JADX INFO: renamed from: ۟ۤۦۦۤ, reason: not valid java name and contains not printable characters */
    public static int m1404(Object obj) {
        int iM3153 = C0164.m3153();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3153 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).currentUses;
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

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1405(Object obj) {
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
                    return ((CouponData) obj).isFirstTimeOnly;
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

    /* JADX INFO: renamed from: ۟ۥۣۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m1406() {
        int iM112 = C0006.m112();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM112 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f93short;
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

    /* JADX INFO: renamed from: ۟ۧۡۧۡ, reason: not valid java name and contains not printable characters */
    public static long m1407(Object obj) {
        int iM2931 = C0152.m2931();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2931 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).expiresAt;
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

    /* JADX INFO: renamed from: ۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1408(Object obj) {
        int iM4678 = C0244.m4678();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4678 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).maxUses;
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

    /* JADX INFO: renamed from: ۠ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static long m1409(Object obj) {
        int iM6350 = C0329.m6350();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6350 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).createdAt;
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

    /* JADX INFO: renamed from: ۡۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1410(Object obj) {
        int iM7828 = C0400.m7828();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7828 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).discountFixed;
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

    /* JADX INFO: renamed from: ۦ۠ۥۤ, reason: contains not printable characters */
    public static int m1411(Object obj) {
        int iM9326 = C0479.m9326();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9326 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).discountPercent;
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

    /* JADX INFO: renamed from: ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m1412(Object obj) {
        int iM3070 = C0160.m3070();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3070 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((CouponData) obj).applicablePlans;
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
        return m1403(this);
    }

    public final long component10() {
        return m1409(this);
    }

    public final int component2() {
        return m1411(this);
    }

    public final int component3() {
        return m1410(this);
    }

    public final int component4() {
        return m1408(this);
    }

    public final int component5() {
        return m1404(this);
    }

    public final List<String> component6() {
        return m1412(this);
    }

    public final long component7() {
        return m1407(this);
    }

    public final boolean component8() {
        return m1402(this);
    }

    public final boolean component9() {
        return m1405(this);
    }

    public final CouponData copy(String str, int i10, int i11, int i12, int i13, List<String> list, long j10, boolean z10, boolean z11, long j11) {
        String strM3519 = null;
        CouponData couponData = null;
        String str2 = "ۢۧۡ";
        short[] sArrM1406 = null;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            switch (C0124.m2383(str2)) {
                case 56359:
                    return couponData;
                case 1746758:
                    str2 = "۠ۢۦ";
                    i14 = C0082.f116;
                    break;
                case 1746848:
                    couponData = new CouponData(str, i10, i11, i12, i13, list, j10, z10, z11, j11);
                    str2 = "ۡۨ";
                    break;
                case 1747748:
                    str2 = "ۣۤۨ";
                    i15 = i14 ^ 381;
                    break;
                case 1749792:
                    str2 = "ۣۤۢ";
                    sArrM1406 = m1406();
                    break;
                case 1749820:
                    str2 = "۟ۡۨ";
                    sArrM1406 = m1406();
                    break;
                case 1751619:
                    str2 = "۟ۨۢ";
                    i14 = C0355.f625;
                    break;
                case 1751774:
                    strM3519 = C0101.m1981(sArrM1406, 26, i15, 533);
                    str2 = "ۦۣ۠";
                    break;
                case 1751775:
                    strM3519 = C0184.m3519(sArrM1406, 22, i15, 2084);
                    str2 = "ۨۦۡ";
                    break;
                case 1753449:
                    C0376.m7360(list, strM3519);
                    str2 = "۟ۤۥ";
                    break;
                case 1755555:
                    C0376.m7360(str, strM3519);
                    str2 = "ۢۦۤ";
                    break;
                default:
                    str2 = "ۤۨۢ";
                    i15 = i14 ^ 294;
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
                    boolean z10 = obj instanceof CouponData;
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
                                CouponData couponData = (CouponData) obj;
                                boolean zM4399 = C0229.m4399(m1403(this), m1403(couponData));
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
                                            int iM1411 = m1411(this);
                                            int iM1412 = m1411(couponData);
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        int iM1410 = m1410(this);
                                                        int iM1413 = m1410(couponData);
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    int iM1408 = m1408(this);
                                                                    int iM1409 = m1408(couponData);
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (iM1408 != iM1409) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                int iM1404 = m1404(this);
                                                                                int iM1405 = m1404(couponData);
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            boolean zM43910 = C0229.m4399(m1412(this), m1412(couponData));
                                                                                            int i17 = 49914;
                                                                                            while (true) {
                                                                                                i17 ^= 49931;
                                                                                                switch (i17) {
                                                                                                    case 497:
                                                                                                        if (!zM43910) {
                                                                                                            i17 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        long jM1407 = m1407(this);
                                                                                                        long jM1408 = m1407(couponData);
                                                                                                        int i18 = 50689;
                                                                                                        while (true) {
                                                                                                            i18 ^= 50706;
                                                                                                            switch (i18) {
                                                                                                                case 19:
                                                                                                                    if (jM1407 != jM1408) {
                                                                                                                        i18 = 50782;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                    boolean zM1402 = m1402(this);
                                                                                                                    boolean zM1403 = m1402(couponData);
                                                                                                                    int i19 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i19 ^= 50830;
                                                                                                                        switch (i19) {
                                                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                boolean zM1405 = m1405(this);
                                                                                                                                boolean zM1406 = m1405(couponData);
                                                                                                                                int i20 = 51588;
                                                                                                                                while (true) {
                                                                                                                                    i20 ^= 51605;
                                                                                                                                    switch (i20) {
                                                                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            if (zM1405 != zM1406) {
                                                                                                                                                i20 = 51681;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 54:
                                                                                                                                            break;
                                                                                                                                        case 87:
                                                                                                                                            long jM1409 = m1409(this);
                                                                                                                                            long jM14010 = m1409(couponData);
                                                                                                                                            int i21 = 51712;
                                                                                                                                            while (true) {
                                                                                                                                                i21 ^= 51729;
                                                                                                                                                switch (i21) {
                                                                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                        break;
                                                                                                                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                        if (jM1409 != jM14010) {
                                                                                                                                                            i21 = 51805;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 47:
                                                                                                                                                        return true;
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
                                                                                                                                if (zM1402 != zM1403) {
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
                                                                                            if (iM1404 != iM1405) {
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
                                                                    if (iM1410 != iM1413) {
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
                                                        if (iM1411 != iM1412) {
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

    public final List<String> getApplicablePlans() {
        return m1412(this);
    }

    public final String getCode() {
        return m1403(this);
    }

    public final long getCreatedAt() {
        return m1409(this);
    }

    public final int getCurrentUses() {
        return m1404(this);
    }

    public final int getDiscountFixed() {
        return m1410(this);
    }

    public final int getDiscountPercent() {
        return m1411(this);
    }

    public final long getExpiresAt() {
        return m1407(this);
    }

    public final int getMaxUses() {
        return m1408(this);
    }

    public int hashCode() {
        long jM1409 = 0;
        String str = "ۤۨ۟";
        List listM1412 = null;
        String strM1403 = null;
        boolean zM1405 = false;
        int i10 = 0;
        int iM7548 = 0;
        int iM7549 = 0;
        int iM1410 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    str = "ۤۨۨ";
                    iM7548 = C0386.m7548(iM1410, iM7549, i10);
                    break;
                case 56420:
                    str = "ۡ۟";
                    iM1410 = m1404(this);
                    break;
                case 1746843:
                    str = "ۣۧ";
                    iM7549 = C0386.m7548(iM1410, iM7548, i10);
                    break;
                case 1747682:
                    str = "ۧۧۢ";
                    iM1410 = C0060.m1146(jM1409);
                    break;
                case 1747900:
                    str = "ۡ۟ۤ";
                    iM7548 = C0446.m8688(zM1405, iM7549, i10);
                    break;
                case 1748614:
                    jM1409 = m1409(this);
                    str = "۠۠ۢ";
                    break;
                case 1748618:
                    str = "ۤ۟ۡ";
                    iM7548 = C0236.f315;
                    break;
                case 1749795:
                    str = "ۡ۟ۨ";
                    iM1410 = C0430.m8418(strM1403);
                    break;
                case 1750538:
                    str = "ۧۦ۟";
                    iM7549 = C0446.m8688(zM1405, iM1410, i10);
                    break;
                case 1750811:
                    jM1409 = m1407(this);
                    str = "ۨۧۦ";
                    break;
                case 1751494:
                    str = "ۤۧۢ";
                    i10 = iM7548 ^ (-682);
                    break;
                case 1751499:
                    str = "ۧۧۤ";
                    iM7549 = 0 - iM1410;
                    break;
                case 1751585:
                    str = "ۣۤۢ";
                    iM7549 = C0386.m7548(iM1410, iM7548, i10);
                    break;
                case 1751589:
                    str = "ۢۨ۠";
                    iM1410 = m1410(this);
                    break;
                case 1751620:
                    str = "۟ۤ۠";
                    iM1410 = m1408(this);
                    break;
                case 1751621:
                    str = "ۤۢ۟";
                    iM1410 = m1411(this);
                    break;
                case 1751622:
                    str = "ۧۨۤ";
                    iM7549 = 0 - iM1410;
                    break;
                case 1751743:
                    str = "ۣۤۤ";
                    iM7548 = iM1410 * i10;
                    break;
                case 1751771:
                    str = "ۢۦۧ";
                    strM1403 = m1403(this);
                    break;
                case 1751780:
                    listM1412 = m1412(this);
                    str = "ۧۦۨ";
                    break;
                case 1753445:
                    return i10;
                case 1753450:
                    str = "ۦ۠۟";
                    i10 = iM7548 - iM7549;
                    break;
                case 1754508:
                    zM1405 = m1402(this);
                    str = "ۣ۟ۦ";
                    break;
                case 1754592:
                    zM1405 = m1405(this);
                    str = "ۣ۠ۧ";
                    break;
                case 1754601:
                    str = "ۤ۟ۦ";
                    iM1410 = C0148.m2842(listM1412);
                    break;
                case 1754626:
                    str = "ۦ۠ۤ";
                    iM7549 = 0 - iM1410;
                    break;
                case 1754628:
                    str = "ۣۤۥ";
                    iM1410 = iM7549 - iM7548;
                    break;
                case 1754659:
                    str = "ۣۨ۠";
                    iM7548 = iM7549 * i10;
                    break;
                case 1755591:
                    str = "ۣۧۨ";
                    iM1410 = C0481.m9363(jM1409, iM7548, i10);
                    break;
                default:
                    str = "ۣۣۤ";
                    iM7548 = C0386.m7548(iM1410, iM7549, i10);
                    break;
            }
        }
    }

    public final boolean isActive() {
        return m1402(this);
    }

    public final boolean isFirstTimeOnly() {
        return m1405(this);
    }

    public String toString() {
        String strM8534 = null;
        int iM1411 = 0;
        int iM1410 = 0;
        int iM1408 = 0;
        int iM1404 = 0;
        List listM1412 = null;
        long jM1407 = 0;
        boolean zM1402 = false;
        boolean zM1405 = false;
        long jM1409 = 0;
        short[] sArrM1406 = null;
        int i10 = 0;
        int i11 = 0;
        StringBuilder sb = null;
        String str = "۟ۦۥ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746910:
                    strM8534 = m1403(this);
                    iM1411 = m1411(this);
                    iM1410 = m1410(this);
                    str = "ۦ۠ۧ";
                    break;
                case 1747805:
                    i11 = i10 ^ 872;
                    sb = new StringBuilder(C0221.m4259(sArrM1406, 41, i11, 1594));
                    str = "ۤ۠ۦ";
                    break;
                case 1747837:
                    C0197.m3772(sb, iM1408);
                    sArrM1406 = m1406();
                    i11 = C0466.f736;
                    str = "ۢۨۢ";
                    break;
                case 1747842:
                    i11 = i10 ^ (-940);
                    strM8534 = C0112.m2172(sArrM1406, 75, i11, 2603);
                    C0142.m2728(sb, strM8534);
                    str = "ۧۥۣ";
                    break;
                case 1747905:
                    iM1404 = iM1410 ^ 975;
                    C0142.m2728(sb, C0217.m4120(sArrM1406, 145, iM1404, 1374));
                    str = "ۣۧۦ";
                    break;
                case 1747934:
                    i10 = iM1411 ^ 368;
                    strM8534 = C0257.m4907(sArrM1406, 156, i10, 2740);
                    C0142.m2728(sb, strM8534);
                    str = "ۦۧۨ";
                    break;
                case 1749575:
                    i11 = i10 ^ (-878);
                    C0142.m2728(sb, C0150.m2874(sArrM1406, 57, i11, 2908));
                    str = "ۦۥ۟";
                    break;
                case 1749640:
                    jM1409 = m1409(this);
                    sArrM1406 = m1406();
                    i10 = C0059.f79;
                    str = "۠ۤۡ";
                    break;
                case 1749759:
                    C0341.m6676(sb, jM1409);
                    sArrM1406 = m1406();
                    strM8534 = C0438.m8534(sArrM1406, 186, 1, 2247);
                    str = "ۨ۟ۤ";
                    break;
                case 1749852:
                    iM1410 = i11 ^ 216;
                    strM8534 = C0053.m1023(sArrM1406, 101, iM1410, 2362);
                    C0142.m2728(sb, strM8534);
                    str = "ۨۥۧ";
                    break;
                case 1750660:
                    i11 = iM1408 ^ (-311);
                    strM8534 = C0042.m829(sArrM1406, 133, i11, 1473);
                    C0142.m2728(sb, strM8534);
                    str = "۠۠";
                    break;
                case 1751525:
                    i11 = iM1408 ^ (-747);
                    C0142.m2728(sb, C0043.m836(sArrM1406, 174, i11, 2297));
                    str = "ۢۥۢ";
                    break;
                case 1751530:
                    C0142.m2728(sb, strM8534);
                    sArrM1406 = m1406();
                    i10 = C0060.f80;
                    str = "ۢ۟ۤ";
                    break;
                case 1752577:
                    jM1407 = m1407(this);
                    zM1402 = m1402(this);
                    zM1405 = m1405(this);
                    str = "ۢۡۧ";
                    break;
                case 1753445:
                    i10 = iM1411 ^ (-398);
                    C0142.m2728(sb, C0188.m3587(sArrM1406, 115, i10, 3071));
                    str = "ۨ۠ۡ";
                    break;
                case 1753453:
                    iM1408 = m1408(this);
                    iM1404 = m1404(this);
                    listM1412 = m1412(this);
                    str = "ۥۣ۟";
                    break;
                case 1753600:
                    C0197.m3772(sb, iM1411);
                    sArrM1406 = m1406();
                    i10 = C0118.f144;
                    str = "۠ۥۧ";
                    break;
                case 1753671:
                    C0030.m585(sb, zM1405);
                    sArrM1406 = m1406();
                    iM1408 = C0485.f758;
                    str = "ۤ۠ۡ";
                    break;
                case 1754506:
                    C0030.m585(sb, zM1402);
                    sArrM1406 = m1406();
                    iM1411 = C0152.f177;
                    str = "۠ۨۦ";
                    break;
                case 1754565:
                    C0197.m3772(sb, iM1410);
                    sArrM1406 = m1406();
                    iM1411 = C0365.f635;
                    str = "ۨۤۡ";
                    break;
                case 1755341:
                    C0142.m2728(sb, strM8534);
                    return C0441.m8605(sb);
                case 1755369:
                    C0214.m4074(sb, listM1412);
                    sArrM1406 = m1406();
                    iM1408 = C0391.f661;
                    str = "ۣۣۤ";
                    break;
                case 1755493:
                    i10 = iM1411 ^ (-752);
                    C0142.m2728(sb, C0431.m8432(sArrM1406, 91, i10, 803));
                    str = "۠ۥۢ";
                    break;
                case 1755530:
                    C0197.m3772(sb, iM1404);
                    sArrM1406 = m1406();
                    iM1411 = C0468.f738;
                    str = "ۦ۠۟";
                    break;
                default:
                    C0341.m6676(sb, jM1407);
                    sArrM1406 = m1406();
                    iM1410 = C0088.f122;
                    str = "۠ۧۨ";
                    break;
            }
        }
    }
}
