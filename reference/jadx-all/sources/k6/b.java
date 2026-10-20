package k6;

import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import c0.C0057;
import c3.C0063;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.iid.C0170;
import com.google.firebase.measurement.C0183;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import dagger.hilt.components.C0245;
import dagger.hilt.internal.generatesrootinput.C0251;
import e0.C0257;
import e9.C0267;
import fa.C0282;
import g2.C0288;
import g3.C0289;
import g7.C0293;
import ga.C0296;
import ja.C0331;
import l2.C0342;
import l8.C0347;
import n9.C0367;
import o2.C0369;
import okhttp3.internal.publicsuffix.C0373;
import r.C0393;
import t1.C0420;
import u2.C0434;
import u8.C0439;
import w0.C0455;
import w4.C0461;
import w5.C0464;
import x5.C0471;
import z3.C0488;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f524short = {1283, 1324, 1335, 1334, 1329, 1381, 1316, 1313, 1381, 1328, 1323, 1324, 1329, 1381, 1312, 1341, 1333, 1322, 1334, 1328, 1335, 1312, 1381, 1329, 1324, 1320, 1312, 1381, 1330, 1316, 1334, 1381, 1323, 1312, 1331, 1312, 1335, 1381, 1334, 1312, 1329, 2304, 2351, 2356, 2357, 2354, 2406, 2343, 2338, 2406, 2339, 2366, 2358, 2345, 2357, 2355, 2356, 2339, 2406, 2354, 2351, 2347, 2339, 2406, 2353, 2343, 2357, 2406, 2344, 2339, 2352, 2339, 2356, 2406, 2357, 2339, 2354, 3000, 2970, 2967, 2967, 3035, 2959, 2964, 3035, 2974, 2965, 2975, 3002, 2975, 2990, 2965, 2962, 2959, 3006, 2947, 2955, 2964, 2952, 2958, 2953, 2974, 3035, 2973, 2964, 2953, 3035, 2958, 2965, 2960, 2965, 2964, 2956, 2965, 3035, 2970, 2975, 3035, 2958, 2965, 2962, 2959, 3035, 2962, 2975, 1379, 1368, 1368, 1303, 1370, 1366, 1369, 1358, 1303, 1366, 1363, 1348, 1303, 1345, 1374, 1348, 1374, 1365, 1371, 1362};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f9906d;

    public /* synthetic */ b(q qVar, String str, long j10, int i10) {
        this.f9903a = i10;
        this.f9906d = qVar;
        this.f9904b = str;
        this.f9905c = j10;
        int iM3247 = C0170.m3247();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3247 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0267.m5085("8ZqaGMM8E")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6536() {
        int iM9496 = C0488.m9496();
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
                    return f524short;
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
        int iM7226 = C0369.m7226(this);
        long jM6700 = C0342.m6700(this);
        String strM5531 = C0288.m5531(this);
        q qVarM9153 = C0471.m9153(this);
        switch (iM7226) {
            case 0:
                C0040.m791(qVarM9153);
                C0282.m5438(strM5531);
                q.f fVarM4688 = C0245.m4688(qVarM9153);
                boolean zM9034 = C0464.m9034(fVarM4688);
                int i10 = 51588;
                while (true) {
                    i10 ^= 51605;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i10 = zM9034 ? 51681 : 51650;
                            break;
                        case 54:
                            break;
                        case 87:
                            break;
                        case 116:
                            qVarM9153.f10314d = jM6700;
                            break;
                        default:
                            break;
                    }
                }
                Integer num = (Integer) C0183.m3495(fVarM4688, strM5531);
                int i11 = 51712;
                while (true) {
                    i11 ^= 51729;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (num != null) {
                                i11 = 51805;
                            }
                            break;
                        case 47:
                            int iM2558 = C0133.m2558(fVarM4688);
                            int i12 = 52611;
                            while (true) {
                                i12 ^= 52628;
                                switch (i12) {
                                    case 23:
                                        i12 = iM2558 < 100 ? 52673 : 52704;
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        C0289.m5548(fVarM4688, strM5531, C0057.m1083(1));
                                        C0289.m5548(C0393.m7684(qVarM9153), strM5531, C0439.m8554(jM6700));
                                        break;
                                    case 116:
                                        C0135.m2604(C0331.m6385(C0029.m572(qVarM9153)), C0200.m3834(m6536(), 125, C0488.f761 ^ (-266), 1335));
                                        int i13 = 52735;
                                        while (true) {
                                            i13 ^= 52752;
                                            switch (i13) {
                                                case Code.UNAVAILABLE /* 14 */:
                                                    break;
                                                case 1007:
                                                    i13 = 52766;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 76:
                            C0289.m5548(fVarM4688, strM5531, C0057.m1083(1 - (0 - C0367.m7190(num))));
                            int i14 = 51836;
                            while (true) {
                                i14 ^= 51853;
                                switch (i14) {
                                    case 241:
                                        i14 = 52518;
                                        break;
                                    case 1963:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i11 = 51774;
                }
                break;
            default:
                C0040.m791(qVarM9153);
                C0282.m5438(strM5531);
                q.f fVarM4689 = C0245.m4688(qVarM9153);
                Integer num2 = (Integer) C0183.m3495(fVarM4689, strM5531);
                int i15 = 1616;
                while (true) {
                    i15 ^= 1633;
                    switch (i15) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i15 = num2 != null ? 1709 : 1678;
                            break;
                        case 204:
                            q6 q6VarM7299 = C0373.m7299(C0347.m6778(qVarM9153), false);
                            int iM7190 = ((C0367.m7190(num2) - 18) - 1) + 18;
                            int i16 = 1740;
                            while (true) {
                                i16 ^= 1757;
                                switch (i16) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i16 = iM7190 == 0 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0289.m5548(fVarM4689, strM5531, C0057.m1083(iM7190));
                                        int i17 = 50689;
                                        while (true) {
                                            i17 ^= 50706;
                                            switch (i17) {
                                                case 19:
                                                    i17 = 50720;
                                                    continue;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        C0293.m5627(fVarM4689, strM5531);
                                        q.f fVarM7684 = C0393.m7684(qVarM9153);
                                        Long l10 = (Long) C0183.m3495(fVarM7684, strM5531);
                                        int i18 = 1864;
                                        while (true) {
                                            i18 ^= 1881;
                                            switch (i18) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i18 = l10 == null ? 48736 : 48705;
                                                    break;
                                                case 47384:
                                                    long jM9543 = C0491.m9543(l10);
                                                    C0293.m5627(fVarM7684, strM5531);
                                                    C0212.m4039(qVarM9153, strM5531, ((jM6700 - 4) - jM9543) + 4, q6VarM7299);
                                                    break;
                                                case 47417:
                                                    C0135.m2604(C0455.m8871(C0029.m572(qVarM9153)), C0024.m469(m6536(), 0, C0185.f209 ^ 825, 1349));
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
                                        boolean zM9035 = C0464.m9034(fVarM4689);
                                        int i20 = 48891;
                                        while (true) {
                                            i20 ^= 48908;
                                            switch (i20) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    break;
                                                case 503:
                                                    i20 = zM9035 ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    long jM4792 = C0251.m4792(qVarM9153);
                                                    int i21 = 49666;
                                                    while (true) {
                                                        i21 ^= 49683;
                                                        switch (i21) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i21 = jM4792 == 0 ? 49759 : 49728;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                            case 76:
                                                                C0135.m2604(C0455.m8871(C0029.m572(qVarM9153)), C0296.m5683(m6536(), 41, C0461.f731 ^ 993, 2374));
                                                                int i22 = 49790;
                                                                while (true) {
                                                                    i22 ^= 49807;
                                                                    switch (i22) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 241:
                                                                            i22 = 49821;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                C0158.m3018(qVarM9153, ((jM6700 - 26) - jM4792) + 26, q6VarM7299);
                                                                qVarM9153.f10314d = 0L;
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
                        case 239:
                            C0420.m8245(C0455.m8871(C0029.m572(qVarM9153)), C0257.m4907(m6536(), 77, C0434.f704 ^ (-575), 3067), strM5531);
                            break;
                        default:
                            break;
                    }
                }
                int iM1217 = C0063.m1217();
                int i24 = 50813;
                while (true) {
                    i24 ^= 50830;
                    switch (i24) {
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            break;
                        case 53:
                            break;
                        case 243:
                            if (iM1217 <= 0) {
                                i24 = 51557;
                            }
                            break;
                        case 4075:
                            System.out.println(Float.parseFloat(C0165.m3157("BinW8rgZU2FD45HyyIi")));
                            break;
                        default:
                            continue;
                    }
                    i24 = 50875;
                }
                break;
        }
    }
}
