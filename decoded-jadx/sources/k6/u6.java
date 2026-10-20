package k6;

import android.os.RemoteException;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.versionedparcelable.C0048;
import c7.C0068;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.tasks.C0106;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.Code;
import d3.C0216;
import d9.C0225;
import dagger.hilt.android.lifecycle.C0236;
import f.C0270;
import f1.C0273;
import h.C0297;
import h7.C0310;
import i6.C0320;
import k8.C0338;
import l0.C0340;
import l3.C0342;
import m3.C0352;
import q7.C0389;
import t1.C0419;
import u1.C0432;
import u2.C0433;
import u4.C0435;
import v5.C0445;
import w0.C0454;
import w2.C0457;
import x4.C0469;
import z8.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class u6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f592short = {3144, 3183, 3175, 3170, 3179, 3178, 3118, 3194, 3169, 3118, 3197, 3179, 3168, 3178, 3118, 3181, 3169, 3168, 3197, 3179, 3168, 3194, 3118, 3197, 3179, 3194, 3194, 3175, 3168, 3177, 3197, 3118, 3194, 3169, 3118, 3197, 3179, 3196, 3192, 3175, 3181, 3179, 1521, 1494, 1502, 1499, 1490, 1491, 1431, 1475, 1496, 1431, 1476, 1490, 1497, 1491, 1431, 1492, 1496, 1497, 1476, 1490, 1497, 1475, 1431, 1476, 1490, 1475, 1475, 1502, 1497, 1488, 1476, 1431, 1475, 1496, 1431, 1475, 1503, 1490, 1431, 1476, 1490, 1477, 1473, 1502, 1492, 1490, 1214, 1177, 1169, 1172, 1181, 1180, 1240, 1164, 1175, 1240, 1163, 1181, 1174, 1180, 1240, 1173, 1181, 1177, 1163, 1165, 1162, 1181, 1173, 1181, 1174, 1164, 1213, 1174, 1177, 1178, 1172, 1181, 1180, 1240, 1164, 1175, 1240, 1163, 1181, 1162, 1166, 1169, 1179, 1181, 2057, 2094, 2086, 2083, 2090, 2091, 2159, 2107, 2080, 2159, 2108, 2090, 2081, 2091, 2159, 2082, 2090, 2094, 2108, 2106, 2109, 2090, 2082, 2090, 2081, 2107, 2058, 2081, 2094, 2093, 2083, 2090, 2091, 2159, 2107, 2080, 2159, 2107, 2087, 2090, 2159, 2108, 2090, 2109, 2105, 2086, 2092, 2090, 2547, 2526, 2500, 2516, 2518, 2501, 2515, 2526, 2521, 2512, 2455, 2515, 2518, 2499, 2518, 2457, 2455, 2545, 2518, 2526, 2523, 2514, 2515, 2455, 2499, 2520, 2455, 2500, 2514, 2521, 2515, 2455, 2518, 2503, 2503, 2455, 2523, 2518, 2498, 2521, 2516, 2527, 1270, 1233, 1241, 1244, 1237, 1236, 1168, 1220, 1247, 1168, 1219, 1237, 1246, 1236, 1168, 1233, 1216, 1216, 1168, 1244, 1233, 1221, 1246, 1235, 1240, 1168, 1220, 1247, 1168, 1220, 1240, 1237, 1168, 1219, 1237, 1218, 1222, 1241, 1235, 1237, 1169, 1206, 1214, 1211, 1202, 1203, 1271, 1187, 1208, 1271, 1189, 1202, 1188, 1202, 1187, 1271, 1203, 1206, 1187, 1206, 1271, 1208, 1209, 1271, 1187, 1215, 1202, 1271, 1188, 1202, 1189, 1185, 1214, 1204, 1202, 1261, 1271, 1209, 1208, 1187, 1271, 1204, 1208, 1209, 1209, 1202, 1204, 1187, 1202, 1203, 1271, 1187, 1208, 1271, 1188, 1202, 1189, 1185, 1214, 1204, 1202, 2808, 2783, 2775, 2770, 2779, 2778, 2718, 2762, 2769, 2718, 2764, 2779, 2765, 2779, 2762, 2718, 2778, 2783, 2762, 2783, 2718, 2769, 2768, 2718, 2762, 2774, 2779, 2718, 2765, 2779, 2764, 2760, 2775, 2781, 2779, 2692, 2718, 2764, 2779, 2771, 2769, 2762, 2779, 2718, 2779, 2758, 2781, 2779, 2766, 2762, 2775, 2769, 2768};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x7 f10421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6 f10422c;

    public /* synthetic */ u6(s6 s6Var, x7 x7Var, int i10) {
        this.f10420a = i10;
        this.f10422c = s6Var;
        this.f10421b = x7Var;
        int iM2475 = C0128.m2475();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2475 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0389.m7625("PyAg78zfx5hJAefma21tn49vnTm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۥ۟ۧ, reason: contains not printable characters */
    public static short[] m6602() {
        int iM2543 = C0132.m2543();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2543 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f592short;
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

    @Override // java.lang.Runnable
    public final void run() {
        int iM6909 = C0352.m6909(this);
        s6 s6VarM8689 = C0445.m8689(this);
        x7 x7VarM9144 = C0469.m9144(this);
        switch (iM6909) {
            case 0:
                y3 y3VarM2387 = C0124.m2387(s6VarM8689);
                int i10 = 51588;
                while (true) {
                    i10 ^= 51605;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (y3VarM2387 == null) {
                                i10 = 51681;
                            }
                            break;
                        case 54:
                            break;
                        case 87:
                            try {
                                C0270.m5173(x7VarM9144);
                                C0133.m2560(y3VarM2387, x7VarM9144);
                                int i11 = 51836;
                                while (true) {
                                    i11 ^= 51853;
                                    switch (i11) {
                                        case 241:
                                            i11 = 52518;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                    }
                                    C0310.m6011(s6VarM8689);
                                }
                            } catch (RemoteException e4) {
                                C0419.m8245(C0454.m8871(C0029.m572(s6VarM8689)), C0433.m8486(m6602(), 323, C0338.f609 ^ 795, 2750), e4);
                            }
                            break;
                        case 116:
                            C0135.m2604(C0454.m8871(C0029.m572(s6VarM8689)), C0183.m3496(m6602(), 262, C0432.f703 ^ 560, 1239));
                            int i12 = 51712;
                            while (true) {
                                i12 ^= 51729;
                                switch (i12) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = 51743;
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i10 = 51650;
                }
                break;
            case 1:
                y3 y3VarM2388 = C0124.m2387(s6VarM8689);
                int i13 = 49914;
                while (true) {
                    i13 ^= 49931;
                    switch (i13) {
                        case 497:
                            if (y3VarM2388 == null) {
                                i13 = 50658;
                            }
                            break;
                        case 1711:
                            break;
                        case 1736:
                            try {
                                C0270.m5173(x7VarM9144);
                                C0225.m4346(y3VarM2388, x7VarM9144);
                                C0216.m4125(C0120.m2310(s6VarM8689));
                                C0457.m8908(s6VarM8689, y3VarM2388, null, x7VarM9144);
                                C0310.m6011(s6VarM8689);
                                int i14 = 50813;
                                while (true) {
                                    i14 ^= 50830;
                                    switch (i14) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i14 = 50844;
                                            break;
                                    }
                                }
                            } catch (RemoteException e10) {
                                C0419.m8245(C0454.m8871(C0029.m572(s6VarM8689)), C0320.m6205(m6602(), 222, C0086.f120 ^ (-801), 1200), e10);
                                return;
                            }
                            break;
                        case 1769:
                            C0135.m2604(C0454.m8871(C0029.m572(s6VarM8689)), C0236.m4552(m6602(), 180, C0342.f613 ^ 19, 2487));
                            int i15 = 50689;
                            while (true) {
                                i15 ^= 50706;
                                switch (i15) {
                                    case 19:
                                        i15 = 50720;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i13 = 50627;
                }
                break;
            case 2:
                y3 y3VarM2389 = C0124.m2387(s6VarM8689);
                int i16 = 48891;
                while (true) {
                    i16 ^= 48908;
                    switch (i16) {
                        case 22:
                            break;
                        case 53:
                            try {
                                C0270.m5173(x7VarM9144);
                                C0111.m2149(y3VarM2389, x7VarM9144);
                                C0310.m6011(s6VarM8689);
                                int i17 = 49790;
                                while (true) {
                                    i17 ^= 49807;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i17 = 49821;
                                            break;
                                    }
                                }
                            } catch (RemoteException e11) {
                                C0419.m8245(C0454.m8871(C0029.m572(s6VarM8689)), C0340.m6675(m6602(), 132, C0068.f88 ^ (-714), 2127), e11);
                                return;
                            }
                            break;
                        case 503:
                            if (y3VarM2389 == null) {
                                i16 = 49635;
                            }
                            break;
                        case 32495:
                            C0135.m2604(C0454.m8871(C0029.m572(s6VarM8689)), C0024.m469(m6602(), 88, C0106.f132 ^ (-200), 1272));
                            int i18 = 49666;
                            while (true) {
                                i18 ^= 49683;
                                switch (i18) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i18 = 49697;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i16 = 48953;
                }
                break;
            default:
                y3 y3VarM23810 = C0124.m2387(s6VarM8689);
                int i19 = 1616;
                while (true) {
                    i19 ^= 1633;
                    switch (i19) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i19 = y3VarM23810 == null ? 1709 : 1678;
                            break;
                        case 204:
                            C0135.m2604(C0454.m8871(C0029.m572(s6VarM8689)), C0138.m2667(m6602(), 0, C0273.f389 ^ 398, 3086));
                            int i20 = 1740;
                            while (true) {
                                i20 ^= 1757;
                                switch (i20) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                            try {
                                C0270.m5173(x7VarM9144);
                                C0111.m2141(y3VarM23810, x7VarM9144);
                                C0310.m6011(s6VarM8689);
                                int i21 = 1864;
                                while (true) {
                                    i21 ^= 1881;
                                    switch (i21) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i21 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                            } catch (RemoteException e12) {
                                C0419.m8245(C0454.m8871(C0029.m572(s6VarM8689)), C0297.m5721(m6602(), 42, C0048.f68 ^ (-719), 1463), e12);
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                int iM8516 = C0435.m8516();
                int i22 = 48767;
                while (true) {
                    i22 ^= 48784;
                    switch (i22) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            break;
                        case 76:
                            System.out.println(Double.valueOf(C0491.m9563("8bTcfv")));
                            break;
                        case 239:
                            if (iM8516 <= 0) {
                                i22 = 48860;
                            }
                            break;
                        default:
                            continue;
                    }
                    i22 = 48829;
                }
                break;
        }
    }
}
