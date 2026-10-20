package k6;

import a6.C0007;
import a7.C0008;
import a8.C0009;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.graphics.drawable.C0016;
import android.util.Pair;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.semantics.C0039;
import androidx.core.app.C0040;
import c0.C0057;
import c3.C0063;
import com.auto.accept.service.C0072;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.firebase.C0205;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0184;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.C0209;
import d1.C0211;
import d7.C0220;
import d8.C0221;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0230;
import dagger.hilt.android.lifecycle.C0236;
import dagger.hilt.codegen.C0241;
import e1.C0257;
import e1.C0258;
import e7.C0264;
import f.C0269;
import f.C0270;
import f0.C0272;
import i.C0315;
import ja.C0330;
import java.util.Iterator;
import k3.C0335;
import k8.C0338;
import m1.C0350;
import n7.C0363;
import p0.C0373;
import q7.C0389;
import q9.C0391;
import r2.C0394;
import r5.C0400;
import s0.C0409;
import s0.C0410;
import s6.C0413;
import s7.C0415;
import t8.C0426;
import u3.C0434;
import u7.C0437;
import v5.C0444;
import v6.C0446;
import w9.C0465;
import y9.C0478;
import z2.C0484;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f539short = {1135, 1107, 1107, 1396, 1384, 1394, 1397, 1380, 1378, 2807, 2737, 2736, 2731, 2815, 2732, 2746, 2731, 2806, 2518, 2526, 2527, 2514, 2510, 2518, 1101, 1137, 1147, 1121, 1600, 1607, 1629, 1612, 1607, 1629, 1526, 1506, 1507, 1528, 1482, 1526, 1528, 1509, 1517, 3111, 3077, 3079, 3084, 3073, 3140, 3095, 3088, 3085, 3080, 3080, 3140, 3090, 3077, 3080, 3085, 3072, 3140, 3078, 3089, 3088, 3140, 3094, 3073, 3074, 3073, 3094, 3094, 3073, 3094, 3140, 3082, 3083, 3088, 3140, 3074, 3083, 3089, 3082, 3072, 2543, 2558, 2558, 273, 301, 291, 318, 758, 727, 724, 727, 704, 704, 727, 726, 658, 758, 727, 727, 706, 658, 766, 731, 732, 729, 658, 723, 734, 704, 727, 723, 726, 715, 658, 704, 727, 710, 704, 731, 727, 708, 727, 726, 668, 658, 764, 733, 710, 658, 724, 727, 710, 721, 730, 731, 732, 725, 658, 723, 725, 723, 731, 732, 668, 2575, 2618, 2605, 2610, 2622, 2609, 2618, 2609, 2603, 2611, 2598, 2687, 2617, 2622, 2614, 2611, 2618, 2619, 2687, 2603, 2608, 2687, 2605, 2618, 2603, 2605, 2614, 2618, 2601, 2618, 2687, 2587, 2618, 2617, 2618, 2605, 2605, 2618, 2619, 2687, 2587, 2618, 2618, 2607, 2687, 2579, 2614, 2609, 2612, 2673, 2687, 2573, 2618, 2622, 2620, 2615, 2618, 2619, 2687, 2610, 2622, 2599, 2614, 2610, 2602, 2610, 2687, 2605, 2618, 2603, 2605, 2614, 2618, 2604, 2673};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5 f10003b;

    public /* synthetic */ e5(y5 y5Var, int i10) {
        this.f10002a = i10;
        this.f10003b = y5Var;
        int iM1655 = C0076.m1655();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1655 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0269.m5142("l9Iik")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6551() {
        int iM2274 = C0118.m2274();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2274 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f539short;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x01b6. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        y5 y5VarM8049 = C0410.m8049(this);
        int iM5176 = C0270.m5176(this);
        long j10 = (-902) ^ ((long) C0135.f161);
        switch (iM5176) {
            case 0:
                C0484.m9438(y5VarM8049);
                break;
            case 1:
                C0040.m791(y5VarM8049);
                boolean zM7653 = C0391.m7653(C0023.m457(C0338.m6640(y5VarM8049)));
                int i10 = 51712;
                while (true) {
                    i10 ^= 51729;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (zM7653) {
                                i10 = 51805;
                            }
                            break;
                        case 47:
                            long jM7113 = C0363.m7113(C0478.m9329(C0338.m6640(y5VarM8049)));
                            C0426.m8362(C0478.m9329(C0338.m6640(y5VarM8049)), (j10 - 26) + jM7113 + 26);
                            int i11 = 52611;
                            while (true) {
                                i11 ^= 52628;
                                switch (i11) {
                                    case 23:
                                        i11 = jM7113 < 5 ? 52673 : 52704;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        boolean zM2823 = C0147.m2823();
                                        Object objM3121 = C0163.m3121(y5VarM8049);
                                        int i12 = 53510;
                                        while (true) {
                                            i12 ^= 53527;
                                            switch (i12) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = zM2823 ? 53603 : 53572;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                case 83:
                                                    break;
                                                case 116:
                                                    boolean zM3575 = C0187.m3575(C0091.m1951(y5VarM8049), null, C0437.m8547());
                                                    int i13 = 53634;
                                                    while (true) {
                                                        i13 ^= 53651;
                                                        switch (i13) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i13 = zM3575 ? 53727 : 53696;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                f6 f6VarM4019 = C0209.m4019(y5VarM8049);
                                                                int i14 = 53758;
                                                                while (true) {
                                                                    i14 ^= 53775;
                                                                    switch (i14) {
                                                                        case 1009:
                                                                            i14 = f6VarM4019 == null ? 54502 : 54471;
                                                                            break;
                                                                        case 1703:
                                                                            break;
                                                                        case 1736:
                                                                            break;
                                                                        case 1769:
                                                                            y5VarM8049.f10581p = new f6(y5VarM8049, (f5) objM3121, 0);
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0258.m4929(C0209.m4019(y5VarM8049), 0L);
                                                                int i15 = 54533;
                                                                while (true) {
                                                                    i15 ^= 54550;
                                                                    switch (i15) {
                                                                        case 19:
                                                                            i15 = 54564;
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
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
                                        C0165.m3163((f5) objM3121);
                                        break;
                                    case 116:
                                        C0135.m2604(C0330.m6385(C0029.m572(y5VarM8049)), C0446.m8698(m6551(), 147, C0008.f28 ^ (-77), 2655));
                                        C0373.m7332(C0023.m457(C0338.m6640(y5VarM8049)), true);
                                        int i16 = 52735;
                                        while (true) {
                                            i16 ^= 52752;
                                            switch (i16) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 1007:
                                                    i16 = 52766;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 76:
                            C0135.m2604(C0465.m9073(C0029.m572(y5VarM8049)), C0191.m3642(m6551(), 90, C0162.f186 ^ 893, 690));
                            int i17 = 51836;
                            while (true) {
                                i17 ^= 51853;
                                switch (i17) {
                                    case 241:
                                        i17 = 52518;
                                        break;
                                    case 1963:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i10 = 51774;
                }
                break;
            case 2:
                g5 g5VarM1718 = C0080.m1718(y5VarM8049);
                f5 f5VarM2283 = C0118.m2283(g5VarM1718);
                z4 z4VarM8666 = C0444.m8666(f5VarM2283);
                C0257.m4924(z4VarM8666);
                C0063.m1219(z4VarM8666);
                boolean zM772 = C0039.m772(g5VarM1718);
                int i18 = 1616;
                while (true) {
                    i18 ^= 1633;
                    switch (i18) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i18 = !zM772 ? 1709 : 1678;
                            break;
                        case 204:
                            int i19 = 1740;
                            while (true) {
                                i19 ^= 1757;
                                switch (i19) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i19 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            boolean zM3520 = C0184.m3520(g5VarM1718);
                            y5 y5VarM4277 = C0221.m4277(f5VarM2283);
                            l4 l4VarM4620 = C0241.m4620(f5VarM2283);
                            String strM7730 = C0394.m7730(m6551(), 0, C0409.f680 ^ (-395), 1072);
                            int i20 = 1864;
                            while (true) {
                                i20 ^= 1881;
                                switch (i20) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i20 = zM3520 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        C0236.m4550(l4VarM4620);
                                        j0.b0 b0VarM6102 = C0315.m6102(l4VarM4620);
                                        String strM8488 = C0434.m8488(b0VarM6102);
                                        boolean zM1883 = C0088.m1883(strM8488);
                                        int i21 = 48891;
                                        while (true) {
                                            i21 ^= 48908;
                                            switch (i21) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    long jM7114 = C0363.m7113(C0363.m7117(l4VarM4620)) / 3600000;
                                                    Uri uriM2730 = C0142.m2730(strM8488);
                                                    Bundle bundle = new Bundle();
                                                    Pair pair = new Pair(C0220.m4252(uriM2730), bundle);
                                                    Iterator itM5256 = C0272.m5256(C0017.m338(uriM2730));
                                                    while (true) {
                                                        boolean zM3327 = C0174.m3327(itM5256);
                                                        int i22 = 49790;
                                                        while (true) {
                                                            i22 ^= 49807;
                                                            switch (i22) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    String str2 = (String) C0413.m8115(itM5256);
                                                                    C0235.m4526(bundle, str2, C0009.m180(uriM2730, str2));
                                                                    int i23 = 49914;
                                                                    while (true) {
                                                                        i23 ^= 49931;
                                                                        switch (i23) {
                                                                            case 497:
                                                                                i23 = 50596;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i22 = zM3327 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            C0490.m9555((Bundle) C0057.m1086(pair), strM7730, (((jM7114 - 2) - j10) + 2) * 3600000);
                                                            Object objM1560 = C0072.m1560(pair);
                                                            int i24 = 50689;
                                                            while (true) {
                                                                i24 ^= 50706;
                                                                switch (i24) {
                                                                    case 19:
                                                                        if (objM1560 == null) {
                                                                            i24 = 50782;
                                                                            continue;
                                                                        } else {
                                                                            i24 = 50751;
                                                                        }
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        str = (String) objM1560;
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        i24 = 50751;
                                                                        break;
                                                                    case 76:
                                                                        String strM2172 = C0112.m2172(m6551(), 83, C0200.f224 ^ 309, 2446);
                                                                        int i25 = 50813;
                                                                        while (true) {
                                                                            i25 ^= 50830;
                                                                            switch (i25) {
                                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                    str = strM2172;
                                                                                    break;
                                                                                case 243:
                                                                                    i25 = 50844;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            C0229.m4412(y5VarM4277);
                                                            C0168.m3222(y5VarM4277, str, C0024.m469(m6551(), 86, C0184.f208 ^ (-730), 334), (Bundle) C0057.m1086(pair));
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 503:
                                                    i21 = zM1883 ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    d4 d4VarM3434 = C0180.m3434(f5VarM2283);
                                                    C0257.m4924(d4VarM3434);
                                                    C0135.m2604(C0335.m6498(d4VarM3434), C0230.m4437(m6551(), 43, C0082.f116 ^ 337, 3172));
                                                    int i26 = 49666;
                                                    while (true) {
                                                        i26 ^= 49683;
                                                        switch (i26) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                                        C0136.m2623(b0VarM6102, null);
                                        break;
                                    case 47417:
                                        C0236.m4550(l4VarM4620);
                                        C0136.m2623(C0315.m6102(l4VarM4620), null);
                                        Bundle bundle2 = new Bundle();
                                        String strM3660 = C0192.m3660(m6551(), 3, C0400.f671 ^ 124, 1287);
                                        String strM1913 = C0089.m1913(m6551(), 9, C0168.f192 ^ 953, 2783);
                                        C0235.m4526(bundle2, strM3660, strM1913);
                                        C0235.m4526(bundle2, C0264.m5055(m6551(), 18, C0350.f621 ^ (-714), 2491), strM1913);
                                        C0235.m4526(bundle2, C0389.m7631(m6551(), 24, C0016.f36 ^ (-880), 1042), C0415.m8167(m6551(), 28, C0193.f217 ^ 202, 1577));
                                        C0490.m9555(bundle2, strM7730, j10);
                                        C0229.m4412(y5VarM4277);
                                        C0168.m3222(y5VarM4277, C0338.m6651(m6551(), 34, C0211.f235 ^ 558, 1431), C0205.m3930(m6551(), 38, C0175.f199 ^ 567, 1429), bundle2);
                                        int i27 = 48767;
                                        while (true) {
                                            i27 ^= 48784;
                                            switch (i27) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 239:
                                                    i27 = 48798;
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
                            C0236.m4550(l4VarM4620);
                            C0426.m8362(C0363.m7117(l4VarM4620), 0L);
                            break;
                        default:
                            break;
                    }
                }
                int iM1846 = C0086.m1846();
                int i28 = 51588;
                while (true) {
                    i28 ^= 51605;
                    switch (i28) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM1846 <= 0) {
                                i28 = 51681;
                            }
                            break;
                        case 54:
                            break;
                        case 87:
                            break;
                        case 116:
                            System.out.println(Float.parseFloat(C0007.m151("Xr13Eh")));
                            break;
                        default:
                            continue;
                    }
                    i28 = 51650;
                }
                break;
            default:
                C0484.m9438(y5VarM8049);
                break;
        }
    }
}
