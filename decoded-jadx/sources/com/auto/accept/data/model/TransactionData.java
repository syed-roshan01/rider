package com.auto.accept.data.model;

import a.C0001;
import a6.C0007;
import a7.C0008;
import androidx.compose.ui.graphics.C0031;
import androidx.fragment.app.C0042;
import androidx.lifecycle.C0043;
import b1.C0050;
import b3.C0051;
import c1.C0059;
import c1.C0060;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.iid.C0171;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.firebase.tracing.C0204;
import d1.C0212;
import d1.C0213;
import d9.C0222;
import d9.f;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.components.C0229;
import dagger.hilt.components.C0243;
import dagger.hilt.internal.componenttreedeps.C0248;
import e1.C0258;
import e2.C0262;
import g2.C0286;
import ga.C0295;
import h3.C0302;
import h5.C0308;
import i.C0315;
import i5.C0318;
import i6.C0319;
import j6.C0328;
import k7.C0337;
import l0.C0340;
import m5.C0355;
import m7.C0356;
import m9.C0359;
import n.C0361;
import n8.C0365;
import o7.i2;
import p0.C0373;
import p3.C0375;
import p8.C0379;
import q5.C0385;
import r2.C0397;
import rikka.shizuku.C0406;
import s6.C0413;
import t7.C0425;
import t8.C0426;
import u.C0429;
import v.C0439;
import v0.C0440;
import v0.C0443;
import v7.C0449;
import v8.C0450;
import w2.C0458;
import w5.C0462;
import x4.C0468;
import z.C0480;
import z3.C0485;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class TransactionData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f96short = {1304, 1285, 1299, 1298, 1285, 1342, 1299, 313, 293, 296, 295, 285, 304, 313, 300, 434, 437, 416, 437, 436, 434, 2987, 2983, 3005, 3000, 2983, 2982, 2955, 2983, 2988, 2989, 1185, 1204, 1215, 1205, 1208, 1215, 1206, 1806, 1811, 1797, 1796, 1811, 1832, 1797, 3297, 3325, 3312, 3327, 3269, 3304, 3297, 3316, 1054, 1049, 1036, 1049, 1048, 1054, 2398, 2386, 2376, 2381, 2386, 2387, 2430, 2386, 2393, 2392, 1421, 1451, 1464, 1463, 1450, 1464, 1466, 1453, 1456, 1462, 1463, 1437, 1464, 1453, 1464, 1521, 1462, 1451, 1469, 1468, 1451, 1424, 1469, 1508, 3211, 3207, 3287, 3275, 3270, 3273, 3315, 3294, 3287, 3266, 3226, 2977, 2989, 3052, 3040, 3042, 3064, 3043, 3065, 2992, 394, 390, 469, 466, 455, 466, 467, 469, 411, 1386, 1382, 1317, 1321, 1331, 1334, 1321, 1320, 1285, 1321, 1314, 1315, 1403, 1599, 1587, 1655, 1658, 1632, 1648, 1660, 1638, 1661, 1639, 1618, 1662, 1660, 1638, 1661, 1639, 1582, 860, 848, 787, 770, 789, 785, 772, 789, 788, 817, 772, 845, 919, 923, 974, 971, 991, 986, 975, 990, 991, 1018, 975, 902, 2161};
    private final int amount;
    private final String couponCode;
    private final long createdAt;
    private final int discountAmount;
    private final String orderId;
    private final String planType;
    private final String status;
    private final long updatedAt;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionData() {
        long j10 = 0;
        int i10 = 0;
        this(null, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, j10, j10, C0222.f302 ^ 315, 0 == true ? 1 : 0);
        int iM7172 = C0365.m7172();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7172 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0406.m7980("8SnJSgIxJ8pwHN1CSVuGs")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public TransactionData(String str, String str2, int i10, String str3, String str4, int i11, long j10, long j11) {
        C0375.m7360(str, C0007.m155(m1432(), 0, C0361.f632 ^ 38, 1399));
        C0375.m7360(str2, C0355.m6971(m1432(), 7, C0356.f627 ^ 725, 329));
        C0375.m7360(str3, C0449.m8757(m1432(), 15, C0043.f63 ^ 848, 449));
        C0375.m7360(str4, C0243.m4671(m1432(), 21, C0462.f733 ^ 319, 3016));
        this.orderId = str;
        this.planType = str2;
        this.amount = i10;
        this.status = str3;
        this.couponCode = str4;
        this.discountAmount = i11;
        this.createdAt = j10;
        this.updatedAt = j11;
        int iM4421 = C0229.m4421();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4421 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0171.m3273("Q8mpmlj4xqk9wrpkIW0uwAtlVsXbU")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransactionData(String str, String str2, int i10, String str3, String str4, int i11, long j10, long j11, int i12, f fVar) {
        String str5;
        String str6;
        int i13;
        String strM4078;
        String str7;
        long j12;
        String strM8581 = C0439.m8581();
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = ((i12 ^ (-2)) & i12) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 1771;
                                continue;
                            case 54:
                                str5 = strM8581;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    str5 = str;
                    break;
                default:
                    break;
            }
        }
        int i16 = C0302.f450;
        int i17 = 1864;
        while (true) {
            i17 ^= 1881;
            switch (i17) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i17 = ((i16 ^ (-346)) & i12) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    str6 = str2;
                    break;
                case 47417:
                    int i18 = 48767;
                    while (true) {
                        i18 ^= 48784;
                        switch (i18) {
                            case Code.UNAVAILABLE /* 14 */:
                                str6 = strM8581;
                                break;
                            case 239:
                                i18 = 48798;
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        int i19 = C0397.f668;
        int i20 = 0;
        int i21 = 48891;
        while (true) {
            i21 ^= 48908;
            switch (i21) {
                case 22:
                    break;
                case 53:
                    i13 = i10;
                    break;
                case 503:
                    i21 = ((i19 ^ 732) & i12) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    i13 = 0;
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
        int i23 = C0373.f644;
        int i24 = 49790;
        while (true) {
            i24 ^= 49807;
            switch (i24) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    strM4078 = str3;
                    break;
                case 84:
                    strM4078 = C0213.m4078(m1432(), 31, C0112.f138 ^ 575, 1265);
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
                    i24 = ((i23 ^ (-851)) & i12) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i26 = C0425.f696;
        int i27 = 50689;
        while (true) {
            i27 ^= 50706;
            switch (i27) {
                case 19:
                    i27 = ((i26 ^ (-321)) & i12) != 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    str7 = str4;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i28 = 50813;
                    while (true) {
                        i28 ^= 50830;
                        switch (i28) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                str7 = strM8581;
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
        int i29 = C0295.f443;
        int i30 = 51588;
        while (true) {
            i30 ^= 51605;
            switch (i30) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i30 = ((i29 ^ 123) & i12) != 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    i20 = i11;
                    break;
                case 116:
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
        int i32 = C0077.f111;
        long j13 = 0;
        int i33 = 51836;
        while (true) {
            i33 ^= 51853;
            switch (i33) {
                case 241:
                    i33 = ((i32 ^ (-724)) & i12) != 0 ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    j12 = j10;
                    break;
                case 2025:
                    j12 = 0;
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
        int i35 = C0051.f71;
        int i36 = 52735;
        while (true) {
            i36 ^= 52752;
            switch (i36) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    j13 = j11;
                    break;
                case 1007:
                    i36 = ((i35 ^ (-302)) & i12) != 0 ? 53479 : 52797;
                    break;
                case 7927:
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
        this(str5, str6, i13, strM4078, str7, i20, j12, j13);
        int iM6350 = C0328.m6350();
        int i38 = 53634;
        while (true) {
            i38 ^= 53651;
            switch (i38) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM6350 <= 0) {
                        i38 = 53727;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    System.out.println(Integer.valueOf(C0359.m7048("jZtVjnq3MaT7N")));
                    return;
                case 83:
                    return;
                default:
                    continue;
            }
            i38 = 53696;
        }
    }

    public static /* synthetic */ TransactionData copy$default(TransactionData transactionData, String str, String str2, int i10, String str3, String str4, int i11, long j10, long j11, int i12, Object obj) {
        String strM1431;
        String strM1427;
        int iM1435;
        String strM1434;
        String strM1428;
        int iM1429;
        long jM1430;
        long jM1433;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = ((i12 ^ (-2)) & i12) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    strM1431 = m1431(transactionData);
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
                    strM1431 = str;
                    break;
                default:
                    break;
            }
        }
        int i15 = C0379.f650;
        int i16 = 1864;
        while (true) {
            i16 ^= 1881;
            switch (i16) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i16 = ((i15 ^ 316) & i12) != 0 ? 48736 : 48705;
                    break;
                case 47384:
                    strM1427 = str2;
                    break;
                case 47417:
                    strM1427 = m1427(transactionData);
                    int i17 = 48767;
                    while (true) {
                        i17 ^= 48784;
                        switch (i17) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i17 = 48798;
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
        int i18 = C0203.f227;
        int i19 = 48891;
        while (true) {
            i19 ^= 48908;
            switch (i19) {
                case 22:
                    break;
                case 53:
                    iM1435 = i10;
                    break;
                case 503:
                    i19 = ((i18 ^ (-31)) & i12) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    iM1435 = m1435(transactionData);
                    int i20 = 49666;
                    while (true) {
                        i20 ^= 49683;
                        switch (i20) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = 49697;
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
        int i21 = C0091.f125;
        int i22 = 49790;
        while (true) {
            i22 ^= 49807;
            switch (i22) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    strM1434 = str3;
                    break;
                case 84:
                    strM1434 = m1434(transactionData);
                    int i23 = 49914;
                    while (true) {
                        i23 ^= 49931;
                        switch (i23) {
                            case 497:
                                i23 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 241:
                    i22 = ((i21 ^ (-176)) & i12) != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
        }
        int i24 = C0008.f28;
        int i25 = 50689;
        while (true) {
            i25 ^= 50706;
            switch (i25) {
                case 19:
                    i25 = ((i24 ^ (-24)) & i12) != 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    strM1428 = str4;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    strM1428 = m1428(transactionData);
                    int i26 = 50813;
                    while (true) {
                        i26 ^= 50830;
                        switch (i26) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 243:
                                i26 = 50844;
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
        int i27 = C0100.f126;
        int i28 = 51588;
        while (true) {
            i28 ^= 51605;
            switch (i28) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i28 = ((i27 ^ (-538)) & i12) != 0 ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    iM1429 = i11;
                    break;
                case 116:
                    iM1429 = m1429(transactionData);
                    int i29 = 51712;
                    while (true) {
                        i29 ^= 51729;
                        switch (i29) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 15:
                            case Code.UNAUTHENTICATED /* 16 */:
                            default:
                                continue;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i29 = 51743;
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int i30 = C0318.f466;
        int i31 = 51836;
        while (true) {
            i31 ^= 51853;
            switch (i31) {
                case 241:
                    i31 = ((i30 ^ 239) & i12) != 0 ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    jM1430 = j10;
                    break;
                case 2025:
                    jM1430 = m1430(transactionData);
                    int i32 = 52611;
                    while (true) {
                        i32 ^= 52628;
                        switch (i32) {
                            case 23:
                                i32 = 52642;
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
        int i33 = C0133.f159;
        int i34 = 52735;
        while (true) {
            i34 ^= 52752;
            switch (i34) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    jM1433 = j11;
                    break;
                case 1007:
                    if (((i33 ^ 920) & i12) != 0) {
                        i34 = 53479;
                    }
                    break;
                case 7927:
                    jM1433 = m1433(transactionData);
                    int i35 = 53510;
                    while (true) {
                        i35 ^= 53527;
                        switch (i35) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i35 = 53541;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i34 = 52797;
        }
        return C0086.m1838(transactionData, strM1431, strM1427, iM1435, strM1434, strM1428, iM1429, jM1430, jM1433);
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1427(Object obj) {
        int iM8654 = C0443.m8654();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8654 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).planType;
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

    /* JADX INFO: renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1428(Object obj) {
        int iM8107 = C0413.m8107();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8107 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).couponCode;
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

    /* JADX INFO: renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m1429(Object obj) {
        int iM9496 = C0487.m9496();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9496 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).discountAmount;
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

    /* JADX INFO: renamed from: ۟ۤۨ۠۟, reason: not valid java name and contains not printable characters */
    public static long m1430(Object obj) {
        int iM4609 = C0240.m4609();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4609 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).createdAt;
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

    /* JADX INFO: renamed from: ۠ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m1431(Object obj) {
        int iM4051 = C0212.m4051();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4051 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).orderId;
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

    /* JADX INFO: renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1432() {
        int iM5522 = C0286.m5522();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5522 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f96short;
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

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static long m1433(Object obj) {
        int iM8792 = C0450.m8792();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8792 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).updatedAt;
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

    /* JADX INFO: renamed from: ۥۦ۟ۤ, reason: contains not printable characters */
    public static String m1434(Object obj) {
        int iM3105 = C0162.m3105();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3105 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).status;
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

    /* JADX INFO: renamed from: ۣۧ۠, reason: not valid java name and contains not printable characters */
    public static int m1435(Object obj) {
        int iM598 = C0031.m598();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM598 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return ((TransactionData) obj).amount;
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

    public final String component1() {
        return m1431(this);
    }

    public final String component2() {
        return m1427(this);
    }

    public final int component3() {
        return m1435(this);
    }

    public final String component4() {
        return m1434(this);
    }

    public final String component5() {
        return m1428(this);
    }

    public final int component6() {
        return m1429(this);
    }

    public final long component7() {
        return m1430(this);
    }

    public final long component8() {
        return m1433(this);
    }

    public final TransactionData copy(String str, String str2, int i10, String str3, String str4, int i11, long j10, long j11) {
        String strM6103 = null;
        TransactionData transactionData = null;
        String str5 = "\u06e8\u06e5\u06e2";
        short[] sArrM1432 = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            switch (C0124.m2383(str5)) {
                case 56421:
                    str5 = "\u06e5\u06e2";
                    i12 = i13 ^ (-721);
                    break;
                case 56477:
                    strM6103 = C0485.m9450(sArrM1432, 38, i12, 1889);
                    str5 = "\u06e2\u06e3\u06e4";
                    break;
                case 56479:
                    transactionData = new TransactionData(str, str2, i10, str3, str4, i11, j10, j11);
                    str5 = "\u06e4\u06e2\u06e2";
                    break;
                case 1746754:
                    str5 = "\u06df\u06e7\u06e6";
                    i13 = C0262.f342;
                    break;
                case 1746788:
                    str5 = "\u06e7\u06e5\u06e5";
                    i12 = i13 ^ 882;
                    break;
                case 1746816:
                    C0375.m7360(str4, strM6103);
                    str5 = "\u06e5\u06e4";
                    break;
                case 1748677:
                    str5 = "\u06e8\u06e0\u06e0";
                    i12 = i13 ^ (-72);
                    break;
                case 1748706:
                    C0375.m7360(str3, strM6103);
                    str5 = "\u06e8\u06e2\u06e2";
                    break;
                case 1749603:
                    str5 = "\u06e3\u06e8";
                    i13 = C0107.f133;
                    break;
                case 1749699:
                    C0375.m7360(str, strM6103);
                    str5 = "\u06e6\u06e6\u06df";
                    break;
                case 1749734:
                    strM6103 = C0440.m8598(sArrM1432, 53, i12, 1133);
                    str5 = "\u06e1\u06e2\u06e3";
                    break;
                case 1751588:
                    return transactionData;
                case 1751652:
                    C0375.m7360(str2, strM6103);
                    str5 = "\u06e6\u06e8\u06e6";
                    break;
                case 1753631:
                    str5 = "\u06e8\u06e8\u06e8";
                    sArrM1432 = m1432();
                    break;
                case 1753700:
                    str5 = "\u06df\u06e1\u06e4";
                    sArrM1432 = m1432();
                    break;
                case 1754567:
                    strM6103 = C0315.m6103(sArrM1432, 59, i12, 2365);
                    str5 = "\u06df\u06e3\u06e4";
                    break;
                case 1755368:
                    strM6103 = C0118.m2272(sArrM1432, 45, i12, 3217);
                    str5 = "\u06e4\u06e4\u06e4";
                    break;
                case 1755432:
                    str5 = "\u06e8\u06e8\u06e4";
                    sArrM1432 = m1432();
                    break;
                case 1755525:
                    str5 = "\u06e2\u06e0\u06e1";
                    sArrM1432 = m1432();
                    break;
                case 1755620:
                    str5 = "\u06df\u06e2\u06e7";
                    i13 = C0059.f79;
                    break;
                case 1755624:
                    str5 = "\u06e1\u06e1\u06e5";
                    i13 = C0171.f195;
                    break;
                default:
                    str5 = "\u06e2\u06e4\u06e8";
                    i12 = i13 ^ 187;
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
                    boolean z10 = obj instanceof TransactionData;
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
                                TransactionData transactionData = (TransactionData) obj;
                                boolean zM4399 = C0228.m4399(m1431(this), m1431(transactionData));
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
                                            boolean zM43910 = C0228.m4399(m1427(this), m1427(transactionData));
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        int iM1435 = m1435(this);
                                                        int iM1436 = m1435(transactionData);
                                                        int i14 = 48891;
                                                        while (true) {
                                                            i14 ^= 48908;
                                                            switch (i14) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    boolean zM43911 = C0228.m4399(m1434(this), m1434(transactionData));
                                                                    int i15 = 49666;
                                                                    while (true) {
                                                                        i15 ^= 49683;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (!zM43911) {
                                                                                    i15 = 49759;
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                return false;
                                                                            case 83:
                                                                                boolean zM43912 = C0228.m4399(m1428(this), m1428(transactionData));
                                                                                int i16 = 49790;
                                                                                while (true) {
                                                                                    i16 ^= 49807;
                                                                                    switch (i16) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            int iM1429 = m1429(this);
                                                                                            int iM14210 = m1429(transactionData);
                                                                                            int i17 = 49914;
                                                                                            while (true) {
                                                                                                i17 ^= 49931;
                                                                                                switch (i17) {
                                                                                                    case 497:
                                                                                                        if (iM1429 != iM14210) {
                                                                                                            i17 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        long jM1430 = m1430(this);
                                                                                                        long jM1431 = m1430(transactionData);
                                                                                                        int i18 = 50689;
                                                                                                        while (true) {
                                                                                                            i18 ^= 50706;
                                                                                                            switch (i18) {
                                                                                                                case 19:
                                                                                                                    if (jM1430 != jM1431) {
                                                                                                                        i18 = 50782;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                    long jM1433 = m1433(this);
                                                                                                                    long jM1434 = m1433(transactionData);
                                                                                                                    int i19 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i19 ^= 50830;
                                                                                                                        switch (i19) {
                                                                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                return true;
                                                                                                                            case 243:
                                                                                                                                if (jM1433 != jM1434) {
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
                                                                                            if (!zM43912) {
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
                                                                    if (iM1435 != iM1436) {
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

    public final int getAmount() {
        return m1435(this);
    }

    public final String getCouponCode() {
        return m1428(this);
    }

    public final long getCreatedAt() {
        return m1430(this);
    }

    public final int getDiscountAmount() {
        return m1429(this);
    }

    public final String getOrderId() {
        return m1431(this);
    }

    public final String getPlanType() {
        return m1427(this);
    }

    public final String getStatus() {
        return m1434(this);
    }

    public final long getUpdatedAt() {
        return m1433(this);
    }

    public int hashCode() {
        String strM1431 = null;
        long jM1430 = 0;
        String str = "\u06e5\u06e6\u06e7";
        int i10 = 0;
        int iM9363 = 0;
        int iM8923 = 0;
        int iM7548 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56537:
                    jM1430 = m1433(this);
                    str = "\u06e2\u06e6\u06e0";
                    break;
                case 1746693:
                    i10 = iM7548 ^ 164;
                    str = "\u06e3\u06e2\u06e4";
                    break;
                case 1746942:
                    str = "\u06e8\u06e3\u06e7";
                    iM9363 = C0385.m7548(iM7548, iM8923, i10);
                    break;
                case 1747712:
                    str = "\u06e7\u06e0";
                    iM9363 = C0480.m9363(jM1430, iM7548, i10);
                    break;
                case 1748673:
                    return i10;
                case 1749574:
                    str = "\u06e6\u06e6\u06e0";
                    iM7548 = C0385.m7548(iM9363, iM8923, i10);
                    break;
                case 1749606:
                    str = "\u06e6\u06e4\u06e1";
                    iM7548 = C0458.m8923(strM1431, iM9363, i10);
                    break;
                case 1749788:
                    str = "\u06e4\u06e7\u06e4";
                    iM8923 = C0060.m1146(jM1430);
                    break;
                case 1750629:
                    str = "\u06e3\u06e8\u06e5";
                    iM7548 = iM8923 * i10;
                    break;
                case 1750816:
                    strM1431 = m1427(this);
                    str = "\u06e0\u06e1\u06df";
                    break;
                case 1751623:
                    str = "\u06e7\u06e5\u06df";
                    iM8923 = C0429.m8418(strM1431);
                    break;
                case 1751745:
                    str = "\u06e6\u06e2\u06e5";
                    iM7548 = 0 - iM8923;
                    break;
                case 1752678:
                    strM1431 = m1431(this);
                    str = "\u06e4\u06e3\u06e6";
                    break;
                case 1753513:
                    i10 = iM9363 - iM7548;
                    str = "\u06e1\u06e1\u06e1";
                    break;
                case 1753571:
                    strM1431 = m1428(this);
                    str = "\u06e6\u06e7\u06e8";
                    break;
                case 1753600:
                    str = "\u06e2\u06df\u06e3";
                    iM9363 = m1429(this);
                    break;
                case 1753632:
                    jM1430 = m1430(this);
                    str = "\u06e0\u06e1\u06e1";
                    break;
                case 1753671:
                    str = "\u06e6\u06e5\u06df";
                    iM8923 = C0458.m8923(strM1431, iM7548, i10);
                    break;
                case 1754446:
                    str = "\u06df\u06e7\u06e6";
                    iM7548 = m1435(this);
                    break;
                case 1754561:
                    str = "\u06df\u06df\u06e5";
                    iM7548 = C0194.f218;
                    break;
                case 1755468:
                    strM1431 = m1434(this);
                    str = "\u06e2\u06e0\u06e4";
                    break;
                default:
                    str = "\u06e7\u06e1\u06e8";
                    iM8923 = C0458.m8923(strM1431, iM7548, i10);
                    break;
            }
        }
    }

    public String toString() {
        String strM1431 = null;
        String strM1427 = null;
        int iM1435 = 0;
        String strM1434 = null;
        String strM1428 = null;
        int iM1429 = 0;
        long jM1430 = 0;
        long jM1433 = 0;
        short[] sArrM1432 = null;
        int i10 = 0;
        int i11 = 0;
        String strM4755 = null;
        String strM4943 = null;
        String strM980 = null;
        StringBuilder sbM8368 = null;
        String str = "\u06e1\u06e3\u06e1";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56446:
                    strM4755 = C0248.m4755(sArrM1432, 176, 1, 2136);
                    C0142.m2728(sbM8368, strM4755);
                    str = "\u06e8\u06df\u06df";
                    break;
                case 56475:
                    strM4943 = C0258.m4943(sArrM1432, 135, i11, 1555);
                    C0142.m2728(sbM8368, strM4943);
                    str = "\u06e7\u06e3\u06e3";
                    break;
                case 56543:
                    i10 = C0183.f207;
                    i11 = i10 ^ (-891);
                    str = "\u06e5\u06e1\u06e1";
                    break;
                case 1746783:
                    i11 = i10 ^ 199;
                    strM4943 = C0248.m4755(sArrM1432, 93, i11, 3239);
                    str = "\u06e0\u06e4\u06e0";
                    break;
                case 1746814:
                    strM1427 = C0180.m3427(sArrM1432, 152, i10, 880);
                    C0142.m2728(sbM8368, strM1427);
                    str = "\u06e4\u06e4\u06e7";
                    break;
                case 1746878:
                    i11 = i10 ^ (-521);
                    strM980 = C0050.m980(sArrM1432, 104, i11, 2957);
                    str = "\u06e0\u06e0";
                    break;
                case 1747711:
                    sArrM1432 = m1432();
                    i10 = C0125.f151;
                    str = "\u06e0\u06e1\u06e5";
                    break;
                case 1747716:
                    i11 = i10 ^ 817;
                    strM4755 = C0340.m6675(sArrM1432, 69, i11, 1497);
                    str = "\u06e3\u06e2\u06e3";
                    break;
                case 1747804:
                    sArrM1432 = m1432();
                    i10 = C0127.f153;
                    str = "\u06df\u06e5\u06e4";
                    break;
                case 1747927:
                    strM4755 = C0204.m3906(sArrM1432, 113, i11, 422);
                    sArrM1432 = m1432();
                    str = "\u06e7\u06e6";
                    break;
                case 1748711:
                    iM1435 = m1435(this);
                    strM1434 = m1434(this);
                    str = "\u06e2\u06df\u06e5";
                    break;
                case 1748735:
                    strM1431 = m1431(this);
                    strM1427 = m1427(this);
                    str = "\u06e1\u06e2\u06e8";
                    break;
                case 1748863:
                    i11 = C0086.f120;
                    iM1429 = i11 ^ (-773);
                    str = "\u06e4\u06e7\u06e6";
                    break;
                case 1749576:
                    strM1428 = m1428(this);
                    iM1429 = m1429(this);
                    str = "\u06e3\u06e7\u06e2";
                    break;
                case 1750628:
                    sArrM1432 = m1432();
                    i10 = C0319.f467;
                    str = "\u06df\u06e2\u06e2";
                    break;
                case 1750782:
                    jM1430 = m1430(this);
                    jM1433 = m1433(this);
                    str = "\u06e0\u06e1\u06e0";
                    break;
                case 1751585:
                    i10 = C0468.f739;
                    i11 = i10 ^ 288;
                    str = "\u06e0\u06e8\u06df";
                    break;
                case 1751655:
                    C0340.m6676(sbM8368, jM1430);
                    sArrM1432 = m1432();
                    str = "\u06e1\u06e7\u06e5";
                    break;
                case 1751682:
                    iM1435 = C0001.f769;
                    i10 = iM1435 ^ (-990);
                    str = "\u06df\u06e3\u06e2";
                    break;
                case 1751747:
                    strM980 = C0042.m829(sArrM1432, 164, iM1429, 955);
                    C0142.m2728(sbM8368, strM980);
                    str = "\u06e5\u06e3\u06e3";
                    break;
                case 1752517:
                    strM1431 = C0319.m6192(sArrM1432, 122, i11, 1350);
                    C0308.m5953(sbM8368, iM1435, strM4755, strM1434, strM1431);
                    str = "\u06e6\u06e4\u06e5";
                    break;
                case 1752581:
                    C0340.m6676(sbM8368, jM1433);
                    sArrM1432 = m1432();
                    str = "\u06e4\u06e2";
                    break;
                case 1753575:
                    C0142.m2728(sbM8368, strM1428);
                    sArrM1432 = m1432();
                    str = "\u06e7\u06e0\u06e6";
                    break;
                case 1754413:
                    i10 = C0337.f608;
                    i11 = i10 ^ 226;
                    str = "\u06e5\u06e0";
                    break;
                case 1754503:
                    C0197.m3772(sbM8368, iM1429);
                    sArrM1432 = m1432();
                    str = "\u06e4\u06e5\u06e3";
                    break;
                case 1755336:
                    return C0440.m8605(sbM8368);
                default:
                    sbM8368 = C0426.m8368(strM4755, strM1431, strM4943, strM1427, strM980);
                    sArrM1432 = m1432();
                    str = "\u06e4\u06e2\u06df";
                    break;
            }
        }
    }
}
