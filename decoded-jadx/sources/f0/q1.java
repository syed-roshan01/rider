package f0;

import a0.C0003;
import a8.C0009;
import android.support.v4.app.C0014;
import android.view.KeyEvent;
import androidx.appcompat.widget.C0020;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0027;
import c0.C0057;
import c3.C0062;
import c7.C0069;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.C0143;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.C0218;
import d9.C0223;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0263;
import f.C0270;
import fa.C0280;
import h.C0296;
import h3.C0301;
import h4.C0304;
import h6.C0309;
import h7.C0312;
import i6.C0320;
import ja.C0330;
import l3.C0342;
import n9.C0366;
import o4.C0369;
import o7.i2;
import u4.C0435;
import v0.C0440;
import w2.C0458;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 extends d9.h implements c9.c {
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x01e0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x01f5. Please report as an issue. */
    @Override // c9.c
    public final Object invoke(Object obj) {
        g2.a aVar;
        boolean z10;
        Integer numM1083;
        boolean zM538 = false;
        KeyEvent keyEventM4800 = C0250.m4800((m1.b) obj);
        p1 p1Var = (p1) C0330.m6377(this);
        C0014.m280(p1Var);
        int iM71 = C0003.m71(keyEventM4800);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM71 == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM1350 = C0069.m1350(C0296.m5701(keyEventM4800));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = !zM1350 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                aVar = null;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                k0 k0VarM7244 = C0369.m7244(p1Var);
                                C0014.m280(k0VarM7244);
                                int iM5701 = C0296.m5701(keyEventM4800);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = (((iM5701 ^ (-1)) ^ Integer.MIN_VALUE) & Integer.MIN_VALUE) != 0 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            Integer numM2616 = C0135.m2616(k0VarM7244);
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        numM1083 = C0057.m1083(iM5701);
                                                        break;
                                                    case 503:
                                                        i13 = numM2616 != null ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        k0VarM7244.f5809a = null;
                                                        numM1083 = C0057.m1083(C0263.m5025(C0366.m7190(numM2616), iM5701));
                                                        int iM8515 = C0435.m8515(numM1083);
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i14 = iM8515 == 0 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    numM1083 = null;
                                                                    break;
                                                                case 83:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        int i15 = 49790;
                                                        while (true) {
                                                            i15 ^= 49807;
                                                            switch (i15) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    numM1083 = C0057.m1083(iM5701);
                                                                    int i16 = 49914;
                                                                    while (true) {
                                                                        i16 ^= 49931;
                                                                        switch (i16) {
                                                                            case 497:
                                                                                i16 = 50596;
                                                                                continue;
                                                                            case 1711:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i15 = numM1083 == null ? 49883 : 49852;
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
                                        case 47417:
                                            k0VarM7244.f5809a = C0057.m1083((Integer.MIN_VALUE ^ iM5701) & iM5701);
                                            int i17 = 48767;
                                            while (true) {
                                                i17 ^= 48784;
                                                switch (i17) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        numM1083 = null;
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
                                int i18 = 50689;
                                while (true) {
                                    i18 ^= 50706;
                                    switch (i18) {
                                        case 19:
                                            i18 = numM1083 != null ? 50782 : 50751;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            aVar = null;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            aVar = new g2.a(C0440.m8605(C0223.m4306(new StringBuilder(), C0366.m7190(numM1083))), 1);
                                            int i19 = 50813;
                                            while (true) {
                                                i19 ^= 50830;
                                                switch (i19) {
                                                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i19 = 50844;
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
                case 239:
                    aVar = null;
                    break;
                default:
                    break;
            }
        }
        h0.a1 a1VarM5431 = C0280.m5431(p1Var);
        boolean zM3364 = C0176.m3364(p1Var);
        int i20 = 51588;
        while (true) {
            i20 ^= 51605;
            switch (i20) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (aVar != null) {
                        i20 = 51681;
                    }
                    break;
                case 54:
                    break;
                case 87:
                    boolean zM2950 = C0154.m2950(C0075.m1628(keyEventM4800), C0270.f350 ^ (-732));
                    int i21 = 52735;
                    while (true) {
                        i21 ^= 52752;
                        switch (i21) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                t0 t0VarM6036 = C0312.m6036(C0162.m3111(p1Var), keyEventM4800);
                                int i22 = 53634;
                                while (true) {
                                    i22 ^= 53651;
                                    switch (i22) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (t0VarM6036 != null) {
                                                i22 = 53727;
                                            }
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        case 76:
                                            boolean zM6709 = C0342.m6709(t0VarM6036);
                                            int i23 = 53758;
                                            while (true) {
                                                i23 ^= 53775;
                                                switch (i23) {
                                                    case 1009:
                                                        i23 = zM6709 ? 54502 : 54471;
                                                        break;
                                                    case 1703:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        int i24 = 54533;
                                                        while (true) {
                                                            i24 ^= 54550;
                                                            switch (i24) {
                                                                case 19:
                                                                    i24 = !zM3364 ? 54626 : 54595;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 85:
                                                                    break;
                                                                case 116:
                                                                    int i25 = 54657;
                                                                    while (true) {
                                                                        i25 ^= 54674;
                                                                        switch (i25) {
                                                                            case 19:
                                                                                i25 = 54688;
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
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            d9.q qVar = new d9.q();
                                            qVar.f4948a = true;
                                            b.g gVar = new b.g(t0VarM6036, p1Var, qVar, C0072.f104 ^ 127);
                                            d2 d2VarM9440 = C0485.m9440(C0330.m6378(p1Var));
                                            g2.a0 a0VarM4215 = C0218.m4215(p1Var);
                                            h0.r0 r0Var = new h0.r0(a0VarM4215, C0458.m8927(p1Var), d2VarM9440, a1VarM5431);
                                            C0203.m3890(gVar, r0Var);
                                            boolean zM5038 = C0263.m5038(C0301.m5811(r0Var), C0309.m5972(a0VarM4215));
                                            int i26 = 55432;
                                            while (true) {
                                                i26 ^= 55449;
                                                switch (i26) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i26 = zM5038 ? 55525 : 55494;
                                                        break;
                                                    case 62:
                                                        break;
                                                    case 95:
                                                        C0223.m4297(C0009.m176(p1Var), C0020.m412(a0VarM4215, C0237.m4584(r0Var), C0301.m5811(r0Var), C0022.f42 ^ (-686)));
                                                        break;
                                                    case 124:
                                                        boolean zM4399 = C0228.m4399(C0237.m4584(r0Var), C0143.m2754(a0VarM4215));
                                                        int i27 = 55556;
                                                        while (true) {
                                                            i27 ^= 55573;
                                                            switch (i27) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i27 = !zM4399 ? 55649 : 55618;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    break;
                                                                case 116:
                                                                    C0223.m4297(C0009.m176(p1Var), C0020.m412(a0VarM4215, C0237.m4584(r0Var), C0301.m5811(r0Var), C0022.f42 ^ (-686)));
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
                                            e2 e2VarM1195 = C0062.m1195(p1Var);
                                            int i28 = 55680;
                                            while (true) {
                                                i28 ^= 55697;
                                                switch (i28) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        if (e2VarM1195 != null) {
                                                            i28 = 56424;
                                                        }
                                                        break;
                                                    case 1467:
                                                        break;
                                                    case 1496:
                                                        break;
                                                    case 1529:
                                                        e2VarM1195.f5692f = true;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i28 = 56393;
                                            }
                                            zM538 = C0027.m538(qVar);
                                            break;
                                        case 83:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i22 = 53696;
                                }
                                break;
                            case 1007:
                                if (!zM2950) {
                                    i21 = 53479;
                                }
                                break;
                            case 7927:
                                int i29 = 53510;
                                while (true) {
                                    i29 ^= 53527;
                                    switch (i29) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i29 = 53541;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i21 = 52797;
                    }
                    break;
                case 116:
                    int i30 = 51712;
                    while (true) {
                        i30 ^= 51729;
                        switch (i30) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i30 = zM3364 ? 51805 : 51774;
                                break;
                            case 47:
                                z10 = false;
                                break;
                            case 76:
                                C0304.m5866(p1Var, C0320.m6195(aVar));
                                a1VarM5431.f7345a = null;
                                int i31 = 51836;
                                while (true) {
                                    i31 ^= 51853;
                                    switch (i31) {
                                        case 241:
                                            i31 = 52518;
                                            continue;
                                        case 1963:
                                            z10 = true;
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
                    int i32 = 52611;
                    while (true) {
                        i32 ^= 52628;
                        switch (i32) {
                            case 23:
                                i32 = 52642;
                                break;
                            case 54:
                                zM538 = z10;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i20 = 51650;
        }
        return C0009.m192(zM538);
    }
}
