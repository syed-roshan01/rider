package k0;

import a3.C0006;
import android.support.v4.app.C0014;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.semantics.C0039;
import androidx.core.content.C0041;
import b7.C0053;
import c1.C0059;
import c4.C0065;
import com.auto.accept.service.C0072;
import com.auto.accept.ui.viewmodel.C0074;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.C0087;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.installations.C0177;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0211;
import d2.C0215;
import d9.C0225;
import d9.C0226;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.aliasof.C0247;
import dagger.hilt.internal.generatesrootinput.C0250;
import e2.C0261;
import f.C0269;
import f1.C0273;
import f4.C0276;
import g3.C0288;
import g5.C0291;
import g8.C0293;
import h.C0298;
import h0.C0299;
import h1.C0300;
import h5.C0308;
import h7.C0310;
import h7.C0311;
import i.C0316;
import k2.C0333;
import k4.C0336;
import l6.C0343;
import l8.C0346;
import m5.C0355;
import n.C0360;
import q2.C0384;
import q5.C0385;
import r.C0392;
import r1.C0393;
import r4.C0398;
import r6.C0402;
import r7.C0403;
import s.C0408;
import s7.C0415;
import x0.C0466;
import x5.C0470;
import x7.C0472;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public abstract class k4 {
    static {
        C0053.m1033(250, 0, C0225.m4335(), C0149.f174 ^ (-141));
    }

    /* JADX WARN: Code duplicated, block: B:414:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x021b A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x042b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0555 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0559 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0559 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x059b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0589 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x05d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x05c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x04d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:147:0x0205. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:160:0x0230. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:272:0x03c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:292:0x040e. Please report as an issue. */
    public static final void a(int i10, y0.o oVar, long j10, long j11, c9.f fVar, c9.e eVar, c9.e eVar2, m0.m mVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        c9.f fVar2;
        int i19;
        c9.e eVarM5322;
        c9.f fVar3;
        long j12;
        long j13;
        y0.o oVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean zM5148;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 1199178716 ^ C0250.f330);
        int i44 = 1616;
        while (true) {
            i44 ^= 1633;
            switch (i44) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i44 = ((i12 ^ (-2)) & i12) != 0 ? 1709 : 1678;
                    break;
                case 204:
                    i13 = (C0177.f201 ^ 465) | i11;
                    int i45 = 1740;
                    while (true) {
                        i45 ^= 1757;
                        switch (i45) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i45 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    int i46 = C0487.f761;
                    int i47 = 1864;
                    while (true) {
                        i47 ^= 1881;
                        switch (i47) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i47 = ((i46 ^ (-284)) & i11) == 0 ? 48736 : 48705;
                                break;
                            case 47384:
                                i13 = i11;
                                break;
                            case 47417:
                                boolean zM1859 = C0087.m1859(qVar, i10);
                                int i48 = 48767;
                                while (true) {
                                    i48 ^= 48784;
                                    switch (i48) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            i14 = 2;
                                            break;
                                        case 76:
                                            i14 = 4;
                                            int i49 = 48891;
                                            while (true) {
                                                i49 ^= 48908;
                                                switch (i49) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i49 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i48 = zM1859 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i13 = (i14 & i11) | (i14 ^ i11);
                                int i50 = 49666;
                                while (true) {
                                    i50 ^= 49683;
                                    switch (i50) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i50 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
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
                    break;
                default:
                    break;
            }
        }
        int i51 = i12 & (C0316.f464 ^ 173);
        int i52 = 49790;
        while (true) {
            i52 ^= 49807;
            switch (i52) {
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    int i53 = C0393.f664;
                    int i54 = 50689;
                    while (true) {
                        i54 ^= 50706;
                        switch (i54) {
                            case 19:
                                i54 = ((i53 ^ 293) & i11) == 0 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                i43 = 49914;
                                while (true) {
                                    i43 ^= 49931;
                                    switch (i43) {
                                        case 497:
                                            i43 = 50596;
                                            continue;
                                            continue;
                                        case 1711:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM2013 = C0103.m2013(qVar, oVar);
                                int i55 = 50813;
                                while (true) {
                                    i55 ^= 50830;
                                    switch (i55) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            i15 = 16;
                                            break;
                                        case 243:
                                            i55 = zM2013 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            i15 = 32;
                                            int i56 = 51588;
                                            while (true) {
                                                i56 ^= 51605;
                                                switch (i56) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i56 = 51619;
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
                                i13 = (i13 & i15) | (i13 ^ i15);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 84:
                    i13 |= C0273.f389 ^ 404;
                    i43 = 49914;
                    while (true) {
                        i43 ^= 49931;
                        switch (i43) {
                            case 497:
                                i43 = 50596;
                                continue;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    break;
                case 241:
                    i52 = i51 != 0 ? 49883 : 49852;
                    break;
                default:
                    break;
            }
            int i57 = C0472.f743;
            int i58 = 51712;
            while (true) {
                i58 ^= 51729;
                switch (i58) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i58 = ((i57 ^ (-942)) & i11) == 0 ? 51805 : 51774;
                        break;
                    case 47:
                        break;
                    case 76:
                        int i59 = C0006.f1064;
                        int i60 = 51836;
                        while (true) {
                            i60 ^= 51853;
                            switch (i60) {
                                case 241:
                                    i60 = ((i59 ^ 234) & i12) == 0 ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    i42 = 128;
                                    break;
                                case 2025:
                                    boolean zM4041 = C0211.m4041(qVar, j10);
                                    int i61 = 52611;
                                    while (true) {
                                        i61 ^= 52628;
                                        switch (i61) {
                                            case 23:
                                                i61 = zM4041 ? 52704 : 52673;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i42 = 128;
                                                break;
                                            case 116:
                                                i42 = 256;
                                                int i62 = 52735;
                                                while (true) {
                                                    i62 ^= 52752;
                                                    switch (i62) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 1007:
                                                            i62 = 52766;
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
                        i13 = (i13 & i42) | (i13 ^ i42);
                        int i63 = 53510;
                        while (true) {
                            i63 ^= 53527;
                            switch (i63) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i63 = 53541;
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
            int i64 = C0333.f517;
            int i65 = 53634;
            while (true) {
                i65 ^= 53651;
                switch (i65) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i65 = ((i64 ^ 3850) & i11) == 0 ? 53727 : 53696;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 76:
                        int i66 = C0336.f520;
                        int i67 = 53758;
                        while (true) {
                            i67 ^= 53775;
                            switch (i67) {
                                case 1009:
                                    i67 = ((i66 ^ (-845)) & i12) == 0 ? 54502 : 54471;
                                    break;
                                case 1703:
                                    break;
                                case 1736:
                                    i41 = 1024;
                                    break;
                                case 1769:
                                    boolean zM4042 = C0211.m4041(qVar, j11);
                                    int i68 = 54533;
                                    while (true) {
                                        i68 ^= 54550;
                                        switch (i68) {
                                            case 19:
                                                i68 = zM4042 ? 54626 : 54595;
                                                break;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                break;
                                            case 85:
                                                i41 = 1024;
                                                break;
                                            case 116:
                                                i41 = 2048;
                                                int i69 = 54657;
                                                while (true) {
                                                    i69 ^= 54674;
                                                    switch (i69) {
                                                        case 19:
                                                            i69 = 54688;
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
                                    break;
                                default:
                                    break;
                            }
                        }
                        i13 = (i13 & i41) | (i13 ^ i41);
                        int i70 = 55432;
                        while (true) {
                            i70 ^= 55449;
                            switch (i70) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i70 = 55463;
                                    continue;
                                case 62:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
            }
            int i71 = i12 & (C0086.f120 ^ (-793));
            int i72 = 55556;
            while (true) {
                i72 ^= 55573;
                switch (i72) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i72 = i71 != 0 ? 55649 : 55618;
                        break;
                    case 54:
                        break;
                    case 87:
                        int i73 = C0014.f34;
                        int i74 = 56455;
                        while (true) {
                            i74 ^= 56472;
                            switch (i74) {
                                case 31:
                                    i74 = ((i73 ^ 25538) & i11) == 0 ? 56548 : 56517;
                                    break;
                                case 62:
                                    break;
                                case 93:
                                    i40 = 55680;
                                    while (true) {
                                        i40 ^= 55697;
                                        switch (i40) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i40 = 56362;
                                                break;
                                            case 1467:
                                                break;
                                        }
                                    }
                                    break;
                                case 124:
                                    boolean zM5551 = C0288.m5551(qVar, fVar);
                                    int i75 = 56579;
                                    while (true) {
                                        i75 ^= 56596;
                                        switch (i75) {
                                            case 23:
                                                if (zM5551) {
                                                    i75 = 1507472;
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                i16 = 8192;
                                                break;
                                            case 1564036:
                                                i16 = 16384;
                                                int i76 = 1507503;
                                                while (true) {
                                                    i76 ^= 1507520;
                                                    switch (i76) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case 111:
                                                            i76 = 1507534;
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i75 = 56641;
                                    }
                                    i13 = (i13 & i16) | (i13 ^ i16);
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 116:
                        i13 |= C0360.f631 ^ 25314;
                        i40 = 55680;
                        while (true) {
                            i40 ^= 55697;
                            switch (i40) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i40 = 56362;
                                    break;
                                case 1467:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
                int i77 = i12 & (C0072.f104 ^ 81);
                int i78 = 1507627;
                while (true) {
                    i78 ^= 1507644;
                    switch (i78) {
                        case 23:
                            i78 = i77 != 0 ? 1507720 : 1507689;
                            break;
                        case 85:
                            int i79 = 1508526;
                            while (true) {
                                i79 ^= 1508543;
                                switch (i79) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i79 = (196608 & ((i11 ^ (-1)) ^ 196608)) == 0 ? 1508619 : 1508588;
                                        break;
                                    case 83:
                                        i39 = 1507751;
                                        while (true) {
                                            i39 ^= 1507768;
                                            switch (i39) {
                                                case 31:
                                                    i39 = 1508433;
                                                    continue;
                                                    continue;
                                                case 1513:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 114:
                                        break;
                                    case 436:
                                        boolean zM5552 = C0288.m5551(qVar, eVar);
                                        int i80 = 1508650;
                                        while (true) {
                                            i80 ^= 1508667;
                                            switch (i80) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i80 = zM5552 ? 1509394 : 1508712;
                                                    break;
                                                case 83:
                                                    i17 = 65536;
                                                    break;
                                                case 114:
                                                    break;
                                                case 3369:
                                                    i17 = 131072;
                                                    int i81 = 1509425;
                                                    while (true) {
                                                        i81 ^= 1509442;
                                                        switch (i81) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 115:
                                                                i81 = 1509456;
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
                                        i13 = (i13 & i17) | (i13 ^ i17);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 118:
                            break;
                        case 180:
                            i13 = (i13 & 196608) | (196608 ^ i13);
                            i39 = 1507751;
                            while (true) {
                                i39 ^= 1507768;
                                switch (i39) {
                                    case 31:
                                        i39 = 1508433;
                                        continue;
                                        continue;
                                    case 1513:
                                        break;
                                    default:
                                        continue;
                                        continue;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    int i82 = C0135.f161;
                    int i83 = 1509549;
                    while (true) {
                        i83 ^= 1509566;
                        switch (i83) {
                            case 19:
                                i83 = ((i82 ^ (-965)) & i12) != 0 ? 1509642 : 1509611;
                                break;
                            case 85:
                                int i84 = 1510448;
                                while (true) {
                                    i84 ^= 1510465;
                                    switch (i84) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case 47:
                                            i38 = 1509673;
                                            while (true) {
                                                i38 ^= 1509690;
                                                switch (i38) {
                                                    case 19:
                                                        i38 = 1510355;
                                                        continue;
                                                        continue;
                                                    case 745:
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 113:
                                            i84 = (((-1572865) ^ i11) & i11) == 0 ? 1510541 : 1510510;
                                            break;
                                        case 204:
                                            boolean zM5553 = C0288.m5551(qVar, eVar2);
                                            int i85 = 1510572;
                                            while (true) {
                                                i85 ^= 1510589;
                                                switch (i85) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i85 = zM5553 ? 1511316 : 1510634;
                                                        break;
                                                    case 87:
                                                        i18 = 524288;
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 809:
                                                        i18 = 1048576;
                                                        int i86 = 1511347;
                                                        while (true) {
                                                            i86 ^= 1511364;
                                                            switch (i86) {
                                                                case 22:
                                                                    break;
                                                                case 119:
                                                                    i86 = 1511378;
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
                                            i13 = (i13 & i18) | (i13 ^ i18);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 114:
                                break;
                            case 436:
                                i13 = (i13 & 1572864) | (1572864 ^ i13);
                                i38 = 1509673;
                                while (true) {
                                    i38 ^= 1509690;
                                    switch (i38) {
                                        case 19:
                                            i38 = 1510355;
                                            continue;
                                            continue;
                                        case 745:
                                            break;
                                        default:
                                            continue;
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        int i87 = 1511471;
                        while (true) {
                            i87 ^= 1511488;
                            switch (i87) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    C0308.m5960(qVar);
                                    i19 = 1513269;
                                    while (true) {
                                        i19 ^= 1513286;
                                        switch (i19) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 53:
                                                i21 = 1515315;
                                                while (true) {
                                                    i21 ^= 1515332;
                                                    switch (i21) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 119:
                                                            i21 = i51 != 0 ? 1515408 : 1515377;
                                                            break;
                                                        case 212:
                                                            oVar = C0226.m4370();
                                                            i31 = 1515439;
                                                            while (true) {
                                                                i31 ^= 1515456;
                                                                switch (i31) {
                                                                    case 111:
                                                                        i31 = 1516121;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case 15769:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i22 = C0291.f439;
                                                i23 = 1516214;
                                                while (true) {
                                                    i23 ^= 1516231;
                                                    switch (i23) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 113:
                                                            i23 = ((i22 ^ (-888)) & i12) != 0 ? 1516307 : 1516276;
                                                            break;
                                                        case 468:
                                                            C0261.m4990(qVar, (-2069154629) ^ C0168.f192);
                                                            j10 = C0234.m4507(C0408.m8006(), qVar);
                                                            C0171.m3270(qVar, false);
                                                            i13 &= C0247.f327 ^ 608;
                                                            i30 = 1516338;
                                                            while (true) {
                                                                i30 ^= 1516355;
                                                                switch (i30) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case 113:
                                                                        i30 = 1516369;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i24 = C0039.f59;
                                                i25 = 1537294;
                                                while (true) {
                                                    i25 ^= 1537311;
                                                    switch (i25) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i25 = ((i24 ^ 830) & i12) != 0 ? 1537387 : 1537356;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 116:
                                                            C0261.m4990(qVar, (-1410363265) ^ C0403.f674);
                                                            j11 = C0234.m4507(C0346.m6773(), qVar);
                                                            C0171.m3270(qVar, false);
                                                            i13 &= C0300.f448 ^ 7918;
                                                            i29 = 1537418;
                                                            while (true) {
                                                                i29 ^= 1537435;
                                                                switch (i29) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i29 = 1537449;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i26 = 1537542;
                                                while (true) {
                                                    i26 ^= 1537559;
                                                    switch (i26) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i26 = i71 != 0 ? 1538286 : 1538255;
                                                            break;
                                                        case 3751:
                                                            break;
                                                        case 3800:
                                                            break;
                                                        case 3833:
                                                            fVar = C0059.m1122(qVar, 2052073831 ^ C0031.f51, new g4(i10, 0));
                                                            i28 = 1538317;
                                                            while (true) {
                                                                i28 ^= 1538334;
                                                                switch (i28) {
                                                                    case 19:
                                                                        i28 = 1538348;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                i27 = 1538441;
                                                while (true) {
                                                    i27 ^= 1538458;
                                                    switch (i27) {
                                                        case 19:
                                                            i27 = i77 != 0 ? 1539185 : 1538503;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        case 93:
                                                            i20 = 1515191;
                                                            while (true) {
                                                                i20 ^= 1515208;
                                                                switch (i20) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                        eVarM5322 = eVar;
                                                                        fVar3 = fVar;
                                                                        j12 = j11;
                                                                        j13 = j10;
                                                                        oVar2 = oVar;
                                                                        break;
                                                                    case 127:
                                                                        i20 = 1515222;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 1515:
                                                            eVarM5322 = C0276.m5322();
                                                            fVar3 = fVar;
                                                            j12 = j11;
                                                            j13 = j10;
                                                            oVar2 = oVar;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 115:
                                                i19 = ((i11 ^ (-2)) & i11) != 0 ? 1513362 : 1513331;
                                                break;
                                            case 212:
                                                zM5148 = C0269.m5148(qVar);
                                                i32 = 1513393;
                                                while (true) {
                                                    i32 ^= 1513410;
                                                    switch (i32) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            C0470.m9156(qVar);
                                                            i33 = C0215.f239;
                                                            i34 = 1514292;
                                                            while (true) {
                                                                i34 ^= 1514309;
                                                                switch (i34) {
                                                                    case 22:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                        break;
                                                                    case 113:
                                                                        i34 = ((i33 ^ (-798)) & i12) != 0 ? 1514385 : 1514354;
                                                                        break;
                                                                    case 212:
                                                                        i13 &= C0310.f458 ^ 828;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i35 = C0385.f656;
                                                            i36 = 1514416;
                                                            while (true) {
                                                                i36 ^= 1514433;
                                                                switch (i36) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        break;
                                                                    case 47:
                                                                        break;
                                                                    case 113:
                                                                        i36 = ((i35 ^ (-7)) & i12) != 0 ? 1515160 : 1514478;
                                                                        break;
                                                                    case 1369:
                                                                        i13 &= C0299.f447 ^ (-7778);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            i20 = 1515191;
                                                            while (true) {
                                                                i20 ^= 1515208;
                                                                switch (i20) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                        eVarM5322 = eVar;
                                                                        fVar3 = fVar;
                                                                        j12 = j11;
                                                                        j13 = j10;
                                                                        oVar2 = oVar;
                                                                        break;
                                                                    case 127:
                                                                        i20 = 1515222;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 115:
                                                            i32 = zM5148 ? 1513486 : 1513455;
                                                            break;
                                                        case 4044:
                                                            i37 = 1513517;
                                                            while (true) {
                                                                i37 ^= 1513534;
                                                                switch (i37) {
                                                                    case 19:
                                                                        i37 = 1514199;
                                                                        continue;
                                                                        continue;
                                                                    case 745:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                                i21 = 1515315;
                                                                while (true) {
                                                                    i21 ^= 1515332;
                                                                    switch (i21) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            break;
                                                                        case 119:
                                                                            if (i51 != 0) {
                                                                            }
                                                                            break;
                                                                        case 212:
                                                                            oVar = C0226.m4370();
                                                                            i31 = 1515439;
                                                                            while (true) {
                                                                                i31 ^= 1515456;
                                                                                switch (i31) {
                                                                                    case 111:
                                                                                        i31 = 1516121;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 15769:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i22 = C0291.f439;
                                                                i23 = 1516214;
                                                                while (true) {
                                                                    i23 ^= 1516231;
                                                                    switch (i23) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 51:
                                                                            break;
                                                                        case 113:
                                                                            if (((i22 ^ (-888)) & i12) != 0) {
                                                                            }
                                                                            break;
                                                                        case 468:
                                                                            C0261.m4990(qVar, (-2069154629) ^ C0168.f192);
                                                                            j10 = C0234.m4507(C0408.m8006(), qVar);
                                                                            C0171.m3270(qVar, false);
                                                                            i13 &= C0247.f327 ^ 608;
                                                                            i30 = 1516338;
                                                                            while (true) {
                                                                                i30 ^= 1516355;
                                                                                switch (i30) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 113:
                                                                                        i30 = 1516369;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i24 = C0039.f59;
                                                                i25 = 1537294;
                                                                while (true) {
                                                                    i25 ^= 1537311;
                                                                    switch (i25) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (((i24 ^ 830) & i12) != 0) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 116:
                                                                            C0261.m4990(qVar, (-1410363265) ^ C0403.f674);
                                                                            j11 = C0234.m4507(C0346.m6773(), qVar);
                                                                            C0171.m3270(qVar, false);
                                                                            i13 &= C0300.f448 ^ 7918;
                                                                            i29 = 1537418;
                                                                            while (true) {
                                                                                i29 ^= 1537435;
                                                                                switch (i29) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i29 = 1537449;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i26 = 1537542;
                                                                while (true) {
                                                                    i26 ^= 1537559;
                                                                    switch (i26) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (i71 != 0) {
                                                                            }
                                                                            break;
                                                                        case 3751:
                                                                            break;
                                                                        case 3800:
                                                                            break;
                                                                        case 3833:
                                                                            fVar = C0059.m1122(qVar, 2052073831 ^ C0031.f51, new g4(i10, 0));
                                                                            i28 = 1538317;
                                                                            while (true) {
                                                                                i28 ^= 1538334;
                                                                                switch (i28) {
                                                                                    case 19:
                                                                                        i28 = 1538348;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i27 = 1538441;
                                                                while (true) {
                                                                    i27 ^= 1538458;
                                                                    switch (i27) {
                                                                        case 19:
                                                                            if (i77 != 0) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 93:
                                                                            i20 = 1515191;
                                                                            while (true) {
                                                                                i20 ^= 1515208;
                                                                                switch (i20) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        eVarM5322 = eVar;
                                                                                        fVar3 = fVar;
                                                                                        j12 = j11;
                                                                                        j13 = j10;
                                                                                        oVar2 = oVar;
                                                                                        break;
                                                                                    case 127:
                                                                                        i20 = 1515222;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1515:
                                                                            eVarM5322 = C0276.m5322();
                                                                            fVar3 = fVar;
                                                                            j12 = j11;
                                                                            j13 = j10;
                                                                            oVar2 = oVar;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
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
                                        C0103.m2025(qVar);
                                        int i88 = i13 >> (C0466.f737 ^ 343);
                                        int i89 = (C0075.f109 ^ 271) & i88;
                                        int i90 = (C0402.f673 ^ 888) & i88;
                                        int i91 = (i89 & i90) | (i89 ^ i90);
                                        int i92 = (C0041.f61 ^ (-706)) & i88;
                                        int i93 = (i91 & i92) | (i91 ^ i92);
                                        int i94 = (C0215.f239 ^ (-7962)) & i88;
                                        int i95 = (i93 & i94) | (i93 ^ i94);
                                        int i96 = 57344 & ((i88 ^ (-1)) ^ 57344);
                                        int i97 = (i95 & i96) | (i95 ^ i96);
                                        int i98 = i88 & ((-458753) ^ i88);
                                        C0134.m2586(oVar2, j13, j12, fVar3, eVarM5322, eVar2, qVar, (i97 ^ i98) | (i98 & i97));
                                        eVar = eVarM5322;
                                        fVar2 = fVar3;
                                        j11 = j12;
                                        j10 = j13;
                                        oVar = oVar2;
                                        break;
                                    }
                                    break;
                                case 111:
                                    i87 = (599187 & ((i13 ^ (-1)) ^ 599187)) == 599186 ? 1511564 : 1511533;
                                    break;
                                case 204:
                                    boolean zM1625 = C0074.m1625(qVar);
                                    int i99 = 1511595;
                                    while (true) {
                                        i99 ^= 1511612;
                                        switch (i99) {
                                            case 23:
                                                i99 = !zM1625 ? 1512339 : 1512308;
                                                break;
                                            case 815:
                                                int i100 = 1512370;
                                                while (true) {
                                                    i100 ^= 1512387;
                                                    switch (i100) {
                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 113:
                                                            i100 = 1512401;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                    C0308.m5960(qVar);
                                                    i19 = 1513269;
                                                    while (true) {
                                                        i19 ^= 1513286;
                                                        switch (i19) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 53:
                                                                i21 = 1515315;
                                                                while (true) {
                                                                    i21 ^= 1515332;
                                                                    switch (i21) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            break;
                                                                        case 119:
                                                                            if (i51 != 0) {
                                                                            }
                                                                            break;
                                                                        case 212:
                                                                            oVar = C0226.m4370();
                                                                            i31 = 1515439;
                                                                            while (true) {
                                                                                i31 ^= 1515456;
                                                                                switch (i31) {
                                                                                    case 111:
                                                                                        i31 = 1516121;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 15769:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i22 = C0291.f439;
                                                                i23 = 1516214;
                                                                while (true) {
                                                                    i23 ^= 1516231;
                                                                    switch (i23) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case 51:
                                                                            break;
                                                                        case 113:
                                                                            if (((i22 ^ (-888)) & i12) != 0) {
                                                                            }
                                                                            break;
                                                                        case 468:
                                                                            C0261.m4990(qVar, (-2069154629) ^ C0168.f192);
                                                                            j10 = C0234.m4507(C0408.m8006(), qVar);
                                                                            C0171.m3270(qVar, false);
                                                                            i13 &= C0247.f327 ^ 608;
                                                                            i30 = 1516338;
                                                                            while (true) {
                                                                                i30 ^= 1516355;
                                                                                switch (i30) {
                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                        break;
                                                                                    case 113:
                                                                                        i30 = 1516369;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i24 = C0039.f59;
                                                                i25 = 1537294;
                                                                while (true) {
                                                                    i25 ^= 1537311;
                                                                    switch (i25) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (((i24 ^ 830) & i12) != 0) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                        case 116:
                                                                            C0261.m4990(qVar, (-1410363265) ^ C0403.f674);
                                                                            j11 = C0234.m4507(C0346.m6773(), qVar);
                                                                            C0171.m3270(qVar, false);
                                                                            i13 &= C0300.f448 ^ 7918;
                                                                            i29 = 1537418;
                                                                            while (true) {
                                                                                i29 ^= 1537435;
                                                                                switch (i29) {
                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                        i29 = 1537449;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i26 = 1537542;
                                                                while (true) {
                                                                    i26 ^= 1537559;
                                                                    switch (i26) {
                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                            if (i71 != 0) {
                                                                            }
                                                                            break;
                                                                        case 3751:
                                                                            break;
                                                                        case 3800:
                                                                            break;
                                                                        case 3833:
                                                                            fVar = C0059.m1122(qVar, 2052073831 ^ C0031.f51, new g4(i10, 0));
                                                                            i28 = 1538317;
                                                                            while (true) {
                                                                                i28 ^= 1538334;
                                                                                switch (i28) {
                                                                                    case 19:
                                                                                        i28 = 1538348;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                i27 = 1538441;
                                                                while (true) {
                                                                    i27 ^= 1538458;
                                                                    switch (i27) {
                                                                        case 19:
                                                                            if (i77 != 0) {
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                            break;
                                                                        case 93:
                                                                            i20 = 1515191;
                                                                            while (true) {
                                                                                i20 ^= 1515208;
                                                                                switch (i20) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        eVarM5322 = eVar;
                                                                                        fVar3 = fVar;
                                                                                        j12 = j11;
                                                                                        j13 = j10;
                                                                                        oVar2 = oVar;
                                                                                        break;
                                                                                    case 127:
                                                                                        i20 = 1515222;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1515:
                                                                            eVarM5322 = C0276.m5322();
                                                                            fVar3 = fVar;
                                                                            j12 = j11;
                                                                            j13 = j10;
                                                                            oVar2 = oVar;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 115:
                                                                if (((i11 ^ (-2)) & i11) != 0) {
                                                                }
                                                                break;
                                                            case 212:
                                                                zM5148 = C0269.m5148(qVar);
                                                                i32 = 1513393;
                                                                while (true) {
                                                                    i32 ^= 1513410;
                                                                    switch (i32) {
                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            C0470.m9156(qVar);
                                                                            i33 = C0215.f239;
                                                                            i34 = 1514292;
                                                                            while (true) {
                                                                                i34 ^= 1514309;
                                                                                switch (i34) {
                                                                                    case 22:
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                                                        break;
                                                                                    case 113:
                                                                                        if (((i33 ^ (-798)) & i12) != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 212:
                                                                                        i13 &= C0310.f458 ^ 828;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i35 = C0385.f656;
                                                                            i36 = 1514416;
                                                                            while (true) {
                                                                                i36 ^= 1514433;
                                                                                switch (i36) {
                                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                                        break;
                                                                                    case 47:
                                                                                        break;
                                                                                    case 113:
                                                                                        if (((i35 ^ (-7)) & i12) != 0) {
                                                                                        }
                                                                                        break;
                                                                                    case 1369:
                                                                                        i13 &= C0299.f447 ^ (-7778);
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i20 = 1515191;
                                                                            while (true) {
                                                                                i20 ^= 1515208;
                                                                                switch (i20) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                        eVarM5322 = eVar;
                                                                                        fVar3 = fVar;
                                                                                        j12 = j11;
                                                                                        j13 = j10;
                                                                                        oVar2 = oVar;
                                                                                        break;
                                                                                    case 127:
                                                                                        i20 = 1515222;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 115:
                                                                            if (zM5148) {
                                                                            }
                                                                            break;
                                                                        case 4044:
                                                                            i37 = 1513517;
                                                                            while (true) {
                                                                                i37 ^= 1513534;
                                                                                switch (i37) {
                                                                                    case 19:
                                                                                        i37 = 1514199;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 745:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
                                                                                }
                                                                                i21 = 1515315;
                                                                                while (true) {
                                                                                    i21 ^= 1515332;
                                                                                    switch (i21) {
                                                                                        case 22:
                                                                                            break;
                                                                                        case 53:
                                                                                            break;
                                                                                        case 119:
                                                                                            if (i51 != 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 212:
                                                                                            oVar = C0226.m4370();
                                                                                            i31 = 1515439;
                                                                                            while (true) {
                                                                                                i31 ^= 1515456;
                                                                                                switch (i31) {
                                                                                                    case 111:
                                                                                                        i31 = 1516121;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 15769:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i22 = C0291.f439;
                                                                                i23 = 1516214;
                                                                                while (true) {
                                                                                    i23 ^= 1516231;
                                                                                    switch (i23) {
                                                                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 113:
                                                                                            if (((i22 ^ (-888)) & i12) != 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 468:
                                                                                            C0261.m4990(qVar, (-2069154629) ^ C0168.f192);
                                                                                            j10 = C0234.m4507(C0408.m8006(), qVar);
                                                                                            C0171.m3270(qVar, false);
                                                                                            i13 &= C0247.f327 ^ 608;
                                                                                            i30 = 1516338;
                                                                                            while (true) {
                                                                                                i30 ^= 1516355;
                                                                                                switch (i30) {
                                                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i30 = 1516369;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i24 = C0039.f59;
                                                                                i25 = 1537294;
                                                                                while (true) {
                                                                                    i25 ^= 1537311;
                                                                                    switch (i25) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (((i24 ^ 830) & i12) != 0) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 83:
                                                                                            break;
                                                                                        case 116:
                                                                                            C0261.m4990(qVar, (-1410363265) ^ C0403.f674);
                                                                                            j11 = C0234.m4507(C0346.m6773(), qVar);
                                                                                            C0171.m3270(qVar, false);
                                                                                            i13 &= C0300.f448 ^ 7918;
                                                                                            i29 = 1537418;
                                                                                            while (true) {
                                                                                                i29 ^= 1537435;
                                                                                                switch (i29) {
                                                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                                        i29 = 1537449;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i26 = 1537542;
                                                                                while (true) {
                                                                                    i26 ^= 1537559;
                                                                                    switch (i26) {
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            if (i71 != 0) {
                                                                                            }
                                                                                            break;
                                                                                        case 3751:
                                                                                            break;
                                                                                        case 3800:
                                                                                            break;
                                                                                        case 3833:
                                                                                            fVar = C0059.m1122(qVar, 2052073831 ^ C0031.f51, new g4(i10, 0));
                                                                                            i28 = 1538317;
                                                                                            while (true) {
                                                                                                i28 ^= 1538334;
                                                                                                switch (i28) {
                                                                                                    case 19:
                                                                                                        i28 = 1538348;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i27 = 1538441;
                                                                                while (true) {
                                                                                    i27 ^= 1538458;
                                                                                    switch (i27) {
                                                                                        case 19:
                                                                                            if (i77 != 0) {
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                            break;
                                                                                        case 93:
                                                                                            i20 = 1515191;
                                                                                            while (true) {
                                                                                                i20 ^= 1515208;
                                                                                                switch (i20) {
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                                                                                                        eVarM5322 = eVar;
                                                                                                        fVar3 = fVar;
                                                                                                        j12 = j11;
                                                                                                        j13 = j10;
                                                                                                        oVar2 = oVar;
                                                                                                        break;
                                                                                                    case 127:
                                                                                                        i20 = 1515222;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 1515:
                                                                                            eVarM5322 = C0276.m5322();
                                                                                            fVar3 = fVar;
                                                                                            j12 = j11;
                                                                                            j13 = j10;
                                                                                            oVar2 = oVar;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
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
                                                        C0103.m2025(qVar);
                                                        int i810 = i13 >> (C0466.f737 ^ 343);
                                                        int i811 = (C0075.f109 ^ 271) & i810;
                                                        int i910 = (C0402.f673 ^ 888) & i810;
                                                        int i911 = (i811 & i910) | (i811 ^ i910);
                                                        int i912 = (C0041.f61 ^ (-706)) & i810;
                                                        int i913 = (i911 & i912) | (i911 ^ i912);
                                                        int i914 = (C0215.f239 ^ (-7962)) & i810;
                                                        int i915 = (i913 & i914) | (i913 ^ i914);
                                                        int i916 = 57344 & ((i810 ^ (-1)) ^ 57344);
                                                        int i917 = (i915 & i916) | (i915 ^ i916);
                                                        int i918 = i810 & ((-458753) ^ i810);
                                                        C0134.m2586(oVar2, j13, j12, fVar3, eVarM5322, eVar2, qVar, (i917 ^ i918) | (i918 & i917));
                                                        eVar = eVarM5322;
                                                        fVar2 = fVar3;
                                                        j11 = j12;
                                                        j10 = j13;
                                                        oVar = oVar2;
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 968:
                                                C0470.m9156(qVar);
                                                int i101 = 1512494;
                                                while (true) {
                                                    i101 ^= 1512511;
                                                    switch (i101) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i101 = 1512525;
                                                            continue;
                                                        case 114:
                                                            fVar2 = fVar;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
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
                            m0.x1 x1VarM7533 = C0384.m7533(qVar);
                            int i102 = 1539216;
                            while (true) {
                                i102 ^= 1539233;
                                switch (i102) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 49:
                                        if (x1VarM7533 != null) {
                                            i102 = 1539309;
                                        }
                                        break;
                                    case 76:
                                        x1VarM7533.f11756d = new h4(i10, oVar, j10, j11, fVar2, eVar, eVar2, i11, i12);
                                        return;
                                    case 111:
                                        return;
                                    default:
                                        continue;
                                }
                                i102 = 1539278;
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void b(y0.o oVar, long j10, long j11, c9.f fVar, c9.e eVar, c9.e eVar2, m0.m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        m0.q qVar = (m0.q) mVar;
        C0393.m7698(qVar, 160898837 ^ C0355.f626);
        int i19 = C0316.f464;
        int i20 = 1616;
        while (true) {
            i20 ^= 1633;
            switch (i20) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i20 = ((i19 ^ 169) & i10) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013(qVar, oVar);
                    int i21 = 1740;
                    while (true) {
                        i21 ^= 1757;
                        switch (i21) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i21 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i18 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i18 = 4;
                                int i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i22 = 48674;
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
                    i11 = (i18 & i10) | (i18 ^ i10);
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
                case 239:
                    i11 = i10;
                    break;
                default:
                    break;
            }
        }
        int i24 = C0398.f669;
        int i25 = 48891;
        while (true) {
            i25 ^= 48908;
            switch (i25) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i25 = ((i24 ^ 678) & i10) == 0 ? 49635 : 48953;
                    break;
                case 32495:
                    boolean zM4041 = C0211.m4041(qVar, j10);
                    int i26 = 49666;
                    while (true) {
                        i26 ^= 49683;
                        switch (i26) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i26 = zM4041 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                i17 = 32;
                                int i27 = 49790;
                                while (true) {
                                    i27 ^= 49807;
                                    switch (i27) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i27 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                i17 = 16;
                                break;
                            default:
                                break;
                        }
                    }
                    i11 = (i11 & i17) | (i11 ^ i17);
                    int i28 = 49914;
                    while (true) {
                        i28 ^= 49931;
                        switch (i28) {
                            case 497:
                                i28 = 50596;
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
        int i29 = C0415.f686;
        int i30 = 50689;
        while (true) {
            i30 ^= 50706;
            switch (i30) {
                case 19:
                    i30 = ((i29 ^ 653) & i10) == 0 ? 50782 : 50751;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    boolean zM4042 = C0211.m4041(qVar, j11);
                    int i31 = 50813;
                    while (true) {
                        i31 ^= 50830;
                        switch (i31) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                i16 = 128;
                                break;
                            case 243:
                                if (zM4042) {
                                    i31 = 51557;
                                }
                                break;
                            case 4075:
                                i16 = 256;
                                int i32 = 51588;
                                while (true) {
                                    i32 ^= 51605;
                                    switch (i32) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i32 = 51619;
                                            break;
                                        case 54:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i31 = 50875;
                    }
                    i11 = (i11 & i16) | (i11 ^ i16);
                    break;
                default:
                    break;
            }
        }
        int i33 = C0291.f439;
        int i34 = 51712;
        while (true) {
            i34 ^= 51729;
            switch (i34) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i34 = ((i33 ^ (-3956)) & i10) == 0 ? 51805 : 51774;
                    break;
                case 47:
                    break;
                case 76:
                    boolean zM5551 = C0288.m5551(qVar, fVar);
                    int i35 = 51836;
                    while (true) {
                        i35 ^= 51853;
                        switch (i35) {
                            case 241:
                                i35 = zM5551 ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                i15 = 1024;
                                break;
                            case 2025:
                                i15 = 2048;
                                int i36 = 52611;
                                while (true) {
                                    i36 ^= 52628;
                                    switch (i36) {
                                        case 23:
                                            i36 = 52642;
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
                    i11 = (i11 & i15) | (i11 ^ i15);
                    break;
                default:
                    break;
            }
        }
        int i37 = C0298.f446;
        int i38 = 52735;
        while (true) {
            i38 ^= 52752;
            switch (i38) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 1007:
                    i38 = ((i37 ^ (-24715)) & i10) == 0 ? 53479 : 52797;
                    break;
                case 7927:
                    boolean zM5552 = C0288.m5551(qVar, eVar);
                    int i39 = 53510;
                    while (true) {
                        i39 ^= 53527;
                        switch (i39) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i39 = zM5552 ? 53603 : 53572;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 83:
                                i14 = 8192;
                                break;
                            case 116:
                                i14 = 16384;
                                int i40 = 53634;
                                while (true) {
                                    i40 ^= 53651;
                                    switch (i40) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i40 = 53665;
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
                    i11 = (i11 & i14) | (i11 ^ i14);
                    break;
                default:
                    break;
            }
        }
        int i41 = 53758;
        while (true) {
            i41 ^= 53775;
            switch (i41) {
                case 1009:
                    i41 = (196608 & ((i10 ^ (-1)) ^ 196608)) == 0 ? 54502 : 54471;
                    break;
                case 1703:
                    break;
                case 1736:
                    i12 = i11;
                    break;
                case 1769:
                    boolean zM5553 = C0288.m5551(qVar, eVar2);
                    int i42 = 54533;
                    while (true) {
                        i42 ^= 54550;
                        switch (i42) {
                            case 19:
                                i42 = zM5553 ? 54626 : 54595;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 85:
                                i13 = 65536;
                                break;
                            case 116:
                                i13 = 131072;
                                int i43 = 54657;
                                while (true) {
                                    i43 ^= 54674;
                                    switch (i43) {
                                        case 19:
                                            i43 = 54688;
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
                    i12 = (i11 & i13) | (i11 ^ i13);
                    break;
                default:
                    break;
            }
        }
        int i44 = 55432;
        while (true) {
            i44 ^= 55449;
            switch (i44) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i44 = (74899 & ((i12 ^ (-1)) ^ 74899)) == 74898 ? 55525 : 55494;
                    break;
                case 62:
                    break;
                case 95:
                    y0.o oVarM758 = C0039.m758(oVar, false, C0311.m6020());
                    u0.b bVarM1122 = C0059.m1122(qVar, (-1617702785) ^ C0343.f614, new j4(eVar2, eVar, fVar, 1));
                    int i45 = i12 << (C0065.f85 ^ 671);
                    int i46 = (C0392.f663 ^ 449) & i45;
                    int i47 = (i46 & 12582912) | (12582912 ^ i46);
                    int i48 = (C0293.f441 ^ (-8115)) & i45;
                    C0148.m2825(oVarM758, null, j10, j11, 0.0f, 0.0f, null, bVarM1122, qVar, (i47 ^ i48) | (i47 & i48), C0211.f235 ^ 600);
                    break;
                case 124:
                    boolean zM1625 = C0074.m1625(qVar);
                    int i49 = 55556;
                    while (true) {
                        i49 ^= 55573;
                        switch (i49) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i49 = !zM1625 ? 55649 : 55618;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0470.m9156(qVar);
                                int i50 = 56455;
                                while (true) {
                                    i50 ^= 56472;
                                    switch (i50) {
                                        case 31:
                                            i50 = 56486;
                                            continue;
                                        case 62:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 116:
                                int i51 = 55680;
                                while (true) {
                                    i51 ^= 55697;
                                    switch (i51) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i51 = 56362;
                                            continue;
                                        case 1467:
                                            break;
                                        default:
                                            continue;
                                    }
                                    y0.o oVarM759 = C0039.m758(oVar, false, C0311.m6020());
                                    u0.b bVarM1123 = C0059.m1122(qVar, (-1617702785) ^ C0343.f614, new j4(eVar2, eVar, fVar, 1));
                                    int i410 = i12 << (C0065.f85 ^ 671);
                                    int i411 = (C0392.f663 ^ 449) & i410;
                                    int i412 = (i411 & 12582912) | (12582912 ^ i411);
                                    int i413 = (C0293.f441 ^ (-8115)) & i410;
                                    C0148.m2825(oVarM759, null, j10, j11, 0.0f, 0.0f, null, bVarM1123, qVar, (i412 ^ i413) | (i412 & i413), C0211.f235 ^ 600);
                                    break;
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
        m0.x1 x1VarM7533 = C0384.m7533(qVar);
        int i52 = 56579;
        while (true) {
            i52 ^= 56596;
            switch (i52) {
                case 23:
                    if (x1VarM7533 != null) {
                        i52 = 1507472;
                    }
                    break;
                case 54:
                    break;
                case 85:
                    return;
                case 1564036:
                    x1VarM7533.f11756d = new b3(oVar, j10, j11, fVar, eVar, eVar2, i10);
                    return;
                default:
                    continue;
            }
            i52 = 56641;
        }
    }
}
