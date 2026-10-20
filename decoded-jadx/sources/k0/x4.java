package k0;

import a2.C0004;
import a7.C0008;
import android.support.v4.app.C0014;
import androidx.annotation.C0018;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.layout.C0036;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import androidx.preference.C0044;
import androidx.profileinstaller.C0046;
import b8.C0055;
import c0.C0057;
import c1.C0058;
import c1.C0059;
import c7.C0069;
import com.auto.accept.data.model.C0071;
import com.google.android.datatransport.cct.C0076;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.measurement.internal.C0105;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.iid.C0169;
import com.google.firebase.installations.C0177;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.measurement.C0182;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.bind.C0207;
import d.C0210;
import d2.C0215;
import d4.C0217;
import d7.C0220;
import d9.C0223;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.components.C0228;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.componenttreedeps.C0248;
import dagger.hilt.internal.generatesrootinput.C0250;
import e1.C0257;
import e1.C0258;
import e2.C0263;
import e9.C0266;
import fa.C0279;
import fa.C0281;
import g.C0284;
import g5.C0291;
import ga.C0295;
import h.C0297;
import h.C0298;
import h4.C0304;
import h5.C0306;
import h8.C0314;
import i.C0315;
import i9.C0321;
import j2.C0323;
import j2.C0324;
import j3.C0325;
import j4.C0326;
import j9.C0329;
import ja.C0330;
import java.util.List;
import java.util.NoSuchElementException;
import k1.C0332;
import k7.C0337;
import l0.C0339;
import l2.C0341;
import l6.C0343;
import l8.C0345;
import m1.C0350;
import n.C0360;
import n7.C0364;
import o1.C0367;
import o2.C0368;
import p5.C0377;
import p8.C0379;
import q1.C0383;
import q6.C0386;
import r6.C0401;
import s.C0408;
import s0.C0410;
import t0.C0418;
import t3.C0424;
import u4.C0435;
import u7.C0437;
import v9.C0452;
import w.C0453;
import w2.C0458;
import x7.C0472;
import z2.C0484;
import z3.C0485;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements r1.j0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f512short = {854, 871, 890, 886, 836, 875, 871, 878, 870, 2004, 2041, 2042, 2045, 2036, 1439, 1465, 1450, 1442, 1447, 1442, 1445, 1452, 1132, 1102, 1113, 1114, 1109, 1092, 976, 1014, 997, 997, 1002, 1019, 2507, 2530, 2534, 2531, 2542, 2537, 2528, 1081, 1048, 1055, 1029, 631, 603, 600, 600, 593, 599, 576, 605, 603, 602, 532, 599, 603, 602, 576, 597, 605, 602, 583, 532, 602, 603, 532, 593, 600, 593, 601, 593, 602, 576, 532, 601, 597, 576, 599, 604, 605, 602, 595, 532, 576, 604, 593, 532, 580, 582, 593, 592, 605, 599, 597, 576, 593, 538, 1683, 1722, 1726, 1723, 1718, 1713, 1720, 3199, 3161, 3146, 3138, 3143, 3138, 3141, 3148, 623, 589, 602, 601, 598, 583, 578, 612, 631, 631, 632, 617, 1552, 1597, 1598, 1593, 1584, 2125, 2155, 2158, 2158, 2161, 2156, 2154, 2167, 2160, 2169, 1052, 1072, 1075, 1075, 1082, 1084, 1067, 1078, 1072, 1073, 1151, 1084, 1072, 1073, 1067, 1086, 1078, 1073, 1068, 1151, 1073, 1072, 1151, 1082, 1075, 1082, 1074, 1082, 1073, 1067, 1151, 1074, 1086, 1067, 1084, 1079, 1078, 1073, 1080, 1151, 1067, 1079, 1082, 1151, 1071, 1069, 1082, 1083, 1078, 1084, 1086, 1067, 1082, 1137, 1203, 1154, 1183, 1171, 1185, 1166, 1154, 1163, 1155, 709, 740, 739, 761, 1668, 1704, 1705, 1715, 1702, 1710, 1705, 1698, 1717, 2979, 2954, 2958, 2955, 2950, 2945, 2952, 1433, 1471, 1452, 1444, 1441, 1444, 1443, 1450, 2783, 2802, 2801, 2806, 2815, 826, 792, 783, 780, 771, 786, 1293, 1323, 1336, 1336, 1335, 1318, 2574, 2623, 2594, 2606, 2588, 2611, 2623, 2614, 2622, 1437, 1468, 1467, 1441, 2017, 1991, 1986, 1986, 2013, 1984, 1990, 2011, 2012, 2005, 1514, 1478, 1477, 1477, 1484, 1482, 1501, 1472, 1478, 1479, 1417, 1482, 1478, 1479, 1501, 1480, 1472, 1479, 1498, 1417, 1479, 1478, 1417, 1484, 1477, 1484, 1476, 1484, 1479, 1501, 1417, 1476, 1480, 1501, 1482, 1473, 1472, 1479, 1486, 1417, 1501, 1473, 1484, 1417, 1497, 1499, 1484, 1485, 1472, 1482, 1480, 1501, 1484, 1415};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.t0 f9659c;

    public x4(boolean z10, float f10, y.t0 t0Var) {
        this.f9657a = z10;
        this.f9658b = f10;
        this.f9659c = t0Var;
        int iM3713 = C0194.m3713();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3713 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0408.m8018("tGYAH8x7ZQmC")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:145:0x027a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x02b3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:186:0x032a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x0367. Please report as an issue. */
    public static int g(List list, int i10, l0 l0Var) {
        Object obj;
        int i11;
        Object obj2;
        int i12;
        Object obj3;
        int i13;
        Object obj4;
        int i14;
        Object obj5;
        int i15;
        Object obj6;
        int iM8515;
        int iM171 = C0008.m171(list);
        int i16 = 0;
        while (true) {
            int i17 = i16;
            int i18 = 1616;
            while (true) {
                i18 ^= 1633;
                switch (i18) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i18 = i17 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        throw new NoSuchElementException(C0055.m1064(m6442(), 45, C0284.f429 ^ 1006, 564));
                    default:
                        break;
                }
            }
            Object objM6101 = C0315.m6101(list, i17);
            boolean zM4399 = C0228.m4399(C0123.m2381((r1.p) objM6101), C0162.m3093(m6442(), 0, C0210.f234 ^ 352, 770));
            int i19 = 1740;
            while (true) {
                i19 ^= 1757;
                switch (i19) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i19 = zM4399 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        int iM8516 = C0435.m8515((Number) C0364.m7154(l0Var, objM6101, C0057.m1083(i10)));
                        int iM172 = C0008.m171(list);
                        int i20 = 0;
                        while (true) {
                            int i21 = i20;
                            int i22 = 1864;
                            while (true) {
                                i22 ^= 1881;
                                switch (i22) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i22 = i21 < iM172 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        obj = null;
                                        break;
                                    case 47417:
                                        Object objM6102 = C0315.m6101(list, i21);
                                        boolean zM43910 = C0228.m4399(C0123.m2381((r1.p) objM6102), C0205.m3930(m6442(), 9, C0169.f193 ^ 737, 1944));
                                        int i23 = 48767;
                                        while (true) {
                                            i23 ^= 48784;
                                            switch (i23) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    i20 = (C0314.f462 ^ 259) + i21;
                                                    int i24 = 49666;
                                                    while (true) {
                                                        i24 ^= 49683;
                                                        switch (i24) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i24 = 49697;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 76:
                                                    int i25 = 48891;
                                                    while (true) {
                                                        i25 ^= 48908;
                                                        switch (i25) {
                                                            case 22:
                                                                obj = objM6102;
                                                                break;
                                                            case 503:
                                                                i25 = 48922;
                                                                continue;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i23 = zM43910 ? 48860 : 48829;
                                                    break;
                                                default:
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
                        }
                        r1.p pVar = (r1.p) obj;
                        int i26 = 49790;
                        while (true) {
                            i26 ^= 49807;
                            switch (i26) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 51:
                                    i11 = 0;
                                    break;
                                case 84:
                                    int iM8517 = C0435.m8515((Number) C0364.m7154(l0Var, pVar, C0057.m1083(i10)));
                                    int i27 = 49914;
                                    while (true) {
                                        i27 ^= 49931;
                                        switch (i27) {
                                            case 497:
                                                i27 = 50596;
                                                continue;
                                            case 1711:
                                                i11 = iM8517;
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 241:
                                    i26 = pVar != null ? 49883 : 49852;
                                    break;
                                default:
                                    break;
                            }
                        }
                        int iM173 = C0008.m171(list);
                        int i28 = 0;
                        while (true) {
                            int i29 = i28;
                            int i30 = 50689;
                            while (true) {
                                i30 ^= 50706;
                                switch (i30) {
                                    case 19:
                                        i30 = i29 < iM173 ? 50782 : 50751;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        obj2 = null;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 76:
                                        Object objM6103 = C0315.m6101(list, i29);
                                        boolean zM43911 = C0228.m4399(C0123.m2381((r1.p) objM6103), C0489.m9527(m6442(), 14, C0031.f51 ^ (-146), 1483));
                                        int i31 = 50813;
                                        while (true) {
                                            i31 ^= 50830;
                                            switch (i31) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 53:
                                                    i28 = (C0193.f217 ^ 205) + i29;
                                                    int i32 = 51712;
                                                    while (true) {
                                                        i32 ^= 51729;
                                                        switch (i32) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i32 = 51743;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 243:
                                                    i31 = zM43911 ? 51557 : 50875;
                                                    break;
                                                case 4075:
                                                    int i33 = 51588;
                                                    while (true) {
                                                        i33 ^= 51605;
                                                        switch (i33) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i33 = 51619;
                                                                continue;
                                                            case 54:
                                                                obj2 = objM6103;
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
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar2 = (r1.p) obj2;
                        int i34 = 51836;
                        while (true) {
                            i34 ^= 51853;
                            switch (i34) {
                                case 241:
                                    i34 = pVar2 != null ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    i12 = 0;
                                    break;
                                case 2025:
                                    int iM8518 = C0435.m8515((Number) C0364.m7154(l0Var, pVar2, C0057.m1083(i10)));
                                    int i35 = 52611;
                                    while (true) {
                                        i35 ^= 52628;
                                        switch (i35) {
                                            case 23:
                                                i35 = 52642;
                                                continue;
                                            case 54:
                                                i12 = iM8518;
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
                        int iM174 = C0008.m171(list);
                        int i36 = 0;
                        while (true) {
                            int i37 = i36;
                            int i38 = 52735;
                            while (true) {
                                i38 ^= 52752;
                                switch (i38) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        obj3 = null;
                                        break;
                                    case 1007:
                                        i38 = i37 < iM174 ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        Object objM6104 = C0315.m6101(list, i37);
                                        boolean zM43912 = C0228.m4399(C0123.m2381((r1.p) objM6104), C0058.m1102(m6442(), 22, C0401.f672 ^ (-523), 1084));
                                        int i39 = 53510;
                                        while (true) {
                                            i39 ^= 53527;
                                            switch (i39) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i39 = zM43912 ? 53603 : 53572;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    i36 = (C0207.f231 ^ (-620)) + i37;
                                                    int i40 = 53758;
                                                    while (true) {
                                                        i40 ^= 53775;
                                                        switch (i40) {
                                                            case 1009:
                                                                i40 = 54440;
                                                                break;
                                                            case 1703:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 116:
                                                    int i41 = 53634;
                                                    while (true) {
                                                        i41 ^= 53651;
                                                        switch (i41) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i41 = 53665;
                                                                continue;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                obj3 = objM6104;
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
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar3 = (r1.p) obj3;
                        int i42 = 54533;
                        while (true) {
                            i42 ^= 54550;
                            switch (i42) {
                                case 19:
                                    i42 = pVar3 != null ? 54626 : 54595;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 85:
                                    i13 = 0;
                                    break;
                                case 116:
                                    int iM8519 = C0435.m8515((Number) C0364.m7154(l0Var, pVar3, C0057.m1083(i10)));
                                    int i43 = 54657;
                                    while (true) {
                                        i43 ^= 54674;
                                        switch (i43) {
                                            case 19:
                                                i43 = 54688;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                i13 = iM8519;
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
                        int iM175 = C0008.m171(list);
                        int i44 = 0;
                        while (true) {
                            int i45 = i44;
                            int i46 = 55432;
                            while (true) {
                                i46 ^= 55449;
                                switch (i46) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i46 = i45 < iM175 ? 55525 : 55494;
                                        break;
                                    case 62:
                                        break;
                                    case 95:
                                        obj4 = null;
                                        break;
                                    case 124:
                                        Object objM6105 = C0315.m6101(list, i45);
                                        boolean zM43913 = C0228.m4399(C0123.m2381((r1.p) objM6105), C0424.m8319(m6442(), 28, C0113.f139 ^ (-90), 899));
                                        int i47 = 55556;
                                        while (true) {
                                            i47 ^= 55573;
                                            switch (i47) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i47 = zM43913 ? 55649 : 55618;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    i44 = (C0198.f222 ^ 298) + i45;
                                                    int i48 = 56455;
                                                    while (true) {
                                                        i48 ^= 56472;
                                                        switch (i48) {
                                                            case 31:
                                                                i48 = 56486;
                                                                break;
                                                            case 62:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 116:
                                                    int i49 = 55680;
                                                    while (true) {
                                                        i49 ^= 55697;
                                                        switch (i49) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i49 = 56362;
                                                                break;
                                                            case 1467:
                                                                obj4 = objM6105;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar4 = (r1.p) obj4;
                        int i50 = 56579;
                        while (true) {
                            i50 ^= 56596;
                            switch (i50) {
                                case 23:
                                    i50 = pVar4 != null ? 1507472 : 56641;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    i14 = 0;
                                    break;
                                case 1564036:
                                    int iM85110 = C0435.m8515((Number) C0364.m7154(l0Var, pVar4, C0057.m1083(i10)));
                                    int i51 = 1507503;
                                    while (true) {
                                        i51 ^= 1507520;
                                        switch (i51) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                i14 = iM85110;
                                                break;
                                            case 111:
                                                i51 = 1507534;
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
                        int iM176 = C0008.m171(list);
                        int i52 = 0;
                        while (true) {
                            int i53 = i52;
                            int i54 = 1507627;
                            while (true) {
                                i54 ^= 1507644;
                                switch (i54) {
                                    case 23:
                                        i54 = i53 < iM176 ? 1507720 : 1507689;
                                        break;
                                    case 85:
                                        obj5 = null;
                                        break;
                                    case 118:
                                        break;
                                    case 180:
                                        Object objM6106 = C0315.m6101(list, i53);
                                        boolean zM43914 = C0228.m4399(C0123.m2381((r1.p) objM6106), C0084.m1805(m6442(), 34, C0188.f212 ^ 110, 2439));
                                        int i55 = 1507751;
                                        while (true) {
                                            i55 ^= 1507768;
                                            switch (i55) {
                                                case 31:
                                                    i55 = zM43914 ? 1508495 : 1508464;
                                                    break;
                                                case 1335:
                                                    int i56 = 1508526;
                                                    while (true) {
                                                        i56 ^= 1508543;
                                                        switch (i56) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i56 = 1508557;
                                                                break;
                                                            case 114:
                                                                obj5 = objM6106;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1480:
                                                    i52 = (C0248.f328 ^ 60) + i53;
                                                    int i57 = 1508650;
                                                    while (true) {
                                                        i57 ^= 1508667;
                                                        switch (i57) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i57 = 1508681;
                                                                break;
                                                            case 114:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1513:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar5 = (r1.p) obj5;
                        int i58 = 1509425;
                        while (true) {
                            i58 ^= 1509442;
                            switch (i58) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    i15 = 0;
                                    break;
                                case 115:
                                    if (pVar5 != null) {
                                        i58 = 1509518;
                                    }
                                    break;
                                case 204:
                                    int iM85111 = C0435.m8515((Number) C0364.m7154(l0Var, pVar5, C0057.m1083(i10)));
                                    int i59 = 1509549;
                                    while (true) {
                                        i59 ^= 1509566;
                                        switch (i59) {
                                            case 19:
                                                i59 = 1509580;
                                                break;
                                            case 114:
                                                i15 = iM85111;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i58 = 1509487;
                        }
                        int iM177 = C0008.m171(list);
                        int i60 = 0;
                        while (true) {
                            int i61 = i60;
                            int i62 = 1509673;
                            while (true) {
                                i62 ^= 1509690;
                                switch (i62) {
                                    case 19:
                                        i62 = i61 < iM177 ? 1510417 : 1510386;
                                        break;
                                    case 712:
                                        obj6 = null;
                                        break;
                                    case 745:
                                        break;
                                    case 1323:
                                        Object objM6107 = C0315.m6101(list, i61);
                                        boolean zM43915 = C0228.m4399(C0123.m2381((r1.p) objM6107), C0071.m1462(m6442(), 41, C0215.f239 ^ (-798), 1137));
                                        int i63 = 1510448;
                                        while (true) {
                                            i63 ^= 1510465;
                                            switch (i63) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 47:
                                                    i60 = (C0101.f127 ^ 769) + i61;
                                                    int i64 = 1511347;
                                                    while (true) {
                                                        i64 ^= 1511364;
                                                        switch (i64) {
                                                            case 22:
                                                                break;
                                                            case 119:
                                                                i64 = 1511378;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 113:
                                                    i63 = zM43915 ? 1510541 : 1510510;
                                                    break;
                                                case 204:
                                                    int i65 = 1510572;
                                                    while (true) {
                                                        i65 ^= 1510589;
                                                        switch (i65) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i65 = 1510603;
                                                                continue;
                                                            case 118:
                                                                obj6 = objM6107;
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
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar6 = (r1.p) obj6;
                        int i66 = 1511471;
                        while (true) {
                            i66 ^= 1511488;
                            switch (i66) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    iM8515 = 0;
                                    break;
                                case 111:
                                    if (pVar6 != null) {
                                        i66 = 1511564;
                                    }
                                    break;
                                case 204:
                                    iM8515 = C0435.m8515((Number) C0364.m7154(l0Var, pVar6, C0057.m1083(i10)));
                                    break;
                                default:
                                    continue;
                            }
                            i66 = 1511533;
                        }
                        int i67 = (i13 - 17) + i14 + 17;
                        return C0059.m1119((C0059.m1119(((iM8516 - 3) + i67) + 3, C0059.m1119(0 - ((0 - iM8515) - i67), i11)) - (0 - i15)) - (0 - i12), C0090.m1927(C0018.m361()));
                    default:
                        break;
                }
            }
            i16 = (C0324.f472 ^ (-424)) + i17;
            int i68 = 1511595;
            while (true) {
                i68 ^= 1511612;
                switch (i68) {
                    case 23:
                        i68 = 1512277;
                        break;
                    case 1001:
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6442() {
        int iM792 = C0040.m792();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM792 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f512short;
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

    @Override // r1.j0
    public final int a(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM3783 = null;
        int iM849 = 0;
        String str = "\u06e1\u06df\u06e1";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748611:
                    l0VarM3783 = C0197.m3783();
                    str = "\u06e7\u06e0\u06e1";
                    break;
                case 1749671:
                    return iM849;
                default:
                    iM849 = C0044.m849(this, c1Var, list, i10, l0VarM3783);
                    str = "\u06e2\u06e2\u06e7";
                    break;
            }
        }
    }

    @Override // r1.j0
    public final int b(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM7429 = null;
        int iM9191 = 0;
        String str = "\u06e2\u06e8\u06e7";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748617:
                    return iM9191;
                case 1749857:
                    l0VarM7429 = C0379.m7429();
                    str = "\u06e7\u06e4\u06e8";
                    break;
                default:
                    iM9191 = C0472.m9191(list, i10, l0VarM7429);
                    str = "\u06e1\u06df\u06e7";
                    break;
            }
        }
    }

    @Override // r1.j0
    public final int c(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM3812 = null;
        int iM849 = 0;
        String str = "\u06e0\u06e5";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56325:
                    l0VarM3812 = C0199.m3812();
                    str = "\u06e0\u06e1\u06e0";
                    break;
                case 1747711:
                    iM849 = C0044.m849(this, c1Var, list, i10, l0VarM3812);
                    str = "\u06e4\u06e2\u06e6";
                    break;
                default:
                    return iM849;
            }
        }
    }

    @Override // r1.j0
    public final int d(t1.c1 c1Var, List list, int i10) {
        l0 l0VarM7578 = null;
        int iM9191 = 0;
        String str = "\u06e8\u06e1\u06e8";
        while (true) {
            switch (C0124.m2383(str)) {
                case 1754475:
                    iM9191 = C0472.m9191(list, i10, l0VarM7578);
                    str = "\u06e2\u06e8\u06e0";
                    break;
                case 1755407:
                    l0VarM7578 = C0386.m7578();
                    str = "\u06e7\u06e2\u06e6";
                    break;
                default:
                    return iM9191;
            }
        }
    }

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        Object obj;
        r1.x0 x0Var;
        Object obj2;
        r1.x0 x0Var2;
        Object obj3;
        r1.x0 x0Var3;
        Object obj4;
        r1.x0 x0Var4;
        Object obj5;
        r1.x0 x0Var5;
        Object obj6;
        int i10;
        Object obj7;
        r1.x0 x0Var6;
        r1.x0 x0Var7;
        int i11;
        int i12;
        y.t0 t0VarM1346 = C0069.m1346(this);
        int iM2912 = C0152.m2912(l0Var, C0337.m6619(t0VarM1346));
        int iM2913 = C0152.m2912(l0Var, C0087.m1856(t0VarM1346));
        long jM3547 = C0186.m3547(j10, 0, 0, 0, 0, C0152.f177 ^ 360);
        int iM171 = C0008.m171(list);
        int i13 = 0;
        while (true) {
            int i14 = i13;
            int i15 = 1616;
            while (true) {
                i15 ^= 1633;
                switch (i15) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i15 = i14 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        Object objM6101 = C0315.m6101(list, i14);
                        boolean zM4399 = C0228.m4399(C0368.m7238((r1.i0) objM6101), C0113.m2192(m6442(), 99, C0383.f654 ^ (-51), 1759));
                        int i16 = 1740;
                        while (true) {
                            i16 ^= 1757;
                            switch (i16) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i16 = zM4399 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i13 = (C0121.f147 ^ 599) + i14;
                                    int i17 = 48767;
                                    while (true) {
                                        i17 ^= 48784;
                                        switch (i17) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i17 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i18 = 1864;
                                    while (true) {
                                        i18 ^= 1881;
                                        switch (i18) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i18 = 48674;
                                                continue;
                                            case 47483:
                                                obj = objM6101;
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
                        break;
                    case 239:
                        obj = null;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var = (r1.i0) obj;
        int i19 = 48891;
        while (true) {
            i19 ^= 48908;
            switch (i19) {
                case 22:
                    break;
                case 53:
                    x0Var = null;
                    break;
                case 503:
                    i19 = i0Var != null ? 49635 : 48953;
                    break;
                case 32495:
                    r1.x0 x0VarM8844 = C0453.m8844(i0Var, jM3547);
                    int i20 = 49666;
                    while (true) {
                        i20 ^= 49683;
                        switch (i20) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i20 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                x0Var = x0VarM8844;
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
        int iM4386 = C0227.m4386(x0Var);
        int iM1119 = C0059.m1119(0, C0332.m6460(x0Var));
        int iM172 = C0008.m171(list);
        int i21 = 0;
        while (true) {
            int i22 = i21;
            int i23 = 49790;
            while (true) {
                i23 ^= 49807;
                switch (i23) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        obj2 = null;
                        break;
                    case 84:
                        Object objM6102 = C0315.m6101(list, i22);
                        boolean zM43910 = C0228.m4399(C0368.m7238((r1.i0) objM6102), C0182.m3474(m6442(), 106, C0169.f193 ^ 748, 3115));
                        int i24 = 49914;
                        while (true) {
                            i24 ^= 49931;
                            switch (i24) {
                                case 497:
                                    i24 = zM43910 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    i21 = (C0279.f424 ^ (-117)) + i22;
                                    int i25 = 50813;
                                    while (true) {
                                        i25 ^= 50830;
                                        switch (i25) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i25 = 50844;
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    int i26 = 50689;
                                    while (true) {
                                        i26 ^= 50706;
                                        switch (i26) {
                                            case 19:
                                                i26 = 50720;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                obj2 = objM6102;
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
                        break;
                    case 241:
                        i23 = i22 < iM172 ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var2 = (r1.i0) obj2;
        int i27 = C0183.f207;
        int i28 = 51588;
        while (true) {
            i28 ^= 51605;
            switch (i28) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i28 = i0Var2 != null ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    x0Var2 = null;
                    break;
                case 116:
                    r1.x0 x0VarM8845 = C0453.m8844(i0Var2, C0339.m6666(jM3547, -iM4386, 0, i27 ^ (-886)));
                    int i29 = 51712;
                    while (true) {
                        i29 ^= 51729;
                        switch (i29) {
                            case Code.UNAVAILABLE /* 14 */:
                                x0Var2 = x0VarM8845;
                                break;
                            case 15:
                            case Code.UNAUTHENTICATED /* 16 */:
                            default:
                                continue;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i29 = 51743;
                                continue;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int iM4387 = ((C0227.m4386(x0Var2) + 11) + iM4386) - 11;
        int iM11110 = C0059.m1119(iM1119, C0332.m6460(x0Var2));
        int iM173 = C0008.m171(list);
        int i30 = 0;
        while (true) {
            int i31 = i30;
            int i32 = 51836;
            while (true) {
                i32 ^= 51853;
                switch (i32) {
                    case 241:
                        i32 = i31 < iM173 ? 52580 : 52549;
                        break;
                    case 1963:
                        break;
                    case 1992:
                        obj3 = null;
                        break;
                    case 2025:
                        Object objM6103 = C0315.m6101(list, i31);
                        boolean zM43911 = C0228.m4399(C0368.m7238((r1.i0) objM6103), C0142.m2731(m6442(), 114, C0330.f478 ^ 379, 575));
                        int i33 = 52611;
                        while (true) {
                            i33 ^= 52628;
                            switch (i33) {
                                case 23:
                                    i33 = zM43911 ? 52704 : 52673;
                                    break;
                                case 54:
                                    break;
                                case 85:
                                    i30 = (C0244.f324 ^ 517) + i31;
                                    int i34 = 53510;
                                    while (true) {
                                        i34 ^= 53527;
                                        switch (i34) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i34 = 53541;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                case 116:
                                    int i35 = 52735;
                                    while (true) {
                                        i35 ^= 52752;
                                        switch (i35) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                obj3 = objM6103;
                                                break;
                                            case 1007:
                                                i35 = 52766;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var3 = (r1.i0) obj3;
        int i36 = 53634;
        while (true) {
            i36 ^= 53651;
            switch (i36) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i36 = i0Var3 != null ? 53727 : 53696;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    r1.x0 x0VarM8846 = C0453.m8844(i0Var3, C0339.m6666(jM3547, -iM4387, 0, C0198.f222 ^ 297));
                    int i37 = 53758;
                    while (true) {
                        i37 ^= 53775;
                        switch (i37) {
                            case 1009:
                                i37 = 54440;
                                continue;
                            case 1703:
                                x0Var3 = x0VarM8846;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 83:
                    x0Var3 = null;
                    break;
                default:
                    break;
            }
        }
        int iM4388 = (C0227.m4386(x0Var3) - 30) + iM4387 + 30;
        int iM11111 = C0059.m1119(iM11110, C0332.m6460(x0Var3));
        int iM174 = C0008.m171(list);
        int i38 = 0;
        while (true) {
            int i39 = i38;
            int i40 = 54533;
            while (true) {
                i40 ^= 54550;
                switch (i40) {
                    case 19:
                        i40 = i39 < iM174 ? 54626 : 54595;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 85:
                        obj4 = null;
                        break;
                    case 116:
                        Object objM6104 = C0315.m6101(list, i39);
                        boolean zM43912 = C0228.m4399(C0368.m7238((r1.i0) objM6104), C0165.m3159(m6442(), 120, C0326.f474 ^ (-786), 529));
                        int i41 = 54657;
                        while (true) {
                            i41 ^= 54674;
                            switch (i41) {
                                case 19:
                                    i41 = zM43912 ? 55401 : 54719;
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    i38 = (C0258.f338 ^ 741) + i39;
                                    int i42 = 55556;
                                    while (true) {
                                        i42 ^= 55573;
                                        switch (i42) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i42 = 55587;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 3579:
                                    int i43 = 55432;
                                    while (true) {
                                        i43 ^= 55449;
                                        switch (i43) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i43 = 55463;
                                                continue;
                                            case 62:
                                                obj4 = objM6104;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var4 = (r1.i0) obj4;
        int i44 = 55680;
        while (true) {
            i44 ^= 55697;
            switch (i44) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i44 = i0Var4 != null ? 56424 : 56393;
                    break;
                case 1467:
                    break;
                case 1496:
                    x0Var4 = null;
                    break;
                case 1529:
                    r1.x0 x0VarM8847 = C0453.m8844(i0Var4, C0339.m6666(jM3547, -iM4388, 0, C0004.f1062 ^ (-222)));
                    int i45 = 56455;
                    while (true) {
                        i45 ^= 56472;
                        switch (i45) {
                            case 31:
                                i45 = 56486;
                                continue;
                            case 62:
                                x0Var4 = x0VarM8847;
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
        int iM4389 = C0227.m4386(x0Var4);
        int iM11112 = C0059.m1119(iM11111, C0332.m6460(x0Var4));
        int i46 = -(((iM4389 + 28) + iM4388) - 28);
        long jM6705 = C0341.m6705(jM3547, i46, -iM2913);
        int iM175 = C0008.m171(list);
        int i47 = 0;
        while (true) {
            int i48 = i47;
            int i49 = 56579;
            while (true) {
                i49 ^= 56596;
                switch (i49) {
                    case 23:
                        i49 = i48 < iM175 ? 1507472 : 56641;
                        break;
                    case 54:
                        break;
                    case 85:
                        obj5 = null;
                        break;
                    case 1564036:
                        Object objM6105 = C0315.m6101(list, i48);
                        boolean zM43913 = C0228.m4399(C0368.m7238((r1.i0) objM6105), C0036.m713(m6442(), 126, C0246.f326 ^ (-649), 1628));
                        int i50 = 1507503;
                        while (true) {
                            i50 ^= 1507520;
                            switch (i50) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    i47 = (C0297.f445 ^ (-489)) + i48;
                                    int i51 = 1507751;
                                    while (true) {
                                        i51 ^= 1507768;
                                        switch (i51) {
                                            case 31:
                                                i51 = 1508433;
                                                break;
                                            case 1513:
                                                break;
                                        }
                                    }
                                    break;
                                case 111:
                                    i50 = zM43913 ? 1507596 : 1507565;
                                    break;
                                case 460:
                                    int i52 = 1507627;
                                    while (true) {
                                        i52 ^= 1507644;
                                        switch (i52) {
                                            case 23:
                                                i52 = 1507658;
                                                continue;
                                            case 118:
                                                obj5 = objM6105;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var5 = (r1.i0) obj5;
        int i53 = 1508526;
        while (true) {
            i53 ^= 1508543;
            switch (i53) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i53 = i0Var5 != null ? 1508619 : 1508588;
                    break;
                case 83:
                    x0Var5 = null;
                    break;
                case 114:
                    break;
                case 436:
                    r1.x0 x0VarM8848 = C0453.m8844(i0Var5, jM6705);
                    int i54 = 1508650;
                    while (true) {
                        i54 ^= 1508667;
                        switch (i54) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i54 = 1508681;
                                continue;
                            case 114:
                                x0Var5 = x0VarM8848;
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
        int iM176 = C0008.m171(list);
        int i55 = 0;
        while (true) {
            int i56 = i55;
            int i57 = 1509425;
            while (true) {
                i57 ^= 1509442;
                switch (i57) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        obj6 = null;
                        break;
                    case 115:
                        i57 = i56 < iM176 ? 1509518 : 1509487;
                        break;
                    case 204:
                        Object objM6106 = C0315.m6101(list, i56);
                        boolean zM43914 = C0228.m4399(C0368.m7238((r1.i0) objM6106), C0166.m3169(m6442(), 131, C0418.f689 ^ 239, 2078));
                        int i58 = 1509549;
                        while (true) {
                            i58 ^= 1509566;
                            switch (i58) {
                                case 19:
                                    i58 = zM43914 ? 1509642 : 1509611;
                                    break;
                                case 85:
                                    i55 = (C0220.f300 ^ (-126)) + i56;
                                    int i59 = 1510448;
                                    while (true) {
                                        i59 ^= 1510465;
                                        switch (i59) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 113:
                                                i59 = 1510479;
                                                break;
                                        }
                                    }
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    int i60 = 1509673;
                                    while (true) {
                                        i60 ^= 1509690;
                                        switch (i60) {
                                            case 19:
                                                i60 = 1510355;
                                                continue;
                                            case 745:
                                                obj6 = objM6106;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var6 = (r1.i0) obj6;
        int i61 = 1510572;
        while (true) {
            i61 ^= 1510589;
            switch (i61) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i61 = i0Var6 != null ? 1511316 : 1510634;
                    break;
                case 87:
                    i10 = 0;
                    break;
                case 118:
                    break;
                case 809:
                    int iM161 = C0008.m161(i0Var6, C0090.m1927(j10));
                    int i62 = 1511347;
                    while (true) {
                        i62 ^= 1511364;
                        switch (i62) {
                            case 22:
                                i10 = iM161;
                                break;
                            case 119:
                                i62 = 1511378;
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
        int iM6460 = iM2912 - (0 - C0332.m6460(x0Var5));
        long jM6706 = C0341.m6705(C0186.m3547(j10, 0, 0, 0, 0, C0458.f729 ^ (-318)), i46, ((((((-iM6460) - 1) - iM2913) + 1) - 19) - i10) + 19);
        int iM177 = C0008.m171(list);
        int i63 = 0;
        while (true) {
            int i64 = i63;
            String strM5911 = C0306.m5911(m6442(), 141, C0437.f708 ^ (-865), 1119);
            int i65 = 1511471;
            while (true) {
                i65 ^= 1511488;
                switch (i65) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        throw new NoSuchElementException(strM5911);
                    case 111:
                        i65 = i64 < iM177 ? 1511564 : 1511533;
                        break;
                    case 204:
                        break;
                    default:
                        break;
                }
            }
            r1.i0 i0Var7 = (r1.i0) C0315.m6101(list, i64);
            boolean zM43915 = C0228.m4399(C0368.m7238(i0Var7), C0323.m6250(m6442(), 195, C0227.f307 ^ (-903), 1255));
            int i66 = 1511595;
            while (true) {
                i66 ^= 1511612;
                switch (i66) {
                    case 23:
                        i66 = zM43915 ? 1512339 : 1512308;
                        break;
                    case 815:
                        r1.x0 x0VarM8849 = C0453.m8844(i0Var7, jM6706);
                        long jM3548 = C0186.m3547(jM6706, 0, 0, 0, 0, C0186.f210 ^ (-326));
                        int iM178 = C0008.m171(list);
                        int i67 = 0;
                        while (true) {
                            int i68 = i67;
                            int i69 = 1512370;
                            while (true) {
                                i69 ^= 1512387;
                                switch (i69) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 51:
                                        obj7 = null;
                                        break;
                                    case 113:
                                        i69 = i68 < iM178 ? 1512463 : 1512432;
                                        break;
                                    case 1996:
                                        Object objM6107 = C0315.m6101(list, i68);
                                        boolean zM43916 = C0228.m4399(C0368.m7238((r1.i0) objM6107), C0343.m6742(m6442(), 204, C0055.f75 ^ (-707), 653));
                                        int i70 = 1512494;
                                        while (true) {
                                            i70 ^= 1512511;
                                            switch (i70) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i70 = zM43916 ? 1513238 : 1512556;
                                                    break;
                                                case 83:
                                                    i67 = (C0106.f132 ^ (-235)) + i68;
                                                    int i71 = 1513393;
                                                    while (true) {
                                                        i71 ^= 1513410;
                                                        switch (i71) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 115:
                                                                i71 = 1513424;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 114:
                                                    break;
                                                case 809:
                                                    int i72 = 1513269;
                                                    while (true) {
                                                        i72 ^= 1513286;
                                                        switch (i72) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                obj7 = objM6107;
                                                                break;
                                                            case 115:
                                                                i72 = 1513300;
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
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.i0 i0Var8 = (r1.i0) obj7;
                        int i73 = 1513517;
                        while (true) {
                            i73 ^= 1513534;
                            switch (i73) {
                                case 19:
                                    if (i0Var8 != null) {
                                        i73 = 1514261;
                                    }
                                    break;
                                case 712:
                                    x0Var6 = null;
                                    break;
                                case 745:
                                    break;
                                case 811:
                                    r1.x0 x0VarM88410 = C0453.m8844(i0Var8, jM3548);
                                    int i74 = 1514292;
                                    while (true) {
                                        i74 ^= 1514309;
                                        switch (i74) {
                                            case 22:
                                                x0Var6 = x0VarM88410;
                                                break;
                                            case 113:
                                                i74 = 1514323;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i73 = 1514230;
                        }
                        int iM11113 = C0059.m1119(iM11112, (iM6460 - (0 - C0059.m1119(C0332.m6460(x0VarM8849), C0332.m6460(x0Var6)))) - (0 - iM2913));
                        int iM43810 = C0227.m4386(x0Var);
                        int iM43811 = C0227.m4386(x0Var2);
                        int iM43812 = C0227.m4386(x0Var3) - (0 - C0227.m4386(x0Var4));
                        int iM11114 = C0059.m1119(((iM43810 - (0 - C0059.m1119(((C0076.m1647(x0VarM8849) - 12) + iM43812) + 12, C0059.m1119(iM43812 - (0 - C0227.m4386(x0Var6)), C0227.m4386(x0Var5))))) - 8) + iM43811 + 8, C0090.m1927(j10));
                        long jM3549 = C0186.m3547(C0339.m6666(jM3547, 0, -iM11113, 1), 0, iM11114, 0, 0, C0304.f452 ^ 27);
                        int i75 = 1514416;
                        while (true) {
                            i75 ^= 1514433;
                            switch (i75) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    x0Var7 = null;
                                    break;
                                case 113:
                                    i75 = i0Var6 != null ? 1515160 : 1514478;
                                    break;
                                case 1369:
                                    r1.x0 x0VarM88411 = C0453.m8844(i0Var6, jM3549);
                                    int i76 = 1515191;
                                    while (true) {
                                        i76 ^= 1515208;
                                        switch (i76) {
                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                x0Var7 = x0VarM88411;
                                                break;
                                            case 127:
                                                i76 = 1515222;
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
                        int iM6461 = C0332.m6460(x0Var7);
                        int iM4801 = C0250.m4801(C0350.m6867(x0VarM8849), C0332.m6460(x0Var5), C0332.m6460(x0Var), C0332.m6460(x0Var2), C0332.m6460(x0Var3), C0332.m6460(x0Var4), C0332.m6460(x0Var6), C0332.m6460(x0Var7), C0014.m281(this), j10, C0223.m4299(l0Var), C0069.m1346(this));
                        int i77 = ((iM4801 + 27) - iM6461) - 27;
                        int iM179 = C0008.m171(list);
                        int i78 = 0;
                        while (true) {
                            int i79 = i78;
                            int i80 = 1515315;
                            while (true) {
                                i80 ^= 1515332;
                                switch (i80) {
                                    case 22:
                                        break;
                                    case 53:
                                        throw new NoSuchElementException(strM5911);
                                    case 119:
                                        i80 = i79 < iM179 ? 1515408 : 1515377;
                                        break;
                                    case 212:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            r1.i0 i0Var9 = (r1.i0) C0315.m6101(list, i79);
                            boolean zM43917 = C0228.m4399(C0368.m7238(i0Var9), C0298.m5745(m6442(), 208, C0337.f608 ^ 250, 1735));
                            int i81 = 1515439;
                            while (true) {
                                i81 ^= 1515456;
                                switch (i81) {
                                    case 111:
                                        i81 = zM43917 ? 1516183 : 1516152;
                                        break;
                                    case 15703:
                                        int i82 = 1516214;
                                        while (true) {
                                            i82 ^= 1516231;
                                            switch (i82) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case 51:
                                                    i11 = 0;
                                                    break;
                                                case 113:
                                                    i82 = iM11114 != Integer.MAX_VALUE ? 1516307 : 1516276;
                                                    break;
                                                case 468:
                                                    int i83 = 1516338;
                                                    while (true) {
                                                        i83 ^= 1516355;
                                                        switch (i83) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                i11 = iM11114;
                                                                break;
                                                            case 113:
                                                                i83 = 1516369;
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
                                        int i84 = 1537294;
                                        while (true) {
                                            i84 ^= 1537311;
                                            switch (i84) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (i77 != Integer.MAX_VALUE) {
                                                        i84 = 1537387;
                                                    }
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    i12 = 0;
                                                    break;
                                                case 116:
                                                    int i85 = 1537418;
                                                    while (true) {
                                                        i85 ^= 1537435;
                                                        switch (i85) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i85 = 1537449;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                i12 = i77;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i84 = 1537356;
                                        }
                                        return C0410.m8048(l0Var, iM11114, iM4801, C0127.m2452(), new w4(x0Var5, iM11114, iM4801, x0VarM8849, x0Var6, x0Var, x0Var2, x0Var3, x0Var4, C0453.m8844(i0Var9, C0175.m3332(i11, iM11114, i12, i77)), x0Var7, this, iM2912, l0Var));
                                    case 15769:
                                        break;
                                    case 15800:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i78 = (C0263.f343 ^ 537) + i79;
                            int i86 = 1537542;
                            while (true) {
                                i86 ^= 1537559;
                                switch (i86) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i86 = 1538224;
                                        break;
                                    case 3751:
                                        break;
                                }
                            }
                        }
                        break;
                    case 968:
                        break;
                    case 1001:
                        break;
                    default:
                        break;
                }
            }
            i63 = (C0079.f113 ^ (-555)) + i64;
            int i87 = 1538317;
            while (true) {
                i87 ^= 1538334;
                switch (i87) {
                    case 19:
                        i87 = 1538348;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:322:0x054e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:331:0x058a. Please report as an issue. */
    public final int f(t1.c1 c1Var, List list, int i10, l0 l0Var) {
        Object obj;
        int iM8515;
        int i11;
        Object obj2;
        int iM8516;
        int i12;
        Object obj3;
        int iM8517;
        Object obj4;
        int iM8518;
        int i13;
        Object obj5;
        int iM8519;
        int i14;
        Object obj6;
        int iM85110;
        Object obj7;
        int iM85111;
        int i15;
        int iM171 = C0008.m171(list);
        int i16 = 0;
        while (true) {
            int i17 = i16;
            int i18 = 1616;
            while (true) {
                i18 ^= 1633;
                switch (i18) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i18 = i17 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        Object objM6101 = C0315.m6101(list, i17);
                        boolean zM4399 = C0228.m4399(C0123.m2381((r1.p) objM6101), C0329.m6355(m6442(), 217, C0177.f201 ^ 464, 3055));
                        int i19 = 1740;
                        while (true) {
                            i19 ^= 1757;
                            switch (i19) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i19 = zM4399 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i16 = (C0217.f241 ^ 979) + i17;
                                    int i20 = 48767;
                                    while (true) {
                                        i20 ^= 48784;
                                        switch (i20) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i20 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i21 = 1864;
                                    while (true) {
                                        i21 ^= 1881;
                                        switch (i21) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i21 = 48674;
                                                continue;
                                            case 47483:
                                                obj = objM6101;
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
                        break;
                    case 239:
                        obj = null;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar = (r1.p) obj;
        int i22 = (-2147483104) ^ C0367.f638;
        int i23 = 48891;
        while (true) {
            i23 ^= 48908;
            switch (i23) {
                case 22:
                    break;
                case 53:
                    iM8515 = 0;
                    i11 = i10;
                    break;
                case 503:
                    i23 = pVar != null ? 49635 : 48953;
                    break;
                case 32495:
                    int iM420 = C0021.m420(pVar, i22);
                    int i24 = 49666;
                    while (true) {
                        i24 ^= 49683;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = i10 == i22 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i25 = 49790;
                                while (true) {
                                    i25 ^= 49807;
                                    switch (i25) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            i15 = i10;
                                            break;
                                        case 241:
                                            i25 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i15 = ((i10 - 24) - iM420) + 24;
                                break;
                            default:
                                break;
                        }
                    }
                    iM8515 = C0435.m8515((Number) C0364.m7154(l0Var, pVar, C0057.m1083(i10)));
                    int i26 = 49914;
                    while (true) {
                        i26 ^= 49931;
                        switch (i26) {
                            case 497:
                                i26 = 50596;
                                continue;
                            case 1711:
                                i11 = i15;
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
        int iM172 = C0008.m171(list);
        int i27 = 0;
        while (true) {
            int i28 = i27;
            int i29 = 50689;
            while (true) {
                i29 ^= 50706;
                switch (i29) {
                    case 19:
                        i29 = i28 < iM172 ? 50782 : 50751;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        obj2 = null;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        Object objM6102 = C0315.m6101(list, i28);
                        boolean zM43910 = C0228.m4399(C0123.m2381((r1.p) objM6102), C0321.m6216(m6442(), 224, C0484.f758 ^ (-751), 1485));
                        int i30 = 50813;
                        while (true) {
                            i30 ^= 50830;
                            switch (i30) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    break;
                                case 53:
                                    i27 = (C0325.f473 ^ 370) + i28;
                                    int i31 = 51712;
                                    while (true) {
                                        i31 ^= 51729;
                                        switch (i31) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i31 = 51743;
                                                break;
                                        }
                                    }
                                    break;
                                case 243:
                                    i30 = zM43910 ? 51557 : 50875;
                                    break;
                                case 4075:
                                    int i32 = 51588;
                                    while (true) {
                                        i32 ^= 51605;
                                        switch (i32) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i32 = 51619;
                                                continue;
                                            case 54:
                                                obj2 = objM6102;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar2 = (r1.p) obj2;
        int i33 = 51836;
        while (true) {
            i33 ^= 51853;
            switch (i33) {
                case 241:
                    i33 = pVar2 != null ? 52580 : 52549;
                    break;
                case 1963:
                    break;
                case 1992:
                    iM8516 = 0;
                    i12 = i11;
                    break;
                case 2025:
                    int iM421 = C0021.m420(pVar2, i22);
                    int i34 = 52611;
                    while (true) {
                        i34 ^= 52628;
                        switch (i34) {
                            case 23:
                                i34 = i11 == i22 ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                i11 = ((i11 - 8) - iM421) + 8;
                                break;
                            case 116:
                                int i35 = 52735;
                                while (true) {
                                    i35 ^= 52752;
                                    switch (i35) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 1007:
                                            i35 = 52766;
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
                    iM8516 = C0435.m8515((Number) C0364.m7154(l0Var, pVar2, C0057.m1083(i10)));
                    int i36 = 53510;
                    while (true) {
                        i36 ^= 53527;
                        switch (i36) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i36 = 53541;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                i12 = i11;
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
        int iM173 = C0008.m171(list);
        int i37 = 0;
        while (true) {
            int i38 = i37;
            int i39 = 53634;
            while (true) {
                i39 ^= 53651;
                switch (i39) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i39 = i38 < iM173 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        Object objM6103 = C0315.m6101(list, i38);
                        boolean zM43911 = C0228.m4399(C0123.m2381((r1.p) objM6103), C0132.m2538(m6442(), 232, C0295.f443 ^ 94, 2707));
                        int i40 = 53758;
                        while (true) {
                            i40 ^= 53775;
                            switch (i40) {
                                case 1009:
                                    i40 = zM43911 ? 54502 : 54471;
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    i37 = (C0082.f116 ^ 376) + i38;
                                    int i41 = 54657;
                                    while (true) {
                                        i41 ^= 54674;
                                        switch (i41) {
                                            case 19:
                                                i41 = 54688;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    int i42 = 54533;
                                    while (true) {
                                        i42 ^= 54550;
                                        switch (i42) {
                                            case 19:
                                                i42 = 54564;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                obj3 = objM6103;
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
                        break;
                    case 83:
                        obj3 = null;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar3 = (r1.p) obj3;
        int i43 = 55432;
        while (true) {
            i43 ^= 55449;
            switch (i43) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i43 = pVar3 != null ? 55525 : 55494;
                    break;
                case 62:
                    break;
                case 95:
                    iM8517 = 0;
                    break;
                case 124:
                    iM8517 = C0435.m8515((Number) C0364.m7154(l0Var, pVar3, C0057.m1083(i12)));
                    int i44 = 55556;
                    while (true) {
                        i44 ^= 55573;
                        switch (i44) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i44 = 55587;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int iM174 = C0008.m171(list);
        int i45 = 0;
        while (true) {
            int i46 = i45;
            int i47 = 55680;
            while (true) {
                i47 ^= 55697;
                switch (i47) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i47 = i46 < iM174 ? 56424 : 56393;
                        break;
                    case 1467:
                        break;
                    case 1496:
                        obj4 = null;
                        break;
                    case 1529:
                        Object objM6104 = C0315.m6101(list, i46);
                        boolean zM43912 = C0228.m4399(C0123.m2381((r1.p) objM6104), C0266.m5096(m6442(), 237, C0087.f121 ^ 602, 874));
                        int i48 = 56455;
                        while (true) {
                            i48 ^= 56472;
                            switch (i48) {
                                case 31:
                                    i48 = zM43912 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    i45 = (C0314.f462 ^ 259) + i46;
                                    int i49 = 1507503;
                                    while (true) {
                                        i49 ^= 1507520;
                                        switch (i49) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 111:
                                                i49 = 1507534;
                                                break;
                                        }
                                    }
                                    break;
                                case 124:
                                    int i50 = 56579;
                                    while (true) {
                                        i50 ^= 56596;
                                        switch (i50) {
                                            case 23:
                                                i50 = 56610;
                                                continue;
                                            case 54:
                                                obj4 = objM6104;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar4 = (r1.p) obj4;
        int i51 = 1507627;
        while (true) {
            i51 ^= 1507644;
            switch (i51) {
                case 23:
                    i51 = pVar4 != null ? 1507720 : 1507689;
                    break;
                case 85:
                    iM8518 = 0;
                    i13 = i12;
                    break;
                case 118:
                    break;
                case 180:
                    iM8518 = C0435.m8515((Number) C0364.m7154(l0Var, pVar4, C0057.m1083(i12)));
                    int iM422 = C0021.m420(pVar4, i22);
                    int i52 = 1507751;
                    while (true) {
                        i52 ^= 1507768;
                        switch (i52) {
                            case 31:
                                i52 = i12 == i22 ? 1508495 : 1508464;
                                break;
                            case 1335:
                                int i53 = 1508526;
                                while (true) {
                                    i53 ^= 1508543;
                                    switch (i53) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i53 = 1508557;
                                            continue;
                                        case 114:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 1480:
                                i12 = ((i12 + 16) - iM422) - 16;
                                break;
                            case 1513:
                                break;
                            default:
                                break;
                        }
                    }
                    int i54 = 1508650;
                    while (true) {
                        i54 ^= 1508667;
                        switch (i54) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i54 = 1508681;
                                continue;
                            case 114:
                                i13 = i12;
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
        int iM175 = C0008.m171(list);
        int i55 = 0;
        while (true) {
            int i56 = i55;
            int i57 = 1509425;
            while (true) {
                i57 ^= 1509442;
                switch (i57) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        obj5 = null;
                        break;
                    case 115:
                        i57 = i56 < iM175 ? 1509518 : 1509487;
                        break;
                    case 204:
                        Object objM6105 = C0315.m6101(list, i56);
                        boolean zM43913 = C0228.m4399(C0123.m2381((r1.p) objM6105), C0105.m2052(m6442(), 243, C0257.f337 ^ (-346), 1374));
                        int i58 = 1509549;
                        while (true) {
                            i58 ^= 1509566;
                            switch (i58) {
                                case 19:
                                    i58 = zM43913 ? 1509642 : 1509611;
                                    break;
                                case 85:
                                    i55 = (C0345.f616 ^ 691) + i56;
                                    int i59 = 1510448;
                                    while (true) {
                                        i59 ^= 1510465;
                                        switch (i59) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 113:
                                                i59 = 1510479;
                                                break;
                                        }
                                    }
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    int i60 = 1509673;
                                    while (true) {
                                        i60 ^= 1509690;
                                        switch (i60) {
                                            case 19:
                                                i60 = 1510355;
                                                continue;
                                            case 745:
                                                obj5 = objM6105;
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
                        break;
                    default:
                        break;
                }
            }
        }
        r1.p pVar5 = (r1.p) obj5;
        int i61 = 1510572;
        while (true) {
            i61 ^= 1510589;
            switch (i61) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i61 = pVar5 != null ? 1511316 : 1510634;
                    break;
                case 87:
                    iM8519 = 0;
                    i14 = i13;
                    break;
                case 118:
                    break;
                case 809:
                    iM8519 = C0435.m8515((Number) C0364.m7154(l0Var, pVar5, C0057.m1083(i13)));
                    int iM423 = C0021.m420(pVar5, i22);
                    int i62 = 1511347;
                    while (true) {
                        i62 ^= 1511364;
                        switch (i62) {
                            case 22:
                                break;
                            case 53:
                                i13 = ((i13 - 26) - iM423) + 26;
                                break;
                            case 119:
                                i62 = i13 == i22 ? 1511440 : 1511409;
                                break;
                            case 8148:
                                int i63 = 1511471;
                                while (true) {
                                    i63 ^= 1511488;
                                    switch (i63) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 111:
                                            i63 = 1511502;
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
                    int i64 = 1511595;
                    while (true) {
                        i64 ^= 1511612;
                        switch (i64) {
                            case 23:
                                i64 = 1512277;
                                continue;
                            case 1001:
                                i14 = i13;
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
        int iM176 = C0008.m171(list);
        int i65 = 0;
        while (true) {
            int i66 = i65;
            int i67 = 1512370;
            while (true) {
                i67 ^= 1512387;
                switch (i67) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        throw new NoSuchElementException(C0291.m5607(m6442(), 272, C0046.f66 ^ (-780), 1449));
                    case 113:
                        i67 = i66 < iM176 ? 1512463 : 1512432;
                        break;
                    case 1996:
                        break;
                    default:
                        break;
                }
            }
            Object objM6106 = C0315.m6101(list, i66);
            boolean zM43914 = C0228.m4399(C0123.m2381((r1.p) objM6106), C0408.m8010(m6442(), 249, C0281.f426 ^ 800, 2650));
            int i68 = 1512494;
            while (true) {
                i68 ^= 1512511;
                switch (i68) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i68 = zM43914 ? 1513238 : 1512556;
                        break;
                    case 83:
                        break;
                    case 114:
                        break;
                    case 809:
                        int iM85112 = C0435.m8515((Number) C0364.m7154(l0Var, objM6106, C0057.m1083(i14)));
                        int iM177 = C0008.m171(list);
                        int i69 = 0;
                        while (true) {
                            int i70 = i69;
                            int i71 = 1513269;
                            while (true) {
                                i71 ^= 1513286;
                                switch (i71) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 53:
                                        obj6 = null;
                                        break;
                                    case 115:
                                        i71 = i70 < iM177 ? 1513362 : 1513331;
                                        break;
                                    case 212:
                                        Object objM6107 = C0315.m6101(list, i70);
                                        boolean zM43915 = C0228.m4399(C0123.m2381((r1.p) objM6107), C0041.m814(m6442(), 258, C0130.f156 ^ (-61), 1493));
                                        int i72 = 1513393;
                                        while (true) {
                                            i72 ^= 1513410;
                                            switch (i72) {
                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    i69 = (C0377.f648 ^ 190) + i70;
                                                    int i73 = 1514292;
                                                    while (true) {
                                                        i73 ^= 1514309;
                                                        switch (i73) {
                                                            case 22:
                                                                break;
                                                            case 113:
                                                                i73 = 1514323;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 115:
                                                    i72 = zM43915 ? 1513486 : 1513455;
                                                    break;
                                                case 4044:
                                                    int i74 = 1513517;
                                                    while (true) {
                                                        i74 ^= 1513534;
                                                        switch (i74) {
                                                            case 19:
                                                                i74 = 1514199;
                                                                continue;
                                                            case 745:
                                                                obj6 = objM6107;
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
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar6 = (r1.p) obj6;
                        int i75 = 1514416;
                        while (true) {
                            i75 ^= 1514433;
                            switch (i75) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 47:
                                    iM85110 = 0;
                                    break;
                                case 113:
                                    i75 = pVar6 != null ? 1515160 : 1514478;
                                    break;
                                case 1369:
                                    iM85110 = C0435.m8515((Number) C0364.m7154(l0Var, pVar6, C0057.m1083(i14)));
                                    int i76 = 1515191;
                                    while (true) {
                                        i76 ^= 1515208;
                                        switch (i76) {
                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                break;
                                            case 127:
                                                i76 = 1515222;
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
                        int iM178 = C0008.m171(list);
                        int i77 = 0;
                        while (true) {
                            int i78 = i77;
                            int i79 = 1515315;
                            while (true) {
                                i79 ^= 1515332;
                                switch (i79) {
                                    case 22:
                                        break;
                                    case 53:
                                        obj7 = null;
                                        break;
                                    case 119:
                                        i79 = i78 < iM178 ? 1515408 : 1515377;
                                        break;
                                    case 212:
                                        Object objM6108 = C0315.m6101(list, i78);
                                        boolean zM43916 = C0228.m4399(C0123.m2381((r1.p) objM6108), C0059.m1123(m6442(), 262, C0452.f723 ^ (-844), 1970));
                                        int i80 = 1515439;
                                        while (true) {
                                            i80 ^= 1515456;
                                            switch (i80) {
                                                case 111:
                                                    i80 = zM43916 ? 1516183 : 1516152;
                                                    break;
                                                case 15703:
                                                    int i81 = 1516214;
                                                    while (true) {
                                                        i81 ^= 1516231;
                                                        switch (i81) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                obj7 = objM6108;
                                                                break;
                                                            case 113:
                                                                i81 = 1516245;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 15769:
                                                    break;
                                                case 15800:
                                                    i77 = (C0453.f724 ^ 894) + i78;
                                                    int i82 = 1516338;
                                                    while (true) {
                                                        i82 ^= 1516355;
                                                        switch (i82) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 113:
                                                                i82 = 1516369;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        r1.p pVar7 = (r1.p) obj7;
                        int i83 = 1537294;
                        while (true) {
                            i83 ^= 1537311;
                            switch (i83) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    if (pVar7 != null) {
                                        i83 = 1537387;
                                    }
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                    break;
                                case 83:
                                    iM85111 = 0;
                                    break;
                                case 116:
                                    iM85111 = C0435.m8515((Number) C0364.m7154(l0Var, pVar7, C0057.m1083(i10)));
                                    int i84 = 1537418;
                                    while (true) {
                                        i84 ^= 1537435;
                                        switch (i84) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i84 = 1537449;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i83 = 1537356;
                        }
                        return C0250.m4801(iM85112, iM8517, iM8515, iM8516, iM8518, iM8519, iM85110, iM85111, C0014.m281(this), C0018.m361(), C0485.m9452(c1Var), C0069.m1346(this));
                    default:
                        break;
                }
            }
            i65 = (C0360.f631 ^ 739) + i66;
            int i85 = 1537542;
            while (true) {
                i85 ^= 1537559;
                switch (i85) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i85 = 1538224;
                        break;
                    case 3751:
                        break;
                }
            }
        }
    }
}
