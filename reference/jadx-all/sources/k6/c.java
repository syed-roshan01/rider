package k6;

import a.C0000;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.input.key.C0033;
import b7.C0053;
import c0.C0057;
import c4.C0064;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0127;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.C0209;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.android.internal.modules.C0235;
import e8.C0266;
import h1.C0301;
import h3.C0302;
import h3.C0304;
import i.C0316;
import ja.C0331;
import java.math.BigDecimal;
import k1.C0333;
import k2.C0334;
import k3.C0335;
import m7.C0359;
import n7.C0365;
import o2.C0369;
import o8.C0372;
import p3.C0376;
import q0.C0383;
import q6.C0387;
import q6.C0388;
import q6.C0389;
import r.C0393;
import s7.C0415;
import t1.C0420;
import t3.C0425;
import u1.C0432;
import u8.C0439;
import v.C0440;
import v5.C0446;
import v7.C0449;
import w2.C0459;
import y9.C0480;
import z.C0481;
import z3.C0488;
import z7.C0489;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f527short = {2287, 2253, 2256, 2255, 2266, 2253, 2251, 2246, 2207, 2265, 2262, 2259, 2251, 2266, 2253, 2207, 2270, 2259, 2253, 2266, 2270, 2267, 2246, 2207, 2266, 2249, 2270, 2259, 2250, 2270, 2251, 2266, 2267, 2207, 2251, 2253, 2250, 2266, 2207, 2270, 2257, 2267, 2207, 2262, 2251, 2207, 2262, 2252, 2207, 2257, 2256, 2251, 2207, 2270, 2252, 2252, 2256, 2268, 2262, 2270, 2251, 2266, 2267, 2207, 2248, 2262, 2251, 2263, 2207, 2270, 2257, 2207, 2266, 2257, 2263, 2270, 2257, 2268, 2266, 2267, 2207, 2270, 2250, 2267, 2262, 2266, 2257, 2268, 2266, 2193, 2207, 2270, 2250, 2267, 2262, 2266, 2257, 2268, 2266, 2207, 2294, 2299, 2195, 2207, 2265, 2262, 2259, 2251, 2266, 2253, 2207, 2294, 2299, 2418, 2387, 2332, 2386, 2377, 2385, 2398, 2393, 2382, 2332, 2394, 2389, 2384, 2376, 2393, 2382, 2332, 2394, 2387, 2382, 2332, 2384, 2387, 2386, 2395, 2332, 2380, 2382, 2387, 2380, 2393, 2382, 2376, 2373, 2322, 2332, 2380, 2382, 2387, 2380, 2393, 2382, 2376, 2373, 1262, 1231, 1152, 1230, 1237, 1229, 1218, 1221, 1234, 1152, 1222, 1225, 1228, 1236, 1221, 1234, 1152, 1222, 1231, 1234, 1152, 1220, 1231, 1237, 1218, 1228, 1221, 1152, 1232, 1234, 1231, 1232, 1221, 1234, 1236, 1241, 1166, 1152, 1232, 1234, 1231, 1232, 1221, 1234, 1236, 1241, 1391, 1358, 1281, 1362, 1365, 1363, 1352, 1359, 1350, 1281, 1358, 1363, 1281, 1359, 1364, 1356, 1347, 1348, 1363, 1281, 1351, 1352, 1357, 1365, 1348, 1363, 1281, 1349, 1348, 1351, 1352, 1359, 1348, 1349, 1295, 1281, 1361, 1363, 1358, 1361, 1348, 1363, 1365, 1368, 2582, 2609, 2601, 2622, 2611, 2614, 2619, 2687, 2602, 2604, 2618, 2605, 2687, 2607, 2605, 2608, 2607, 2618, 2605, 2603, 2598, 2687, 2601, 2622, 2611, 2602, 2618, 2687, 2617, 2608, 2605, 2687, 2577, 2602, 2610, 2618, 2605, 2614, 2620, 2687, 2609, 2602, 2610, 2621, 2618, 2605, 2687, 2617, 2614, 2611, 2603, 2618, 2605, 2673, 2687, 2607, 2605, 2608, 2607, 2618, 2605, 2603, 2598, 2675, 2687, 2601, 2622, 2611, 2602, 2618, 2604, 2570, 2588, 2571, 2649, 2569, 2571, 2582, 2569, 2588, 2571, 2573, 2560, 2649, 2577, 2584, 2570, 2649, 2583, 2582, 2649, 2575, 2584, 2581, 2572, 2588, 2645, 2649, 2569, 2571, 2582, 2569, 2588, 2571, 2573, 2560, 1500, 1479, 1502, 1502, 1461, 1431, 1418, 1429, 1408, 1431, 1425, 1436, 1477, 1411, 1420, 1417, 1425, 1408, 1431, 1477, 1431, 1408, 1430, 1424, 1417, 1425};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzew.zze f9923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z7 f9924h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z7 z7Var, String str, int i10, zzew.zze zzeVar) {
        super(str, i10);
        this.f9924h = z7Var;
        this.f9923g = zzeVar;
        int iM5859 = C0304.m5859();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5859 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0117.m2252("Eju0gij4ZIZZkivHd4IAiNHuRa0KO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۥۤ۠, reason: contains not printable characters */
    public static short[] m6539() {
        int iM7600 = C0389.m7600();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7600 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f527short;
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

    @Override // k6.d
    public final int a() {
        return C0316.m6118(C0023.m458(this));
    }

    @Override // k6.d
    public final boolean f() {
        return false;
    }

    @Override // k6.d
    public final boolean g() {
        return true;
    }

    public final boolean h(Long l10, Long l11, zzfi.zzn zznVar, boolean z10) {
        boolean z11;
        boolean z12;
        Boolean boolM7158;
        Boolean boolM5794;
        Boolean boolM5795;
        int i10;
        Object objM8745;
        Integer numM1083;
        boolean zM2968 = C0154.m2968();
        z7 z7VarM7230 = C0369.m7230(this);
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = zM2968 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM3575 = C0187.m3575(C0091.m1951(z7VarM7230), C0481.m9355(this), C0333.m6447());
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = zM3575 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z11 = false;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z11 = true;
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
                                            continue;
                                        case 47483:
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
                    z11 = false;
                    break;
                default:
                    break;
            }
        }
        zzew.zze zzeVarM458 = C0023.m458(this);
        boolean zM1849 = C0087.m1849(zzeVarM458);
        boolean zM3917 = C0205.m3917(zzeVarM458);
        boolean zM7032 = C0359.m7032(zzeVarM458);
        int i14 = 48767;
        while (true) {
            i14 ^= 48784;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    z12 = true;
                    break;
                case 76:
                    int i15 = 48891;
                    while (true) {
                        i15 ^= 48908;
                        switch (i15) {
                            case 22:
                                break;
                            case 53:
                                z12 = true;
                                break;
                            case 503:
                                i15 = !zM3917 ? 49635 : 48953;
                                break;
                            case 32495:
                                int i16 = 49666;
                                while (true) {
                                    i16 ^= 49683;
                                    switch (i16) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i16 = zM7032 ? 49759 : 49728;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            int i17 = 49790;
                                            while (true) {
                                                i17 ^= 49807;
                                                switch (i17) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 241:
                                                        i17 = 49821;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                z12 = true;
                                                break;
                                            }
                                            break;
                                        case 83:
                                            z12 = false;
                                            int i18 = 49914;
                                            while (true) {
                                                i18 ^= 49931;
                                                switch (i18) {
                                                    case 497:
                                                        i18 = 50596;
                                                        continue;
                                                    case 1711:
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
                    break;
                case 239:
                    i14 = !zM1849 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i19 = 50689;
        while (true) {
            i19 ^= 50706;
            switch (i19) {
                case 19:
                    i19 = z10 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    int i20 = 50813;
                    while (true) {
                        i20 ^= 50830;
                        switch (i20) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                i20 = !z12 ? 51557 : 50875;
                                break;
                            case 4075:
                                d4 d4VarM572 = C0029.m572(z7VarM7230);
                                Integer numM1084 = C0057.m1083(C0376.m7361(this));
                                boolean zM9498 = C0488.m9498(zzeVarM458);
                                int i21 = 51588;
                                while (true) {
                                    i21 ^= 51605;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM9498) {
                                                i21 = 51681;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            numM1083 = null;
                                            break;
                                        case 116:
                                            numM1083 = C0057.m1083(C0316.m6118(zzeVarM458));
                                            break;
                                        default:
                                            continue;
                                    }
                                    i21 = 51650;
                                }
                                C0112.m2169(C0136.m2634(d4VarM572), C0231.m4437(m6539(), 0, C0302.f449 ^ 975, 2239), numM1084, numM1083);
                                return true;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        zzew.zzc zzcVarM9504 = C0489.m9504(zzeVarM458);
        boolean zM6471 = C0334.m6471(zzcVarM9504);
        boolean zM649 = C0033.m649(zznVar);
        int i22 = 51712;
        while (true) {
            i22 ^= 51729;
            switch (i22) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i22 = zM649 ? 51805 : 51774;
                    break;
                case 47:
                    boolean zM5852 = C0304.m5852(zznVar);
                    int i23 = 53510;
                    while (true) {
                        i23 ^= 53527;
                        switch (i23) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i23 = zM5852 ? 53603 : 53572;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                boolean zM8126 = C0415.m8126(zznVar);
                                int i24 = 54657;
                                while (true) {
                                    i24 ^= 54674;
                                    switch (i24) {
                                        case 19:
                                            i24 = zM8126 ? 55401 : 54719;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            C0420.m8245(C0331.m6385(C0029.m572(z7VarM7230)), C0180.m3427(m6539(), 317, C0393.f663 ^ 613, 2681), C0388.m7586(C0234.m4489(z7VarM7230), C0302.m5817(zznVar)));
                                            boolM7158 = null;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 3579:
                                            boolean zM7576 = C0387.m7576(zzcVarM9504);
                                            int i25 = 55432;
                                            while (true) {
                                                i25 ^= 55449;
                                                switch (i25) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i25 = !zM7576 ? 55525 : 55494;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        boolM7158 = C0365.m7158(C0446.m8686(C0064.m1233(zznVar), C0440.m8585(zzcVarM9504), C0029.m572(z7VarM7230)), zM6471);
                                                        int i26 = 1508526;
                                                        while (true) {
                                                            i26 ^= 1508543;
                                                            switch (i26) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i26 = 1508557;
                                                                    continue;
                                                                case 114:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 124:
                                                        boolean zM636 = C0032.m636(zzcVarM9504);
                                                        int i27 = 55556;
                                                        while (true) {
                                                            i27 ^= 55573;
                                                            switch (i27) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i27 = !zM636 ? 55649 : 55618;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    boolean zM3091 = C0161.m3091(C0064.m1233(zznVar));
                                                                    int i28 = 56455;
                                                                    while (true) {
                                                                        i28 ^= 56472;
                                                                        switch (i28) {
                                                                            case 31:
                                                                                i28 = zM3091 ? 56548 : 56517;
                                                                                break;
                                                                            case 62:
                                                                                break;
                                                                            case 93:
                                                                                C0112.m2169(C0331.m6385(C0029.m572(z7VarM7230)), C0387.m7577(m6539(), 247, C0137.f163 ^ 36, 2655), C0388.m7586(C0234.m4489(z7VarM7230), C0302.m5817(zznVar)), C0064.m1233(zznVar));
                                                                                int i29 = 1507751;
                                                                                while (true) {
                                                                                    i29 ^= 1507768;
                                                                                    switch (i29) {
                                                                                        case 31:
                                                                                            i29 = 1508433;
                                                                                            continue;
                                                                                        case 1513:
                                                                                            boolM7158 = null;
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 124:
                                                                                String strM1233 = C0064.m1233(zznVar);
                                                                                zzew.zzd zzdVarM8453 = C0432.m8453(zzcVarM9504);
                                                                                boolean zM3092 = C0161.m3091(strM1233);
                                                                                int i30 = 56579;
                                                                                while (true) {
                                                                                    i30 ^= 56596;
                                                                                    switch (i30) {
                                                                                        case 23:
                                                                                            i30 = !zM3092 ? 1507472 : 56641;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 85:
                                                                                            try {
                                                                                                boolM5794 = C0301.m5794(new BigDecimal(strM1233), zzdVarM8453, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                                                                                                break;
                                                                                            } catch (NumberFormatException e4) {
                                                                                                int i31 = 1515439;
                                                                                                while (true) {
                                                                                                    i31 ^= 1515456;
                                                                                                    switch (i31) {
                                                                                                        case 111:
                                                                                                            i31 = 1516121;
                                                                                                            continue;
                                                                                                        case 15769:
                                                                                                            boolM5794 = null;
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 1564036:
                                                                                            int i32 = 1507503;
                                                                                            while (true) {
                                                                                                i32 ^= 1507520;
                                                                                                switch (i32) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        boolM5794 = null;
                                                                                                        break;
                                                                                                    case 111:
                                                                                                        i32 = 1507534;
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
                                                                                boolM7158 = C0365.m7158(boolM5794, zM6471);
                                                                                int i33 = 1507627;
                                                                                while (true) {
                                                                                    i33 ^= 1507644;
                                                                                    switch (i33) {
                                                                                        case 23:
                                                                                            i33 = 1507658;
                                                                                            continue;
                                                                                        case 118:
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
                                                                case 116:
                                                                    C0420.m8245(C0331.m6385(C0029.m572(z7VarM7230)), C0153.m2934(m6539(), 203, C0425.f695 ^ 555, 1313), C0388.m7586(C0234.m4489(z7VarM7230), C0302.m5817(zznVar)));
                                                                    int i34 = 55680;
                                                                    while (true) {
                                                                        i34 ^= 55697;
                                                                        switch (i34) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i34 = 56362;
                                                                                continue;
                                                                            case 1467:
                                                                                boolM7158 = null;
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
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 116:
                                boolean zM637 = C0032.m636(zzcVarM9504);
                                int i35 = 53634;
                                while (true) {
                                    i35 ^= 53651;
                                    switch (i35) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i35 = !zM637 ? 53727 : 53696;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            C0420.m8245(C0331.m6385(C0029.m572(z7VarM7230)), C0235.m4516(m6539(), 157, C0372.f642 ^ (-908), 1184), C0388.m7586(C0234.m4489(z7VarM7230), C0302.m5817(zznVar)));
                                            int i36 = 53758;
                                            while (true) {
                                                i36 ^= 53775;
                                                switch (i36) {
                                                    case 1009:
                                                        i36 = 54440;
                                                        continue;
                                                    case 1703:
                                                        boolM7158 = null;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 83:
                                            double dM5066 = C0266.m5066(zznVar);
                                            try {
                                                boolM5795 = C0301.m5794(new BigDecimal(dM5066), C0432.m8453(zzcVarM9504), C0201.m3860(dM5066));
                                                while (true) {
                                                    i10 ^= 54550;
                                                    switch (i10) {
                                                        case 19:
                                                            i10 = 54564;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            } catch (NumberFormatException e10) {
                                                int i37 = 1515315;
                                                while (true) {
                                                    i37 ^= 1515332;
                                                    switch (i37) {
                                                        case 22:
                                                            boolM5795 = null;
                                                            break;
                                                        case 119:
                                                            i37 = 1515346;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            }
                                            boolM7158 = C0365.m7158(boolM5795, zM6471);
                                            i10 = 54533;
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
                    break;
                case 76:
                    boolean zM638 = C0032.m636(zzcVarM9504);
                    int i38 = 51836;
                    while (true) {
                        i38 ^= 51853;
                        switch (i38) {
                            case 241:
                                i38 = !zM638 ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                boolM7158 = C0365.m7158(C0480.m9342(C0236.m4529(zznVar), C0432.m8453(zzcVarM9504)), zM6471);
                                int i39 = 52735;
                                while (true) {
                                    i39 ^= 52752;
                                    switch (i39) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 1007:
                                            i39 = 52766;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 2025:
                                C0420.m8245(C0331.m6385(C0029.m572(z7VarM7230)), C0053.m1023(m6539(), 113, C0383.f653 ^ 769, 2364), C0388.m7586(C0234.m4489(z7VarM7230), C0302.m5817(zznVar)));
                                int i40 = 52611;
                                while (true) {
                                    i40 ^= 52628;
                                    switch (i40) {
                                        case 23:
                                            i40 = 52642;
                                            continue;
                                        case 54:
                                            boolM7158 = null;
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
        d4 d4VarM573 = C0029.m572(z7VarM7230);
        int i41 = 1508650;
        while (true) {
            i41 ^= 1508667;
            switch (i41) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i41 = boolM7158 == null ? 1509394 : 1508712;
                    break;
                case 83:
                    objM8745 = boolM7158;
                    break;
                case 114:
                    break;
                case 3369:
                    objM8745 = C0449.m8745(m6539(), 353, C0459.f729 ^ (-307), 1458);
                    int i42 = 1509425;
                    while (true) {
                        i42 ^= 1509442;
                        switch (i42) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 115:
                                i42 = 1509456;
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
        C0420.m8245(C0136.m2634(d4VarM573), C0127.m2451(m6539(), 357, C0129.f155 ^ 742, 1509), objM8745);
        int i43 = 1509549;
        while (true) {
            i43 ^= 1509566;
            switch (i43) {
                case 19:
                    if (boolM7158 == null) {
                        i43 = 1509642;
                    }
                    break;
                case 85:
                    this.f9953c = C0335.m6483();
                    int i44 = 1509673;
                    while (true) {
                        i44 ^= 1509690;
                        switch (i44) {
                            case 19:
                                i44 = zM7032 ? 1510417 : 1510386;
                                break;
                            case 712:
                                break;
                            case 745:
                                break;
                            case 1323:
                                boolean zM14 = C0000.m14(boolM7158);
                                int i45 = 1510448;
                                while (true) {
                                    i45 ^= 1510465;
                                    switch (i45) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            break;
                                        case 113:
                                            i45 = !zM14 ? 1510541 : 1510510;
                                            break;
                                        case 204:
                                            return true;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int i46 = 1510572;
                    while (true) {
                        i46 ^= 1510589;
                        switch (i46) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i46 = z10 ? 1511316 : 1510634;
                                break;
                            case 87:
                                this.f9954d = boolM7158;
                                break;
                            case 118:
                                break;
                            case 809:
                                boolean zM18410 = C0087.m1849(zzeVarM458);
                                int i47 = 1511347;
                                while (true) {
                                    i47 ^= 1511364;
                                    switch (i47) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 119:
                                            i47 = zM18410 ? 1511440 : 1511409;
                                            break;
                                        case 8148:
                                            this.f9954d = boolM7158;
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
                    boolean zM15 = C0000.m14(boolM7158);
                    int i48 = 1511471;
                    while (true) {
                        i48 ^= 1511488;
                        switch (i48) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 111:
                                i48 = zM15 ? 1511564 : 1511533;
                                break;
                            case 204:
                                int i49 = 1511595;
                                while (true) {
                                    i49 ^= 1511612;
                                    switch (i49) {
                                        case 23:
                                            i49 = z12 ? 1512339 : 1512308;
                                            break;
                                        case 815:
                                            boolean zM8131 = C0415.m8131(zznVar);
                                            int i50 = 1512370;
                                            while (true) {
                                                i50 ^= 1512387;
                                                switch (i50) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        break;
                                                    case 113:
                                                        i50 = zM8131 ? 1512463 : 1512432;
                                                        break;
                                                    case 1996:
                                                        long jM4012 = C0209.m4012(zznVar);
                                                        int i51 = 1512494;
                                                        while (true) {
                                                            i51 ^= 1512511;
                                                            switch (i51) {
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i51 = l10 != null ? 1513238 : 1512556;
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                case 114:
                                                                    break;
                                                                case 809:
                                                                    jM4012 = C0491.m9543(l10);
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        int i52 = 1513269;
                                                        while (true) {
                                                            i52 ^= 1513286;
                                                            switch (i52) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 115:
                                                                    i52 = z11 ? 1513362 : 1513331;
                                                                    break;
                                                                case 212:
                                                                    boolean zM18411 = C0087.m1849(zzeVarM458);
                                                                    int i53 = 1513393;
                                                                    while (true) {
                                                                        i53 ^= 1513410;
                                                                        switch (i53) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case 115:
                                                                                i53 = zM18411 ? 1513486 : 1513455;
                                                                                break;
                                                                            case 4044:
                                                                                boolean zM3918 = C0205.m3917(zzeVarM458);
                                                                                int i54 = 1513517;
                                                                                while (true) {
                                                                                    i54 ^= 1513534;
                                                                                    switch (i54) {
                                                                                        case 19:
                                                                                            i54 = !zM3918 ? 1514261 : 1514230;
                                                                                            break;
                                                                                        case 712:
                                                                                            break;
                                                                                        case 745:
                                                                                            break;
                                                                                        case 811:
                                                                                            int i55 = 1514292;
                                                                                            while (true) {
                                                                                                i55 ^= 1514309;
                                                                                                switch (i55) {
                                                                                                    case 22:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i55 = l11 != null ? 1514385 : 1514354;
                                                                                                        break;
                                                                                                    case 212:
                                                                                                        jM4012 = C0491.m9543(l11);
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
                                                        boolean zM3919 = C0205.m3917(zzeVarM458);
                                                        int i56 = 1514416;
                                                        while (true) {
                                                            i56 ^= 1514433;
                                                            switch (i56) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 47:
                                                                    this.f9955e = C0439.m8554(jM4012);
                                                                    break;
                                                                case 113:
                                                                    i56 = zM3919 ? 1515160 : 1514478;
                                                                    break;
                                                                case 1369:
                                                                    this.f9956f = C0439.m8554(jM4012);
                                                                    int i57 = 1515191;
                                                                    while (true) {
                                                                        i57 ^= 1515208;
                                                                        switch (i57) {
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                break;
                                                                            case 127:
                                                                                i57 = 1515222;
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
                                            break;
                                        case 968:
                                            break;
                                        case 1001:
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
                    return true;
                case 114:
                    break;
                case 436:
                    return false;
                default:
                    continue;
            }
            i43 = 1509611;
        }
    }
}
