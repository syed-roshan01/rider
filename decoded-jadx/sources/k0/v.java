package k0;

import a7.C0008;
import b7.C0053;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.C0127;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e1.C0257;
import g.C0283;
import ga.C0295;
import h7.C0312;
import i.C0315;
import i6.C0319;
import j3.C0325;
import j4.C0326;
import j9.C0329;
import java.util.List;
import java.util.NoSuchElementException;
import l6.C0344;
import m5.C0354;
import m9.C0359;
import o1.C0367;
import o2.C0368;
import o4.C0369;
import r2.C0397;
import s0.C0410;
import w.C0453;
import x0.C0466;
import z.C0481;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class v implements r1.j0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f508short = {2245, 2281, 2282, 2282, 2275, 2277, 2290, 2287, 2281, 2280, 2214, 2277, 2281, 2280, 2290, 2279, 2287, 2280, 2293, 2214, 2280, 2281, 2214, 2275, 2282, 2275, 2283, 2275, 2280, 2290, 2214, 2283, 2279, 2290, 2277, 2286, 2287, 2280, 2273, 2214, 2290, 2286, 2275, 2214, 2294, 2292, 2275, 2274, 2287, 2277, 2279, 2290, 2275, 2216, 2741, 2746, 2733, 2738, 2748, 2746, 2735, 2738, 2740, 2741, 2706, 2744, 2740, 2741, 2401, 2403, 2420, 2409, 2415, 2414, 2377, 2403, 2415, 2414, 2419, 2772, 2761, 2772, 2764, 2757};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.g f9540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.i f9541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9542d;

    public v(float f10, y.g gVar, y.i iVar, int i10) {
        this.f9539a = f10;
        this.f9540b = gVar;
        this.f9541c = iVar;
        this.f9542d = i10;
        int iM6181 = C0319.m6181();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6181 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0354.m6958("VhGniMdLcZ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6438() {
        int iM1902 = C0089.m1902();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1902 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f508short;
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
        int iM3212;
        int iM3920;
        int iM4912;
        int iM171 = C0008.m171(list);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            String strM7239 = C0369.m7239(m6438(), 0, C0326.f474 ^ (-802), 2182);
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i11 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        throw new NoSuchElementException(strM7239);
                    default:
                        break;
                }
            }
            r1.i0 i0Var = (r1.i0) C0315.m6101(list, i11);
            boolean zM4399 = C0228.m4399(C0368.m7238(i0Var), C0359.m7056(m6438(), 54, C0283.f428 ^ (-404), 2779));
            int i13 = 1740;
            while (true) {
                i13 ^= 1757;
                switch (i13) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i13 = zM4399 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        r1.x0 x0VarM8844 = C0453.m8844(i0Var, C0186.m3547(j10, 0, 0, 0, 0, C0486.f760 ^ 234));
                        int iM172 = C0008.m171(list);
                        int i14 = 0;
                        while (true) {
                            int i15 = i14;
                            int i16 = 1864;
                            while (true) {
                                i16 ^= 1881;
                                switch (i16) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i16 = i15 < iM172 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        throw new NoSuchElementException(strM7239);
                                    case 47417:
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            r1.i0 i0Var2 = (r1.i0) C0315.m6101(list, i15);
                            boolean zM43910 = C0228.m4399(C0368.m7238(i0Var2), C0367.m7203(m6438(), 68, C0481.f755 ^ (-548), 2304));
                            int i17 = 48767;
                            while (true) {
                                i17 ^= 48784;
                                switch (i17) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 76:
                                        r1.x0 x0VarM8845 = C0453.m8844(i0Var2, C0186.m3547(j10, 0, 0, 0, 0, C0053.f73 ^ (-156)));
                                        int iM3213 = C0168.m3212(j10);
                                        int i18 = 48891;
                                        while (true) {
                                            i18 ^= 48908;
                                            switch (i18) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    iM3212 = (((((C0168.m3212(j10) - 9) - C0076.m1647(x0VarM8844)) + 9) + 17) - C0076.m1647(x0VarM8845)) - 17;
                                                    int i19 = 49790;
                                                    while (true) {
                                                        i19 ^= 49807;
                                                        switch (i19) {
                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                break;
                                                            case 51:
                                                                break;
                                                            case 84:
                                                                iM3212 = 0;
                                                                int i20 = 49914;
                                                                while (true) {
                                                                    i20 ^= 49931;
                                                                    switch (i20) {
                                                                        case 497:
                                                                            i20 = 50596;
                                                                            continue;
                                                                        case 1711:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 241:
                                                                i19 = iM3212 < 0 ? 49883 : 49852;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 503:
                                                    i18 = iM3213 == Integer.MAX_VALUE ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    iM3212 = C0168.m3212(j10);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        int i21 = 49666;
                                        while (true) {
                                            i21 ^= 49683;
                                            switch (i21) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i21 = 49697;
                                                    break;
                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    int iM173 = C0008.m171(list);
                                                    int i22 = 0;
                                                    while (true) {
                                                        int i23 = i22;
                                                        int i24 = 50689;
                                                        while (true) {
                                                            i24 ^= 50706;
                                                            switch (i24) {
                                                                case 19:
                                                                    i24 = i23 < iM173 ? 50782 : 50751;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                    throw new NoSuchElementException(strM7239);
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        r1.i0 i0Var3 = (r1.i0) C0315.m6101(list, i23);
                                                        boolean zM43911 = C0228.m4399(C0368.m7238(i0Var3), C0325.m6296(m6438(), 79, C0329.f477 ^ 834, 2720));
                                                        int i25 = 50813;
                                                        while (true) {
                                                            i25 ^= 50830;
                                                            switch (i25) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 243:
                                                                    i25 = zM43911 ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    r1.x0 x0VarM8846 = C0453.m8844(i0Var3, C0186.m3547(j10, 0, iM3212, 0, 0, C0087.f121 ^ 592));
                                                                    r1.o oVarM4701 = C0245.m4701();
                                                                    int iM3921 = C0205.m3920(x0VarM8846, oVarM4701);
                                                                    int i26 = 51588;
                                                                    while (true) {
                                                                        i26 ^= 51605;
                                                                        switch (i26) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i26 = iM3921 != Integer.MIN_VALUE ? 51681 : 51650;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                iM3920 = 0;
                                                                                break;
                                                                            case 116:
                                                                                iM3920 = C0205.m3920(x0VarM8846, oVarM4701);
                                                                                int i27 = 51712;
                                                                                while (true) {
                                                                                    i27 ^= 51729;
                                                                                    switch (i27) {
                                                                                        case Code.UNAVAILABLE /* 14 */:
                                                                                            break;
                                                                                        case 15:
                                                                                        case Code.UNAUTHENTICATED /* 16 */:
                                                                                        default:
                                                                                            continue;
                                                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                            i27 = 51743;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    float fM5684 = C0295.m5684(this);
                                                                    boolean zM6045 = C0312.m6045(fM5684);
                                                                    int i28 = 51836;
                                                                    while (true) {
                                                                        i28 ^= 51853;
                                                                        switch (i28) {
                                                                            case 241:
                                                                                if (zM6045) {
                                                                                    i28 = 52580;
                                                                                }
                                                                                break;
                                                                            case 1963:
                                                                                break;
                                                                            case 1992:
                                                                                iM4912 = C0257.m4912(fM5684);
                                                                                break;
                                                                            case 2025:
                                                                                int i29 = 52611;
                                                                                while (true) {
                                                                                    i29 ^= 52628;
                                                                                    switch (i29) {
                                                                                        case 23:
                                                                                            i29 = 52642;
                                                                                            break;
                                                                                        case 54:
                                                                                            iM4912 = 0;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i28 = 52549;
                                                                    }
                                                                    return C0410.m8048(l0Var, C0168.m3212(j10), iM4912, C0127.m2452(), new u(x0VarM8844, iM4912, x0VarM8846, C0466.m9079(this), j10, x0VarM8845, l0Var, C0116.m2233(this), C0172.m3295(this), iM3920));
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        i22 = (C0153.f178 ^ (-173)) + i23;
                                                        int i30 = 52735;
                                                        while (true) {
                                                            i30 ^= 52752;
                                                            switch (i30) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case 1007:
                                                                    i30 = 52766;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i17 = zM43910 ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            i14 = (C0344.f615 ^ 713) + i15;
                            int i31 = 53510;
                            while (true) {
                                i31 ^= 53527;
                                switch (i31) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i31 = 53541;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            i10 = (C0397.f668 ^ 729) + i11;
            int i32 = 53634;
            while (true) {
                i32 ^= 53651;
                switch (i32) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i32 = 53665;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        break;
                }
            }
        }
    }
}
