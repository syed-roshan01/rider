package k0;

import aa.C0011;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.platform.C0038;
import b3.C0051;
import c1.C0060;
import c3.C0063;
import c4.C0064;
import c4.C0066;
import ca.C0070;
import com.auto.accept.service.C0072;
import com.google.android.datatransport.cct.C0077;
import com.google.android.gms.common.C0087;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.C0192;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import com.google.firebase.remoteconfiginterop.C0202;
import d3.C0217;
import d9.C0227;
import e1.C0260;
import e2.C0261;
import fa.C0280;
import fa.C0281;
import g.C0284;
import g.C0285;
import h.C0299;
import i.C0317;
import j9.C0330;
import k3.C0336;
import l8.C0347;
import m4.C0354;
import p0.C0374;
import q0.C0383;
import r5.C0400;
import t3.C0425;
import v5.C0446;
import v6.C0448;
import w0.C0455;
import x5.C0471;
import x7.C0473;
import y.C0475;
import y.C0476;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0.m3 f9091a = new m0.m3(C0489.m9512());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0.m3 f9092b = new m0.m3(C0201.m3859());

    public static final long a(i0 i0Var, long j10) {
        boolean zM1210 = C0063.m1210(j10, C0285.m5486(i0Var));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1210) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    long jM1225 = C0063.m1225(i0Var);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return jM1225;
                        }
                    }
                    break;
                case 239:
                    boolean zM1211 = C0063.m1210(j10, C0354.m6938(i0Var));
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM1211) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                boolean zM1212 = C0063.m1210(j10, C0280.m5404(i0Var));
                                int i13 = 48891;
                                while (true) {
                                    i13 ^= 48908;
                                    switch (i13) {
                                        case 22:
                                            break;
                                        case 53:
                                            boolean zM1213 = C0063.m1210(j10, C0347.m6779(i0Var));
                                            int i14 = 49790;
                                            while (true) {
                                                i14 ^= 49807;
                                                switch (i14) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 51:
                                                        boolean zM1214 = C0063.m1210(j10, C0299.m5737(i0Var));
                                                        int i15 = 50689;
                                                        while (true) {
                                                            i15 ^= 50706;
                                                            switch (i15) {
                                                                case 19:
                                                                    if (zM1214) {
                                                                        i15 = 50782;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    boolean zM1215 = C0063.m1210(j10, C0448.m8717(i0Var));
                                                                    int i16 = 51588;
                                                                    while (true) {
                                                                        i16 ^= 51605;
                                                                        switch (i16) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                if (zM1215) {
                                                                                    i16 = 51681;
                                                                                }
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                boolean zM1216 = C0063.m1210(j10, C0023.m466(i0Var));
                                                                                int i17 = 51836;
                                                                                while (true) {
                                                                                    i17 ^= 51853;
                                                                                    switch (i17) {
                                                                                        case 241:
                                                                                            if (zM1216) {
                                                                                                i17 = 52580;
                                                                                            }
                                                                                            break;
                                                                                        case 1963:
                                                                                            break;
                                                                                        case 1992:
                                                                                            boolean zM1217 = C0063.m1210(j10, C0051.m1001(i0Var));
                                                                                            int i18 = 52735;
                                                                                            while (true) {
                                                                                                i18 ^= 52752;
                                                                                                switch (i18) {
                                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                        boolean zM1218 = C0063.m1210(j10, C0192.m3671(i0Var));
                                                                                                        int i19 = 53634;
                                                                                                        while (true) {
                                                                                                            i19 ^= 53651;
                                                                                                            switch (i19) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    if (zM1218) {
                                                                                                                        i19 = 53727;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    long jM9232 = C0475.m9232(i0Var);
                                                                                                                    int i20 = 53758;
                                                                                                                    while (true) {
                                                                                                                        i20 ^= 53775;
                                                                                                                        switch (i20) {
                                                                                                                            case 1009:
                                                                                                                                i20 = 54440;
                                                                                                                                break;
                                                                                                                            case 1703:
                                                                                                                                return jM9232;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 83:
                                                                                                                    boolean zM1219 = C0063.m1210(j10, C0330.m6359(i0Var));
                                                                                                                    int i21 = 54533;
                                                                                                                    while (true) {
                                                                                                                        i21 ^= 54550;
                                                                                                                        switch (i21) {
                                                                                                                            case 19:
                                                                                                                                i21 = !zM1219 ? 54595 : 54626;
                                                                                                                                break;
                                                                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                break;
                                                                                                                            case 85:
                                                                                                                                boolean zM12110 = C0063.m1210(j10, C0336.m6503(i0Var));
                                                                                                                                long jM4981 = C0261.m4981(i0Var);
                                                                                                                                int i22 = 55432;
                                                                                                                                while (true) {
                                                                                                                                    i22 ^= 55449;
                                                                                                                                    switch (i22) {
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i22 = zM12110 ? 55525 : 55494;
                                                                                                                                            break;
                                                                                                                                        case 62:
                                                                                                                                            break;
                                                                                                                                        case 95:
                                                                                                                                            boolean zM12111 = C0063.m1210(j10, C0070.m1356(i0Var));
                                                                                                                                            int i23 = 55680;
                                                                                                                                            while (true) {
                                                                                                                                                i23 ^= 55697;
                                                                                                                                                switch (i23) {
                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                        i23 = zM12111 ? 56424 : 56393;
                                                                                                                                                        break;
                                                                                                                                                    case 1467:
                                                                                                                                                        break;
                                                                                                                                                    case 1496:
                                                                                                                                                        boolean zM12112 = C0063.m1210(j10, C0143.m2741(i0Var));
                                                                                                                                                        int i24 = 56579;
                                                                                                                                                        while (true) {
                                                                                                                                                            i24 ^= 56596;
                                                                                                                                                            switch (i24) {
                                                                                                                                                                case 23:
                                                                                                                                                                    i24 = zM12112 ? 1507472 : 56641;
                                                                                                                                                                    break;
                                                                                                                                                                case 54:
                                                                                                                                                                    break;
                                                                                                                                                                case 85:
                                                                                                                                                                    boolean zM12113 = C0063.m1210(j10, C0227.m4357(i0Var));
                                                                                                                                                                    int i25 = 1507627;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i25 ^= 1507644;
                                                                                                                                                                        switch (i25) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i25 = zM12113 ? 1507720 : 1507689;
                                                                                                                                                                                break;
                                                                                                                                                                            case 85:
                                                                                                                                                                                boolean zM12114 = C0063.m1210(j10, C0182.m3486(i0Var));
                                                                                                                                                                                int i26 = 1508526;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i26 ^= 1508543;
                                                                                                                                                                                    switch (i26) {
                                                                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                            i26 = zM12114 ? 1508619 : 1508588;
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 83:
                                                                                                                                                                                            boolean zM12115 = C0063.m1210(j10, C0260.m4945(i0Var));
                                                                                                                                                                                            int i27 = 1509425;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i27 ^= 1509442;
                                                                                                                                                                                                switch (i27) {
                                                                                                                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                                                                                                                                        boolean zM12116 = C0063.m1210(j10, C0284.m5457(i0Var));
                                                                                                                                                                                                        int i28 = 1509673;
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            i28 ^= 1509690;
                                                                                                                                                                                                            switch (i28) {
                                                                                                                                                                                                                case 19:
                                                                                                                                                                                                                    i28 = zM12116 ? 1510417 : 1510386;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 712:
                                                                                                                                                                                                                    boolean zM12117 = C0063.m1210(j10, C0198.m3809(i0Var));
                                                                                                                                                                                                                    int i29 = 1510572;
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        i29 ^= 1510589;
                                                                                                                                                                                                                        switch (i29) {
                                                                                                                                                                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                                                i29 = zM12117 ? 1511316 : 1510634;
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 87:
                                                                                                                                                                                                                                C0374.m7326();
                                                                                                                                                                                                                                return C0011.m220();
                                                                                                                                                                                                                            case 118:
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 809:
                                                                                                                                                                                                                                int i30 = 1511347;
                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    i30 ^= 1511364;
                                                                                                                                                                                                                                    switch (i30) {
                                                                                                                                                                                                                                        case 22:
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        case 119:
                                                                                                                                                                                                                                            i30 = 1511378;
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
                                                                                                                                                                                                                case 745:
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 1323:
                                                                                                                                                                                                                    int i31 = 1510448;
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        i31 ^= 1510465;
                                                                                                                                                                                                                        switch (i31) {
                                                                                                                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 113:
                                                                                                                                                                                                                                i31 = 1510479;
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
                                                                                                                                                                                                    case 115:
                                                                                                                                                                                                        i27 = zM12115 ? 1509518 : 1509487;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 204:
                                                                                                                                                                                                        int i32 = 1509549;
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            i32 ^= 1509566;
                                                                                                                                                                                                            switch (i32) {
                                                                                                                                                                                                                case 19:
                                                                                                                                                                                                                    i32 = 1509580;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 114:
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 114:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 436:
                                                                                                                                                                                            int i33 = 1508650;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i33 ^= 1508667;
                                                                                                                                                                                                switch (i33) {
                                                                                                                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                                                                                        i33 = 1508681;
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                    case 114:
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
                                                                                                                                                                            case 118:
                                                                                                                                                                                break;
                                                                                                                                                                            case 180:
                                                                                                                                                                                int i34 = 1507751;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i34 ^= 1507768;
                                                                                                                                                                                    switch (i34) {
                                                                                                                                                                                        case 31:
                                                                                                                                                                                            i34 = 1508433;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        case 1513:
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
                                                                                                                                                                case 1564036:
                                                                                                                                                                    int i35 = 1507503;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i35 ^= 1507520;
                                                                                                                                                                        switch (i35) {
                                                                                                                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                                                                                                                break;
                                                                                                                                                                            case 111:
                                                                                                                                                                                i35 = 1507534;
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
                                                                                                                                                    case 1529:
                                                                                                                                                        long jM3164 = C0165.m3164(i0Var);
                                                                                                                                                        int i36 = 56455;
                                                                                                                                                        while (true) {
                                                                                                                                                            i36 ^= 56472;
                                                                                                                                                            switch (i36) {
                                                                                                                                                                case 31:
                                                                                                                                                                    i36 = 56486;
                                                                                                                                                                    break;
                                                                                                                                                                case 62:
                                                                                                                                                                    return jM3164;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 124:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                int i37 = 55556;
                                                                                                                                while (true) {
                                                                                                                                    i37 ^= 55573;
                                                                                                                                    switch (i37) {
                                                                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                                            i37 = 55587;
                                                                                                                                            break;
                                                                                                                                        case 54:
                                                                                                                                            return jM4981;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                long jM5428 = C0281.m5428(i0Var);
                                                                                                                                int i38 = 54657;
                                                                                                                                while (true) {
                                                                                                                                    i38 ^= 54674;
                                                                                                                                    switch (i38) {
                                                                                                                                        case 19:
                                                                                                                                            i38 = 54688;
                                                                                                                                            break;
                                                                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                                            return jM5428;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i19 = 53696;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1007:
                                                                                                        if (zM1217) {
                                                                                                            i18 = 53479;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 7927:
                                                                                                        long jM1229 = C0064.m1229(i0Var);
                                                                                                        int i39 = 53510;
                                                                                                        while (true) {
                                                                                                            i39 ^= 53527;
                                                                                                            switch (i39) {
                                                                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                                    i39 = 53541;
                                                                                                                    break;
                                                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                                    return jM1229;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                                i18 = 52797;
                                                                                            }
                                                                                            break;
                                                                                        case 2025:
                                                                                            long jM1557 = C0072.m1557(i0Var);
                                                                                            int i40 = 52611;
                                                                                            while (true) {
                                                                                                i40 ^= 52628;
                                                                                                switch (i40) {
                                                                                                    case 23:
                                                                                                        i40 = 52642;
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        return jM1557;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i17 = 52549;
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                long jM1666 = C0077.m1666(i0Var);
                                                                                int i41 = 51712;
                                                                                while (true) {
                                                                                    i41 ^= 51729;
                                                                                    switch (i41) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            return jM1666;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i41 = 51743;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i16 = 51650;
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    long jM9161 = C0471.m9161(i0Var);
                                                                    int i42 = 50813;
                                                                    while (true) {
                                                                        i42 ^= 50830;
                                                                        switch (i42) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                return jM9161;
                                                                            case 243:
                                                                                i42 = 50844;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i15 = 50751;
                                                        }
                                                        break;
                                                    case 84:
                                                        long jM4358 = C0227.m4358(i0Var);
                                                        int i43 = 49914;
                                                        while (true) {
                                                            i43 ^= 49931;
                                                            switch (i43) {
                                                                case 497:
                                                                    i43 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    return jM4358;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        if (zM1213) {
                                                            i14 = 49883;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i14 = 49852;
                                            }
                                            break;
                                        case 503:
                                            if (zM1212) {
                                                i13 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            long jM7494 = C0383.m7494(i0Var);
                                            int i44 = 49666;
                                            while (true) {
                                                i44 ^= 49683;
                                                switch (i44) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i44 = 49697;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        return jM7494;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48953;
                                }
                                break;
                            case 47417:
                                long jM3879 = C0202.m3879(i0Var);
                                int i45 = 48767;
                                while (true) {
                                    i45 ^= 48784;
                                    switch (i45) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            return jM3879;
                                        case 239:
                                            i45 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static final long b(long j10, m0.m mVar) {
        m0.q qVar = (m0.q) mVar;
        long jM739 = C0038.m739((i0) C0476.m9256(qVar, C0446.m8687()), j10);
        long jM220 = C0011.m220();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (jM739 != jM220) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return jM739;
                        }
                    }
                    break;
                case 239:
                    return C0455.m8864((e1.r) C0476.m9256(qVar, C0112.m2168()));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public static final long c(i0 i0Var, int i10) {
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (i10 != 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    switch ((C0066.f86 ^ 217) + i10) {
                        case 0:
                            return C0347.m6779(i0Var);
                        case 1:
                            long jM5737 = C0299.m5737(i0Var);
                            int i12 = 1511471;
                            while (true) {
                                i12 ^= 1511488;
                                switch (i12) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return jM5737;
                                    case 111:
                                        i12 = 1511502;
                                        break;
                                }
                            }
                            break;
                        case 2:
                            long jM3671 = C0192.m3671(i0Var);
                            int i13 = 1511347;
                            while (true) {
                                i13 ^= 1511364;
                                switch (i13) {
                                    case 22:
                                        return jM3671;
                                    case 119:
                                        i13 = 1511378;
                                        break;
                                }
                            }
                            break;
                        case 3:
                            long jM5428 = C0281.m5428(i0Var);
                            int i14 = 1510572;
                            while (true) {
                                i14 ^= 1510589;
                                switch (i14) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = 1510603;
                                        break;
                                    case 118:
                                        return jM5428;
                                }
                            }
                            break;
                        case 4:
                            long jM1144 = C0060.m1144(i0Var);
                            int i15 = 1510448;
                            while (true) {
                                i15 ^= 1510465;
                                switch (i15) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return jM1144;
                                    case 113:
                                        i15 = 1510479;
                                        break;
                                }
                            }
                            break;
                        case 5:
                            long jM6359 = C0330.m6359(i0Var);
                            int i16 = 1509673;
                            while (true) {
                                i16 ^= 1509690;
                                switch (i16) {
                                    case 19:
                                        i16 = 1510355;
                                        break;
                                    case 745:
                                        return jM6359;
                                }
                            }
                            break;
                        case 6:
                            long jM4358 = C0227.m4358(i0Var);
                            int i17 = 1509549;
                            while (true) {
                                i17 ^= 1509566;
                                switch (i17) {
                                    case 19:
                                        i17 = 1509580;
                                        break;
                                    case 114:
                                        return jM4358;
                                }
                            }
                            break;
                        case 7:
                            long jM9161 = C0471.m9161(i0Var);
                            int i18 = 1509425;
                            while (true) {
                                i18 ^= 1509442;
                                switch (i18) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return jM9161;
                                    case 115:
                                        i18 = 1509456;
                                        break;
                                }
                            }
                            break;
                        case 8:
                            long jM9232 = C0475.m9232(i0Var);
                            int i19 = 1508650;
                            while (true) {
                                i19 ^= 1508667;
                                switch (i19) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i19 = 1508681;
                                        break;
                                    case 114:
                                        return jM9232;
                                }
                            }
                            break;
                        case 9:
                            long jM1225 = C0063.m1225(i0Var);
                            int i20 = 1508526;
                            while (true) {
                                i20 ^= 1508543;
                                switch (i20) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i20 = 1508557;
                                        break;
                                    case 114:
                                        return jM1225;
                                }
                            }
                            break;
                        case 10:
                            long jM1666 = C0077.m1666(i0Var);
                            int i21 = 1507751;
                            while (true) {
                                i21 ^= 1507768;
                                switch (i21) {
                                    case 31:
                                        i21 = 1508433;
                                        break;
                                    case 1513:
                                        return jM1666;
                                }
                            }
                            break;
                        case 11:
                        case 12:
                        case 15:
                        case Code.UNAUTHENTICATED /* 16 */:
                        case 21:
                        case 22:
                        case 27:
                        case 28:
                        case 32:
                        case 33:
                        default:
                            long jM220 = C0011.m220();
                            int i22 = 1740;
                            while (true) {
                                i22 ^= 1757;
                                switch (i22) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i22 = 1771;
                                        break;
                                    case 54:
                                        return jM220;
                                }
                            }
                            break;
                        case 13:
                            long jM3879 = C0202.m3879(i0Var);
                            int i23 = 1507627;
                            while (true) {
                                i23 ^= 1507644;
                                switch (i23) {
                                    case 23:
                                        i23 = 1507658;
                                        break;
                                    case 118:
                                        return jM3879;
                                }
                            }
                            break;
                        case Code.UNAVAILABLE /* 14 */:
                            long jM1557 = C0072.m1557(i0Var);
                            int i24 = 1507503;
                            while (true) {
                                i24 ^= 1507520;
                                switch (i24) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return jM1557;
                                    case 111:
                                        i24 = 1507534;
                                        break;
                                }
                            }
                            break;
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            long jM4981 = C0261.m4981(i0Var);
                            int i25 = 56579;
                            while (true) {
                                i25 ^= 56596;
                                switch (i25) {
                                    case 23:
                                        i25 = 56610;
                                        break;
                                    case 54:
                                        return jM4981;
                                }
                            }
                            break;
                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            long jM3164 = C0165.m3164(i0Var);
                            int i26 = 56455;
                            while (true) {
                                i26 ^= 56472;
                                switch (i26) {
                                    case 31:
                                        i26 = 56486;
                                        break;
                                    case 62:
                                        return jM3164;
                                }
                            }
                            break;
                        case 19:
                            long jM7494 = C0383.m7494(i0Var);
                            int i27 = 55680;
                            while (true) {
                                i27 ^= 55697;
                                switch (i27) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i27 = 56362;
                                        break;
                                    case 1467:
                                        return jM7494;
                                }
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                            long jM1229 = C0064.m1229(i0Var);
                            int i28 = 55556;
                            while (true) {
                                i28 ^= 55573;
                                switch (i28) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i28 = 55587;
                                        break;
                                    case 54:
                                        return jM1229;
                                }
                            }
                            break;
                        case 23:
                            long jM6121 = C0317.m6121(i0Var);
                            int i29 = 55432;
                            while (true) {
                                i29 ^= 55449;
                                switch (i29) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i29 = 55463;
                                        break;
                                    case 62:
                                        return jM6121;
                                }
                            }
                            break;
                        case 24:
                            long jM2220 = C0115.m2220(i0Var);
                            int i30 = 54657;
                            while (true) {
                                i30 ^= 54674;
                                switch (i30) {
                                    case 19:
                                        i30 = 54688;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return jM2220;
                                }
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                            long jM5486 = C0285.m5486(i0Var);
                            int i31 = 54533;
                            while (true) {
                                i31 ^= 54550;
                                switch (i31) {
                                    case 19:
                                        i31 = 54564;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return jM5486;
                                }
                            }
                            break;
                        case 26:
                            long jM8717 = C0448.m8717(i0Var);
                            int i32 = 53758;
                            while (true) {
                                i32 ^= 53775;
                                switch (i32) {
                                    case 1009:
                                        i32 = 54440;
                                        break;
                                    case 1703:
                                        return jM8717;
                                }
                            }
                            break;
                        case 29:
                            long jM2654 = C0137.m2654(i0Var);
                            int i33 = 53634;
                            while (true) {
                                i33 ^= 53651;
                                switch (i33) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i33 = 53665;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return jM2654;
                                }
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                            long jM6938 = C0354.m6938(i0Var);
                            int i34 = 53510;
                            while (true) {
                                i34 ^= 53527;
                                switch (i34) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i34 = 53541;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return jM6938;
                                }
                            }
                            break;
                        case 31:
                            long jM466 = C0023.m466(i0Var);
                            int i35 = 52735;
                            while (true) {
                                i35 ^= 52752;
                                switch (i35) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return jM466;
                                    case 1007:
                                        i35 = 52766;
                                        break;
                                }
                            }
                            break;
                        case 34:
                            long jM6503 = C0336.m6503(i0Var);
                            int i36 = 52611;
                            while (true) {
                                i36 ^= 52628;
                                switch (i36) {
                                    case 23:
                                        i36 = 52642;
                                        break;
                                    case 54:
                                        return jM6503;
                                }
                            }
                            break;
                        case 35:
                            long jM2741 = C0143.m2741(i0Var);
                            int i37 = 51836;
                            while (true) {
                                i37 ^= 51853;
                                switch (i37) {
                                    case 241:
                                        i37 = 52518;
                                        break;
                                    case 1963:
                                        return jM2741;
                                }
                            }
                            break;
                        case 36:
                            long jM4357 = C0227.m4357(i0Var);
                            int i38 = 51712;
                            while (true) {
                                i38 ^= 51729;
                                switch (i38) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return jM4357;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i38 = 51743;
                                        break;
                                }
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                            long jM3486 = C0182.m3486(i0Var);
                            int i39 = 51588;
                            while (true) {
                                i39 ^= 51605;
                                switch (i39) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i39 = 51619;
                                        break;
                                    case 54:
                                        return jM3486;
                                }
                            }
                            break;
                        case 38:
                            long jM4945 = C0260.m4945(i0Var);
                            int i40 = 50813;
                            while (true) {
                                i40 ^= 50830;
                                switch (i40) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return jM4945;
                                    case 243:
                                        i40 = 50844;
                                        break;
                                }
                            }
                            break;
                        case 39:
                            long jM5457 = C0284.m5457(i0Var);
                            int i41 = 50689;
                            while (true) {
                                i41 ^= 50706;
                                switch (i41) {
                                    case 19:
                                        i41 = 50720;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return jM5457;
                                }
                            }
                            break;
                        case 40:
                            long jM3809 = C0198.m3809(i0Var);
                            int i42 = 49914;
                            while (true) {
                                i42 ^= 49931;
                                switch (i42) {
                                    case 497:
                                        i42 = 50596;
                                        break;
                                    case 1711:
                                        return jM3809;
                                }
                            }
                            break;
                        case 41:
                            long jM8330 = C0425.m8330(i0Var);
                            int i43 = 49790;
                            while (true) {
                                i43 ^= 49807;
                                switch (i43) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        return jM8330;
                                    case 241:
                                        i43 = 49821;
                                        break;
                                }
                            }
                            break;
                        case 42:
                            long jM418 = C0021.m418(i0Var);
                            int i44 = 49666;
                            while (true) {
                                i44 ^= 49683;
                                switch (i44) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i44 = 49697;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        return jM418;
                                }
                            }
                            break;
                        case 43:
                            long jM1356 = C0070.m1356(i0Var);
                            int i45 = 48891;
                            while (true) {
                                i45 ^= 48908;
                                switch (i45) {
                                    case 22:
                                        return jM1356;
                                    case 503:
                                        i45 = 48922;
                                        break;
                                }
                            }
                            break;
                        case 44:
                            long jM5404 = C0280.m5404(i0Var);
                            int i46 = 48767;
                            while (true) {
                                i46 ^= 48784;
                                switch (i46) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        return jM5404;
                                    case 239:
                                        i46 = 48798;
                                        break;
                                }
                            }
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            long jM1001 = C0051.m1001(i0Var);
                            int i47 = 1864;
                            while (true) {
                                i47 ^= 1881;
                                switch (i47) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i47 = 48674;
                                        break;
                                    case 47483:
                                        return jM1001;
                                }
                            }
                            break;
                    }
                    break;
                case 239:
                    throw null;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static final long d(int i10, m0.m mVar) {
        long jM1857 = 0;
        String str = "ۧۤۦ";
        m0.m3 m3VarM8687 = null;
        Object objM9256 = null;
        m0.q qVar = null;
        i0 i0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746845:
                    str = "ۨۨۡ";
                    m3VarM8687 = C0446.m8687();
                    break;
                case 1747903:
                    jM1857 = C0087.m1857(i0Var, i10);
                    str = "ۡۧۢ";
                    break;
                case 1748860:
                    return jM1857;
                case 1754537:
                    str = "۟ۤۢ";
                    qVar = (m0.q) mVar;
                    break;
                case 1755617:
                    objM9256 = C0476.m9256(qVar, m3VarM8687);
                    str = "ۥ۠ۦ";
                    break;
                default:
                    str = "۠ۧۦ";
                    i0Var = (i0) objM9256;
                    break;
            }
        }
    }

    public static final long e(i0 i0Var, float f10) {
        boolean zM7816 = C0400.m7816(f10, 0);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM7816) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0336.m6503(i0Var);
                case 239:
                    return C0132.m2555(C0217.m4129(C0021.m418(i0Var), ((((((float) C0473.m9202(((f10 + 3.0f) + 1) - 3.0f)) * 4.5f) - 16.0f) + 2.0f) + 16.0f) / 100.0f), C0336.m6503(i0Var));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
