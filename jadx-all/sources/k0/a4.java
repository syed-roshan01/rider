package k0;

import a7.C0008;
import a8.C0009;
import androidx.compose.ui.layout.C0035;
import androidx.lifecycle.C0043;
import c0.C0057;
import c1.C0059;
import ca.C0070;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.C0205;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0215;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.migration.C0233;
import dagger.hilt.internal.aggregatedroot.codegen.C0246;
import e9.C0267;
import h.C0297;
import h3.C0304;
import i.C0316;
import j9.C0330;
import java.util.List;
import java.util.NoSuchElementException;
import m1.C0351;
import o2.C0369;
import o4.C0370;
import r6.C0402;
import s0.C0411;
import v0.C0444;
import v6.C0448;
import w.C0454;
import x7.C0472;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class a4 implements r1.j0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f481short = {2028, 1984, 1987, 1987, 1994, 1996, 2011, 1990, 1984, 1985, 1935, 1996, 1984, 1985, 2011, 1998, 1990, 1985, 2012, 1935, 1985, 1984, 1935, 1994, 1987, 1994, 1986, 1994, 1985, 2011, 1935, 1986, 1998, 2011, 1996, 1991, 1990, 1985, 1992, 1935, 2011, 1991, 1994, 1935, 2015, 2013, 1994, 1995, 1990, 1996, 1998, 2011, 1994, 1921, 1032, 1049, 1028, 1032, 2945, 2955, 2951, 2950};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8720c;

    public /* synthetic */ a4(int i10, Object obj, Object obj2) {
        this.f8718a = i10;
        this.f8719b = obj;
        this.f8720c = obj2;
        int iM4096 = C0215.m4096();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4096 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0304.m5860("kskxiAFxiZ4FmFHPd4fc0Yum")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6412() {
        int iM8732 = C0448.m8732();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8732 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f481short;
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
        r1.x0 x0VarM8844;
        r1.x0 x0VarM8845;
        int iM1647;
        int iM1648;
        float fM3482;
        int iM6867;
        int iM6868;
        Integer numM1083;
        Integer numM1084;
        r8.s sVarM2452 = C0127.m2452();
        int iM681 = C0035.m681(this);
        Object objM5091 = C0267.m5091(this);
        Object objM5710 = C0297.m5710(this);
        switch (iM681) {
            case 0:
                c9.e eVar = (c9.e) objM5710;
                String strM4477 = C0233.m4477(m6412(), 0, C0043.f63 ^ 864, 1967);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = eVar != null ? 1709 : 1678;
                            break;
                        case 204:
                            int iM171 = C0008.m171(list);
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                int i13 = 1740;
                                while (true) {
                                    i13 ^= 1757;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = i12 < iM171 ? 1833 : 1802;
                                            break;
                                        case 54:
                                            break;
                                        case 471:
                                            throw new NoSuchElementException(strM4477);
                                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                r1.i0 i0Var = (r1.i0) C0316.m6101(list, i12);
                                boolean zM4399 = C0229.m4399(C0369.m7238(i0Var), C0059.m1123(m6412(), 54, C0490.f763 ^ (-535), 1148));
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = zM4399 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            i11 = (C0009.f29 ^ (-438)) + i12;
                                            int i15 = 48891;
                                            while (true) {
                                                i15 ^= 48908;
                                                switch (i15) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i15 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            x0VarM8844 = C0454.m8844(i0Var, C0186.m3547(j10, 0, 0, 0, 0, C0444.f714 ^ (-801)));
                                            int i16 = 48767;
                                            while (true) {
                                                i16 ^= 48784;
                                                switch (i16) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i16 = 48798;
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
                            }
                            break;
                        case 239:
                            x0VarM8844 = null;
                            break;
                        default:
                            break;
                    }
                }
                c9.e eVar2 = (c9.e) objM5091;
                int i17 = 49666;
                while (true) {
                    i17 ^= 49683;
                    switch (i17) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i17 = eVar2 != null ? 49759 : 49728;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 76:
                            int iM172 = C0008.m171(list);
                            int i18 = 0;
                            while (true) {
                                int i19 = i18;
                                int i20 = 49790;
                                while (true) {
                                    i20 ^= 49807;
                                    switch (i20) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            throw new NoSuchElementException(strM4477);
                                        case 84:
                                            break;
                                        case 241:
                                            i20 = i19 < iM172 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                r1.i0 i0Var2 = (r1.i0) C0316.m6101(list, i19);
                                boolean zM43910 = C0229.m4399(C0369.m7238(i0Var2), C0070.m1360(m6412(), 58, C0472.f742 ^ 120, 3048));
                                int i21 = 49914;
                                while (true) {
                                    i21 ^= 49931;
                                    switch (i21) {
                                        case 497:
                                            i21 = zM43910 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            i18 = (C0205.f229 ^ 428) + i19;
                                            int i22 = 50813;
                                            while (true) {
                                                i22 ^= 50830;
                                                switch (i22) {
                                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                        break;
                                                    case 243:
                                                        i22 = 50844;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1769:
                                            x0VarM8845 = C0454.m8844(i0Var2, j10);
                                            int i23 = 50689;
                                            while (true) {
                                                i23 ^= 50706;
                                                switch (i23) {
                                                    case 19:
                                                        i23 = 50720;
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
                            }
                            break;
                        case 83:
                            x0VarM8845 = null;
                            break;
                        default:
                            break;
                    }
                }
                int i24 = 51588;
                while (true) {
                    i24 ^= 51605;
                    switch (i24) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i24 = x0VarM8844 != null ? 51681 : 51650;
                            break;
                        case 54:
                            break;
                        case 87:
                            iM1647 = 0;
                            break;
                        case 116:
                            iM1647 = C0076.m1647(x0VarM8844);
                            int i25 = 51712;
                            while (true) {
                                i25 ^= 51729;
                                switch (i25) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 15:
                                    case Code.UNAUTHENTICATED /* 16 */:
                                    default:
                                        continue;
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i25 = 51743;
                                        continue;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
                int i26 = 51836;
                while (true) {
                    i26 ^= 51853;
                    switch (i26) {
                        case 241:
                            i26 = x0VarM8845 != null ? 52580 : 52549;
                            break;
                        case 1963:
                            break;
                        case 1992:
                            iM1648 = 0;
                            break;
                        case 2025:
                            iM1648 = C0076.m1647(x0VarM8845);
                            int i27 = 52611;
                            while (true) {
                                i27 ^= 52628;
                                switch (i27) {
                                    case 23:
                                        i27 = 52642;
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
                int iM1119 = C0059.m1119(iM1647, iM1648);
                int i28 = 52735;
                while (true) {
                    i28 ^= 52752;
                    switch (i28) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            fM3482 = C0182.m3482();
                            break;
                        case 1007:
                            i28 = x0VarM8844 != null ? 53479 : 52797;
                            break;
                        case 7927:
                            int i29 = 53510;
                            while (true) {
                                i29 ^= 53527;
                                switch (i29) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i29 = x0VarM8845 != null ? 53603 : 53572;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    case 83:
                                        fM3482 = C0182.m3482();
                                        break;
                                    case 116:
                                        fM3482 = C0370.m7248();
                                        int i30 = 53634;
                                        while (true) {
                                            i30 ^= 53651;
                                            switch (i30) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i30 = 53665;
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
                int iM2912 = C0152.m2912(l0Var, fM3482);
                int i31 = 53758;
                while (true) {
                    i31 ^= 53775;
                    switch (i31) {
                        case 1009:
                            i31 = x0VarM8845 != null ? 54502 : 54471;
                            break;
                        case 1703:
                            break;
                        case 1736:
                            iM6867 = 0;
                            break;
                        case 1769:
                            iM6867 = C0351.m6867(x0VarM8845);
                            int i32 = 54533;
                            while (true) {
                                i32 ^= 54550;
                                switch (i32) {
                                    case 19:
                                        i32 = 54564;
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
                int i33 = 54657;
                while (true) {
                    i33 ^= 54674;
                    switch (i33) {
                        case 19:
                            i33 = x0VarM8844 != null ? 55401 : 54719;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            iM6868 = 0;
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            break;
                        case 3579:
                            iM6868 = C0351.m6867(x0VarM8844);
                            break;
                        default:
                            break;
                    }
                }
                int iM11110 = C0059.m1119(iM2912, (iM6867 - (0 - iM6868)) - (0 - C0330.m6356(l0Var, C0081.m1745())));
                int i34 = 55432;
                while (true) {
                    i34 ^= 55449;
                    switch (i34) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i34 = x0VarM8844 != null ? 55525 : 55494;
                            break;
                        case 62:
                            break;
                        case 95:
                            numM1083 = null;
                            break;
                        case 124:
                            numM1083 = C0057.m1083(C0205.m3920(x0VarM8844, C0156.m2983()));
                            int i35 = 55556;
                            while (true) {
                                i35 ^= 55573;
                                switch (i35) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i35 = 55587;
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
                int i36 = 55680;
                while (true) {
                    i36 ^= 55697;
                    switch (i36) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i36 = x0VarM8844 != null ? 56424 : 56393;
                            break;
                        case 1467:
                            break;
                        case 1496:
                            numM1084 = null;
                            break;
                        case 1529:
                            numM1084 = C0057.m1083(C0205.m3920(x0VarM8844, C0246.m4701()));
                            int i37 = 56455;
                            while (true) {
                                i37 ^= 56472;
                                switch (i37) {
                                    case 31:
                                        i37 = 56486;
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
                return C0411.m8048(l0Var, iM1119, iM11110, sVarM2452, new z3(x0VarM8844, x0VarM8845, l0Var, iM1119, iM11110, numM1083, numM1084));
            default:
                C0160.m3054((o2.r) objM5710, (m2.l) objM5091);
                return C0411.m8048(l0Var, 0, 0, sVarM2452, C0402.m7864());
        }
    }
}
