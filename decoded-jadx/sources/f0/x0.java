package f0;

import a.C0000;
import android.view.KeyEvent;
import c1.C0059;
import c3.C0062;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.codegen.C0242;
import e1.C0259;
import g.C0284;
import g2.C0287;
import l8.C0345;
import o7.i2;
import q2.C0384;
import r2.C0395;
import u4.C0436;
import w4.C0460;
import w6.C0464;
import x0.C0466;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements u0 {
    /* JADX WARN: Code duplicated, block: B:214:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01bb A[SYNTHETIC] */
    @Override // f0.u0
    public final t0 c(KeyEvent keyEvent) {
        boolean zM7742;
        int i10;
        long jM20;
        boolean zM7541;
        int i11;
        boolean zM7542;
        int i12;
        boolean zM7543;
        int i13;
        boolean zM7544;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zM8968 = C0460.m8968(keyEvent);
        t0 t0VarM1137 = null;
        int i18 = 1616;
        while (true) {
            i18 ^= 1633;
            switch (i18) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i18 = zM8968 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM7743 = C0395.m7742(keyEvent);
                    int i19 = 1740;
                    while (true) {
                        i19 ^= 1757;
                        switch (i19) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i19 = zM7743 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                zM7742 = C0395.m7742(keyEvent);
                                i10 = 51588;
                                while (true) {
                                    i10 ^= 51605;
                                    switch (i10) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i10 = zM7742 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            break;
                                        case 116:
                                            jM20 = C0000.m20(C0464.m9046(keyEvent));
                                            zM7541 = C0384.m7541(jM20, C0436.m8530());
                                            i11 = 51712;
                                            while (true) {
                                                i11 ^= 51729;
                                                switch (i11) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i11 = zM7541 ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        zM7542 = C0384.m7541(jM20, C0259.m4961());
                                                        i12 = 52611;
                                                        while (true) {
                                                            i12 ^= 52628;
                                                            switch (i12) {
                                                                case 23:
                                                                    i12 = zM7542 ? 52704 : 52673;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    zM7543 = C0384.m7541(jM20, C0345.m6766());
                                                                    i13 = 53510;
                                                                    while (true) {
                                                                        i13 ^= 53527;
                                                                        switch (i13) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i13 = zM7543 ? 53603 : 53572;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 83:
                                                                                zM7544 = C0384.m7541(jM20, C0287.m5535());
                                                                                i14 = 53758;
                                                                                while (true) {
                                                                                    i14 ^= 53775;
                                                                                    switch (i14) {
                                                                                        case 1009:
                                                                                            i14 = zM7544 ? 54502 : 54471;
                                                                                            break;
                                                                                        case 1703:
                                                                                            break;
                                                                                        case 1736:
                                                                                            break;
                                                                                        case 1769:
                                                                                            t0VarM1137 = C0059.m1137();
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 116:
                                                                                t0VarM1137 = C0233.m4487();
                                                                                i15 = 53634;
                                                                                while (true) {
                                                                                    i15 ^= 53651;
                                                                                    switch (i15) {
                                                                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i15 = 53665;
                                                                                            continue;
                                                                                            continue;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    t0VarM1137 = C0242.m4650();
                                                                    i16 = 52735;
                                                                    while (true) {
                                                                        i16 ^= 52752;
                                                                        switch (i16) {
                                                                            case Code.UNAVAILABLE /* 14 */:
                                                                                break;
                                                                            case 1007:
                                                                                i16 = 52766;
                                                                                continue;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 76:
                                                        t0VarM1137 = C0083.m1778();
                                                        i17 = 51836;
                                                        while (true) {
                                                            i17 ^= 51853;
                                                            switch (i17) {
                                                                case 241:
                                                                    i17 = 52518;
                                                                    continue;
                                                                    continue;
                                                                case 1963:
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
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                long jM21 = C0000.m20(C0464.m9046(keyEvent));
                                boolean zM7545 = C0384.m7541(jM21, C0436.m8530());
                                int i20 = 1864;
                                while (true) {
                                    i20 ^= 1881;
                                    switch (i20) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = zM7545 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            boolean zM7546 = C0384.m7541(jM21, C0259.m4961());
                                            int i21 = 48891;
                                            while (true) {
                                                i21 ^= 48908;
                                                switch (i21) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean zM7547 = C0384.m7541(jM21, C0345.m6766());
                                                        int i22 = 49790;
                                                        while (true) {
                                                            i22 ^= 49807;
                                                            switch (i22) {
                                                                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    boolean zM7548 = C0384.m7541(jM21, C0287.m5535());
                                                                    int i23 = 50689;
                                                                    while (true) {
                                                                        i23 ^= 50706;
                                                                        switch (i23) {
                                                                            case 19:
                                                                                i23 = zM7548 ? 50782 : 50751;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                            case 76:
                                                                                t0VarM1137 = C0062.m1188();
                                                                                int i24 = 50813;
                                                                                while (true) {
                                                                                    i24 ^= 50830;
                                                                                    switch (i24) {
                                                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                            break;
                                                                                        case 243:
                                                                                            i24 = 50844;
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
                                                                case 84:
                                                                    t0VarM1137 = C0074.m1623();
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
                                                                    i22 = zM7547 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        i21 = zM7546 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        t0VarM1137 = C0466.m9091();
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
                                            break;
                                        case 47417:
                                            t0VarM1137 = C0162.m3108();
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
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    zM7742 = C0395.m7742(keyEvent);
                    i10 = 51588;
                    while (true) {
                        i10 ^= 51605;
                        switch (i10) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM7742) {
                                }
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                jM20 = C0000.m20(C0464.m9046(keyEvent));
                                zM7541 = C0384.m7541(jM20, C0436.m8530());
                                i11 = 51712;
                                while (true) {
                                    i11 ^= 51729;
                                    switch (i11) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (zM7541) {
                                            }
                                            break;
                                        case 47:
                                            zM7542 = C0384.m7541(jM20, C0259.m4961());
                                            i12 = 52611;
                                            while (true) {
                                                i12 ^= 52628;
                                                switch (i12) {
                                                    case 23:
                                                        if (zM7542) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        zM7543 = C0384.m7541(jM20, C0345.m6766());
                                                        i13 = 53510;
                                                        while (true) {
                                                            i13 ^= 53527;
                                                            switch (i13) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    if (zM7543) {
                                                                    }
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 83:
                                                                    zM7544 = C0384.m7541(jM20, C0287.m5535());
                                                                    i14 = 53758;
                                                                    while (true) {
                                                                        i14 ^= 53775;
                                                                        switch (i14) {
                                                                            case 1009:
                                                                                if (zM7544) {
                                                                                }
                                                                                break;
                                                                            case 1703:
                                                                                break;
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                t0VarM1137 = C0059.m1137();
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    t0VarM1137 = C0233.m4487();
                                                                    i15 = 53634;
                                                                    while (true) {
                                                                        i15 ^= 53651;
                                                                        switch (i15) {
                                                                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i15 = 53665;
                                                                                continue;
                                                                                continue;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                                        }
                                                        break;
                                                    case 116:
                                                        t0VarM1137 = C0242.m4650();
                                                        i16 = 52735;
                                                        while (true) {
                                                            i16 ^= 52752;
                                                            switch (i16) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 1007:
                                                                    i16 = 52766;
                                                                    continue;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 76:
                                            t0VarM1137 = C0083.m1778();
                                            i17 = 51836;
                                            while (true) {
                                                i17 ^= 51853;
                                                switch (i17) {
                                                    case 241:
                                                        i17 = 52518;
                                                        continue;
                                                        continue;
                                                    case 1963:
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
            int i28 = 54533;
            while (true) {
                i28 ^= 54550;
                switch (i28) {
                    case 19:
                        if (t0VarM1137 == null) {
                            i28 = 54626;
                        }
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                    case 85:
                        return t0VarM1137;
                    case 116:
                        return C0284.m5490(C0231.m4454(), keyEvent);
                    default:
                        continue;
                }
                i28 = 54595;
            }
        }
    }
}
