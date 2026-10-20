package k0;

import a7.C0008;
import androidx.compose.foundation.relocation.C0024;
import androidx.lifecycle.C0043;
import androidx.profileinstaller.C0046;
import c1.C0059;
import c3.C0062;
import c4.C0066;
import com.auto.accept.service.C0072;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.C0205;
import com.google.firebase.annotations.C0127;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.firestore.bundle.C0150;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import dagger.hilt.android.components.C0228;
import dagger.hilt.codegen.C0242;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e2.C0262;
import ea.C0268;
import i.C0315;
import i6.C0320;
import java.util.List;
import java.util.NoSuchElementException;
import m1.C0350;
import o2.C0368;
import r.C0392;
import r2.C0396;
import rikka.shizuku.C0406;
import s0.C0410;
import v.C0439;
import w.C0453;

/* JADX INFO: loaded from: classes.dex */
public final class d3 implements r1.j0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f489short = {2029, 2031, 2040, 2021, 2019, 2018, 2872, 2869, 2863, 2865, 2869, 2863, 2863, 2845, 2879, 2856, 2869, 2867, 2866, 1380, 1397, 1384, 1380, 481, 448, 399, 461, 462, 476, 458, 451, 454, 449, 458, 476, 399, 457, 448, 477, 399, 475, 458, 471, 475, 2864, 2844, 2847, 2847, 2838, 2832, 2823, 2842, 2844, 2845, 2899, 2832, 2844, 2845, 2823, 2834, 2842, 2845, 2816, 2899, 2845, 2844, 2899, 2838, 2847, 2838, 2846, 2838, 2845, 2823, 2899, 2846, 2834, 2823, 2832, 2843, 2842, 2845, 2836, 2899, 2823, 2843, 2838, 2899, 2819, 2817, 2838, 2839, 2842, 2832, 2834, 2823, 2838, 2909};

    /* JADX INFO: renamed from: ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6419() {
        int iM1556 = C0072.m1556();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1556 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f489short;
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
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        Object obj;
        r1.x0 x0Var;
        Object obj2;
        r1.x0 x0VarM8844;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM2912;
        boolean z10;
        int iM2913;
        int iM6867;
        int i14;
        int i15;
        int iM6868;
        int i16;
        int iM1191 = C0062.m1191(C0168.m3212(j10), C0152.m2912(l0Var, C0320.m6201()));
        int iM171 = C0008.m171(list);
        int i17 = 0;
        while (true) {
            int i18 = i17;
            int i19 = 1616;
            while (true) {
                i19 ^= 1633;
                switch (i19) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i19 = i18 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        Object objM6101 = C0315.m6101(list, i18);
                        boolean zM4399 = C0228.m4399(C0368.m7238((r1.i0) objM6101), C0396.m7757(m6419(), 0, C0262.f342 ^ 187, 1932));
                        int i20 = 1740;
                        while (true) {
                            i20 ^= 1757;
                            switch (i20) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i20 = zM4399 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    i17 = (C0024.f44 ^ 534) + i18;
                                    int i21 = 48767;
                                    while (true) {
                                        i21 ^= 48784;
                                        switch (i21) {
                                            case Code.UNAVAILABLE /* 14 */:
                                                break;
                                            case 239:
                                                i21 = 48798;
                                                break;
                                        }
                                    }
                                    break;
                                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                    int i22 = 1864;
                                    while (true) {
                                        i22 ^= 1881;
                                        switch (i22) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i22 = 48674;
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
        int i23 = 48891;
        while (true) {
            i23 ^= 48908;
            switch (i23) {
                case 22:
                    break;
                case 53:
                    x0Var = null;
                    break;
                case 503:
                    i23 = i0Var != null ? 49635 : 48953;
                    break;
                case 32495:
                    r1.x0 x0VarM8845 = C0453.m8844(i0Var, j10);
                    int i24 = 49666;
                    while (true) {
                        i24 ^= 49683;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = 49697;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                x0Var = x0VarM8845;
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
        int i25 = 0;
        while (true) {
            int i26 = i25;
            int i27 = 49790;
            while (true) {
                i27 ^= 49807;
                switch (i27) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 51:
                        obj2 = null;
                        break;
                    case 84:
                        Object objM6102 = C0315.m6101(list, i26);
                        boolean zM43910 = C0228.m4399(C0368.m7238((r1.i0) objM6102), C0157.m2993(m6419(), 6, C0268.f348 ^ 755, 2908));
                        int i28 = 49914;
                        while (true) {
                            i28 ^= 49931;
                            switch (i28) {
                                case 497:
                                    i28 = zM43910 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    i25 = (C0406.f677 ^ 842) + i26;
                                    int i29 = 50813;
                                    while (true) {
                                        i29 ^= 50830;
                                        switch (i29) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i29 = 50844;
                                                break;
                                        }
                                    }
                                    break;
                                case 1769:
                                    int i30 = 50689;
                                    while (true) {
                                        i30 ^= 50706;
                                        switch (i30) {
                                            case 19:
                                                i30 = 50720;
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
                        i27 = i26 < iM172 ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
        }
        r1.i0 i0Var2 = (r1.i0) obj2;
        int i31 = 51588;
        while (true) {
            i31 ^= 51605;
            switch (i31) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i31 = i0Var2 != null ? 51681 : 51650;
                    break;
                case 54:
                    break;
                case 87:
                    x0VarM8844 = null;
                    break;
                case 116:
                    x0VarM8844 = C0453.m8844(i0Var2, j10);
                    break;
                default:
                    break;
            }
        }
        int i32 = 51712;
        while (true) {
            i32 ^= 51729;
            switch (i32) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i32 = x0Var != null ? 51805 : 51774;
                    break;
                case 47:
                    i10 = 0;
                    break;
                case 76:
                    int iM1647 = C0076.m1647(x0Var);
                    int i33 = 51836;
                    while (true) {
                        i33 ^= 51853;
                        switch (i33) {
                            case 241:
                                i33 = 52518;
                                continue;
                            case 1963:
                                i10 = iM1647;
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
        int i34 = 52611;
        while (true) {
            i34 ^= 52628;
            switch (i34) {
                case 23:
                    i34 = x0Var != null ? 52704 : 52673;
                    break;
                case 54:
                    break;
                case 85:
                    i11 = 0;
                    break;
                case 116:
                    int iM6869 = C0350.m6867(x0Var);
                    int i35 = 52735;
                    while (true) {
                        i35 ^= 52752;
                        switch (i35) {
                            case Code.UNAVAILABLE /* 14 */:
                                i11 = iM6869;
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
        int i36 = 53510;
        while (true) {
            i36 ^= 53527;
            switch (i36) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i36 = x0VarM8844 != null ? 53603 : 53572;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 83:
                    i12 = 0;
                    break;
                case 116:
                    int iM1648 = C0076.m1647(x0VarM8844);
                    int i37 = 53634;
                    while (true) {
                        i37 ^= 53651;
                        switch (i37) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i37 = 53665;
                                continue;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                i12 = iM1648;
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
        int i38 = 53758;
        while (true) {
            i38 ^= 53775;
            switch (i38) {
                case 1009:
                    if (x0VarM8844 != null) {
                        i38 = 54502;
                    }
                    break;
                case 1703:
                    break;
                case 1736:
                    i13 = 0;
                    break;
                case 1769:
                    int iM68610 = C0350.m6867(x0VarM8844);
                    int i39 = 54533;
                    while (true) {
                        i39 ^= 54550;
                        switch (i39) {
                            case 19:
                                i39 = 54564;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                i13 = iM68610;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i38 = 54471;
        }
        int i40 = 54657;
        while (true) {
            i40 ^= 54674;
            switch (i40) {
                case 19:
                    i40 = i12 == 0 ? 55401 : 54719;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    iM2912 = 0;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 3579:
                    iM2912 = C0152.m2912(l0Var, C0046.m886());
                    int i41 = 55432;
                    while (true) {
                        i41 ^= 55449;
                        switch (i41) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i41 = 55463;
                                continue;
                            case 62:
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
        int i42 = ((((((((iM1191 - 4) - i10) + 4) + 13) - i12) - 13) - 3) - iM2912) + 3;
        int iM1927 = C0090.m1927(j10);
        int i43 = 55556;
        while (true) {
            i43 ^= 55573;
            switch (i43) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i43 = i42 < iM1927 ? 55649 : 55618;
                    break;
                case 54:
                    break;
                case 87:
                    iM1927 = i42;
                    break;
                case 116:
                    int i44 = 55680;
                    while (true) {
                        i44 ^= 55697;
                        switch (i44) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i44 = 56362;
                                continue;
                            case 1467:
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
        int i45 = 0;
        while (true) {
            int i46 = i45;
            int i47 = 56455;
            while (true) {
                i47 ^= 56472;
                switch (i47) {
                    case 31:
                        i47 = i46 < iM173 ? 56548 : 56517;
                        break;
                    case 62:
                        break;
                    case 93:
                        throw new NoSuchElementException(C0242.m4654(m6419(), 44, C0154.f179 ^ (-17), 2931));
                    case 124:
                        break;
                    default:
                        break;
                }
            }
            r1.i0 i0Var3 = (r1.i0) C0315.m6101(list, i46);
            boolean zM43911 = C0228.m4399(C0368.m7238(i0Var3), C0392.m7676(m6419(), 19, C0439.f710 ^ 960, 1296));
            int i48 = 56579;
            while (true) {
                i48 ^= 56596;
                switch (i48) {
                    case 23:
                        i48 = zM43911 ? 1507472 : 56641;
                        break;
                    case 54:
                        break;
                    case 85:
                        break;
                    case 1564036:
                        r1.x0 x0VarM8846 = C0453.m8844(i0Var3, C0186.m3547(j10, 0, iM1927, 0, 0, 9));
                        r1.o oVarM2983 = C0156.m2983();
                        int iM3920 = C0205.m3920(x0VarM8846, oVarM2983);
                        String strM836 = C0043.m836(m6419(), 23, C0132.f158 ^ (-196), 431);
                        int i49 = 1507503;
                        while (true) {
                            i49 ^= 1507520;
                            switch (i49) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    throw new IllegalArgumentException(C0201.m3852(strM836));
                                case 111:
                                    if (iM3920 != Integer.MIN_VALUE) {
                                        i49 = 1507596;
                                    }
                                    break;
                                case 460:
                                    int iM3921 = C0205.m3920(x0VarM8846, C0245.m4701());
                                    int i50 = 1507627;
                                    while (true) {
                                        i50 ^= 1507644;
                                        switch (i50) {
                                            case 23:
                                                if (iM3921 != Integer.MIN_VALUE) {
                                                    i50 = 1507720;
                                                }
                                                break;
                                            case 85:
                                                throw new IllegalArgumentException(C0201.m3852(strM836));
                                            case 118:
                                                break;
                                            case 180:
                                                int i51 = 1507751;
                                                while (true) {
                                                    i51 ^= 1507768;
                                                    switch (i51) {
                                                        case 31:
                                                            i51 = iM3920 == iM3921 ? 1508495 : 1508464;
                                                            break;
                                                        case 1335:
                                                            z10 = true;
                                                            int i52 = 1508526;
                                                            while (true) {
                                                                i52 ^= 1508543;
                                                                switch (i52) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i52 = 1508557;
                                                                        continue;
                                                                    case 114:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 1480:
                                                            z10 = false;
                                                            break;
                                                        case 1513:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i53 = ((iM1191 + 11) - i12) - 11;
                                                int i54 = 1508650;
                                                while (true) {
                                                    i54 ^= 1508667;
                                                    switch (i54) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            if (z10) {
                                                                i54 = 1509394;
                                                            }
                                                            break;
                                                        case 83:
                                                            iM2913 = ((C0152.m2912(l0Var, C0008.m163()) + 9) - iM3920) - 9;
                                                            int iM1119 = C0059.m1119(C0152.m2912(l0Var, C0059.m1118()), iM2913 - (0 - C0350.m6867(x0VarM8846)));
                                                            int i55 = 1510572;
                                                            while (true) {
                                                                i55 ^= 1510589;
                                                                switch (i55) {
                                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                        i55 = x0Var != null ? 1511316 : 1510634;
                                                                        break;
                                                                    case 87:
                                                                        iM6867 = 0;
                                                                        break;
                                                                    case 118:
                                                                        break;
                                                                    case 809:
                                                                        iM6867 = (((iM1119 - 11) - C0350.m6867(x0Var)) + 11) / (C0224.f304 ^ 848);
                                                                        int i56 = 1511347;
                                                                        while (true) {
                                                                            i56 ^= 1511364;
                                                                            switch (i56) {
                                                                                case 22:
                                                                                    break;
                                                                                case 119:
                                                                                    i56 = 1511378;
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
                                                            i14 = iM1119;
                                                            i15 = iM6867;
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 3369:
                                                            int iM11110 = C0059.m1119(C0152.m2912(l0Var, C0150.m2873()), C0059.m1119(i11, i13));
                                                            iM2913 = (((iM11110 + 31) - C0350.m6867(x0VarM8846)) - 31) / (C0200.f224 ^ 308);
                                                            int i57 = 1509425;
                                                            while (true) {
                                                                i57 ^= 1509442;
                                                                switch (i57) {
                                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                        break;
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                        i16 = 0;
                                                                        break;
                                                                    case 115:
                                                                        i57 = x0Var != null ? 1509518 : 1509487;
                                                                        break;
                                                                    case 204:
                                                                        int iM3922 = C0205.m3920(x0Var, oVarM2983);
                                                                        int i58 = 1509549;
                                                                        while (true) {
                                                                            i58 ^= 1509566;
                                                                            switch (i58) {
                                                                                case 19:
                                                                                    i58 = iM3922 != Integer.MIN_VALUE ? 1509642 : 1509611;
                                                                                    break;
                                                                                case 85:
                                                                                    i16 = 0;
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                case 436:
                                                                                    i16 = (((((iM3920 - 27) + iM2913) + 27) - 21) - iM3922) + 21;
                                                                                    int i59 = 1509673;
                                                                                    while (true) {
                                                                                        i59 ^= 1509690;
                                                                                        switch (i59) {
                                                                                            case 19:
                                                                                                i59 = 1510355;
                                                                                                continue;
                                                                                            case 745:
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
                                                            int i60 = 1510448;
                                                            while (true) {
                                                                i60 ^= 1510465;
                                                                switch (i60) {
                                                                    case Code.UNAVAILABLE /* 14 */:
                                                                        i14 = iM11110;
                                                                        i15 = i16;
                                                                        break;
                                                                    case 113:
                                                                        i60 = 1510479;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i54 = 1508712;
                                                }
                                                int i61 = 1511471;
                                                while (true) {
                                                    i61 ^= 1511488;
                                                    switch (i61) {
                                                        case Code.UNAVAILABLE /* 14 */:
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                            iM6868 = 0;
                                                            break;
                                                        case 111:
                                                            if (x0VarM8844 != null) {
                                                                i61 = 1511564;
                                                            }
                                                            break;
                                                        case 204:
                                                            iM6868 = (((i14 - 2) - C0350.m6867(x0VarM8844)) + 2) / (C0066.f86 ^ (-220));
                                                            int i62 = 1511595;
                                                            while (true) {
                                                                i62 ^= 1511612;
                                                                switch (i62) {
                                                                    case 23:
                                                                        i62 = 1512277;
                                                                        break;
                                                                    case 1001:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i61 = 1511533;
                                                }
                                                return C0410.m8048(l0Var, iM1191, i14, C0127.m2452(), new c3(x0VarM8846, iM2913, x0VarM8844, i53, iM6868, x0Var, ((i53 + 15) - i10) - 15, i15));
                                            default:
                                                continue;
                                        }
                                        i50 = 1507689;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i49 = 1507565;
                        }
                        break;
                    default:
                        break;
                }
            }
            i45 = (C0205.f229 ^ 428) + i46;
            int i63 = 1512370;
            while (true) {
                i63 ^= 1512387;
                switch (i63) {
                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        break;
                    case 113:
                        i63 = 1512401;
                        break;
                }
            }
        }
    }
}
